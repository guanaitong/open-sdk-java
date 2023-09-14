/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.util;

import com.gat.open.sdk.exception.OpenSdkException;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.Key;
import java.util.Base64;

public class AESCrypt {
    private static final String AESTYPE = "AES/ECB/PKCS5Padding";

    public static String encode(final String secretKey, final String plainText) {
        return encode(secretKey.getBytes(StandardCharsets.UTF_8), plainText);
    }

    public static String encode(final byte[] secretKey, final String plainText) {
        Key key = new SecretKeySpec(secretKey, "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESTYPE); //NOSONAR
            cipher.init(Cipher.ENCRYPT_MODE, key);
            byte[] encryptedText = cipher.doFinal(plainText.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(encryptedText);
        } catch (Exception e) {
            throw new OpenSdkException("AES encode error for plainText:" + plainText, e);
        }
    }

    public static String decode(final String secretKey, final String cipherText) {
        return decode(secretKey.getBytes(StandardCharsets.UTF_8), cipherText);
    }

    public static String decode(final byte[] secretKey, final String cipherText) {
        Key key = new SecretKeySpec(secretKey, "AES");
        try {
            Cipher cipher = Cipher.getInstance(AESTYPE); //NOSONAR
            cipher.init(Cipher.DECRYPT_MODE, key);
            byte[] originBytes = cipher.doFinal(Base64.getDecoder().decode(cipherText));
            return new String(originBytes, StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new OpenSdkException("AES decode error for cipherText:" + cipherText, e);
        }
    }
}
