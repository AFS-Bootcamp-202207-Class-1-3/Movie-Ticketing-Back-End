package com.cool.movie.repository;


import com.cool.movie.dto.OrderRequest;
import com.cool.movie.entity.CustomerOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface OrderRepository extends JpaRepository<CustomerOrder, String> {
//    @Query(value = "select * from customer_order where movie_schedule_id = '?1' and cinema_id = '?2' and user_id = '?3'" , nativeQuery = true)
//    CustomerOrder getSameViewingTime(String movieSchedule,String cinemaId,String userId);

    CustomerOrder getCustomerOrderByMovieScheduleIdAndCinemaIdAndUserId(String movieScheduleId,String cinemaId,String uerId);
}

