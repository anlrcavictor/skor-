package com.example.skor.segment.validation.exception;

import com.example.skor.base.exception.UserCaseException;

public class UnSuitableIdException extends UserCaseException {
    public UnSuitableIdException(String message) {
        super(message);
    }
}
