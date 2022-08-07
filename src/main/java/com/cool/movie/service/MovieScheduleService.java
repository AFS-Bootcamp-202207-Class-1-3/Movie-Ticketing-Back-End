package com.cool.movie.service;


import com.cool.movie.entity.MovieSchedule;

import java.util.List;
import java.util.Optional;

/**
 * (MovieSchedule)�����ӿ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:14
 */
public interface MovieScheduleService {

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    Optional<MovieSchedule> findById();

    /**
     * ���ݲ�����ѯ��������
     *
     * @param movieSchedule ��������
     */
    List<MovieSchedule> findByParam(MovieSchedule movieSchedule);

    /**
     * ����һ������
     *
     * @param movieSchedule ʵ����
     */
    MovieSchedule save(MovieSchedule movieSchedule);

    /**
     * �����������
     *
     * @param movieSchedules ʵ����
     */
    List<MovieSchedule> save(List<MovieSchedule> movieSchedules);

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
    Iterable<MovieSchedule> findAll();

    /**
     * ͳ�Ƹ���
     */
    long count();
}

