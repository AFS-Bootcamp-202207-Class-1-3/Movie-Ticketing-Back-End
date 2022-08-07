package com.cool.movie.controller;


import com.cool.movie.entity.Ticket;
import com.cool.movie.service.TicketService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * (Ticket)����Ʋ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:21
 */
@RestController
@RequestMapping("ticket")
public class TicketController {
    /**
     * �������
     */
    @Resource
    private TicketService ticketService;

    /**
     * ��ҳ��ѯ��������
     *
     * @param ticket ��ѯʵ��
     * @return ��������
     */
    @GetMapping
    public void selectAll(Ticket ticket) {

    }

    /**
     * ͨ��������ѯ��������
     *
     * @param id ����
     * @return ��������
     */
    @GetMapping("{id}")
    public void selectOne(@PathVariable Serializable id) {

    }

    /**
     * ��������
     *
     * @param ticket ʵ�����
     * @return �������
     */
    @PostMapping
    public void insert(@RequestBody Ticket ticket) {

    }

    /**
     * �޸�����
     *
     * @param ticket ʵ�����
     * @return �޸Ľ��
     */
    @PutMapping
    public void update(@RequestBody Ticket ticket) {

    }

    /**
     * ɾ������
     *
     * @param idList �������
     * @return ɾ�����
     */
    @DeleteMapping
    public void delete(@RequestParam("idList") List<Long> idList) {

    }
}

