package com.cool.movie.dto;

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

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

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
