package com.cool.movie.service.impl;

import com.cool.movie.entity.Order;
import com.cool.movie.repository.OrderRepository;
import com.cool.movie.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

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

    /**
     * findById
     *
     * @param id
     */
    @Override
    public Optional<Order> findById(String id) {
        return orderRepository.findById(id);
    }

    /**
     * findByParam
     *
     * @param order
     */
    @Override
    public List<Order> findByParam(Order order) {
        return null;
    }

    /**
     * save one
     *
     * @param order
     */
    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    /**
     * save
     *
     * @param orders
     */
    @Override
    public List<Order> save(List<Order> orders) {
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
    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }

    /**
     * count
     */
    @Override
    public long count() {
        return orderRepository.count();
    }
}

