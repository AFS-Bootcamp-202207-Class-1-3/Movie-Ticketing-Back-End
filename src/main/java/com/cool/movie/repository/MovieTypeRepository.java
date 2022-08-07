package com.cool.movie.repository;


import com.cool.movie.entity.MovieType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (MovieType)表数据库访问层
 *
 * @author makejava
 * @since 2022-08-07 21:44:16
 */
@Repository
public interface MovieTypeRepository extends JpaRepository<MovieType, String> {

}

