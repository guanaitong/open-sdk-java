/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.http;

/**
 * Created by August.Zhou on 2022/6/24 22:09
 */
public class HttpResponse {
    private final int code;
    private final byte[] body;

    private final String text;

    public HttpResponse(int code, byte[] body) {
        this.code = code;
        this.body = body;
        this.text = new String(body);
    }

    public int getCode() {
        return code;
    }

    public byte[] getBody() {
        return body;
    }


}
