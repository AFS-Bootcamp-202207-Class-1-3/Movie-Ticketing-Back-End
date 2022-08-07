package com.cool.movie.controller;


import com.cool.movie.entity.Pay;
import com.cool.movie.service.PayService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Pay)����Ʋ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:20
 */
@RestController
@RequestMapping("pay")
public class PayController {
    /**
     * �������
     */
    @Resource
    private PayService payService;

    /**
     * ��ҳ��ѯ��������
     *
     * @param pay ��ѯʵ��
     * @return ��������
     */
    @GetMapping
    public void selectAll(Pay pay) {

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
     * @param pay ʵ�����
     * @return �������
     */
    @PostMapping
    public void insert(@RequestBody Pay pay) {

    }

    /**
     * �޸�����
     *
     * @param pay ʵ�����
     * @return �޸Ľ��
     */
    @PutMapping
    public void update(@RequestBody Pay pay) {

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

