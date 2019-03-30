package com.topmoviesbyyear.topmoviesApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="top_movies_by_year")
public class Movie {


    @Column(name = "release_year")
    @NotBlank(message = "Please enter the movie released year")
    private Integer year;

    @Id
    @Column(name = "IMDB_ID", updatable = false, unique = true)
    @NotBlank(message = "ImdbId is required")
    private String imdbId;

    @Column(name = "movie_name")
    @NotBlank(message = "Movie name is required")
    private String movieName;

    @Column(name = "movie_url")
    private String movieUrl;

    @Column(name = "genre")
    private String genre;


    public Movie() {
    }

    public Movie(@NotBlank(message = "Please enter the movie released year") Integer year, @NotBlank(message = "ImdbId is required") String imdbId, @NotBlank(message = "Movie name is required") String movieName, String movieUrl, String genre) {
        this.year = year;
        this.imdbId = imdbId;
        this.movieName = movieName;
        this.movieUrl = movieUrl;
        this.genre = genre;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getMovieUrl() {
        return movieUrl;
    }

    public void setMovieUrl(String movieUrl) {
        this.movieUrl = movieUrl;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
