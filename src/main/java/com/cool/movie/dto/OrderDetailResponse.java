package com.cool.movie.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class OrderDetailResponse {
    private String orderId;
    private String movieName;
    private String movieSchedule;
    private String seatingArrangement;
    private Boolean isPay;
    private Double Price;
    private String userName;

    public OrderDetailResponse() {
    }

}
