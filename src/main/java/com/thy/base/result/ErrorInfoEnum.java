package com.thy.thy_base.result;

/**
 * Author: thy
 * Date: 2022/4/19 14:53
 * 错误代码枚举类
 */
public enum ErrorInfoEnum {
    SUCCESS(ErrorCode.SUCCESS, "success"),
    UNKNOWN(ErrorCode.UNKNOWN, "unknown exception");

    private int code;
    private String message;

    ErrorInfoEnum(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
