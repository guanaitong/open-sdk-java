package com.ciicgat.open.sdk.api;


import com.ciicgat.open.sdk.annotation.Valid;
import com.ciicgat.open.sdk.annotation.ValidGroup;
import com.ciicgat.open.sdk.constant.GATOpenConstant;
import com.ciicgat.open.sdk.model.ApiResponse;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * 登陆接口
 *
 * @author xin.hua
 * @date 2017/7/19
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
