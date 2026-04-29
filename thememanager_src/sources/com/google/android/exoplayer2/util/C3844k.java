package com.google.android.exoplayer2.util;

import android.os.Looper;
import android.text.TextUtils;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull;
import org.checkerframework.dataflow.qual.Pure;

/* JADX INFO: renamed from: com.google.android.exoplayer2.util.k */
/* JADX INFO: compiled from: Assertions.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3844k {
    private C3844k() {
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T f7l8(@zy.dd T t2) {
        t2.getClass();
        return t2;
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: g */
    public static String m13628g(@zy.dd String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
        return str;
    }

    @Pure
    /* JADX INFO: renamed from: k */
    public static void m13629k(boolean z2) {
        if (!z2) {
            throw new IllegalArgumentException();
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T ld6(@zy.dd T t2) {
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException();
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: n */
    public static String m13630n(@zy.dd String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException();
        }
        return str;
    }

    @Pure
    /* JADX INFO: renamed from: p */
    public static void m13631p(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    @Pure
    /* JADX INFO: renamed from: q */
    public static void m13632q() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Not in applications main thread");
        }
    }

    @Pure
    /* JADX INFO: renamed from: s */
    public static void m13633s(boolean z2) {
        if (!z2) {
            throw new IllegalStateException();
        }
    }

    @Pure
    public static void toq(boolean z2, Object obj) {
        if (!z2) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    @EnsuresNonNull({"#1"})
    @Pure
    public static <T> T x2(@zy.dd T t2, Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new IllegalStateException(String.valueOf(obj));
    }

    @EnsuresNonNull({"#1"})
    @Pure
    /* JADX INFO: renamed from: y */
    public static <T> T m13634y(@zy.dd T t2, Object obj) {
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    @Pure
    public static int zy(int i2, int i3, int i4) {
        if (i2 < i3 || i2 >= i4) {
            throw new IndexOutOfBoundsException();
        }
        return i2;
    }
}
