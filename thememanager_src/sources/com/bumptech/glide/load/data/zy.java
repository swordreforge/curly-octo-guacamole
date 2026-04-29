package com.bumptech.glide.load.data;

import java.io.IOException;
import java.io.OutputStream;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: BufferedOutputStream.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy extends OutputStream {

    /* JADX INFO: renamed from: g */
    private int f18252g;

    /* JADX INFO: renamed from: k */
    @lvui
    private final OutputStream f18253k;

    /* JADX INFO: renamed from: n */
    private com.bumptech.glide.load.engine.bitmap_recycle.toq f18254n;

    /* JADX INFO: renamed from: q */
    private byte[] f18255q;

    public zy(@lvui OutputStream outputStream, @lvui com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar) {
        this(outputStream, toqVar, 65536);
    }

    /* JADX INFO: renamed from: k */
    private void m10662k() throws IOException {
        int i2 = this.f18252g;
        if (i2 > 0) {
            this.f18253k.write(this.f18255q, 0, i2);
            this.f18252g = 0;
        }
    }

    /* JADX INFO: renamed from: q */
    private void m10663q() {
        byte[] bArr = this.f18255q;
        if (bArr != null) {
            this.f18254n.put(bArr);
            this.f18255q = null;
        }
    }

    private void zy() throws IOException {
        if (this.f18252g == this.f18255q.length) {
            m10662k();
        }
    }

    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        try {
            flush();
            this.f18253k.close();
            m10663q();
        } catch (Throwable th) {
            this.f18253k.close();
            throw th;
        }
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public void flush() throws IOException {
        m10662k();
        this.f18253k.flush();
    }

    @Override // java.io.OutputStream
    public void write(int i2) throws IOException {
        byte[] bArr = this.f18255q;
        int i3 = this.f18252g;
        this.f18252g = i3 + 1;
        bArr[i3] = (byte) i2;
        zy();
    }

    @yz
    zy(@lvui OutputStream outputStream, com.bumptech.glide.load.engine.bitmap_recycle.toq toqVar, int i2) {
        this.f18253k = outputStream;
        this.f18254n = toqVar;
        this.f18255q = (byte[]) toqVar.zy(i2, byte[].class);
    }

    @Override // java.io.OutputStream
    public void write(@lvui byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public void write(@lvui byte[] bArr, int i2, int i3) throws IOException {
        int i4 = 0;
        do {
            int i5 = i3 - i4;
            int i6 = i2 + i4;
            int i7 = this.f18252g;
            if (i7 == 0 && i5 >= this.f18255q.length) {
                this.f18253k.write(bArr, i6, i5);
                return;
            }
            int iMin = Math.min(i5, this.f18255q.length - i7);
            System.arraycopy(bArr, i6, this.f18255q, this.f18252g, iMin);
            this.f18252g += iMin;
            i4 += iMin;
            zy();
        } while (i4 < i3);
    }
}
