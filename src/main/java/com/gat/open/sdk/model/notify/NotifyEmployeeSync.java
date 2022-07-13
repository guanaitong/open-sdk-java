/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.notify;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSetter;

import java.util.List;


public class NotifyEmployeeSync extends NotifyBase {
    List<Result> result;

    public static class Result {

        String userid;

        String enterpriseCode;

        Integer syncType;

        Integer syncStatus;

        @JsonProperty("error_msg")
        String errorMsg;

        @JsonGetter("user_id")
        public String getUserid() {
            return userid;
        }

        @JsonSetter("userid")
        public void setUserid(String userid) {
            this.userid = userid;
        }

        @JsonGetter("subsidiary_code")
        public String getEnterpriseCode() {
            return enterpriseCode;
        }

        @JsonSetter("enterprise_code")
        public void setEnterpriseCode(String enterpriseCode) {
            this.enterpriseCode = enterpriseCode;
        }

        @JsonGetter("sync_status")
        public Integer getSyncType() {
            return syncType;
        }

        @JsonSetter("sync_type")
        public void setSyncType(Integer syncType) {
            this.syncType = syncType;
        }

        @JsonGetter("sync_result")
        public Integer getSyncStatus() {
            return syncStatus;
        }

        @JsonSetter("sync_status")
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

    @JsonGetter("users")
    public List<Result> getResult() {
        return result;
    }

    @JsonSetter("result")
    public void setResult(List<Result> result) {
        this.result = result;
    }
}
