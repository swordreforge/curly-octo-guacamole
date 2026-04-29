package com.google.common.util.concurrent;

import com.google.common.collect.u38j;
import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: ListenerCallQueue.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
final class vyq<L> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final Logger f68670toq = Logger.getLogger(vyq.class.getName());

    /* JADX INFO: renamed from: k */
    private final List<toq<L>> f27550k = Collections.synchronizedList(new ArrayList());

    /* JADX INFO: renamed from: com.google.common.util.concurrent.vyq$k */
    /* JADX INFO: compiled from: ListenerCallQueue.java */
    interface InterfaceC4845k<L> {
        /* JADX INFO: renamed from: k */
        void mo16889k(L l2);
    }

    /* JADX INFO: compiled from: ListenerCallQueue.java */
    private static final class toq<L> implements Runnable {

        /* JADX INFO: renamed from: k */
        final L f27552k;

        /* JADX INFO: renamed from: q */
        final Executor f27554q;

        /* JADX INFO: renamed from: y */
        @GuardedBy("this")
        boolean f27555y;

        /* JADX INFO: renamed from: n */
        @GuardedBy("this")
        final Queue<InterfaceC4845k<L>> f27553n = u38j.m15993q();

        /* JADX INFO: renamed from: g */
        @GuardedBy("this")
        final Queue<Object> f27551g = u38j.m15993q();

        toq(L l2, Executor executor) {
            this.f27552k = (L) com.google.common.base.jk.a9(l2);
            this.f27554q = (Executor) com.google.common.base.jk.a9(executor);
        }

        /* JADX INFO: renamed from: k */
        synchronized void m17023k(InterfaceC4845k<L> interfaceC4845k, Object obj) {
            this.f27553n.add(interfaceC4845k);
            this.f27551g.add(obj);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        
            r2.mo16889k(r9.f27552k);
         */
        /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            com.google.common.util.concurrent.vyq.f68670toq.log(java.util.logging.Level.SEVERE, "Exception while executing callback: " + r9.f27552k + " " + r3, (java.lang.Throwable) r2);
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x005c  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                r9 = this;
            L0:
                r0 = 0
                r1 = 1
                monitor-enter(r9)     // Catch: java.lang.Throwable -> L59
                boolean r2 = r9.f27555y     // Catch: java.lang.Throwable -> L4c
                com.google.common.base.jk.yz(r2)     // Catch: java.lang.Throwable -> L4c
                java.util.Queue<com.google.common.util.concurrent.vyq$k<L>> r2 = r9.f27553n     // Catch: java.lang.Throwable -> L4c
                java.lang.Object r2 = r2.poll()     // Catch: java.lang.Throwable -> L4c
                com.google.common.util.concurrent.vyq$k r2 = (com.google.common.util.concurrent.vyq.InterfaceC4845k) r2     // Catch: java.lang.Throwable -> L4c
                java.util.Queue<java.lang.Object> r3 = r9.f27551g     // Catch: java.lang.Throwable -> L4c
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L4c
                if (r2 != 0) goto L1f
                r9.f27555y = r0     // Catch: java.lang.Throwable -> L4c
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L1c
                return
            L1c:
                r1 = move-exception
                r2 = r0
                goto L50
            L1f:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L4c
                L r4 = r9.f27552k     // Catch: java.lang.RuntimeException -> L26 java.lang.Throwable -> L59
                r2.mo16889k(r4)     // Catch: java.lang.RuntimeException -> L26 java.lang.Throwable -> L59
                goto L0
            L26:
                r2 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.vyq.m17020k()     // Catch: java.lang.Throwable -> L59
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L59
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L59
                r6.<init>()     // Catch: java.lang.Throwable -> L59
                java.lang.String r7 = "Exception while executing callback: "
                r6.append(r7)     // Catch: java.lang.Throwable -> L59
                L r7 = r9.f27552k     // Catch: java.lang.Throwable -> L59
                r6.append(r7)     // Catch: java.lang.Throwable -> L59
                java.lang.String r7 = " "
                r6.append(r7)     // Catch: java.lang.Throwable -> L59
                r6.append(r3)     // Catch: java.lang.Throwable -> L59
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L59
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L59
                goto L0
            L4c:
                r2 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
            L50:
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L57
                throw r1     // Catch: java.lang.Throwable -> L52
            L52:
                r1 = move-exception
                r8 = r2
                r2 = r1
                r1 = r8
                goto L5a
            L57:
                r1 = move-exception
                goto L50
            L59:
                r2 = move-exception
            L5a:
                if (r1 == 0) goto L64
                monitor-enter(r9)
                r9.f27555y = r0     // Catch: java.lang.Throwable -> L61
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L61
                goto L64
            L61:
                r0 = move-exception
                monitor-exit(r9)     // Catch: java.lang.Throwable -> L61
                throw r0
            L64:
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.vyq.toq.run():void");
        }

        void toq() {
            boolean z2;
            synchronized (this) {
                z2 = true;
                if (this.f27555y) {
                    z2 = false;
                } else {
                    this.f27555y = true;
                }
            }
            if (z2) {
                try {
                    this.f27554q.execute(this);
                } catch (RuntimeException e2) {
                    synchronized (this) {
                        this.f27555y = false;
                        vyq.f68670toq.log(Level.SEVERE, "Exception while running callbacks for " + this.f27552k + " on " + this.f27554q, (Throwable) e2);
                        throw e2;
                    }
                }
            }
        }
    }

    vyq() {
    }

    /* JADX INFO: renamed from: g */
    private void m17019g(InterfaceC4845k<L> interfaceC4845k, Object obj) {
        com.google.common.base.jk.fti(interfaceC4845k, "event");
        com.google.common.base.jk.fti(obj, "label");
        synchronized (this.f27550k) {
            Iterator<toq<L>> it = this.f27550k.iterator();
            while (it.hasNext()) {
                it.next().m17023k(interfaceC4845k, obj);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m17021n(InterfaceC4845k<L> interfaceC4845k, String str) {
        m17019g(interfaceC4845k, str);
    }

    /* JADX INFO: renamed from: q */
    public void m17022q(InterfaceC4845k<L> interfaceC4845k) {
        m17019g(interfaceC4845k, interfaceC4845k);
    }

    public void toq(L l2, Executor executor) {
        com.google.common.base.jk.fti(l2, "listener");
        com.google.common.base.jk.fti(executor, "executor");
        this.f27550k.add(new toq<>(l2, executor));
    }

    public void zy() {
        for (int i2 = 0; i2 < this.f27550k.size(); i2++) {
            this.f27550k.get(i2).toq();
        }
    }
}
