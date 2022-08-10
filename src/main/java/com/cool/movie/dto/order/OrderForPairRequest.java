package com.cool.movie.dto.order;

import lombok.Data;

@Data
public class OrderForPairRequest {
    private String userId;
    private String movieId;
    private String movieScheduleId;
    private String cinemaId;
    private String partnerId;

    public OrderForPairRequest(String userId, String movieId, String movieScheduleId, String cinemaId, String partnerId) {
        this.userId = userId;
        this.movieId = movieId;
        this.movieScheduleId = movieScheduleId;
        this.cinemaId = cinemaId;
        this.partnerId = partnerId;
    }

    public OrderForPairRequest() {
    }
}
