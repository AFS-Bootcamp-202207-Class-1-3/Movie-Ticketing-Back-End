package com.cool.movie.service;


import com.cool.movie.entity.Ticket;

import java.util.List;
import java.util.Optional;

/**
 * (Ticket)�����ӿ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:21
 */
public interface TicketService {

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    Optional<Ticket> findById();

    /**
     * ���ݲ�����ѯ��������
     *
     * @param ticket ��������
     */
    List<Ticket> findByParam(Ticket ticket);

    /**
     * ����һ������
     *
     * @param ticket ʵ����
     */
    Ticket save(Ticket ticket);

    /**
     * �����������
     *
     * @param tickets ʵ����
     */
    List<Ticket> save(List<Ticket> tickets);

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
    Iterable<Ticket> findAll();

    /**
     * ͳ�Ƹ���
     */
    long count();
}

