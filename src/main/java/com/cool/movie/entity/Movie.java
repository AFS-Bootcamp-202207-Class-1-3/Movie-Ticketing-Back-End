package com.cool.movie.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Entity
public class Movie implements Serializable {

    private static final long serialVersionUID = 453243192035227036L;



    @Id
    private String id;


    private String name;


    private String introduction;


    private Date releaseTime;

    private Integer duration;

    private String types;

    private String postUrl;

}

