package com.cool.movie.service.impl;

import com.cool.movie.entity.Ticket;
import com.cool.movie.repository.TicketRepository;
import com.cool.movie.service.TicketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Ticket)�����ʵ����
 *
 * @author makejava
 * @since 2022-08-07 21:44:21
 */
@Service("ticketService")
public class TicketServiceImpl implements TicketService {


    @Resource
    private TicketRepository ticketRepository;

    /**
     * ����������ѯһ������
     *
     * @param ����id
     */
    @Override
    public Optional<Ticket> findById() {
        return ticketRepository.findById();
    }

    /**
     * ���ݲ�����ѯ��������
     *
     * @param ticket ��������
     */
    @Override
    public List<Ticket> findByParam(Ticket ticket) {
        return null;
    }

    /**
     * ����һ������
     *
     * @param ticket ʵ����
     */
    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    /**
     * �����������
     *
     * @param tickets ʵ����
     */
    @Override
    public List<Ticket> save(List<Ticket> tickets) {
        return null;
    }


    /**
     * ͨ������ɾ������
     *
     * @param ����
     */
    @Override
    public void deleteById() {
        this.ticketRepository.deleteById();
    }

    /**
     * ɾ����������
     *
     * @param ids ��������
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.ticketRepository.deleteById(id);
        });
    }


    /**
     * ����id��ѯ�����Ƿ����
     *
     * @param id ����Id
     */
    @Override
    public boolean existsById() {
        return ticketRepository.existsById();
    }

    /**
     * ��ѯ��������
     */
    @Override
    public Iterable<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    /**
     * ͳ�Ƹ���
     */
    @Override
    public long count() {
        return ticketRepository.count();
    }
}

