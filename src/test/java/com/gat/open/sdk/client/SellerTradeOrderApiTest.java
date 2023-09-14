/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.seller.client.SellerTestOpenClient;
import com.gat.open.sdk.seller.model.MovieTicketOrderV3Request;
import com.gat.open.sdk.seller.model.MovieTicketOrderV3Response;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;

public class SellerTradeOrderApiTest {
    //    private SellerOpenClient openClient = new SellerOpenClient("https://openapi.guanaitong.tech", "http://127.0.0.1:18888", "20111018", "7cda55c2953440b6ab9406397cf31b88");
    private SellerTestOpenClient openClient = new SellerTestOpenClient("https://openapi.guanaitong.tech", "https://openapi.guanaitong.tech", "20111018", "7cda55c2953440b6ab9406397cf31b88");
//    private SellerOpenClient openClient = new SellerOpenClient("https://openapi.guanaitong.tech", "https://openapi.guanaitong.tech", "25001782", "f72c0aeb74630c760a9bbf9c01b9acf4");

    @Test
    public void movieTicketCreateOrder() {
        MovieTicketOrderV3Request movieTicketOrderV3Request = new MovieTicketOrderV3Request();
        movieTicketOrderV3Request.setBuyerOpenId("6835af8be095aec6423f16cb09c2f4f0");
        movieTicketOrderV3Request.setOuterTradeNo("20111018_112");
        movieTicketOrderV3Request.setThirdBizOrderId("112");
        movieTicketOrderV3Request.setTradeType(10);
        movieTicketOrderV3Request.setTimeOrdered("2023-09-08 10:00:00");
        movieTicketOrderV3Request.setPayAmount(new BigDecimal("11.11"));
        movieTicketOrderV3Request.setOriginalPrice(new BigDecimal("11.11"));
        movieTicketOrderV3Request.setRemark("就测试");

        ArrayList<MovieTicketOrderV3Request.TicketDetail> goodsDetail = new ArrayList<>();
        MovieTicketOrderV3Request.TicketDetail goodsDetailReq = new MovieTicketOrderV3Request.TicketDetail();
        goodsDetailReq.setTicketNo("90");
        goodsDetailReq.setSeatCode("xxx111108");
        goodsDetailReq.setSeatName("09-08");
        goodsDetailReq.setPrice(new BigDecimal("11.11"));

        goodsDetail.add(goodsDetailReq);
        movieTicketOrderV3Request.setTicketDetails(goodsDetail);

        movieTicketOrderV3Request.setProvinceCode(320000L);
        movieTicketOrderV3Request.setCityCode(320100L);
        movieTicketOrderV3Request.setLocationCode(320102L);
        movieTicketOrderV3Request.setProvinceName("江苏省");
        movieTicketOrderV3Request.setCityName("南京市");
        movieTicketOrderV3Request.setLocationName("玄武区");
        movieTicketOrderV3Request.setShopName("好看电影院");
        movieTicketOrderV3Request.setShopAddress("新街口大洋百货负1楼扶梯旁美食街区A16铺");
        movieTicketOrderV3Request.setShopPhone("13654545051");
        movieTicketOrderV3Request.setMovieName("好看自拍");
        movieTicketOrderV3Request.setShowTime("2020-09-08 20:00:00");
        movieTicketOrderV3Request.setExpireTime("2023-09-09 20:00:00");
        movieTicketOrderV3Request.setTicketCode("xxxxx");
        movieTicketOrderV3Request.setTimeTraded("2023-09-08 10:00:01");
        movieTicketOrderV3Request.setTimeFinished("2023-09-08 10:00:05");

        MovieTicketOrderV3Response movieTicketOrderV3Response = openClient.sellerTradeOrderApi().movieTicketCreateOrder(movieTicketOrderV3Request);
        System.out.println(JSON.toJSONString(movieTicketOrderV3Response));
    }
}
