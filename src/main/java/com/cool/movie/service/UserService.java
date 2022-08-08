package com.cool.movie.service;


import com.cool.movie.entity.User;

import java.util.List;
import java.util.Optional;


public interface UserService {

    /**
     * findById
     *
     * @param
     */
    Optional<User> findById(String id);

    /**
     * findByParam
     *
     * @param user
     */
    List<User> findByParam(User user);

    /**
     * save one
     *
     * @param user
     */
    User save(User user);

    /**
     * save
     *
     * @param users
     */
    List<User> save(List<User> users);

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
    Iterable<User> findAll();

    /**
     * count
     */
    long count();
}

