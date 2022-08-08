package com.cool.movie.service.impl;

import com.cool.movie.entity.CustomerOrder;
import com.cool.movie.exception.NotFoundException;
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
    public Optional<CustomerOrder> findById(String id) {
        return Optional.ofNullable(orderRepository.findById(id).orElseThrow(() -> new NotFoundException("CustomerOrder")));
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
     * @param customerOrder
     */
    @Override
    public CustomerOrder save(CustomerOrder customerOrder) {
        return orderRepository.save(customerOrder);
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
}

