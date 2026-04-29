package com.google.android.exoplayer2.source.chunk;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: BaseMediaChunkIterator.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class toq implements kja0 {

    /* JADX INFO: renamed from: q */
    private long f21422q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final long f65356toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f65357zy;

    public toq(long j2, long j3) {
        this.f65356toq = j2;
        this.f65357zy = j3;
        reset();
    }

    /* JADX INFO: renamed from: g */
    protected final long m12673g() {
        return this.f21422q;
    }

    /* JADX INFO: renamed from: n */
    protected final void m12674n() {
        long j2 = this.f21422q;
        if (j2 < this.f65356toq || j2 > this.f65357zy) {
            throw new NoSuchElementException();
        }
    }

    @Override // com.google.android.exoplayer2.source.chunk.kja0
    public boolean next() {
        this.f21422q++;
        return !zy();
    }

    @Override // com.google.android.exoplayer2.source.chunk.kja0
    public void reset() {
        this.f21422q = this.f65356toq - 1;
    }

    @Override // com.google.android.exoplayer2.source.chunk.kja0
    public boolean zy() {
        return this.f21422q > this.f65357zy;
    }
}
