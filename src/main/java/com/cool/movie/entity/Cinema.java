package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
public class Cinema implements Serializable {

    private static final long serialVersionUID = -50881050821715426L;


    @Id
    private String id;


    private String name;


    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

