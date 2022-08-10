package com.cool.movie.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Data
public class Pair implements Serializable {

    private static final long serialVersionUID = 427075234961060497L;


    @Id
    private String id;


    private String userId;


    private String partnerId;

    private String movieScheduleId;

    public Pair(String id, String userId, String partnerId, String movieScheduleId) {
        this.id = id;
        this.userId = userId;
        this.partnerId = partnerId;
        this.movieScheduleId = movieScheduleId;
    }

    public Pair() {
    }
}

