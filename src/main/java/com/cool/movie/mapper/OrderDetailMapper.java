package com.cool.movie.mapper;

import com.cool.movie.dto.OrderDetailResponse;
import com.cool.movie.entity.Customer;
import com.cool.movie.entity.CustomerOrder;
import com.cool.movie.entity.Movie;
import com.cool.movie.entity.MovieSchedule;
import org.springframework.stereotype.Component;

@Component
public class OrderDetailMapper {
    public OrderDetailResponse toResponse(CustomerOrder customerOrder, Customer customer, Movie movie, MovieSchedule movieSchedule) {
        OrderDetailResponse orderDetailResponse = new OrderDetailResponse();
        orderDetailResponse.setOrderId(customerOrder.getId());
        orderDetailResponse.setMovieName(movie.getName());
        orderDetailResponse.setPrice(customerOrder.getPrice());
        orderDetailResponse.setIsPay(customerOrder.getIsPay());
        orderDetailResponse.setUserName(customer.getNickName());
        orderDetailResponse.setMovieSchedule(movieSchedule.getStartTime().toString());
        orderDetailResponse.setSeatingArrangement(movieSchedule.getRoom());
        return orderDetailResponse;
    }
}
