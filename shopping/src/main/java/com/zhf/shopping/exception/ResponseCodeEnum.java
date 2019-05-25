package com.zhf.shopping.exception;

public enum ResponseCodeEnum {
    // 系统通用
    SUCCESS(200, "操作成功"),

    UNLOGIN_ERROR(233, "没有登录"),

    OPERATE_FAIL(666, "操作失败"),

    // 用户
    SAVE_USER_INFO_FAILED(2001, "保存用户信息失败");


    private Integer code;
    private String message;

    ResponseCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public final Integer getCode() {
        return this.code;
    }

    public final String getMessage() {
        return this.message;
    }

}