package com.example.livraria.services.exception;

public class EntityNotFound extends RuntimeException{

    public EntityNotFound(String msg)
    {
        super(msg);
    }
}
