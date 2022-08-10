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
    }
}
