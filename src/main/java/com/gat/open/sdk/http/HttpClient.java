/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.http;

/**
 * Created by August.Zhou on 2025/6/13 21:58
 */
public interface HttpClient {

    void config(int connectTimeOut, int readTimeout);

    HttpResponse doReq(HttpRequest httpRequest);
}
