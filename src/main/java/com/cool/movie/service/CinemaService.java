package com.cool.movie.service;


import com.cool.movie.entity.Cinema;

import java.util.List;
import java.util.Optional;

/**
 * (Cinema)�����ӿ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:09
 */
public interface CinemaService {

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    Optional<Cinema> findById();

    /**
     * ���ݲ�����ѯ��������
     *
     * @param cinema ��������
     */
    List<Cinema> findByParam(Cinema cinema);

    /**
     * ����һ������
     *
     * @param cinema ʵ����
     */
    Cinema save(Cinema cinema);

    /**
     * �����������
     *
     * @param cinemas ʵ����
     */
    List<Cinema> save(List<Cinema> cinemas);

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
    Iterable<Cinema> findAll();

    /**
     * ͳ�Ƹ���
     */
    long count();
}

