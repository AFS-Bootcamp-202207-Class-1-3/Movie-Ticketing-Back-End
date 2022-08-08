package com.cool.movie.repository;


import com.cool.movie.entity.MovieType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieTypeRepository extends JpaRepository<MovieType, String> {

}

