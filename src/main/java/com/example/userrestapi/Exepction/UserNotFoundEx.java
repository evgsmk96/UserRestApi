package com.example.userrestapi.Exepction;

public class UserNotFoundEx extends Exception{
    public UserNotFoundEx (String message){
        super(message);
    }
}
