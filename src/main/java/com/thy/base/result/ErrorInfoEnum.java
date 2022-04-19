package com.thy.base.result;

/**
 * Author: thy
 * Date: 2022/4/19 16:27
 */
public enum ErrorInfoEnum {
    SUCCESS(ErrorCode.SUCCESS, "success"), UNKNOWN(ErrorCode.UNKNOWN, "unknown exception");

    private int code;

    private String message;

    ErrorInfoEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

}
