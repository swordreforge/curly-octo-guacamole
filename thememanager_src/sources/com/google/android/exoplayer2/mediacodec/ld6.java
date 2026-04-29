package com.google.android.exoplayer2.mediacodec;

import java.util.NoSuchElementException;

/* JADX INFO: compiled from: IntArrayQueue.java */
/* JADX INFO: loaded from: classes2.dex */
final class ld6 {

    /* JADX INFO: renamed from: g */
    private static final int f20671g = 16;

    /* JADX INFO: renamed from: n */
    private int f20673n;

    /* JADX INFO: renamed from: k */
    private int f20672k = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private int f64937toq = -1;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f64938zy = 0;

    /* JADX INFO: renamed from: q */
    private int[] f20674q = new int[16];

    public ld6() {
        this.f20673n = r0.length - 1;
    }

    /* JADX INFO: renamed from: q */
    private void m12214q() {
        int[] iArr = this.f20674q;
        int length = iArr.length << 1;
        if (length < 0) {
            throw new IllegalStateException();
        }
        int[] iArr2 = new int[length];
        int length2 = iArr.length;
        int i2 = this.f20672k;
        int i3 = length2 - i2;
        System.arraycopy(iArr, i2, iArr2, 0, i3);
        System.arraycopy(this.f20674q, 0, iArr2, i3, i2);
        this.f20672k = 0;
        this.f64937toq = this.f64938zy - 1;
        this.f20674q = iArr2;
        this.f20673n = iArr2.length - 1;
    }

    public int f7l8() {
        return this.f64938zy;
    }

    /* JADX INFO: renamed from: g */
    public int m12215g() {
        int i2 = this.f64938zy;
        if (i2 == 0) {
            throw new NoSuchElementException();
        }
        int[] iArr = this.f20674q;
        int i3 = this.f20672k;
        int i4 = iArr[i3];
        this.f20672k = (i3 + 1) & this.f20673n;
        this.f64938zy = i2 - 1;
        return i4;
    }

    /* JADX INFO: renamed from: k */
    public void m12216k(int i2) {
        if (this.f64938zy == this.f20674q.length) {
            m12214q();
        }
        int i3 = (this.f64937toq + 1) & this.f20673n;
        this.f64937toq = i3;
        this.f20674q[i3] = i2;
        this.f64938zy++;
    }

    /* JADX INFO: renamed from: n */
    public boolean m12217n() {
        return this.f64938zy == 0;
    }

    public int toq() {
        return this.f20674q.length;
    }

    public void zy() {
        this.f20672k = 0;
        this.f64937toq = -1;
        this.f64938zy = 0;
    }
}
