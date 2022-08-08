package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.UUID;


@Entity
public class Pay implements Serializable {

    private static final long serialVersionUID = 544559011070675017L;


    @Id
    private String id;


    private String ordersIds;


    private Double totalPrice;


    private Integer status;


    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOrdersIds() {
        return ordersIds;
    }

    public void setOrdersIds(String ordersIds) {
        this.ordersIds = ordersIds;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

