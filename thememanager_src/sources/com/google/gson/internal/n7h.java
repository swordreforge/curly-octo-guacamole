package com.google.gson.internal;

import com.google.gson.C4872h;
import com.google.gson.stream.C4924k;
import com.google.gson.stream.C4925n;
import com.google.gson.stream.C4926q;
import com.google.gson.zurt;
import java.io.EOFException;
import java.io.IOException;
import java.io.Writer;

/* JADX INFO: compiled from: Streams.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n7h {
    private n7h() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: renamed from: k */
    public static com.google.gson.x2 m17168k(C4924k c4924k) throws C4872h {
        boolean z2;
        try {
            try {
                c4924k.g1();
                z2 = false;
            } catch (EOFException e2) {
                e = e2;
                z2 = true;
            }
            try {
                return com.google.gson.internal.bind.n7h.f68755uv6.mo7087n(c4924k);
            } catch (EOFException e3) {
                e = e3;
                if (z2) {
                    return com.google.gson.n7h.f27821k;
                }
                throw new zurt(e);
            }
        } catch (C4925n e4) {
            throw new zurt(e4);
        } catch (IOException e6) {
            throw new com.google.gson.qrj(e6);
        } catch (NumberFormatException e7) {
            throw new zurt(e7);
        }
    }

    public static void toq(com.google.gson.x2 x2Var, C4926q c4926q) throws IOException {
        com.google.gson.internal.bind.n7h.f68755uv6.mo7089s(c4926q, x2Var);
    }

    public static Writer zy(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C4903k(appendable);
    }

    /* JADX INFO: renamed from: com.google.gson.internal.n7h$k */
    /* JADX INFO: compiled from: Streams.java */
    private static final class C4903k extends Writer {

        /* JADX INFO: renamed from: k */
        private final Appendable f27746k;

        /* JADX INFO: renamed from: q */
        private final k f27747q = new k();

        /* JADX INFO: renamed from: com.google.gson.internal.n7h$k$k */
        /* JADX INFO: compiled from: Streams.java */
        static class k implements CharSequence {

            /* JADX INFO: renamed from: k */
            char[] f27748k;

            k() {
            }

            @Override // java.lang.CharSequence
            public char charAt(int i2) {
                return this.f27748k[i2];
            }

            @Override // java.lang.CharSequence
            public int length() {
                return this.f27748k.length;
            }

            @Override // java.lang.CharSequence
            public CharSequence subSequence(int i2, int i3) {
                return new String(this.f27748k, i2, i3 - i2);
            }
        }

        C4903k(Appendable appendable) {
            this.f27746k = appendable;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
            k kVar = this.f27747q;
            kVar.f27748k = cArr;
            this.f27746k.append(kVar, i2, i3 + i2);
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
            this.f27746k.append((char) i2);
        }
    }
}
