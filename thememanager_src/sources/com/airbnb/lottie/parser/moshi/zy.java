package com.airbnb.lottie.parser.moshi;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import okio.dd;
import okio.kja0;
import okio.n7h;
import okio.x2;

/* JADX INFO: compiled from: JsonReader.java */
/* JADX INFO: loaded from: classes.dex */
public abstract class zy implements Closeable {

    /* JADX INFO: renamed from: p */
    private static final String[] f8207p = new String[128];

    /* JADX INFO: renamed from: k */
    int f8209k;

    /* JADX INFO: renamed from: s */
    boolean f8212s;

    /* JADX INFO: renamed from: y */
    boolean f8213y;

    /* JADX INFO: renamed from: q */
    int[] f8211q = new int[32];

    /* JADX INFO: renamed from: n */
    String[] f8210n = new String[32];

    /* JADX INFO: renamed from: g */
    int[] f8208g = new int[32];

    /* JADX INFO: renamed from: com.airbnb.lottie.parser.moshi.zy$k */
    /* JADX INFO: compiled from: JsonReader.java */
    public static final class C1492k {

        /* JADX INFO: renamed from: k */
        final String[] f8214k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final dd f56171toq;

        private C1492k(String[] strArr, dd ddVar) {
            this.f8214k = strArr;
            this.f56171toq = ddVar;
        }

        /* JADX INFO: renamed from: k */
        public static C1492k m6178k(String... strArr) {
            try {
                kja0[] kja0VarArr = new kja0[strArr.length];
                x2 x2Var = new x2();
                for (int i2 = 0; i2 < strArr.length; i2++) {
                    zy.i1(x2Var, strArr[i2]);
                    x2Var.readByte();
                    kja0VarArr[i2] = x2Var.uj2j();
                }
                return new C1492k((String[]) strArr.clone(), dd.m27599s(kja0VarArr));
            } catch (IOException e2) {
                throw new AssertionError(e2);
            }
        }
    }

    /* JADX INFO: compiled from: JsonReader.java */
    public enum toq {
        BEGIN_ARRAY,
        END_ARRAY,
        BEGIN_OBJECT,
        END_OBJECT,
        NAME,
        STRING,
        NUMBER,
        BOOLEAN,
        NULL,
        END_DOCUMENT
    }

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f8207p[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f8207p;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    zy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void i1(okio.qrj r7, java.lang.String r8) throws java.io.IOException {
        /*
            java.lang.String[] r0 = com.airbnb.lottie.parser.moshi.zy.f8207p
            r1 = 34
            r7.writeByte(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        Ld:
            if (r3 >= r2) goto L36
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L1c
            r5 = r0[r5]
            if (r5 != 0) goto L29
            goto L33
        L1c:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L23
            java.lang.String r5 = "\\u2028"
            goto L29
        L23:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L33
            java.lang.String r5 = "\\u2029"
        L29:
            if (r4 >= r3) goto L2e
            r7.mo27639m(r8, r4, r3)
        L2e:
            r7.lrht(r5)
            int r4 = r3 + 1
        L33:
            int r3 = r3 + 1
            goto Ld
        L36:
            if (r4 >= r2) goto L3b
            r7.mo27639m(r8, r4, r2)
        L3b:
            r7.writeByte(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.airbnb.lottie.parser.moshi.zy.i1(okio.qrj, java.lang.String):void");
    }

    /* JADX INFO: renamed from: t */
    public static zy m6177t(n7h n7hVar) {
        return new C1490n(n7hVar);
    }

    final com.airbnb.lottie.parser.moshi.toq a98o(String str) throws com.airbnb.lottie.parser.moshi.toq {
        throw new com.airbnb.lottie.parser.moshi.toq(str + " at path " + getPath());
    }

    public abstract toq d2ok() throws IOException;

    /* JADX INFO: renamed from: f */
    public abstract int mo6170f(C1492k c1492k) throws IOException;

    public abstract String fu4() throws IOException;

    public final String getPath() {
        return C1491q.m6175k(this.f8209k, this.f8211q, this.f8210n, this.f8208g);
    }

    /* JADX INFO: renamed from: h */
    public abstract double mo6171h() throws IOException;

    final void hyr(int i2) {
        int i3 = this.f8209k;
        int[] iArr = this.f8211q;
        if (i3 == iArr.length) {
            if (i3 == 256) {
                throw new C1489k("Nesting too deep at " + getPath());
            }
            this.f8211q = Arrays.copyOf(iArr, iArr.length * 2);
            String[] strArr = this.f8210n;
            this.f8210n = (String[]) Arrays.copyOf(strArr, strArr.length * 2);
            int[] iArr2 = this.f8208g;
            this.f8208g = Arrays.copyOf(iArr2, iArr2.length * 2);
        }
        int[] iArr3 = this.f8211q;
        int i4 = this.f8209k;
        this.f8209k = i4 + 1;
        iArr3[i4] = i2;
    }

    public abstract int ki() throws IOException;

    public abstract boolean ld6() throws IOException;

    /* JADX INFO: renamed from: p */
    public abstract void mo6172p() throws IOException;

    /* JADX INFO: renamed from: q */
    public abstract void mo6173q() throws IOException;

    public abstract String wvg() throws IOException;

    public abstract boolean x2() throws IOException;

    /* JADX INFO: renamed from: y */
    public abstract void mo6174y() throws IOException;

    public abstract void y9n() throws IOException;

    public abstract void yz() throws IOException;

    public abstract void zy() throws IOException;
}
