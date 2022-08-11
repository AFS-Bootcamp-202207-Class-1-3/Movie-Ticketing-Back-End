package com.cool.movie.dto.movieschedule;

import lombok.Data;

import java.sql.Timestamp;

@Data
public class MovieScheduleResponse {
    private String id;
    private String cinemaId;
    private String startTime;

    public MovieScheduleResponse() {
    }

    public MovieScheduleResponse(String id, String cinemaId, String startTime) {
        this.id = id;
        this.cinemaId = cinemaId;
        this.startTime = startTime;
    }

}
