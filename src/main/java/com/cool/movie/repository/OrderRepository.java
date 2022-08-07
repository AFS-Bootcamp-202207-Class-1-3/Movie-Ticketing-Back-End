package com.cool.movie.repository;


import com.cool.movie.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (Order)表数据库访问层
 *
 * @author makejava
 * @since 2022-08-07 21:44:18
 */
@Repository
public interface OrderRepository extends JpaRepository<Order, String> {

}

