package com.google.android.exoplayer2.upstream.cache;

import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.io.BufferedOutputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: ReusableBufferedOutputStream.java */
/* JADX INFO: loaded from: classes2.dex */
final class t8r extends BufferedOutputStream {

    /* JADX INFO: renamed from: k */
    private boolean f22938k;

    public t8r(OutputStream outputStream) {
        super(outputStream);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        this.f22938k = true;
        try {
            flush();
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            ((BufferedOutputStream) this).out.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        if (th != null) {
            lrht.h7am(th);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m13415k(OutputStream outputStream) {
        C3844k.m13633s(this.f22938k);
        ((BufferedOutputStream) this).out = outputStream;
        ((BufferedOutputStream) this).count = 0;
        this.f22938k = false;
    }

    public t8r(OutputStream outputStream, int i2) {
        super(outputStream, i2);
    }
}
