package com.cool.movie.repository;


import com.cool.movie.entity.Pair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface PairRepository extends JpaRepository<Pair, String> {

}

