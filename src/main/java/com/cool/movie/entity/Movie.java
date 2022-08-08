package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;



@Entity
public class Movie implements Serializable {

    private static final long serialVersionUID = 453243192035227036L;



    @Id
    private String id;


    private String name;


    private String introduction;


    private Object releaseTime;

    private Integer duration;

    private String types;

    private String postUrl;

}

