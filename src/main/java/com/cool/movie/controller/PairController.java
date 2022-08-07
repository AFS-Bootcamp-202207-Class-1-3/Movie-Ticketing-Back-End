package com.cool.movie.controller;


import com.cool.movie.entity.Pair;
import com.cool.movie.service.PairService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Pair)����Ʋ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:19
 */
@RestController
@RequestMapping("pair")
public class PairController {
    /**
     * �������
     */
    @Resource
    private PairService pairService;

    /**
     * ��ҳ��ѯ��������
     *
     * @param pair ��ѯʵ��
     * @return ��������
     */
    @GetMapping
    public void selectAll(Pair pair) {

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
     * @param pair ʵ�����
     * @return �������
     */
    @PostMapping
    public void insert(@RequestBody Pair pair) {

    }

    /**
     * �޸�����
     *
     * @param pair ʵ�����
     * @return �޸Ľ��
     */
    @PutMapping
    public void update(@RequestBody Pair pair) {

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

