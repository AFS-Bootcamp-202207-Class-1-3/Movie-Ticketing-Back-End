package com.cool.movie.repository;


import com.cool.movie.entity.Pair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (Pair)表数据库访问层
 *
 * @author makejava
 * @since 2022-08-07 21:44:19
 */

@Repository
public interface PairRepository extends JpaRepository<Pair, String> {

}

