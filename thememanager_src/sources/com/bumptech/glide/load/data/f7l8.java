package com.bumptech.glide.load.data;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import zy.lvui;

/* JADX INFO: compiled from: ExifOrientationStream.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f7l8 extends FilterInputStream {

    /* JADX INFO: renamed from: g */
    private static final byte[] f18206g;

    /* JADX INFO: renamed from: n */
    private static final int f18207n = 2;

    /* JADX INFO: renamed from: s */
    private static final int f18208s;

    /* JADX INFO: renamed from: y */
    private static final int f18209y;

    /* JADX INFO: renamed from: k */
    private final byte f18210k;

    /* JADX INFO: renamed from: q */
    private int f18211q;

    static {
        byte[] bArr = {-1, -31, 0, com.google.common.base.zy.f68118fti, 69, 120, 105, 102, 0, 0, 77, 77, 0, 0, 0, 0, 0, 8, 0, 1, 1, 18, 0, 2, 0, 0, 0, 1, 0};
        f18206g = bArr;
        int length = bArr.length;
        f18209y = length;
        f18208s = length + 2;
    }

    public f7l8(InputStream inputStream, int i2) {
        super(inputStream);
        if (i2 >= -1 && i2 <= 8) {
            this.f18210k = (byte) i2;
            return;
        }
        throw new IllegalArgumentException("Cannot add invalid orientation: " + i2);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read() throws IOException {
        int i2;
        int i3 = this.f18211q;
        int i4 = (i3 < 2 || i3 > (i2 = f18208s)) ? super.read() : i3 == i2 ? this.f18210k : f18206g[i3 - 2] & 255;
        if (i4 != -1) {
            this.f18211q++;
        }
        return i4;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public long skip(long j2) throws IOException {
        long jSkip = super.skip(j2);
        if (jSkip > 0) {
            this.f18211q = (int) (((long) this.f18211q) + jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public int read(@lvui byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5 = this.f18211q;
        int i6 = f18208s;
        if (i5 > i6) {
            i4 = super.read(bArr, i2, i3);
        } else if (i5 == i6) {
            bArr[i2] = this.f18210k;
            i4 = 1;
        } else if (i5 < 2) {
            i4 = super.read(bArr, i2, 2 - i5);
        } else {
            int iMin = Math.min(i6 - i5, i3);
            System.arraycopy(f18206g, this.f18211q - 2, bArr, i2, iMin);
            i4 = iMin;
        }
        if (i4 > 0) {
            this.f18211q += i4;
        }
        return i4;
    }
}
