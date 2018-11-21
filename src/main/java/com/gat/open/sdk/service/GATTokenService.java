package com.gat.open.sdk.service;


import com.gat.open.sdk.api.TokenApi;
import com.gat.open.sdk.constant.GATOpenConstant;
import com.gat.open.sdk.exception.GATException;
import com.gat.open.sdk.model.ApiResponse;
import com.gat.open.sdk.model.Token;
import com.gat.open.sdk.util.CallUtil;
import com.gat.open.sdk.util.RetrofitFactory;

/**
 * 验证Token以及刷新token
 *
 * @author xin.hua
 * @date 2017/7/18
 */
public class GATTokenService {

    private static volatile GATToken gatToken = new GATToken();

    public static synchronized void refreshToken() {
        if (!isValid()) {
            ApiResponse<Token> response = CallUtil.execute(RetrofitFactory.getInstance().getApi(TokenApi.class).createToken(GATOpenConstant.appId));
            if (response == null || response.getData() == null) {
                String msg = "";
                if (response != null) {
                    msg = response.getMsg();
                }
                throw new GATException("获取token失败！" + msg);
            }
            gatToken.setAccessToken(response.getData().getAccessToken());
            gatToken.setExpiresIn(response.getData().getExpiresIn());
            gatToken.setCreateTime(System.currentTimeMillis());
        }
    }

    public static boolean isValid() {
        return gatToken != null && gatToken.getAccessToken() != null && !gatToken.isExpired();
    }

    public static String getGatToken() {
        if (!isValid()) {
            refreshToken();
        }
        return gatToken.accessToken;
    }


    private static class GATToken {


        /**
         * access_token : cde2c369fab499c0bf0643bb1844e70c
         * expires_in : 3600
         */

        private String accessToken;
        private int expiresIn;
        private long createTime;

        public String getAccessToken() {
            return accessToken;
        }

        public void setAccessToken(String accessToken) {
            this.accessToken = accessToken;
        }

        public int getExpiresIn() {
            return expiresIn;
        }

        public void setExpiresIn(int expiresIn) {
            this.expiresIn = expiresIn;
        }

        public long getCreateTime() {
            return createTime;
        }

        public void setCreateTime(long createTime) {
            this.createTime = createTime;
        }

        public boolean isExpired() {
            return (System.currentTimeMillis() - createTime) / 1000 > (expiresIn - 600);
        }
    }
}
