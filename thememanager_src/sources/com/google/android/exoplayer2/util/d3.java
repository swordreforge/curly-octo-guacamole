package com.google.android.exoplayer2.util;

/* JADX INFO: compiled from: ParsableNalUnitBitArray.java */
/* JADX INFO: loaded from: classes2.dex */
public final class d3 {

    /* JADX INFO: renamed from: k */
    private byte[] f23176k;

    /* JADX INFO: renamed from: q */
    private int f23177q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f66977toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f66978zy;

    public d3(byte[] bArr, int i2, int i3) {
        m13571s(bArr, i2, i3);
    }

    /* JADX INFO: renamed from: g */
    private int m13566g() {
        int i2 = 0;
        while (!m13570q()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? m13569n(i2) : 0);
    }

    /* JADX INFO: renamed from: k */
    private void m13567k() {
        int i2;
        int i3 = this.f66978zy;
        C3844k.m13633s(i3 >= 0 && (i3 < (i2 = this.f66977toq) || (i3 == i2 && this.f23177q == 0)));
    }

    /* JADX INFO: renamed from: p */
    private boolean m13568p(int i2) {
        if (2 <= i2 && i2 < this.f66977toq) {
            byte[] bArr = this.f23176k;
            if (bArr[i2] == 3 && bArr[i2 - 2] == 0 && bArr[i2 - 1] == 0) {
                return true;
            }
        }
        return false;
    }

    public int f7l8() {
        int iM13566g = m13566g();
        return (iM13566g % 2 == 0 ? -1 : 1) * ((iM13566g + 1) / 2);
    }

    public void ld6() {
        int i2 = this.f23177q + 1;
        this.f23177q = i2;
        if (i2 == 8) {
            this.f23177q = 0;
            int i3 = this.f66978zy;
            this.f66978zy = i3 + (m13568p(i3 + 1) ? 2 : 1);
        }
        m13567k();
    }

    /* JADX INFO: renamed from: n */
    public int m13569n(int i2) {
        int i3;
        this.f23177q += i2;
        int i4 = 0;
        while (true) {
            i3 = this.f23177q;
            if (i3 <= 8) {
                break;
            }
            int i5 = i3 - 8;
            this.f23177q = i5;
            byte[] bArr = this.f23176k;
            int i6 = this.f66978zy;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m13568p(i6 + 1)) {
                i = 1;
            }
            this.f66978zy = i6 + i;
        }
        byte[] bArr2 = this.f23176k;
        int i7 = this.f66978zy;
        int i8 = ((-1) >>> (32 - i2)) & (i4 | ((bArr2[i7] & 255) >> (8 - i3)));
        if (i3 == 8) {
            this.f23177q = 0;
            this.f66978zy = i7 + (m13568p(i7 + 1) ? 2 : 1);
        }
        m13567k();
        return i8;
    }

    /* JADX INFO: renamed from: q */
    public boolean m13570q() {
        boolean z2 = (this.f23176k[this.f66978zy] & (128 >> this.f23177q)) != 0;
        ld6();
        return z2;
    }

    /* JADX INFO: renamed from: s */
    public void m13571s(byte[] bArr, int i2, int i3) {
        this.f23176k = bArr;
        this.f66978zy = i2;
        this.f66977toq = i3;
        this.f23177q = 0;
        m13567k();
    }

    public boolean toq(int i2) {
        int i3 = this.f66978zy;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        int i6 = (this.f23177q + i2) - (i4 * 8);
        if (i6 > 7) {
            i5++;
            i6 -= 8;
        }
        while (true) {
            i3++;
            if (i3 > i5 || i5 >= this.f66977toq) {
                break;
            }
            if (m13568p(i3)) {
                i5++;
                i3 += 2;
            }
        }
        int i7 = this.f66977toq;
        if (i5 >= i7) {
            return i5 == i7 && i6 == 0;
        }
        return true;
    }

    public void x2(int i2) {
        int i3 = this.f66978zy;
        int i4 = i2 / 8;
        int i5 = i3 + i4;
        this.f66978zy = i5;
        int i6 = this.f23177q + (i2 - (i4 * 8));
        this.f23177q = i6;
        if (i6 > 7) {
            this.f66978zy = i5 + 1;
            this.f23177q = i6 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.f66978zy) {
                m13567k();
                return;
            } else if (m13568p(i3)) {
                this.f66978zy++;
                i3 += 2;
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public int m13572y() {
        return m13566g();
    }

    public boolean zy() {
        int i2 = this.f66978zy;
        int i3 = this.f23177q;
        int i4 = 0;
        while (this.f66978zy < this.f66977toq && !m13570q()) {
            i4++;
        }
        boolean z2 = this.f66978zy == this.f66977toq;
        this.f66978zy = i2;
        this.f23177q = i3;
        return !z2 && toq((i4 * 2) + 1);
    }
}
