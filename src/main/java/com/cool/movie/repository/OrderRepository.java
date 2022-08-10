package com.cool.movie.repository;


import com.cool.movie.dto.OrderListResponse;
import com.cool.movie.dto.OrderRequest;
import com.cool.movie.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigInteger;
import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository<CustomerOrder, String> {
//    @Query(value = "select * from customer_order where movie_schedule_id = '?1' and cinema_id = '?2' and user_id = '?3'" , nativeQuery = true)
//    CustomerOrder getSameViewingTime(String movieSchedule,String cinemaId,String userId);

    CustomerOrder getCustomerOrderByMovieScheduleIdAndCinemaIdAndUserId(String movieScheduleId, String cinemaId, String uerId);

    //    @Query(value = "select co.id,m.name,ms.start_time ,co.price,co.is_pay from " +
//            "customer_order as co join movie as m on co.movie_id = m.id join movie_schedule ms " +
//            "on ms.movie_id = m.id " +
//            "where co.user_id = ?1" +
//            "order by co.is_pay, ms.start_time desc limit ?2 offset ?3" ,nativeQuery = true)
    @Query(value = "select co.id,m.name,ms.start_time as starttime,co.price,co.is_pay as ispay" +
            " from customer_order as co " +
            "join movie as m on co.movie_id = m.id " +
            "join movie_schedule ms on ms.movie_id = m.id " +
            "where co.user_id = ?1 " +
            "order by co.is_pay , ms.start_time desc " +
            "limit ?2 offset ?3", nativeQuery = true)
    List<OrderListResponse> getOrderByUserIdAndByPage(String userId, Integer pageSize, Integer startPage);
}

