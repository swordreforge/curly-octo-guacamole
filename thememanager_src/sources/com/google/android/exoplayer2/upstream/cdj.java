package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.util.C3844k;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: DataSourceInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public final class cdj extends InputStream {

    /* JADX INFO: renamed from: k */
    private final kja0 f22985k;

    /* JADX INFO: renamed from: q */
    private final t8r f22987q;

    /* JADX INFO: renamed from: s */
    private long f22988s;

    /* JADX INFO: renamed from: g */
    private boolean f22984g = false;

    /* JADX INFO: renamed from: y */
    private boolean f22989y = false;

    /* JADX INFO: renamed from: n */
    private final byte[] f22986n = new byte[1];

    public cdj(kja0 kja0Var, t8r t8rVar) {
        this.f22985k = kja0Var;
        this.f22987q = t8rVar;
    }

    private void zy() throws IOException {
        if (this.f22984g) {
            return;
        }
        this.f22985k.mo7270k(this.f22987q);
        this.f22984g = true;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f22989y) {
            return;
        }
        this.f22985k.close();
        this.f22989y = true;
    }

    /* JADX INFO: renamed from: k */
    public long m13448k() {
        return this.f22988s;
    }

    /* JADX INFO: renamed from: q */
    public void m13449q() throws IOException {
        zy();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f22986n) == -1) {
            return -1;
        }
        return this.f22986n[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        C3844k.m13633s(!this.f22989y);
        zy();
        int i4 = this.f22985k.read(bArr, i2, i3);
        if (i4 == -1) {
            return -1;
        }
        this.f22988s += (long) i4;
        return i4;
    }
}
