package com.cool.movie.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Data
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



}