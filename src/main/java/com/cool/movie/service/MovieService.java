package com.cool.movie.service;


import com.cool.movie.entity.Movie;

import java.util.List;
import java.util.Optional;


public interface MovieService {

    /**
     * findById
     *
     * @param
     */
    Optional<Movie> findById(String id);

    /**
     * findByParam
     *
     * @param movie
     */
    List<Movie> findByParam(Movie movie);

    /**
     * save one
     *
     * @param movie
     */
    Movie save(Movie movie);

    /**
     * save
     *
     * @param movies
     */
    List<Movie> save(List<Movie> movies);

    /**
     * deleteById
     *
     * @param
     */
    void deleteById(String id);

    /**
     * deleteByIds
     *
     * @param ids
     */
    void deleteByIds(List<String> ids);


    /**
     * existsById
     *
     * @param id
     */
    boolean existsById(String id);

    /**
     * findAll
     */
    Iterable<Movie> findAll();

    /**
     * count
     */
    long count();
}

