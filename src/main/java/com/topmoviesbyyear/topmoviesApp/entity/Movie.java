package com.topmoviesbyyear.topmoviesApp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

@Entity
@Table(name="top_movies_by_year")
public class Movie {


    @Column(name = "year")
    @NotBlank(message = "Please enter the movie released year")
    private Integer year;

    @Id
    @Column(name = "imdb_id", updatable = false, unique = true)
    @NotBlank(message = "ImdbId is required")
    private String imdbId;

    @Column(name = "movie_name")
    @NotBlank(message = "Movie name is required")
    private String movieName;

    @Column(name = "poster_url")
    private String poster_url;

    @Column(name = "genre")
    private String genre;

    @Column(name = "imdb_rating")
    private String imdb_rating;

    @Column(name = "rotten_tomatoes_rating")
    private String rotten_tomatoes_rating;



    public Movie() {
    }

    public Movie(@NotBlank(message = "Please enter the movie released year") Integer year, @NotBlank(message = "ImdbId is required") String imdbId, @NotBlank(message = "Movie name is required") String movieName, String poster_url, String genre, String imdb_rating, String rotten_tomatoes_rating) {
        this.year = year;
        this.imdbId = imdbId;
        this.movieName = movieName;
        this.poster_url = poster_url;
        this.genre = genre;
        this.imdb_rating = imdb_rating;
        this.rotten_tomatoes_rating = rotten_tomatoes_rating;
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

    public String getPoster_url() {
        return poster_url;
    }

    public void setPoster_url(String poster_url) {
        this.poster_url = poster_url;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getImdb_rating() {
        return imdb_rating;
    }

    public void setImdb_rating(String imdb_rating) {
        this.imdb_rating = imdb_rating;
    }

    public String getRotten_tomatoes_rating() {
        return rotten_tomatoes_rating;
    }

    public void setRotten_tomatoes_rating(String rotten_tomatoes_rating) {
        this.rotten_tomatoes_rating = rotten_tomatoes_rating;
    }
}
