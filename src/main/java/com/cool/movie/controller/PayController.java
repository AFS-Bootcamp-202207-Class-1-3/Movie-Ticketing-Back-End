package com.cool.movie.controller;


import com.cool.movie.entity.Pay;
import com.cool.movie.service.PayService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Pay)表控制层
 *
 * @author makejava
 * @since 2022-08-07 21:44:20
 */
@RestController
@RequestMapping("pay")
public class PayController {
    /**
     * 服务对象
     */
    @Resource
    private PayService payService;

    /**
     * 分页查询所有数据
     *
     * @param pay 查询实体
     * @return 所有数据
     */
    @GetMapping
    public void selectAll(Pay pay) {

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
     * @param pay 实体对象
     * @return 新增结果
     */
    @PostMapping
    public void insert(@RequestBody Pay pay) {

    }

    /**
     * 修改数据
     *
     * @param pay 实体对象
     * @return 修改结果
     */
    @PutMapping
    public void update(@RequestBody Pay pay) {

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

