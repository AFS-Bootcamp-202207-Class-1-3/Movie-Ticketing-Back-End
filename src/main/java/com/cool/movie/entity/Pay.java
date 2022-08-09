package com.cool.movie.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Data
public class Pay implements Serializable {

    private static final long serialVersionUID = 544559011070675017L;


    @Id
    private String id;


    private String ordersIds;


    private Double totalPrice;


    private Integer status;

}

