package com.design.lld.parkinglot.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SlotNotFoundException extends RuntimeException{
    public SlotNotFoundException(String msg) {
        super(msg);
    }
}
