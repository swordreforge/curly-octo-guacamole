package com.google.common.reflect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: TypeToInstanceMap.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public interface x2<B> extends Map<qrj<? extends B>, B> {
    @NullableDecl
    <T extends B> T getInstance(Class<T> cls);

    @CanIgnoreReturnValue
    @NullableDecl
    <T extends B> T putInstance(Class<T> cls, @NullableDecl T t2);

    @CanIgnoreReturnValue
    @NullableDecl
    <T extends B> T qrj(qrj<T> qrjVar, @NullableDecl T t2);

    @NullableDecl
    /* JADX INFO: renamed from: s */
    <T extends B> T mo16761s(qrj<T> qrjVar);
}
