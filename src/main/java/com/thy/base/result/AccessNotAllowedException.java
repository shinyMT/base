package com.thy.base.result;

/**
 * Author: thy
 * Date: 2022/4/19 16:30
 */
public class AccessNotAllowedException extends GlobalException{
    private static final long serialVersionUID = 687575028073400498L;

    public AccessNotAllowedException(String msg) {
        super(ErrorCode.NO_PERMISSION, msg);
    }

}
