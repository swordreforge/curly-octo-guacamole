package com.google.android.exoplayer2.offline;

import java.io.IOException;
import zy.dd;

/* JADX INFO: renamed from: com.google.android.exoplayer2.offline.z */
/* JADX INFO: compiled from: Downloader.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3545z {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.z$k */
    /* JADX INFO: compiled from: Downloader.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo12435k(long j2, long j3, float f2);
    }

    void cancel();

    /* JADX INFO: renamed from: k */
    void mo12370k(@dd k kVar) throws InterruptedException, IOException;

    void remove();
}
