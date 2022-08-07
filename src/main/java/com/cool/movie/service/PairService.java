package com.cool.movie.service;


import com.cool.movie.entity.Pair;

import java.util.List;
import java.util.Optional;

/**
 * (Pair)表服务接口
 *
 * @author makejava
 * @since 2022-08-07 21:44:18
 */
public interface PairService {

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    Optional<Pair> findById();

    /**
     * 根据参数查询多条数据
     *
     * @param pair 条件参数
     */
    List<Pair> findByParam(Pair pair);

    /**
     * 保存一条数据
     *
     * @param pair 实体类
     */
    Pair save(Pair pair);

    /**
     * 保存多条数据
     *
     * @param pairs 实体类
     */
    List<Pair> save(List<Pair> pairs);

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
    Iterable<Pair> findAll();

    /**
     * 统计个数
     */
    long count();
}

