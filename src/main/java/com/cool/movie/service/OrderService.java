package com.cool.movie.service;


import com.cool.movie.dto.order.OrderDetailResponse;
import com.cool.movie.dto.order.OrderForPairRequest;
import com.cool.movie.dto.order.OrderRequest;
import com.cool.movie.dto.order.OrderPage;
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
    CustomerOrder save(OrderForPairRequest orderRequest);

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

    CustomerOrder getSameViewingTime(OrderForPairRequest orderRequest);

    OrderPage findOrderByPage(Integer pageSize, Integer pageNumber, String userId);

    CustomerOrder updateHasPay(String customerOrderId);
}

