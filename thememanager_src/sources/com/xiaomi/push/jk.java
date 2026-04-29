package com.xiaomi.push;

import java.io.InputStream;
import java.util.Vector;

/* JADX INFO: loaded from: classes3.dex */
public final class jk {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f73382f7l8;

    /* JADX INFO: renamed from: g */
    private int f33096g;

    /* JADX INFO: renamed from: k */
    private final byte[] f33097k;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f73383ld6;

    /* JADX INFO: renamed from: n */
    private final InputStream f33098n;

    /* JADX INFO: renamed from: p */
    private int f33099p;

    /* JADX INFO: renamed from: q */
    private int f33100q;

    /* JADX INFO: renamed from: s */
    private int f33101s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f73384toq;

    /* JADX INFO: renamed from: y */
    private int f33102y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f73385zy;

    private jk(byte[] bArr, int i2, int i3) {
        this.f33102y = Integer.MAX_VALUE;
        this.f33099p = 64;
        this.f73383ld6 = 67108864;
        this.f33097k = bArr;
        this.f73384toq = i3 + i2;
        this.f33100q = i2;
        this.f33098n = null;
    }

    public static jk f7l8(byte[] bArr, int i2, int i3) {
        return new jk(bArr, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    public static jk m21052g(InputStream inputStream) {
        return new jk(inputStream);
    }

    private void ki() {
        int i2 = this.f73384toq + this.f73385zy;
        this.f73384toq = i2;
        int i3 = this.f73382f7l8 + i2;
        int i4 = this.f33102y;
        if (i3 <= i4) {
            this.f73385zy = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f73385zy = i5;
        this.f73384toq = i2 - i5;
    }

    private boolean n7h(boolean z2) throws qkj8 {
        int i2 = this.f33100q;
        int i3 = this.f73384toq;
        if (i2 < i3) {
            throw new IllegalStateException("refillBuffer() called when buffer wasn't empty.");
        }
        int i4 = this.f73382f7l8;
        if (i4 + i3 == this.f33102y) {
            if (z2) {
                throw qkj8.m21389a();
            }
            return false;
        }
        this.f73382f7l8 = i4 + i3;
        this.f33100q = 0;
        InputStream inputStream = this.f33098n;
        int i5 = inputStream == null ? -1 : inputStream.read(this.f33097k);
        this.f73384toq = i5;
        if (i5 == 0 || i5 < -1) {
            throw new IllegalStateException("InputStream#read(byte[]) returned invalid result: " + this.f73384toq + "\nThe InputStream implementation is buggy.");
        }
        if (i5 == -1) {
            this.f73384toq = 0;
            if (z2) {
                throw qkj8.m21389a();
            }
            return false;
        }
        ki();
        int i6 = this.f73382f7l8 + this.f73384toq + this.f73385zy;
        if (i6 > this.f73383ld6 || i6 < 0) {
            throw qkj8.m21396h();
        }
        return true;
    }

    public long cdj() {
        return zurt();
    }

    public int fn3e() {
        return fu4();
    }

    public int fu4() throws qkj8 {
        int i2;
        byte bM21055k = m21055k();
        if (bM21055k >= 0) {
            return bM21055k;
        }
        int i3 = bM21055k & 127;
        byte bM21055k2 = m21055k();
        if (bM21055k2 >= 0) {
            i2 = bM21055k2 << 7;
        } else {
            i3 |= (bM21055k2 & 127) << 7;
            byte bM21055k3 = m21055k();
            if (bM21055k3 >= 0) {
                i2 = bM21055k3 << com.google.common.base.zy.f25751h;
            } else {
                i3 |= (bM21055k3 & 127) << 14;
                byte bM21055k4 = m21055k();
                if (bM21055k4 < 0) {
                    int i4 = i3 | ((bM21055k4 & 127) << 21);
                    byte bM21055k5 = m21055k();
                    int i5 = i4 | (bM21055k5 << com.google.common.base.zy.f68118fti);
                    if (bM21055k5 >= 0) {
                        return i5;
                    }
                    for (int i6 = 0; i6 < 5; i6++) {
                        if (m21055k() >= 0) {
                            return i5;
                        }
                    }
                    throw qkj8.m21391c();
                }
                i2 = bM21055k4 << com.google.common.base.zy.f25761z;
            }
        }
        return i3 | i2;
    }

    /* JADX INFO: renamed from: h */
    public int m21053h() {
        return fu4();
    }

    /* JADX INFO: renamed from: i */
    public boolean m21054i() {
        return this.f33100q == this.f73384toq && !n7h(false);
    }

    /* JADX INFO: renamed from: k */
    public byte m21055k() throws qkj8 {
        if (this.f33100q == this.f73384toq) {
            n7h(true);
        }
        byte[] bArr = this.f33097k;
        int i2 = this.f33100q;
        this.f33100q = i2 + 1;
        return bArr[i2];
    }

    public byte[] kja0(int i2) throws qkj8 {
        if (i2 < 0) {
            throw qkj8.m21390b();
        }
        int i3 = this.f73382f7l8;
        int i4 = this.f33100q;
        int i5 = i3 + i4 + i2;
        int i6 = this.f33102y;
        if (i5 > i6) {
            ni7((i6 - i3) - i4);
            throw qkj8.m21389a();
        }
        int i7 = this.f73384toq;
        if (i2 <= i7 - i4) {
            byte[] bArr = new byte[i2];
            System.arraycopy(this.f33097k, i4, bArr, 0, i2);
            this.f33100q += i2;
            return bArr;
        }
        if (i2 >= 4096) {
            this.f73382f7l8 = i3 + i7;
            this.f33100q = 0;
            this.f73384toq = 0;
            int length = i7 - i4;
            int i8 = i2 - length;
            Vector vector = new Vector();
            while (i8 > 0) {
                int iMin = Math.min(i8, 4096);
                byte[] bArr2 = new byte[iMin];
                int i9 = 0;
                while (i9 < iMin) {
                    InputStream inputStream = this.f33098n;
                    int i10 = inputStream == null ? -1 : inputStream.read(bArr2, i9, iMin - i9);
                    if (i10 == -1) {
                        throw qkj8.m21389a();
                    }
                    this.f73382f7l8 += i10;
                    i9 += i10;
                }
                i8 -= iMin;
                vector.addElement(bArr2);
            }
            byte[] bArr3 = new byte[i2];
            System.arraycopy(this.f33097k, i4, bArr3, 0, length);
            for (int i11 = 0; i11 < vector.size(); i11++) {
                byte[] bArr4 = (byte[]) vector.elementAt(i11);
                System.arraycopy(bArr4, 0, bArr3, length, bArr4.length);
                length += bArr4.length;
            }
            return bArr3;
        }
        byte[] bArr5 = new byte[i2];
        int i12 = i7 - i4;
        System.arraycopy(this.f33097k, i4, bArr5, 0, i12);
        this.f33100q = this.f73384toq;
        n7h(true);
        while (true) {
            int i13 = i2 - i12;
            int i14 = this.f73384toq;
            if (i13 <= i14) {
                System.arraycopy(this.f33097k, 0, bArr5, i12, i13);
                this.f33100q = i13;
                return bArr5;
            }
            System.arraycopy(this.f33097k, 0, bArr5, i12, i14);
            int i15 = this.f73384toq;
            i12 += i15;
            this.f33100q = i15;
            n7h(true);
        }
    }

    public void ld6(bz2 bz2Var) throws qkj8 {
        int iFu4 = fu4();
        if (this.f33101s >= this.f33099p) {
            throw qkj8.m21395g();
        }
        int iZy = zy(iFu4);
        this.f33101s++;
        bz2Var.toq(this);
        m21057p(0);
        this.f33101s--;
        t8r(iZy);
    }

    /* JADX INFO: renamed from: n */
    public zy m21056n() throws qkj8 {
        int iFu4 = fu4();
        int i2 = this.f73384toq;
        int i3 = this.f33100q;
        if (iFu4 > i2 - i3 || iFu4 <= 0) {
            return zy.toq(kja0(iFu4));
        }
        zy zyVarZy = zy.zy(this.f33097k, i3, iFu4);
        this.f33100q += iFu4;
        return zyVarZy;
    }

    public void ni7(int i2) throws qkj8 {
        if (i2 < 0) {
            throw qkj8.m21390b();
        }
        int i3 = this.f73382f7l8;
        int i4 = this.f33100q;
        int i5 = i3 + i4 + i2;
        int i6 = this.f33102y;
        if (i5 > i6) {
            ni7((i6 - i3) - i4);
            throw qkj8.m21389a();
        }
        int i7 = this.f73384toq;
        if (i2 <= i7 - i4) {
            this.f33100q = i4 + i2;
            return;
        }
        int i8 = i7 - i4;
        this.f73382f7l8 = i3 + i7;
        this.f33100q = 0;
        this.f73384toq = 0;
        while (i8 < i2) {
            InputStream inputStream = this.f33098n;
            int iSkip = inputStream == null ? -1 : (int) inputStream.skip(i2 - i8);
            if (iSkip <= 0) {
                throw qkj8.m21389a();
            }
            i8 += iSkip;
            this.f73382f7l8 += iSkip;
        }
    }

    public int o1t() throws qkj8 {
        return (m21055k() & 255) | ((m21055k() & 255) << 8) | ((m21055k() & 255) << 16) | ((m21055k() & 255) << 24);
    }

    /* JADX INFO: renamed from: p */
    public void m21057p(int i2) throws qkj8 {
        if (this.f33096g != i2) {
            throw qkj8.m21393e();
        }
    }

    /* JADX INFO: renamed from: q */
    public long m21058q() {
        return zurt();
    }

    public boolean qrj(int i2) throws qkj8 {
        int iM20946k = h4b.m20946k(i2);
        if (iM20946k == 0) {
            m21053h();
            return true;
        }
        if (iM20946k == 1) {
            m21061z();
            return true;
        }
        if (iM20946k == 2) {
            ni7(fu4());
            return true;
        }
        if (iM20946k == 3) {
            m21059s();
            m21057p(h4b.toq(h4b.zy(i2), 4));
            return true;
        }
        if (iM20946k == 4) {
            return false;
        }
        if (iM20946k != 5) {
            throw qkj8.m21394f();
        }
        o1t();
        return true;
    }

    /* JADX INFO: renamed from: s */
    public void m21059s() throws qkj8 {
        int qVar;
        do {
            qVar = toq();
            if (qVar == 0) {
                return;
            }
        } while (qrj(qVar));
    }

    public void t8r(int i2) {
        this.f33102y = i2;
        ki();
    }

    public int toq() throws qkj8 {
        if (m21054i()) {
            this.f33096g = 0;
            return 0;
        }
        int iFu4 = fu4();
        this.f33096g = iFu4;
        if (iFu4 != 0) {
            return iFu4;
        }
        throw qkj8.m21392d();
    }

    public boolean x2() {
        return fu4() != 0;
    }

    /* JADX INFO: renamed from: y */
    public String m21060y() throws qkj8 {
        int iFu4 = fu4();
        int i2 = this.f73384toq;
        int i3 = this.f33100q;
        if (iFu4 > i2 - i3 || iFu4 <= 0) {
            return new String(kja0(iFu4), "UTF-8");
        }
        String str = new String(this.f33097k, i3, iFu4, "UTF-8");
        this.f33100q += iFu4;
        return str;
    }

    /* JADX INFO: renamed from: z */
    public long m21061z() throws qkj8 {
        byte bM21055k = m21055k();
        return ((((long) m21055k()) & 255) << 8) | (((long) bM21055k) & 255) | ((((long) m21055k()) & 255) << 16) | ((((long) m21055k()) & 255) << 24) | ((((long) m21055k()) & 255) << 32) | ((((long) m21055k()) & 255) << 40) | ((((long) m21055k()) & 255) << 48) | ((((long) m21055k()) & 255) << 56);
    }

    public long zurt() throws qkj8 {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            byte bM21055k = m21055k();
            j2 |= ((long) (bM21055k & 127)) << i2;
            if ((bM21055k & 128) == 0) {
                return j2;
            }
        }
        throw qkj8.m21391c();
    }

    public int zy(int i2) throws qkj8 {
        if (i2 < 0) {
            throw qkj8.m21390b();
        }
        int i3 = i2 + this.f73382f7l8 + this.f33100q;
        int i4 = this.f33102y;
        if (i3 > i4) {
            throw qkj8.m21389a();
        }
        this.f33102y = i3;
        ki();
        return i4;
    }

    private jk(InputStream inputStream) {
        this.f33102y = Integer.MAX_VALUE;
        this.f33099p = 64;
        this.f73383ld6 = 67108864;
        this.f33097k = new byte[4096];
        this.f73384toq = 0;
        this.f33100q = 0;
        this.f33098n = inputStream;
    }
}
