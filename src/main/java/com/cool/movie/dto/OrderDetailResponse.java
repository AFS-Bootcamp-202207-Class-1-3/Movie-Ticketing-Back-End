package com.cool.movie.dto;

public class OrderDetailResponse {
    private String orderId;
    private String movieName;
    private String movieSchedule;
    private String seatingArrangement;
    private Boolean isPay;
    private Double Price;
    private String userName;

    public OrderDetailResponse() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieSchedule() {
        return movieSchedule;
    }

    public void setMovieSchedule(String movieSchedule) {
        this.movieSchedule = movieSchedule;
    }

    public String getSeatingArrangement() {
        return seatingArrangement;
    }

    public void setSeatingArrangement(String seatingArrangement) {
        this.seatingArrangement = seatingArrangement;
    }

    public Boolean getPay() {
        return isPay;
    }

    public void setPay(Boolean pay) {
        isPay = pay;
    }

    public Double getPrice() {
        return Price;
    }

    public void setPrice(Double price) {
        Price = price;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
