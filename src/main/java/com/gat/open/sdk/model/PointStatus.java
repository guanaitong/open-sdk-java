package com.gat.open.sdk.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

/**
 *
 * @author xin.hua
 * @date 2017/7/18
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class PointStatus {


    /**
     * amount : 100
     * corp_code : CJJ101
     * externalCode : 300000031495071665668
     * pointStatus : 2
     * time_assign : 2017-05-18
     */

    private BigDecimal amount;
    @JsonProperty("corp_code")
    private String corpCode;
    private String externalCode;
    private int status;
    @JsonProperty("time_assign")
    private String timeAssign;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCorpCode() {
        return corpCode;
    }

    public void setCorpCode(String corpCode) {
        this.corpCode = corpCode;
    }

    public String getExternalCode() {
        return externalCode;
    }

    public void setExternalCode(String externalCode) {
        this.externalCode = externalCode;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getTimeAssign() {
        return timeAssign;
    }

    public void setTimeAssign(String timeAssign) {
        this.timeAssign = timeAssign;
    }
}
