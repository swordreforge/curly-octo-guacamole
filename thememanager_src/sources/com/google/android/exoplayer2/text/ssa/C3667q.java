package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.text.f7l8;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.text.ssa.q */
/* JADX INFO: compiled from: SsaSubtitle.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3667q implements f7l8 {

    /* JADX INFO: renamed from: k */
    private final List<List<com.google.android.exoplayer2.text.toq>> f21953k;

    /* JADX INFO: renamed from: q */
    private final List<Long> f21954q;

    public C3667q(List<List<com.google.android.exoplayer2.text.toq>> list, List<Long> list2) {
        this.f21953k = list;
        this.f21954q = list2;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: n */
    public int mo12858n() {
        return this.f21954q.size();
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: q */
    public long mo12859q(int i2) {
        C3844k.m13629k(i2 >= 0);
        C3844k.m13629k(i2 < this.f21954q.size());
        return this.f21954q.get(i2).longValue();
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public int toq(long j2) {
        int iM13668q = lrht.m13668q(this.f21954q, Long.valueOf(j2), false, false);
        if (iM13668q < this.f21954q.size()) {
            return iM13668q;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public List<com.google.android.exoplayer2.text.toq> zy(long j2) {
        int iM13675y = lrht.m13675y(this.f21954q, Long.valueOf(j2), true, false);
        return iM13675y == -1 ? Collections.emptyList() : this.f21953k.get(iM13675y);
    }
}
