package com.cool.movie.exception;

public class NotAvailablePositionException extends RuntimeException{
    @Override
    public String getMessage() {
        return "Not available position!";
    }
}
