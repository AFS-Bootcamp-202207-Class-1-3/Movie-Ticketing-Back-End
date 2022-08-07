package com.cool.movie.service;


import com.cool.movie.entity.User;

import java.util.List;
import java.util.Optional;

/**
 * (User)�����ӿ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:22
 */
public interface UserService {

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    Optional<User> findById();

    /**
     * ���ݲ�����ѯ��������
     *
     * @param user ��������
     */
    List<User> findByParam(User user);

    /**
     * ����һ������
     *
     * @param user ʵ����
     */
    User save(User user);

    /**
     * �����������
     *
     * @param users ʵ����
     */
    List<User> save(List<User> users);

    /**
     * ɾ��һ������
     *
     * @param ����id
     */
    void deleteById();

    /**
     * ɾ����������
     *
     * @param ids ��������
     */
    void deleteByIds(List<> ids);


    /**
     * ����id��ѯ�����Ƿ����
     *
     * @param ����Id
     */
    boolean existsById();

    /**
     * ��ѯ��������
     */
    Iterable<User> findAll();

    /**
     * ͳ�Ƹ���
     */
    long count();
}

