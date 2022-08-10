package com.cool.movie.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="bill")
@Data
public class Bill {
    @Id
    private String id;
    @Column(columnDefinition = "movie_name")
    private String movieName;
    @Column(columnDefinition = "ticket_code")
    private String ticketCode;
    @Column(columnDefinition = "cinema_name")
    private String cinemaName;
    @Column(columnDefinition = "movie_schedule")
    private String movieSchedule;
    @Column(columnDefinition = "room")
    private String room;
    @Column(columnDefinition = "seating")
    private String seating;
    @Column(columnDefinition = "price")
    private Double price;
    @Column(columnDefinition = "partner_name")
    private String partnerName;
    @Column(columnDefinition = "partner_gender")
    private String partnerGender;
    @Column(columnDefinition = "partner_telephone")
    private String partnerTelephone;

    public Bill() {
    }

    public Bill(String id, String movieName, String ticketCode, String cinemaName, String movieSchedule, String room, String seating, Double price, String partnerName, String partnerGender, String partnerTelephone) {
        this.id = id;
        this.movieName = movieName;
        this.ticketCode = ticketCode;
        this.cinemaName = cinemaName;
        this.movieSchedule = movieSchedule;
        this.room = room;
        this.seating = seating;
        this.price = price;
        this.partnerName = partnerName;
        this.partnerGender = partnerGender;
        this.partnerTelephone = partnerTelephone;
    }
}
