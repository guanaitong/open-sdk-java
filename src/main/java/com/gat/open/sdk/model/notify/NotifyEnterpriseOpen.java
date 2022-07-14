/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.notify;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class NotifyEnterpriseOpen extends NotifyBase {

    @JsonProperty("app_id")
    String appId;
    @JsonProperty("app_secret")
    String appSecret;
    @JsonProperty("enterprise_code")
    String enterpriseCode;
    @JsonProperty("products")
    List<Product> productList;

    public NotifyEnterpriseOpen() {

    }

    static class Product {
        @JsonProperty("product_category")
        Integer productCategory;
        @JsonProperty("product_name")
        String productName;
        @JsonProperty("account_openid")
        String accountOpenid;

        public Integer getProductCategory() {
            return productCategory;
        }

        public void setProductCategory(Integer productCategory) {
            this.productCategory = productCategory;
        }

        public String getProductName() {
            return productName;
        }

        public void setProductName(String productName) {
            this.productName = productName;
        }

        public String getAccountOpenid() {
            return accountOpenid;
        }

        public void setAccountOpenid(String accountOpenid) {
            this.accountOpenid = accountOpenid;
        }
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public String getEnterpriseCode() {
        return enterpriseCode;
    }


    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

}
