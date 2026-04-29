package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: compiled from: VorbisBitArray.java */
/* JADX INFO: loaded from: classes2.dex */
public final class jk {

    /* JADX INFO: renamed from: k */
    private final byte[] f19826k;

    /* JADX INFO: renamed from: q */
    private int f19827q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final int f63764toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f63765zy;

    public jk(byte[] bArr) {
        this.f19826k = bArr;
        this.f63764toq = bArr.length;
    }

    /* JADX INFO: renamed from: k */
    private void m11738k() {
        int i2;
        int i3 = this.f63765zy;
        C3844k.m13633s(i3 >= 0 && (i3 < (i2 = this.f63764toq) || (i3 == i2 && this.f19827q == 0)));
    }

    public void f7l8(int i2) {
        int i3 = i2 / 8;
        this.f63765zy = i3;
        this.f19827q = i2 - (i3 * 8);
        m11738k();
    }

    /* JADX INFO: renamed from: g */
    public void m11739g() {
        this.f63765zy = 0;
        this.f19827q = 0;
    }

    /* JADX INFO: renamed from: n */
    public int m11740n(int i2) {
        int i3 = this.f63765zy;
        int iMin = Math.min(i2, 8 - this.f19827q);
        int i4 = i3 + 1;
        int i5 = ((this.f19826k[i3] & 255) >> this.f19827q) & (255 >> (8 - iMin));
        while (iMin < i2) {
            i5 |= (this.f19826k[i4] & 255) << iMin;
            iMin += 8;
            i4++;
        }
        int i6 = i5 & ((-1) >>> (32 - i2));
        m11742y(i2);
        return i6;
    }

    /* JADX INFO: renamed from: q */
    public boolean m11741q() {
        boolean z2 = (((this.f19826k[this.f63765zy] & 255) >> this.f19827q) & 1) == 1;
        m11742y(1);
        return z2;
    }

    public int toq() {
        return ((this.f63764toq - this.f63765zy) * 8) - this.f19827q;
    }

    /* JADX INFO: renamed from: y */
    public void m11742y(int i2) {
        int i3 = i2 / 8;
        int i4 = this.f63765zy + i3;
        this.f63765zy = i4;
        int i5 = this.f19827q + (i2 - (i3 * 8));
        this.f19827q = i5;
        if (i5 > 7) {
            this.f63765zy = i4 + 1;
            this.f19827q = i5 - 8;
        }
        m11738k();
    }

    public int zy() {
        return (this.f63765zy * 8) + this.f19827q;
    }
}
