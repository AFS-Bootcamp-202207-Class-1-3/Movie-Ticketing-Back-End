package com.cool.movie.repository;


import com.cool.movie.entity.Movie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {
    @Query(
            value = "select * from movie where name like %?1%",
            countQuery = "select count(*) from movie where name like %?1%",
            nativeQuery = true
    )
    Page<Movie> movieWithMessagePage(String searchMessage, Pageable pageable);
}

