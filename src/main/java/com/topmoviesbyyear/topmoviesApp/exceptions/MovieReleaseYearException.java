package com.topmoviesbyyear.topmoviesApp.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class MovieReleaseYearException extends RuntimeException {

    public MovieReleaseYearException(String message) {
        super(message);
    }
}