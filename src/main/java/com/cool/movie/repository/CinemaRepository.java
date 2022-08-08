package com.cool.movie.repository;


import com.cool.movie.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CinemaRepository extends JpaRepository<Cinema, String> {

}

