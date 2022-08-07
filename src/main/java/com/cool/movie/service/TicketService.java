package com.cool.movie.service;


import com.cool.movie.entity.Ticket;

import java.util.List;
import java.util.Optional;

/**
 * (Ticket)表服务接口
 *
 * @author makejava
 * @since 2022-08-07 21:44:21
 */
public interface TicketService {

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    Optional<Ticket> findById();

    /**
     * 根据参数查询多条数据
     *
     * @param ticket 条件参数
     */
    List<Ticket> findByParam(Ticket ticket);

    /**
     * 保存一条数据
     *
     * @param ticket 实体类
     */
    Ticket save(Ticket ticket);

    /**
     * 保存多条数据
     *
     * @param tickets 实体类
     */
    List<Ticket> save(List<Ticket> tickets);

    /**
     * 删除一条数据
     *
     * @param 主键id
     */
    void deleteById();

    /**
     * 删除多条数据
     *
     * @param ids 多条主键
     */
    void deleteByIds(List<> ids);


    /**
     * 根据id查询数据是否存在
     *
     * @param 主键Id
     */
    boolean existsById();

    /**
     * 查询所有数据
     */
    Iterable<Ticket> findAll();

    /**
     * 统计个数
     */
    long count();
}

