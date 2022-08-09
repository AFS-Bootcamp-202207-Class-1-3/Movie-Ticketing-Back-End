package com.cool.movie.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="order_detail")
@Data
public class OrderDetail {
    @Id
    private String id;
    @Column(columnDefinition = "movie_name")
    private String movieName;
    @Column(columnDefinition = "movie_schedule")
    private String movieSchedule;
    @Column(columnDefinition = "room")
    private String room;
    @Column(columnDefinition = "seating")
    private String seating;
    @Column(columnDefinition = "is_pay")
    private Boolean isPay;
    @Column(columnDefinition = "price")
    private Double Price;
    @Column(columnDefinition = "user_name")
    private String userName;
}
