package com.cool.movie.dto;

public class OrderRequest {
    private String userId;
    private String movieId;
    private String movieScheduleId;
    private String cinemaId;

    public OrderRequest(String userId, String movieId, String movieScheduleId, String cinemaId) {
        this.userId = userId;
        this.movieId = movieId;
        this.movieScheduleId = movieScheduleId;
        this.cinemaId = cinemaId;
    }

    public OrderRequest() {
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public String getMovieScheduleId() {
        return movieScheduleId;
    }

    public void setMovieScheduleId(String movieScheduleId) {
        this.movieScheduleId = movieScheduleId;
    }

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }
}
