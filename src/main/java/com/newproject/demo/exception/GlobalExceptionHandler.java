package com.newproject.demo.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler extends RuntimeException{

    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ResponseEntity<Error> handleHttpServerErrorException(HttpRequestMethodNotSupportedException e) {
        Error error = new Error(e.getMessage(), HttpStatus.METHOD_NOT_ALLOWED);
        log.info("HttpServerErrorException is cauth and find the error : {}", error);
        return new ResponseEntity<>(error, error.getStatusCode());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<Error> internalHttpServerErrorException(Exception e) {
        Error error = new Error(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        log.info("Exception is cauth and find the error : {}", error);
        return new ResponseEntity<>(error, error.getStatusCode());
    }
}