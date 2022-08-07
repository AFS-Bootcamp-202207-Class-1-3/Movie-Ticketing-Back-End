package com.cool.movie.controller;


import com.cool.movie.entity.Movie;
import com.cool.movie.service.MovieService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Movie)表控制层
 *
 * @author makejava
 * @since 2022-08-07 21:44:13
 */
@RestController
@RequestMapping("movie")
public class MovieController {
    /**
     * 服务对象
     */
    @Resource
    private MovieService movieService;

    /**
     * 分页查询所有数据
     *
     * @param movie 查询实体
     * @return 所有数据
     */
    @GetMapping
    public void selectAll(Movie movie) {

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
     * @param movie 实体对象
     * @return 新增结果
     */
    @PostMapping
    public void insert(@RequestBody Movie movie) {

    }

    /**
     * 修改数据
     *
     * @param movie 实体对象
     * @return 修改结果
     */
    @PutMapping
    public void update(@RequestBody Movie movie) {

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

