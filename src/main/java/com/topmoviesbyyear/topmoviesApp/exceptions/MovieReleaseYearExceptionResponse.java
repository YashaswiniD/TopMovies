package com.topmoviesbyyear.topmoviesApp.exceptions;



public class MovieReleaseYearExceptionResponse {

    private String movieReleaseYear;

    public MovieReleaseYearExceptionResponse(String movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }

    public String getMovieReleaseYear() {
        return movieReleaseYear;
    }

    public void setMovieReleaseYear(String movieReleaseYear) {
        this.movieReleaseYear = movieReleaseYear;
    }
}