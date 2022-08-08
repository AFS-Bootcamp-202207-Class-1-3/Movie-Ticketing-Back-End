package com.cool.movie.repository;


import com.cool.movie.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<CustomerOrder, String> {
}

