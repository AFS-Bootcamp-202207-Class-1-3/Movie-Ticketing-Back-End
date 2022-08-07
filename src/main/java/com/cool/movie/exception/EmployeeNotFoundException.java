package com.cool.movie.exception;

public class EmployeeNotFoundException extends RuntimeException {
    private final String message;

    public EmployeeNotFoundException(String message) {

        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
