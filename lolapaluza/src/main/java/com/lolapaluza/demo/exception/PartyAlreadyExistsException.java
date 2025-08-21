package com.lolapaluza.demo.exception;

public class PartyAlreadyExistsException extends RuntimeException {
    public PartyAlreadyExistsException(String message) {
        super(message);
    }

    public PartyAlreadyExistsException(String message, Throwable cause) {
        super(message, cause);
    }
}