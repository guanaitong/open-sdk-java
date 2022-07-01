/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.assets;

import com.gat.open.sdk.model.EnterpriseCodeRequest;
import com.gat.open.sdk.model.FormRequest;

import java.util.List;

/**
 * https://open.guanaitong.com/doc/enterprise/account-enterprise-limit-get
 * <p>
 * Created by August.Zhou on 2022/6/27 13:54
 */
public class EnterpriseAssetsLimitGetRequest extends FormRequest<List<EnterpriseAssetsLimitGetResp>> implements EnterpriseCodeRequest {
    /**
     * 企业编号(集团和运营商必填,企业不填)
     */
    private String enterpriseCode;

    /**
     * 额度账户的 openid。不填时，返回所有的额度账户。
     */
    private String accountOpenid;

    @Override
    public String getEnterpriseCode() {
        return enterpriseCode;
    }

    @Override
    public void setEnterpriseCode(String enterpriseCode) {
        this.enterpriseCode = enterpriseCode;
    }

    public String getAccountOpenid() {
        return accountOpenid;
    }

    public void setAccountOpenid(String accountOpenid) {
        this.accountOpenid = accountOpenid;
    }
}
