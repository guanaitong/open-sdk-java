/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
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

    private final String traceId;

    public HttpResponse(int code, byte[] body, String traceId) {
        this.code = code;
        this.body = body;
        this.text = new String(body);
        this.traceId = traceId;
    }

    public int getCode() {
        return code;
    }

    public byte[] getBody() {
        return body;
    }

    public String getText() {
        return text;
    }

    public String getTraceId() {
        return traceId;
    }
}
