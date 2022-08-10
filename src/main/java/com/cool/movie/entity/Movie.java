package com.cool.movie.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Entity
@Data
public class Movie implements Serializable {

    private static final long serialVersionUID = 453243192035227036L;

    public Movie(String id, String name, String introduction, Date releaseTime, Integer duration, String types, String postUrl) {
        this.id = id;
        this.name = name;
        this.introduction = introduction;
        this.releaseTime = releaseTime;
        this.duration = duration;
        this.types = types;
        this.postUrl = postUrl;
    }

    public Movie() {
    }

    @Id
    private String id;


    private String name;


    private String introduction;


    private Date releaseTime;

    private Integer duration;

    private String types;

    private String postUrl;

}

