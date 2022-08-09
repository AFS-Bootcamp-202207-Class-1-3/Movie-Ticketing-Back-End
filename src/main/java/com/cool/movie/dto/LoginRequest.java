package com.cool.movie.dto;

public class LoginRequest {
    private String realName;
    private String password;

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public LoginRequest(String realName, String password) {
        this.realName = realName;
        this.password = password;
    }

    public LoginRequest() {
    }
}
