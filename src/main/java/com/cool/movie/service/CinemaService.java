package com.cool.movie.service;


import com.cool.movie.entity.Cinema;

import java.util.List;
import java.util.Optional;

public interface CinemaService {

    /**
     * findById
     *
     * @param
     */
    Optional<Cinema> findById(String id);

    /**
     * findByParam
     *
     * @param cinema
     */
    List<Cinema> findByParam(Cinema cinema);

    /**
     * save one
     *
     * @param cinema
     */
    Cinema save(Cinema cinema);

    /**
     * save
     *
     * @param cinemas
     */
    List<Cinema> save(List<Cinema> cinemas);

    /**
     * deleteById
     *
     * @param
     */
    void deleteById(String Id);

    /**
     * deleteByIds
     *
     * @param ids
     */
    void deleteByIds(List<String> ids);


    /**
     * existsById
     *
     * @param Id
     */
    boolean existsById(String Id);

    /**
     * findAll
     */
    List<Cinema> findAll();

    /**
     * count
     */
    long count();
}

