package com.cool.movie.controller;


import com.cool.movie.entity.MovieType;
import com.cool.movie.service.MovieTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (MovieType)����Ʋ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:16
 */
@RestController
@RequestMapping("movieType")
public class MovieTypeController {
    /**
     * �������
     */
    @Resource
    private MovieTypeService movieTypeService;

    /**
     * ��ҳ��ѯ��������
     *
     * @param movieType ��ѯʵ��
     * @return ��������
     */
    @GetMapping
    public void selectAll(MovieType movieType) {

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
     * @param movieType ʵ�����
     * @return �������
     */
    @PostMapping
    public void insert(@RequestBody MovieType movieType) {

    }

    /**
     * �޸�����
     *
     * @param movieType ʵ�����
     * @return �޸Ľ��
     */
    @PutMapping
    public void update(@RequestBody MovieType movieType) {

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

