/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.notify;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;


public class NotifyEmployeeSync extends NotifyBase {
    @JsonProperty("result")
    List<Result> result;

    public static class Result {
        @JsonProperty("userid")
        String userid;
        @JsonProperty("enterprise_code")
        String enterpriseCode;
        @JsonProperty("sync_type")
        Integer syncType;
        @JsonProperty("sync_status")
        Integer syncStatus;
        @JsonProperty("error_msg")
        String errorMsg;

        public String getUserid() {
            return userid;
        }

        public void setUserid(String userid) {
            this.userid = userid;
        }

        public String getEnterpriseCode() {
            return enterpriseCode;
        }


        public void setEnterpriseCode(String enterpriseCode) {
            this.enterpriseCode = enterpriseCode;
        }

        public Integer getSyncType() {
            return syncType;
        }


        public void setSyncType(Integer syncType) {
            this.syncType = syncType;
        }

        public Integer getSyncStatus() {
            return syncStatus;
        }

        public void setSyncStatus(Integer syncStatus) {
            this.syncStatus = syncStatus;
        }

        public String getErrorMsg() {
            return errorMsg;
        }

        public void setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
        }
    }

    public List<Result> getResult() {
        return result;
    }


    public void setResult(List<Result> result) {
        this.result = result;
    }
}
