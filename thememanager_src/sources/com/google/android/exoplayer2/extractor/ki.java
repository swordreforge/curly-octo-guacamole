package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.extractor.o1t;
import com.google.android.exoplayer2.extractor.t8r;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;

/* JADX INFO: compiled from: FlacSeekTableSeekMap.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ki implements o1t {

    /* JADX INFO: renamed from: n */
    private final long f19865n;

    /* JADX INFO: renamed from: q */
    private final t8r f19866q;

    public ki(t8r t8rVar, long j2) {
        this.f19866q = t8rVar;
        this.f19865n = j2;
    }

    /* JADX INFO: renamed from: k */
    private wvg m11778k(long j2, long j3) {
        return new wvg((j2 * 1000000) / ((long) this.f19866q.f20171n), this.f19865n + j3);
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    public boolean f7l8() {
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: n */
    public o1t.C3388k mo11754n(long j2) {
        C3844k.ld6(this.f19866q.f64398ld6);
        t8r t8rVar = this.f19866q;
        t8r.C3402k c3402k = t8rVar.f64398ld6;
        long[] jArr = c3402k.f20176k;
        long[] jArr2 = c3402k.f64402toq;
        int iM13667p = lrht.m13667p(jArr, t8rVar.x2(j2), true, false);
        wvg wvgVarM11778k = m11778k(iM13667p == -1 ? 0L : jArr[iM13667p], iM13667p != -1 ? jArr2[iM13667p] : 0L);
        if (wvgVarM11778k.f20458k == j2 || iM13667p == jArr.length - 1) {
            return new o1t.C3388k(wvgVarM11778k);
        }
        int i2 = iM13667p + 1;
        return new o1t.C3388k(wvgVarM11778k, m11778k(jArr[i2], jArr2[i2]));
    }

    @Override // com.google.android.exoplayer2.extractor.o1t
    /* JADX INFO: renamed from: s */
    public long mo11755s() {
        return this.f19866q.m11938y();
    }
}
