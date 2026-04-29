package com.google.android.exoplayer2.util;

import com.google.common.base.C4258g;
import java.nio.charset.Charset;

/* JADX INFO: compiled from: ParsableBitArray.java */
/* JADX INFO: loaded from: classes2.dex */
public final class jp0y {

    /* JADX INFO: renamed from: k */
    public byte[] f23205k;

    /* JADX INFO: renamed from: q */
    private int f23206q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f66995toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f66996zy;

    public jp0y() {
        this.f23205k = lrht.f23228g;
    }

    /* JADX INFO: renamed from: k */
    private void m13619k() {
        int i2;
        int i3 = this.f66995toq;
        C3844k.m13633s(i3 >= 0 && (i3 < (i2 = this.f23206q) || (i3 == i2 && this.f66996zy == 0)));
    }

    public void cdj(int i2) {
        int i3 = i2 / 8;
        this.f66995toq = i3;
        this.f66996zy = i2 - (i3 * 8);
        m13619k();
    }

    public boolean f7l8() {
        boolean z2 = (this.f23205k[this.f66995toq] & (128 >> this.f66996zy)) != 0;
        ki();
        return z2;
    }

    /* JADX INFO: renamed from: g */
    public void m13620g(int i2, int i3) {
        if (i3 < 32) {
            i2 &= (1 << i3) - 1;
        }
        int iMin = Math.min(8 - this.f66996zy, i3);
        int i4 = this.f66996zy;
        int i5 = (8 - i4) - iMin;
        byte[] bArr = this.f23205k;
        int i6 = this.f66995toq;
        byte b2 = (byte) (((65280 >> i4) | ((1 << i5) - 1)) & bArr[i6]);
        bArr[i6] = b2;
        int i7 = i3 - iMin;
        bArr[i6] = (byte) (b2 | ((i2 >>> i7) << i5));
        int i8 = i6 + 1;
        while (i7 > 8) {
            this.f23205k[i8] = (byte) (i2 >>> (i7 - 8));
            i7 -= 8;
            i8++;
        }
        int i9 = 8 - i7;
        byte[] bArr2 = this.f23205k;
        byte b3 = (byte) (bArr2[i8] & ((1 << i9) - 1));
        bArr2[i8] = b3;
        bArr2[i8] = (byte) (((i2 & ((1 << i7) - 1)) << i9) | b3);
        t8r(i3);
        m13619k();
    }

    /* JADX INFO: renamed from: h */
    public void m13621h(byte[] bArr, int i2) {
        this.f23205k = bArr;
        this.f66995toq = 0;
        this.f66996zy = 0;
        this.f23206q = i2;
    }

    /* JADX INFO: renamed from: i */
    public void m13622i(int i2) {
        C3844k.m13633s(this.f66996zy == 0);
        this.f66995toq += i2;
        m13619k();
    }

    public void ki() {
        int i2 = this.f66996zy + 1;
        this.f66996zy = i2;
        if (i2 == 8) {
            this.f66996zy = 0;
            this.f66995toq++;
        }
        m13619k();
    }

    public void kja0(byte[] bArr) {
        m13621h(bArr, bArr.length);
    }

    public void ld6(byte[] bArr, int i2, int i3) {
        C3844k.m13633s(this.f66996zy == 0);
        System.arraycopy(this.f23205k, this.f66995toq, bArr, i2, i3);
        this.f66995toq += i3;
        m13619k();
    }

    /* JADX INFO: renamed from: n */
    public int m13623n() {
        return (this.f66995toq * 8) + this.f66996zy;
    }

    public void n7h(gvn7 gvn7Var) {
        m13621h(gvn7Var.m13598q(), gvn7Var.m13591g());
        cdj(gvn7Var.m13596n() * 8);
    }

    /* JADX INFO: renamed from: p */
    public long m13624p(int i2) {
        return i2 <= 32 ? lrht.pc(m13627y(i2)) : lrht.ebn(m13627y(i2 - 32), m13627y(32));
    }

    /* JADX INFO: renamed from: q */
    public int m13625q() {
        C3844k.m13633s(this.f66996zy == 0);
        return this.f66995toq;
    }

    public String qrj(int i2, Charset charset) {
        byte[] bArr = new byte[i2];
        ld6(bArr, 0, i2);
        return new String(bArr, charset);
    }

    /* JADX INFO: renamed from: s */
    public void m13626s(byte[] bArr, int i2, int i3) {
        int i4 = (i3 >> 3) + i2;
        while (i2 < i4) {
            byte[] bArr2 = this.f23205k;
            int i5 = this.f66995toq;
            int i6 = i5 + 1;
            this.f66995toq = i6;
            byte b2 = bArr2[i5];
            int i7 = this.f66996zy;
            byte b3 = (byte) (b2 << i7);
            bArr[i2] = b3;
            bArr[i2] = (byte) (((255 & bArr2[i6]) >> (8 - i7)) | b3);
            i2++;
        }
        int i8 = i3 & 7;
        if (i8 == 0) {
            return;
        }
        byte b4 = (byte) (bArr[i4] & (255 >> i8));
        bArr[i4] = b4;
        int i9 = this.f66996zy;
        if (i9 + i8 > 8) {
            byte[] bArr3 = this.f23205k;
            int i10 = this.f66995toq;
            this.f66995toq = i10 + 1;
            bArr[i4] = (byte) (b4 | ((bArr3[i10] & 255) << i9));
            this.f66996zy = i9 - 8;
        }
        int i11 = this.f66996zy + i8;
        this.f66996zy = i11;
        byte[] bArr4 = this.f23205k;
        int i12 = this.f66995toq;
        bArr[i4] = (byte) (((byte) (((255 & bArr4[i12]) >> (8 - i11)) << (8 - i8))) | bArr[i4]);
        if (i11 == 8) {
            this.f66996zy = 0;
            this.f66995toq = i12 + 1;
        }
        m13619k();
    }

    public void t8r(int i2) {
        int i3 = i2 / 8;
        int i4 = this.f66995toq + i3;
        this.f66995toq = i4;
        int i5 = this.f66996zy + (i2 - (i3 * 8));
        this.f66996zy = i5;
        if (i5 > 7) {
            this.f66995toq = i4 + 1;
            this.f66996zy = i5 - 8;
        }
        m13619k();
    }

    public int toq() {
        return ((this.f23206q - this.f66995toq) * 8) - this.f66996zy;
    }

    public String x2(int i2) {
        return qrj(i2, C4258g.f68103zy);
    }

    /* JADX INFO: renamed from: y */
    public int m13627y(int i2) {
        int i3;
        if (i2 == 0) {
            return 0;
        }
        this.f66996zy += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f66996zy;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f66996zy = i5;
            byte[] bArr = this.f23205k;
            int i6 = this.f66995toq;
            this.f66995toq = i6 + 1;
            i4 |= (bArr[i6] & 255) << i5;
        }
        byte[] bArr2 = this.f23205k;
        int i7 = this.f66995toq;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.f66996zy = 0;
            this.f66995toq = i7 + 1;
        }
        m13619k();
        return i8;
    }

    public void zy() {
        if (this.f66996zy == 0) {
            return;
        }
        this.f66996zy = 0;
        this.f66995toq++;
        m13619k();
    }

    public jp0y(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public jp0y(byte[] bArr, int i2) {
        this.f23205k = bArr;
        this.f23206q = i2;
    }
}
