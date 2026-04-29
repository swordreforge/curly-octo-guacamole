package com.google.common.io;

import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

/* JADX INFO: renamed from: com.google.common.io.s */
/* JADX INFO: compiled from: CharSequenceReader.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
final class C4702s extends Reader {

    /* JADX INFO: renamed from: k */
    private CharSequence f27100k;

    /* JADX INFO: renamed from: n */
    private int f27101n;

    /* JADX INFO: renamed from: q */
    private int f27102q;

    public C4702s(CharSequence charSequence) {
        this.f27100k = (CharSequence) com.google.common.base.jk.a9(charSequence);
    }

    /* JADX INFO: renamed from: k */
    private void m16438k() throws IOException {
        if (this.f27100k == null) {
            throw new IOException("reader closed");
        }
    }

    /* JADX INFO: renamed from: q */
    private int m16439q() {
        return this.f27100k.length() - this.f27102q;
    }

    private boolean zy() {
        return m16439q() > 0;
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f27100k = null;
    }

    @Override // java.io.Reader
    public synchronized void mark(int i2) throws IOException {
        com.google.common.base.jk.ld6(i2 >= 0, "readAheadLimit (%s) may not be negative", i2);
        m16438k();
        this.f27101n = this.f27102q;
    }

    @Override // java.io.Reader
    public boolean markSupported() {
        return true;
    }

    @Override // java.io.Reader, java.lang.Readable
    public synchronized int read(CharBuffer charBuffer) throws IOException {
        com.google.common.base.jk.a9(charBuffer);
        m16438k();
        if (!zy()) {
            return -1;
        }
        int iMin = Math.min(charBuffer.remaining(), m16439q());
        for (int i2 = 0; i2 < iMin; i2++) {
            CharSequence charSequence = this.f27100k;
            int i3 = this.f27102q;
            this.f27102q = i3 + 1;
            charBuffer.put(charSequence.charAt(i3));
        }
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized boolean ready() throws IOException {
        m16438k();
        return true;
    }

    @Override // java.io.Reader
    public synchronized void reset() throws IOException {
        m16438k();
        this.f27102q = this.f27101n;
    }

    @Override // java.io.Reader
    public synchronized long skip(long j2) throws IOException {
        int iMin;
        com.google.common.base.jk.m15374h(j2 >= 0, "n (%s) may not be negative", j2);
        m16438k();
        iMin = (int) Math.min(m16439q(), j2);
        this.f27102q += iMin;
        return iMin;
    }

    @Override // java.io.Reader
    public synchronized int read() throws IOException {
        int iCharAt;
        m16438k();
        if (zy()) {
            CharSequence charSequence = this.f27100k;
            int i2 = this.f27102q;
            this.f27102q = i2 + 1;
            iCharAt = charSequence.charAt(i2);
        } else {
            iCharAt = -1;
        }
        return iCharAt;
    }

    @Override // java.io.Reader
    public synchronized int read(char[] cArr, int i2, int i3) throws IOException {
        com.google.common.base.jk.ek5k(i2, i2 + i3, cArr.length);
        m16438k();
        if (!zy()) {
            return -1;
        }
        int iMin = Math.min(i3, m16439q());
        for (int i4 = 0; i4 < iMin; i4++) {
            CharSequence charSequence = this.f27100k;
            int i5 = this.f27102q;
            this.f27102q = i5 + 1;
            cArr[i2 + i4] = charSequence.charAt(i5);
        }
        return iMin;
    }
}
