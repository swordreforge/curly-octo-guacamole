package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC4783a;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: RateLimiter.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
public abstract class ek5k {

    /* JADX INFO: renamed from: k */
    private final AbstractC4802k f27417k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @MonotonicNonNullDecl
    private volatile Object f68631toq;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ek5k$k */
    /* JADX INFO: compiled from: RateLimiter.java */
    static abstract class AbstractC4802k {

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ek5k$k$k */
        /* JADX INFO: compiled from: RateLimiter.java */
        static class k extends AbstractC4802k {

            /* JADX INFO: renamed from: k */
            final com.google.common.base.eqxt f27418k = com.google.common.base.eqxt.zy();

            k() {
            }

            @Override // com.google.common.util.concurrent.ek5k.AbstractC4802k
            protected long toq() {
                return this.f27418k.f7l8(TimeUnit.MICROSECONDS);
            }

            @Override // com.google.common.util.concurrent.ek5k.AbstractC4802k
            protected void zy(long j2) {
                if (j2 > 0) {
                    c8jq.m16896s(j2, TimeUnit.MICROSECONDS);
                }
            }
        }

        protected AbstractC4802k() {
        }

        /* JADX INFO: renamed from: k */
        public static AbstractC4802k m16931k() {
            return new k();
        }

        protected abstract long toq();

        protected abstract void zy(long j2);
    }

    ek5k(AbstractC4802k abstractC4802k) {
        this.f27417k = (AbstractC4802k) com.google.common.base.jk.a9(abstractC4802k);
    }

    @InterfaceC7732q
    static ek5k f7l8(double d2, long j2, TimeUnit timeUnit, double d4, AbstractC4802k abstractC4802k) {
        AbstractC4783a.zy zyVar = new AbstractC4783a.zy(abstractC4802k, j2, timeUnit, d4);
        zyVar.cdj(d2);
        return zyVar;
    }

    /* JADX INFO: renamed from: g */
    public static ek5k m16925g(double d2, long j2, TimeUnit timeUnit) {
        com.google.common.base.jk.m15374h(j2 >= 0, "warmupPeriod must not be negative: %s", j2);
        return f7l8(d2, j2, timeUnit, 3.0d, AbstractC4802k.m16931k());
    }

    /* JADX INFO: renamed from: n */
    public static ek5k m16926n(double d2) {
        return m16928y(d2, AbstractC4802k.m16931k());
    }

    /* JADX INFO: renamed from: q */
    private static void m16927q(int i2) {
        com.google.common.base.jk.ld6(i2 > 0, "Requested permits (%s) must be positive", i2);
    }

    private Object x2() {
        Object obj = this.f68631toq;
        if (obj == null) {
            synchronized (this) {
                obj = this.f68631toq;
                if (obj == null) {
                    obj = new Object();
                    this.f68631toq = obj;
                }
            }
        }
        return obj;
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: y */
    static ek5k m16928y(double d2, AbstractC4802k abstractC4802k) {
        AbstractC4783a.toq toqVar = new AbstractC4783a.toq(abstractC4802k, 1.0d);
        toqVar.cdj(d2);
        return toqVar;
    }

    private boolean zy(long j2, long j3) {
        return qrj(j2) - j3 <= j2;
    }

    public final void cdj(double d2) {
        com.google.common.base.jk.m15380n(d2 > 0.0d && !Double.isNaN(d2), "rate must be positive");
        synchronized (x2()) {
            mo16854p(d2, this.f27417k.toq());
        }
    }

    public boolean fn3e(long j2, TimeUnit timeUnit) {
        return m16929i(1, j2, timeUnit);
    }

    /* JADX INFO: renamed from: h */
    abstract long mo16853h(int i2, long j2);

    /* JADX INFO: renamed from: i */
    public boolean m16929i(int i2, long j2, TimeUnit timeUnit) {
        long jMax = Math.max(timeUnit.toMicros(j2), 0L);
        m16927q(i2);
        synchronized (x2()) {
            long qVar = this.f27417k.toq();
            if (!zy(qVar, jMax)) {
                return false;
            }
            this.f27417k.zy(kja0(i2, qVar));
            return true;
        }
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: k */
    public double m16930k() {
        return toq(1);
    }

    public boolean ki() {
        return m16929i(1, 0L, TimeUnit.MICROSECONDS);
    }

    final long kja0(int i2, long j2) {
        return Math.max(mo16853h(i2, j2) - j2, 0L);
    }

    public final double ld6() {
        double dMo16855s;
        synchronized (x2()) {
            dMo16855s = mo16855s();
        }
        return dMo16855s;
    }

    final long n7h(int i2) {
        long jKja0;
        m16927q(i2);
        synchronized (x2()) {
            jKja0 = kja0(i2, this.f27417k.toq());
        }
        return jKja0;
    }

    /* JADX INFO: renamed from: p */
    abstract void mo16854p(double d2, long j2);

    abstract long qrj(long j2);

    /* JADX INFO: renamed from: s */
    abstract double mo16855s();

    public boolean t8r(int i2) {
        return m16929i(i2, 0L, TimeUnit.MICROSECONDS);
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(ld6()));
    }

    @CanIgnoreReturnValue
    public double toq(int i2) {
        long jN7h = n7h(i2);
        this.f27417k.zy(jN7h);
        return (jN7h * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }
}
