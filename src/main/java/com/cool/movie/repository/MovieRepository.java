package com.cool.movie.repository;


import com.cool.movie.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (Movie)�����ݿ���ʲ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:14
 */
@Repository
public interface MovieRepository extends JpaRepository<Movie, String> {

}

