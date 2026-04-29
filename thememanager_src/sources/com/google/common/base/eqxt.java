package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.miui.maml.folme.AnimatedProperty;
import java.util.concurrent.TimeUnit;
import t8iq.C7672k;
import v5yj.C7704k;

/* JADX INFO: compiled from: Stopwatch.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class eqxt {

    /* JADX INFO: renamed from: k */
    private final x9kr f25649k;

    /* JADX INFO: renamed from: q */
    private long f25650q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private boolean f68096toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f68097zy;

    /* JADX INFO: renamed from: com.google.common.base.eqxt$k */
    /* JADX INFO: compiled from: Stopwatch.java */
    static /* synthetic */ class C4242k {

        /* JADX INFO: renamed from: k */
        static final /* synthetic */ int[] f25651k;

        static {
            int[] iArr = new int[TimeUnit.values().length];
            f25651k = iArr;
            try {
                iArr[TimeUnit.NANOSECONDS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25651k[TimeUnit.MICROSECONDS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25651k[TimeUnit.MILLISECONDS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f25651k[TimeUnit.SECONDS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25651k[TimeUnit.MINUTES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25651k[TimeUnit.HOURS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f25651k[TimeUnit.DAYS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    eqxt() {
        this.f25649k = x9kr.toq();
    }

    /* JADX INFO: renamed from: g */
    public static eqxt m15326g(x9kr x9krVar) {
        return new eqxt(x9krVar);
    }

    /* JADX INFO: renamed from: k */
    private static String m15327k(TimeUnit timeUnit) {
        switch (C4242k.f25651k[timeUnit.ordinal()]) {
            case 1:
                return "ns";
            case 2:
                return "μs";
            case 3:
                return "ms";
            case 4:
                return C7704k.y.toq.f44691k;
            case 5:
                return "min";
            case 6:
                return AnimatedProperty.PROPERTY_NAME_H;
            case 7:
                return C7672k.f94880zy;
            default:
                throw new AssertionError();
        }
    }

    /* JADX INFO: renamed from: n */
    public static eqxt m15328n() {
        return new eqxt();
    }

    /* JADX INFO: renamed from: q */
    public static eqxt m15329q(x9kr x9krVar) {
        return new eqxt(x9krVar).ld6();
    }

    private static TimeUnit toq(long j2) {
        TimeUnit timeUnit = TimeUnit.DAYS;
        TimeUnit timeUnit2 = TimeUnit.NANOSECONDS;
        if (timeUnit.convert(j2, timeUnit2) > 0) {
            return timeUnit;
        }
        TimeUnit timeUnit3 = TimeUnit.HOURS;
        if (timeUnit3.convert(j2, timeUnit2) > 0) {
            return timeUnit3;
        }
        TimeUnit timeUnit4 = TimeUnit.MINUTES;
        if (timeUnit4.convert(j2, timeUnit2) > 0) {
            return timeUnit4;
        }
        TimeUnit timeUnit5 = TimeUnit.SECONDS;
        if (timeUnit5.convert(j2, timeUnit2) > 0) {
            return timeUnit5;
        }
        TimeUnit timeUnit6 = TimeUnit.MILLISECONDS;
        if (timeUnit6.convert(j2, timeUnit2) > 0) {
            return timeUnit6;
        }
        TimeUnit timeUnit7 = TimeUnit.MICROSECONDS;
        return timeUnit7.convert(j2, timeUnit2) > 0 ? timeUnit7 : timeUnit2;
    }

    /* JADX INFO: renamed from: y */
    private long m15330y() {
        return this.f68096toq ? (this.f25649k.mo15454k() - this.f25650q) + this.f68097zy : this.f68097zy;
    }

    public static eqxt zy() {
        return new eqxt().ld6();
    }

    public long f7l8(TimeUnit timeUnit) {
        return timeUnit.convert(m15330y(), TimeUnit.NANOSECONDS);
    }

    @CanIgnoreReturnValue
    public eqxt ld6() {
        jk.y9n(!this.f68096toq, "This stopwatch is already running.");
        this.f68096toq = true;
        this.f25650q = this.f25649k.mo15454k();
        return this;
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: p */
    public eqxt m15331p() {
        this.f68097zy = 0L;
        this.f68096toq = false;
        return this;
    }

    /* JADX INFO: renamed from: s */
    public boolean m15332s() {
        return this.f68096toq;
    }

    public String toString() {
        long jM15330y = m15330y();
        TimeUnit qVar = toq(jM15330y);
        return mcp.zy(jM15330y / TimeUnit.NANOSECONDS.convert(1L, qVar)) + " " + m15327k(qVar);
    }

    @CanIgnoreReturnValue
    public eqxt x2() {
        long jMo15454k = this.f25649k.mo15454k();
        jk.y9n(this.f68096toq, "This stopwatch is already stopped.");
        this.f68096toq = false;
        this.f68097zy += jMo15454k - this.f25650q;
        return this;
    }

    eqxt(x9kr x9krVar) {
        this.f25649k = (x9kr) jk.fti(x9krVar, "ticker");
    }
}
