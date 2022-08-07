package com.cool.movie.service.impl;

import com.cool.movie.entity.Order;
import com.cool.movie.repository.OrderRepository;
import com.cool.movie.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Order)�����ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:17
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {


    @Resource
    private OrderRepository orderRepository;

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    @Override
    public Optional<Order> findById() {
        return orderRepository.findById();
    }

    /**
     * ���ݲ�����ѯ��������
     *
     * @param order ��������
     */
    @Override
    public List<Order> findByParam(Order order) {
        return null;
    }

    /**
     * ����һ������
     *
     * @param order ʵ����
     */
    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    /**
     * �����������
     *
     * @param orders ʵ����
     */
    @Override
    public List<Order> save(List<Order> orders) {
        return null;
    }


    /**
     * ͨ������ɾ������
     *
     * @param ����
     */
    @Override
    public void deleteById() {
        this.orderRepository.deleteById();
    }

    /**
     * ɾ����������
     *
     * @param ids ��������
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.orderRepository.deleteById(id);
        });
    }


    /**
     * ����id��ѯ�����Ƿ����
     *
     * @param id ����Id
     */
    @Override
    public boolean existsById() {
        return orderRepository.existsById();
    }

    /**
     * ��ѯ��������
     */
    @Override
    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }

    /**
     * ͳ�Ƹ���
     */
    @Override
    public long count() {
        return orderRepository.count();
    }
}

