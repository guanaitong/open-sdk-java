/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.trade;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


public class EnterpriseGetTradeDetailResp {
    private String tradeNo; //关爱通的支付单号
    private String subject; //商品描述或交易描述
    private BigDecimal totalAmount; //交易总金额
    private BigDecimal payAmount; //实际支付金额
    private BigDecimal refundAmount; //退款金额
    private Integer status; //交易状态。 1、待支付；2、支付中；3、支付完成； 4、待退款；5、退款中；6、退款；7、已冲正
    private String createTime; //交易创建时间，格式yyyy-MM-dd HH:mm:ss
    private String payTime; //交易支付时间，格式yyyy-MM-dd HH:mm:ss
    private String refundTime; //退款时间，格式yyyy-MM-dd HH:mm:ss
    private List<Order> orderList; // 订单明细

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public BigDecimal getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    public BigDecimal getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(BigDecimal refundAmount) {
        this.refundAmount = refundAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getRefundTime() {
        return refundTime;
    }

    public void setRefundTime(String refundTime) {
        this.refundTime = refundTime;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }

    public static class Order {
        private String deliveryName; //收货人姓名
        private String deliveryPhone; // String类型，收货人手机号
        private String address; //收货地址
        private BigDecimal orderPrice; //订单价格
        private Integer orderStatus; //订单状态1.等待买家付款<br/>2.已付款,待备货<br/>3.已付款，待备货，部分退款中<br/>4.已备货待发货<br/>5.已备货待发货部分退款中<br/>6.已备货待发货退款中<br/>7.已发货待买家确认收货  <br/>8.已发货待买家确认收货部分退款中  <br/>9.已发货待买家确认收货退款中<br/>10.交易成功<br/>11买家取消交易关闭<br/>12客服取消交易关闭<br/>13超时取消交易关闭<br/>14退款成功交易关闭
        private Integer tradeStatus; //买家订单交易状态<br/>1 等待买家付款<br/>2 买家已付款<br/>3 商家已备货<br/>4 商家已发货<br/>5 买家已收货（交易成功）<br/>6 订单取消（交易关闭）
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date timeCreated; //订单成交时间，格式yyyy-MM-dd HH:mm:ss
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date timeDelivery; //发货时间，格式yyyy-MM-dd HH:mm:ss
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date timeDeliveryEnd; // String类型，订单发货截止时间，格式yyyy-MM-dd HH:mm:ss
        @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
        private Date timeClosed; //订单关闭时间，格式yyyy-MM-dd HH:mm:ss
        private BigDecimal logisticsAmount; // BigDecimal类型，运费
        private List<Product> productList; // 商品明细

        public String getDeliveryName() {
            return deliveryName;
        }

        public void setDeliveryName(String deliveryName) {
            this.deliveryName = deliveryName;
        }

        public String getDeliveryPhone() {
            return deliveryPhone;
        }

        public void setDeliveryPhone(String deliveryPhone) {
            this.deliveryPhone = deliveryPhone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public BigDecimal getOrderPrice() {
            return orderPrice;
        }

        public void setOrderPrice(BigDecimal orderPrice) {
            this.orderPrice = orderPrice;
        }

        public Integer getOrderStatus() {
            return orderStatus;
        }

        public void setOrderStatus(Integer orderStatus) {
            this.orderStatus = orderStatus;
        }

        public Integer getTradeStatus() {
            return tradeStatus;
        }

        public void setTradeStatus(Integer tradeStatus) {
            this.tradeStatus = tradeStatus;
        }

        public Date getTimeCreated() {
            return timeCreated;
        }

        public void setTimeCreated(Date timeCreated) {
            this.timeCreated = timeCreated;
        }

        public Date getTimeDelivery() {
            return timeDelivery;
        }

        public void setTimeDelivery(Date timeDelivery) {
            this.timeDelivery = timeDelivery;
        }

        public Date getTimeDeliveryEnd() {
            return timeDeliveryEnd;
        }

        public void setTimeDeliveryEnd(Date timeDeliveryEnd) {
            this.timeDeliveryEnd = timeDeliveryEnd;
        }

        public Date getTimeClosed() {
            return timeClosed;
        }

        public void setTimeClosed(Date timeClosed) {
            this.timeClosed = timeClosed;
        }

        public BigDecimal getLogisticsAmount() {
            return logisticsAmount;
        }

        public void setLogisticsAmount(BigDecimal logisticsAmount) {
            this.logisticsAmount = logisticsAmount;
        }

        public List<Product> getProductList() {
            return productList;
        }

        public void setProductList(List<Product> productList) {
            this.productList = productList;
        }

        public static class Product {
            private String spuCode; //商品code
            private String spuName; //商品名称
            private String productTitle; //商品标题
            private String skuCode; //sku_code
            private String skuName; //sku_name
            private String skuPicUrl; // String类型，单规格商品的图片，默认取商品的第一张头图
            private String skuCategory; // 规格信息(商品销售属性)
            private BigDecimal currentPrice; // BigDecimal类型，现价
            private BigDecimal dealPrice; // BigDecimal类型，成交价
            private Integer purchaseNum; // //购买数量

            public String getSpuCode() {
                return spuCode;
            }

            public void setSpuCode(String spuCode) {
                this.spuCode = spuCode;
            }

            public String getSpuName() {
                return spuName;
            }

            public void setSpuName(String spuName) {
                this.spuName = spuName;
            }

            public String getProductTitle() {
                return productTitle;
            }

            public void setProductTitle(String productTitle) {
                this.productTitle = productTitle;
            }

            public String getSkuCode() {
                return skuCode;
            }

            public void setSkuCode(String skuCode) {
                this.skuCode = skuCode;
            }

            public String getSkuName() {
                return skuName;
            }

            public void setSkuName(String skuName) {
                this.skuName = skuName;
            }

            public String getSkuPicUrl() {
                return skuPicUrl;
            }

            public void setSkuPicUrl(String skuPicUrl) {
                this.skuPicUrl = skuPicUrl;
            }

            public String getSkuCategory() {
                return skuCategory;
            }

            public void setSkuCategory(String skuCategory) {
                this.skuCategory = skuCategory;
            }

            public BigDecimal getCurrentPrice() {
                return currentPrice;
            }

            public void setCurrentPrice(BigDecimal currentPrice) {
                this.currentPrice = currentPrice;
            }

            public BigDecimal getDealPrice() {
                return dealPrice;
            }

            public void setDealPrice(BigDecimal dealPrice) {
                this.dealPrice = dealPrice;
            }

            public Integer getPurchaseNum() {
                return purchaseNum;
            }

            public void setPurchaseNum(Integer purchaseNum) {
                this.purchaseNum = purchaseNum;
            }
        }
    }
}
