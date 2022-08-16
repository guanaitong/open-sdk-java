package com.gat.open.sdk.client;

import com.gat.open.sdk.model.trade.EnterpriseGetTradeDetailRequest;
import com.gat.open.sdk.model.trade.EnterpriseGetTradeDetailResp;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

public class TradeApiTest {
    private OpenClient openClient = Clients.openClient;

    @Test
    public void tradeDetailGetTest() {

        EnterpriseGetTradeDetailRequest enterpriseGetTradeDetailRequest = new EnterpriseGetTradeDetailRequest();
        enterpriseGetTradeDetailRequest.setTradeNo("2022081620000404");
        EnterpriseGetTradeDetailResp enterpriseGetTradeDetailResp = openClient.tradeApi().getTradeDetail(enterpriseGetTradeDetailRequest);
        System.out.println(JSON.toJSONString(enterpriseGetTradeDetailResp));
    }
}
