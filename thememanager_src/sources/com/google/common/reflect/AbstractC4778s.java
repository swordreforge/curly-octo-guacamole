package com.google.common.reflect;

import com.google.common.base.jk;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: renamed from: com.google.common.reflect.s */
/* JADX INFO: compiled from: TypeCapture.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class AbstractC4778s<T> {
    AbstractC4778s() {
    }

    final Type capture() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        jk.fn3e(genericSuperclass instanceof ParameterizedType, "%s isn't parameterized", genericSuperclass);
        return ((ParameterizedType) genericSuperclass).getActualTypeArguments()[0];
    }
}
