package com.cool.movie.repository;


import com.cool.movie.entity.MovieType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (MovieType)�����ݿ���ʲ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:16
 */
@Repository
public interface MovieTypeRepository extends JpaRepository<MovieType, String> {

}

