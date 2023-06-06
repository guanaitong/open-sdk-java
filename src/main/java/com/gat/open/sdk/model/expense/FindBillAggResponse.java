package com.gat.open.sdk.model.expense;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class FindBillAggResponse {
    String billNo;
    String relatedBillNo;
    @JsonProperty("userid")
    String userId;
    Integer billType;
    BigDecimal enterprisePayAmount;
    BigDecimal enterpriseRefundAmount;
    BigDecimal feeAmount;
    BigDecimal settleAmount;
    String occurTime;
    Integer voucherStatus;
    OrderDetailVO orderDetail;
    RequestDetailVO requestDetail;
    ApproverDetailVO approveDetail;

    public static class OrderDetailVO implements Serializable {
        String outerTradeNo;
        Integer consumeType;
        ReceiverVO receiver;
        List<CommodityVO> commodityList;
        ShopVO shop;

        public String getOuterTradeNo() {
            return outerTradeNo;
        }

        public void setOuterTradeNo(String outerTradeNo) {
            this.outerTradeNo = outerTradeNo;
        }

        public Integer getConsumeType() {
            return consumeType;
        }

        public void setConsumeType(Integer consumeType) {
            this.consumeType = consumeType;
        }

        public ReceiverVO getReceiver() {
            return receiver;
        }

        public void setReceiver(ReceiverVO receiver) {
            this.receiver = receiver;
        }

        public List<CommodityVO> getCommodityList() {
            return commodityList;
        }

        public void setCommodityList(List<CommodityVO> commodityList) {
            this.commodityList = commodityList;
        }

        public ShopVO getShop() {
            return shop;
        }

        public void setShop(ShopVO shop) {
            this.shop = shop;
        }

        public static class ReceiverVO implements Serializable {
            //收货人名字
            String name;
            //收货人地址
            String address;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }
        }


        public static class CommodityVO implements Serializable {
            //商品价格
            BigDecimal price;
            //商品名
            String name;
            //商品数量
            int count;

            public BigDecimal getPrice() {
                return price;
            }

            public void setPrice(BigDecimal price) {
                this.price = price;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getCount() {
                return count;
            }

            public void setCount(int count) {
                this.count = count;
            }
        }


        public static class ShopVO implements Serializable {
            //门店所在城市
            String city;
            //门店地址
            String address;
            //门店名称
            String name;

            public String getCity() {
                return city;
            }

            public void setCity(String city) {
                this.city = city;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }
    }


    public static class RequestDetailVO implements Serializable {
        String requestNo;
        List<String> expenseItemList;
        String costCenterCode;
        String costCenterName;
        Integer personCount;
        BigDecimal personAmount;
        BigDecimal totalAmount;
        BigDecimal usedAmount;
        BigDecimal availableAmount;
        String effectiveStart;
        String effectiveEnd;
        List<String> peerUseridList;

        public String getRequestNo() {
            return requestNo;
        }

        public void setRequestNo(String requestNo) {
            this.requestNo = requestNo;
        }

        public List<String> getExpenseItemList() {
            return expenseItemList;
        }

        public void setExpenseItemList(List<String> expenseItemList) {
            this.expenseItemList = expenseItemList;
        }

        public String getCostCenterCode() {
            return costCenterCode;
        }

        public void setCostCenterCode(String costCenterCode) {
            this.costCenterCode = costCenterCode;
        }

        public String getCostCenterName() {
            return costCenterName;
        }

        public void setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
        }

        public Integer getPersonCount() {
            return personCount;
        }

        public void setPersonCount(Integer personCount) {
            this.personCount = personCount;
        }

        public BigDecimal getPersonAmount() {
            return personAmount;
        }

        public void setPersonAmount(BigDecimal personAmount) {
            this.personAmount = personAmount;
        }

        public BigDecimal getTotalAmount() {
            return totalAmount;
        }

        public void setTotalAmount(BigDecimal totalAmount) {
            this.totalAmount = totalAmount;
        }

        public BigDecimal getUsedAmount() {
            return usedAmount;
        }

        public void setUsedAmount(BigDecimal usedAmount) {
            this.usedAmount = usedAmount;
        }

        public BigDecimal getAvailableAmount() {
            return availableAmount;
        }

        public void setAvailableAmount(BigDecimal availableAmount) {
            this.availableAmount = availableAmount;
        }

        public String getEffectiveStart() {
            return effectiveStart;
        }

        public void setEffectiveStart(String effectiveStart) {
            this.effectiveStart = effectiveStart;
        }

        public String getEffectiveEnd() {
            return effectiveEnd;
        }

        public void setEffectiveEnd(String effectiveEnd) {
            this.effectiveEnd = effectiveEnd;
        }

        public List<String> getPeerUseridList() {
            return peerUseridList;
        }

        public void setPeerUseridList(List<String> peerUseridList) {
            this.peerUseridList = peerUseridList;
        }
    }


    public static class ApproverDetailVO implements Serializable {
        String approveNo;
        String approveExtNo;
        BigDecimal approveAmount;
        String approveTime;
        Integer approveResult;
        String approveItem;
        String approveReason;
        String effectiveStart;
        String effectiveEnd;

        public String getApproveNo() {
            return approveNo;
        }

        public void setApproveNo(String approveNo) {
            this.approveNo = approveNo;
        }

        public String getApproveExtNo() {
            return approveExtNo;
        }

        public void setApproveExtNo(String approveExtNo) {
            this.approveExtNo = approveExtNo;
        }

        public BigDecimal getApproveAmount() {
            return approveAmount;
        }

        public void setApproveAmount(BigDecimal approveAmount) {
            this.approveAmount = approveAmount;
        }

        public String getApproveTime() {
            return approveTime;
        }

        public void setApproveTime(String approveTime) {
            this.approveTime = approveTime;
        }

        public Integer getApproveResult() {
            return approveResult;
        }

        public void setApproveResult(Integer approveResult) {
            this.approveResult = approveResult;
        }

        public String getApproveItem() {
            return approveItem;
        }

        public void setApproveItem(String approveItem) {
            this.approveItem = approveItem;
        }

        public String getApproveReason() {
            return approveReason;
        }

        public void setApproveReason(String approveReason) {
            this.approveReason = approveReason;
        }

        public String getEffectiveStart() {
            return effectiveStart;
        }

        public void setEffectiveStart(String effectiveStart) {
            this.effectiveStart = effectiveStart;
        }

        public String getEffectiveEnd() {
            return effectiveEnd;
        }

        public void setEffectiveEnd(String effectiveEnd) {
            this.effectiveEnd = effectiveEnd;
        }
    }

    public String getBillNo() {
        return billNo;
    }

    public void setBillNo(String billNo) {
        this.billNo = billNo;
    }

    public String getRelatedBillNo() {
        return relatedBillNo;
    }

    public void setRelatedBillNo(String relatedBillNo) {
        this.relatedBillNo = relatedBillNo;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public Integer getBillType() {
        return billType;
    }

    public void setBillType(Integer billType) {
        this.billType = billType;
    }

    public BigDecimal getEnterprisePayAmount() {
        return enterprisePayAmount;
    }

    public void setEnterprisePayAmount(BigDecimal enterprisePayAmount) {
        this.enterprisePayAmount = enterprisePayAmount;
    }

    public BigDecimal getEnterpriseRefundAmount() {
        return enterpriseRefundAmount;
    }

    public void setEnterpriseRefundAmount(BigDecimal enterpriseRefundAmount) {
        this.enterpriseRefundAmount = enterpriseRefundAmount;
    }

    public BigDecimal getFeeAmount() {
        return feeAmount;
    }

    public void setFeeAmount(BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }

    public BigDecimal getSettleAmount() {
        return settleAmount;
    }

    public void setSettleAmount(BigDecimal settleAmount) {
        this.settleAmount = settleAmount;
    }

    public String getOccurTime() {
        return occurTime;
    }

    public void setOccurTime(String occurTime) {
        this.occurTime = occurTime;
    }

    public Integer getVoucherStatus() {
        return voucherStatus;
    }

    public void setVoucherStatus(Integer voucherStatus) {
        this.voucherStatus = voucherStatus;
    }

    public OrderDetailVO getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(OrderDetailVO orderDetail) {
        this.orderDetail = orderDetail;
    }

    public RequestDetailVO getRequestDetail() {
        return requestDetail;
    }

    public void setRequestDetail(RequestDetailVO requestDetail) {
        this.requestDetail = requestDetail;
    }

    public ApproverDetailVO getApproveDetail() {
        return approveDetail;
    }

    public void setApproveDetail(ApproverDetailVO approveDetail) {
        this.approveDetail = approveDetail;
    }
}
