package com.topmoviesbyyear.topmoviesApp.service;

import com.topmoviesbyyear.topmoviesApp.entity.Movie;

import java.util.List;

public interface TopMoviesService {

    public List<Movie> findTopMoviesByYear(int year);
    public List<Movie> findAllMovies();

}
