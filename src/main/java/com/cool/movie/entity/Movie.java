package com.cool.movie.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;


@Entity
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getPostUrl() {
        return postUrl;
    }

    public void setPostUrl(String postUrl) {
        this.postUrl = postUrl;
    }
}

