package com.google.common.util.concurrent;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Atomics.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
public final class ki {
    private ki() {
    }

    /* JADX INFO: renamed from: k */
    public static <V> AtomicReference<V> m16968k() {
        return new AtomicReference<>();
    }

    /* JADX INFO: renamed from: q */
    public static <E> AtomicReferenceArray<E> m16969q(E[] eArr) {
        return new AtomicReferenceArray<>(eArr);
    }

    public static <V> AtomicReference<V> toq(@NullableDecl V v2) {
        return new AtomicReference<>(v2);
    }

    public static <E> AtomicReferenceArray<E> zy(int i2) {
        return new AtomicReferenceArray<>(i2);
    }
}
