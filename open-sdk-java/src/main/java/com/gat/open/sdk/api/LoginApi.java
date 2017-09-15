package com.gat.open.sdk.api;

import com.gat.open.sdk.annotation.Valid;
import com.gat.open.sdk.annotation.ValidGroup;
import com.gat.open.sdk.constant.GATOpenConstant;
import com.gat.open.sdk.model.ApiResponse;
import retrofit2.Call;
import retrofit2.http.*;

/**
 * 登陆接口
 * Created by xin.hua on 2017/7/19.
 */
public interface LoginApi {

    @FormUrlEncoded
    @POST("sso/employee/getAuthCodeByMobile")
    @ValidGroup({@Valid(index = 0, length = 11, regStr = GATOpenConstant.MOBILE_REGEX, required = true)})
    Call<ApiResponse<String>> loginByMobile(@Field("mobile") String mobile);

    @FormUrlEncoded
    @POST("sso/employee/getAuthCodeByCorpCode")
    @ValidGroup({@Valid(index = 0, required = true, minLen = 1, maxLen = 20)})
    Call<ApiResponse<String>> loginByCorpCode(@Field("corp_code") String corpCode);

}
