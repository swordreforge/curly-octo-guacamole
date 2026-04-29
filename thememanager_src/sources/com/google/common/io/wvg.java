package com.google.common.io;

import java.io.IOException;
import java.io.Reader;
import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: MultiReader.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
class wvg extends Reader {

    /* JADX INFO: renamed from: k */
    private final Iterator<? extends ld6> f27144k;

    /* JADX INFO: renamed from: q */
    @NullableDecl
    private Reader f27145q;

    wvg(Iterator<? extends ld6> it) throws IOException {
        this.f27144k = it;
        m16472k();
    }

    /* JADX INFO: renamed from: k */
    private void m16472k() throws IOException {
        close();
        if (this.f27144k.hasNext()) {
            this.f27145q = this.f27144k.next().qrj();
        }
    }

    @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        Reader reader = this.f27145q;
        if (reader != null) {
            try {
                reader.close();
            } finally {
                this.f27145q = null;
            }
        }
    }

    @Override // java.io.Reader
    public int read(@NullableDecl char[] cArr, int i2, int i3) throws IOException {
        Reader reader = this.f27145q;
        if (reader == null) {
            return -1;
        }
        int i4 = reader.read(cArr, i2, i3);
        if (i4 != -1) {
            return i4;
        }
        m16472k();
        return read(cArr, i2, i3);
    }

    @Override // java.io.Reader
    public boolean ready() throws IOException {
        Reader reader = this.f27145q;
        return reader != null && reader.ready();
    }

    @Override // java.io.Reader
    public long skip(long j2) throws IOException {
        com.google.common.base.jk.m15380n(j2 >= 0, "n is negative");
        if (j2 > 0) {
            while (true) {
                Reader reader = this.f27145q;
                if (reader == null) {
                    break;
                }
                long jSkip = reader.skip(j2);
                if (jSkip > 0) {
                    return jSkip;
                }
                m16472k();
            }
        }
        return 0L;
    }
}
