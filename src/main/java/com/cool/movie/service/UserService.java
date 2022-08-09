package com.cool.movie.service;


import com.cool.movie.entity.Customer;

import java.util.List;
import java.util.Optional;


public interface UserService {

    /**
     * findById
     *
     * @param
     */
    Customer findById(String id);

    /**
     * findByParam
     *
     * @param customer
     */
    List<Customer> findByParam(Customer customer);

    /**
     * save one
     *
     * @param customer
     */
    Customer save(Customer customer);

    /**
     * save
     *
     * @param customers
     */
    List<Customer> save(List<Customer> customers);

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
    Iterable<Customer> findAll();

    /**
     * count
     */
    long count();
}

