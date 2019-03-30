package com.topmoviesbyyear.topmoviesApp.controller;


import com.topmoviesbyyear.topmoviesApp.entity.Movie;
import com.topmoviesbyyear.topmoviesApp.service.TopMoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/topmovies")
@CrossOrigin
public class TopMoviesRestController {

    private TopMoviesService topMoviesService ;

    //Using constructor injection as it is best practice
    @Autowired
    public TopMoviesRestController(TopMoviesService thetopMoviesService){
        topMoviesService = thetopMoviesService;
    }


    //get all movies by year
    @GetMapping("/{year}")
    public ResponseEntity<?> getTopMoviesByYear(@PathVariable("year") int year) {
        return new ResponseEntity<List<Movie>> (topMoviesService.findTopMoviesByYear(year), HttpStatus.OK);
    }

    //get all movie
    @GetMapping("/all")
    public ResponseEntity<?> getAllMovies() {
        return new ResponseEntity<List<Movie>> (topMoviesService.findAllMovies(), HttpStatus.OK);
    }

}