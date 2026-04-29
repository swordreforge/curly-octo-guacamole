package com.google.android.exoplayer2;

import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: compiled from: SeekParameters.java */
/* JADX INFO: loaded from: classes2.dex */
public final class mbx {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final mbx f64925f7l8;

    /* JADX INFO: renamed from: g */
    public static final mbx f20638g;

    /* JADX INFO: renamed from: n */
    public static final mbx f20639n;

    /* JADX INFO: renamed from: q */
    public static final mbx f20640q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final mbx f64926zy;

    /* JADX INFO: renamed from: k */
    public final long f20641k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final long f64927toq;

    static {
        mbx mbxVar = new mbx(0L, 0L);
        f64926zy = mbxVar;
        f20640q = new mbx(Long.MAX_VALUE, Long.MAX_VALUE);
        f20639n = new mbx(Long.MAX_VALUE, 0L);
        f20638g = new mbx(0L, Long.MAX_VALUE);
        f64925f7l8 = mbxVar;
    }

    public mbx(long j2, long j3) {
        C3844k.m13629k(j2 >= 0);
        C3844k.m13629k(j3 >= 0);
        this.f20641k = j2;
        this.f64927toq = j3;
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mbx.class != obj.getClass()) {
            return false;
        }
        mbx mbxVar = (mbx) obj;
        return this.f20641k == mbxVar.f20641k && this.f64927toq == mbxVar.f64927toq;
    }

    public int hashCode() {
        return (((int) this.f20641k) * 31) + ((int) this.f64927toq);
    }

    /* JADX INFO: renamed from: k */
    public long m12188k(long j2, long j3, long j4) {
        long j5 = this.f20641k;
        if (j5 == 0 && this.f64927toq == 0) {
            return j2;
        }
        long jWx16 = com.google.android.exoplayer2.util.lrht.wx16(j2, j5, Long.MIN_VALUE);
        long qVar = com.google.android.exoplayer2.util.lrht.toq(j2, this.f64927toq, Long.MAX_VALUE);
        boolean z2 = jWx16 <= j3 && j3 <= qVar;
        boolean z3 = jWx16 <= j4 && j4 <= qVar;
        return (z2 && z3) ? Math.abs(j3 - j2) <= Math.abs(j4 - j2) ? j3 : j4 : z2 ? j3 : z3 ? j4 : jWx16;
    }
}
