package com.cool.movie.service;


import com.cool.movie.entity.MovieSchedule;

import java.util.List;
import java.util.Optional;

/**
 * (MovieSchedule)表服务接口
 *
 * @author makejava
 * @since 2022-08-07 21:44:14
 */
public interface MovieScheduleService {

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    Optional<MovieSchedule> findById();

    /**
     * 根据参数查询多条数据
     *
     * @param movieSchedule 条件参数
     */
    List<MovieSchedule> findByParam(MovieSchedule movieSchedule);

    /**
     * 保存一条数据
     *
     * @param movieSchedule 实体类
     */
    MovieSchedule save(MovieSchedule movieSchedule);

    /**
     * 保存多条数据
     *
     * @param movieSchedules 实体类
     */
    List<MovieSchedule> save(List<MovieSchedule> movieSchedules);

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
    Iterable<MovieSchedule> findAll();

    /**
     * 统计个数
     */
    long count();
}

