package com.cool.movie.repository;


import com.cool.movie.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * (User)�����ݿ���ʲ�
 *
 * @author makejava
 * @since 2022-08-07 21:44:23
 */

@Repository
public interface UserRepository extends JpaRepository<User, String> {

}

