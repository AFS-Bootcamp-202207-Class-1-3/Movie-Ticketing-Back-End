package com.cool.movie.service;


import com.cool.movie.entity.Pair;

import java.util.List;
import java.util.Optional;

/**
 * (Pair)�����ӿ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:18
 */
public interface PairService {

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    Optional<Pair> findById();

    /**
     * ���ݲ�����ѯ��������
     *
     * @param pair ��������
     */
    List<Pair> findByParam(Pair pair);

    /**
     * ����һ������
     *
     * @param pair ʵ����
     */
    Pair save(Pair pair);

    /**
     * �����������
     *
     * @param pairs ʵ����
     */
    List<Pair> save(List<Pair> pairs);

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
    Iterable<Pair> findAll();

    /**
     * ͳ�Ƹ���
     */
    long count();
}

