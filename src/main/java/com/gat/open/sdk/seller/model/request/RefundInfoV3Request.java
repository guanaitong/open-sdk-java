/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.seller.model.request;

import java.math.BigDecimal;
import java.util.List;

public class RefundInfoV3Request {
    /**
     * 第三方订单号
     */
    private String thirdTradeNo;
    /**
     * 第三方退款订单号
     */
    private String thirdRefundNo;

    private BigDecimal thirdRefundAmount;

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

    public String getThirdRefundNo() {
        return thirdRefundNo;
    }

    public void setThirdRefundNo(String thirdRefundNo) {
        this.thirdRefundNo = thirdRefundNo;
    }

    public BigDecimal getThirdRefundAmount() {
        return thirdRefundAmount;
    }

    public void setThirdRefundAmount(BigDecimal thirdRefundAmount) {
        this.thirdRefundAmount = thirdRefundAmount;
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

        private String thirdSubRefundNo;

        private BigDecimal thirdSubRefundAmount;

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

        public String getThirdSubRefundNo() {
            return thirdSubRefundNo;
        }

        public void setThirdSubRefundNo(String thirdSubRefundNo) {
            this.thirdSubRefundNo = thirdSubRefundNo;
        }

        public BigDecimal getThirdSubRefundAmount() {
            return thirdSubRefundAmount;
        }

        public void setThirdSubRefundAmount(BigDecimal thirdSubRefundAmount) {
            this.thirdSubRefundAmount = thirdSubRefundAmount;
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
