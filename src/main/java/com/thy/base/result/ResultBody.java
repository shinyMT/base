package com.thy.base.result;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Author: thy
 * Date: 2022/4/19 16:26
 */
public class ResultBody <T>{
    /**
     * 响应代码
     */
    @JsonProperty("code")
    private int code;

    /**
     * 响应消息
     */
    @JsonProperty("message")
    private String message;

    /**
     * 响应结果
     */
    @JsonProperty("result")
    private T result;

    public ResultBody(ErrorInfo errorInfo) {
        this.code = errorInfo.getCode();
        this.message = errorInfo.getMessage();
    }

    public ResultBody(T result) {
        this.code = ErrorInfoEnum.SUCCESS.getCode();
        this.message = ErrorInfoEnum.SUCCESS.getMessage();
        this.result = result;
    }

    public ResultBody(int code, String msg, T result) {
        this.code = code;
        this.message = msg;
        this.result = result;
    }

    public static ResultBody<String> success() {
        return new ResultBody<>(ErrorInfoEnum.SUCCESS.getMessage());
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

    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
    }

}
