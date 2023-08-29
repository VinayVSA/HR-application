package com.example.in.exceptions;

public class RegionNotFoundException extends RuntimeException{

    public RegionNotFoundException(String message)
    {
        super(message);
    }
}
