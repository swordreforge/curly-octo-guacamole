package com.google.common.io;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.io.k */
/* JADX INFO: compiled from: AppendableWriter.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
class C4692k extends Writer {

    /* JADX INFO: renamed from: k */
    private final Appendable f27069k;

    /* JADX INFO: renamed from: q */
    private boolean f27070q;

    C4692k(Appendable appendable) {
        this.f27069k = (Appendable) com.google.common.base.jk.a9(appendable);
    }

    /* JADX INFO: renamed from: k */
    private void m16409k() throws IOException {
        if (this.f27070q) {
            throw new IOException("Cannot write to a closed writer.");
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27070q = true;
        Appendable appendable = this.f27069k;
        if (appendable instanceof Closeable) {
            ((Closeable) appendable).close();
        }
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() throws IOException {
        m16409k();
        Appendable appendable = this.f27069k;
        if (appendable instanceof Flushable) {
            ((Flushable) appendable).flush();
        }
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i2, int i3) throws IOException {
        m16409k();
        this.f27069k.append(new String(cArr, i2, i3));
    }

    @Override // java.io.Writer
    public void write(int i2) throws IOException {
        m16409k();
        this.f27069k.append((char) i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(char c2) throws IOException {
        m16409k();
        this.f27069k.append(c2);
        return this;
    }

    @Override // java.io.Writer
    public void write(@NullableDecl String str) throws IOException {
        m16409k();
        this.f27069k.append(str);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@NullableDecl CharSequence charSequence) throws IOException {
        m16409k();
        this.f27069k.append(charSequence);
        return this;
    }

    @Override // java.io.Writer
    public void write(@NullableDecl String str, int i2, int i3) throws IOException {
        m16409k();
        this.f27069k.append(str, i2, i3 + i2);
    }

    @Override // java.io.Writer, java.lang.Appendable
    public Writer append(@NullableDecl CharSequence charSequence, int i2, int i3) throws IOException {
        m16409k();
        this.f27069k.append(charSequence, i2, i3);
        return this;
    }
}
