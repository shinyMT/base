package com.thy.base.result;

import java.io.Serializable;

/**
 * Author: thy
 * Date: 2022/4/19 16:27
 */
public class ErrorInfo implements Serializable {
    private static final long serialVersionUID = 4685199240511200051L;

    private int code;
    private String message;

    public ErrorInfo(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return this.code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

}
