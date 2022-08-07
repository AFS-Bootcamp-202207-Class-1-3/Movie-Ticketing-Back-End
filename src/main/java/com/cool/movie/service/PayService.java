package com.cool.movie.service;


import com.cool.movie.entity.Pay;

import java.util.List;
import java.util.Optional;

/**
 * (Pay)�����ӿ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:20
 */
public interface PayService {

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    Optional<Pay> findById();

    /**
     * ���ݲ�����ѯ��������
     *
     * @param pay ��������
     */
    List<Pay> findByParam(Pay pay);

    /**
     * ����һ������
     *
     * @param pay ʵ����
     */
    Pay save(Pay pay);

    /**
     * �����������
     *
     * @param pays ʵ����
     */
    List<Pay> save(List<Pay> pays);

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
    Iterable<Pay> findAll();

    /**
     * ͳ�Ƹ���
     */
    long count();
}

