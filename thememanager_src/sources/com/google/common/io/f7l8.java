package com.google.common.io;

import com.google.common.collect.se;
import com.google.common.hash.InterfaceC4663h;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ByteSource.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public abstract class f7l8 {

    /* JADX INFO: renamed from: com.google.common.io.f7l8$k */
    /* JADX INFO: compiled from: ByteSource.java */
    class C4685k extends ld6 {

        /* JADX INFO: renamed from: k */
        final Charset f27058k;

        C4685k(Charset charset) {
            this.f27058k = (Charset) com.google.common.base.jk.a9(charset);
        }

        @Override // com.google.common.io.ld6
        /* JADX INFO: renamed from: k */
        public f7l8 mo16392k(Charset charset) {
            return charset.equals(this.f27058k) ? f7l8.this : super.mo16392k(charset);
        }

        @Override // com.google.common.io.ld6
        public String n7h() throws IOException {
            return new String(f7l8.this.kja0(), this.f27058k);
        }

        @Override // com.google.common.io.ld6
        public Reader qrj() throws IOException {
            return new InputStreamReader(f7l8.this.qrj(), this.f27058k);
        }

        public String toString() {
            return f7l8.this.toString() + ".asCharSource(" + this.f27058k + ")";
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.f7l8$n */
    /* JADX INFO: compiled from: ByteSource.java */
    private final class C4686n extends f7l8 {

        /* JADX INFO: renamed from: k */
        final long f27059k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final long f68326toq;

        C4686n(long j2, long j3) {
            com.google.common.base.jk.m15374h(j2 >= 0, "offset (%s) may not be negative", j2);
            com.google.common.base.jk.m15374h(j3 >= 0, "length (%s) may not be negative", j3);
            this.f27059k = j2;
            this.f68326toq = j3;
        }

        /* JADX INFO: renamed from: i */
        private InputStream m16393i(InputStream inputStream) throws Throwable {
            long j2 = this.f27059k;
            if (j2 > 0) {
                try {
                    if (C4717y.m16483i(inputStream, j2) < this.f27059k) {
                        inputStream.close();
                        return new ByteArrayInputStream(new byte[0]);
                    }
                } finally {
                }
            }
            return C4717y.m16481g(inputStream, this.f68326toq);
        }

        @Override // com.google.common.io.f7l8
        public com.google.common.base.o1t<Long> cdj() {
            com.google.common.base.o1t<Long> o1tVarCdj = f7l8.this.cdj();
            if (!o1tVarCdj.isPresent()) {
                return com.google.common.base.o1t.absent();
            }
            long jLongValue = o1tVarCdj.get().longValue();
            return com.google.common.base.o1t.of(Long.valueOf(Math.min(this.f68326toq, jLongValue - Math.min(this.f27059k, jLongValue))));
        }

        @Override // com.google.common.io.f7l8
        public f7l8 ki(long j2, long j3) {
            com.google.common.base.jk.m15374h(j2 >= 0, "offset (%s) may not be negative", j2);
            com.google.common.base.jk.m15374h(j3 >= 0, "length (%s) may not be negative", j3);
            return f7l8.this.ki(this.f27059k + j2, Math.min(j3, this.f68326toq - j2));
        }

        @Override // com.google.common.io.f7l8
        public boolean ld6() throws IOException {
            return this.f68326toq == 0 || super.ld6();
        }

        @Override // com.google.common.io.f7l8
        public InputStream qrj() throws IOException {
            return m16393i(f7l8.this.qrj());
        }

        public String toString() {
            return f7l8.this.toString() + ".slice(" + this.f27059k + ", " + this.f68326toq + ")";
        }

        @Override // com.google.common.io.f7l8
        public InputStream x2() throws IOException {
            return m16393i(f7l8.this.x2());
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.f7l8$q */
    /* JADX INFO: compiled from: ByteSource.java */
    private static final class C4687q extends toq {

        /* JADX INFO: renamed from: q */
        static final C4687q f27060q = new C4687q();

        C4687q() {
            super(new byte[0]);
        }

        @Override // com.google.common.io.f7l8
        /* JADX INFO: renamed from: k */
        public ld6 mo16389k(Charset charset) {
            com.google.common.base.jk.a9(charset);
            return ld6.m16412y();
        }

        @Override // com.google.common.io.f7l8.toq, com.google.common.io.f7l8
        public byte[] kja0() {
            return this.f27061k;
        }

        @Override // com.google.common.io.f7l8.toq
        public String toString() {
            return "ByteSource.empty()";
        }
    }

    /* JADX INFO: compiled from: ByteSource.java */
    private static class toq extends f7l8 {

        /* JADX INFO: renamed from: k */
        final byte[] f27061k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final int f68328toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final int f68329zy;

        toq(byte[] bArr) {
            this(bArr, 0, bArr.length);
        }

        @Override // com.google.common.io.f7l8
        public com.google.common.base.o1t<Long> cdj() {
            return com.google.common.base.o1t.of(Long.valueOf(this.f68329zy));
        }

        @Override // com.google.common.io.f7l8
        public long f7l8(OutputStream outputStream) throws IOException {
            outputStream.write(this.f27061k, this.f68328toq, this.f68329zy);
            return this.f68329zy;
        }

        @Override // com.google.common.io.f7l8
        /* JADX INFO: renamed from: h */
        public long mo16388h() {
            return this.f68329zy;
        }

        @Override // com.google.common.io.f7l8
        public f7l8 ki(long j2, long j3) {
            com.google.common.base.jk.m15374h(j2 >= 0, "offset (%s) may not be negative", j2);
            com.google.common.base.jk.m15374h(j3 >= 0, "length (%s) may not be negative", j3);
            long jMin = Math.min(j2, this.f68329zy);
            return new toq(this.f27061k, this.f68328toq + ((int) jMin), (int) Math.min(j3, ((long) this.f68329zy) - jMin));
        }

        @Override // com.google.common.io.f7l8
        public byte[] kja0() {
            byte[] bArr = this.f27061k;
            int i2 = this.f68328toq;
            return Arrays.copyOfRange(bArr, i2, this.f68329zy + i2);
        }

        @Override // com.google.common.io.f7l8
        public boolean ld6() {
            return this.f68329zy == 0;
        }

        @Override // com.google.common.io.f7l8
        public <T> T n7h(InterfaceC4697n<T> interfaceC4697n) throws IOException {
            interfaceC4697n.m16424k(this.f27061k, this.f68328toq, this.f68329zy);
            return interfaceC4697n.getResult();
        }

        @Override // com.google.common.io.f7l8
        /* JADX INFO: renamed from: p */
        public com.google.common.hash.n7h mo16391p(com.google.common.hash.kja0 kja0Var) throws IOException {
            return kja0Var.hashBytes(this.f27061k, this.f68328toq, this.f68329zy);
        }

        @Override // com.google.common.io.f7l8
        public InputStream qrj() {
            return new ByteArrayInputStream(this.f27061k, this.f68328toq, this.f68329zy);
        }

        public String toString() {
            return "ByteSource.wrap(" + com.google.common.base.zy.ld6(com.google.common.io.toq.m16454k().qrj(this.f27061k, this.f68328toq, this.f68329zy), 30, "...") + ")";
        }

        @Override // com.google.common.io.f7l8
        public InputStream x2() throws IOException {
            return qrj();
        }

        toq(byte[] bArr, int i2, int i3) {
            this.f27061k = bArr;
            this.f68328toq = i2;
            this.f68329zy = i3;
        }
    }

    /* JADX INFO: compiled from: ByteSource.java */
    private static final class zy extends f7l8 {

        /* JADX INFO: renamed from: k */
        final Iterable<? extends f7l8> f27062k;

        zy(Iterable<? extends f7l8> iterable) {
            this.f27062k = (Iterable) com.google.common.base.jk.a9(iterable);
        }

        @Override // com.google.common.io.f7l8
        public com.google.common.base.o1t<Long> cdj() {
            Iterable<? extends f7l8> iterable = this.f27062k;
            if (!(iterable instanceof Collection)) {
                return com.google.common.base.o1t.absent();
            }
            Iterator<? extends f7l8> it = iterable.iterator();
            long jLongValue = 0;
            while (it.hasNext()) {
                com.google.common.base.o1t<Long> o1tVarCdj = it.next().cdj();
                if (!o1tVarCdj.isPresent()) {
                    return com.google.common.base.o1t.absent();
                }
                jLongValue += o1tVarCdj.get().longValue();
                if (jLongValue < 0) {
                    return com.google.common.base.o1t.of(Long.MAX_VALUE);
                }
            }
            return com.google.common.base.o1t.of(Long.valueOf(jLongValue));
        }

        @Override // com.google.common.io.f7l8
        /* JADX INFO: renamed from: h */
        public long mo16388h() throws IOException {
            Iterator<? extends f7l8> it = this.f27062k.iterator();
            long jMo16388h = 0;
            while (it.hasNext()) {
                jMo16388h += it.next().mo16388h();
                if (jMo16388h < 0) {
                    return Long.MAX_VALUE;
                }
            }
            return jMo16388h;
        }

        @Override // com.google.common.io.f7l8
        public boolean ld6() throws IOException {
            Iterator<? extends f7l8> it = this.f27062k.iterator();
            while (it.hasNext()) {
                if (!it.next().ld6()) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.f7l8
        public InputStream qrj() throws IOException {
            return new o1t(this.f27062k.iterator());
        }

        public String toString() {
            return "ByteSource.concat(" + this.f27062k + ")";
        }
    }

    protected f7l8() {
    }

    /* JADX INFO: renamed from: q */
    public static f7l8 m16384q(f7l8... f7l8VarArr) {
        return toq(se.copyOf(f7l8VarArr));
    }

    /* JADX INFO: renamed from: s */
    public static f7l8 m16385s() {
        return C4687q.f27060q;
    }

    public static f7l8 t8r(byte[] bArr) {
        return new toq(bArr);
    }

    public static f7l8 toq(Iterable<? extends f7l8> iterable) {
        return new zy(iterable);
    }

    /* JADX INFO: renamed from: y */
    private long m16386y(InputStream inputStream) throws IOException {
        long j2 = 0;
        while (true) {
            long jM16483i = C4717y.m16483i(inputStream, 2147483647L);
            if (jM16483i <= 0) {
                return j2;
            }
            j2 += jM16483i;
        }
    }

    public static f7l8 zy(Iterator<? extends f7l8> it) {
        return toq(se.copyOf(it));
    }

    @InterfaceC7731k
    public com.google.common.base.o1t<Long> cdj() {
        return com.google.common.base.o1t.absent();
    }

    @CanIgnoreReturnValue
    public long f7l8(OutputStream outputStream) throws Throwable {
        com.google.common.base.jk.a9(outputStream);
        try {
            return C4717y.toq((InputStream) n7h.m16425k().zy(qrj()), outputStream);
        } finally {
        }
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: g */
    public long m16387g(AbstractC4688g abstractC4688g) throws Throwable {
        com.google.common.base.jk.a9(abstractC4688g);
        n7h n7hVarM16425k = n7h.m16425k();
        try {
            return C4717y.toq((InputStream) n7hVarM16425k.zy(qrj()), (OutputStream) n7hVarM16425k.zy(abstractC4688g.zy()));
        } finally {
        }
    }

    /* JADX INFO: renamed from: h */
    public long mo16388h() throws Throwable {
        com.google.common.base.o1t<Long> o1tVarCdj = cdj();
        if (o1tVarCdj.isPresent()) {
            return o1tVarCdj.get().longValue();
        }
        n7h n7hVarM16425k = n7h.m16425k();
        try {
            return m16386y((InputStream) n7hVarM16425k.zy(qrj()));
        } catch (IOException unused) {
            n7hVarM16425k.close();
            try {
                return C4717y.m16485n((InputStream) n7h.m16425k().zy(qrj()));
            } finally {
            }
        } finally {
        }
    }

    /* JADX INFO: renamed from: k */
    public ld6 mo16389k(Charset charset) {
        return new C4685k(charset);
    }

    public f7l8 ki(long j2, long j3) {
        return new C4686n(j2, j3);
    }

    public byte[] kja0() throws Throwable {
        n7h n7hVarM16425k = n7h.m16425k();
        try {
            InputStream inputStream = (InputStream) n7hVarM16425k.zy(qrj());
            com.google.common.base.o1t<Long> o1tVarCdj = cdj();
            return o1tVarCdj.isPresent() ? C4717y.zurt(inputStream, o1tVarCdj.get().longValue()) : C4717y.fn3e(inputStream);
        } catch (Throwable th) {
            try {
                throw n7hVarM16425k.m16427q(th);
            } finally {
                n7hVarM16425k.close();
            }
        }
    }

    public boolean ld6() throws Throwable {
        com.google.common.base.o1t<Long> o1tVarCdj = cdj();
        if (o1tVarCdj.isPresent()) {
            return o1tVarCdj.get().longValue() == 0;
        }
        n7h n7hVarM16425k = n7h.m16425k();
        try {
            return ((InputStream) n7hVarM16425k.zy(qrj())).read() == -1;
        } catch (Throwable th) {
            try {
                throw n7hVarM16425k.m16427q(th);
            } finally {
                n7hVarM16425k.close();
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m16390n(f7l8 f7l8Var) throws Throwable {
        int iN7h;
        com.google.common.base.jk.a9(f7l8Var);
        byte[] bArrM16487q = C4717y.m16487q();
        byte[] bArrM16487q2 = C4717y.m16487q();
        n7h n7hVarM16425k = n7h.m16425k();
        try {
            InputStream inputStream = (InputStream) n7hVarM16425k.zy(qrj());
            InputStream inputStream2 = (InputStream) n7hVarM16425k.zy(f7l8Var.qrj());
            do {
                iN7h = C4717y.n7h(inputStream, bArrM16487q, 0, bArrM16487q.length);
                if (iN7h == C4717y.n7h(inputStream2, bArrM16487q2, 0, bArrM16487q2.length) && Arrays.equals(bArrM16487q, bArrM16487q2)) {
                }
                return false;
            } while (iN7h == bArrM16487q.length);
            return true;
        } finally {
        }
    }

    @CanIgnoreReturnValue
    @InterfaceC7731k
    public <T> T n7h(InterfaceC4697n<T> interfaceC4697n) throws Throwable {
        com.google.common.base.jk.a9(interfaceC4697n);
        try {
            return (T) C4717y.kja0((InputStream) n7h.m16425k().zy(qrj()), interfaceC4697n);
        } finally {
        }
    }

    /* JADX INFO: renamed from: p */
    public com.google.common.hash.n7h mo16391p(com.google.common.hash.kja0 kja0Var) throws Throwable {
        InterfaceC4663h interfaceC4663hNewHasher = kja0Var.newHasher();
        f7l8(com.google.common.hash.qrj.m16362k(interfaceC4663hNewHasher));
        return interfaceC4663hNewHasher.kja0();
    }

    public abstract InputStream qrj() throws IOException;

    public InputStream x2() throws IOException {
        InputStream inputStreamQrj = qrj();
        return inputStreamQrj instanceof BufferedInputStream ? (BufferedInputStream) inputStreamQrj : new BufferedInputStream(inputStreamQrj);
    }
}
