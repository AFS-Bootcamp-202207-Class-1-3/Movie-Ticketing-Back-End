package com.cool.movie.service;


import com.cool.movie.entity.MovieType;

import java.util.List;
import java.util.Optional;

/**
 * (MovieType)表服务接口
 *
 * @author makejava
 * @since 2022-08-07 21:44:15
 */
public interface MovieTypeService {

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    Optional<MovieType> findById();

    /**
     * 根据参数查询多条数据
     *
     * @param movieType 条件参数
     */
    List<MovieType> findByParam(MovieType movieType);

    /**
     * 保存一条数据
     *
     * @param movieType 实体类
     */
    MovieType save(MovieType movieType);

    /**
     * 保存多条数据
     *
     * @param movieTypes 实体类
     */
    List<MovieType> save(List<MovieType> movieTypes);

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
    Iterable<MovieType> findAll();

    /**
     * 统计个数
     */
    long count();
}

