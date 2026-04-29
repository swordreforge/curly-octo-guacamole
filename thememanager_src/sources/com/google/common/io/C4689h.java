package com.google.common.io;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.io.h */
/* JADX INFO: compiled from: CountingOutputStream.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class C4689h extends FilterOutputStream {

    /* JADX INFO: renamed from: k */
    private long f27065k;

    public C4689h(OutputStream outputStream) {
        super((OutputStream) com.google.common.base.jk.a9(outputStream));
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    /* JADX INFO: renamed from: k */
    public long m16400k() {
        return this.f27065k;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        ((FilterOutputStream) this).out.write(bArr, i2, i3);
        this.f27065k += (long) i3;
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i2) throws IOException {
        ((FilterOutputStream) this).out.write(i2);
        this.f27065k++;
    }
}
