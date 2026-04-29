package com.google.android.exoplayer2;

import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.util.C3844k;

/* JADX INFO: compiled from: MediaPeriodInfo.java */
/* JADX INFO: loaded from: classes2.dex */
final class zsr0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public final boolean f67307f7l8;

    /* JADX INFO: renamed from: g */
    public final boolean f23760g;

    /* JADX INFO: renamed from: k */
    public final fti.C3596k f23761k;

    /* JADX INFO: renamed from: n */
    public final long f23762n;

    /* JADX INFO: renamed from: q */
    public final long f23763q;

    /* JADX INFO: renamed from: s */
    public final boolean f23764s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final long f67308toq;

    /* JADX INFO: renamed from: y */
    public final boolean f23765y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final long f67309zy;

    zsr0(fti.C3596k c3596k, long j2, long j3, long j4, long j5, boolean z2, boolean z3, boolean z5, boolean z6) {
        boolean z7 = false;
        C3844k.m13629k(!z6 || z3);
        C3844k.m13629k(!z5 || z3);
        if (!z2 || (!z3 && !z5 && !z6)) {
            z7 = true;
        }
        C3844k.m13629k(z7);
        this.f23761k = c3596k;
        this.f67308toq = j2;
        this.f67309zy = j3;
        this.f23763q = j4;
        this.f23762n = j5;
        this.f23760g = z2;
        this.f67307f7l8 = z3;
        this.f23765y = z5;
        this.f23764s = z6;
    }

    public boolean equals(@zy.dd Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zsr0.class != obj.getClass()) {
            return false;
        }
        zsr0 zsr0Var = (zsr0) obj;
        return this.f67308toq == zsr0Var.f67308toq && this.f67309zy == zsr0Var.f67309zy && this.f23763q == zsr0Var.f23763q && this.f23762n == zsr0Var.f23762n && this.f23760g == zsr0Var.f23760g && this.f67307f7l8 == zsr0Var.f67307f7l8 && this.f23765y == zsr0Var.f23765y && this.f23764s == zsr0Var.f23764s && com.google.android.exoplayer2.util.lrht.zy(this.f23761k, zsr0Var.f23761k);
    }

    public int hashCode() {
        return ((((((((((((((((527 + this.f23761k.hashCode()) * 31) + ((int) this.f67308toq)) * 31) + ((int) this.f67309zy)) * 31) + ((int) this.f23763q)) * 31) + ((int) this.f23762n)) * 31) + (this.f23760g ? 1 : 0)) * 31) + (this.f67307f7l8 ? 1 : 0)) * 31) + (this.f23765y ? 1 : 0)) * 31) + (this.f23764s ? 1 : 0);
    }

    /* JADX INFO: renamed from: k */
    public zsr0 m13977k(long j2) {
        return j2 == this.f67309zy ? this : new zsr0(this.f23761k, this.f67308toq, j2, this.f23763q, this.f23762n, this.f23760g, this.f67307f7l8, this.f23765y, this.f23764s);
    }

    public zsr0 toq(long j2) {
        return j2 == this.f67308toq ? this : new zsr0(this.f23761k, j2, this.f67309zy, this.f23763q, this.f23762n, this.f23760g, this.f67307f7l8, this.f23765y, this.f23764s);
    }
}
