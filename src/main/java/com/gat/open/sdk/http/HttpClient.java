/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.http;

import com.gat.open.sdk.exception.OpenSdkException;
import com.gat.open.sdk.util.Constants;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;

/**
 * Created by August.Zhou on 2022/6/24 21:58
 */
public class HttpClient {

    private int connectTimeout = 10_000;
    private int readTimeout = 60_000;


    public HttpClient() {

    }

    public void config(int connectTimeOut, int readTimeout) {
        this.connectTimeout = connectTimeOut;
        this.readTimeout = readTimeout;
    }

    public HttpResponse doReq(HttpRequest httpRequest) {
        try {
            return doReq0(httpRequest);
        } catch (IOException exception) {
            throw new OpenSdkException("net error", exception);
        }
    }

    private HttpResponse doReq0(HttpRequest httpRequest) throws IOException {
        URL url = new URL(httpRequest.getUrl());
        HttpURLConnection conn = (HttpURLConnection) url.openConnection();
        conn.setRequestMethod(httpRequest.getMethod());
        if ("POST".equals(httpRequest.getMethod()) || "PUT".equals(httpRequest.getMethod())) {
            conn.setRequestProperty("Content-Type", httpRequest.getContentType());
        }
        conn.setRequestProperty("Accept", "*/*");
        conn.setRequestProperty("User-Agent", Constants.USER_AGENT);
        conn.setReadTimeout(readTimeout);
        conn.setConnectTimeout(connectTimeout);
        if (httpRequest.getBody() != null && httpRequest.getBody().length() > 0) {
            if ("POST".equals(httpRequest.getMethod()) || "PUT".equals(httpRequest.getMethod())) {
                conn.setDoOutput(true);
                try (OutputStream outputStream = conn.getOutputStream()) {
                    outputStream.write(httpRequest.getBody().getBytes(StandardCharsets.UTF_8));
                }
            }
        }
        try {
            conn.connect();
            int responseCode = conn.getResponseCode();
            return new HttpResponse(responseCode, readAllBytes(conn.getInputStream()));
        } finally {
            conn.disconnect();
        }
    }

    private static byte[] readAllBytes(InputStream inputStream) throws IOException {
        final int bufLen = 4 * 0x400; // 4KB
        byte[] buf = new byte[bufLen];
        int readLen;
        IOException exception = null;
        try {
            try (ByteArrayOutputStream outputStream = new ByteArrayOutputStream()) {
                while ((readLen = inputStream.read(buf, 0, bufLen)) != -1) outputStream.write(buf, 0, readLen);
                return outputStream.toByteArray();
            }
        } catch (IOException e) {
            exception = e;
            throw e;
        } finally {
            if (exception == null) inputStream.close();
            else try {
                inputStream.close();
            } catch (IOException e) {
                exception.addSuppressed(e);
            }
        }
    }
}
