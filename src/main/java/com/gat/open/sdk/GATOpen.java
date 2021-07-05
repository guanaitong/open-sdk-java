/*
 * Copyright 2007-2021, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk;


import com.gat.open.sdk.api.DepartmentApi;
import com.gat.open.sdk.api.EmployeeApi;
import com.gat.open.sdk.api.EnterpriseApi;
import com.gat.open.sdk.api.HelperApi;
import com.gat.open.sdk.api.LoginApi;
import com.gat.open.sdk.api.TokenApi;
import com.gat.open.sdk.constant.GATOpenConstant;
import com.gat.open.sdk.model.ApiResponse;
import com.gat.open.sdk.model.BatchModel;
import com.gat.open.sdk.model.Department;
import com.gat.open.sdk.model.Employee;
import com.gat.open.sdk.model.EmployeeAccount;
import com.gat.open.sdk.model.EnterpriseAccount;
import com.gat.open.sdk.model.LimitStatus;
import com.gat.open.sdk.model.PointStatus;
import com.gat.open.sdk.model.Token;
import com.gat.open.sdk.model.bo.EmployeeBO;
import com.gat.open.sdk.util.CallUtil;
import com.gat.open.sdk.util.RetrofitFactory;
import retrofit2.Call;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

/**
 * @author xin.hua
 * date 2017/7/18
 */
public class GATOpen {

    private RetrofitFactory retrofitFactory;

    public GATOpen(String appId, String appSecret) {
        GATOpenConstant.init(appId, appSecret);
        retrofitFactory = RetrofitFactory.getInstance();
    }

    public GATOpen(String appId, String appSecret, String baseUrl) {
        GATOpenConstant.init(appId, appSecret, baseUrl);
        retrofitFactory = RetrofitFactory.getInstance();

    }

    /**
     * 设置网络连接读取超时时间
     *
     * @param connectTimeOut s
     * @param readTimeOut    s
     * @param writeTimeOut   s
     * @param debugHttpLog   日志级别
     */
    public void config(long connectTimeOut, long readTimeOut, long writeTimeOut, boolean debugHttpLog) {
        retrofitFactory.config(connectTimeOut, readTimeOut, writeTimeOut, debugHttpLog);
    }

    // ==== token ====

    /**
     * 获取token
     *
     * @return
     */
    public ApiResponse<Token> createToken() {
        TokenApi tokenApi = retrofitFactory.getApi(TokenApi.class);
        Call<ApiResponse<Token>> call = tokenApi.createToken(GATOpenConstant.getAppId());
        return CallUtil.execute(call);
    }

    /**
     * 查询token状态
     *
     * @param accessToken
     * @return
     */
    public ApiResponse<Token> getTokenInfo(String accessToken) {
        TokenApi tokenApi = retrofitFactory.getApi(TokenApi.class);
        Call<ApiResponse<Token>> call = tokenApi.getTokenInfo(accessToken, GATOpenConstant.getAppId());
        return CallUtil.execute(call);
    }

    // ==== 企业接口 =====

    /**
     * 企业积分发放
     *
     * @param corpCode
     * @param amount
     * @param reason
     * @param externalCode
     * @return
     */
    public ApiResponse<String> pointAssign(String corpCode, BigDecimal amount,
                                           String reason, String externalCode) {
        EnterpriseApi enterpriseApi = retrofitFactory.getApi(EnterpriseApi.class);
        Call<ApiResponse<String>> call = enterpriseApi
                .pointAssign(corpCode, amount, reason, externalCode);
        return CallUtil.execute(call);
    }


    /**
     * 企业积分回收
     *
     * @param corpCode
     * @param amount
     * @param reason
     * @param externalCode
     * @return
     */
    public ApiResponse<String> pointRecycle(String corpCode,
                                            BigDecimal amount, String reason,
                                            String externalCode) {
        EnterpriseApi enterpriseApi = retrofitFactory.getApi(EnterpriseApi.class);
        Call<ApiResponse<String>> call = enterpriseApi
                .pointRecycle(corpCode, amount, reason, externalCode);
        return CallUtil.execute(call);
    }

    /**
     * 企业积分发放操作状态查询
     *
     * @param externalCode
     * @return
     */
    public ApiResponse<PointStatus> pointStatus(String externalCode) {
        EnterpriseApi enterpriseApi = retrofitFactory.getApi(EnterpriseApi.class);
        Call<ApiResponse<PointStatus>> call = enterpriseApi.pointStatus(externalCode);
        return CallUtil.execute(call);
    }

    /**
     * 查询企业资产账户及余额
     *
     * @param accountOpenid
     * @param type
     * @return
     */
    public ApiResponse<List<EnterpriseAccount>> enterpriseAccount(String accountOpenid, Integer type) {
        EnterpriseApi enterpriseApi = retrofitFactory.getApi(EnterpriseApi.class);
        Call<ApiResponse<List<EnterpriseAccount>>> call = enterpriseApi.enterpriseAccount(accountOpenid, type);
        return CallUtil.execute(call);
    }

    /**
     * 企业额度单个发放
     *
     * @param limitOpenid
     * @param corpCode
     * @param amount
     * @param remark
     * @param comment
     * @param externalCode
     * @return
     */
    public ApiResponse<String> limitAssign(String limitOpenid, String corpCode, BigDecimal amount,
                                           String remark, String comment, String externalCode) {

        EnterpriseApi enterpriseApi = retrofitFactory.getApi(EnterpriseApi.class);
        Call<ApiResponse<String>> call = enterpriseApi
                .limitAssign(limitOpenid, corpCode, amount,
                        remark, comment, externalCode);
        return CallUtil.execute(call);
    }

    /**
     * 额度发放状态查询
     *
     * @param externalCode
     * @return
     */
    public ApiResponse<LimitStatus> limitStatus(String externalCode) {
        EnterpriseApi enterpriseApi = retrofitFactory.getApi(EnterpriseApi.class);
        Call<ApiResponse<LimitStatus>> call = enterpriseApi.limitStatus(externalCode);
        return CallUtil.execute(call);
    }

    /**
     * 企业额度单个回收
     *
     * @param limitOpenid
     * @param corpCode
     * @param amount
     * @param remark
     * @param externalCode
     * @return
     */
    public ApiResponse<String> limitRecycle(String limitOpenid,
                                            String corpCode, BigDecimal amount, String remark,
                                            String externalCode) {
        EnterpriseApi enterpriseApi = retrofitFactory.getApi(EnterpriseApi.class);
        Call<ApiResponse<String>> call = enterpriseApi
                .limitRecycle(limitOpenid, corpCode,
                        amount, remark, externalCode);
        return CallUtil.execute(call);
    }

    // ==== 员工接口  ====

    /**
     * 添加员工
     *
     * @param employeeBO 员工对象
     * @return result
     */
    public ApiResponse<String> addEmployee(EmployeeBO employeeBO) {
        EmployeeApi employeeApi = retrofitFactory.getApi(EmployeeApi.class);
        Call<ApiResponse<String>> call = employeeApi
                .addEmployee(employeeBO.getCorp_code(),
                        employeeBO.getName(),
                        employeeBO.getGender(),
                        employeeBO.getEmail(),
                        employeeBO.getMobile(),
                        employeeBO.getSend_invite(),
                        employeeBO.getRemark(),
                        employeeBO.getDept_code(),
                        employeeBO.getLevel(),
                        employeeBO.getCategory(),
                        employeeBO.getBirth_day(),
                        employeeBO.getEntry_day(),
                        employeeBO.getCard_type(),
                        employeeBO.getCard_no());
        return CallUtil.execute(call);
    }

    /**
     * 查询员工
     *
     * @param corpCode 工号(20位以内字母数字,不区分大小写)
     * @return result
     */
    public ApiResponse<Employee> getEmployee(String corpCode) {
        EmployeeApi employeeApi = retrofitFactory.getApi(EmployeeApi.class);
        Call<ApiResponse<Employee>> call = employeeApi.getEmployee(corpCode);
        return CallUtil.execute(call);
    }

    public ApiResponse<Employee> getEmployeeByMobile(String mobile) {
        EmployeeApi employeeApi = retrofitFactory.getApi(EmployeeApi.class);
        Call<ApiResponse<Employee>> call = employeeApi.getEmployeeByMobile(mobile);
        return CallUtil.execute(call);
    }

    /**
     * 更新员工
     *
     * @param employeeBO  员工信息
     * @param newCorpcode 新工号
     * @return result
     */
    public ApiResponse<String> updateEmployee(EmployeeBO employeeBO, String newCorpcode) {
        EmployeeApi employeeApi = retrofitFactory.getApi(EmployeeApi.class);
        Call<ApiResponse<String>> call = employeeApi.updateEmployee(employeeBO.getCorp_code(),
                employeeBO.getName(),
                employeeBO.getGender(),
                employeeBO.getEmail(),
                employeeBO.getMobile(),
                employeeBO.getRemark(),
                employeeBO.getDept_code(),
                employeeBO.getLevel(),
                employeeBO.getCategory(),
                employeeBO.getBirth_day(),
                employeeBO.getEntry_day(),
                employeeBO.getCard_type(),
                employeeBO.getCard_no(),
                newCorpcode);
        return CallUtil.execute(call);
    }

    /**
     * 员工离职
     *
     * @param corpCode
     * @return
     */
    public ApiResponse<String> resignEmployee(String corpCode) {
        EmployeeApi employeeApi = retrofitFactory.getApi(EmployeeApi.class);
        Call<ApiResponse<String>> call = employeeApi.resignEmployee(corpCode);
        return CallUtil.execute(call);
    }

    /**
     * 离职员工复职
     *
     * @param corpCode
     * @return
     */
    public ApiResponse<String> restoreEmployee(String corpCode) {
        EmployeeApi employeeApi = retrofitFactory.getApi(EmployeeApi.class);
        Call<ApiResponse<String>> call = employeeApi.restoreEmployee(corpCode);
        return CallUtil.execute(call);
    }

    /**
     * 批量查询员工
     *
     * @param pageIndex
     * @param pageSize
     * @return
     */
    public ApiResponse<BatchModel<Employee>> batchEmployee(Integer pageIndex, Integer pageSize) {
        EmployeeApi employeeApi = retrofitFactory.getApi(EmployeeApi.class);
        Call<ApiResponse<BatchModel<Employee>>> call = employeeApi.batchEmployee(pageIndex, pageSize);
        return CallUtil.execute(call);
    }

    /**
     * 查询员工账户
     *
     * @param corpCode
     * @return
     */
    public ApiResponse<List<EmployeeAccount>> accountEmployee(String corpCode) {
        EmployeeApi employeeApi = retrofitFactory.getApi(EmployeeApi.class);
        Call<ApiResponse<List<EmployeeAccount>>> call = employeeApi.accountEmployee(corpCode);
        return CallUtil.execute(call);
    }

    // ==== 信任登陆接口 ====

    /**
     * 根据手机号登录
     *
     * @param mobile
     * @return
     */
    public ApiResponse<String> loginByMobile(String mobile) {
        LoginApi loginApi = retrofitFactory.getApi(LoginApi.class);
        Call<ApiResponse<String>> call = loginApi.loginByMobile(mobile);
        return CallUtil.execute(call);
    }

    /**
     * 根据员工工号登录
     *
     * @param corpCode 工号
     * @return
     */
    public ApiResponse<String> loginByCorpCode(String corpCode) {
        LoginApi loginApi = retrofitFactory.getApi(LoginApi.class);
        Call<ApiResponse<String>> call = loginApi.loginByCorpCode(corpCode);
        return CallUtil.execute(call);
    }

    /**
     * 基于员工工号同步员工并获取登录授权码
     *
     * @param corpCode       工号
     * @param enterpriseCode 非必填 单企业模式参数为 null
     * @param mobileArea     不传默认为 86
     * @param mobile         外部系统的手机号
     * @param name           外部系统的员工姓名 如有
     * @param gender         性别:1.男,2.女
     * @return
     */
    public ApiResponse<String> syncUserAndGetAuthCode(String corpCode,
                                                      String enterpriseCode,
                                                      String mobileArea,
                                                      String mobile,
                                                      String name,
                                                      Integer gender) {

        LoginApi loginApi = retrofitFactory.getApi(LoginApi.class);
        Call<ApiResponse<String>> call = loginApi.syncUserAndGetAuthCode(corpCode, enterpriseCode, mobileArea, mobile, name, gender);

        return CallUtil.execute(call);
    }

    // ==== 部门相关接口 ====

    /**
     * @param deptCode
     * @return
     */
    public ApiResponse<Map<String, Object>> getHierarchy(String deptCode) {
        DepartmentApi departmentApi = retrofitFactory.getApi(DepartmentApi.class);
        Call<ApiResponse<Map<String, Object>>> call = departmentApi.getHierarchy(deptCode);
        return CallUtil.execute(call);
    }

    public ApiResponse<Department> getDepartment(String deptCode) {
        DepartmentApi departmentApi = retrofitFactory.getApi(DepartmentApi.class);
        Call<ApiResponse<Department>> call = departmentApi.getDepartment(deptCode);
        return CallUtil.execute(call);
    }

    public ApiResponse<String> addDepartment(Department department) {
        DepartmentApi departmentApi = retrofitFactory.getApi(DepartmentApi.class);
        Call<ApiResponse<String>> call = departmentApi.addDepartment(department.getDept_Code(), department.getParent_code(), department.getName(), department.getStatus());
        return CallUtil.execute(call);
    }

    public ApiResponse<String> updateDepartment(Department department) {
        DepartmentApi departmentApi = retrofitFactory.getApi(DepartmentApi.class);
        Call<ApiResponse<String>> call = departmentApi.updateDepartment(department.getDept_Code(), department.getParent_code(), department.getName(), department.getStatus(), department.getManager_code());
        return CallUtil.execute(call);
    }

    public ApiResponse<String> deleteDepartment(String deptCode) {
        DepartmentApi departmentApi = retrofitFactory.getApi(DepartmentApi.class);
        Call<ApiResponse<String>> call = departmentApi.deleteDepartment(deptCode);
        return CallUtil.execute(call);
    }

    // ====  帮助接口 ====

    /**
     * 检测 app 接口
     *
     * @param appid
     * @return
     */
    public ApiResponse<String> helperCheck(String appid) {
        HelperApi helperApi = retrofitFactory.getApi(HelperApi.class);
        Call<ApiResponse<String>> call = helperApi.checkApp(appid);
        return CallUtil.execute(call);
    }


}
