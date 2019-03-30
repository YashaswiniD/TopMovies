package com.topmoviesbyyear.topmoviesApp.service;

import com.topmoviesbyyear.topmoviesApp.entity.Movie;
import com.topmoviesbyyear.topmoviesApp.exceptions.MovieReleaseYearException;
import com.topmoviesbyyear.topmoviesApp.repository.TopMoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class TopMoviesServiceImpl implements TopMoviesService {


    private TopMoviesRepository topMoviesRepository;

    @Autowired
    public TopMoviesServiceImpl(TopMoviesRepository theTopMoviesRepository){
        topMoviesRepository = theTopMoviesRepository;
    }

    @Override
    @Transactional
    public List<Movie> findTopMoviesByYear(int year) {

        List<Movie> movies = topMoviesRepository.findAllByYear(year);

        if(movies.isEmpty()){
            throw new MovieReleaseYearException("No movies found with the year '"+year+"'.");
        }
        else
            return movies;

    }

    @Override
    public List<Movie> findAllMovies() {
        List<Movie> movies = topMoviesRepository.findAll();

        if(movies.isEmpty()){
            throw new MovieReleaseYearException("No movies found.");
        }
        else
            return movies;
    }

}
