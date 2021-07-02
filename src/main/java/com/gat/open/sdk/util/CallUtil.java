/*
 * Copyright 2007-2021, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.util;


import com.gat.open.sdk.exception.GATException;
import com.gat.open.sdk.model.ApiResponse;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * 捕获Call 执行异常
 *
 * @author xin.hua
 * date 2017/7/18
 */
public class CallUtil {

    private CallUtil() {
        // hide constructor
    }

    public static <T> ApiResponse<T> execute(Call<ApiResponse<T>> call) {
        Response<ApiResponse<T>> response;
        try {
            response = call.execute();
        } catch (IOException e) {
            throw new GATException(e);
        }
        if (!response.isSuccessful()) {
            throw new GATException("请求网络失败！" + response.toString());
        }
        ApiResponse<T> body = response.body();
        if (body == null) {
            throw new GATException("response 转换失败" + response.toString());
        }
        return body;
    }

}
