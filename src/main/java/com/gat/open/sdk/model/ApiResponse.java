/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model;

/**
 * Created by August.Zhou on 2022/6/27 12:34
 */
public class ApiResponse<T> {
    private int code;

    private String msg;

    private T data;


    public ApiResponse() {
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "ApiResponse{" + "code=" + code + ", msg='" + msg + '\'' + ", data=" + data + '}';
    }

}
