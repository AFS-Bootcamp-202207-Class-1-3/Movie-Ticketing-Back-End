package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Entity
public class MovieSchedule implements Serializable {

    private static final long serialVersionUID = 140755435576497910L;



    @Id
    private String id;


    private String cinemaId;


    private String movieId;


    private Date startTime;


    private Integer capacity;


    private Integer availablePosition;


    private Double price;

    private String room;

    public String getCinemaId() {
        return cinemaId;
    }

    public void setCinemaId(String cinemaId) {
        this.cinemaId = cinemaId;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }
}

