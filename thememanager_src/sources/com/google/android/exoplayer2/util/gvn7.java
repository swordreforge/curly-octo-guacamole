package com.google.android.exoplayer2.util;

import com.google.common.base.C4258g;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import okio.C7571o;

/* JADX INFO: compiled from: ParsableByteArray.java */
/* JADX INFO: loaded from: classes2.dex */
public final class gvn7 {

    /* JADX INFO: renamed from: k */
    private byte[] f23195k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f66990toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f66991zy;

    public gvn7() {
        this.f23195k = lrht.f23228g;
    }

    public String a9(int i2, Charset charset) {
        String str = new String(this.f23195k, this.f66990toq, i2, charset);
        this.f66990toq += i2;
        return str;
    }

    @zy.dd
    public String cdj() {
        if (m13594k() == 0) {
            return null;
        }
        int i2 = this.f66990toq;
        while (i2 < this.f66991zy && !lrht.tfm(this.f23195k[i2])) {
            i2++;
        }
        int i3 = this.f66990toq;
        if (i2 - i3 >= 3) {
            byte[] bArr = this.f23195k;
            if (bArr[i3] == -17 && bArr[i3 + 1] == -69 && bArr[i3 + 2] == -65) {
                this.f66990toq = i3 + 3;
            }
        }
        byte[] bArr2 = this.f23195k;
        int i4 = this.f66990toq;
        String strOc = lrht.oc(bArr2, i4, i2 - i4);
        this.f66990toq = i2;
        int i5 = this.f66991zy;
        if (i2 == i5) {
            return strOc;
        }
        byte[] bArr3 = this.f23195k;
        if (bArr3[i2] == 13) {
            int i6 = i2 + 1;
            this.f66990toq = i6;
            if (i6 == i5) {
                return strOc;
            }
        }
        int i7 = this.f66990toq;
        if (bArr3[i7] == 10) {
            this.f66990toq = i7 + 1;
        }
        return strOc;
    }

    public long d2ok() {
        long jO1t = o1t();
        if (jO1t >= 0) {
            return jO1t;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jO1t);
        throw new IllegalStateException(sb.toString());
    }

    public long d3() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        long j2 = (((long) bArr[i2]) & 255) << 24;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 8);
        this.f66990toq = i5 + 1;
        return j3 | (((long) bArr[i5]) & 255);
    }

    public void dd(int i2) {
        ncyb(toq() < i2 ? new byte[i2] : this.f23195k, i2);
    }

    public int eqxt() {
        int iKja0 = kja0();
        if (iKja0 >= 0) {
            return iKja0;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iKja0);
        throw new IllegalStateException(sb.toString());
    }

    public char f7l8() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        return (char) ((bArr[i2 + 1] & 255) | ((bArr[i2] & 255) << 8));
    }

    public short fn3e() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & 255;
        this.f66990toq = i3 + 1;
        return (short) (((bArr[i3] & 255) << 8) | i4);
    }

    public int fti() {
        return (jp0y() << 21) | (jp0y() << 14) | (jp0y() << 7) | jp0y();
    }

    public int fu4() {
        int iKi = ki();
        if (iKi >= 0) {
            return iKi;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iKi);
        throw new IllegalStateException(sb.toString());
    }

    /* JADX INFO: renamed from: g */
    public int m13591g() {
        return this.f66991zy;
    }

    public int gvn7() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        int i4 = (bArr[i3] & 255) | ((bArr[i2] & 255) << 8);
        this.f66990toq = i3 + 1 + 2;
        return i4;
    }

    /* JADX INFO: renamed from: h */
    public int m13592h() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = (((bArr[i2] & 255) << 24) >> 8) | ((bArr[i3] & 255) << 8);
        this.f66990toq = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    public void hyr(int i2) {
        n5r1(this.f66990toq + i2);
    }

    /* JADX INFO: renamed from: i */
    public long m13593i() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        long j2 = ((long) bArr[i2]) & 255;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8) | ((((long) bArr[i4]) & 255) << 16);
        int i6 = i5 + 1;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i6 + 1;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 32);
        int i8 = i7 + 1;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 40);
        int i9 = i8 + 1;
        long j7 = j6 | ((((long) bArr[i8]) & 255) << 48);
        this.f66990toq = i9 + 1;
        return j7 | ((((long) bArr[i9]) & 255) << 56);
    }

    public String jk(int i2) {
        return a9(i2, C4258g.f68103zy);
    }

    public int jp0y() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        this.f66990toq = i2 + 1;
        return bArr[i2] & 255;
    }

    /* JADX INFO: renamed from: k */
    public int m13594k() {
        return this.f66991zy - this.f66990toq;
    }

    public int ki() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = (bArr[i2] & 255) | ((bArr[i3] & 255) << 8);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 16);
        this.f66990toq = i6 + 1;
        return ((bArr[i6] & 255) << 24) | i7;
    }

    public int kja0() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i2] & 255) << 24) | ((bArr[i3] & 255) << 16);
        int i6 = i4 + 1;
        int i7 = i5 | ((bArr[i4] & 255) << 8);
        this.f66990toq = i6 + 1;
        return (bArr[i6] & 255) | i7;
    }

    /* JADX INFO: renamed from: l */
    public void m13595l(int i2) {
        C3844k.m13629k(i2 >= 0 && i2 <= this.f23195k.length);
        this.f66991zy = i2;
    }

    public void ld6(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.f23195k, this.f66990toq, bArr, i2, i3);
        this.f66990toq += i3;
    }

    public int lvui() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        int i4 = (bArr[i2] & 255) << 8;
        this.f66990toq = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    public short mcp() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        int i4 = (bArr[i2] & 255) << 8;
        this.f66990toq = i3 + 1;
        return (short) ((bArr[i3] & 255) | i4);
    }

    /* JADX INFO: renamed from: n */
    public int m13596n() {
        return this.f66990toq;
    }

    public void n5r1(int i2) {
        C3844k.m13629k(i2 >= 0 && i2 <= this.f66991zy);
        this.f66990toq = i2;
    }

    public float n7h() {
        return Float.intBitsToFloat(kja0());
    }

    public void ncyb(byte[] bArr, int i2) {
        this.f23195k = bArr;
        this.f66991zy = i2;
        this.f66990toq = 0;
    }

    public int ni7() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = (bArr[i2] & 255) | ((bArr[i3] & 255) << 8);
        this.f66990toq = i4 + 1;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    public long o1t() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        long j2 = (((long) bArr[i2]) & 255) << 56;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 48) | ((((long) bArr[i4]) & 255) << 40);
        int i6 = i5 + 1;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i6 + 1;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 24);
        int i8 = i7 + 1;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 16);
        int i9 = i8 + 1;
        long j7 = j6 | ((((long) bArr[i8]) & 255) << 8);
        this.f66990toq = i9 + 1;
        return j7 | (((long) bArr[i9]) & 255);
    }

    public int oc() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = ((bArr[i2] & 255) << 16) | ((bArr[i3] & 255) << 8);
        this.f66990toq = i4 + 1;
        return (bArr[i4] & 255) | i5;
    }

    /* JADX INFO: renamed from: p */
    public void m13597p(ByteBuffer byteBuffer, int i2) {
        byteBuffer.put(this.f23195k, this.f66990toq, i2);
        this.f66990toq += i2;
    }

    /* JADX INFO: renamed from: q */
    public byte[] m13598q() {
        return this.f23195k;
    }

    public double qrj() {
        return Double.longBitsToDouble(o1t());
    }

    /* JADX INFO: renamed from: r */
    public long m13599r() {
        int i2;
        int i3;
        long j2 = this.f23195k[this.f66990toq];
        int i4 = 7;
        while (true) {
            if (i4 < 0) {
                break;
            }
            int i5 = 1 << i4;
            if ((((long) i5) & j2) != 0) {
                i4--;
            } else if (i4 < 6) {
                j2 &= (long) (i5 - 1);
                i3 = 7 - i4;
            } else if (i4 == 7) {
                i3 = 1;
            }
        }
        i3 = 0;
        if (i3 == 0) {
            StringBuilder sb = new StringBuilder(55);
            sb.append("Invalid UTF-8 sequence first byte: ");
            sb.append(j2);
            throw new NumberFormatException(sb.toString());
        }
        for (i2 = 1; i2 < i3; i2++) {
            byte b2 = this.f23195k[this.f66990toq + i2];
            if ((b2 & 192) != 128) {
                StringBuilder sb2 = new StringBuilder(62);
                sb2.append("Invalid UTF-8 sequence continuation byte: ");
                sb2.append(j2);
                throw new NumberFormatException(sb2.toString());
            }
            j2 = (j2 << 6) | ((long) (b2 & C7571o.f43818k));
        }
        this.f66990toq += i3;
        return j2;
    }

    /* JADX INFO: renamed from: s */
    public void m13600s(jp0y jp0yVar, int i2) {
        ld6(jp0yVar.f23205k, 0, i2);
        jp0yVar.cdj(0);
    }

    /* JADX INFO: renamed from: t */
    public String m13601t(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.f66990toq;
        int i4 = (i3 + i2) - 1;
        String strOc = lrht.oc(this.f23195k, i3, (i4 >= this.f66991zy || this.f23195k[i4] != 0) ? i2 : i2 - 1);
        this.f66990toq += i2;
        return strOc;
    }

    public int t8r() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = (bArr[i2] & 255) | ((bArr[i3] & 255) << 8);
        this.f66990toq = i4 + 1;
        return ((bArr[i4] & 255) << 16) | i5;
    }

    public int toq() {
        return this.f23195k.length;
    }

    @zy.dd
    public String wvg() {
        return x2((char) 0);
    }

    @zy.dd
    public String x2(char c2) {
        if (m13594k() == 0) {
            return null;
        }
        int i2 = this.f66990toq;
        while (i2 < this.f66991zy && this.f23195k[i2] != c2) {
            i2++;
        }
        byte[] bArr = this.f23195k;
        int i3 = this.f66990toq;
        String strOc = lrht.oc(bArr, i3, i2 - i3);
        this.f66990toq = i2;
        if (i2 < this.f66991zy) {
            this.f66990toq = i2 + 1;
        }
        return strOc;
    }

    public void x9kr(byte[] bArr) {
        ncyb(bArr, bArr.length);
    }

    /* JADX INFO: renamed from: y */
    public int m13602y() {
        return this.f23195k[this.f66990toq] & 255;
    }

    /* JADX INFO: renamed from: z */
    public int m13603z() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        int i4 = bArr[i2] & 255;
        this.f66990toq = i3 + 1;
        return ((bArr[i3] & 255) << 8) | i4;
    }

    public long zurt() {
        byte[] bArr = this.f23195k;
        int i2 = this.f66990toq;
        int i3 = i2 + 1;
        long j2 = ((long) bArr[i2]) & 255;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        long j3 = j2 | ((((long) bArr[i3]) & 255) << 8) | ((((long) bArr[i4]) & 255) << 16);
        this.f66990toq = i5 + 1;
        return j3 | ((((long) bArr[i5]) & 255) << 24);
    }

    public void zy(int i2) {
        if (i2 > toq()) {
            this.f23195k = Arrays.copyOf(this.f23195k, i2);
        }
    }

    public gvn7(int i2) {
        this.f23195k = new byte[i2];
        this.f66991zy = i2;
    }

    public gvn7(byte[] bArr) {
        this.f23195k = bArr;
        this.f66991zy = bArr.length;
    }

    public gvn7(byte[] bArr, int i2) {
        this.f23195k = bArr;
        this.f66991zy = i2;
    }
}
