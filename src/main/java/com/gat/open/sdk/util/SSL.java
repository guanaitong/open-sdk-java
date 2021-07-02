/*
 * Copyright 2007-2021, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.util;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import java.security.KeyManagementException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;

/**
 *
 */
public class SSL {
    public static final X509TrustManager x509TrustManager;
    public static final HostnameVerifier hostnameVerifier;
    public static final SSLSocketFactory sslSocketFactory;
    static boolean trustAny = false;

    static {
        try {
            final X509TrustManager systemDefaultTrustManager = systemDefaultTrustManager();
            // Create a trust manager that does not validate certificate chains
            x509TrustManager = new X509TrustManager() {

                X509Certificate[] EMPTY = new X509Certificate[0];

                @Override
                public void checkClientTrusted(
                        X509Certificate[] chain,
                        String authType) throws CertificateException {
                    if (trustAny) {
                        return;
                    }
                    systemDefaultTrustManager.checkClientTrusted(chain, authType);
                }

                @Override
                public void checkServerTrusted(
                        X509Certificate[] chain,
                        String authType) throws CertificateException {
                    if (trustAny) {
                        return;
                    }
                    try {
                        X509Certificate x509Certificate = chain[0];
                        String name = x509Certificate.getSubjectDN().getName().toLowerCase();
                        //信任关爱通的证书
                        if (name.contains("guanaitong") || name.contains("ciicgat") || name.contains("4008885818")) {
                            return;
                        }
                        systemDefaultTrustManager.checkServerTrusted(chain, authType);
                    } catch (CertificateException e) {
                        throw e;
                    } catch (Throwable e) {
                        throw new CertificateException(e);
                    }
                }


                @Override
                public X509Certificate[] getAcceptedIssuers() {
                    if (trustAny) {
                        return EMPTY;
                    }
                    return systemDefaultTrustManager.getAcceptedIssuers();
                }
            };

            hostnameVerifier = (s, sslSession) -> {
                if (trustAny) {
                    return true;
                }
                return okhttp3.internal.tls.OkHostnameVerifier.INSTANCE.verify(s, sslSession);
            };
            sslSocketFactory = systemDefaultSslSocketFactory(x509TrustManager);
        } catch (Throwable e) {
            throw new AssertionError(e);
        }
    }


    private static X509TrustManager systemDefaultTrustManager() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(
                TrustManagerFactory.getDefaultAlgorithm());
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        if (trustManagers.length != 1 || !(trustManagers[0] instanceof X509TrustManager)) {
            throw new IllegalStateException("Unexpected default trust managers:"
                    + Arrays.toString(trustManagers));
        }
        return (X509TrustManager) trustManagers[0];
    }

    private static SSLSocketFactory systemDefaultSslSocketFactory(X509TrustManager trustManager) throws NoSuchAlgorithmException, KeyManagementException {
        SSLContext sslContext = SSLContext.getInstance("TLS");
        sslContext.init(null, new TrustManager[]{trustManager}, null);
        return sslContext.getSocketFactory();
    }
}
