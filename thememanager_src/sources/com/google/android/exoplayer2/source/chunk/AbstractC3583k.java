package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.chunk.k */
/* JADX INFO: compiled from: BaseMediaChunk.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3583k extends n7h {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public final long f65340ld6;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private int[] f65341n7h;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private zy f65342qrj;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public final long f65343x2;

    public AbstractC3583k(com.google.android.exoplayer2.upstream.kja0 kja0Var, com.google.android.exoplayer2.upstream.t8r t8rVar, xwq3 xwq3Var, int i2, @dd Object obj, long j2, long j3, long j4, long j5, long j6) {
        super(kja0Var, t8rVar, xwq3Var, i2, obj, j2, j3, j6);
        this.f65340ld6 = j4;
        this.f65343x2 = j5;
    }

    public void ld6(zy zyVar) {
        this.f65342qrj = zyVar;
        this.f65341n7h = zyVar.m12678k();
    }

    /* JADX INFO: renamed from: p */
    protected final zy m12652p() {
        return (zy) C3844k.ld6(this.f65342qrj);
    }

    /* JADX INFO: renamed from: s */
    public final int m12653s(int i2) {
        return ((int[]) C3844k.ld6(this.f65341n7h))[i2];
    }
}
