package com.thy.thy_base.result;


/**
 * Author: thy
 * Date: 2022/4/19 14:59
 */
public class AccessNotAllowedException extends GlobalException {
    private static final long serialVersionUID = -6129791318900413872L;

    public AccessNotAllowedException(String msg) {
        super(ErrorCode.NO_PERMISSION, msg);
    }
}
