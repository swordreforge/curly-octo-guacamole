package com.google.common.util.concurrent;

import com.google.common.math.C4719g;
import com.google.common.util.concurrent.ek5k;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.google.common.util.concurrent.a */
/* JADX INFO: compiled from: SmoothRateLimiter.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
abstract class AbstractC4783a extends ek5k {

    /* JADX INFO: renamed from: g */
    private long f27360g;

    /* JADX INFO: renamed from: n */
    double f27361n;

    /* JADX INFO: renamed from: q */
    double f27362q;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    double f68612zy;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.a$toq */
    /* JADX INFO: compiled from: SmoothRateLimiter.java */
    static final class toq extends AbstractC4783a {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        final double f68613f7l8;

        toq(ek5k.AbstractC4802k abstractC4802k, double d2) {
            super(abstractC4802k);
            this.f68613f7l8 = d2;
        }

        @Override // com.google.common.util.concurrent.AbstractC4783a
        void ni7(double d2, double d4) {
            double d5 = this.f27362q;
            double d6 = this.f68613f7l8 * d2;
            this.f27362q = d6;
            if (d5 == Double.POSITIVE_INFINITY) {
                this.f68612zy = d6;
            } else {
                this.f68612zy = d5 != 0.0d ? (this.f68612zy * d6) / d5 : 0.0d;
            }
        }

        @Override // com.google.common.util.concurrent.AbstractC4783a
        /* JADX INFO: renamed from: z */
        long mo16856z(double d2, double d4) {
            return 0L;
        }

        @Override // com.google.common.util.concurrent.AbstractC4783a
        double zurt() {
            return this.f27361n;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.a$zy */
    /* JADX INFO: compiled from: SmoothRateLimiter.java */
    static final class zy extends AbstractC4783a {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final long f68614f7l8;

        /* JADX INFO: renamed from: p */
        private double f27363p;

        /* JADX INFO: renamed from: s */
        private double f27364s;

        /* JADX INFO: renamed from: y */
        private double f27365y;

        zy(ek5k.AbstractC4802k abstractC4802k, long j2, TimeUnit timeUnit, double d2) {
            super(abstractC4802k);
            this.f68614f7l8 = timeUnit.toMicros(j2);
            this.f27363p = d2;
        }

        private double o1t(double d2) {
            return this.f27361n + (d2 * this.f27365y);
        }

        @Override // com.google.common.util.concurrent.AbstractC4783a
        void ni7(double d2, double d4) {
            double d5 = this.f27362q;
            double d6 = this.f27363p * d4;
            long j2 = this.f68614f7l8;
            double d7 = (j2 * 0.5d) / d4;
            this.f27364s = d7;
            double d8 = ((j2 * 2.0d) / (d4 + d6)) + d7;
            this.f27362q = d8;
            this.f27365y = (d6 - d4) / (d8 - d7);
            if (d5 == Double.POSITIVE_INFINITY) {
                this.f68612zy = 0.0d;
                return;
            }
            if (d5 != 0.0d) {
                d8 = (this.f68612zy * d8) / d5;
            }
            this.f68612zy = d8;
        }

        @Override // com.google.common.util.concurrent.AbstractC4783a
        /* JADX INFO: renamed from: z */
        long mo16856z(double d2, double d4) {
            long jO1t;
            double d5 = d2 - this.f27364s;
            if (d5 > 0.0d) {
                double dMin = Math.min(d5, d4);
                jO1t = (long) (((o1t(d5) + o1t(d5 - dMin)) * dMin) / 2.0d);
                d4 -= dMin;
            } else {
                jO1t = 0;
            }
            return jO1t + ((long) (this.f27361n * d4));
        }

        @Override // com.google.common.util.concurrent.AbstractC4783a
        double zurt() {
            return this.f68614f7l8 / this.f27362q;
        }
    }

    void fu4(long j2) {
        if (j2 > this.f27360g) {
            this.f68612zy = Math.min(this.f27362q, this.f68612zy + ((j2 - r0) / zurt()));
            this.f27360g = j2;
        }
    }

    @Override // com.google.common.util.concurrent.ek5k
    /* JADX INFO: renamed from: h */
    final long mo16853h(int i2, long j2) {
        fu4(j2);
        long j3 = this.f27360g;
        double d2 = i2;
        double dMin = Math.min(d2, this.f68612zy);
        this.f27360g = C4719g.ni7(this.f27360g, mo16856z(this.f68612zy, dMin) + ((long) ((d2 - dMin) * this.f27361n)));
        this.f68612zy -= dMin;
        return j3;
    }

    abstract void ni7(double d2, double d4);

    @Override // com.google.common.util.concurrent.ek5k
    /* JADX INFO: renamed from: p */
    final void mo16854p(double d2, long j2) {
        fu4(j2);
        double micros = TimeUnit.SECONDS.toMicros(1L) / d2;
        this.f27361n = micros;
        ni7(d2, micros);
    }

    @Override // com.google.common.util.concurrent.ek5k
    final long qrj(long j2) {
        return this.f27360g;
    }

    @Override // com.google.common.util.concurrent.ek5k
    /* JADX INFO: renamed from: s */
    final double mo16855s() {
        return TimeUnit.SECONDS.toMicros(1L) / this.f27361n;
    }

    /* JADX INFO: renamed from: z */
    abstract long mo16856z(double d2, double d4);

    abstract double zurt();

    private AbstractC4783a(ek5k.AbstractC4802k abstractC4802k) {
        super(abstractC4802k);
        this.f27360g = 0L;
    }
}
