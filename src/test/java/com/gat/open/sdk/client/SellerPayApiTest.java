package com.gat.open.sdk.client;

import com.gat.open.sdk.seller.client.SellerTestOpenClient;
import com.gat.open.sdk.seller.model.ExcashierV3GoodsDetailReq;
import com.gat.open.sdk.seller.model.ExcashierV3Request;
import com.gat.open.sdk.seller.model.ExcashierV3Response;
import com.gat.open.sdk.seller.model.ExcashierV3TradeInfo;
import com.gat.open.sdk.seller.model.SellerRefundV3Request;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SellerPayApiTest {
//    private SellerOpenClient openClient = new SellerOpenClient("http://127.0.0.1:19090", "http://127.0.0.1:18888", "25001782", "f72c0aeb74630c760a9bbf9c01b9acf4");
    private SellerTestOpenClient sellerTestOpenClient = new SellerTestOpenClient("https://openapi.guanaitong.tech", "https://openapi.guanaitong.tech", "25001782", "f72c0aeb74630c760a9bbf9c01b9acf4");
    private OpenClient openClient = new OpenClient("https://openapi.guanaitong.tech", "25001782", "f72c0aeb74630c760a9bbf9c01b9acf4");

    @Test
    public void syncRefund() {
        SellerRefundV3Request sellerRefundV3Request = new SellerRefundV3Request();
        sellerRefundV3Request.setOuterTradeNo("25001782211222");
        sellerRefundV3Request.setOuterRefundNo("22");
        sellerRefundV3Request.setRefundAmount(new BigDecimal("0.1"));
        sellerRefundV3Request.setReason("就测试");
        sellerRefundV3Request.setNotifyUrl("1");
        sellerTestOpenClient.sellerPayApi().syncRefundV3(sellerRefundV3Request);
    }
    @Test
    public void excashierV3() {
        ExcashierV3Request excashierV3Request = new ExcashierV3Request();
        excashierV3Request.setBuyerOpenId("f00fba70953f625cff7688f0be682d16");
        excashierV3Request.setOuterTradeNo("250017822113");
        excashierV3Request.setAttach("x123345");
        excashierV3Request.setTradeType(2);
        excashierV3Request.setTimeOrdered("2023-08-02 10:00:00");
        excashierV3Request.setTotalAmount(new BigDecimal("11.11"));
        excashierV3Request.setReturnUrl("https://openapi.guanaitong.tech/seller");
        excashierV3Request.setReason("就测试");
        excashierV3Request.setNotifyUrl("https://openapi.guanaitong.tech/seller");
        ExcashierV3TradeInfo tradeInfo = new ExcashierV3TradeInfo();
        tradeInfo.setThirdTradeNo("222");
        tradeInfo.setThirdTotalAmount(new BigDecimal("11.11"));
        tradeInfo.setThirdPayAmount(new BigDecimal("11.11"));
        tradeInfo.setThirdCostAmount(new BigDecimal("11.11"));
        tradeInfo.setIsThirdOrders(2);
        ArrayList<ExcashierV3GoodsDetailReq> goodsDetail = new ArrayList<>();
        ExcashierV3GoodsDetailReq goodsDetailReq = new ExcashierV3GoodsDetailReq();
        goodsDetailReq.setSkuCode("90");
        goodsDetailReq.setSkuName("好吃的饭");
        goodsDetailReq.setSkuCateCode(90L);
        goodsDetailReq.setSku2ndCateCode(91L);
        goodsDetailReq.setSku3rdCateCode(92L);
        goodsDetailReq.setSkuCateDesc("90");
        goodsDetailReq.setSku2ndCateDesc("91");
        goodsDetailReq.setSku3rdCateDesc("92");
        goodsDetailReq.setGatAmount(new BigDecimal("11.11"));
        goodsDetailReq.setAmount(new BigDecimal("11.11"));
        goodsDetailReq.setCostAmount(new BigDecimal("11.11"));
        goodsDetailReq.setQuantity(1);
        goodsDetailReq.setPrice(new BigDecimal("11.11"));

        goodsDetail.add(goodsDetailReq);
        tradeInfo.setGoodsDetail(goodsDetail);
        excashierV3Request.setTradeInfo(tradeInfo);
      /*  excashierV3Request.setProvinceCode(320000L);
        excashierV3Request.setCityCode(320100L);
        excashierV3Request.setLocationCode(320102L);*/
        /*excashierV3Request.setProvinceName("江苏省");
        excashierV3Request.setCityName("南京市");
        excashierV3Request.setLocationName("玄武区");
        excashierV3Request.setRecipientAddress("大街道");
        excashierV3Request.setRecipientName("tom");
        excashierV3Request.setRecipientPhone("13654545052");
        excashierV3Request.setShopName("霸碗盖码饭(新街口大洋店)");
        excashierV3Request.setShopAddress("新街口大洋百货负1楼扶梯旁美食街区A16铺");
        excashierV3Request.setShopPhone("13654545051");
        excashierV3Request.setPoiCateCode(1000L);
        excashierV3Request.setPoiCateDesc("美食");
        excashierV3Request.setPoi2ndCateCode(100001L);
        excashierV3Request.setPoi2ndCateDesc("本地美食");
        excashierV3Request.setPoi3rdCateCode(10000120001L);
        excashierV3Request.setPoi3rdCateDesc("盖饭");*/

//        ExcashierV3Response excashierV3Response = sellerTestOpenClient.sellerPayApi().excashierV3(excashierV3Request);
        ExcashierV3Response excashierV3Response = openClient.sellerPayApi().excashierV3(excashierV3Request);
        System.out.println(JSON.toJSONString(excashierV3Response));
    }
}
