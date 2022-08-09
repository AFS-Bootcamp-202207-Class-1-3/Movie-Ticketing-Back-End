package com.cool.movie.repository;

import com.cool.movie.entity.MovieSchedule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface MovieScheduleRepository extends JpaRepository<MovieSchedule, String> {
    List<MovieSchedule> getMovieSchedulesByCinemaId(String cinemaId);
}

