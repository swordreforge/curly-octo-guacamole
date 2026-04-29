package com.google.common.io;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.CharBuffer;
import java.util.ArrayList;
import java.util.List;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: CharStreams.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public final class x2 {

    /* JADX INFO: renamed from: k */
    private static final int f27146k = 2048;

    /* JADX INFO: renamed from: com.google.common.io.x2$k */
    /* JADX INFO: compiled from: CharStreams.java */
    private static final class C4716k extends Writer {

        /* JADX INFO: renamed from: k */
        private static final C4716k f27147k = new C4716k();

        private C4716k() {
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(char c2) {
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        public String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(int i2) {
        }

        @Override // java.io.Writer
        public void write(char[] cArr) {
            com.google.common.base.jk.a9(cArr);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) {
            com.google.common.base.jk.ek5k(i2, i3 + i2, cArr.length);
        }

        @Override // java.io.Writer
        public void write(String str) {
            com.google.common.base.jk.a9(str);
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence) {
            com.google.common.base.jk.a9(charSequence);
            return this;
        }

        @Override // java.io.Writer
        public void write(String str, int i2, int i3) {
            com.google.common.base.jk.ek5k(i2, i3 + i2, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public Writer append(CharSequence charSequence, int i2, int i3) {
            com.google.common.base.jk.ek5k(i2, i3, charSequence.length());
            return this;
        }
    }

    private x2() {
    }

    @InterfaceC7731k
    public static Writer f7l8() {
        return C4716k.f27147k;
    }

    @CanIgnoreReturnValue
    @InterfaceC7731k
    /* JADX INFO: renamed from: g */
    public static long m16473g(Readable readable) throws IOException {
        CharBuffer charBufferM16475n = m16475n();
        long j2 = 0;
        while (true) {
            long j3 = readable.read(charBufferM16475n);
            if (j3 == -1) {
                return j2;
            }
            j2 += j3;
            charBufferM16475n.clear();
        }
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: k */
    public static Writer m16474k(Appendable appendable) {
        return appendable instanceof Writer ? (Writer) appendable : new C4692k(appendable);
    }

    public static String ld6(Readable readable) throws IOException {
        return x2(readable).toString();
    }

    /* JADX INFO: renamed from: n */
    static CharBuffer m16475n() {
        return CharBuffer.allocate(2048);
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: p */
    public static void m16476p(Reader reader, long j2) throws IOException {
        com.google.common.base.jk.a9(reader);
        while (j2 > 0) {
            long jSkip = reader.skip(j2);
            if (jSkip == 0) {
                throw new EOFException();
            }
            j2 -= jSkip;
        }
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: q */
    static long m16477q(Reader reader, Writer writer) throws IOException {
        com.google.common.base.jk.a9(reader);
        com.google.common.base.jk.a9(writer);
        char[] cArr = new char[2048];
        long j2 = 0;
        while (true) {
            int i2 = reader.read(cArr);
            if (i2 == -1) {
                return j2;
            }
            writer.write(cArr, 0, i2);
            j2 += (long) i2;
        }
    }

    @InterfaceC7731k
    /* JADX INFO: renamed from: s */
    public static List<String> m16478s(Readable readable) throws IOException {
        ArrayList arrayList = new ArrayList();
        ni7 ni7Var = new ni7(readable);
        while (true) {
            String qVar = ni7Var.toq();
            if (qVar == null) {
                return arrayList;
            }
            arrayList.add(qVar);
        }
    }

    @CanIgnoreReturnValue
    public static long toq(Readable readable, Appendable appendable) throws IOException {
        if (readable instanceof Reader) {
            return appendable instanceof StringBuilder ? zy((Reader) readable, (StringBuilder) appendable) : m16477q((Reader) readable, m16474k(appendable));
        }
        com.google.common.base.jk.a9(readable);
        com.google.common.base.jk.a9(appendable);
        long jRemaining = 0;
        CharBuffer charBufferM16475n = m16475n();
        while (readable.read(charBufferM16475n) != -1) {
            charBufferM16475n.flip();
            appendable.append(charBufferM16475n);
            jRemaining += (long) charBufferM16475n.remaining();
            charBufferM16475n.clear();
        }
        return jRemaining;
    }

    private static StringBuilder x2(Readable readable) throws IOException {
        StringBuilder sb = new StringBuilder();
        if (readable instanceof Reader) {
            zy((Reader) readable, sb);
        } else {
            toq(readable, sb);
        }
        return sb;
    }

    @CanIgnoreReturnValue
    @InterfaceC7731k
    /* JADX INFO: renamed from: y */
    public static <T> T m16479y(Readable readable, zurt<T> zurtVar) throws IOException {
        String qVar;
        com.google.common.base.jk.a9(readable);
        com.google.common.base.jk.a9(zurtVar);
        ni7 ni7Var = new ni7(readable);
        do {
            qVar = ni7Var.toq();
            if (qVar == null) {
                break;
            }
        } while (zurtVar.mo16408k(qVar));
        return zurtVar.getResult();
    }

    @CanIgnoreReturnValue
    static long zy(Reader reader, StringBuilder sb) throws IOException {
        com.google.common.base.jk.a9(reader);
        com.google.common.base.jk.a9(sb);
        char[] cArr = new char[2048];
        long j2 = 0;
        while (true) {
            int i2 = reader.read(cArr);
            if (i2 == -1) {
                return j2;
            }
            sb.append(cArr, 0, i2);
            j2 += (long) i2;
        }
    }
}
