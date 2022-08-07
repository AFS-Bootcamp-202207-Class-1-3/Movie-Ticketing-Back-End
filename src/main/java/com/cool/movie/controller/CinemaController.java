package com.cool.movie.controller;


import com.cool.movie.entity.Cinema;
import com.cool.movie.service.CinemaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Cinema)����Ʋ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:11
 */
@RestController
@RequestMapping("cinema")
public class CinemaController {
    /**
     * �������
     */
    @Resource
    private CinemaService cinemaService;

    /**
     * ��ҳ��ѯ��������
     *
     * @param cinema ��ѯʵ��
     * @return ��������
     */
    @GetMapping
    public void selectAll(Cinema cinema) {

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
     * @param cinema ʵ�����
     * @return �������
     */
    @PostMapping
    public void insert(@RequestBody Cinema cinema) {

    }

    /**
     * �޸�����
     *
     * @param cinema ʵ�����
     * @return �޸Ľ��
     */
    @PutMapping
    public void update(@RequestBody Cinema cinema) {

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

