package com.google.common.hash;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: HashingOutputStream.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class t8r extends FilterOutputStream {

    /* JADX INFO: renamed from: k */
    private final InterfaceC4663h f27033k;

    public t8r(kja0 kja0Var, OutputStream outputStream) {
        super((OutputStream) com.google.common.base.jk.a9(outputStream));
        this.f27033k = (InterfaceC4663h) com.google.common.base.jk.a9(kja0Var.newHasher());
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        ((FilterOutputStream) this).out.close();
    }

    /* JADX INFO: renamed from: k */
    public n7h m16370k() {
        return this.f27033k.kja0();
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(int i2) throws IOException {
        this.f27033k.mo16341s((byte) i2);
        ((FilterOutputStream) this).out.write(i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public void write(byte[] bArr, int i2, int i3) throws IOException {
        this.f27033k.ld6(bArr, i2, i3);
        ((FilterOutputStream) this).out.write(bArr, i2, i3);
    }
}
