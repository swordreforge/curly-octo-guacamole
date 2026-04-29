package com.google.android.exoplayer2.extractor.ts;

import com.google.android.exoplayer2.util.C3844k;
import java.util.Arrays;

/* JADX INFO: compiled from: NalUnitTargetBuffer.java */
/* JADX INFO: loaded from: classes2.dex */
final class fn3e {

    /* JADX INFO: renamed from: k */
    private final int f20206k;

    /* JADX INFO: renamed from: n */
    public int f20207n;

    /* JADX INFO: renamed from: q */
    public byte[] f20208q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f64440toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private boolean f64441zy;

    public fn3e(int i2, int i3) {
        this.f20206k = i2;
        byte[] bArr = new byte[i3 + 3];
        this.f20208q = bArr;
        bArr[2] = 1;
    }

    /* JADX INFO: renamed from: k */
    public void m11955k(byte[] bArr, int i2, int i3) {
        if (this.f64440toq) {
            int i4 = i3 - i2;
            byte[] bArr2 = this.f20208q;
            int length = bArr2.length;
            int i5 = this.f20207n;
            if (length < i5 + i4) {
                this.f20208q = Arrays.copyOf(bArr2, (i5 + i4) * 2);
            }
            System.arraycopy(bArr, i2, this.f20208q, this.f20207n, i4);
            this.f20207n += i4;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m11956n(int i2) {
        C3844k.m13633s(!this.f64440toq);
        boolean z2 = i2 == this.f20206k;
        this.f64440toq = z2;
        if (z2) {
            this.f20207n = 3;
            this.f64441zy = false;
        }
    }

    /* JADX INFO: renamed from: q */
    public void m11957q() {
        this.f64440toq = false;
        this.f64441zy = false;
    }

    public boolean toq(int i2) {
        if (!this.f64440toq) {
            return false;
        }
        this.f20207n -= i2;
        this.f64440toq = false;
        this.f64441zy = true;
        return true;
    }

    public boolean zy() {
        return this.f64441zy;
    }
}
