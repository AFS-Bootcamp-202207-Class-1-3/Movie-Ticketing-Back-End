package com.cool.movie.controller;


import com.cool.movie.entity.Movie;
import com.cool.movie.service.MovieService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Movie)����Ʋ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:13
 */
@RestController
@RequestMapping("movie")
public class MovieController {
    /**
     * �������
     */
    @Resource
    private MovieService movieService;

    /**
     * ��ҳ��ѯ��������
     *
     * @param movie ��ѯʵ��
     * @return ��������
     */
    @GetMapping
    public void selectAll(Movie movie) {

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
     * @param movie ʵ�����
     * @return �������
     */
    @PostMapping
    public void insert(@RequestBody Movie movie) {

    }

    /**
     * �޸�����
     *
     * @param movie ʵ�����
     * @return �޸Ľ��
     */
    @PutMapping
    public void update(@RequestBody Movie movie) {

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

