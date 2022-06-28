/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.exception;

/**
 * @author Stanley Shen
 * @version 1.0.0
 * date 2017/12/18 20:04
 */
public class OpenSdkException extends RuntimeException {

    private int code = 0;
    private String msg = "client error";


    public OpenSdkException(int code, String msg) {
        this(String.format("business error, code-> %d , msg-> %s", code, msg));
        this.code = code;
        this.msg = msg;
    }

    public OpenSdkException(String message) {
        super(message);
    }

    public OpenSdkException(String message, Throwable cause) {
        super(message, cause);
    }

    public OpenSdkException(Throwable cause) {
        super(cause);
    }

    public int getCode() {
        return this.code;
    }

    public String getMsg() {
        return this.msg;
    }
}
