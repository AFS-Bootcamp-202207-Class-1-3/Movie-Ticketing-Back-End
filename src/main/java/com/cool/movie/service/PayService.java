package com.cool.movie.service;


import com.cool.movie.entity.Pay;

import java.util.List;
import java.util.Optional;

/**
 * (Pay)表服务接口
 *
 * @author makejava
 * @since 2022-08-07 21:44:20
 */
public interface PayService {

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    Optional<Pay> findById();

    /**
     * 根据参数查询多条数据
     *
     * @param pay 条件参数
     */
    List<Pay> findByParam(Pay pay);

    /**
     * 保存一条数据
     *
     * @param pay 实体类
     */
    Pay save(Pay pay);

    /**
     * 保存多条数据
     *
     * @param pays 实体类
     */
    List<Pay> save(List<Pay> pays);

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
    Iterable<Pay> findAll();

    /**
     * 统计个数
     */
    long count();
}

