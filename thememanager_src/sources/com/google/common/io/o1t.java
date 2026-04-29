package com.google.common.io;

import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: MultiInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
final class o1t extends InputStream {

    /* JADX INFO: renamed from: k */
    private Iterator<? extends f7l8> f27097k;

    /* JADX INFO: renamed from: q */
    @NullableDecl
    private InputStream f27098q;

    public o1t(Iterator<? extends f7l8> it) throws IOException {
        this.f27097k = (Iterator) com.google.common.base.jk.a9(it);
        m16431k();
    }

    /* JADX INFO: renamed from: k */
    private void m16431k() throws IOException {
        close();
        if (this.f27097k.hasNext()) {
            this.f27098q = this.f27097k.next().qrj();
        }
    }

    @Override // java.io.InputStream
    public int available() throws IOException {
        InputStream inputStream = this.f27098q;
        if (inputStream == null) {
            return 0;
        }
        return inputStream.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        InputStream inputStream = this.f27098q;
        if (inputStream != null) {
            try {
                inputStream.close();
            } finally {
                this.f27098q = null;
            }
        }
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        while (true) {
            InputStream inputStream = this.f27098q;
            if (inputStream == null) {
                return -1;
            }
            int i2 = inputStream.read();
            if (i2 != -1) {
                return i2;
            }
            m16431k();
        }
    }

    @Override // java.io.InputStream
    public long skip(long j2) throws IOException {
        InputStream inputStream = this.f27098q;
        if (inputStream == null || j2 <= 0) {
            return 0L;
        }
        long jSkip = inputStream.skip(j2);
        if (jSkip != 0) {
            return jSkip;
        }
        if (read() == -1) {
            return 0L;
        }
        return this.f27098q.skip(j2 - 1) + 1;
    }

    @Override // java.io.InputStream
    public int read(@NullableDecl byte[] bArr, int i2, int i3) throws IOException {
        while (true) {
            InputStream inputStream = this.f27098q;
            if (inputStream == null) {
                return -1;
            }
            int i4 = inputStream.read(bArr, i2, i3);
            if (i4 != -1) {
                return i4;
            }
            m16431k();
        }
    }
}
