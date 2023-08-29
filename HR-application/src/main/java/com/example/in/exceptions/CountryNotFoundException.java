package com.example.in.exceptions;

public class CountryNotFoundException extends RuntimeException{
    public CountryNotFoundException(String message)
    {
        super(message);
    }

}
