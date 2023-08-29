package com.example.in.exceptions;

public class ValidationFailedException extends RuntimeException{
    public ValidationFailedException(String message)
    {
        super(message);
    }
}
