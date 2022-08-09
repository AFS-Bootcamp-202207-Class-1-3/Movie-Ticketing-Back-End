package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class CustomerOrder implements Serializable {

    private static final long serialVersionUID = 177810964698268933L;
    @Id
    private String id;

    private String movieId;

    private Double price;

    private String cinemaId;

    private Boolean isPay;

    private String movieScheduleId;

    private Boolean hasUsed;

    private String ticketCode;

    private String userId;

    public CustomerOrder(String id, String movieId, Double price, String cinemaId, Boolean isPay, String movieScheduleId, Boolean hasUsed, String ticketCode, String userId) {
        this.id = id;
        this.movieId = movieId;
        this.price = price;
        this.cinemaId = cinemaId;
        this.isPay = isPay;
        this.movieScheduleId = movieScheduleId;
        this.hasUsed = hasUsed;
        this.ticketCode = ticketCode;
        this.userId = userId;
    }

    public CustomerOrder(String id, String movieId, Double price, Boolean isPay, String movieScheduleId,
                         Boolean hasUsed, String ticketCode, String userId) {
        this.id = id;
        this.movieId = movieId;
        this.price = price;
        this.isPay = isPay;
        this.movieScheduleId = movieScheduleId;
        this.hasUsed = hasUsed;
        this.ticketCode = ticketCode;
        this.userId = userId;
    }

    public CustomerOrder() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMovieId() {
        return movieId;
    }

    public void setMovieId(String movieId) {
        this.movieId = movieId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Boolean getPay() {
        return isPay;
    }

    public void setPay(Boolean pay) {
        isPay = pay;
    }

    public String getMovieScheduleId() {
        return movieScheduleId;
    }

    public void setMovieScheduleId(String movieScheduleId) {
        this.movieScheduleId = movieScheduleId;
    }

    public Boolean getHasUsed() {
        return hasUsed;
    }

    public void setHasUsed(Boolean hasUsed) {
        this.hasUsed = hasUsed;
    }

    public String getTicketCode() {
        return ticketCode;
    }

    public void setTicketCode(String ticketCode) {
        this.ticketCode = ticketCode;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }
}