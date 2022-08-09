package com.cool.movie.repository;

import com.cool.movie.entity.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailViewRepository extends JpaRepository<OrderDetail, String> {
}
