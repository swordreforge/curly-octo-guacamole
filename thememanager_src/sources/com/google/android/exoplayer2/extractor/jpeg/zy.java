package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.C3349i;
import com.google.android.exoplayer2.extractor.ld6;
import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: compiled from: StartOffsetExtractorInput.java */
/* JADX INFO: loaded from: classes2.dex */
final class zy extends C3349i {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f63786zy;

    public zy(ld6 ld6Var, long j2) {
        super(ld6Var);
        C3844k.m13629k(ld6Var.getPosition() >= j2);
        this.f63786zy = j2;
    }

    @Override // com.google.android.exoplayer2.extractor.C3349i, com.google.android.exoplayer2.extractor.ld6
    public long getLength() {
        return super.getLength() - this.f63786zy;
    }

    @Override // com.google.android.exoplayer2.extractor.C3349i, com.google.android.exoplayer2.extractor.ld6
    public long getPosition() {
        return super.getPosition() - this.f63786zy;
    }

    @Override // com.google.android.exoplayer2.extractor.C3349i, com.google.android.exoplayer2.extractor.ld6
    public <E extends Throwable> void kja0(long j2, E e2) throws Throwable {
        super.kja0(j2 + this.f63786zy, e2);
    }

    @Override // com.google.android.exoplayer2.extractor.C3349i, com.google.android.exoplayer2.extractor.ld6
    public long x2() {
        return super.x2() - this.f63786zy;
    }
}
