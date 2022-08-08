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

}

