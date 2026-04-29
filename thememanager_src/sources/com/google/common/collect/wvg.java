package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ClassToInstanceMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface wvg<B> extends Map<Class<? extends B>, B> {
    <T extends B> T getInstance(Class<T> cls);

    @CanIgnoreReturnValue
    <T extends B> T putInstance(Class<T> cls, @NullableDecl T t2);
}
