package com.thy.base.result;

/**
 * Author: thy
 * Date: 2022/4/19 16:29
 */
public class GlobalException extends RuntimeException{
    protected static final long serialVersionUID = -5119568209020174904L;

    protected final ErrorInfo errorInfo;

    public GlobalException(ErrorInfo errorInfo) {
        this.errorInfo = errorInfo;
    }

    public GlobalException(int code, String msg) {
        this(new ErrorInfo(code,msg));
    }

    public GlobalException(String msg) {
        this(ErrorInfoEnum.UNKNOWN.getCode(), msg);
    }

    public ErrorInfo getErrorInfo() {
        return errorInfo;
    }

}
