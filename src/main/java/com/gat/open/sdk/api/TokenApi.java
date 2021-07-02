/*
 * Copyright 2007-2021, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.api;


import com.gat.open.sdk.annotation.Valid;
import com.gat.open.sdk.annotation.ValidGroup;
import com.gat.open.sdk.model.ApiResponse;
import com.gat.open.sdk.model.Token;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * token 接口
 *
 * @author xin.hua
 * date 2017/7/19
 */
public interface TokenApi {

    @FormUrlEncoded
    @POST("token/create")
    @ValidGroup({@Valid(index = 0, required = true)})
    Call<ApiResponse<Token>> createToken(@Field("appid") String appid);

    @FormUrlEncoded
    @POST("token/getTokenInfo")
    @ValidGroup({
            @Valid(index = 0, length = 32, required = true),
            @Valid(index = 1, required = true)})
    Call<ApiResponse<Token>> getTokenInfo(@Field("access_token") String accessToken,
                                          @Field("appid") String appid);

}
