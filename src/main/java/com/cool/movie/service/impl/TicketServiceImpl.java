package com.cool.movie.service.impl;

import com.cool.movie.entity.Ticket;
import com.cool.movie.repository.TicketRepository;
import com.cool.movie.service.TicketService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Optional;

/**
 * (Ticket)表服务实现类
 *
 * @author makejava
 * @since 2022-08-07 21:44:21
 */
@Service("ticketService")
public class TicketServiceImpl implements TicketService {


    @Resource
    private TicketRepository ticketRepository;

    /**
     * 根据主键查询一条数据
     *
     * @param 主键id
     */
    @Override
    public Optional<Ticket> findById() {
        return ticketRepository.findById();
    }

    /**
     * 根据参数查询多条数据
     *
     * @param ticket 条件参数
     */
    @Override
    public List<Ticket> findByParam(Ticket ticket) {
        return null;
    }

    /**
     * 保存一条数据
     *
     * @param ticket 实体类
     */
    @Override
    public Ticket save(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    /**
     * 保存多条数据
     *
     * @param tickets 实体类
     */
    @Override
    public List<Ticket> save(List<Ticket> tickets) {
        return null;
    }


    /**
     * 通过主键删除数据
     *
     * @param 主键
     */
    @Override
    public void deleteById() {
        this.ticketRepository.deleteById();
    }

    /**
     * 删除多条数据
     *
     * @param ids 多条主键
     */
    @Override
    public void deleteByIds(List<> ids) {
        ids.forEach(id -> {
            this.ticketRepository.deleteById(id);
        });
    }


    /**
     * 根据id查询数据是否存在
     *
     * @param id 主键Id
     */
    @Override
    public boolean existsById() {
        return ticketRepository.existsById();
    }

    /**
     * 查询所有数据
     */
    @Override
    public Iterable<Ticket> findAll() {
        return ticketRepository.findAll();
    }

    /**
     * 统计个数
     */
    @Override
    public long count() {
        return ticketRepository.count();
    }
}

