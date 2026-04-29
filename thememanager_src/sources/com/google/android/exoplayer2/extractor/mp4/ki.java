package com.google.android.exoplayer2.extractor.mp4;

import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;

/* JADX INFO: compiled from: TrackSampleTable.java */
/* JADX INFO: loaded from: classes2.dex */
final class ki {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final int[] f64231f7l8;

    /* JADX INFO: renamed from: g */
    public final long[] f20019g;

    /* JADX INFO: renamed from: k */
    public final kja0 f20020k;

    /* JADX INFO: renamed from: n */
    public final int f20021n;

    /* JADX INFO: renamed from: q */
    public final int[] f20022q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final int f64232toq;

    /* JADX INFO: renamed from: y */
    public final long f20023y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final long[] f64233zy;

    public ki(kja0 kja0Var, long[] jArr, int[] iArr, int i2, long[] jArr2, int[] iArr2, long j2) {
        C3844k.m13629k(iArr.length == jArr2.length);
        C3844k.m13629k(jArr.length == jArr2.length);
        C3844k.m13629k(iArr2.length == jArr2.length);
        this.f20020k = kja0Var;
        this.f64233zy = jArr;
        this.f20022q = iArr;
        this.f20021n = i2;
        this.f20019g = jArr2;
        this.f64231f7l8 = iArr2;
        this.f20023y = j2;
        this.f64232toq = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    /* JADX INFO: renamed from: k */
    public int m11854k(long j2) {
        for (int iM13667p = lrht.m13667p(this.f20019g, j2, true, false); iM13667p >= 0; iM13667p--) {
            if ((this.f64231f7l8[iM13667p] & 1) != 0) {
                return iM13667p;
            }
        }
        return -1;
    }

    public int toq(long j2) {
        for (int iM13658g = lrht.m13658g(this.f20019g, j2, true, false); iM13658g < this.f20019g.length; iM13658g++) {
            if ((this.f64231f7l8[iM13658g] & 1) != 0) {
                return iM13658g;
            }
        }
        return -1;
    }
}
