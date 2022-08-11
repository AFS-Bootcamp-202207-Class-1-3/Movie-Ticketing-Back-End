package com.cool.movie.entity;


import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Data
public class Customer implements Serializable {

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
    private String customerPwd;

    public Customer() {
    }

    public Customer(String id, String realName, String nickName, String avatarUrl, Integer age, String gender, String phoneNumber, String city, String introduction, String customerPwd) {
        this.id = id;
        this.realName = realName;
        this.nickName = nickName;
        this.avatarUrl = avatarUrl;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.introduction = introduction;
        this.customerPwd = customerPwd;
    }
}

