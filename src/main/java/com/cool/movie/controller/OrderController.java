package com.cool.movie.controller;


import com.cool.movie.entity.Order;
import com.cool.movie.service.OrderService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Order)����Ʋ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:18
 */
@RestController
@RequestMapping("order")
public class OrderController {
    /**
     * �������
     */
    @Resource
    private OrderService orderService;

    /**
     * ��ҳ��ѯ��������
     *
     * @param order ��ѯʵ��
     * @return ��������
     */
    @GetMapping
    public void selectAll(Order order) {

    }

    /**
     * ͨ��������ѯ��������
     *
     * @param id ����
     * @return ��������
     */
    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }

    /**
     * ��������
     *
     * @param order ʵ�����
     * @return �������
     */
    @PostMapping
    public void insert(@RequestBody Order order) {

    }

    /**
     * �޸�����
     *
     * @param order ʵ�����
     * @return �޸Ľ��
     */
    @PutMapping
    public void update(@RequestBody Order order) {

    }

    /**
     * ɾ������
     *
     * @param idList �������
     * @return ɾ�����
     */
    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

