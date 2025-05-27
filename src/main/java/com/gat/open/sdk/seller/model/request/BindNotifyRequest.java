package com.gat.open.sdk.seller.model.request;

import com.gat.open.sdk.model.JsonRequest;
import com.gat.open.sdk.seller.model.response.BindNotifyRes;

public class BindNotifyRequest extends JsonRequest<BindNotifyRes> {
    public BindNotifyRequest() {noSnake = true;}

    private String openId;

    private String thirdUserId;

    private String bindTime;

    private String unBindTime;
}
