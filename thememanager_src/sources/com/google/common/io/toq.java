package com.google.common.io;

import com.google.common.base.C4280z;
import com.google.common.math.C4723q;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.io.Writer;
import java.math.RoundingMode;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: BaseEncoding.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public abstract class toq {

    /* JADX INFO: renamed from: k */
    private static final toq f27109k = new C4715y("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final toq f68342toq = new C4715y("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final toq f68343zy = new ld6("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: q */
    private static final toq f27111q = new ld6("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: n */
    private static final toq f27110n = new f7l8("base16()", "0123456789ABCDEF");

    /* JADX INFO: compiled from: BaseEncoding.java */
    static final class f7l8 extends ld6 {

        /* JADX INFO: renamed from: p */
        final char[] f27112p;

        f7l8(String str, String str2) {
            this(new C4708g(str, str2.toCharArray()));
        }

        @Override // com.google.common.io.toq.ld6
        toq jk(C4708g c4708g, @NullableDecl Character ch2) {
            return new f7l8(c4708g);
        }

        @Override // com.google.common.io.toq.ld6, com.google.common.io.toq
        void n7h(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            com.google.common.base.jk.a9(appendable);
            com.google.common.base.jk.ek5k(i2, i2 + i3, bArr.length);
            for (int i4 = 0; i4 < i3; i4++) {
                int i5 = bArr[i2 + i4] & 255;
                appendable.append(this.f27112p[i5]);
                appendable.append(this.f27112p[i5 | 256]);
            }
        }

        @Override // com.google.common.io.toq.ld6, com.google.common.io.toq
        /* JADX INFO: renamed from: s */
        int mo16461s(byte[] bArr, CharSequence charSequence) throws C4714s {
            com.google.common.base.jk.a9(bArr);
            if (charSequence.length() % 2 == 1) {
                throw new C4714s("Invalid input length " + charSequence.length());
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < charSequence.length()) {
                bArr[i3] = (byte) ((this.f27119g.zy(charSequence.charAt(i2)) << 4) | this.f27119g.zy(charSequence.charAt(i2 + 1)));
                i2 += 2;
                i3++;
            }
            return i3;
        }

        private f7l8(C4708g c4708g) {
            super(c4708g, null);
            this.f27112p = new char[512];
            com.google.common.base.jk.m15383q(c4708g.f68345toq.length == 16);
            for (int i2 = 0; i2 < 256; i2++) {
                this.f27112p[i2] = c4708g.m16469q(i2 >>> 4);
                this.f27112p[i2 | 256] = c4708g.m16469q(i2 & 15);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.toq$g */
    /* JADX INFO: compiled from: BaseEncoding.java */
    private static final class C4708g {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final byte[] f68344f7l8;

        /* JADX INFO: renamed from: g */
        final int f27113g;

        /* JADX INFO: renamed from: k */
        private final String f27114k;

        /* JADX INFO: renamed from: n */
        final int f27115n;

        /* JADX INFO: renamed from: q */
        final int f27116q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final char[] f68345toq;

        /* JADX INFO: renamed from: y */
        private final boolean[] f27117y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final int f68346zy;

        C4708g(String str, char[] cArr) {
            this.f27114k = (String) com.google.common.base.jk.a9(str);
            this.f68345toq = (char[]) com.google.common.base.jk.a9(cArr);
            try {
                int iM16542h = C4723q.m16542h(cArr.length, RoundingMode.UNNECESSARY);
                this.f27116q = iM16542h;
                int iMin = Math.min(8, Integer.lowestOneBit(iM16542h));
                try {
                    this.f27115n = 8 / iMin;
                    this.f27113g = iM16542h / iMin;
                    this.f68346zy = cArr.length - 1;
                    byte[] bArr = new byte[128];
                    Arrays.fill(bArr, (byte) -1);
                    for (int i2 = 0; i2 < cArr.length; i2++) {
                        char c2 = cArr[i2];
                        com.google.common.base.jk.m15373g(c2 < 128, "Non-ASCII character: %s", c2);
                        com.google.common.base.jk.m15373g(bArr[c2] == -1, "Duplicate character: %s", c2);
                        bArr[c2] = (byte) i2;
                    }
                    this.f68344f7l8 = bArr;
                    boolean[] zArr = new boolean[this.f27115n];
                    for (int i3 = 0; i3 < this.f27113g; i3++) {
                        zArr[C4723q.f7l8(i3 * 8, this.f27116q, RoundingMode.CEILING)] = true;
                    }
                    this.f27117y = zArr;
                } catch (ArithmeticException e2) {
                    throw new IllegalArgumentException("Illegal alphabet " + new String(cArr), e2);
                }
            } catch (ArithmeticException e3) {
                throw new IllegalArgumentException("Illegal alphabet length " + cArr.length, e3);
            }
        }

        /* JADX INFO: renamed from: g */
        private boolean m16465g() {
            for (char c2 : this.f68345toq) {
                if (com.google.common.base.zy.m15460q(c2)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: n */
        private boolean m16467n() {
            for (char c2 : this.f68345toq) {
                if (com.google.common.base.zy.zy(c2)) {
                    return true;
                }
            }
            return false;
        }

        public boolean equals(@NullableDecl Object obj) {
            if (obj instanceof C4708g) {
                return Arrays.equals(this.f68345toq, ((C4708g) obj).f68345toq);
            }
            return false;
        }

        boolean f7l8(int i2) {
            return this.f27117y[i2 % this.f27115n];
        }

        public int hashCode() {
            return Arrays.hashCode(this.f68345toq);
        }

        /* JADX INFO: renamed from: p */
        C4708g m16468p() {
            if (!m16467n()) {
                return this;
            }
            com.google.common.base.jk.y9n(!m16465g(), "Cannot call upperCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f68345toq.length];
            int i2 = 0;
            while (true) {
                char[] cArr2 = this.f68345toq;
                if (i2 >= cArr2.length) {
                    return new C4708g(this.f27114k + ".upperCase()", cArr);
                }
                cArr[i2] = com.google.common.base.zy.m15462y(cArr2[i2]);
                i2++;
            }
        }

        /* JADX INFO: renamed from: q */
        char m16469q(int i2) {
            return this.f68345toq[i2];
        }

        /* JADX INFO: renamed from: s */
        public boolean m16470s(char c2) {
            byte[] bArr = this.f68344f7l8;
            return c2 < bArr.length && bArr[c2] != -1;
        }

        public String toString() {
            return this.f27114k;
        }

        boolean toq(char c2) {
            return c2 <= 127 && this.f68344f7l8[c2] != -1;
        }

        /* JADX INFO: renamed from: y */
        C4708g m16471y() {
            if (!m16465g()) {
                return this;
            }
            com.google.common.base.jk.y9n(!m16467n(), "Cannot call lowerCase() on a mixed-case alphabet");
            char[] cArr = new char[this.f68345toq.length];
            int i2 = 0;
            while (true) {
                char[] cArr2 = this.f68345toq;
                if (i2 >= cArr2.length) {
                    return new C4708g(this.f27114k + ".lowerCase()", cArr);
                }
                cArr[i2] = com.google.common.base.zy.m15458n(cArr2[i2]);
                i2++;
            }
        }

        int zy(char c2) throws C4714s {
            if (c2 > 127) {
                throw new C4714s("Unrecognized character: 0x" + Integer.toHexString(c2));
            }
            byte b2 = this.f68344f7l8[c2];
            if (b2 != -1) {
                return b2;
            }
            if (c2 <= ' ' || c2 == 127) {
                throw new C4714s("Unrecognized character: 0x" + Integer.toHexString(c2));
            }
            throw new C4714s("Unrecognized character: " + c2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.toq$k */
    /* JADX INFO: compiled from: BaseEncoding.java */
    class C4709k extends AbstractC4688g {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ AbstractC4700p f27118k;

        C4709k(AbstractC4700p abstractC4700p) {
            this.f27118k = abstractC4700p;
        }

        @Override // com.google.common.io.AbstractC4688g
        public OutputStream zy() throws IOException {
            return toq.this.mo16458h(this.f27118k.toq());
        }
    }

    /* JADX INFO: compiled from: BaseEncoding.java */
    static class ld6 extends toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @NullableDecl
        final Character f68348f7l8;

        /* JADX INFO: renamed from: g */
        final C4708g f27119g;

        /* JADX INFO: renamed from: s */
        @MonotonicNonNullDecl
        private transient toq f27120s;

        /* JADX INFO: renamed from: y */
        @MonotonicNonNullDecl
        private transient toq f27121y;

        /* JADX INFO: renamed from: com.google.common.io.toq$ld6$k */
        /* JADX INFO: compiled from: BaseEncoding.java */
        class C4710k extends OutputStream {

            /* JADX INFO: renamed from: g */
            final /* synthetic */ Writer f27122g;

            /* JADX INFO: renamed from: k */
            int f27123k = 0;

            /* JADX INFO: renamed from: q */
            int f27125q = 0;

            /* JADX INFO: renamed from: n */
            int f27124n = 0;

            C4710k(Writer writer) {
                this.f27122g = writer;
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                int i2 = this.f27125q;
                if (i2 > 0) {
                    int i3 = this.f27123k;
                    C4708g c4708g = ld6.this.f27119g;
                    this.f27122g.write(c4708g.m16469q((i3 << (c4708g.f27116q - i2)) & c4708g.f68346zy));
                    this.f27124n++;
                    if (ld6.this.f68348f7l8 != null) {
                        while (true) {
                            int i4 = this.f27124n;
                            ld6 ld6Var = ld6.this;
                            if (i4 % ld6Var.f27119g.f27115n == 0) {
                                break;
                            }
                            this.f27122g.write(ld6Var.f68348f7l8.charValue());
                            this.f27124n++;
                        }
                    }
                }
                this.f27122g.close();
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public void flush() throws IOException {
                this.f27122g.flush();
            }

            @Override // java.io.OutputStream
            public void write(int i2) throws IOException {
                this.f27123k = (i2 & 255) | (this.f27123k << 8);
                this.f27125q += 8;
                while (true) {
                    int i3 = this.f27125q;
                    C4708g c4708g = ld6.this.f27119g;
                    int i4 = c4708g.f27116q;
                    if (i3 < i4) {
                        return;
                    }
                    this.f27122g.write(c4708g.m16469q((this.f27123k >> (i3 - i4)) & c4708g.f68346zy));
                    this.f27124n++;
                    this.f27125q -= ld6.this.f27119g.f27116q;
                }
            }
        }

        /* JADX INFO: renamed from: com.google.common.io.toq$ld6$toq, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BaseEncoding.java */
        class C8010toq extends InputStream {

            /* JADX INFO: renamed from: y */
            final /* synthetic */ Reader f27132y;

            /* JADX INFO: renamed from: k */
            int f27128k = 0;

            /* JADX INFO: renamed from: q */
            int f27130q = 0;

            /* JADX INFO: renamed from: n */
            int f27129n = 0;

            /* JADX INFO: renamed from: g */
            boolean f27127g = false;

            C8010toq(Reader reader) {
                this.f27132y = reader;
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() throws IOException {
                this.f27132y.close();
            }

            /* JADX WARN: Code restructure failed: missing block: B:24:0x0074, code lost:
            
                throw new com.google.common.io.toq.C4714s("Padding cannot start at index " + r4.f27129n);
             */
            @Override // java.io.InputStream
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public int read() throws java.io.IOException {
                /*
                    r4 = this;
                L0:
                    java.io.Reader r0 = r4.f27132y
                    int r0 = r0.read()
                    r1 = -1
                    if (r0 != r1) goto L34
                    boolean r0 = r4.f27127g
                    if (r0 != 0) goto L33
                    com.google.common.io.toq$ld6 r0 = com.google.common.io.toq.ld6.this
                    com.google.common.io.toq$g r0 = r0.f27119g
                    int r2 = r4.f27129n
                    boolean r0 = r0.f7l8(r2)
                    if (r0 == 0) goto L1a
                    goto L33
                L1a:
                    com.google.common.io.toq$s r0 = new com.google.common.io.toq$s
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Invalid input length "
                    r1.append(r2)
                    int r2 = r4.f27129n
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L33:
                    return r1
                L34:
                    int r1 = r4.f27129n
                    r2 = 1
                    int r1 = r1 + r2
                    r4.f27129n = r1
                    char r0 = (char) r0
                    com.google.common.io.toq$ld6 r1 = com.google.common.io.toq.ld6.this
                    java.lang.Character r1 = r1.f68348f7l8
                    if (r1 == 0) goto L78
                    char r1 = r1.charValue()
                    if (r1 != r0) goto L78
                    boolean r0 = r4.f27127g
                    if (r0 != 0) goto L75
                    int r0 = r4.f27129n
                    if (r0 == r2) goto L5c
                    com.google.common.io.toq$ld6 r1 = com.google.common.io.toq.ld6.this
                    com.google.common.io.toq$g r1 = r1.f27119g
                    int r0 = r0 + (-1)
                    boolean r0 = r1.f7l8(r0)
                    if (r0 == 0) goto L5c
                    goto L75
                L5c:
                    com.google.common.io.toq$s r0 = new com.google.common.io.toq$s
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = "Padding cannot start at index "
                    r1.append(r2)
                    int r2 = r4.f27129n
                    r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    r0.<init>(r1)
                    throw r0
                L75:
                    r4.f27127g = r2
                    goto L0
                L78:
                    boolean r1 = r4.f27127g
                    if (r1 != 0) goto La4
                    int r1 = r4.f27128k
                    com.google.common.io.toq$ld6 r2 = com.google.common.io.toq.ld6.this
                    com.google.common.io.toq$g r2 = r2.f27119g
                    int r3 = r2.f27116q
                    int r1 = r1 << r3
                    r4.f27128k = r1
                    int r0 = r2.zy(r0)
                    r0 = r0 | r1
                    r4.f27128k = r0
                    int r1 = r4.f27130q
                    com.google.common.io.toq$ld6 r2 = com.google.common.io.toq.ld6.this
                    com.google.common.io.toq$g r2 = r2.f27119g
                    int r2 = r2.f27116q
                    int r1 = r1 + r2
                    r4.f27130q = r1
                    r2 = 8
                    if (r1 < r2) goto L0
                    int r1 = r1 - r2
                    r4.f27130q = r1
                    int r0 = r0 >> r1
                    r0 = r0 & 255(0xff, float:3.57E-43)
                    return r0
                La4:
                    com.google.common.io.toq$s r1 = new com.google.common.io.toq$s
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    r2.<init>()
                    java.lang.String r3 = "Expected padding character but found '"
                    r2.append(r3)
                    r2.append(r0)
                    java.lang.String r0 = "' at index "
                    r2.append(r0)
                    int r0 = r4.f27129n
                    r2.append(r0)
                    java.lang.String r0 = r2.toString()
                    r1.<init>(r0)
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.toq.ld6.C8010toq.read():int");
            }
        }

        ld6(String str, String str2, @NullableDecl Character ch2) {
            this(new C4708g(str, str2.toCharArray()), ch2);
        }

        public boolean equals(@NullableDecl Object obj) {
            if (!(obj instanceof ld6)) {
                return false;
            }
            ld6 ld6Var = (ld6) obj;
            return this.f27119g.equals(ld6Var.f27119g) && C4280z.m15455k(this.f68348f7l8, ld6Var.f68348f7l8);
        }

        @Override // com.google.common.io.toq
        int fn3e(int i2) {
            C4708g c4708g = this.f27119g;
            return c4708g.f27115n * C4723q.f7l8(i2, c4708g.f27113g, RoundingMode.CEILING);
        }

        @Override // com.google.common.io.toq
        /* JADX INFO: renamed from: g */
        public boolean mo16457g(CharSequence charSequence) {
            com.google.common.base.jk.a9(charSequence);
            CharSequence charSequenceMo16464z = mo16464z(charSequence);
            if (!this.f27119g.f7l8(charSequenceMo16464z.length())) {
                return false;
            }
            for (int i2 = 0; i2 < charSequenceMo16464z.length(); i2++) {
                if (!this.f27119g.toq(charSequenceMo16464z.charAt(i2))) {
                    return false;
                }
            }
            return true;
        }

        @Override // com.google.common.io.toq
        @wlev.zy
        /* JADX INFO: renamed from: h */
        public OutputStream mo16458h(Writer writer) {
            com.google.common.base.jk.a9(writer);
            return new C4710k(writer);
        }

        public int hashCode() {
            return this.f27119g.hashCode() ^ C4280z.toq(this.f68348f7l8);
        }

        @Override // com.google.common.io.toq
        /* JADX INFO: renamed from: i */
        int mo16459i(int i2) {
            return (int) (((((long) this.f27119g.f27116q) * ((long) i2)) + 7) / 8);
        }

        toq jk(C4708g c4708g, @NullableDecl Character ch2) {
            return new ld6(c4708g, ch2);
        }

        @Override // com.google.common.io.toq
        @wlev.zy
        public InputStream ld6(Reader reader) {
            com.google.common.base.jk.a9(reader);
            return new C8010toq(reader);
        }

        void mcp(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            com.google.common.base.jk.a9(appendable);
            com.google.common.base.jk.ek5k(i2, i2 + i3, bArr.length);
            int i4 = 0;
            com.google.common.base.jk.m15383q(i3 <= this.f27119g.f27113g);
            long j2 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                j2 = (j2 | ((long) (bArr[i2 + i5] & 255))) << 8;
            }
            int i6 = ((i3 + 1) * 8) - this.f27119g.f27116q;
            while (i4 < i3 * 8) {
                C4708g c4708g = this.f27119g;
                appendable.append(c4708g.m16469q(((int) (j2 >>> (i6 - i4))) & c4708g.f68346zy));
                i4 += this.f27119g.f27116q;
            }
            if (this.f68348f7l8 != null) {
                while (i4 < this.f27119g.f27113g * 8) {
                    appendable.append(this.f68348f7l8.charValue());
                    i4 += this.f27119g.f27116q;
                }
            }
        }

        @Override // com.google.common.io.toq
        void n7h(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            com.google.common.base.jk.a9(appendable);
            com.google.common.base.jk.ek5k(i2, i2 + i3, bArr.length);
            int i4 = 0;
            while (i4 < i3) {
                mcp(appendable, bArr, i2 + i4, Math.min(this.f27119g.f27113g, i3 - i4));
                i4 += this.f27119g.f27113g;
            }
        }

        @Override // com.google.common.io.toq
        public toq o1t() {
            toq toqVarJk = this.f27121y;
            if (toqVarJk == null) {
                C4708g c4708gM16468p = this.f27119g.m16468p();
                toqVarJk = c4708gM16468p == this.f27119g ? this : jk(c4708gM16468p, this.f68348f7l8);
                this.f27121y = toqVarJk;
            }
            return toqVarJk;
        }

        @Override // com.google.common.io.toq
        /* JADX INFO: renamed from: s */
        int mo16461s(byte[] bArr, CharSequence charSequence) throws C4714s {
            C4708g c4708g;
            com.google.common.base.jk.a9(bArr);
            CharSequence charSequenceMo16464z = mo16464z(charSequence);
            if (!this.f27119g.f7l8(charSequenceMo16464z.length())) {
                throw new C4714s("Invalid input length " + charSequenceMo16464z.length());
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < charSequenceMo16464z.length()) {
                long jZy = 0;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    c4708g = this.f27119g;
                    if (i4 >= c4708g.f27115n) {
                        break;
                    }
                    jZy <<= c4708g.f27116q;
                    if (i2 + i4 < charSequenceMo16464z.length()) {
                        jZy |= (long) this.f27119g.zy(charSequenceMo16464z.charAt(i5 + i2));
                        i5++;
                    }
                    i4++;
                }
                int i6 = c4708g.f27113g;
                int i7 = (i6 * 8) - (i5 * c4708g.f27116q);
                int i8 = (i6 - 1) * 8;
                while (i8 >= i7) {
                    bArr[i3] = (byte) ((jZy >>> i8) & 255);
                    i8 -= 8;
                    i3++;
                }
                i2 += this.f27119g.f27115n;
            }
            return i3;
        }

        @Override // com.google.common.io.toq
        /* JADX INFO: renamed from: t */
        public toq mo16462t(String str, int i2) {
            for (int i3 = 0; i3 < str.length(); i3++) {
                com.google.common.base.jk.fn3e(!this.f27119g.m16470s(str.charAt(i3)), "Separator (%s) cannot contain alphabet characters", str);
            }
            Character ch2 = this.f68348f7l8;
            if (ch2 != null) {
                com.google.common.base.jk.fn3e(str.indexOf(ch2.charValue()) < 0, "Separator (%s) cannot contain padding character", str);
            }
            return new C4712p(this, str, i2);
        }

        @Override // com.google.common.io.toq
        public toq t8r() {
            toq toqVarJk = this.f27120s;
            if (toqVarJk == null) {
                C4708g c4708gM16471y = this.f27119g.m16471y();
                toqVarJk = c4708gM16471y == this.f27119g ? this : jk(c4708gM16471y, this.f68348f7l8);
                this.f27120s = toqVarJk;
            }
            return toqVarJk;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("BaseEncoding.");
            sb.append(this.f27119g.toString());
            if (8 % this.f27119g.f27116q != 0) {
                if (this.f68348f7l8 == null) {
                    sb.append(".omitPadding()");
                } else {
                    sb.append(".withPadChar('");
                    sb.append(this.f68348f7l8);
                    sb.append("')");
                }
            }
            return sb.toString();
        }

        @Override // com.google.common.io.toq
        public toq wvg(char c2) {
            Character ch2;
            return (8 % this.f27119g.f27116q == 0 || ((ch2 = this.f68348f7l8) != null && ch2.charValue() == c2)) ? this : jk(this.f27119g, Character.valueOf(c2));
        }

        @Override // com.google.common.io.toq
        /* JADX INFO: renamed from: z */
        CharSequence mo16464z(CharSequence charSequence) {
            com.google.common.base.jk.a9(charSequence);
            Character ch2 = this.f68348f7l8;
            if (ch2 == null) {
                return charSequence;
            }
            char cCharValue = ch2.charValue();
            int length = charSequence.length() - 1;
            while (length >= 0 && charSequence.charAt(length) == cCharValue) {
                length--;
            }
            return charSequence.subSequence(0, length + 1);
        }

        @Override // com.google.common.io.toq
        public toq zurt() {
            return this.f68348f7l8 == null ? this : jk(this.f27119g, null);
        }

        ld6(C4708g c4708g, @NullableDecl Character ch2) {
            this.f27119g = (C4708g) com.google.common.base.jk.a9(c4708g);
            com.google.common.base.jk.fn3e(ch2 == null || !c4708g.m16470s(ch2.charValue()), "Padding character %s was already in alphabet", ch2);
            this.f68348f7l8 = ch2;
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.toq$n */
    /* JADX INFO: compiled from: BaseEncoding.java */
    static class C4711n extends Writer {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Appendable f27133k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Writer f27134q;

        C4711n(Appendable appendable, Writer writer) {
            this.f27133k = appendable;
            this.f27134q = writer;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f27134q.close();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() throws IOException {
            this.f27134q.flush();
        }

        @Override // java.io.Writer
        public void write(int i2) throws IOException {
            this.f27133k.append((char) i2);
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i2, int i3) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.toq$p */
    /* JADX INFO: compiled from: BaseEncoding.java */
    static final class C4712p extends toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final String f68349f7l8;

        /* JADX INFO: renamed from: g */
        private final toq f27135g;

        /* JADX INFO: renamed from: y */
        private final int f27136y;

        C4712p(toq toqVar, String str, int i2) {
            this.f27135g = (toq) com.google.common.base.jk.a9(toqVar);
            this.f68349f7l8 = (String) com.google.common.base.jk.a9(str);
            this.f27136y = i2;
            com.google.common.base.jk.ld6(i2 > 0, "Cannot add a separator after every %s chars", i2);
        }

        @Override // com.google.common.io.toq
        int fn3e(int i2) {
            int iFn3e = this.f27135g.fn3e(i2);
            return iFn3e + (this.f68349f7l8.length() * C4723q.f7l8(Math.max(0, iFn3e - 1), this.f27136y, RoundingMode.FLOOR));
        }

        @Override // com.google.common.io.toq
        /* JADX INFO: renamed from: g */
        public boolean mo16457g(CharSequence charSequence) {
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                char cCharAt = charSequence.charAt(i2);
                if (this.f68349f7l8.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.f27135g.mo16457g(sb);
        }

        @Override // com.google.common.io.toq
        @wlev.zy
        /* JADX INFO: renamed from: h */
        public OutputStream mo16458h(Writer writer) {
            return this.f27135g.mo16458h(toq.fu4(writer, this.f68349f7l8, this.f27136y));
        }

        @Override // com.google.common.io.toq
        /* JADX INFO: renamed from: i */
        int mo16459i(int i2) {
            return this.f27135g.mo16459i(i2);
        }

        @Override // com.google.common.io.toq
        @wlev.zy
        public InputStream ld6(Reader reader) {
            return this.f27135g.ld6(toq.ki(reader, this.f68349f7l8));
        }

        @Override // com.google.common.io.toq
        void n7h(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            this.f27135g.n7h(toq.ni7(appendable, this.f68349f7l8, this.f27136y), bArr, i2, i3);
        }

        @Override // com.google.common.io.toq
        public toq o1t() {
            return this.f27135g.o1t().mo16462t(this.f68349f7l8, this.f27136y);
        }

        @Override // com.google.common.io.toq
        /* JADX INFO: renamed from: s */
        int mo16461s(byte[] bArr, CharSequence charSequence) throws C4714s {
            StringBuilder sb = new StringBuilder(charSequence.length());
            for (int i2 = 0; i2 < charSequence.length(); i2++) {
                char cCharAt = charSequence.charAt(i2);
                if (this.f68349f7l8.indexOf(cCharAt) < 0) {
                    sb.append(cCharAt);
                }
            }
            return this.f27135g.mo16461s(bArr, sb);
        }

        @Override // com.google.common.io.toq
        /* JADX INFO: renamed from: t */
        public toq mo16462t(String str, int i2) {
            throw new UnsupportedOperationException("Already have a separator");
        }

        @Override // com.google.common.io.toq
        public toq t8r() {
            return this.f27135g.t8r().mo16462t(this.f68349f7l8, this.f27136y);
        }

        public String toString() {
            return this.f27135g + ".withSeparator(\"" + this.f68349f7l8 + "\", " + this.f27136y + ")";
        }

        @Override // com.google.common.io.toq
        public toq wvg(char c2) {
            return this.f27135g.wvg(c2).mo16462t(this.f68349f7l8, this.f27136y);
        }

        @Override // com.google.common.io.toq
        /* JADX INFO: renamed from: z */
        CharSequence mo16464z(CharSequence charSequence) {
            return this.f27135g.mo16464z(charSequence);
        }

        @Override // com.google.common.io.toq
        public toq zurt() {
            return this.f27135g.zurt().mo16462t(this.f68349f7l8, this.f27136y);
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.toq$s */
    /* JADX INFO: compiled from: BaseEncoding.java */
    public static final class C4714s extends IOException {
        C4714s(String str) {
            super(str);
        }

        C4714s(Throwable th) {
            super(th);
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.toq$toq, reason: collision with other inner class name */
    /* JADX INFO: compiled from: BaseEncoding.java */
    class C8011toq extends com.google.common.io.f7l8 {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.google.common.io.ld6 f27141k;

        C8011toq(com.google.common.io.ld6 ld6Var) {
            this.f27141k = ld6Var;
        }

        @Override // com.google.common.io.f7l8
        public InputStream qrj() throws IOException {
            return toq.this.ld6(this.f27141k.qrj());
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.toq$y */
    /* JADX INFO: compiled from: BaseEncoding.java */
    static final class C4715y extends ld6 {
        C4715y(String str, String str2, @NullableDecl Character ch2) {
            this(new C4708g(str, str2.toCharArray()), ch2);
        }

        @Override // com.google.common.io.toq.ld6
        toq jk(C4708g c4708g, @NullableDecl Character ch2) {
            return new C4715y(c4708g, ch2);
        }

        @Override // com.google.common.io.toq.ld6, com.google.common.io.toq
        void n7h(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException {
            com.google.common.base.jk.a9(appendable);
            int i4 = i2 + i3;
            com.google.common.base.jk.ek5k(i2, i4, bArr.length);
            while (i3 >= 3) {
                int i5 = i2 + 1;
                int i6 = i5 + 1;
                int i7 = ((bArr[i2] & 255) << 16) | ((bArr[i5] & 255) << 8) | (bArr[i6] & 255);
                appendable.append(this.f27119g.m16469q(i7 >>> 18));
                appendable.append(this.f27119g.m16469q((i7 >>> 12) & 63));
                appendable.append(this.f27119g.m16469q((i7 >>> 6) & 63));
                appendable.append(this.f27119g.m16469q(i7 & 63));
                i3 -= 3;
                i2 = i6 + 1;
            }
            if (i2 < i4) {
                mcp(appendable, bArr, i2, i4 - i2);
            }
        }

        @Override // com.google.common.io.toq.ld6, com.google.common.io.toq
        /* JADX INFO: renamed from: s */
        int mo16461s(byte[] bArr, CharSequence charSequence) throws C4714s {
            com.google.common.base.jk.a9(bArr);
            CharSequence charSequenceMo16464z = mo16464z(charSequence);
            if (!this.f27119g.f7l8(charSequenceMo16464z.length())) {
                throw new C4714s("Invalid input length " + charSequenceMo16464z.length());
            }
            int i2 = 0;
            int i3 = 0;
            while (i2 < charSequenceMo16464z.length()) {
                int i4 = i2 + 1;
                int i5 = i4 + 1;
                int iZy = (this.f27119g.zy(charSequenceMo16464z.charAt(i2)) << 18) | (this.f27119g.zy(charSequenceMo16464z.charAt(i4)) << 12);
                int i6 = i3 + 1;
                bArr[i3] = (byte) (iZy >>> 16);
                if (i5 < charSequenceMo16464z.length()) {
                    int i7 = i5 + 1;
                    int iZy2 = iZy | (this.f27119g.zy(charSequenceMo16464z.charAt(i5)) << 6);
                    i3 = i6 + 1;
                    bArr[i6] = (byte) ((iZy2 >>> 8) & 255);
                    if (i7 < charSequenceMo16464z.length()) {
                        i5 = i7 + 1;
                        i6 = i3 + 1;
                        bArr[i3] = (byte) ((iZy2 | this.f27119g.zy(charSequenceMo16464z.charAt(i7))) & 255);
                    } else {
                        i2 = i7;
                    }
                }
                i3 = i6;
                i2 = i5;
            }
            return i3;
        }

        private C4715y(C4708g c4708g, @NullableDecl Character ch2) {
            super(c4708g, ch2);
            com.google.common.base.jk.m15383q(c4708g.f68345toq.length == 64);
        }
    }

    toq() {
    }

    private static byte[] cdj(byte[] bArr, int i2) {
        if (i2 == bArr.length) {
            return bArr;
        }
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return bArr2;
    }

    @wlev.zy
    static Writer fu4(Writer writer, String str, int i2) {
        return new C4711n(ni7(writer, str, i2), writer);
    }

    /* JADX INFO: renamed from: k */
    public static toq m16454k() {
        return f27110n;
    }

    @wlev.zy
    static Reader ki(Reader reader, String str) {
        com.google.common.base.jk.a9(reader);
        com.google.common.base.jk.a9(str);
        return new zy(reader, str);
    }

    /* JADX INFO: renamed from: n */
    public static toq m16455n() {
        return f68342toq;
    }

    static Appendable ni7(Appendable appendable, String str, int i2) {
        com.google.common.base.jk.a9(appendable);
        com.google.common.base.jk.a9(str);
        com.google.common.base.jk.m15383q(i2 > 0);
        return new C4713q(i2, appendable, str);
    }

    /* JADX INFO: renamed from: q */
    public static toq m16456q() {
        return f27109k;
    }

    public static toq toq() {
        return f68343zy;
    }

    public static toq zy() {
        return f27111q;
    }

    public final byte[] f7l8(CharSequence charSequence) {
        try {
            return m16463y(charSequence);
        } catch (C4714s e2) {
            throw new IllegalArgumentException(e2);
        }
    }

    abstract int fn3e(int i2);

    /* JADX INFO: renamed from: g */
    public abstract boolean mo16457g(CharSequence charSequence);

    @wlev.zy
    /* JADX INFO: renamed from: h */
    public abstract OutputStream mo16458h(Writer writer);

    /* JADX INFO: renamed from: i */
    abstract int mo16459i(int i2);

    @wlev.zy
    public final AbstractC4688g kja0(AbstractC4700p abstractC4700p) {
        com.google.common.base.jk.a9(abstractC4700p);
        return new C4709k(abstractC4700p);
    }

    @wlev.zy
    public abstract InputStream ld6(Reader reader);

    abstract void n7h(Appendable appendable, byte[] bArr, int i2, int i3) throws IOException;

    public abstract toq o1t();

    @wlev.zy
    /* JADX INFO: renamed from: p */
    public final com.google.common.io.f7l8 m16460p(com.google.common.io.ld6 ld6Var) {
        com.google.common.base.jk.a9(ld6Var);
        return new C8011toq(ld6Var);
    }

    public final String qrj(byte[] bArr, int i2, int i3) {
        com.google.common.base.jk.ek5k(i2, i2 + i3, bArr.length);
        StringBuilder sb = new StringBuilder(fn3e(i3));
        try {
            n7h(sb, bArr, i2, i3);
            return sb.toString();
        } catch (IOException e2) {
            throw new AssertionError(e2);
        }
    }

    /* JADX INFO: renamed from: s */
    abstract int mo16461s(byte[] bArr, CharSequence charSequence) throws C4714s;

    /* JADX INFO: renamed from: t */
    public abstract toq mo16462t(String str, int i2);

    public abstract toq t8r();

    public abstract toq wvg(char c2);

    public String x2(byte[] bArr) {
        return qrj(bArr, 0, bArr.length);
    }

    /* JADX INFO: renamed from: y */
    final byte[] m16463y(CharSequence charSequence) throws C4714s {
        CharSequence charSequenceMo16464z = mo16464z(charSequence);
        byte[] bArr = new byte[mo16459i(charSequenceMo16464z.length())];
        return cdj(bArr, mo16461s(bArr, charSequenceMo16464z));
    }

    /* JADX INFO: renamed from: z */
    CharSequence mo16464z(CharSequence charSequence) {
        return (CharSequence) com.google.common.base.jk.a9(charSequence);
    }

    public abstract toq zurt();

    /* JADX INFO: compiled from: BaseEncoding.java */
    static class zy extends Reader {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Reader f27142k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ String f27143q;

        zy(Reader reader, String str) {
            this.f27142k = reader;
            this.f27143q = str;
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f27142k.close();
        }

        @Override // java.io.Reader
        public int read() throws IOException {
            int i2;
            do {
                i2 = this.f27142k.read();
                if (i2 == -1) {
                    break;
                }
            } while (this.f27143q.indexOf((char) i2) >= 0);
            return i2;
        }

        @Override // java.io.Reader
        public int read(char[] cArr, int i2, int i3) throws IOException {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: renamed from: com.google.common.io.toq$q */
    /* JADX INFO: compiled from: BaseEncoding.java */
    static class C4713q implements Appendable {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ String f27137g;

        /* JADX INFO: renamed from: k */
        int f27138k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Appendable f27139n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f27140q;

        C4713q(int i2, Appendable appendable, String str) {
            this.f27140q = i2;
            this.f27139n = appendable;
            this.f27137g = str;
            this.f27138k = i2;
        }

        @Override // java.lang.Appendable
        public Appendable append(char c2) throws IOException {
            if (this.f27138k == 0) {
                this.f27139n.append(this.f27137g);
                this.f27138k = this.f27140q;
            }
            this.f27139n.append(c2);
            this.f27138k--;
            return this;
        }

        @Override // java.lang.Appendable
        public Appendable append(@NullableDecl CharSequence charSequence, int i2, int i3) throws IOException {
            throw new UnsupportedOperationException();
        }

        @Override // java.lang.Appendable
        public Appendable append(@NullableDecl CharSequence charSequence) throws IOException {
            throw new UnsupportedOperationException();
        }
    }
}
