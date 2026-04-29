package com.google.android.exoplayer2.text.tx3g;

import com.google.android.exoplayer2.text.f7l8;
import com.google.android.exoplayer2.util.C3844k;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Tx3gSubtitle.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq implements f7l8 {

    /* JADX INFO: renamed from: q */
    public static final toq f22084q = new toq();

    /* JADX INFO: renamed from: k */
    private final List<com.google.android.exoplayer2.text.toq> f22085k;

    public toq(com.google.android.exoplayer2.text.toq toqVar) {
        this.f22085k = Collections.singletonList(toqVar);
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: n */
    public int mo12858n() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: q */
    public long mo12859q(int i2) {
        C3844k.m13629k(i2 == 0);
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public int toq(long j2) {
        return j2 < 0 ? 0 : -1;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public List<com.google.android.exoplayer2.text.toq> zy(long j2) {
        return j2 >= 0 ? this.f22085k : Collections.emptyList();
    }

    private toq() {
        this.f22085k = Collections.emptyList();
    }
}
