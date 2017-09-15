package com.gat.open.sdk.api;

import com.gat.open.sdk.annotation.Valid;
import com.gat.open.sdk.annotation.ValidGroup;
import com.gat.open.sdk.model.ApiResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 帮助接口
 * Created by xin.hua on 2017/7/19.
 */
public interface HelperApi {

    @FormUrlEncoded
    @POST("helper/app/secretInfo/check")
    @ValidGroup({@Valid(index = 0, required = true)})
    Call<ApiResponse<String>> checkApp(@Field("appid") String appid);
}
