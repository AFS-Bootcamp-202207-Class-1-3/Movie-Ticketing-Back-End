package com.cool.movie.repository;


import com.cool.movie.entity.Pay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (Pay)表数据库访问层
 *
 * @author makejava
 * @since 2022-08-07 21:44:20
 */

@Repository
public interface PayRepository extends JpaRepository<Pay, String> {

}

