package com.cool.movie.repository;


import com.cool.movie.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (Cinema)�����ݿ���ʲ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:12
 */
@Repository
public interface CinemaRepository extends JpaRepository<Cinema, String> {

}

