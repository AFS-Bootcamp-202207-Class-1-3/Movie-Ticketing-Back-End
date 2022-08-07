package com.cool.movie.service;


import com.cool.movie.entity.User;

import java.util.List;
import java.util.Optional;

/**
 * (User)表服务接口
 *
 * @author makejava
 * @since 2022-08-07 21:44:22
 */
public interface UserService {

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    Optional<User> findById();

    /**
     * 根据参数查询多条数据
     *
     * @param user 条件参数
     */
    List<User> findByParam(User user);

    /**
     * 保存一条数据
     *
     * @param user 实体类
     */
    User save(User user);

    /**
     * 保存多条数据
     *
     * @param users 实体类
     */
    List<User> save(List<User> users);

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
    Iterable<User> findAll();

    /**
     * 统计个数
     */
    long count();
}

