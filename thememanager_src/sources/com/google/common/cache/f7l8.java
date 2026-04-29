package com.google.common.cache;

import com.google.common.base.C4280z;
import com.google.common.base.fu4;
import com.google.common.base.jk;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: CacheStats.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class f7l8 {

    /* JADX INFO: renamed from: g */
    private final long f25762g;

    /* JADX INFO: renamed from: k */
    private final long f25763k;

    /* JADX INFO: renamed from: n */
    private final long f25764n;

    /* JADX INFO: renamed from: q */
    private final long f25765q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final long f68139toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f68140zy;

    public f7l8(long j2, long j3, long j4, long j5, long j6, long j7) {
        jk.m15383q(j2 >= 0);
        jk.m15383q(j3 >= 0);
        jk.m15383q(j4 >= 0);
        jk.m15383q(j5 >= 0);
        jk.m15383q(j6 >= 0);
        jk.m15383q(j7 >= 0);
        this.f25763k = j2;
        this.f68139toq = j3;
        this.f68140zy = j4;
        this.f25765q = j5;
        this.f25764n = j6;
        this.f25762g = j7;
    }

    public boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof f7l8)) {
            return false;
        }
        f7l8 f7l8Var = (f7l8) obj;
        return this.f25763k == f7l8Var.f25763k && this.f68139toq == f7l8Var.f68139toq && this.f68140zy == f7l8Var.f68140zy && this.f25765q == f7l8Var.f25765q && this.f25764n == f7l8Var.f25764n && this.f25762g == f7l8Var.f25762g;
    }

    public double f7l8() {
        long j2 = this.f68140zy;
        long j3 = this.f25765q;
        long j4 = j2 + j3;
        if (j4 == 0) {
            return 0.0d;
        }
        return j3 / j4;
    }

    /* JADX INFO: renamed from: g */
    public long m15463g() {
        return this.f25765q;
    }

    public int hashCode() {
        return C4280z.toq(Long.valueOf(this.f25763k), Long.valueOf(this.f68139toq), Long.valueOf(this.f68140zy), Long.valueOf(this.f25765q), Long.valueOf(this.f25764n), Long.valueOf(this.f25762g));
    }

    /* JADX INFO: renamed from: k */
    public double m15464k() {
        long j2 = this.f68140zy + this.f25765q;
        if (j2 == 0) {
            return 0.0d;
        }
        return this.f25764n / j2;
    }

    public double ld6() {
        long jQrj = qrj();
        if (jQrj == 0) {
            return 0.0d;
        }
        return this.f68139toq / jQrj;
    }

    /* JADX INFO: renamed from: n */
    public long m15465n() {
        return this.f68140zy + this.f25765q;
    }

    public long n7h() {
        return this.f25764n;
    }

    /* JADX INFO: renamed from: p */
    public long m15466p() {
        return this.f68139toq;
    }

    /* JADX INFO: renamed from: q */
    public double m15467q() {
        long jQrj = qrj();
        if (jQrj == 0) {
            return 1.0d;
        }
        return this.f25763k / jQrj;
    }

    public long qrj() {
        return this.f25763k + this.f68139toq;
    }

    /* JADX INFO: renamed from: s */
    public f7l8 m15468s(f7l8 f7l8Var) {
        return new f7l8(Math.max(0L, this.f25763k - f7l8Var.f25763k), Math.max(0L, this.f68139toq - f7l8Var.f68139toq), Math.max(0L, this.f68140zy - f7l8Var.f68140zy), Math.max(0L, this.f25765q - f7l8Var.f25765q), Math.max(0L, this.f25764n - f7l8Var.f25764n), Math.max(0L, this.f25762g - f7l8Var.f25762g));
    }

    public String toString() {
        return fu4.zy(this).m15359n("hitCount", this.f25763k).m15359n("missCount", this.f68139toq).m15359n("loadSuccessCount", this.f68140zy).m15359n("loadExceptionCount", this.f25765q).m15359n("totalLoadTime", this.f25764n).m15359n("evictionCount", this.f25762g).toString();
    }

    public long toq() {
        return this.f25762g;
    }

    public f7l8 x2(f7l8 f7l8Var) {
        return new f7l8(this.f25763k + f7l8Var.f25763k, this.f68139toq + f7l8Var.f68139toq, this.f68140zy + f7l8Var.f68140zy, this.f25765q + f7l8Var.f25765q, this.f25764n + f7l8Var.f25764n, this.f25762g + f7l8Var.f25762g);
    }

    /* JADX INFO: renamed from: y */
    public long m15469y() {
        return this.f68140zy;
    }

    public long zy() {
        return this.f25763k;
    }
}
