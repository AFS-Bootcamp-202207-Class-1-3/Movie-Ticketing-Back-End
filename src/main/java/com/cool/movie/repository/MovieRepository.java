package com.cool.movie.repository;


import com.cool.movie.dto.movie.MovieWithMessagePage;
import com.cool.movie.entity.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
    Page<Movie> movieWithMessagePage(String sql,String countSql, Pageable pageable)
}

