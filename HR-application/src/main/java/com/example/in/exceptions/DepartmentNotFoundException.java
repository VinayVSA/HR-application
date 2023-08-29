package com.example.in.exceptions;

public class DepartmentNotFoundException extends RuntimeException{
    public DepartmentNotFoundException(String message)
    {
        super(message);
    }
}

