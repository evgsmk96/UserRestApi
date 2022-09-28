package com.example.userrestapi.Exepction;

public class UserNotFound extends Exception{
    public UserNotFound(String message){
        super(message);
    }
}
