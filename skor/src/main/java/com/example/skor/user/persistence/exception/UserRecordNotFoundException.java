package com.example.skor.user.persistence.exception;

public class UserRecordNotFoundException extends RuntimeException {
    public UserRecordNotFoundException(String message) {
        super(message);
    }
}
