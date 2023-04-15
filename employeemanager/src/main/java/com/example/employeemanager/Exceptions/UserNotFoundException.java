package com.example.employeemanager.Exceptions;

public class UserNotFoundException extends  RuntimeException {
    public UserNotFoundException(String s) {
        super(s);
    }
}
