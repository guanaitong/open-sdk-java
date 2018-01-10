package com.ciicgat.open.sdk.exception;

/**
 * @author Stanley Shen
 * @version 1.0.0
 * @date 2017/12/18 20:04
 */
public class OpenSdkException extends RuntimeException {

    private int errorCode;
    private String errorMsg;
    private String method;
    private String field;

    public OpenSdkException(int errorCode, String field, String methodName, String msg) {
        this.errorCode = errorCode;
        this.field = field;
        this.method = methodName;
        this.errorMsg = "method：[ " + methodName + " ] ,field：[ " + field + " ] invalid，detail：" + msg;
    }

    public OpenSdkException(int errorCode, String methodName, String msg) {
        this.errorCode = errorCode;
        this.method = methodName;
        this.errorMsg = "method：[ " + methodName + " ] execute error，detail：" + msg;
    }

    public OpenSdkException(String message) {
        super(message);
    }

    public OpenSdkException(String message, Throwable cause) {
        super(message, cause);
    }

    public OpenSdkException(Throwable cause) {
        super(cause);
    }

    public int getErrorCode() {
        return this.errorCode;
    }

    public String getErrorMsg() {
        return this.errorMsg;
    }

    public String getMethod() {
        return this.method;
    }

    public String getField() {
        return this.field;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("OpenSdkException occurred, errorCode=" + this.errorCode + ",errorMsg=" + this.errorMsg);
        return sb.toString();
    }
}
