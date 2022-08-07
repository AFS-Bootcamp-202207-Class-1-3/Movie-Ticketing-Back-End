package com.cool.movie.service;


import com.cool.movie.entity.Movie;

import java.util.List;
import java.util.Optional;

/**
 * (Movie)�����ӿ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:12
 */
public interface MovieService {

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    Optional<Movie> findById();

    /**
     * ���ݲ�����ѯ��������
     *
     * @param movie ��������
     */
    List<Movie> findByParam(Movie movie);

    /**
     * ����һ������
     *
     * @param movie ʵ����
     */
    Movie save(Movie movie);

    /**
     * �����������
     *
     * @param movies ʵ����
     */
    List<Movie> save(List<Movie> movies);

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
    Iterable<Movie> findAll();

    /**
     * ͳ�Ƹ���
     */
    long count();
}

