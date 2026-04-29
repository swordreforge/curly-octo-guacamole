package com.google.android.exoplayer2.text.dvb;

import com.google.android.exoplayer2.text.f7l8;
import java.util.List;

/* JADX INFO: compiled from: DvbSubtitle.java */
/* JADX INFO: loaded from: classes2.dex */
final class zy implements f7l8 {

    /* JADX INFO: renamed from: k */
    private final List<com.google.android.exoplayer2.text.toq> f21896k;

    public zy(List<com.google.android.exoplayer2.text.toq> list) {
        this.f21896k = list;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: n */
    public int mo12858n() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    /* JADX INFO: renamed from: q */
    public long mo12859q(int i2) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public int toq(long j2) {
        return -1;
    }

    @Override // com.google.android.exoplayer2.text.f7l8
    public List<com.google.android.exoplayer2.text.toq> zy(long j2) {
        return this.f21896k;
    }
}
