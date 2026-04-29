package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.xwq3;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.dd;

/* JADX INFO: compiled from: Track.java */
/* JADX INFO: loaded from: classes2.dex */
public final class kja0 {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final int f64234qrj = 1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f64235x2 = 0;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final int f64236f7l8;

    /* JADX INFO: renamed from: g */
    public final xwq3 f20024g;

    /* JADX INFO: renamed from: k */
    public final int f20025k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    @dd
    private final C3372h[] f64237ld6;

    /* JADX INFO: renamed from: n */
    public final long f20026n;

    /* JADX INFO: renamed from: p */
    public final int f20027p;

    /* JADX INFO: renamed from: q */
    public final long f20028q;

    /* JADX INFO: renamed from: s */
    @dd
    public final long[] f20029s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f64238toq;

    /* JADX INFO: renamed from: y */
    @dd
    public final long[] f20030y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final long f64239zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.mp4.kja0$k */
    /* JADX INFO: compiled from: Track.java */
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC3374k {
    }

    public kja0(int i2, int i3, long j2, long j3, long j4, xwq3 xwq3Var, int i4, @dd C3372h[] c3372hArr, int i5, @dd long[] jArr, @dd long[] jArr2) {
        this.f20025k = i2;
        this.f64238toq = i3;
        this.f64239zy = j2;
        this.f20028q = j3;
        this.f20026n = j4;
        this.f20024g = xwq3Var;
        this.f64236f7l8 = i4;
        this.f64237ld6 = c3372hArr;
        this.f20027p = i5;
        this.f20030y = jArr;
        this.f20029s = jArr2;
    }

    /* JADX INFO: renamed from: k */
    public kja0 m11855k(xwq3 xwq3Var) {
        return new kja0(this.f20025k, this.f64238toq, this.f64239zy, this.f20028q, this.f20026n, xwq3Var, this.f64236f7l8, this.f64237ld6, this.f20027p, this.f20030y, this.f20029s);
    }

    @dd
    public C3372h toq(int i2) {
        C3372h[] c3372hArr = this.f64237ld6;
        if (c3372hArr == null) {
            return null;
        }
        return c3372hArr[i2];
    }
}
