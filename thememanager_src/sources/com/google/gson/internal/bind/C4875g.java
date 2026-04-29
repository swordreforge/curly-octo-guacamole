package com.google.gson.internal.bind;

import com.google.gson.C4923s;
import com.google.gson.ki;
import com.google.gson.kja0;
import com.google.gson.stream.C4926q;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: com.google.gson.internal.bind.g */
/* JADX INFO: compiled from: JsonTreeWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class C4875g extends C4926q {

    /* JADX INFO: renamed from: c */
    private static final Writer f27666c = new k();

    /* JADX INFO: renamed from: e */
    private static final ki f27667e = new ki("closed");

    /* JADX INFO: renamed from: f */
    private com.google.gson.x2 f27668f;

    /* JADX INFO: renamed from: l */
    private String f27669l;

    /* JADX INFO: renamed from: r */
    private final List<com.google.gson.x2> f27670r;

    /* JADX INFO: renamed from: com.google.gson.internal.bind.g$k */
    /* JADX INFO: compiled from: JsonTreeWriter.java */
    class k extends Writer {
        k() {
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            throw new AssertionError();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            throw new AssertionError();
        }
    }

    public C4875g() {
        super(f27666c);
        this.f27670r = new ArrayList();
        this.f27668f = com.google.gson.n7h.f27821k;
    }

    private com.google.gson.x2 bap7() {
        return this.f27670r.get(r0.size() - 1);
    }

    private void h4b(com.google.gson.x2 x2Var) {
        if (this.f27669l != null) {
            if (!x2Var.m17235i() || m17232h()) {
                ((kja0) bap7()).ni7(this.f27669l, x2Var);
            }
            this.f27669l = null;
            return;
        }
        if (this.f27670r.isEmpty()) {
            this.f27668f = x2Var;
            return;
        }
        com.google.gson.x2 x2VarBap7 = bap7();
        if (!(x2VarBap7 instanceof C4923s)) {
            throw new IllegalStateException();
        }
        ((C4923s) x2VarBap7).ni7(x2Var);
    }

    @Override // com.google.gson.stream.C4926q
    public C4926q bek6(Number number) throws IOException {
        if (number == null) {
            return hyr();
        }
        if (!fu4()) {
            double dDoubleValue = number.doubleValue();
            if (Double.isNaN(dDoubleValue) || Double.isInfinite(dDoubleValue)) {
                throw new IllegalArgumentException("JSON forbids NaN and infinities: " + number);
            }
        }
        h4b(new ki(number));
        return this;
    }

    @Override // com.google.gson.stream.C4926q
    public C4926q bwp(Boolean bool) throws IOException {
        if (bool == null) {
            return hyr();
        }
        h4b(new ki(bool));
        return this;
    }

    @Override // com.google.gson.stream.C4926q, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (!this.f27670r.isEmpty()) {
            throw new IOException("Incomplete document");
        }
        this.f27670r.add(f27667e);
    }

    @Override // com.google.gson.stream.C4926q, java.io.Flushable
    public void flush() throws IOException {
    }

    @Override // com.google.gson.stream.C4926q
    public C4926q h7am(String str) throws IOException {
        if (str == null) {
            return hyr();
        }
        h4b(new ki(str));
        return this;
    }

    @Override // com.google.gson.stream.C4926q
    public C4926q hyr() throws IOException {
        h4b(com.google.gson.n7h.f27821k);
        return this;
    }

    @Override // com.google.gson.stream.C4926q
    public C4926q ij(boolean z2) throws IOException {
        h4b(new ki(Boolean.valueOf(z2)));
        return this;
    }

    @Override // com.google.gson.stream.C4926q
    public C4926q ld6() throws IOException {
        if (this.f27670r.isEmpty() || this.f27669l != null) {
            throw new IllegalStateException();
        }
        if (!(bap7() instanceof C4923s)) {
            throw new IllegalStateException();
        }
        this.f27670r.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.C4926q
    public C4926q ltg8(long j2) throws IOException {
        h4b(new ki(Long.valueOf(j2)));
        return this;
    }

    public com.google.gson.x2 ngy() {
        if (this.f27670r.isEmpty()) {
            return this.f27668f;
        }
        throw new IllegalStateException("Expected one JSON element but was " + this.f27670r);
    }

    @Override // com.google.gson.stream.C4926q
    /* JADX INFO: renamed from: q */
    public C4926q mo17110q() throws IOException {
        C4923s c4923s = new C4923s();
        h4b(c4923s);
        this.f27670r.add(c4923s);
        return this;
    }

    @Override // com.google.gson.stream.C4926q
    /* JADX INFO: renamed from: t */
    public C4926q mo17111t(String str) throws IOException {
        if (this.f27670r.isEmpty() || this.f27669l != null) {
            throw new IllegalStateException();
        }
        if (!(bap7() instanceof kja0)) {
            throw new IllegalStateException();
        }
        this.f27669l = str;
        return this;
    }

    @Override // com.google.gson.stream.C4926q
    public C4926q was(double d2) throws IOException {
        if (fu4() || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            h4b(new ki(Double.valueOf(d2)));
            return this;
        }
        throw new IllegalArgumentException("JSON forbids NaN and infinities: " + d2);
    }

    @Override // com.google.gson.stream.C4926q
    public C4926q x2() throws IOException {
        if (this.f27670r.isEmpty() || this.f27669l != null) {
            throw new IllegalStateException();
        }
        if (!(bap7() instanceof kja0)) {
            throw new IllegalStateException();
        }
        this.f27670r.remove(r0.size() - 1);
        return this;
    }

    @Override // com.google.gson.stream.C4926q
    /* JADX INFO: renamed from: y */
    public C4926q mo17112y() throws IOException {
        kja0 kja0Var = new kja0();
        h4b(kja0Var);
        this.f27670r.add(kja0Var);
        return this;
    }
}
