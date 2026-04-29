package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.util.lrht;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.android.exoplayer2.extractor.q */
/* JADX INFO: compiled from: ChunkIndex.java */
/* JADX INFO: loaded from: classes2.dex */
public final class C3398q implements o1t {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final long[] f64380f7l8;

    /* JADX INFO: renamed from: g */
    public final long[] f20153g;

    /* JADX INFO: renamed from: n */
    public final int[] f20154n;

    /* JADX INFO: renamed from: q */
    public final int f20155q;

    /* JADX INFO: renamed from: s */
    private final long f20156s;

    /* JADX INFO: renamed from: y */
    public final long[] f20157y;

    public C3398q(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f20154n = iArr;
        this.f20153g = jArr;
        this.f64380f7l8 = jArr2;
        this.f20157y = jArr3;
        int length = iArr.length;
        this.f20155q = length;
        if (length > 0) {
            this.f20156s = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f20156s = 0L;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    public boolean f7l8() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public int m11922k(long j2) {
        return lrht.m13667p(this.f20157y, j2, true, true);
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: n */
    public o1t.C3388k mo11754n(long j2) {
        int iM11922k = m11922k(j2);
        wvg wvgVar = new wvg(this.f20157y[iM11922k], this.f20153g[iM11922k]);
        if (wvgVar.f20458k >= j2 || iM11922k == this.f20155q - 1) {
            return new o1t.C3388k(wvgVar);
        }
        int i2 = iM11922k + 1;
        return new o1t.C3388k(wvgVar, new wvg(this.f20157y[i2], this.f20153g[i2]));
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: s */
    public long mo11755s() {
        return this.f20156s;
    }

    public String toString() {
        int i2 = this.f20155q;
        String string = Arrays.toString(this.f20154n);
        String string2 = Arrays.toString(this.f20153g);
        String string3 = Arrays.toString(this.f20157y);
        String string4 = Arrays.toString(this.f64380f7l8);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 71 + String.valueOf(string2).length() + String.valueOf(string3).length() + String.valueOf(string4).length());
        sb.append("ChunkIndex(length=");
        sb.append(i2);
        sb.append(", sizes=");
        sb.append(string);
        sb.append(", offsets=");
        sb.append(string2);
        sb.append(", timeUs=");
        sb.append(string3);
        sb.append(", durationsUs=");
        sb.append(string4);
        sb.append(")");
        return sb.toString();
    }
}
