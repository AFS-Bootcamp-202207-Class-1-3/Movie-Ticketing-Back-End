package com.cool.movie.repository;


import com.cool.movie.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (Ticket)表数据库访问层
 *
 * @author makejava
 * @since 2022-08-07 21:44:22
 */

@Repository
public interface TicketRepository extends JpaRepository<Ticket, String> {

}

