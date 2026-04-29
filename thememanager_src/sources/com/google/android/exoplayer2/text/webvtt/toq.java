package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.util.C3844k;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: Mp4WebvttSubtitle.java */
/* JADX INFO: loaded from: classes2.dex */
final class toq implements com.google.android.exoplayer2.text.f7l8 {

    /* JADX INFO: renamed from: k */
    private final List<com.google.android.exoplayer2.text.toq> f22125k;

    public toq(List<com.google.android.exoplayer2.text.toq> list) {
        this.f22125k = Collections.unmodifiableList(list);
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
        return j2 >= 0 ? this.f22125k : Collections.emptyList();
    }
}
