package com.cool.movie.dto.login;

import lombok.Data;

@Data
public class LoginRequest {
    private String realName;
    private String password;

    public LoginRequest(String realName, String password) {
        this.realName = realName;
        this.password = password;
    }

    public LoginRequest() {
    }
}
