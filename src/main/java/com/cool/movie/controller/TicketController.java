package com.cool.movie.controller;


import com.cool.movie.entity.Ticket;
import com.cool.movie.service.TicketService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Ticket)表控制层
 *
 * @author makejava
 * @since 2022-08-07 21:44:21
 */
@RestController
@RequestMapping("ticket")
public class TicketController {
    /**
     * 服务对象
     */
    @Resource
    private TicketService ticketService;

    /**
     * 分页查询所有数据
     *
     * @param ticket 查询实体
     * @return 所有数据
     */
    @GetMapping
    public void selectAll(Ticket ticket) {

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
     * @param ticket 实体对象
     * @return 新增结果
     */
    @PostMapping
    public void insert(@RequestBody Ticket ticket) {

    }

    /**
     * 修改数据
     *
     * @param ticket 实体对象
     * @return 修改结果
     */
    @PutMapping
    public void update(@RequestBody Ticket ticket) {

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

