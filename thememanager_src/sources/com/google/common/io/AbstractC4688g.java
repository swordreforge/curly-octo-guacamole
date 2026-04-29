package com.google.common.io;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: com.google.common.io.g */
/* JADX INFO: compiled from: ByteSink.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public abstract class AbstractC4688g {

    /* JADX INFO: renamed from: com.google.common.io.g$toq */
    /* JADX INFO: compiled from: ByteSink.java */
    private final class toq extends AbstractC4700p {

        /* JADX INFO: renamed from: k */
        private final Charset f27064k;

        public String toString() {
            return AbstractC4688g.this.toString() + ".asCharSink(" + this.f27064k + ")";
        }

        @Override // com.google.common.io.AbstractC4700p
        public Writer toq() throws IOException {
            return new OutputStreamWriter(AbstractC4688g.this.zy(), this.f27064k);
        }

        private toq(Charset charset) {
            this.f27064k = (Charset) com.google.common.base.jk.a9(charset);
        }
    }

    protected AbstractC4688g() {
    }

    /* JADX INFO: renamed from: k */
    public AbstractC4700p m16397k(Charset charset) {
        return new toq(charset);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    public long m16398n(InputStream inputStream) throws Throwable {
        com.google.common.base.jk.a9(inputStream);
        try {
            OutputStream outputStream = (OutputStream) n7h.m16425k().zy(zy());
            long qVar = C4717y.toq(inputStream, outputStream);
            outputStream.flush();
            return qVar;
        } finally {
        }
    }

    /* JADX INFO: renamed from: q */
    public void m16399q(byte[] bArr) throws Throwable {
        com.google.common.base.jk.a9(bArr);
        try {
            OutputStream outputStream = (OutputStream) n7h.m16425k().zy(zy());
            outputStream.write(bArr);
            outputStream.flush();
        } finally {
        }
    }

    public OutputStream toq() throws IOException {
        OutputStream outputStreamZy = zy();
        return outputStreamZy instanceof BufferedOutputStream ? (BufferedOutputStream) outputStreamZy : new BufferedOutputStream(outputStreamZy);
    }

    public abstract OutputStream zy() throws IOException;
}
