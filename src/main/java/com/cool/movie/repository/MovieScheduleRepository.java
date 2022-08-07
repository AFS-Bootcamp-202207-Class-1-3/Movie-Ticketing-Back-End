package com.cool.movie.repository;


import com.cool.movie.entity.MovieSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (MovieSchedule)表数据库访问层
 *
 * @author makejava
 * @since 2022-08-07 21:44:15
 */
@Repository
public interface MovieScheduleRepository extends JpaRepository<MovieSchedule, String> {

}

