package com.cool.movie.service;


import com.cool.movie.dto.moviedto.MoviePage;
import com.cool.movie.dto.moviedto.MovieResponse;
import com.cool.movie.entity.Movie;

import java.util.List;


public interface MovieService {

    /**
     * findById
     *
     * @param
     */
    MovieResponse findById(String id);

     MoviePage findByPage(Integer pageSize, Integer pageNumber);

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

