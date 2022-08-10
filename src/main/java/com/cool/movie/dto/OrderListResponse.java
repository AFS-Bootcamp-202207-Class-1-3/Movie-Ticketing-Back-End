package com.cool.movie.dto;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import java.util.Date;

public interface OrderListResponse {
//    @Column(columnDefinition = "id")
//    private String id;
//    @Column(columnDefinition = "name")
//    private String name;
//    @Column(columnDefinition = "start_time")
//    private Date startTime;
//    @Column(columnDefinition = "price")
//    private Double price;
//    @Column(columnDefinition = "is_pay")
//    private Boolean isPay;

    int getId();
    String getName();
    @Column(columnDefinition = "start_time")
    Date getStartTime();
    Double getPrice();
    Boolean getIsPay();


}
