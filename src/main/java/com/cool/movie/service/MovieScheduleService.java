package com.cool.movie.service;


import com.cool.movie.entity.MovieSchedule;

import java.util.List;
import java.util.Optional;


public interface MovieScheduleService {

    /**
     * findById
     *
     * @param
     */
    Optional<MovieSchedule> findById(String id);

    /**
     * findByParam
     *
     * @param movieSchedule
     */
    List<MovieSchedule> findByParam(MovieSchedule movieSchedule);

    /**
     * save one
     *
     * @param movieSchedule
     */
    MovieSchedule save(MovieSchedule movieSchedule);

    /**
     * save
     *
     * @param movieSchedules
     */
    List<MovieSchedule> save(List<MovieSchedule> movieSchedules);

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
    Iterable<MovieSchedule> findAll();

    /**
     * count
     */
    long count();
}

