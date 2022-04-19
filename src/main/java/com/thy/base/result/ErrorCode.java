package com.thy.base.result;

/**
 * Author: thy
 * Date: 2022/4/19 16:28
 * 错误代码类
 */
public class ErrorCode {
    private ErrorCode() {
    }

    // 成功
    public static final int SUCCESS = 0;

    // 未知错误
    public static final int UNKNOWN = -1;

    /**
     * ============APP相关问题==================
     */
    // APP版本过旧
    public static final int APP_VERSION_LOW = -200;

    /**
     * ============登录相关问题==================
     */
    // (警告)普通登录警告
    public static final int LOGIN_COMMON_WARN = 300;
    // (警告)需要重设密码
    public static final int LOGIN_RESET_PW_REQUIRED = 302;
    // 帐号密码错误
    public static final int LOGIN_PW_ERR = -303;
    // 账户停用
    public static final int LOGIN_ACCOUNT_DISABLED = -304;

    /**
     * ============访问权限相关问题==================
     */
    // 没有权限
    public static final int NO_PERMISSION = -400;
    // token无效
    public static final int TOKEN_INVALID = -401;

    /**
     * ============功能模块相关问题==================
     */
    // 功能维护中
    public static final int FUNC_MAINTAINED = -500;
    // 功能停用
    public static final int FUNC_DEPRECATED = -501;

}
