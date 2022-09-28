package com.example.userrestapi.Exepction;

public class UserAlreadyExistEx extends Exception{
    public UserAlreadyExistEx (String message) {
        super(message);
    }
}
