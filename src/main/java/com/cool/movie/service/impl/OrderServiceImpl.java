package com.cool.movie.service.impl;

import com.cool.movie.entity.Order;
import com.cool.movie.repository.OrderRepository;
import com.cool.movie.service.OrderService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Order)表服务实现类
 *
 * @author makejava
 * @since 2022-08-07 21:44:17
 */
@Service("orderService")
public class OrderServiceImpl implements OrderService {


    @Resource
    private OrderRepository orderRepository;

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    @Override
    public Optional<Order> findById() {
        return orderRepository.findById();
    }

    /**
     * 根据参数查询多条数据
     *
     * @param order 条件参数
     */
    @Override
    public List<Order> findByParam(Order order) {
        return null;
    }

    /**
     * 保存一条数据
     *
     * @param order 实体类
     */
    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }

    /**
     * 保存多条数据
     *
     * @param orders 实体类
     */
    @Override
    public List<Order> save(List<Order> orders) {
        return null;
    }


    /**
     * 通过主键删除数据
     *
     * @param 主键
     */
    @Override
    public void deleteById() {
        this.orderRepository.deleteById();
    }

    /**
     * 删除多条数据
     *
     * @param ids 多条主键
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.orderRepository.deleteById(id);
        });
    }


    /**
     * 根据id查询数据是否存在
     *
     * @param id 主键Id
     */
    @Override
    public boolean existsById() {
        return orderRepository.existsById();
    }

    /**
     * 查询所有数据
     */
    @Override
    public Iterable<Order> findAll() {
        return orderRepository.findAll();
    }

    /**
     * 统计个数
     */
    @Override
    public long count() {
        return orderRepository.count();
    }
}

