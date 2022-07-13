/*
 * Copyright 2007-2022, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.tool;

import com.gat.open.sdk.exception.OpenSdkException;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.util.Base64;

public class AESCrypt {
    private static final String AESTYPE = "AES/ECB/PKCS5Padding";

    public static String encode(final String secretKey, final String plainText) {
        return encode(Bytes.toBytes(secretKey), plainText);
    }

    public static String encode(final byte[] secretKey, final String plainText) {
        Key key = new SecretKeySpec(secretKey, "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESTYPE); //NOSONAR
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptedText = cipher.doFinal(Bytes.toBytes(plainText));
            return Base64.getEncoder().encodeToString(encryptedText);
        } catch (Exception e) {
            throw new OpenSdkException("AES encode error for plainText:" + plainText, e);
        }
    }

    public static String decode(final String secretKey, final String cipherText) {
        return decode(Bytes.toBytes(secretKey), cipherText);
    }

    public static String decode(final byte[] secretKey, final String cipherText) {
        Key key = new SecretKeySpec(secretKey, "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESTYPE); //NOSONAR
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] originBytes = cipher.doFinal(Base64.getDecoder().decode(cipherText));
            return Bytes.toString(originBytes);
        } catch (Exception e) {
            throw new OpenSdkException("AES decode error for cipherText:" + cipherText, e);
        }
    }
}
