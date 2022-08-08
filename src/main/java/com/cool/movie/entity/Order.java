package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;



@Entity
public class Order implements Serializable {

    private static final long serialVersionUID = 177810964698268933L;



    @Id
    private String id;


    private String movieId;


    private Double price;


    private Boolean isPay;

    private String movieScheduleId;

    private Boolean hasUsed;

    private String ticketCode;

    private String userId;

}

