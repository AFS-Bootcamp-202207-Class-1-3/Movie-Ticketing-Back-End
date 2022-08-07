package com.cool.movie.service;


import com.cool.movie.entity.Movie;

import java.util.List;
import java.util.Optional;

/**
 * (Movie)表服务接口
 *
 * @author makejava
 * @since 2022-08-07 21:44:12
 */
public interface MovieService {

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    Optional<Movie> findById();

    /**
     * 根据参数查询多条数据
     *
     * @param movie 条件参数
     */
    List<Movie> findByParam(Movie movie);

    /**
     * 保存一条数据
     *
     * @param movie 实体类
     */
    Movie save(Movie movie);

    /**
     * 保存多条数据
     *
     * @param movies 实体类
     */
    List<Movie> save(List<Movie> movies);

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
    Iterable<Movie> findAll();

    /**
     * 统计个数
     */
    long count();
}

