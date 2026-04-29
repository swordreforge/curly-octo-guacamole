package com.google.android.exoplayer2;

import android.annotation.SuppressLint;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: RendererCapabilities.java */
/* JADX INFO: loaded from: classes2.dex */
public interface cv06 {
    public static final int b1th = 32;
    public static final int b71 = 24;
    public static final int bwu = 32;
    public static final int ckgh = 8;

    @Deprecated
    public static final int cwso = 4;

    @Deprecated
    public static final int df = 0;
    public static final int g4 = 0;
    public static final int hwy = 0;
    public static final int k3pw = 16;
    public static final int p39g = 7;

    @Deprecated
    public static final int p87 = 1;

    @Deprecated
    public static final int wg7n = 3;

    @Deprecated
    public static final int wwzu = 2;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.cv06$k */
    /* JADX INFO: compiled from: RendererCapabilities.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3280k {
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.cv06$q */
    /* JADX INFO: compiled from: RendererCapabilities.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3281q {
    }

    /* JADX INFO: compiled from: RendererCapabilities.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    /* JADX INFO: compiled from: RendererCapabilities.java */
    @Deprecated
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface zy {
    }

    @SuppressLint({"WrongConstant"})
    static int cdj(int i2, int i3, int i4) {
        return i2 | i3 | i4;
    }

    /* JADX INFO: renamed from: p */
    static int m11557p(int i2) {
        return cdj(i2, 0, 0);
    }

    @SuppressLint({"WrongConstant"})
    /* JADX INFO: renamed from: s */
    static int m11558s(int i2) {
        return i2 & 24;
    }

    @SuppressLint({"WrongConstant"})
    static int toq(int i2) {
        return i2 & 32;
    }

    @SuppressLint({"WrongConstant"})
    static int wvg(int i2) {
        return i2 & 7;
    }

    int fn3e() throws ki;

    String getName();

    /* JADX INFO: renamed from: k */
    int mo11518k(xwq3 xwq3Var) throws ki;

    /* JADX INFO: renamed from: n */
    int mo11551n();
}
