package com.cool.movie.dto;

import lombok.Data;

@Data
public class LoginResponse {
    private Integer code;
    private String message;

    private String userId;

    private String realName;


    private String nickName;


    private String avatarUrl;


    private Integer age;


    private String gender;


    private String phoneNumber;


    private String city;


    private String introduction;



    public LoginResponse(Integer code, String message, String userId, String realName, String nickName, String avatarUrl, Integer age, String gender, String phoneNumber, String city, String introduction) {
        this.code = code;
        this.message = message;
        this.userId = userId;
        this.realName = realName;
        this.nickName = nickName;
        this.avatarUrl = avatarUrl;
        this.age = age;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.city = city;
        this.introduction = introduction;
    }

    public LoginResponse() {
    }

    public LoginResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
