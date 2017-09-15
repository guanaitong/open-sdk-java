package com.gat.open.sdk;

import com.gat.open.sdk.api.*;
import com.gat.open.sdk.constant.GATOpenConstant;
import com.gat.open.sdk.model.*;
import com.gat.open.sdk.util.CallUtil;
import com.gat.open.sdk.util.RetrofitFactory;
import retrofit2.Call;

import java.math.BigDecimal;
import java.util.List;

/**
 * Created by xin.hua on 2017/7/18.
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
     * @param connectTimeOut
     * @param readTimeOut
     * @param writeTimeOut
     */
    public void config(long connectTimeOut, long readTimeOut, long writeTimeOut, boolean debugHttpLog) {
        retrofitFactory.config(connectTimeOut, readTimeOut, writeTimeOut,debugHttpLog);
    }

    // ==== token ====

    /**
     * 获取token
     *
     * @return
     */
    public ApiResponse<Token> createToken() {
        TokenApi tokenApi = retrofitFactory.getApi(TokenApi.class);
        Call<ApiResponse<Token>> call = tokenApi.createToken(GATOpenConstant.appId);
        return CallUtil.execute(call);
    }

    /**
     * 查询token状态
     *
     * @param access_token
     * @return
     */
    public ApiResponse<Token> getTokenInfo(String access_token) {
        TokenApi tokenApi = retrofitFactory.getApi(TokenApi.class);
        Call<ApiResponse<Token>> call = tokenApi.getTokenInfo(access_token, GATOpenConstant.appId);
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
     * @param corpCode
     * @param name
     * @param gender
     * @param email
     * @param mobile
     * @param sendInvite
     * @param remark
     * @param birthDay
     * @param entryDay
     * @param cardType
     * @param cardNo
     * @return
     */
    public ApiResponse<String> addEmployee(String corpCode, String name, Integer gender,
                                           String email, String mobile, Integer sendInvite, String remark,
                                           String birthDay, String entryDay, Integer cardType, String cardNo) {
        EmployeeApi employeeApi = retrofitFactory.getApi(EmployeeApi.class);
        Call<ApiResponse<String>> call = employeeApi
                .addEmployee(corpCode, name, gender, email,
                                                mobile, sendInvite, remark, birthDay, entryDay, cardType, cardNo);
        return CallUtil.execute(call);
    }


    /**
     * 查询员工
     *
     * @param corpCode
     * @return
     */
    public ApiResponse<Employee> getEmployee(String corpCode) {
        EmployeeApi employeeApi = retrofitFactory.getApi(EmployeeApi.class);
        Call<ApiResponse<Employee>> call = employeeApi.getEmployee(corpCode);
        return CallUtil.execute(call);
    }

    /**
     * 更新员工
     *
     * @param corpCode
     * @param name
     * @param gender
     * @param email
     * @param mobile
     * @param remark
     * @param birthDay
     * @param entryDay
     * @param cardType
     * @param cardNo
     * @param newCorpcode
     * @return
     */
    public ApiResponse<String> updateEmployee(String corpCode, String name, Integer gender, String email,
                                              String mobile, String remark, String birthDay, String entryDay,
                                              Integer cardType, String cardNo, String newCorpcode) {

        EmployeeApi employeeApi = retrofitFactory.getApi(EmployeeApi.class);
        Call<ApiResponse<String>> call = employeeApi
                .updateEmployee(corpCode, name, gender, email,
                                                        mobile, remark, birthDay, entryDay, cardType, cardNo, newCorpcode);
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
