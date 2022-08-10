package com.cool.movie.service.impl;


import com.cool.movie.dto.order.OrderDetailResponse;
import com.cool.movie.dto.order.OrderListResponse;
import com.cool.movie.dto.order.OrderRequest;
import com.cool.movie.entity.*;
import com.cool.movie.exception.NotFoundException;
import com.cool.movie.repository.OrderDetailViewRepository;
import com.cool.movie.repository.OrderRepository;
import com.cool.movie.service.OrderService;
import com.cool.movie.mapper.OrderDetailMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;
import java.util.Random;
import java.util.UUID;

/**
 * (Order)
 *
 * @author makejava
 * @since 2022-08-07 22:52:56
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {


    @Resource
    private OrderRepository orderRepository;



    @Resource
    private OrderDetailViewRepository orderDetailViewRepository;

    @Resource
    OrderDetailMapper orderDetailMapper;


    public OrderDetailResponse getOrderDetailResponse(Serializable id) {
        OrderDetail orderDetail = orderDetailViewRepository.findById(String.valueOf(id)).orElseThrow(() -> new NotFoundException(OrderDetail.class.getSimpleName()));
        return orderDetailMapper.toResponse(orderDetail);
    }

    /**
     * findById
     *
     * @param id
     */
    @Override
    public CustomerOrder findById(String id) {
        return orderRepository.findById(id).orElseThrow(() -> new NotFoundException(CustomerOrder.class.getSimpleName()));
    }

    /**
     * findByParam
     *
     * @param customerOrder
     */
    @Override
    public List<CustomerOrder> findByParam(CustomerOrder customerOrder) {
        return null;
    }

    /**
     * save one
     *
     * @param request
     */
    //查MovieSchedule的price
    @Override
    public CustomerOrder save(OrderRequest request) {


        CustomerOrder order = new CustomerOrder(UUID.randomUUID().toString(), request.getMovieId(),
                Math.random() * 100, request.getCinemaId(),false, request.getMovieScheduleId(), false,
                generateRandomTicketCode(15), request.getUserId());
        return orderRepository.save(order);
    }



    /**
     * save
     *
     * @param customerOrders
     */
    @Override
    public List<CustomerOrder> save(List<CustomerOrder> customerOrders) {
        return null;
    }


    /**
     * deleteById
     *
     * @param
     */
    @Override
    public void deleteById(String id) {
        this.orderRepository.deleteById(id);
    }

    /**
     * deleteByIds
     *
     * @param ids
     */
    @Override
    public void deleteByIds(List<String> ids) {
        ids.forEach(id -> {
            this.orderRepository.deleteById(id);
        });
    }


    /**
     * existsById
     *
     * @param id Id
     */
    @Override
    public boolean existsById(String id) {
        return orderRepository.existsById(id);
    }

    /**
     * findAll
     */
    @Override
    public Iterable<CustomerOrder> findAll() {
        return orderRepository.findAll();
    }

    /**
     * count
     */
    @Override
    public long count() {
        return orderRepository.count();
    }

    @Override
    public CustomerOrder getSameViewingTime(OrderRequest orderRequest) {
        return orderRepository.getCustomerOrderByMovieScheduleIdAndCinemaIdAndUserId(orderRequest.getMovieScheduleId(),orderRequest.getCinemaId(),orderRequest.getUserId());
    }

    @Override
    public List<OrderListResponse> getOrderList(String userId, Integer pageSize, Integer startPage) {
        Integer result = (startPage - 1) * pageSize;
        return orderRepository.getOrderByUserIdAndByPage(userId,pageSize,result);
    }

    private String generateRandomTicketCode(int length) {
        String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        Random random = new Random();
        StringBuilder ticketCodeStringBuffer = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            ticketCodeStringBuffer.append(str.charAt(number));
        }
        return ticketCodeStringBuffer.toString();
    }
}

