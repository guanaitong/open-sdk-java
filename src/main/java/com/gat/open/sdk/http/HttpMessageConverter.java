/*
 * Copyright 2007-2025, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.http;

import com.gat.open.sdk.model.ApiResponse;

import java.lang.reflect.Type;

public interface HttpMessageConverter {

    /**
     * @param body response body
     * @param type data type
     * @param <T>
     * @return
     */
    <T> ApiResponse<T> read(byte[] body, Type type);

    /**
     * @param i
     * @param oClass
     * @param <I>
     * @param <O>
     * @return
     */
    <I, O> O write(I i, Class<O> oClass);

    default <I> String writeToString(I i) {
        return write(i, String.class);
    }
}
