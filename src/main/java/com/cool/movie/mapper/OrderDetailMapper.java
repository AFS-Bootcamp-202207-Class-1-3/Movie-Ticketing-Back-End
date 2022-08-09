package com.cool.movie.mapper;

import com.cool.movie.dto.OrderDetailResponse;
import com.cool.movie.entity.*;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
public class OrderDetailMapper {
    public OrderDetailResponse toResponse(OrderDetail orderDetail) {
        return OrderDetailResponse.builder()
                .orderId(orderDetail.getId())
                .movieName(orderDetail.getMovieName())
                .movieSchedule(orderDetail.getMovieSchedule())
                .seatingArrangement(orderDetail.getRoom())
                .isPay(orderDetail.getIsPay())
                .Price(orderDetail.getPrice())
                .userName(orderDetail.getUserName())
                .build();
//        OrderDetailResponse orderDetailResponse = new OrderDetailResponse();
//        orderDetailResponse.setOrderId(customerOrder.getId());
//        orderDetailResponse.setMovieName(movie.getName());
//        orderDetailResponse.setPrice(customerOrder.getPrice());
//        orderDetailResponse.setPay(customerOrder.getPay());
//        orderDetailResponse.setUserName(customer.getNickName());
//        orderDetailResponse.setMovieSchedule(movieSchedule.getStartTime().toString());
//        orderDetailResponse.setSeatingArrangement(movieSchedule.getRoom());
//        return orderDetailResponse;
    }
}
