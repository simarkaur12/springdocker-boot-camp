package com.harskaur.bookclientservice.Exception;

import lombok.Data;

@Data
public class ErrorResponse {
    private String message;
    private String code;
}