package com.google.common.util.concurrent;

import com.google.common.util.concurrent.mcp;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: TimeoutFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
final class lv5<V> extends mcp.AbstractC4821k<V> {

    /* JADX INFO: renamed from: i */
    @NullableDecl
    private InterfaceFutureC4792c<V> f27485i;

    /* JADX INFO: renamed from: z */
    @NullableDecl
    private ScheduledFuture<?> f27486z;

    /* JADX INFO: compiled from: TimeoutFuture.java */
    private static final class toq<V> implements Runnable {

        /* JADX INFO: renamed from: k */
        @NullableDecl
        lv5<V> f27487k;

        toq(lv5<V> lv5Var) {
            this.f27487k = lv5Var;
        }

        @Override // java.lang.Runnable
        public void run() {
            InterfaceFutureC4792c<? extends V> interfaceFutureC4792c;
            lv5<V> lv5Var = this.f27487k;
            if (lv5Var == null || (interfaceFutureC4792c = ((lv5) lv5Var).f27485i) == null) {
                return;
            }
            this.f27487k = null;
            if (interfaceFutureC4792c.isDone()) {
                lv5Var.a9(interfaceFutureC4792c);
                return;
            }
            try {
                ScheduledFuture scheduledFuture = ((lv5) lv5Var).f27486z;
                String str = "Timed out";
                if (scheduledFuture != null) {
                    long jAbs = Math.abs(scheduledFuture.getDelay(TimeUnit.MILLISECONDS));
                    if (jAbs > 10) {
                        str = "Timed out (timeout delayed by " + jAbs + " ms after scheduled time)";
                    }
                }
                ((lv5) lv5Var).f27486z = null;
                lv5Var.jk(new zy(str + ": " + interfaceFutureC4792c));
            } finally {
                interfaceFutureC4792c.cancel(true);
            }
        }
    }

    /* JADX INFO: compiled from: TimeoutFuture.java */
    private static final class zy extends TimeoutException {
        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            setStackTrace(new StackTraceElement[0]);
            return this;
        }

        private zy(String str) {
            super(str);
        }
    }

    private lv5(InterfaceFutureC4792c<V> interfaceFutureC4792c) {
        this.f27485i = (InterfaceFutureC4792c) com.google.common.base.jk.a9(interfaceFutureC4792c);
    }

    /* JADX INFO: renamed from: l */
    static <V> InterfaceFutureC4792c<V> m16976l(InterfaceFutureC4792c<V> interfaceFutureC4792c, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        lv5 lv5Var = new lv5(interfaceFutureC4792c);
        toq toqVar = new toq(lv5Var);
        lv5Var.f27486z = scheduledExecutorService.schedule(toqVar, j2, timeUnit);
        interfaceFutureC4792c.n7h(toqVar, C4815j.zy());
        return lv5Var;
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q
    /* JADX INFO: renamed from: h */
    protected void mo16921h() {
        m17002z(this.f27485i);
        ScheduledFuture<?> scheduledFuture = this.f27486z;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f27485i = null;
        this.f27486z = null;
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q
    protected String o1t() {
        InterfaceFutureC4792c<V> interfaceFutureC4792c = this.f27485i;
        ScheduledFuture<?> scheduledFuture = this.f27486z;
        if (interfaceFutureC4792c == null) {
            return null;
        }
        String str = "inputFuture=[" + interfaceFutureC4792c + "]";
        if (scheduledFuture == null) {
            return str;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return str;
        }
        return str + ", remaining delay=[" + delay + " ms]";
    }
}
