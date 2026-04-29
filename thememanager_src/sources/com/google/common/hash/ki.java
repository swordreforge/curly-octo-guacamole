package com.google.common.hash;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: HashingInputStream.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class ki extends FilterInputStream {

    /* JADX INFO: renamed from: k */
    private final InterfaceC4663h f27012k;

    public ki(kja0 kja0Var, InputStream inputStream) {
        super((InputStream) com.google.common.base.jk.a9(inputStream));
        this.f27012k = (InterfaceC4663h) com.google.common.base.jk.a9(kja0Var.newHasher());
    }

    /* JADX INFO: renamed from: k */
    public n7h m16348k() {
        return this.f27012k.kja0();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void mark(int i2) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public boolean markSupported() {
        return false;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @CanIgnoreReturnValue
    public int read() throws IOException {
        int i2 = ((FilterInputStream) this).in.read();
        if (i2 != -1) {
            this.f27012k.mo16341s((byte) i2);
        }
        return i2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public void reset() throws IOException {
        throw new IOException("reset not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    @CanIgnoreReturnValue
    public int read(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = ((FilterInputStream) this).in.read(bArr, i2, i3);
        if (i4 != -1) {
            this.f27012k.ld6(bArr, i2, i4);
        }
        return i4;
    }
}
