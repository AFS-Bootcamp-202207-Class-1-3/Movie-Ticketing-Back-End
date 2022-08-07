package com.cool.movie.service;


import com.cool.movie.entity.Cinema;

import java.util.List;
import java.util.Optional;

/**
 * (Cinema)表服务接口
 *
 * @author makejava
 * @since 2022-08-07 21:44:09
 */
public interface CinemaService {

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    Optional<Cinema> findById();

    /**
     * 根据参数查询多条数据
     *
     * @param cinema 条件参数
     */
    List<Cinema> findByParam(Cinema cinema);

    /**
     * 保存一条数据
     *
     * @param cinema 实体类
     */
    Cinema save(Cinema cinema);

    /**
     * 保存多条数据
     *
     * @param cinemas 实体类
     */
    List<Cinema> save(List<Cinema> cinemas);

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
    Iterable<Cinema> findAll();

    /**
     * 统计个数
     */
    long count();
}

