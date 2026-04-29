package com.google.android.exoplayer2.util;

import java.util.Arrays;

/* JADX INFO: compiled from: LongArray.java */
/* JADX INFO: loaded from: classes2.dex */
public final class fu4 {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f66987zy = 32;

    /* JADX INFO: renamed from: k */
    private int f23193k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long[] f66988toq;

    public fu4() {
        this(32);
    }

    /* JADX INFO: renamed from: k */
    public void m13583k(long j2) {
        int i2 = this.f23193k;
        long[] jArr = this.f66988toq;
        if (i2 == jArr.length) {
            this.f66988toq = Arrays.copyOf(jArr, i2 * 2);
        }
        long[] jArr2 = this.f66988toq;
        int i3 = this.f23193k;
        this.f23193k = i3 + 1;
        jArr2[i3] = j2;
    }

    /* JADX INFO: renamed from: q */
    public long[] m13584q() {
        return Arrays.copyOf(this.f66988toq, this.f23193k);
    }

    public long toq(int i2) {
        if (i2 >= 0 && i2 < this.f23193k) {
            return this.f66988toq[i2];
        }
        int i3 = this.f23193k;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Invalid index ");
        sb.append(i2);
        sb.append(", size is ");
        sb.append(i3);
        throw new IndexOutOfBoundsException(sb.toString());
    }

    public int zy() {
        return this.f23193k;
    }

    public fu4(int i2) {
        this.f66988toq = new long[i2];
    }
}
