package com.xiaomi.push;

import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

/* JADX INFO: renamed from: com.xiaomi.push.m */
/* JADX INFO: loaded from: classes3.dex */
public final class C5882m {

    /* JADX INFO: renamed from: k */
    private final byte[] f33375k;

    /* JADX INFO: renamed from: q */
    private final OutputStream f33376q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f73479toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f73480zy;

    /* JADX INFO: renamed from: com.xiaomi.push.m$k */
    public static class k extends IOException {
        k() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }
    }

    private C5882m(byte[] bArr, int i2, int i3) {
        this.f33376q = null;
        this.f33375k = bArr;
        this.f73480zy = i2;
        this.f73479toq = i2 + i3;
    }

    /* JADX INFO: renamed from: c */
    public static int m21219c(int i2) {
        if ((i2 & (-128)) == 0) {
            return 1;
        }
        if ((i2 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i2) == 0) {
            return 3;
        }
        return (i2 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int d3(int i2, long j2) {
        return x9kr(i2) + oc(j2);
    }

    public static int f7l8(int i2, String str) {
        return x9kr(i2) + x2(str);
    }

    /* JADX INFO: renamed from: g */
    public static int m21220g(int i2, bz2 bz2Var) {
        return x9kr(i2) + ld6(bz2Var);
    }

    public static int gvn7(int i2, int i3) {
        return x9kr(i2) + jp0y(i3);
    }

    /* JADX INFO: renamed from: h */
    public static C5882m m21221h(byte[] bArr, int i2, int i3) {
        return new C5882m(bArr, i2, i3);
    }

    public static int jp0y(int i2) {
        return m21219c(i2);
    }

    public static C5882m kja0(OutputStream outputStream, int i2) {
        return new C5882m(outputStream, new byte[i2]);
    }

    /* JADX INFO: renamed from: l */
    private void m21222l() throws IOException {
        OutputStream outputStream = this.f33376q;
        if (outputStream == null) {
            throw new k();
        }
        outputStream.write(this.f33375k, 0, this.f73480zy);
        this.f73480zy = 0;
    }

    public static int ld6(bz2 bz2Var) {
        int iMo20673s = bz2Var.mo20673s();
        return m21219c(iMo20673s) + iMo20673s;
    }

    /* JADX INFO: renamed from: n */
    public static int m21223n(int i2, zy zyVar) {
        return x9kr(i2) + m21224p(zyVar);
    }

    public static C5882m n7h(OutputStream outputStream) {
        return kja0(outputStream, 4096);
    }

    public static int ncyb(long j2) {
        if (((-128) & j2) == 0) {
            return 1;
        }
        if (((-16384) & j2) == 0) {
            return 2;
        }
        if (((-2097152) & j2) == 0) {
            return 3;
        }
        if (((-268435456) & j2) == 0) {
            return 4;
        }
        if (((-34359738368L) & j2) == 0) {
            return 5;
        }
        if (((-4398046511104L) & j2) == 0) {
            return 6;
        }
        if (((-562949953421312L) & j2) == 0) {
            return 7;
        }
        if (((-72057594037927936L) & j2) == 0) {
            return 8;
        }
        return (j2 & Long.MIN_VALUE) == 0 ? 9 : 10;
    }

    public static int oc(long j2) {
        return ncyb(j2);
    }

    /* JADX INFO: renamed from: p */
    public static int m21224p(zy zyVar) {
        return m21219c(zyVar.m22193k()) + zyVar.m22193k();
    }

    /* JADX INFO: renamed from: q */
    public static int m21225q(int i2, long j2) {
        return x9kr(i2) + m21226s(j2);
    }

    public static int qrj(boolean z2) {
        return 1;
    }

    /* JADX INFO: renamed from: s */
    public static int m21226s(long j2) {
        return ncyb(j2);
    }

    public static int toq(int i2) {
        if (i2 >= 0) {
            return m21219c(i2);
        }
        return 10;
    }

    public static int x2(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            return m21219c(bytes.length) + bytes.length;
        } catch (UnsupportedEncodingException unused) {
            throw new RuntimeException("UTF-8 not supported.");
        }
    }

    public static int x9kr(int i2) {
        return m21219c(h4b.toq(i2, 0));
    }

    /* JADX INFO: renamed from: y */
    public static int m21227y(int i2, boolean z2) {
        return x9kr(i2) + qrj(z2);
    }

    public static int zy(int i2, int i3) {
        return x9kr(i2) + toq(i3);
    }

    public void a9(byte[] bArr) throws IOException {
        fti(bArr, 0, bArr.length);
    }

    public void cdj() throws IOException {
        if (this.f33376q != null) {
            m21222l();
        }
    }

    public void d2ok(int i2) throws IOException {
        lrht(i2);
    }

    public void dd(long j2) throws IOException {
        m21228f(j2);
    }

    public void eqxt() {
        if (m21230k() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* JADX INFO: renamed from: f */
    public void m21228f(long j2) throws IOException {
        while (((-128) & j2) != 0) {
            n5r1((((int) j2) & 127) | 128);
            j2 >>>= 7;
        }
        n5r1((int) j2);
    }

    public void fn3e(int i2, long j2) throws IOException {
        hyr(i2, 0);
        o1t(j2);
    }

    public void fti(byte[] bArr, int i2, int i3) throws IOException {
        int i4 = this.f73479toq;
        int i5 = this.f73480zy;
        if (i4 - i5 >= i3) {
            System.arraycopy(bArr, i2, this.f33375k, i5, i3);
            this.f73480zy += i3;
            return;
        }
        int i6 = i4 - i5;
        System.arraycopy(bArr, i2, this.f33375k, i5, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f73480zy = this.f73479toq;
        m21222l();
        if (i8 > this.f73479toq) {
            this.f33376q.write(bArr, i7, i8);
        } else {
            System.arraycopy(bArr, i7, this.f33375k, 0, i8);
            this.f73480zy = i8;
        }
    }

    public void fu4(int i2, String str) throws IOException {
        hyr(i2, 2);
        mcp(str);
    }

    public void hyr(int i2, int i3) throws IOException {
        lrht(h4b.toq(i2, i3));
    }

    /* JADX INFO: renamed from: i */
    public void m21229i(int i2, int i3) throws IOException {
        hyr(i2, 0);
        t8r(i3);
    }

    public void jk(boolean z2) throws IOException {
        n5r1(z2 ? 1 : 0);
    }

    /* JADX INFO: renamed from: k */
    public int m21230k() {
        if (this.f33376q == null) {
            return this.f73479toq - this.f73480zy;
        }
        throw new UnsupportedOperationException("spaceLeft() can only be called on CodedOutputStreams that are writing to a flat array.");
    }

    public void ki(byte b2) throws IOException {
        if (this.f73480zy == this.f73479toq) {
            m21222l();
        }
        byte[] bArr = this.f33375k;
        int i2 = this.f73480zy;
        this.f73480zy = i2 + 1;
        bArr[i2] = b2;
    }

    public void lrht(int i2) throws IOException {
        while ((i2 & (-128)) != 0) {
            n5r1((i2 & 127) | 128);
            i2 >>>= 7;
        }
        n5r1(i2);
    }

    public void lvui(int i2, int i3) throws IOException {
        hyr(i2, 0);
        d2ok(i3);
    }

    public void mcp(String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        lrht(bytes.length);
        a9(bytes);
    }

    public void n5r1(int i2) throws IOException {
        ki((byte) i2);
    }

    public void ni7(int i2, bz2 bz2Var) throws IOException {
        hyr(i2, 2);
        m21232t(bz2Var);
    }

    public void o1t(long j2) throws IOException {
        m21228f(j2);
    }

    /* JADX INFO: renamed from: r */
    public void m21231r(int i2, long j2) throws IOException {
        hyr(i2, 0);
        dd(j2);
    }

    /* JADX INFO: renamed from: t */
    public void m21232t(bz2 bz2Var) throws IOException {
        lrht(bz2Var.mo20670k());
        bz2Var.mo20671n(this);
    }

    public void t8r(int i2) throws IOException {
        if (i2 >= 0) {
            lrht(i2);
        } else {
            m21228f(i2);
        }
    }

    public void wvg(zy zyVar) throws IOException {
        byte[] bArrM22194q = zyVar.m22194q();
        lrht(bArrM22194q.length);
        a9(bArrM22194q);
    }

    /* JADX INFO: renamed from: z */
    public void m21233z(int i2, boolean z2) throws IOException {
        hyr(i2, 0);
        jk(z2);
    }

    public void zurt(int i2, zy zyVar) throws IOException {
        hyr(i2, 2);
        wvg(zyVar);
    }

    private C5882m(OutputStream outputStream, byte[] bArr) {
        this.f33376q = outputStream;
        this.f33375k = bArr;
        this.f73480zy = 0;
        this.f73479toq = bArr.length;
    }
}
