package com.example.springMongodb.Exception;

public class RestrictedInfoException extends Exception{
    @Override
    public String getMessage() {
        return "Classified information.....!";
    }
}
