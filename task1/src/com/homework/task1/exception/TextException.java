package com.homework.task1.exception;

import java.util.ArrayList;

public class TextException extends Exception{

    public TextException() {

    }

    public TextException(String message)
    {
        super(message);
    }

    public TextException(String message, Throwable cause) {

        super(message, cause);
    }

    public TextException(Throwable cause) {
        super(cause);
    }

    public TextException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
