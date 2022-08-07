package com.cool.movie.service;


import com.cool.movie.entity.MovieType;

import java.util.List;
import java.util.Optional;

/**
 * (MovieType)�����ӿ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:15
 */
public interface MovieTypeService {

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    Optional<MovieType> findById();

    /**
     * ���ݲ�����ѯ��������
     *
     * @param movieType ��������
     */
    List<MovieType> findByParam(MovieType movieType);

    /**
     * ����һ������
     *
     * @param movieType ʵ����
     */
    MovieType save(MovieType movieType);

    /**
     * �����������
     *
     * @param movieTypes ʵ����
     */
    List<MovieType> save(List<MovieType> movieTypes);

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
    Iterable<MovieType> findAll();

    /**
     * ͳ�Ƹ���
     */
    long count();
}

