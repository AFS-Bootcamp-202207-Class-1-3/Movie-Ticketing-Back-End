package com.cool.movie.service;


import com.cool.movie.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    /**
     * findById
     *
     * @param
     */
    Optional<Order> findById(String id);

    /**
     * findByParam
     *
     * @param order
     */
    List<Order> findByParam(Order order);

    /**
     * save one
     *
     * @param order
     */
    Order save(Order order);

    /**
     * save
     *
     * @param orders
     */
    List<Order> save(List<Order> orders);

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
    Iterable<Order> findAll();

    /**
     * count
     */
    long count();
}

