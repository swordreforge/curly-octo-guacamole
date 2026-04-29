package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: compiled from: TimedValueQueue.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ncyb<V> {

    /* JADX INFO: renamed from: n */
    private static final int f23251n = 10;

    /* JADX INFO: renamed from: k */
    private long[] f23252k;

    /* JADX INFO: renamed from: q */
    private int f23253q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private V[] f67060toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f67061zy;

    public ncyb() {
        this(10);
    }

    /* JADX INFO: renamed from: g */
    private static <V> V[] m13691g(int i2) {
        return (V[]) new Object[i2];
    }

    @zy.dd
    private V ld6() {
        C3844k.m13633s(this.f23253q > 0);
        V[] vArr = this.f67060toq;
        int i2 = this.f67061zy;
        V v2 = vArr[i2];
        vArr[i2] = null;
        this.f67061zy = (i2 + 1) % vArr.length;
        this.f23253q--;
        return v2;
    }

    /* JADX INFO: renamed from: n */
    private void m13692n() {
        int length = this.f67060toq.length;
        if (this.f23253q < length) {
            return;
        }
        int i2 = length * 2;
        long[] jArr = new long[i2];
        V[] vArr = (V[]) m13691g(i2);
        int i3 = this.f67061zy;
        int i4 = length - i3;
        System.arraycopy(this.f23252k, i3, jArr, 0, i4);
        System.arraycopy(this.f67060toq, this.f67061zy, vArr, 0, i4);
        int i5 = this.f67061zy;
        if (i5 > 0) {
            System.arraycopy(this.f23252k, 0, jArr, i4, i5);
            System.arraycopy(this.f67060toq, 0, vArr, i4, this.f67061zy);
        }
        this.f23252k = jArr;
        this.f67060toq = vArr;
        this.f67061zy = 0;
    }

    /* JADX INFO: renamed from: q */
    private void m13693q(long j2) {
        if (this.f23253q > 0) {
            if (j2 <= this.f23252k[((this.f67061zy + r0) - 1) % this.f67060toq.length]) {
                zy();
            }
        }
    }

    private void toq(long j2, V v2) {
        int i2 = this.f67061zy;
        int i3 = this.f23253q;
        V[] vArr = this.f67060toq;
        int length = (i2 + i3) % vArr.length;
        this.f23252k[length] = j2;
        vArr[length] = v2;
        this.f23253q = i3 + 1;
    }

    @zy.dd
    /* JADX INFO: renamed from: y */
    private V m13694y(long j2, boolean z2) {
        V vLd6 = null;
        long j3 = Long.MAX_VALUE;
        while (this.f23253q > 0) {
            long j4 = j2 - this.f23252k[this.f67061zy];
            if (j4 < 0 && (z2 || (-j4) >= j3)) {
                break;
            }
            vLd6 = ld6();
            j3 = j4;
        }
        return vLd6;
    }

    @zy.dd
    public synchronized V f7l8(long j2) {
        return m13694y(j2, false);
    }

    /* JADX INFO: renamed from: k */
    public synchronized void m13695k(long j2, V v2) {
        m13693q(j2);
        m13692n();
        toq(j2, v2);
    }

    @zy.dd
    /* JADX INFO: renamed from: p */
    public synchronized V m13696p(long j2) {
        return m13694y(j2, true);
    }

    @zy.dd
    /* JADX INFO: renamed from: s */
    public synchronized V m13697s() {
        return this.f23253q == 0 ? null : ld6();
    }

    public synchronized int x2() {
        return this.f23253q;
    }

    public synchronized void zy() {
        this.f67061zy = 0;
        this.f23253q = 0;
        Arrays.fill(this.f67060toq, (Object) null);
    }

    public ncyb(int i2) {
        this.f23252k = new long[i2];
        this.f67060toq = (V[]) m13691g(i2);
    }
}
