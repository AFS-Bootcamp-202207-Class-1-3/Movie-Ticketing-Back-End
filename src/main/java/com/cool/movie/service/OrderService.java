package com.cool.movie.service;


import com.cool.movie.dto.OrderRequest;
import com.cool.movie.entity.CustomerOrder;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    /**
     * findById
     *
     * @param
     */
    Optional<CustomerOrder> findById(String id);

    /**
     * findByParam
     *
     * @param customerOrder
     */
    List<CustomerOrder> findByParam(CustomerOrder customerOrder);

    /**
     * save one
     *
     * @param orderRequest
     */
    CustomerOrder save(OrderRequest orderRequest);

    /**
     * save
     *
     * @param customerOrders
     */
    List<CustomerOrder> save(List<CustomerOrder> customerOrders);

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
    Iterable<CustomerOrder> findAll();

    /**
     * count
     */
    long count();
}

