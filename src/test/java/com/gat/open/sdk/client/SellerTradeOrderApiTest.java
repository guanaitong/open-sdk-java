/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.client;

import com.gat.open.sdk.seller.client.SellerTestOpenClient;
import com.gat.open.sdk.seller.model.request.PhysicalGoodsPayOrdersV3Request;
import com.gat.open.sdk.seller.model.response.CancelPhysicalGoodsOrderRes;
import com.gat.open.sdk.seller.model.response.MovieTicketOrderV3Response;
import com.gat.open.sdk.seller.model.response.SavePayPhysicalGoodsOrderRes;
import com.gat.open.sdk.seller.model.response.SaveRefundPhysicalGoodsOrderRes;
import com.gat.open.sdk.seller.model.request.GoodsDetailV3Req;
import com.gat.open.sdk.seller.model.request.MovieTicketOrderV3Request;
import com.gat.open.sdk.seller.model.request.PhysicalGoodsCancelOrderV3Request;
import com.gat.open.sdk.seller.model.request.PhysicalGoodsPayOrderV3Request;
import com.gat.open.sdk.seller.model.request.PhysicalGoodsRefundOrderV3Request;
import com.gat.open.sdk.util.JSON;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class SellerTradeOrderApiTest {
    private SellerTestOpenClient openClient = new SellerTestOpenClient("https://openapi.guanaitong.tech", "http://127.0.0.1:18888", "", "");
//    private SellerTestOpenClient openClient = new SellerTestOpenClient("https://openapi.guanaitong.tech", "https://openapi.guanaitong.tech", "", "");
//    private SellerTestOpenClient openClient = new SellerTestOpenClient("https://openapi.guanaitong.tech", "https://openapi.guanaitong.tech", "", "");

    @Test
    public void movieTicketCreateOrder() {
        MovieTicketOrderV3Request movieTicketOrderV3Request = new MovieTicketOrderV3Request();
        movieTicketOrderV3Request.setBuyerOpenId("6835af8be095aec6423f16cb09c2f4f0");
        movieTicketOrderV3Request.setOuterTradeNo("2011101820230925002");
        movieTicketOrderV3Request.setThirdBizOrderId("20230925002");
        movieTicketOrderV3Request.setTradeType(10);
        movieTicketOrderV3Request.setTimeOrdered("2023-09-14 10:00:00");
        movieTicketOrderV3Request.setPayAmount(new BigDecimal("11.11"));
        movieTicketOrderV3Request.setOriginalPrice(new BigDecimal("11.11"));
        movieTicketOrderV3Request.setRemark("就测试");

        ArrayList<MovieTicketOrderV3Request.TicketDetail> goodsDetail = new ArrayList<>();
        MovieTicketOrderV3Request.TicketDetail goodsDetailReq = new MovieTicketOrderV3Request.TicketDetail();
        goodsDetailReq.setTicketNo("90");
        goodsDetailReq.setSeatCode("xxx111108");
        goodsDetailReq.setSeatName("09-14");
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
        movieTicketOrderV3Request.setShowTime("2020-09-14 20:00:00");
        movieTicketOrderV3Request.setExpireTime("2023-09-14 20:00:00");
        movieTicketOrderV3Request.setTicketCode("xxxxx");
        movieTicketOrderV3Request.setTimeTraded("2023-09-14 10:00:01");
        movieTicketOrderV3Request.setTimeFinished("2023-09-14 10:00:05");

        MovieTicketOrderV3Response movieTicketOrderV3Response = openClient.sellerTradeOrderApi().movieTicketCreateOrder(movieTicketOrderV3Request);
        System.out.println(JSON.toJSONString(movieTicketOrderV3Response));
    }

    @Test
    public void testSavePayPhysicalGoodsOrder() {
        PhysicalGoodsPayOrderV3Request physicalGoodsPayOrderV3Request = new PhysicalGoodsPayOrderV3Request();
        physicalGoodsPayOrderV3Request.setBuyerOpenId("52f838b668524ffb06cd6fce95b91632");
        physicalGoodsPayOrderV3Request.setOrderNo("2023122100000011");
        physicalGoodsPayOrderV3Request.setTotalAmount(new BigDecimal("13.11"));
        physicalGoodsPayOrderV3Request.setPayAmount(new BigDecimal("13.11"));
        physicalGoodsPayOrderV3Request.setCostAmount(new BigDecimal("13.11"));
        physicalGoodsPayOrderV3Request.setFreight(new BigDecimal("0.00"));
        physicalGoodsPayOrderV3Request.setTimeOrdered("2023-12-21 18:00:00");
        physicalGoodsPayOrderV3Request.setRemark("测试订单");
        physicalGoodsPayOrderV3Request.setProvinceCode("320000");
        physicalGoodsPayOrderV3Request.setCityCode("320100");
        physicalGoodsPayOrderV3Request.setLocationCode("320102");
        physicalGoodsPayOrderV3Request.setProvinceName("江苏省");
        physicalGoodsPayOrderV3Request.setCityName("南京市");
        physicalGoodsPayOrderV3Request.setLocationName("玄武区");
        physicalGoodsPayOrderV3Request.setShopName("好看测试药房");
        physicalGoodsPayOrderV3Request.setShopAddress("新街口大洋百货负1楼扶梯旁美食街区A16铺");
        physicalGoodsPayOrderV3Request.setShopPhone("13654545051");

        List<GoodsDetailV3Req> goodsDetailV3ReqList = new ArrayList<>();
        physicalGoodsPayOrderV3Request.setGoodsDetails(goodsDetailV3ReqList);
        GoodsDetailV3Req goodsDetailV3Req = new GoodsDetailV3Req();
        goodsDetailV3Req.setAmount(new BigDecimal("13.11"));
        goodsDetailV3Req.setCostAmount(new BigDecimal("13.11"));
        goodsDetailV3Req.setQuantity(1);
        goodsDetailV3Req.setPrice(new BigDecimal("13.11"));
        goodsDetailV3Req.setGatAmount(new BigDecimal("13.11"));
        goodsDetailV3Req.setFreight(new BigDecimal("0.00"));
        goodsDetailV3Req.setSkuCode("test0001");
        goodsDetailV3Req.setSkuName("测试商品");
        goodsDetailV3Req.setInvoiceType(1);

        goodsDetailV3ReqList.add(goodsDetailV3Req);

        SavePayPhysicalGoodsOrderRes savePayPhysicalGoodsOrderRes = openClient.sellerTradeOrderApi().physicalGoodsCreateOrder(physicalGoodsPayOrderV3Request);
        System.out.println(JSON.toJSONString(savePayPhysicalGoodsOrderRes));
    }

    @Test
    public void testSaveRefundPhysicalGoodsOrder() {
        PhysicalGoodsRefundOrderV3Request physicalGoodsPayOrderV3Request = new PhysicalGoodsRefundOrderV3Request();
        physicalGoodsPayOrderV3Request.setBuyerOpenId("52f838b668524ffb06cd6fce95b91632");
        physicalGoodsPayOrderV3Request.setOrderNo("2023122100000011");
        physicalGoodsPayOrderV3Request.setRefundOrderNo("2023122100000012");
        physicalGoodsPayOrderV3Request.setRefundAmount(new BigDecimal("13.11"));
        physicalGoodsPayOrderV3Request.setCostAmount(new BigDecimal("13.11"));
        physicalGoodsPayOrderV3Request.setFreight(new BigDecimal("0.00"));
        physicalGoodsPayOrderV3Request.setTimeOrdered("2023-12-21 18:00:00");
        physicalGoodsPayOrderV3Request.setRemark("测试订单");
        physicalGoodsPayOrderV3Request.setProvinceCode("320000");
        physicalGoodsPayOrderV3Request.setCityCode("320100");
        physicalGoodsPayOrderV3Request.setLocationCode("320102");
        physicalGoodsPayOrderV3Request.setProvinceName("江苏省");
        physicalGoodsPayOrderV3Request.setCityName("南京市");
        physicalGoodsPayOrderV3Request.setLocationName("玄武区");
        physicalGoodsPayOrderV3Request.setShopName("好看测试药房");
        physicalGoodsPayOrderV3Request.setShopAddress("新街口大洋百货负1楼扶梯旁美食街区A16铺");
        physicalGoodsPayOrderV3Request.setShopPhone("13654545051");

        List<GoodsDetailV3Req> goodsDetailV3ReqList = new ArrayList<>();
        physicalGoodsPayOrderV3Request.setGoodsDetails(goodsDetailV3ReqList);
        GoodsDetailV3Req goodsDetailV3Req = new GoodsDetailV3Req();
        goodsDetailV3Req.setAmount(new BigDecimal("13.11"));
        goodsDetailV3Req.setCostAmount(new BigDecimal("13.11"));
        goodsDetailV3Req.setQuantity(1);
        goodsDetailV3Req.setPrice(new BigDecimal("13.11"));
        goodsDetailV3Req.setGatAmount(new BigDecimal("13.11"));
        goodsDetailV3Req.setFreight(new BigDecimal("0.00"));
        goodsDetailV3Req.setSkuCode("test0001");
        goodsDetailV3Req.setSkuName("测试商品");
        goodsDetailV3Req.setInvoiceType(1);

        goodsDetailV3ReqList.add(goodsDetailV3Req);

        SaveRefundPhysicalGoodsOrderRes saveRefundPhysicalGoodsOrderRes = openClient.sellerTradeOrderApi().physicalGoodsRefundOrder(physicalGoodsPayOrderV3Request);
        System.out.println(JSON.toJSONString(saveRefundPhysicalGoodsOrderRes));
    }

    @Test
    public void testPhysicalGoodsCancelOrder() {
        PhysicalGoodsCancelOrderV3Request physicalGoodsCancelOrderV3Request = new PhysicalGoodsCancelOrderV3Request();
//        physicalGoodsCancelOrderV3Request.setVersion("1.0.3");
        physicalGoodsCancelOrderV3Request.setOrderNo("2023122100000010");


        CancelPhysicalGoodsOrderRes cancelPhysicalGoodsOrderRes = openClient.sellerTradeOrderApi().physicalGoodsCancelOrder(physicalGoodsCancelOrderV3Request);
        System.out.println(JSON.toJSONString(cancelPhysicalGoodsOrderRes));
    }

    @Test
    public void testSavePayPhysicalGoodsOrders() {
        PhysicalGoodsPayOrdersV3Request physicalGoodsPayOrdersV3Request = new PhysicalGoodsPayOrdersV3Request();
        physicalGoodsPayOrdersV3Request.setBuyerOpenId("52f838b668524ffb06cd6fce95b91632");
        physicalGoodsPayOrdersV3Request.setOrderNo("2024011100000001");
        physicalGoodsPayOrdersV3Request.setTotalAmount(new BigDecimal("23.11"));
        physicalGoodsPayOrdersV3Request.setPayAmount(new BigDecimal("23.11"));
        physicalGoodsPayOrdersV3Request.setCostAmount(new BigDecimal("23.11"));
        physicalGoodsPayOrdersV3Request.setFreight(new BigDecimal("0.00"));
        physicalGoodsPayOrdersV3Request.setTimeOrdered("2024-01-11 11:00:00");
        physicalGoodsPayOrdersV3Request.setRemark("测试订单");
        physicalGoodsPayOrdersV3Request.setProvinceCode("320000");
        physicalGoodsPayOrdersV3Request.setCityCode("320100");
        physicalGoodsPayOrdersV3Request.setLocationCode("320102");
        physicalGoodsPayOrdersV3Request.setProvinceName("江苏省");
        physicalGoodsPayOrdersV3Request.setCityName("南京市");
        physicalGoodsPayOrdersV3Request.setLocationName("玄武区");
        physicalGoodsPayOrdersV3Request.setShopName("好看测试药房");
        physicalGoodsPayOrdersV3Request.setShopAddress("新街口大洋百货负1楼扶梯旁美食街区A16铺");
        physicalGoodsPayOrdersV3Request.setShopPhone("13654545051");

        List<PhysicalGoodsPayOrdersV3Request.SubOrder> subOrders = new ArrayList<>();
        physicalGoodsPayOrdersV3Request.setSubOrders(subOrders);
        PhysicalGoodsPayOrdersV3Request.SubOrder subOrder = getSubOrder();
        PhysicalGoodsPayOrdersV3Request.SubOrder subOrder2 = getSubOrder2();

        subOrders.add(subOrder);
        subOrders.add(subOrder2);

        SavePayPhysicalGoodsOrderRes savePayPhysicalGoodsOrderRes = openClient.sellerTradeOrderApi().physicalGoodsCreateOrders(physicalGoodsPayOrdersV3Request);
        System.out.println(JSON.toJSONString(savePayPhysicalGoodsOrderRes));
    }

    private static PhysicalGoodsPayOrdersV3Request.SubOrder getSubOrder2() {
        PhysicalGoodsPayOrdersV3Request.SubOrder subOrder2 = new PhysicalGoodsPayOrdersV3Request.SubOrder();
        subOrder2.setSubOrderNo("2024011100000003");
        subOrder2.setSubTotalAmount(new BigDecimal("10.00"));
        subOrder2.setSubPayAmount(new BigDecimal("10.00"));
        subOrder2.setSubCostAmount(new BigDecimal("10.00"));
        subOrder2.setSubFreight(new BigDecimal("0.00"));
        subOrder2.setShopAddress("新街口大洋百货负1楼扶梯旁美食街区A16铺");
        subOrder2.setShopPhone("13654545051");
        List<GoodsDetailV3Req> goodsDetailV3ReqList = new ArrayList<>();
        GoodsDetailV3Req goodsDetailV3Req = new GoodsDetailV3Req();
        goodsDetailV3Req.setAmount(new BigDecimal("10.00"));
        goodsDetailV3Req.setCostAmount(new BigDecimal("10.00"));
        goodsDetailV3Req.setQuantity(1);
        goodsDetailV3Req.setPrice(new BigDecimal("10.00"));
        goodsDetailV3Req.setGatAmount(new BigDecimal("10.00"));
        goodsDetailV3Req.setFreight(new BigDecimal("0.00"));
        goodsDetailV3Req.setSkuCode("test0002");
        goodsDetailV3Req.setSkuName("测试商品2");
        goodsDetailV3Req.setInvoiceType(1);

        goodsDetailV3ReqList.add(goodsDetailV3Req);
        subOrder2.setGoodsDetails(goodsDetailV3ReqList);
        return subOrder2;
    }

    private static PhysicalGoodsPayOrdersV3Request.SubOrder getSubOrder() {
        PhysicalGoodsPayOrdersV3Request.SubOrder subOrder = new PhysicalGoodsPayOrdersV3Request.SubOrder();
        subOrder.setSubOrderNo("2024011100000002");
        subOrder.setSubTotalAmount(new BigDecimal("13.11"));
        subOrder.setSubPayAmount(new BigDecimal("13.11"));
        subOrder.setSubCostAmount(new BigDecimal("13.11"));
        subOrder.setSubFreight(new BigDecimal("0.00"));
        subOrder.setShopAddress("新街口大洋百货负1楼扶梯旁美食街区A16铺");
        subOrder.setShopPhone("13654545051");
        List<GoodsDetailV3Req> goodsDetailV3ReqList = new ArrayList<>();
        GoodsDetailV3Req goodsDetailV3Req = new GoodsDetailV3Req();
        goodsDetailV3Req.setAmount(new BigDecimal("13.11"));
        goodsDetailV3Req.setCostAmount(new BigDecimal("13.11"));
        goodsDetailV3Req.setQuantity(1);
        goodsDetailV3Req.setPrice(new BigDecimal("13.11"));
        goodsDetailV3Req.setGatAmount(new BigDecimal("13.11"));
        goodsDetailV3Req.setFreight(new BigDecimal("0.00"));
        goodsDetailV3Req.setSkuCode("test0001");
        goodsDetailV3Req.setSkuName("测试商品");
        goodsDetailV3Req.setInvoiceType(1);

        goodsDetailV3ReqList.add(goodsDetailV3Req);
        subOrder.setGoodsDetails(goodsDetailV3ReqList);
        return subOrder;
    }
}
