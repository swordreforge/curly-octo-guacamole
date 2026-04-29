package com.google.common.io;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: CountingInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class kja0 extends FilterInputStream {

    /* JADX INFO: renamed from: k */
    private long f27072k;

    /* JADX INFO: renamed from: q */
    private long f27073q;

    public kja0(InputStream inputStream) {
        super((InputStream) com.google.common.base.jk.a9(inputStream));
        this.f27073q = -1L;
    }

    /* JADX INFO: renamed from: k */
    public long m16410k() {
        return this.f27072k;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        ((FilterInputStream) this).in.mark(i2);
        this.f27073q = this.f27072k;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 != -1) {
            this.f27072k++;
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (!((FilterInputStream) this).in.markSupported()) {
            throw new IOException("Mark not supported");
        }
        if (this.f27073q == -1) {
            throw new IOException("Mark not set");
        }
        ((FilterInputStream) this).in.reset();
        this.f27072k = this.f27073q;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jSkip = ((FilterInputStream) this).in.skip(j2);
        this.f27072k += jSkip;
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = ((FilterInputStream) this).in.read(bArr, i2, i3);
        if (i4 != -1) {
            this.f27072k += (long) i4;
        }
        return i4;
    }
}
