/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.http;

import java.lang.reflect.Type;

import com.gat.open.sdk.model.ApiResponse;

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
