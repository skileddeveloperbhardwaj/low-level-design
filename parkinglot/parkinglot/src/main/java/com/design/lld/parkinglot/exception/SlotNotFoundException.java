package com.design.lld.parkinglot.exception;

public class SlotNotFoundException extends RuntimeException{
    public SlotNotFoundException(String msg) {
        super(msg);
    }
}
