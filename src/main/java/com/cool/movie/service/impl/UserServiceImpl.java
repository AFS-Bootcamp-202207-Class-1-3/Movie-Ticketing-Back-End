package com.cool.movie.service.impl;

import com.cool.movie.entity.User;
import com.cool.movie.repository.UserRepository;
import com.cool.movie.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (User)�����ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:22
 */
@Service("userService")
public class UserServiceImpl implements UserService {


    @Resource
    private UserRepository userRepository;

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    @Override
    public Optional<User> findById() {
        return userRepository.findById();
    }

    /**
     * ���ݲ�����ѯ��������
     *
     * @param user ��������
     */
    @Override
    public List<User> findByParam(User user) {
        return null;
    }

    /**
     * ����һ������
     *
     * @param user ʵ����
     */
    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    /**
     * �����������
     *
     * @param users ʵ����
     */
    @Override
    public List<User> save(List<User> users) {
        return null;
    }


    /**
     * ͨ������ɾ������
     *
     * @param ����
     */
    @Override
    public void deleteById() {
        this.userRepository.deleteById();
    }

    /**
     * ɾ����������
     *
     * @param ids ��������
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.userRepository.deleteById(id);
        });
    }


    /**
     * ����id��ѯ�����Ƿ����
     *
     * @param id ����Id
     */
    @Override
    public boolean existsById() {
        return userRepository.existsById();
    }

    /**
     * ��ѯ��������
     */
    @Override
    public Iterable<User> findAll() {
        return userRepository.findAll();
    }

    /**
     * ͳ�Ƹ���
     */
    @Override
    public long count() {
        return userRepository.count();
    }
}

