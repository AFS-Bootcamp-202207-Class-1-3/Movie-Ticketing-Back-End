package com.cool.movie.repository;


import com.cool.movie.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface UserRepository extends JpaRepository<Customer, String> {
    Customer findByRealName(String realName);
}

