package com.gat.open.sdk.util;


import com.gat.open.sdk.constant.GATOpenConstant;
import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author xin.hua
 * @date 2017/7/18
 */
public class SignUtil {

    private SignUtil() {
        // hide constructor
    }

    public static String sign(Map<String, Object> paramMap) {
        ParamValidator.requireNonEmpty(GATOpenConstant.getAppSecret(), "appsecret 不可为空");
        TreeMap<String, Object> params = new TreeMap<>(paramMap);
        params.remove("sign");
        params.put("appsecret", GATOpenConstant.getAppSecret());
        StringBuilder stringBuilder = new StringBuilder();
        for (Map.Entry<String, Object> entry : params.entrySet()) {
            if (StringUtils.isBlank(entry.getValue().toString())) {
                continue;
            }
            stringBuilder.append(entry.getKey().trim());
            stringBuilder.append("=");
            stringBuilder.append(entry.getValue() == null ? "" : entry.getValue().toString().trim());
            stringBuilder.append("&");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return DigestUtils.sha1Hex(stringBuilder.toString());
    }

}
