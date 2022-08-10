package com.cool.movie.dto;

import lombok.Data;

import java.util.Date;

@Data
public class MovieScheduleResponse {
    private String id;
    private String cinemaId;
    private Date startTime;

    public MovieScheduleResponse() {
    }

    public MovieScheduleResponse(String id, String cinemaId, Date startTime) {
        this.id = id;
        this.cinemaId = cinemaId;
        this.startTime = startTime;
    }

}
