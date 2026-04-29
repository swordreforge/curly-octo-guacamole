package okio;

import cyoe.InterfaceC5981k;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import kotlin.jvm.internal.lv5;
import l05.InterfaceC6765n;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: okio.j */
/* JADX INFO: compiled from: Timeout.kt */
/* JADX INFO: loaded from: classes4.dex */
@lv5({"SMAP\nTimeout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Timeout.kt\nokio/Timeout\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,316:1\n1#2:317\n*E\n"})
public class C7560j {

    /* JADX INFO: renamed from: k */
    private boolean f43772k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private long f94288toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private long f94289zy;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    public static final toq f43771q = new toq(null);

    /* JADX INFO: renamed from: n */
    @InterfaceC7396q
    @InterfaceC6765n
    public static final C7560j f43770n = new k();

    /* JADX INFO: renamed from: okio.j$k */
    /* JADX INFO: compiled from: Timeout.kt */
    public static final class k extends C7560j {
        k() {
        }

        @Override // okio.C7560j
        @InterfaceC7396q
        /* JADX INFO: renamed from: g */
        public C7560j mo27755g(long j2) {
            return this;
        }

        @Override // okio.C7560j
        @InterfaceC7396q
        /* JADX INFO: renamed from: p */
        public C7560j mo27758p(long j2, @InterfaceC7396q TimeUnit unit) {
            kotlin.jvm.internal.d2ok.m23075h(unit, "unit");
            return this;
        }

        @Override // okio.C7560j
        /* JADX INFO: renamed from: s */
        public void mo27760s() {
        }
    }

    /* JADX INFO: renamed from: okio.j$toq */
    /* JADX INFO: compiled from: Timeout.kt */
    public static final class toq {
        private toq() {
        }

        public /* synthetic */ toq(kotlin.jvm.internal.ni7 ni7Var) {
            this();
        }

        /* JADX INFO: renamed from: k */
        public final long m27762k(long j2, long j3) {
            return (j2 != 0 && (j3 == 0 || j2 < j3)) ? j2 : j3;
        }
    }

    public boolean f7l8() {
        return this.f43772k;
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: g */
    public C7560j mo27755g(long j2) {
        this.f43772k = true;
        this.f94288toq = j2;
        return this;
    }

    /* JADX INFO: renamed from: k */
    public final void m27756k(@InterfaceC7396q Condition condition) throws InterruptedIOException {
        kotlin.jvm.internal.d2ok.m23075h(condition, "condition");
        try {
            boolean zF7l8 = f7l8();
            long jLd6 = ld6();
            long jNanoTime = 0;
            if (!zF7l8 && jLd6 == 0) {
                condition.await();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zF7l8 && jLd6 != 0) {
                jLd6 = Math.min(jLd6, mo27757n() - jNanoTime2);
            } else if (zF7l8) {
                jLd6 = mo27757n() - jNanoTime2;
            }
            if (jLd6 > 0) {
                condition.await(jLd6, TimeUnit.NANOSECONDS);
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jLd6) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public long ld6() {
        return this.f94289zy;
    }

    /* JADX INFO: renamed from: n */
    public long mo27757n() {
        if (this.f43772k) {
            return this.f94288toq;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: p */
    public C7560j mo27758p(long j2, @InterfaceC7396q TimeUnit unit) {
        kotlin.jvm.internal.d2ok.m23075h(unit, "unit");
        if (j2 >= 0) {
            this.f94289zy = unit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }

    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public final C7560j m27759q(long j2, @InterfaceC7396q TimeUnit unit) {
        kotlin.jvm.internal.d2ok.m23075h(unit, "unit");
        if (j2 > 0) {
            return mo27755g(System.nanoTime() + unit.toNanos(j2));
        }
        throw new IllegalArgumentException(("duration <= 0: " + j2).toString());
    }

    /* JADX INFO: renamed from: s */
    public void mo27760s() throws IOException {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f43772k && this.f94288toq - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    @InterfaceC7396q
    public C7560j toq() {
        this.f43772k = false;
        return this;
    }

    public final void x2(@InterfaceC7396q Object monitor) throws InterruptedIOException {
        kotlin.jvm.internal.d2ok.m23075h(monitor, "monitor");
        try {
            boolean zF7l8 = f7l8();
            long jLd6 = ld6();
            long jNanoTime = 0;
            if (!zF7l8 && jLd6 == 0) {
                monitor.wait();
                return;
            }
            long jNanoTime2 = System.nanoTime();
            if (zF7l8 && jLd6 != 0) {
                jLd6 = Math.min(jLd6, mo27757n() - jNanoTime2);
            } else if (zF7l8) {
                jLd6 = mo27757n() - jNanoTime2;
            }
            if (jLd6 > 0) {
                long j2 = jLd6 / 1000000;
                monitor.wait(j2, (int) (jLd6 - (1000000 * j2)));
                jNanoTime = System.nanoTime() - jNanoTime2;
            }
            if (jNanoTime >= jLd6) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    /* JADX INFO: renamed from: y */
    public final <T> T m27761y(@InterfaceC7396q C7560j other, @InterfaceC7396q InterfaceC5981k<? extends T> block) {
        kotlin.jvm.internal.d2ok.m23075h(other, "other");
        kotlin.jvm.internal.d2ok.m23075h(block, "block");
        long jLd6 = ld6();
        long jM27762k = f43771q.m27762k(other.ld6(), ld6());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        mo27758p(jM27762k, timeUnit);
        if (!f7l8()) {
            if (other.f7l8()) {
                mo27755g(other.mo27757n());
            }
            try {
                T tInvoke = block.invoke();
                kotlin.jvm.internal.d3.m23090q(1);
                mo27758p(jLd6, timeUnit);
                if (other.f7l8()) {
                    toq();
                }
                kotlin.jvm.internal.d3.zy(1);
                return tInvoke;
            } catch (Throwable th) {
                kotlin.jvm.internal.d3.m23090q(1);
                mo27758p(jLd6, TimeUnit.NANOSECONDS);
                if (other.f7l8()) {
                    toq();
                }
                kotlin.jvm.internal.d3.zy(1);
                throw th;
            }
        }
        long jMo27757n = mo27757n();
        if (other.f7l8()) {
            mo27755g(Math.min(mo27757n(), other.mo27757n()));
        }
        try {
            T tInvoke2 = block.invoke();
            kotlin.jvm.internal.d3.m23090q(1);
            mo27758p(jLd6, timeUnit);
            if (other.f7l8()) {
                mo27755g(jMo27757n);
            }
            kotlin.jvm.internal.d3.zy(1);
            return tInvoke2;
        } catch (Throwable th2) {
            kotlin.jvm.internal.d3.m23090q(1);
            mo27758p(jLd6, TimeUnit.NANOSECONDS);
            if (other.f7l8()) {
                mo27755g(jMo27757n);
            }
            kotlin.jvm.internal.d3.zy(1);
            throw th2;
        }
    }

    @InterfaceC7396q
    public C7560j zy() {
        this.f94289zy = 0L;
        return this;
    }
}
