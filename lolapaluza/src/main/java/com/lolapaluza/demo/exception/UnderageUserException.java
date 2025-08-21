package com.lolapaluza.demo.exception;

public class UnderageUserException extends RuntimeException {
    public UnderageUserException(String message) {
        super(message);
    }

    public UnderageUserException(String message, Throwable cause) {
        super(message, cause);
    }
}
