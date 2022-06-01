package com.odebar.exceptions.dmdev;

public class CustomException extends RuntimeException {

    public CustomException(String message) {
        super(message);
    }

    public CustomException(Throwable cause) {
        super(cause);
    }
}
