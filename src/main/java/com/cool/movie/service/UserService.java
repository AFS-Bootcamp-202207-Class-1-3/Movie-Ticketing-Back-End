package com.cool.movie.service;


import com.cool.movie.dto.login.LoginRequest;
import com.cool.movie.dto.customerdto.CustomerPage;
import com.cool.movie.entity.Customer;

import java.util.List;


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

    Customer findByRealName(String realName);

    /**
     * findAll
     */
    Iterable<Customer> findAll();

    /**
     * count
     */
    long count();

    Boolean login(LoginRequest request);

    CustomerPage findSingleByPage(Integer pageSize, Integer pageNumber, String userId, String movieScheduleId);
}

