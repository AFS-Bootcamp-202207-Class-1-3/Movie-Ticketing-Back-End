package com.cool.movie.service.impl;

import com.cool.movie.entity.User;
import com.cool.movie.repository.UserRepository;
import com.cool.movie.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;


@Service("userService")
public class UserServiceImpl implements UserService {


    @Resource
    private UserRepository userRepository;

    /**
     * findById
     *
     * @param id
     */
    @Override
    public Optional<User> findById(String id) {
        return userRepository.findById(id);
    }

    /**
     * findByParam
     *
     * @param user
     */
    @Override
    public List<User> findByParam(User user) {
        return null;
    }

    /**
     * save one
     *
     * @param user
     */
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    /**
     * save
     *
     * @param users
     */
    @Override
    public List<User> save(List<User> users) {
        return null;
    }


    /**
     * deleteById
     *
     * @param
     */
    @Override
    public void deleteById(String id) {
        this.userRepository.deleteById(id);
    }

    /**
     * deleteByIds
     *
     * @param ids
     */
    @Override
    public void deleteByIds(List<String> ids) {
        ids.forEach(id -> {
            this.userRepository.deleteById(id);
        });
    }


    /**
     * existsById
     *
     * @param id
     */
    @Override
    public boolean existsById(String id) {
        return userRepository.existsById(id);
    }

    /**
     * findAll
     */
    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * count
     */
    @Override
    public long count() {
        return userRepository.count();
    }
}

