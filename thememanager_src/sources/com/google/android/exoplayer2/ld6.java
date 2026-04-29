package com.google.android.exoplayer2;

import android.os.SystemClock;
import com.google.android.exoplayer2.tfm;
import com.google.android.exoplayer2.util.C3844k;
import com.google.common.primitives.C4743p;

/* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ld6 implements qkj8 {

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final float f64855fn3e = 1.03f;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final long f64856fu4 = 500;

    /* JADX INFO: renamed from: i */
    public static final float f20601i = 0.97f;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final float f64857ni7 = 0.1f;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final long f64858o1t = 20;

    /* JADX INFO: renamed from: z */
    public static final float f20602z = 0.999f;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final long f64859zurt = 1000;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private long f64860cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final float f64861f7l8;

    /* JADX INFO: renamed from: g */
    private final long f20603g;

    /* JADX INFO: renamed from: h */
    private float f20604h;

    /* JADX INFO: renamed from: k */
    private final float f20605k;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private long f64862ki;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private float f64863kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private long f64864ld6;

    /* JADX INFO: renamed from: n */
    private final long f20606n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private float f64865n7h;

    /* JADX INFO: renamed from: p */
    private long f20607p;

    /* JADX INFO: renamed from: q */
    private final float f20608q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private long f64866qrj;

    /* JADX INFO: renamed from: s */
    private long f20609s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private long f64867t8r;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final float f64868toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private long f64869x2;

    /* JADX INFO: renamed from: y */
    private long f20610y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final long f64870zy;

    /* JADX INFO: compiled from: DefaultLivePlaybackSpeedControl.java */
    public static final class toq {

        /* JADX INFO: renamed from: k */
        private float f20612k = 0.97f;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private float f64872toq = 1.03f;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f64873zy = 1000;

        /* JADX INFO: renamed from: q */
        private float f20614q = 1.0E-7f;

        /* JADX INFO: renamed from: n */
        private long f20613n = com.google.android.exoplayer2.util.lrht.v0af(20);

        /* JADX INFO: renamed from: g */
        private long f20611g = com.google.android.exoplayer2.util.lrht.v0af(500);

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private float f64871f7l8 = 0.999f;

        public toq f7l8(float f2) {
            C3844k.m13629k(f2 > 0.0f);
            this.f20614q = f2 / 1000000.0f;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public toq m12165g(long j2) {
            C3844k.m13629k(j2 > 0);
            this.f64873zy = j2;
            return this;
        }

        /* JADX INFO: renamed from: k */
        public ld6 m12166k() {
            return new ld6(this.f20612k, this.f64872toq, this.f64873zy, this.f20614q, this.f20613n, this.f20611g, this.f64871f7l8);
        }

        /* JADX INFO: renamed from: n */
        public toq m12167n(float f2) {
            C3844k.m13629k(f2 >= 0.0f && f2 < 1.0f);
            this.f64871f7l8 = f2;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public toq m12168q(long j2) {
            C3844k.m13629k(j2 > 0);
            this.f20613n = com.google.android.exoplayer2.util.lrht.v0af(j2);
            return this;
        }

        public toq toq(float f2) {
            C3844k.m13629k(f2 >= 1.0f);
            this.f64872toq = f2;
            return this;
        }

        /* JADX INFO: renamed from: y */
        public toq m12169y(long j2) {
            C3844k.m13629k(j2 >= 0);
            this.f20611g = com.google.android.exoplayer2.util.lrht.v0af(j2);
            return this;
        }

        public toq zy(float f2) {
            C3844k.m13629k(0.0f < f2 && f2 <= 1.0f);
            this.f20612k = f2;
            return this;
        }
    }

    private void f7l8() {
        long j2 = this.f20610y;
        if (j2 != C3548p.f65257toq) {
            long j3 = this.f20609s;
            if (j3 != C3548p.f65257toq) {
                j2 = j3;
            }
            long j4 = this.f64864ld6;
            if (j4 != C3548p.f65257toq && j2 < j4) {
                j2 = j4;
            }
            long j5 = this.f64869x2;
            if (j5 != C3548p.f65257toq && j2 > j5) {
                j2 = j5;
            }
        } else {
            j2 = -9223372036854775807L;
        }
        if (this.f20607p == j2) {
            return;
        }
        this.f20607p = j2;
        this.f64866qrj = j2;
        this.f64862ki = C3548p.f65257toq;
        this.f64867t8r = C3548p.f65257toq;
        this.f64860cdj = C3548p.f65257toq;
    }

    /* JADX INFO: renamed from: g */
    private void m12159g(long j2) {
        long j3 = this.f64862ki + (this.f64867t8r * 3);
        if (this.f64866qrj > j3) {
            float fV0af = com.google.android.exoplayer2.util.lrht.v0af(this.f64870zy);
            this.f64866qrj = C4743p.t8r(j3, this.f20607p, this.f64866qrj - (((long) ((this.f20604h - 1.0f) * fV0af)) + ((long) ((this.f64865n7h - 1.0f) * fV0af))));
            return;
        }
        long jM13660i = com.google.android.exoplayer2.util.lrht.m13660i(j2 - ((long) (Math.max(0.0f, this.f20604h - 1.0f) / this.f20608q)), this.f64866qrj, j3);
        this.f64866qrj = jM13660i;
        long j4 = this.f64869x2;
        if (j4 == C3548p.f65257toq || jM13660i <= j4) {
            return;
        }
        this.f64866qrj = j4;
    }

    /* JADX INFO: renamed from: s */
    private void m12160s(long j2, long j3) {
        long j4 = j2 - j3;
        long j5 = this.f64862ki;
        if (j5 == C3548p.f65257toq) {
            this.f64862ki = j4;
            this.f64867t8r = 0L;
        } else {
            long jMax = Math.max(j4, m12161y(j5, j4, this.f64861f7l8));
            this.f64862ki = jMax;
            this.f64867t8r = m12161y(this.f64867t8r, Math.abs(j4 - jMax), this.f64861f7l8);
        }
    }

    /* JADX INFO: renamed from: y */
    private static long m12161y(long j2, long j3, float f2) {
        return (long) ((j2 * f2) + ((1.0f - f2) * j3));
    }

    @Override // com.google.android.exoplayer2.qkj8
    /* JADX INFO: renamed from: k */
    public void mo12162k(tfm.f7l8 f7l8Var) {
        this.f20610y = com.google.android.exoplayer2.util.lrht.v0af(f7l8Var.f22161k);
        this.f64864ld6 = com.google.android.exoplayer2.util.lrht.v0af(f7l8Var.f22163q);
        this.f64869x2 = com.google.android.exoplayer2.util.lrht.v0af(f7l8Var.f22162n);
        float f2 = f7l8Var.f22160g;
        if (f2 == -3.4028235E38f) {
            f2 = this.f20605k;
        }
        this.f64863kja0 = f2;
        float f3 = f7l8Var.f22164y;
        if (f3 == -3.4028235E38f) {
            f3 = this.f64868toq;
        }
        this.f64865n7h = f3;
        f7l8();
    }

    @Override // com.google.android.exoplayer2.qkj8
    /* JADX INFO: renamed from: n */
    public void mo12163n(long j2) {
        this.f20609s = j2;
        f7l8();
    }

    @Override // com.google.android.exoplayer2.qkj8
    /* JADX INFO: renamed from: q */
    public void mo12164q() {
        long j2 = this.f64866qrj;
        if (j2 == C3548p.f65257toq) {
            return;
        }
        long j3 = j2 + this.f20603g;
        this.f64866qrj = j3;
        long j4 = this.f64869x2;
        if (j4 != C3548p.f65257toq && j3 > j4) {
            this.f64866qrj = j4;
        }
        this.f64860cdj = C3548p.f65257toq;
    }

    @Override // com.google.android.exoplayer2.qkj8
    public float toq(long j2, long j3) {
        if (this.f20610y == C3548p.f65257toq) {
            return 1.0f;
        }
        m12160s(j2, j3);
        if (this.f64860cdj != C3548p.f65257toq && SystemClock.elapsedRealtime() - this.f64860cdj < this.f64870zy) {
            return this.f20604h;
        }
        this.f64860cdj = SystemClock.elapsedRealtime();
        m12159g(j2);
        long j4 = j2 - this.f64866qrj;
        if (Math.abs(j4) < this.f20606n) {
            this.f20604h = 1.0f;
        } else {
            this.f20604h = com.google.android.exoplayer2.util.lrht.ki((this.f20608q * j4) + 1.0f, this.f64863kja0, this.f64865n7h);
        }
        return this.f20604h;
    }

    @Override // com.google.android.exoplayer2.qkj8
    public long zy() {
        return this.f64866qrj;
    }

    private ld6(float f2, float f3, long j2, float f4, long j3, long j4, float f5) {
        this.f20605k = f2;
        this.f64868toq = f3;
        this.f64870zy = j2;
        this.f20608q = f4;
        this.f20606n = j3;
        this.f20603g = j4;
        this.f64861f7l8 = f5;
        this.f20610y = C3548p.f65257toq;
        this.f20609s = C3548p.f65257toq;
        this.f64864ld6 = C3548p.f65257toq;
        this.f64869x2 = C3548p.f65257toq;
        this.f64863kja0 = f2;
        this.f64865n7h = f3;
        this.f20604h = 1.0f;
        this.f64860cdj = C3548p.f65257toq;
        this.f20607p = C3548p.f65257toq;
        this.f64866qrj = C3548p.f65257toq;
        this.f64862ki = C3548p.f65257toq;
        this.f64867t8r = C3548p.f65257toq;
    }
}
