package com.ciicgat.open.sdk.exception;

/**
 * 参数异常
 * Created by xin.hua on 2017/7/19.
 */
public class GATIllegalArgumentException extends RuntimeException {

    public GATIllegalArgumentException(int index,String methodName,String msg) {
        super("方法： "+methodName+" 第"+index+" 个参数校验失败，错误信息："+msg);
    }

    public GATIllegalArgumentException(String message) {
        super(message);
    }

    public GATIllegalArgumentException(String message, Throwable cause) {
        super(message, cause);
    }

    public GATIllegalArgumentException(Throwable cause) {
        super(cause);
    }
}
