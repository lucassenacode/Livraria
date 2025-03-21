package com.example.livraria.controllers.exception;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.example.livraria.services.exception.EntityNotFound;

import jakarta.servlet.http.HttpServletRequest;

@RestControllerAdvice
public class ExceptionController {

    @ExceptionHandler(EntityNotFound.class)
    public ResponseEntity<ErrorResponse> notFound(EntityNotFound e, HttpServletRequest request) {
        String error = "Not Found";
        HttpStatus status = HttpStatus.NOT_FOUND;
        ErrorResponse err = new ErrorResponse(Instant.now(), status.value(), error, e.getMessage(), request.getRequestURI());
        return ResponseEntity.status(status).body(err);
    }
}