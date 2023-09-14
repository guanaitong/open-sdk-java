/*
 * Copyright 2007-2023, CIIC Guanaitong, Co., Ltd.
 * All rights reserved.
 */

package com.gat.open.sdk.model;

import com.gat.open.sdk.exception.OpenSdkException;
import com.gat.open.sdk.util.JSON;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;


/**
 * Created by August.Zhou on 2022/6/27 12:25
 */
public abstract class FormRequest<T> extends ApiRequest<T> {

    @Override
    public final Map<String, String> toRequestParams() {
        BeanInfo beanInfo = null;
        try {
            beanInfo = Introspector.getBeanInfo(this.getClass());
        } catch (IntrospectionException e) {
            throw new OpenSdkException(e);
        }
        PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();
        Map<String, String> params = new HashMap<>();
        for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
            String name = propertyDescriptor.getName();
            if ("class".equals(name)) {
                continue;
            }
            Method readMethod = propertyDescriptor.getReadMethod();
            if (readMethod != null) {
                if (!Modifier.isPublic(readMethod.getDeclaringClass().getModifiers())) {
                    readMethod.setAccessible(true);
                }
                try {
                    String key = "";
                    Object value = readMethod.invoke(this);
                    if (Objects.nonNull(value)) {
                        String textValue = null;
                        FormField formField = readMethod.getDeclaredAnnotation(FormField.class);
                        if (formField != null) {
                            if (!formField.value().isEmpty()) {
                                key = formField.value();
                            }
                            if (formField.converter() == FormField.TextConverter.JOIN) {
                                textValue = String.join(",", (Iterable<? extends CharSequence>) value);
                            } else if (formField.converter() == FormField.TextConverter.JSON) {
                                textValue = JSON.toJSONString(value);
                            } else {
                                textValue = value.toString().trim();
                            }
                        } else {
                            textValue = value.toString().trim();
                        }
                        if (key.isEmpty()) {
                            key = camelToSnake(name.trim());
                        }

                        if (!textValue.isEmpty()) {
                            params.put(key, textValue);
                        }
                    }
                } catch (Exception ex) {
                    throw new OpenSdkException("Could not copy property '" + name + "' from source to target", ex);
                }
            }
        }
        return params;
    }

    public static String camelToSnake(String str) {
        // Regular Expression
        String regex = "([a-z])([A-Z]+)";

        // Replacement string
        String replacement = "$1_$2";

        // Replace the given regex
        // with replacement string
        // and convert it to lower case.
        str = str.replaceAll(regex, replacement).toLowerCase();

        // return string
        return str;
    }

}
