package com.cool.movie.service;


import com.cool.movie.entity.MovieType;

import java.util.List;
import java.util.Optional;

public interface MovieTypeService {

    /**
     * findById
     *
     * @param
     */
    Optional<MovieType> findById(String id);

    /**
     * findByParam
     *
     * @param movieType
     */
    List<MovieType> findByParam(MovieType movieType);

    /**
     * save one
     *
     * @param movieType
     */
    MovieType save(MovieType movieType);

    /**
     * save
     *
     * @param movieTypes
     */
    List<MovieType> save(List<MovieType> movieTypes);

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
    Iterable<MovieType> findAll();

    /**
     * count
     */
    long count();
}

