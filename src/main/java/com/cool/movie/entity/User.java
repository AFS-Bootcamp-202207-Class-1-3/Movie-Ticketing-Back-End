package com.cool.movie.entity;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;



@Entity
public class User implements Serializable {

    private static final long serialVersionUID = -41363684177248129L;


    @Id
    private String id;


    private String realName;


    private String nickName;


    private String avatarUrl;


    private Integer age;


    private String gender;


    private String phoneNumber;


    private String city;


    private String introduction;

}

