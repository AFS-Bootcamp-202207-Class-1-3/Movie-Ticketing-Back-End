package com.cool.movie.controller;


import com.cool.movie.entity.MovieSchedule;
import com.cool.movie.service.MovieScheduleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (MovieSchedule)����Ʋ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:15
 */
@RestController
@RequestMapping("movieSchedule")
public class MovieScheduleController {
    /**
     * �������
     */
    @Resource
    private MovieScheduleService movieScheduleService;

    /**
     * ��ҳ��ѯ��������
     *
     * @param movieSchedule ��ѯʵ��
     * @return ��������
     */
    @GetMapping
    public void selectAll(MovieSchedule movieSchedule) {

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
     * @param movieSchedule ʵ�����
     * @return �������
     */
    @PostMapping
    public void insert(@RequestBody MovieSchedule movieSchedule) {

    }

    /**
     * �޸�����
     *
     * @param movieSchedule ʵ�����
     * @return �޸Ľ��
     */
    @PutMapping
    public void update(@RequestBody MovieSchedule movieSchedule) {

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

