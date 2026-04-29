package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.mbx;
import com.google.android.exoplayer2.upstream.d3;
import java.io.IOException;
import java.util.List;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.chunk.p */
/* JADX INFO: compiled from: ChunkSource.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3586p {
    void f7l8(long j2, long j3, List<? extends n7h> list, C3589y c3589y);

    /* JADX INFO: renamed from: g */
    int m12659g(long j2, List<? extends n7h> list);

    /* JADX INFO: renamed from: k */
    boolean m12660k(long j2, AbstractC3581g abstractC3581g, List<? extends n7h> list);

    /* JADX INFO: renamed from: n */
    boolean m12661n(AbstractC3581g abstractC3581g, boolean z2, d3.C3791q c3791q, d3 d3Var);

    /* JADX INFO: renamed from: q */
    long m12662q(long j2, mbx mbxVar);

    void release();

    void toq() throws IOException;

    void zy(AbstractC3581g abstractC3581g);
}
