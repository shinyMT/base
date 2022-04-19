package com.thy.thy_base.result;

import java.io.Serializable;

/**
 * Author: thy
 * Date: 2022/4/19 14:51
 */
public class ErrorInfo implements Serializable {
    private static final long serialVersionUID = 7536136047115047417L;

    private int code;
    private String message;

    public ErrorInfo(int code, String message) {
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
