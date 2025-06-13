/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model.notify;

public class BaseMsg {
    String timestamp;
    String nonce;
    String msgEncrypt;
    String msgSignature;

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    public String getNonce() {
        return nonce;
    }

    public void setNonce(String nonce) {
        this.nonce = nonce;
    }

    public String getMsgEncrypt() {
        return msgEncrypt;
    }

    public void setMsgEncrypt(String msgEncrypt) {
        this.msgEncrypt = msgEncrypt;
    }

    public String getMsgSignature() {
        return msgSignature;
    }

    public void setMsgSignature(String msgSignature) {
        this.msgSignature = msgSignature;
    }
}
