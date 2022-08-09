package com.cool.movie.service;


import com.cool.movie.dto.OrderDetailResponse;
import com.cool.movie.dto.OrderRequest;
import com.cool.movie.entity.CustomerOrder;

import java.io.Serializable;
import java.util.List;

public interface OrderService {


    OrderDetailResponse getOrderDetailResponse(Serializable id);
    /**
     * findById
     *
     * @param
     */
    CustomerOrder findById(String id);

    /**
     * findByParam`
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
     * save one
     *
     * @param customerOrder
     */
    CustomerOrder save(CustomerOrder customerOrder);

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

    CustomerOrder getSameViewingTime(OrderRequest orderRequest);
}

