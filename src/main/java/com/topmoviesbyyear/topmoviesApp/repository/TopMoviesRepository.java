package com.topmoviesbyyear.topmoviesApp.repository;


import com.topmoviesbyyear.topmoviesApp.entity.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopMoviesRepository extends CrudRepository<Movie,String> {

    public List<Movie> findAllByYear(int year);
    public List<Movie> findAll();
}
