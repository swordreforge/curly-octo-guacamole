package com.google.android.exoplayer2.source;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: ProgressiveMediaExtractor.java */
/* JADX INFO: loaded from: classes2.dex */
public interface ncyb {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.ncyb$k */
    /* JADX INFO: compiled from: ProgressiveMediaExtractor.java */
    public interface InterfaceC3621k {
        /* JADX INFO: renamed from: k */
        ncyb mo12754k();
    }

    /* JADX INFO: renamed from: k */
    void mo12771k(long j2, long j3);

    /* JADX INFO: renamed from: n */
    long mo12772n();

    /* JADX INFO: renamed from: q */
    void mo12773q(com.google.android.exoplayer2.upstream.x2 x2Var, Uri uri, Map<String, List<String>> map, long j2, long j3, com.google.android.exoplayer2.extractor.x2 x2Var2) throws IOException;

    void release();

    int toq(com.google.android.exoplayer2.extractor.fu4 fu4Var) throws IOException;

    void zy();
}
