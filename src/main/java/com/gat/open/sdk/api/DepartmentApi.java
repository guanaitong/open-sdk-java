package com.gat.open.sdk.api;


import com.gat.open.sdk.annotation.Valid;
import com.gat.open.sdk.annotation.ValidGroup;
import com.gat.open.sdk.model.ApiResponse;
import com.gat.open.sdk.model.Department;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

import java.util.Map;

/**
 * @author Stanley Shen
 * @version 1.0.0
 * @date 2017/12/18 19:26
 */
public interface DepartmentApi {

    @FormUrlEncoded
    @POST("department/getHierarchy")
    @ValidGroup({@Valid(
            index = 0,
            field = "dept_code",
            required = true,
            minLen = 1,
            maxLen = 50
    )})
    Call<ApiResponse<Map<String, Object>>> getHierarchy(@Field("dept_code") String deptCode);

    @FormUrlEncoded
    @POST("department/add")
    @ValidGroup({@Valid(
            index = 0,
            field = "dept_code",
            required = true,
            minLen = 1,
            maxLen = 50
    ), @Valid(
            index = 1,
            field = "parent_code",
            minLen = 1,
            maxLen = 50
    ), @Valid(
            index = 2,
            field = "name",
            required = true,
            maxLen = 100
    ), @Valid(
            index = 3,
            field = "status",
            intVals = {1, 2}
    )})
    Call<ApiResponse<String>> addDepartment(@Field("dept_code") String deptCode,
                                            @Field("parent_code") String parentCode,
                                            @Field("name") String name,
                                            @Field("status") Integer status);

    @FormUrlEncoded
    @POST("department/delete")
    @ValidGroup({@Valid(
            index = 0,
            field = "dept_code",
            required = true,
            minLen = 1,
            maxLen = 50
    )})
    Call<ApiResponse<String>> deleteDepartment(@Field("dept_code") String deptCode);

    @FormUrlEncoded
    @POST("department/update")
    @ValidGroup({@Valid(
            index = 0,
            field = "dept_code",
            required = true,
            minLen = 1,
            maxLen = 50
    ), @Valid(
            index = 1,
            field = "parent_code",
            minLen = 1,
            maxLen = 50
    ), @Valid(
            index = 2,
            field = "name",
            maxLen = 100
    ), @Valid(
            index = 3,
            field = "status",
            intVals = {1, 2}
    ), @Valid(
            index = 4,
            field = "manager_code",
            maxLen = 20
    )})
    Call<ApiResponse<String>> updateDepartment(@Field("dept_code") String deptCode,
                                               @Field("parent_code") String parentCode,
                                               @Field("name") String name,
                                               @Field("status") Integer status,
                                               @Field("manager_code") String managerCode);

    @FormUrlEncoded
    @POST("department/get")
    @ValidGroup({@Valid(
            index = 0,
            field = "dept_code",
            required = true,
            minLen = 1,
            maxLen = 50
    )})
    Call<ApiResponse<Department>> getDepartment(@Field("dept_code") String deptCode);

}
