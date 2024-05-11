package com.harskaur.simplecrud.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Global exception handler for handling RuntimeExceptions.
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

    /**
     * Handles RuntimeExceptions and returns a <code>ResponseEntity</code> with an <code>ErrorResponse</code>.
     *
     * @param ex The RuntimeException that was caught
     * @return <code>ResponseEntity</code> containing an <code>ErrorResponse</code> with the error code and description
     */
    @ExceptionHandler(value = RuntimeException.class)
    public ResponseEntity<ErrorResponse> catchRuntimeException(RuntimeException ex){
        ErrorResponse errorResponse = new ErrorResponse();
        errorResponse.setCode(HttpStatus.BAD_REQUEST.toString());
        errorResponse.setMessage(ex.getMessage());
        return new ResponseEntity<>(errorResponse, HttpStatus.BAD_REQUEST);
    }
}
