package com.bumptech.glide.util;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import zy.lvui;

/* JADX INFO: compiled from: MarkEnforcingInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public class ld6 extends FilterInputStream {

    /* JADX INFO: renamed from: n */
    private static final int f19081n = -1;

    /* JADX INFO: renamed from: q */
    private static final int f19082q = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: k */
    private int f19083k;

    public ld6(@lvui InputStream inputStream) {
        super(inputStream);
        this.f19083k = Integer.MIN_VALUE;
    }

    /* JADX INFO: renamed from: k */
    private long m11235k(long j2) {
        int i2 = this.f19083k;
        if (i2 == 0) {
            return -1L;
        }
        return (i2 == Integer.MIN_VALUE || j2 <= ((long) i2)) ? j2 : i2;
    }

    private void zy(long j2) {
        int i2 = this.f19083k;
        if (i2 == Integer.MIN_VALUE || j2 == -1) {
            return;
        }
        this.f19083k = (int) (((long) i2) - j2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int available() throws IOException {
        int i2 = this.f19083k;
        return i2 == Integer.MIN_VALUE ? super.available() : Math.min(i2, super.available());
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        super.mark(i2);
        this.f19083k = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        if (m11235k(1L) == -1) {
            return -1;
        }
        int i2 = super.read();
        zy(1L);
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        super.reset();
        this.f19083k = Integer.MIN_VALUE;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jM11235k = m11235k(j2);
        if (jM11235k == -1) {
            return 0L;
        }
        long jSkip = super.skip(jM11235k);
        zy(jSkip);
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@lvui byte[] bArr, int i2, int i3) throws IOException {
        int iM11235k = (int) m11235k(i3);
        if (iM11235k == -1) {
            return -1;
        }
        int i4 = super.read(bArr, i2, iM11235k);
        zy(i4);
        return i4;
    }
}
