package com.cool.movie.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Data
public class MovieType implements Serializable {

    private static final long serialVersionUID = 652292350566812320L;


    @Id
    private String id;


    private String type;


    private String userId;

}

