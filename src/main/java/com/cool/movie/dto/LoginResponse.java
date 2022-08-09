package com.cool.movie.dto;

public class LoginResponse {
    private Integer code;
    private String message;

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

    public LoginResponse(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public LoginResponse() {
    }
}
