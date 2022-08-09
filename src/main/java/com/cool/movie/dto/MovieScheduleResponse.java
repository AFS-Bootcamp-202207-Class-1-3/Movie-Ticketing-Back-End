package com.cool.movie.dto;

import java.util.Date;

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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}
