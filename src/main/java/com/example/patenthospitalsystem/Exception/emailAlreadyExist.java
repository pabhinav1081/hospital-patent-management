package com.example.patenthospitalsystem.Exception;

public class emailAlreadyExist extends RuntimeException {
    public emailAlreadyExist(String message) {
        super(message);
    }
}
