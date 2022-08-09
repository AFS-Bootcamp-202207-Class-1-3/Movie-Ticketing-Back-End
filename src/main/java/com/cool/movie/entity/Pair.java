package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Pair implements Serializable {

    private static final long serialVersionUID = 427075234961060497L;


    @Id
    private String id;


    private String userId;


    private String partnerId;

    private String movieScheduleId;


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPartnerId() {
        return partnerId;
    }

    public void setPartnerId(String partnerId) {
        this.partnerId = partnerId;
    }

    public String getMovieScheduleId() {
        return movieScheduleId;
    }

    public void setMovieScheduleId(String movieScheduleId) {
        this.movieScheduleId = movieScheduleId;
    }
}

