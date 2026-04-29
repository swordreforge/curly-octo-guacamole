package com.google.gson.stream;

import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.util.Arrays;

/* JADX INFO: renamed from: com.google.gson.stream.q */
/* JADX INFO: compiled from: JsonWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4926q implements Closeable, Flushable {

    /* JADX INFO: renamed from: t */
    private static final String[] f27851t;

    /* JADX INFO: renamed from: z */
    private static final String[] f27852z = new String[128];

    /* JADX INFO: renamed from: g */
    private String f27853g;

    /* JADX INFO: renamed from: h */
    private String f27854h;

    /* JADX INFO: renamed from: i */
    private boolean f27855i;

    /* JADX INFO: renamed from: k */
    private final Writer f27856k;

    /* JADX INFO: renamed from: p */
    private boolean f27858p;

    /* JADX INFO: renamed from: s */
    private boolean f27860s;

    /* JADX INFO: renamed from: y */
    private String f27861y;

    /* JADX INFO: renamed from: q */
    private int[] f27859q = new int[32];

    /* JADX INFO: renamed from: n */
    private int f27857n = 0;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f27852z[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f27852z;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f27851t = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public C4926q(Writer writer) {
        y9n(6);
        this.f27861y = ":";
        this.f27855i = true;
        if (writer == null) {
            throw new NullPointerException("out == null");
        }
        this.f27856k = writer;
    }

    private void d2ok() throws IOException {
        if (this.f27853g == null) {
            return;
        }
        this.f27856k.write(10);
        int i2 = this.f27857n;
        for (int i3 = 1; i3 < i2; i3++) {
            this.f27856k.write(this.f27853g);
        }
    }

    /* JADX INFO: renamed from: f */
    private C4926q m17229f(int i2, char c2) throws IOException {
        zy();
        y9n(i2);
        this.f27856k.write(c2);
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void g1(java.lang.String r9) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.f27858p
            if (r0 == 0) goto L7
            java.lang.String[] r0 = com.google.gson.stream.C4926q.f27851t
            goto L9
        L7:
            java.lang.String[] r0 = com.google.gson.stream.C4926q.f27852z
        L9:
            java.io.Writer r1 = r8.f27856k
            r2 = 34
            r1.write(r2)
            int r1 = r9.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r1) goto L45
            char r5 = r9.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L42
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L42
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L3b
            java.io.Writer r6 = r8.f27856k
            int r7 = r3 - r4
            r6.write(r9, r4, r7)
        L3b:
            java.io.Writer r4 = r8.f27856k
            r4.write(r5)
            int r4 = r3 + 1
        L42:
            int r3 = r3 + 1
            goto L16
        L45:
            if (r4 >= r1) goto L4d
            java.io.Writer r0 = r8.f27856k
            int r1 = r1 - r4
            r0.write(r9, r4, r1)
        L4d:
            java.io.Writer r9 = r8.f27856k
            r9.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.stream.C4926q.g1(java.lang.String):void");
    }

    private void i1(int i2) {
        this.f27859q[this.f27857n - 1] = i2;
    }

    /* JADX INFO: renamed from: k */
    private void m17230k() throws IOException {
        int iYz = yz();
        if (iYz == 5) {
            this.f27856k.write(44);
        } else if (iYz != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        d2ok();
        i1(4);
    }

    private void nsb() throws IOException {
        if (this.f27854h != null) {
            m17230k();
            g1(this.f27854h);
            this.f27854h = null;
        }
    }

    /* JADX INFO: renamed from: p */
    private C4926q m17231p(int i2, int i3, char c2) throws IOException {
        int iYz = yz();
        if (iYz != i3 && iYz != i2) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.f27854h != null) {
            throw new IllegalStateException("Dangling name: " + this.f27854h);
        }
        this.f27857n--;
        if (iYz == i3) {
            d2ok();
        }
        this.f27856k.write(c2);
        return this;
    }

    private void y9n(int i2) {
        int i3 = this.f27857n;
        int[] iArr = this.f27859q;
        if (i3 == iArr.length) {
            this.f27859q = Arrays.copyOf(iArr, i3 * 2);
        }
        int[] iArr2 = this.f27859q;
        int i4 = this.f27857n;
        this.f27857n = i4 + 1;
        iArr2[i4] = i2;
    }

    private int yz() {
        int i2 = this.f27857n;
        if (i2 != 0) {
            return this.f27859q[i2 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void zy() throws IOException {
        int iYz = yz();
        if (iYz == 1) {
            i1(2);
            d2ok();
            return;
        }
        if (iYz == 2) {
            this.f27856k.append(',');
            d2ok();
        } else {
            if (iYz == 4) {
                this.f27856k.append((CharSequence) this.f27861y);
                i1(5);
                return;
            }
            if (iYz != 6) {
                if (iYz != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (!this.f27860s) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            i1(7);
        }
    }

    public final void a98o(boolean z2) {
        this.f27858p = z2;
    }

    public C4926q bek6(Number number) throws IOException {
        if (number == null) {
            return hyr();
        }
        nsb();
        String string = number.toString();
        if (this.f27860s || !(string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            zy();
            this.f27856k.append((CharSequence) string);
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + number);
    }

    public C4926q bwp(Boolean bool) throws IOException {
        if (bool == null) {
            return hyr();
        }
        nsb();
        zy();
        this.f27856k.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f27856k.close();
        int i2 = this.f27857n;
        if (i2 > 1 || (i2 == 1 && this.f27859q[i2 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.f27857n = 0;
    }

    public void flush() throws IOException {
        if (this.f27857n == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f27856k.flush();
    }

    public boolean fu4() {
        return this.f27860s;
    }

    /* JADX INFO: renamed from: h */
    public final boolean m17232h() {
        return this.f27855i;
    }

    public C4926q h7am(String str) throws IOException {
        if (str == null) {
            return hyr();
        }
        nsb();
        zy();
        g1(str);
        return this;
    }

    public C4926q hyr() throws IOException {
        if (this.f27854h != null) {
            if (!this.f27855i) {
                this.f27854h = null;
                return this;
            }
            nsb();
        }
        zy();
        this.f27856k.write("null");
        return this;
    }

    public C4926q ij(boolean z2) throws IOException {
        nsb();
        zy();
        this.f27856k.write(z2 ? "true" : "false");
        return this;
    }

    public final boolean ki() {
        return this.f27858p;
    }

    public C4926q ld6() throws IOException {
        return m17231p(1, 2, ']');
    }

    public C4926q ltg8(long j2) throws IOException {
        nsb();
        zy();
        this.f27856k.write(Long.toString(j2));
        return this;
    }

    public final void nmn5(boolean z2) {
        this.f27860s = z2;
    }

    /* JADX INFO: renamed from: q */
    public C4926q mo17110q() throws IOException {
        nsb();
        return m17229f(1, '[');
    }

    /* JADX INFO: renamed from: t */
    public C4926q mo17111t(String str) throws IOException {
        if (str == null) {
            throw new NullPointerException("name == null");
        }
        if (this.f27854h != null) {
            throw new IllegalStateException();
        }
        if (this.f27857n == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.f27854h = str;
        return this;
    }

    public final void t8iq(boolean z2) {
        this.f27855i = z2;
    }

    public C4926q was(double d2) throws IOException {
        nsb();
        if (this.f27860s || !(Double.isNaN(d2) || Double.isInfinite(d2))) {
            zy();
            this.f27856k.append((CharSequence) Double.toString(d2));
            return this;
        }
        throw new IllegalArgumentException("Numeric values must be finite, but was " + d2);
    }

    public C4926q wvg(String str) throws IOException {
        if (str == null) {
            return hyr();
        }
        nsb();
        zy();
        this.f27856k.append((CharSequence) str);
        return this;
    }

    /* JADX INFO: renamed from: x */
    public final void m17233x(String str) {
        if (str.length() == 0) {
            this.f27853g = null;
            this.f27861y = ":";
        } else {
            this.f27853g = str;
            this.f27861y = ": ";
        }
    }

    public C4926q x2() throws IOException {
        return m17231p(3, 5, '}');
    }

    /* JADX INFO: renamed from: y */
    public C4926q mo17112y() throws IOException {
        nsb();
        return m17229f(3, '{');
    }
}
