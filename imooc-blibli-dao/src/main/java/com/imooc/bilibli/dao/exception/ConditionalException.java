package com.imooc.bilibli.dao.exception;

public class ConditionalException extends RuntimeException {

    private int code;

    ConditionalException(int code, String name) {
        super(name);
        this.code = code;

    }

    ConditionalException(String name) {
        super(name);
        this.code = 500;

    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
