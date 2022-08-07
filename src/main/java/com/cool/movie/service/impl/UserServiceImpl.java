package com.cool.movie.service.impl;

import com.cool.movie.entity.User;
import com.cool.movie.repository.UserRepository;
import com.cool.movie.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2022-08-07 21:44:22
 */
@Service("userService")
public class UserServiceImpl implements UserService {


    @Resource
    private UserRepository userRepository;

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    @Override
    public Optional<User> findById() {
        return userRepository.findById();
    }

    /**
     * 根据参数查询多条数据
     *
     * @param user 条件参数
     */
    @Override
    public List<User> findByParam(User user) {
        return null;
    }

    /**
     * 保存一条数据
     *
     * @param user 实体类
     */
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    /**
     * 保存多条数据
     *
     * @param users 实体类
     */
    @Override
    public List<User> save(List<User> users) {
        return null;
    }


    /**
     * 通过主键删除数据
     *
     * @param 主键
     */
    @Override
    public void deleteById() {
        this.userRepository.deleteById();
    }

    /**
     * 删除多条数据
     *
     * @param ids 多条主键
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.userRepository.deleteById(id);
        });
    }


    /**
     * 根据id查询数据是否存在
     *
     * @param id 主键Id
     */
    @Override
    public boolean existsById() {
        return userRepository.existsById();
    }

    /**
     * 查询所有数据
     */
    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * 统计个数
     */
    @Override
    public long count() {
        return userRepository.count();
    }
}

