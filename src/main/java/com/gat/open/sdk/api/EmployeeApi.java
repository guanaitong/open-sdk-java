package com.gat.open.sdk.api;

import com.gat.open.sdk.annotation.Valid;
import com.gat.open.sdk.annotation.ValidGroup;
import com.gat.open.sdk.constant.GATOpenConstant;
import com.gat.open.sdk.model.ApiResponse;
import com.gat.open.sdk.model.BatchModel;
import com.gat.open.sdk.model.Employee;
import com.gat.open.sdk.model.EmployeeAccount;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.util.List;

/**
 * 员工接口
 *
 * @author xin.hua
 * @date 2017/7/19
 */
public interface EmployeeApi {

    @FormUrlEncoded
    @POST("employee/add")
    @ValidGroup({@Valid(index = 0, required = true, minLen = 1, maxLen = 20),
            @Valid(index = 1, required = true, minLen = 1, maxLen = 50),
            @Valid(index = 2, intVals = {1, 2}),
            @Valid(index = 3, minLen = 1, maxLen = 100, regStr = GATOpenConstant.EMAIL_REGEX),
            @Valid(index = 4, length = 11, regStr = GATOpenConstant.MOBILE_REGEX),
            @Valid(index = 5, intVals = {1, 2}),
            @Valid(index = 6, minLen = 1, maxLen = 255),
            @Valid(index = 7, length = 10),
            @Valid(index = 8, length = 10),
            @Valid(index = 9, intVals = {1, 2}),
            @Valid(index = 10, minLen = 1, maxLen = 30)})
    Call<ApiResponse<String>> addEmployee(@Field("corp_code") String corpCode,
                                          @Field("name") String name,
                                          @Field("gender") Integer gender,
                                          @Field("email") String email,
                                          @Field("mobile") String mobile,
                                          @Field("send_invite") Integer sendInvite,
                                          @Field("remark") String remark,
                                          @Field("birth_day") String birthDay,
                                          @Field("entry_day") String entryDay,
                                          @Field("card_type") Integer cardType,
                                          @Field("card_no") String cardNo);

    @FormUrlEncoded
    @POST("employee/get")
    @ValidGroup({@Valid(index = 0, required = true, minLen = 1, maxLen = 20)})
    Call<ApiResponse<Employee>> getEmployee(@Field("corp_code") String corpCode);

    @FormUrlEncoded
    @POST("employee/update")
    @ValidGroup({@Valid(index = 0, required = true, minLen = 1, maxLen = 20),
            @Valid(index = 1, required = true, minLen = 1, maxLen = 50),
            @Valid(index = 2, intVals = {1, 2}),
            @Valid(index = 3, minLen = 1, maxLen = 100, regStr = GATOpenConstant.EMAIL_REGEX),
            @Valid(index = 4, length = 11, regStr = GATOpenConstant.MOBILE_REGEX),
            @Valid(index = 5, minLen = 1, maxLen = 255),
            @Valid(index = 6, minLen = 1, maxLen = 20),
            @Valid(index = 7, minLen = 1, maxLen = 10),
            @Valid(index = 8, length = 10),
            @Valid(index = 9, length = 10),
            @Valid(index = 10, intVals = {1, 2}),
            @Valid(index = 11, minLen = 1, maxLen = 30),
            @Valid(index = 12, minLen = 1, maxLen = 20)})
    Call<ApiResponse<String>> updateEmployee(@Field("corp_code") String corpCode,
                                             @Field("name") String name,
                                             @Field("gender") Integer gender,
                                             @Field("email") String email,
                                             @Field("mobile") String mobile,
                                             @Field("remark") String remark,
                                             @Field("dept_code") String dept_code,
                                             @Field("level") String level,
                                             @Field("birth_day") String birthDay,
                                             @Field("entry_day") String entryDay,
                                             @Field("card_type") Integer cardType,
                                             @Field("card_no") String cardNo,
                                             @Field("new_corp_code") String newCorpcode);

    @FormUrlEncoded
    @POST("employee/resign")
    @ValidGroup({@Valid(index = 0, required = true, minLen = 1, maxLen = 20)})
    Call<ApiResponse<String>> resignEmployee(@Field("corp_code") String corpCode);

    @FormUrlEncoded
    @POST("employee/restore")
    @ValidGroup({@Valid(index = 0, required = true, minLen = 1, maxLen = 20)})
    Call<ApiResponse<String>> restoreEmployee(@Field("corp_code") String corpCode);

    @FormUrlEncoded
    @POST("employee/batchGet")
    @ValidGroup({})
    Call<ApiResponse<BatchModel<Employee>>> batchEmployee(@Field("page_index") Integer pageIndex,
                                                          @Field("page_size") Integer pageSize);


    @FormUrlEncoded
    @POST("assets/account/employee/get")
    @ValidGroup({@Valid(index = 0, required = true, minLen = 1, maxLen = 20)})
    Call<ApiResponse<List<EmployeeAccount>>> accountEmployee(@Field("corp_code") String corpCode);


}
