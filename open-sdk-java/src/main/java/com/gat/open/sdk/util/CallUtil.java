package com.gat.open.sdk.util;

import com.gat.open.sdk.exception.GATException;
import com.gat.open.sdk.model.ApiResponse;
import retrofit2.Call;
import retrofit2.Response;

import java.io.IOException;

/**
 * 捕获Call 执行异常
 * Created by xin.hua on 2017/7/18.
 */
public class CallUtil {

    public static <T> ApiResponse<T> execute(Call<ApiResponse<T>> call){
        Response<ApiResponse<T>> response = null;
        try {
            response = call.execute();
        } catch (IOException e) {
            e.printStackTrace();
            throw new GATException(e);
        }
        if (!response.isSuccessful())
            throw new GATException("请求网络失败！"+response.toString());
        ApiResponse<T> body = response.body();
        if (body == null)
            throw new GATException("response 转换失败"+response.toString());
        return body;
    }
}
