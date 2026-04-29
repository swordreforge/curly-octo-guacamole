package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import zy.dd;

/* JADX INFO: compiled from: MediaChunk.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class n7h extends AbstractC3581g {

    /* JADX INFO: renamed from: p */
    public final long f21392p;

    public n7h(com.google.android.exoplayer2.upstream.kja0 kja0Var, com.google.android.exoplayer2.upstream.t8r t8rVar, xwq3 xwq3Var, int i2, @dd Object obj, long j2, long j3, long j4) {
        super(kja0Var, t8rVar, 1, xwq3Var, i2, obj, j2, j3);
        C3844k.f7l8(xwq3Var);
        this.f21392p = j4;
    }

    public long f7l8() {
        long j2 = this.f21392p;
        if (j2 != -1) {
            return 1 + j2;
        }
        return -1L;
    }

    /* JADX INFO: renamed from: y */
    public abstract boolean mo12655y();
}
