package com.cool.movie.repository;


import com.cool.movie.entity.Pay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PayRepository extends JpaRepository<Pay, String> {
    Pay findByOrdersIds(String orderIds);
}

