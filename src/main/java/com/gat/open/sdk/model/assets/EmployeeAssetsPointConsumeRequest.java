/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;
import com.gat.open.sdk.model.Pagination2;

/**
 * https://open.guanaitong.com/doc/enterprise/employee-point-trade
 * <p>
 * Created by August.Zhou on 2022/6/27 13:54
 */
public class EmployeeAssetsPointConsumeRequest extends FormRequest<Pagination2<EmployeeAssetsPointConsumeResp>> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;
    /**
     * 消费还是退款1(消费),2(退款)
     */
    private Integer type;
    /**
     * 开始页数,默认1
     */
    private Integer pageIndex = 1;
    /**
     * 显示行数,默认20
     */
    private Integer pageSize = 20;
    /**
     * 开始时间，格式yyyy-mm-dd
     */
    private String timeStart;
    /**
     * 结束时间，格式yyyy-mm-dd
     */
    private String timeEnd;


    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getPageIndex() {
        return pageIndex;
    }

    public void setPageIndex(Integer pageIndex) {
        this.pageIndex = pageIndex;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(String timeStart) {
        this.timeStart = timeStart;
    }

    public String getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(String timeEnd) {
        this.timeEnd = timeEnd;
    }
}
