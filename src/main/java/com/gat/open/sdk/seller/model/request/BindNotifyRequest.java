/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.seller.model.response.BindNotifyRes;

public class BindNotifyRequest extends JsonRequest<BindNotifyRes> {
    public BindNotifyRequest() { noSnake = true; }

    private String openId;

    private String thirdUserId;

    private String bindTime;

    private String unBindTime;

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getThirdUserId() {
        return thirdUserId;
    }

    public void setThirdUserId(String thirdUserId) {
        this.thirdUserId = thirdUserId;
    }

    public String getBindTime() {
        return bindTime;
    }

    public void setBindTime(String bindTime) {
        this.bindTime = bindTime;
    }

    public String getUnBindTime() {
        return unBindTime;
    }

    public void setUnBindTime(String unBindTime) {
        this.unBindTime = unBindTime;
    }
}
