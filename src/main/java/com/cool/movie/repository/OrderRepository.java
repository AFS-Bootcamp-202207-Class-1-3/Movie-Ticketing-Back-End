package com.cool.movie.repository;


import com.cool.movie.dto.order.OrderListResponse;
import com.cool.movie.entity.CustomerOrder;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository<CustomerOrder, String> {

    CustomerOrder getCustomerOrderByMovieScheduleIdAndCinemaIdAndUserId(String movieScheduleId, String cinemaId, String uerId);

/*    @Query(value = "select co.id,m.name,ms.start_time as starttime,co.price,co.is_pay as ispay" +
            " from customer_order as co " +
            "join movie as m on co.movie_id = m.id " +
            "join movie_schedule ms on ms.movie_id = m.id " +
            "where co.user_id = ?1 " +
            "order by co.is_pay , ms.start_time desc " +
            "limit ?2 offset ?3", nativeQuery = true)
    List<OrderListResponse> getOrderByUserIdAndByPage(String userId, Integer pageSize, Integer startPage);*/

    @Query(value = "select co.id,m.name,ms.start_time as starttime,co.price,co.is_pay as ispay" +
            " from customer_order as co " +
            "join movie as m on co.movie_id = m.id " +
            "join movie_schedule ms on ms.movie_id = m.id " +
            "where co.user_id = ?1 " +
            "order by co.is_pay , ms.start_time desc ", countQuery ="select count(*) from customer_order as co join movie as m on co.movie_id = m.id join movie_schedule ms on ms.movie_id = m.id where co.user_id = ?1 ", nativeQuery = true)
    Page<OrderListResponse> getOrderByUserIdAndByPage(String userId, Pageable pageable);

}

