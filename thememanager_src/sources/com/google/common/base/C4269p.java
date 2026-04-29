package com.google.common.base;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.base.p */
/* JADX INFO: compiled from: Defaults.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public final class C4269p {

    /* JADX INFO: renamed from: k */
    private static final Double f25733k = Double.valueOf(0.0d);

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Float f68109toq = Float.valueOf(0.0f);

    private C4269p() {
    }

    @NullableDecl
    /* JADX INFO: renamed from: k */
    public static <T> T m15449k(Class<T> cls) {
        jk.a9(cls);
        if (cls == Boolean.TYPE) {
            return (T) Boolean.FALSE;
        }
        if (cls == Character.TYPE) {
            return (T) (char) 0;
        }
        if (cls == Byte.TYPE) {
            return (T) (byte) 0;
        }
        if (cls == Short.TYPE) {
            return (T) (short) 0;
        }
        if (cls == Integer.TYPE) {
            return (T) 0;
        }
        if (cls == Long.TYPE) {
            return (T) 0L;
        }
        if (cls == Float.TYPE) {
            return (T) f68109toq;
        }
        if (cls == Double.TYPE) {
            return (T) f25733k;
        }
        return null;
    }
}
