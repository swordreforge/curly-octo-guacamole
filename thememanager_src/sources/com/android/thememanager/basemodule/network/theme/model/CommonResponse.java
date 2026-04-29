package com.android.thememanager.basemodule.network.theme.model;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes.dex */
public class CommonResponse<T> extends EmptyResponse {
    public T apiData;

    public static ParameterizedType type(final Class raw, final Type... args) {
        return new ParameterizedType() { // from class: com.android.thememanager.basemodule.network.theme.model.CommonResponse.1
            @Override // java.lang.reflect.ParameterizedType
            public Type[] getActualTypeArguments() {
                return args;
            }

            @Override // java.lang.reflect.ParameterizedType
            public Type getOwnerType() {
                return null;
            }

            @Override // java.lang.reflect.ParameterizedType
            public Type getRawType() {
                return raw;
            }
        };
    }
}
