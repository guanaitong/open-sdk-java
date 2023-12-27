/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.response;

import com.gat.open.sdk.seller.model.request.GoodsDetailV3Req;

import java.math.BigDecimal;
import java.util.List;


public class ExcashierV3TradeInfo {
    /**
     * 第三方订单号
     */
    private String thirdTradeNo;

    private BigDecimal thirdTotalAmount;

    private BigDecimal thirdPayAmount;

    private BigDecimal thirdCostAmount;

    private BigDecimal thirdDeliveryFee;

    private Integer isThirdOrders;

    private List<ThirdOrder> thirdOrders;

    private List<GoodsDetailV3Req> goodsDetail;

    public String getThirdTradeNo() {
        return thirdTradeNo;
    }

    public void setThirdTradeNo(String thirdTradeNo) {
        this.thirdTradeNo = thirdTradeNo;
    }

    public BigDecimal getThirdTotalAmount() {
        return thirdTotalAmount;
    }

    public void setThirdTotalAmount(BigDecimal thirdTotalAmount) {
        this.thirdTotalAmount = thirdTotalAmount;
    }

    public BigDecimal getThirdPayAmount() {
        return thirdPayAmount;
    }

    public void setThirdPayAmount(BigDecimal thirdPayAmount) {
        this.thirdPayAmount = thirdPayAmount;
    }

    public BigDecimal getThirdCostAmount() {
        return thirdCostAmount;
    }

    public void setThirdCostAmount(BigDecimal thirdCostAmount) {
        this.thirdCostAmount = thirdCostAmount;
    }

    public BigDecimal getThirdDeliveryFee() {
        return thirdDeliveryFee;
    }

    public void setThirdDeliveryFee(BigDecimal thirdDeliveryFee) {
        this.thirdDeliveryFee = thirdDeliveryFee;
    }

    public Integer getIsThirdOrders() {
        return isThirdOrders;
    }

    public void setIsThirdOrders(Integer isThirdOrders) {
        this.isThirdOrders = isThirdOrders;
    }

    public List<ThirdOrder> getThirdOrders() {
        return thirdOrders;
    }

    public void setThirdOrders(List<ThirdOrder> thirdOrders) {
        this.thirdOrders = thirdOrders;
    }

    public List<GoodsDetailV3Req> getGoodsDetail() {
        return goodsDetail;
    }

    public void setGoodsDetail(List<GoodsDetailV3Req> goodsDetail) {
        this.goodsDetail = goodsDetail;
    }

    public static class ThirdOrder {

        private String outerTradeNo;

        private String thirdSubTradeNo;


        private BigDecimal thirdSubTotalAmount;

        private BigDecimal thirdSubPayAmount;


        private BigDecimal thirdSubCostAmount;


        private BigDecimal thirdSubDeliveryFee;

        private List<GoodsDetailV3Req> goodsDetail;

        public String getOuterTradeNo() {
            return outerTradeNo;
        }

        public void setOuterTradeNo(String outerTradeNo) {
            this.outerTradeNo = outerTradeNo;
        }

        public String getThirdSubTradeNo() {
            return thirdSubTradeNo;
        }

        public void setThirdSubTradeNo(String thirdSubTradeNo) {
            this.thirdSubTradeNo = thirdSubTradeNo;
        }

        public BigDecimal getThirdSubTotalAmount() {
            return thirdSubTotalAmount;
        }

        public void setThirdSubTotalAmount(BigDecimal thirdSubTotalAmount) {
            this.thirdSubTotalAmount = thirdSubTotalAmount;
        }

        public BigDecimal getThirdSubPayAmount() {
            return thirdSubPayAmount;
        }

        public void setThirdSubPayAmount(BigDecimal thirdSubPayAmount) {
            this.thirdSubPayAmount = thirdSubPayAmount;
        }

        public BigDecimal getThirdSubCostAmount() {
            return thirdSubCostAmount;
        }

        public void setThirdSubCostAmount(BigDecimal thirdSubCostAmount) {
            this.thirdSubCostAmount = thirdSubCostAmount;
        }

        public BigDecimal getThirdSubDeliveryFee() {
            return thirdSubDeliveryFee;
        }

        public void setThirdSubDeliveryFee(BigDecimal thirdSubDeliveryFee) {
            this.thirdSubDeliveryFee = thirdSubDeliveryFee;
        }

        public List<GoodsDetailV3Req> getGoodsDetail() {
            return goodsDetail;
        }

        public void setGoodsDetail(List<GoodsDetailV3Req> goodsDetail) {
            this.goodsDetail = goodsDetail;
        }
    }
}
