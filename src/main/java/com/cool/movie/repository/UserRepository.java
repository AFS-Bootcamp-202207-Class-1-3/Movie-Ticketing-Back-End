package com.cool.movie.repository;


import com.cool.movie.entity.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Customer, String> {
    Customer findByRealName(String realName);

    @Query(value = "select customer.* from " +
            "customer left join pair on customer.id =pair.user_id " +
            "where pair.partner_id is null and customer.id!=?1 and pair.movie_schedule_id =?2"
            ,countQuery ="select count(*) from " +
            "customer left join pair on customer.id =pair.user_id " +
            "where pair.partner_id is null and customer.id!=?1 and pair.movie_schedule_id =?2"
            , nativeQuery =true)
    Page<Customer> findSinglePartnerByPage(String userId, String movieScheduleId, Pageable pageable);
}

