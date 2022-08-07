package com.cool.movie.service;


import com.cool.movie.entity.Order;

import java.util.List;
import java.util.Optional;

/**
 * (Order)表服务接口
 *
 * @author makejava
 * @since 2022-08-07 21:44:17
 */
public interface OrderService {

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    Optional<Order> findById();

    /**
     * 根据参数查询多条数据
     *
     * @param order 条件参数
     */
    List<Order> findByParam(Order order);

    /**
     * 保存一条数据
     *
     * @param order 实体类
     */
    Order save(Order order);

    /**
     * 保存多条数据
     *
     * @param orders 实体类
     */
    List<Order> save(List<Order> orders);

    /**
     * 删除一条数据
     *
     * @param 主键id
     */
    void deleteById();

    /**
     * 删除多条数据
     *
     * @param ids 多条主键
     */
    void deleteByIds(List<> ids);


    /**
     * 根据id查询数据是否存在
     *
     * @param 主键Id
     */
    boolean existsById();

    /**
     * 查询所有数据
     */
    Iterable<Order> findAll();

    /**
     * 统计个数
     */
    long count();
}

