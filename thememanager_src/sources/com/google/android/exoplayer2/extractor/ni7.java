package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;

/* JADX INFO: compiled from: IndexSeekMap.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ni7 implements o1t {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final boolean f64330f7l8;

    /* JADX INFO: renamed from: g */
    private final long f20104g;

    /* JADX INFO: renamed from: n */
    private final long[] f20105n;

    /* JADX INFO: renamed from: q */
    private final long[] f20106q;

    public ni7(long[] jArr, long[] jArr2, long j2) {
        C3844k.m13629k(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z2 = length > 0;
        this.f64330f7l8 = z2;
        if (!z2 || jArr2[0] <= 0) {
            this.f20106q = jArr;
            this.f20105n = jArr2;
        } else {
            int i2 = length + 1;
            long[] jArr3 = new long[i2];
            this.f20106q = jArr3;
            long[] jArr4 = new long[i2];
            this.f20105n = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f20104g = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    public boolean f7l8() {
        return this.f64330f7l8;
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: n */
    public o1t.C3388k mo11754n(long j2) {
        if (!this.f64330f7l8) {
            return new o1t.C3388k(wvg.f64718zy);
        }
        int iM13667p = lrht.m13667p(this.f20105n, j2, true, true);
        wvg wvgVar = new wvg(this.f20105n[iM13667p], this.f20106q[iM13667p]);
        if (wvgVar.f20458k == j2 || iM13667p == this.f20105n.length - 1) {
            return new o1t.C3388k(wvgVar);
        }
        int i2 = iM13667p + 1;
        return new o1t.C3388k(wvgVar, new wvg(this.f20105n[i2], this.f20106q[i2]));
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: s */
    public long mo11755s() {
        return this.f20104g;
    }
}
