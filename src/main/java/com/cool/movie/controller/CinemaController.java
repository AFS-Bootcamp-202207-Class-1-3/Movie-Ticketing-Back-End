package com.cool.movie.controller;


import com.cool.movie.entity.Cinema;
import com.cool.movie.service.CinemaService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Cinema)表控制层
 *
 * @author makejava
 * @since 2022-08-07 21:44:11
 */
@RestController
@RequestMapping("cinema")
public class CinemaController {
    /**
     * 服务对象
     */
    @Resource
    private CinemaService cinemaService;

    /**
     * 分页查询所有数据
     *
     * @param cinema 查询实体
     * @return 所有数据
     */
    @GetMapping
    public void selectAll(Cinema cinema) {

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
     * @param cinema 实体对象
     * @return 新增结果
     */
    @PostMapping
    public void insert(@RequestBody Cinema cinema) {

    }

    /**
     * 修改数据
     *
     * @param cinema 实体对象
     * @return 修改结果
     */
    @PutMapping
    public void update(@RequestBody Cinema cinema) {

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

