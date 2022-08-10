package com.cool.movie.dto.order;

import lombok.Data;

@Data
public class OrderRequest {
    private String userId;
    private String movieId;
    private String movieScheduleId;
    private String cinemaId;

    @Override
    public String toString() {
        return "OrderRequest{" +
                "userId='" + userId + '\'' +
                ", movieId='" + movieId + '\'' +
                ", movieScheduleId='" + movieScheduleId + '\'' +
                ", cinemaId='" + cinemaId + '\'' +
                '}';
    }

    public OrderRequest(String userId, String movieId, String movieScheduleId, String cinemaId) {
        this.userId = userId;
        this.movieId = movieId;
        this.movieScheduleId = movieScheduleId;
        this.cinemaId = cinemaId;
    }

    public OrderRequest() {
    }


}
