package com.google.android.exoplayer2.upstream;

import java.io.IOException;

/* JADX INFO: compiled from: DataSink.java */
/* JADX INFO: loaded from: classes2.dex */
public interface n7h {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.upstream.n7h$k */
    /* JADX INFO: compiled from: DataSink.java */
    public interface InterfaceC3809k {
        /* JADX INFO: renamed from: k */
        n7h mo13417k();
    }

    void close() throws IOException;

    /* JADX INFO: renamed from: k */
    void mo13416k(t8r t8rVar) throws IOException;

    void write(byte[] bArr, int i2, int i3) throws IOException;
}
