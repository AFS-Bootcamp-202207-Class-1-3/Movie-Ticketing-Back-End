package com.cool.movie.service;


import com.cool.movie.entity.Order;

import java.util.List;
import java.util.Optional;

/**
 * (Order)�����ӿ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:17
 */
public interface OrderService {

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    Optional<Order> findById();

    /**
     * ���ݲ�����ѯ��������
     *
     * @param order ��������
     */
    List<Order> findByParam(Order order);

    /**
     * ����һ������
     *
     * @param order ʵ����
     */
    Order save(Order order);

    /**
     * �����������
     *
     * @param orders ʵ����
     */
    List<Order> save(List<Order> orders);

    /**
     * ɾ��һ������
     *
     * @param ����id
     */
    void deleteById();

    /**
     * ɾ����������
     *
     * @param ids ��������
     */
    void deleteByIds(List<> ids);


    /**
     * ����id��ѯ�����Ƿ����
     *
     * @param ����Id
     */
    boolean existsById();

    /**
     * ��ѯ��������
     */
    Iterable<Order> findAll();

    /**
     * ͳ�Ƹ���
     */
    long count();
}

