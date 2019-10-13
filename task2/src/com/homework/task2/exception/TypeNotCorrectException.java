package com.homework.task2.exception;

public class TypeNotCorrectException extends RuntimeException {
    public TypeNotCorrectException() {
    }

    public TypeNotCorrectException(String message) {
        super(message);
    }

    public TypeNotCorrectException(String message, Throwable cause) {
        super(message, cause);
    }

    public TypeNotCorrectException(Throwable cause) {
        super(cause);
    }

    public TypeNotCorrectException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
