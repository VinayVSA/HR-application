package com.example.in.exceptions;

public class JobNotFoundException extends RuntimeException{
    public JobNotFoundException(String message)
    {
        super(message);
    }
}
