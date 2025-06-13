/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.department;

import java.util.List;

/**
 * Created by August.Zhou on 2022/6/27 14:40
 */
public class DepartmentGetBatchResultResp {
    /**
     * 批次号
     */
    private String batchNumber;
    /**
     * 批次数据总量
     */
    private Integer totalCount;
    /**
     * 成功数
     */
    private Integer successCount;
    /**
     * 失败数
     */
    private Integer failureCount;
    /**
     * 操作失败的数据及信息
     */
    private List<Failure> failures;

    public static class Failure {
        /**
         * 失败的数据
         */
        private String serviceData;
        /**
         * 失败的原因
         */
        private String reason;

        public String getServiceData() {
            return serviceData;
        }

        public void setServiceData(String serviceData) {
            this.serviceData = serviceData;
        }

        public String getReason() {
            return reason;
        }

        public void setReason(String reason) {
            this.reason = reason;
        }
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public Integer getSuccessCount() {
        return successCount;
    }

    public void setSuccessCount(Integer successCount) {
        this.successCount = successCount;
    }

    public Integer getFailureCount() {
        return failureCount;
    }

    public void setFailureCount(Integer failureCount) {
        this.failureCount = failureCount;
    }

    public List<Failure> getFailures() {
        return failures;
    }

    public void setFailures(List<Failure> failures) {
        this.failures = failures;
    }
}
