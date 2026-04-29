package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.f7l8;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: SubripSubtitle.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq implements f7l8 {

    /* JADX INFO: renamed from: k */
    private final com.google.android.exoplayer2.text.toq[] f21981k;

    /* JADX INFO: renamed from: q */
    private final long[] f21982q;

    public toq(com.google.android.exoplayer2.text.toq[] toqVarArr, long[] jArr) {
        this.f21981k = toqVarArr;
        this.f21982q = jArr;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: n */
    public int mo12858n() {
        return this.f21982q.length;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: q */
    public long mo12859q(int i2) {
        C3844k.m13629k(i2 >= 0);
        C3844k.m13629k(i2 < this.f21982q.length);
        return this.f21982q[i2];
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public int toq(long j2) {
        int iM13658g = lrht.m13658g(this.f21982q, j2, false, false);
        if (iM13658g < this.f21982q.length) {
            return iM13658g;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public List<com.google.android.exoplayer2.text.toq> zy(long j2) {
        com.google.android.exoplayer2.text.toq toqVar;
        int iM13667p = lrht.m13667p(this.f21982q, j2, true, false);
        return (iM13667p == -1 || (toqVar = this.f21981k[iM13667p]) == com.google.android.exoplayer2.text.toq.f21987o) ? Collections.emptyList() : Collections.singletonList(toqVar);
    }
}
