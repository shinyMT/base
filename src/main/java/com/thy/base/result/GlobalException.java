package com.thy.thy_base.result;

import java.io.Serializable;

/**
 * Author: thy
 * Date: 2022/4/19 15:00
 */
public class GlobalException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = -2143401963514482926L;
    protected final ErrorInfo errorInfo;

    public GlobalException(ErrorInfo errorInfo){
        this.errorInfo = errorInfo;
    }

    public GlobalException(int code, String msg){
        this(new ErrorInfo(code, msg));
    }

    public GlobalException(String msg){
        this(ErrorInfoEnum.UNKNOWN.getCode(), msg);
    }

    public ErrorInfo getErrorInfo(){
        return errorInfo;
    }
}
