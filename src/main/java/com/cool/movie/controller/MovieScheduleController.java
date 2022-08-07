package com.cool.movie.controller;


import com.cool.movie.entity.MovieSchedule;
import com.cool.movie.service.MovieScheduleService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (MovieSchedule)表控制层
 *
 * @author makejava
 * @since 2022-08-07 21:44:15
 */
@RestController
@RequestMapping("movieSchedule")
public class MovieScheduleController {
    /**
     * 服务对象
     */
    @Resource
    private MovieScheduleService movieScheduleService;

    /**
     * 分页查询所有数据
     *
     * @param movieSchedule 查询实体
     * @return 所有数据
     */
    @GetMapping
    public void selectAll(MovieSchedule movieSchedule) {

    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }

    /**
     * 新增数据
     *
     * @param movieSchedule 实体对象
     * @return 新增结果
     */
    @PostMapping
    public void insert(@RequestBody MovieSchedule movieSchedule) {

    }

    /**
     * 修改数据
     *
     * @param movieSchedule 实体对象
     * @return 修改结果
     */
    @PutMapping
    public void update(@RequestBody MovieSchedule movieSchedule) {

    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

