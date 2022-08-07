package com.cool.movie.repository;


import com.cool.movie.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (User)表数据库访问层
 *
 * @author makejava
 * @since 2022-08-07 21:44:23
 */

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}

