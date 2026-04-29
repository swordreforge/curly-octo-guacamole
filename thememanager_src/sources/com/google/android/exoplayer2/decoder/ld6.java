package com.google.android.exoplayer2.decoder;

import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.dd;

/* JADX INFO: compiled from: DecoderReuseEvaluation.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ld6 {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f63556cdj = 128;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f63557f7l8 = 1;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final int f63558fn3e = 2048;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f63559fu4 = 16384;

    /* JADX INFO: renamed from: g */
    public static final int f19580g = 0;

    /* JADX INFO: renamed from: h */
    public static final int f19581h = 64;

    /* JADX INFO: renamed from: i */
    public static final int f19582i = 1024;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f63560ki = 256;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final int f63561kja0 = 32;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f63562ld6 = 2;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final int f63563n7h = 16;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final int f63564ni7 = 8192;

    /* JADX INFO: renamed from: p */
    public static final int f19583p = 1;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f63565qrj = 8;

    /* JADX INFO: renamed from: s */
    public static final int f19584s = 3;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f63566t8r = 512;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f63567x2 = 4;

    /* JADX INFO: renamed from: y */
    public static final int f19585y = 2;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final int f63568zurt = 4096;

    /* JADX INFO: renamed from: k */
    public final String f19586k;

    /* JADX INFO: renamed from: n */
    public final int f19587n;

    /* JADX INFO: renamed from: q */
    public final int f19588q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final xwq3 f63569toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final xwq3 f63570zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.decoder.ld6$k */
    /* JADX INFO: compiled from: DecoderReuseEvaluation.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3292k {
    }

    /* JADX INFO: compiled from: DecoderReuseEvaluation.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface toq {
    }

    public ld6(String str, xwq3 xwq3Var, xwq3 xwq3Var2, int i2, int i3) {
        C3844k.m13629k(i2 == 0 || i3 == 0);
        this.f19586k = C3844k.m13630n(str);
        this.f63569toq = (xwq3) C3844k.f7l8(xwq3Var);
        this.f63570zy = (xwq3) C3844k.f7l8(xwq3Var2);
        this.f19588q = i2;
        this.f19587n = i3;
    }

    public boolean equals(@dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ld6.class != obj.getClass()) {
            return false;
        }
        ld6 ld6Var = (ld6) obj;
        return this.f19588q == ld6Var.f19588q && this.f19587n == ld6Var.f19587n && this.f19586k.equals(ld6Var.f19586k) && this.f63569toq.equals(ld6Var.f63569toq) && this.f63570zy.equals(ld6Var.f63570zy);
    }

    public int hashCode() {
        return ((((((((527 + this.f19588q) * 31) + this.f19587n) * 31) + this.f19586k.hashCode()) * 31) + this.f63569toq.hashCode()) * 31) + this.f63570zy.hashCode();
    }
}
