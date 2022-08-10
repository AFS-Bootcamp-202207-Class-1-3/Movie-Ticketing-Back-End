package com.cool.movie.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
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

}

