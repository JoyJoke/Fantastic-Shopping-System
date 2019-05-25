package com.zhf.shopping.exception;

public final class ResponseResultVO<T> {
    /**
     * @description 响应码
     */
    private int code;

    /**
     * @description 响应消息
     */
    private String message;


    /**
     * @description 数据
     */
    private Object data;

    public final int getCode() {
        return this.code;
    }

    public final void setCode(int code) {
        this.code = code;
    }

    public final String getMessage() {
        return this.message;
    }

    public final void setMessage(String message) {
        this.message = message;
    }


    public final Object getData() {
        return this.data;
    }

    public final void setData(Object data) {
        this.data = data;
    }

    public ResponseResultVO(int code, String message, Object data) {
        super();
        this.code = code;
        this.message = message;
        this.data = data;
    }

}