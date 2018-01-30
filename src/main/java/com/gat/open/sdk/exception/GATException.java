package com.gat.open.sdk.exception;

/**
 * Created by xin.hua on 2017/7/18.
 */
public class GATException extends RuntimeException {

    public GATException(Throwable cause) {
        super(cause);
    }

    public GATException(String message) {
        super(message);
    }

    public GATException(String message, Throwable cause) {
        super(message, cause);
    }

}
