package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.util.concurrent.f */
/* JADX INFO: compiled from: JdkFutureAdapters.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
public final class C4804f {

    /* JADX INFO: renamed from: com.google.common.util.concurrent.f$k */
    /* JADX INFO: compiled from: JdkFutureAdapters.java */
    private static class k<V> extends oc<V> implements InterfaceFutureC4792c<V> {

        /* JADX INFO: renamed from: s */
        private static final Executor f27420s;

        /* JADX INFO: renamed from: y */
        private static final ThreadFactory f27421y;

        /* JADX INFO: renamed from: g */
        private final Future<V> f27422g;

        /* JADX INFO: renamed from: k */
        private final Executor f27423k;

        /* JADX INFO: renamed from: n */
        private final AtomicBoolean f27424n;

        /* JADX INFO: renamed from: q */
        private final o1t f27425q;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.f$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: JdkFutureAdapters.java */
        class RunnableC8017k implements Runnable {
            RunnableC8017k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    c8jq.m16895q(k.this.f27422g);
                } catch (Throwable unused) {
                }
                k.this.f27425q.toq();
            }
        }

        static {
            ThreadFactory qVar = new ch().m16903n(true).m16902g("ListenableFutureAdapter-thread-%d").toq();
            f27421y = qVar;
            f27420s = Executors.newCachedThreadPool(qVar);
        }

        k(Future<V> future) {
            this(future, f27420s);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.oc, com.google.common.collect.qkj8
        /* JADX INFO: renamed from: ld6 */
        public Future<V> delegate() {
            return this.f27422g;
        }

        @Override // com.google.common.util.concurrent.InterfaceFutureC4792c
        public void n7h(Runnable runnable, Executor executor) {
            this.f27425q.m16992k(runnable, executor);
            if (this.f27424n.compareAndSet(false, true)) {
                if (this.f27422g.isDone()) {
                    this.f27425q.toq();
                } else {
                    this.f27423k.execute(new RunnableC8017k());
                }
            }
        }

        k(Future<V> future, Executor executor) {
            this.f27425q = new o1t();
            this.f27424n = new AtomicBoolean(false);
            this.f27422g = (Future) com.google.common.base.jk.a9(future);
            this.f27423k = (Executor) com.google.common.base.jk.a9(executor);
        }
    }

    private C4804f() {
    }

    /* JADX INFO: renamed from: k */
    public static <V> InterfaceFutureC4792c<V> m16932k(Future<V> future) {
        return future instanceof InterfaceFutureC4792c ? (InterfaceFutureC4792c) future : new k(future);
    }

    public static <V> InterfaceFutureC4792c<V> toq(Future<V> future, Executor executor) {
        com.google.common.base.jk.a9(executor);
        return future instanceof InterfaceFutureC4792c ? (InterfaceFutureC4792c) future : new k(future, executor);
    }
}
