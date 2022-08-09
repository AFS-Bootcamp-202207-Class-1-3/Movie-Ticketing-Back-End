package com.cool.movie.enums;

public enum LoginCode {
    SUCCESS(200, "success"),
    FAILED(500, "fail");

    private final Integer code;
    private final String message;

    private LoginCode(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
