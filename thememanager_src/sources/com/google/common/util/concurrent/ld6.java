package com.google.common.util.concurrent;

import com.google.common.collect.ab;
import com.google.common.collect.z4;
import com.google.common.util.concurrent.AbstractC4837q;
import com.google.errorprone.annotations.ForOverride;
import com.google.errorprone.annotations.OverridingMethodsMustInvokeSuper;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: AggregateFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
abstract class ld6<InputT, OutputT> extends AbstractC4837q.p<OutputT> {

    /* JADX INFO: renamed from: z */
    private static final Logger f27475z = Logger.getLogger(ld6.class.getName());

    /* JADX INFO: renamed from: i */
    @NullableDecl
    private ld6<InputT, OutputT>.AbstractRunnableC4818k f27476i;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.ld6$k */
    /* JADX INFO: compiled from: AggregateFuture.java */
    abstract class AbstractRunnableC4818k extends x2 implements Runnable {

        /* JADX INFO: renamed from: p */
        private final boolean f27478p;

        /* JADX INFO: renamed from: s */
        private final boolean f27479s;

        /* JADX INFO: renamed from: y */
        private z4<? extends InterfaceFutureC4792c<? extends InputT>> f27480y;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.ld6$k$k */
        /* JADX INFO: compiled from: AggregateFuture.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ int f27481k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ InterfaceFutureC4792c f27483q;

            k(int i2, InterfaceFutureC4792c interfaceFutureC4792c) {
                this.f27481k = i2;
                this.f27483q = interfaceFutureC4792c;
            }

            @Override // java.lang.Runnable
            public void run() {
                try {
                    AbstractRunnableC4818k.this.m16970h(this.f27481k, this.f27483q);
                } finally {
                    AbstractRunnableC4818k.this.qrj();
                }
            }
        }

        AbstractRunnableC4818k(z4<? extends InterfaceFutureC4792c<? extends InputT>> z4Var, boolean z2, boolean z3) {
            super(z4Var.size());
            this.f27480y = (z4) com.google.common.base.jk.a9(z4Var);
            this.f27479s = z2;
            this.f27478p = z3;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void cdj() {
            if (this.f27480y.isEmpty()) {
                n7h();
                return;
            }
            if (!this.f27479s) {
                ab<? extends InterfaceFutureC4792c<? extends InputT>> it = this.f27480y.iterator();
                while (it.hasNext()) {
                    it.next().n7h(this, C4815j.zy());
                }
                return;
            }
            int i2 = 0;
            ab<? extends InterfaceFutureC4792c<? extends InputT>> it2 = this.f27480y.iterator();
            while (it2.hasNext()) {
                InterfaceFutureC4792c<? extends InputT> next = it2.next();
                next.n7h(new k(i2, next), C4815j.zy());
                i2++;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: h */
        public void m16970h(int i2, Future<? extends InputT> future) {
            com.google.common.base.jk.y9n(this.f27479s || !ld6.this.isDone() || ld6.this.isCancelled(), "Future was done before all dependencies completed");
            try {
                com.google.common.base.jk.y9n(future.isDone(), "Tried to set value from future which is not done");
                if (this.f27479s) {
                    if (future.isCancelled()) {
                        ld6.this.f27476i = null;
                        ld6.this.cancel(false);
                    } else {
                        Object objM16915y = dd.m16915y(future);
                        if (this.f27478p) {
                            x2(this.f27479s, i2, objM16915y);
                        }
                    }
                } else if (this.f27478p && !future.isCancelled()) {
                    x2(this.f27479s, i2, dd.m16915y(future));
                }
            } catch (ExecutionException e2) {
                kja0(e2.getCause());
            } catch (Throwable th) {
                kja0(th);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:12:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void kja0(java.lang.Throwable r6) {
            /*
                r5 = this;
                com.google.common.base.jk.a9(r6)
                boolean r0 = r5.f27479s
                r1 = 1
                if (r0 == 0) goto L1d
                com.google.common.util.concurrent.ld6 r0 = com.google.common.util.concurrent.ld6.this
                boolean r0 = r0.jk(r6)
                if (r0 == 0) goto L14
                r5.mo16933i()
                goto L1e
            L14:
                java.util.Set r2 = r5.f7l8()
                boolean r2 = com.google.common.util.concurrent.ld6.gvn7(r2, r6)
                goto L1f
            L1d:
                r0 = 0
            L1e:
                r2 = r1
            L1f:
                boolean r3 = r6 instanceof java.lang.Error
                boolean r4 = r5.f27479s
                r0 = r0 ^ r1
                r0 = r0 & r4
                r0 = r0 & r2
                r0 = r0 | r3
                if (r0 == 0) goto L39
                if (r3 == 0) goto L2e
                java.lang.String r0 = "Input Future failed with Error"
                goto L30
            L2e:
                java.lang.String r0 = "Got more than one input Future failure. Logging failures after the first"
            L30:
                java.util.logging.Logger r1 = com.google.common.util.concurrent.ld6.d3()
                java.util.logging.Level r2 = java.util.logging.Level.SEVERE
                r1.log(r2, r0, r6)
            L39:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.ld6.AbstractRunnableC4818k.kja0(java.lang.Throwable):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qrj() {
            int iM17028g = m17028g();
            com.google.common.base.jk.y9n(iM17028g >= 0, "Less than 0 remaining futures");
            if (iM17028g == 0) {
                t8r();
            }
        }

        private void t8r() {
            if (this.f27478p & (!this.f27479s)) {
                int i2 = 0;
                ab<? extends InterfaceFutureC4792c<? extends InputT>> it = this.f27480y.iterator();
                while (it.hasNext()) {
                    m16970h(i2, it.next());
                    i2++;
                }
            }
            n7h();
        }

        @ForOverride
        @OverridingMethodsMustInvokeSuper
        /* JADX INFO: renamed from: i */
        void mo16933i() {
            this.f27480y = null;
        }

        void ki() {
        }

        @Override // com.google.common.util.concurrent.x2
        /* JADX INFO: renamed from: n */
        final void mo16974n(Set<Throwable> set) {
            if (ld6.this.isCancelled()) {
                return;
            }
            ld6.eqxt(set, ld6.this.mo16950k());
        }

        abstract void n7h();

        @Override // java.lang.Runnable
        public final void run() {
            qrj();
        }

        abstract void x2(boolean z2, int i2, @NullableDecl InputT inputt);
    }

    ld6() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean eqxt(Set<Throwable> set, Throwable th) {
        while (th != null) {
            if (!set.add(th)) {
                return false;
            }
            th = th.getCause();
        }
        return true;
    }

    final void d2ok(ld6<InputT, OutputT>.AbstractRunnableC4818k abstractRunnableC4818k) {
        this.f27476i = abstractRunnableC4818k;
        abstractRunnableC4818k.cdj();
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q
    /* JADX INFO: renamed from: h */
    protected final void mo16921h() {
        super.mo16921h();
        ld6<InputT, OutputT>.AbstractRunnableC4818k abstractRunnableC4818k = this.f27476i;
        if (abstractRunnableC4818k != null) {
            this.f27476i = null;
            z4 z4Var = ((AbstractRunnableC4818k) abstractRunnableC4818k).f27480y;
            boolean zJp0y = jp0y();
            if (zJp0y) {
                abstractRunnableC4818k.ki();
            }
            if (isCancelled() && (z4Var != null)) {
                ab it = z4Var.iterator();
                while (it.hasNext()) {
                    ((InterfaceFutureC4792c) it.next()).cancel(zJp0y);
                }
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q
    protected String o1t() {
        z4 z4Var;
        ld6<InputT, OutputT>.AbstractRunnableC4818k abstractRunnableC4818k = this.f27476i;
        if (abstractRunnableC4818k == null || (z4Var = ((AbstractRunnableC4818k) abstractRunnableC4818k).f27480y) == null) {
            return null;
        }
        return "futures=[" + z4Var + "]";
    }
}
