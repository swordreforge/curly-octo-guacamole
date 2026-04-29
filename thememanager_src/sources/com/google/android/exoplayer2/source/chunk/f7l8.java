package com.google.android.exoplayer2.source.chunk;

import com.google.android.exoplayer2.extractor.C3398q;
import com.google.android.exoplayer2.extractor.InterfaceC3401t;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.util.List;
import zy.dd;

/* JADX INFO: compiled from: ChunkExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public interface f7l8 {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.chunk.f7l8$k */
    /* JADX INFO: compiled from: ChunkExtractor.java */
    public interface InterfaceC3580k {
        @dd
        /* JADX INFO: renamed from: k */
        f7l8 mo12648k(int i2, xwq3 xwq3Var, boolean z2, List<xwq3> list, @dd InterfaceC3401t interfaceC3401t);
    }

    /* JADX INFO: compiled from: ChunkExtractor.java */
    public interface toq {
        InterfaceC3401t toq(int i2, int i3);
    }

    /* JADX INFO: renamed from: k */
    boolean mo12645k(com.google.android.exoplayer2.extractor.ld6 ld6Var) throws IOException;

    @dd
    /* JADX INFO: renamed from: n */
    xwq3[] mo12646n();

    @dd
    /* JADX INFO: renamed from: q */
    C3398q mo12647q();

    void release();

    void zy(@dd toq toqVar, long j2, long j3);
}
