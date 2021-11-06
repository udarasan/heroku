package com.example.heroku.exception;

public class ValidateException extends RuntimeException{
    public ValidateException(String message) {
        super(message);
    }
}