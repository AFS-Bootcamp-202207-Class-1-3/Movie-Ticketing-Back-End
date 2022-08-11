package com.cool.movie.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;


@Entity
@Data
public class MovieSchedule implements Serializable {

    private static final long serialVersionUID = 140755435576497910L;

    @Id
    private String id;
    private String cinemaId;
    private String movieId;
    private Timestamp startTime;
    private Integer capacity;
    private Integer availablePosition;
    private Double price;
    private String room;

    public MovieSchedule(String id, String cinemaId, String movieId, Timestamp startTime, Integer capacity, Integer availablePosition, Double price, String room) {
        this.id = id;
        this.cinemaId = cinemaId;
        this.movieId = movieId;
        this.startTime = startTime;
        this.capacity = capacity;
        this.availablePosition = availablePosition;
        this.price = price;
        this.room = room;
    }

    public MovieSchedule() {
    }
}

