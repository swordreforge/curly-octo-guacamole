package com.bumptech.glide.load.resource.bitmap;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.t */
/* JADX INFO: compiled from: RecyclableBufferedInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public class C3114t extends FilterInputStream {

    /* JADX INFO: renamed from: g */
    private int f18748g;

    /* JADX INFO: renamed from: k */
    private volatile byte[] f18749k;

    /* JADX INFO: renamed from: n */
    private int f18750n;

    /* JADX INFO: renamed from: q */
    private int f18751q;

    /* JADX INFO: renamed from: s */
    private final com.bumptech.glide.load.engine.bitmap_recycle.toq f18752s;

    /* JADX INFO: renamed from: y */
    private int f18753y;

    /* JADX INFO: renamed from: com.bumptech.glide.load.resource.bitmap.t$k */
    /* JADX INFO: compiled from: RecyclableBufferedInputStream.java */
    static class k extends IOException {
        private static final long serialVersionUID = -4338378848813561757L;

        k(String str) {
            super(str);
        }
    }

    public C3114t(@lvui InputStream inputStream, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        this(inputStream, toqVar, 65536);
    }

    /* JADX INFO: renamed from: k */
    private int m11004k(InputStream inputStream, byte[] bArr) throws IOException {
        int i2 = this.f18748g;
        if (i2 != -1) {
            int i3 = this.f18753y - i2;
            int i4 = this.f18750n;
            if (i3 < i4) {
                if (i2 == 0 && i4 > bArr.length && this.f18751q == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i4) {
                        i4 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f18752s.zy(i4, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.f18749k = bArr2;
                    this.f18752s.put(bArr);
                    bArr = bArr2;
                } else if (i2 > 0) {
                    System.arraycopy(bArr, i2, bArr, 0, bArr.length - i2);
                }
                int i5 = this.f18753y - this.f18748g;
                this.f18753y = i5;
                this.f18748g = 0;
                this.f18751q = 0;
                int i6 = inputStream.read(bArr, i5, bArr.length - i5);
                int i7 = this.f18753y;
                if (i6 > 0) {
                    i7 += i6;
                }
                this.f18751q = i7;
                return i6;
            }
        }
        int i8 = inputStream.read(bArr);
        if (i8 > 0) {
            this.f18748g = -1;
            this.f18753y = 0;
            this.f18751q = i8;
        }
        return i8;
    }

    /* JADX INFO: renamed from: y */
    private static IOException m11005y() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = ((FilterInputStream) this).in;
        if (this.f18749k == null || inputStream == null) {
            throw m11005y();
        }
        return (this.f18751q - this.f18753y) + inputStream.available();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f18749k != null) {
            this.f18752s.put(this.f18749k);
            this.f18749k = null;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        ((FilterInputStream) this).in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void mark(int i2) {
        this.f18750n = Math.max(this.f18750n, i2);
        this.f18748g = this.f18753y;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return true;
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m11006q() {
        if (this.f18749k != null) {
            this.f18752s.put(this.f18749k);
            this.f18749k = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read() throws IOException {
        byte[] bArr = this.f18749k;
        InputStream inputStream = ((FilterInputStream) this).in;
        if (bArr == null || inputStream == null) {
            throw m11005y();
        }
        if (this.f18753y >= this.f18751q && m11004k(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.f18749k && (bArr = this.f18749k) == null) {
            throw m11005y();
        }
        int i2 = this.f18751q;
        int i3 = this.f18753y;
        if (i2 - i3 <= 0) {
            return -1;
        }
        this.f18753y = i3 + 1;
        return bArr[i3] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized void reset() throws IOException {
        if (this.f18749k == null) {
            throw new IOException("Stream is closed");
        }
        int i2 = this.f18748g;
        if (-1 == i2) {
            throw new k("Mark has been invalidated, pos: " + this.f18753y + " markLimit: " + this.f18750n);
        }
        this.f18753y = i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized long skip(long j2) throws IOException {
        if (j2 < 1) {
            return 0L;
        }
        byte[] bArr = this.f18749k;
        if (bArr == null) {
            throw m11005y();
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream == null) {
            throw m11005y();
        }
        int i2 = this.f18751q;
        int i3 = this.f18753y;
        if (i2 - i3 >= j2) {
            this.f18753y = (int) (((long) i3) + j2);
            return j2;
        }
        long j3 = ((long) i2) - ((long) i3);
        this.f18753y = i2;
        if (this.f18748g == -1 || j2 > this.f18750n) {
            long jSkip = inputStream.skip(j2 - j3);
            if (jSkip > 0) {
                this.f18748g = -1;
            }
            return j3 + jSkip;
        }
        if (m11004k(inputStream, bArr) == -1) {
            return j3;
        }
        int i4 = this.f18751q;
        int i5 = this.f18753y;
        if (i4 - i5 >= j2 - j3) {
            this.f18753y = (int) ((((long) i5) + j2) - j3);
            return j2;
        }
        long j4 = (j3 + ((long) i4)) - ((long) i5);
        this.f18753y = i4;
        return j4;
    }

    public synchronized void zy() {
        this.f18750n = this.f18749k.length;
    }

    @yz
    C3114t(@lvui InputStream inputStream, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar, int i2) {
        super(inputStream);
        this.f18748g = -1;
        this.f18752s = toqVar;
        this.f18749k = (byte[]) toqVar.zy(i2, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public synchronized int read(@lvui byte[] bArr, int i2, int i3) throws IOException {
        int i4;
        int i5;
        byte[] bArr2 = this.f18749k;
        if (bArr2 == null) {
            throw m11005y();
        }
        if (i3 == 0) {
            return 0;
        }
        InputStream inputStream = ((FilterInputStream) this).in;
        if (inputStream != null) {
            int i6 = this.f18753y;
            int i7 = this.f18751q;
            if (i6 < i7) {
                int i8 = i7 - i6 >= i3 ? i3 : i7 - i6;
                System.arraycopy(bArr2, i6, bArr, i2, i8);
                this.f18753y += i8;
                if (i8 == i3 || inputStream.available() == 0) {
                    return i8;
                }
                i2 += i8;
                i4 = i3 - i8;
            } else {
                i4 = i3;
            }
            while (true) {
                if (this.f18748g == -1 && i4 >= bArr2.length) {
                    i5 = inputStream.read(bArr, i2, i4);
                    if (i5 == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                } else {
                    if (m11004k(inputStream, bArr2) == -1) {
                        return i4 != i3 ? i3 - i4 : -1;
                    }
                    if (bArr2 != this.f18749k && (bArr2 = this.f18749k) == null) {
                        throw m11005y();
                    }
                    int i9 = this.f18751q;
                    int i10 = this.f18753y;
                    i5 = i9 - i10 >= i4 ? i4 : i9 - i10;
                    System.arraycopy(bArr2, i10, bArr, i2, i5);
                    this.f18753y += i5;
                }
                i4 -= i5;
                if (i4 == 0) {
                    return i3;
                }
                if (inputStream.available() == 0) {
                    return i3 - i4;
                }
                i2 += i5;
            }
        } else {
            throw m11005y();
        }
    }
}
