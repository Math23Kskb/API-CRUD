package com.dio.devAPI2024.service.exception;

public class BusinessException  extends RuntimeException{

    private static final long   serialVersionUID = 1L;

    public BusinessException(String message) {
        super(message);
    }
}
