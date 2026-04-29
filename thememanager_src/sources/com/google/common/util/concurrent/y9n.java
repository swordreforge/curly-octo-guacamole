package com.google.common.util.concurrent;

import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Logger;

/* JADX INFO: compiled from: SequentialExecutor.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
final class y9n implements Executor {

    /* JADX INFO: renamed from: s */
    private static final Logger f27598s = Logger.getLogger(y9n.class.getName());

    /* JADX INFO: renamed from: k */
    private final Executor f27600k;

    /* JADX INFO: renamed from: q */
    @GuardedBy("queue")
    private final Deque<Runnable> f27602q = new ArrayDeque();

    /* JADX INFO: renamed from: n */
    @GuardedBy("queue")
    private zy f27601n = zy.IDLE;

    /* JADX INFO: renamed from: g */
    @GuardedBy("queue")
    private long f27599g = 0;

    /* JADX INFO: renamed from: y */
    private final toq f27603y = new toq(this, null);

    /* JADX INFO: renamed from: com.google.common.util.concurrent.y9n$k */
    /* JADX INFO: compiled from: SequentialExecutor.java */
    class RunnableC4855k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Runnable f27604k;

        RunnableC4855k(Runnable runnable) {
            this.f27604k = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f27604k.run();
        }
    }

    /* JADX INFO: compiled from: SequentialExecutor.java */
    private final class toq implements Runnable {
        private toq() {
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004a, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0050, code lost:
        
            r1 = r1 | java.lang.Thread.interrupted();
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
        
            r3.run();
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0055, code lost:
        
            r2 = move-exception;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0056, code lost:
        
            com.google.common.util.concurrent.y9n.f27598s.log(java.util.logging.Level.SEVERE, "Exception while executing runnable " + r3, (java.lang.Throwable) r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:?, code lost:
        
            return;
         */
        /* JADX INFO: renamed from: k */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void m17052k() {
            /*
                r8 = this;
                r0 = 0
                r1 = r0
            L2:
                com.google.common.util.concurrent.y9n r2 = com.google.common.util.concurrent.y9n.this     // Catch: java.lang.Throwable -> L74
                java.util.Deque r2 = com.google.common.util.concurrent.y9n.m17049k(r2)     // Catch: java.lang.Throwable -> L74
                monitor-enter(r2)     // Catch: java.lang.Throwable -> L74
                if (r0 != 0) goto L2b
                com.google.common.util.concurrent.y9n r0 = com.google.common.util.concurrent.y9n.this     // Catch: java.lang.Throwable -> L71
                com.google.common.util.concurrent.y9n$zy r0 = com.google.common.util.concurrent.y9n.toq(r0)     // Catch: java.lang.Throwable -> L71
                com.google.common.util.concurrent.y9n$zy r3 = com.google.common.util.concurrent.y9n.zy.RUNNING     // Catch: java.lang.Throwable -> L71
                if (r0 != r3) goto L20
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L71
                if (r1 == 0) goto L1f
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L1f:
                return
            L20:
                com.google.common.util.concurrent.y9n r0 = com.google.common.util.concurrent.y9n.this     // Catch: java.lang.Throwable -> L71
                com.google.common.util.concurrent.y9n.m17051q(r0)     // Catch: java.lang.Throwable -> L71
                com.google.common.util.concurrent.y9n r0 = com.google.common.util.concurrent.y9n.this     // Catch: java.lang.Throwable -> L71
                com.google.common.util.concurrent.y9n.zy(r0, r3)     // Catch: java.lang.Throwable -> L71
                r0 = 1
            L2b:
                com.google.common.util.concurrent.y9n r3 = com.google.common.util.concurrent.y9n.this     // Catch: java.lang.Throwable -> L71
                java.util.Deque r3 = com.google.common.util.concurrent.y9n.m17049k(r3)     // Catch: java.lang.Throwable -> L71
                java.lang.Object r3 = r3.poll()     // Catch: java.lang.Throwable -> L71
                java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L71
                if (r3 != 0) goto L4b
                com.google.common.util.concurrent.y9n r0 = com.google.common.util.concurrent.y9n.this     // Catch: java.lang.Throwable -> L71
                com.google.common.util.concurrent.y9n$zy r3 = com.google.common.util.concurrent.y9n.zy.IDLE     // Catch: java.lang.Throwable -> L71
                com.google.common.util.concurrent.y9n.zy(r0, r3)     // Catch: java.lang.Throwable -> L71
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L71
                if (r1 == 0) goto L4a
                java.lang.Thread r0 = java.lang.Thread.currentThread()
                r0.interrupt()
            L4a:
                return
            L4b:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L71
                boolean r2 = java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L74
                r1 = r1 | r2
                r3.run()     // Catch: java.lang.RuntimeException -> L55 java.lang.Throwable -> L74
                goto L2
            L55:
                r2 = move-exception
                java.util.logging.Logger r4 = com.google.common.util.concurrent.y9n.m17050n()     // Catch: java.lang.Throwable -> L74
                java.util.logging.Level r5 = java.util.logging.Level.SEVERE     // Catch: java.lang.Throwable -> L74
                java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L74
                r6.<init>()     // Catch: java.lang.Throwable -> L74
                java.lang.String r7 = "Exception while executing runnable "
                r6.append(r7)     // Catch: java.lang.Throwable -> L74
                r6.append(r3)     // Catch: java.lang.Throwable -> L74
                java.lang.String r3 = r6.toString()     // Catch: java.lang.Throwable -> L74
                r4.log(r5, r3, r2)     // Catch: java.lang.Throwable -> L74
                goto L2
            L71:
                r0 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L71
                throw r0     // Catch: java.lang.Throwable -> L74
            L74:
                r0 = move-exception
                if (r1 == 0) goto L7e
                java.lang.Thread r1 = java.lang.Thread.currentThread()
                r1.interrupt()
            L7e:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.y9n.toq.m17052k():void");
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                m17052k();
            } catch (Error e2) {
                synchronized (y9n.this.f27602q) {
                    y9n.this.f27601n = zy.IDLE;
                    throw e2;
                }
            }
        }

        /* synthetic */ toq(y9n y9nVar, RunnableC4855k runnableC4855k) {
            this();
        }
    }

    /* JADX INFO: compiled from: SequentialExecutor.java */
    enum zy {
        IDLE,
        QUEUING,
        QUEUED,
        RUNNING
    }

    y9n(Executor executor) {
        this.f27600k = (Executor) com.google.common.base.jk.a9(executor);
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ long m17051q(y9n y9nVar) {
        long j2 = y9nVar.f27599g;
        y9nVar.f27599g = 1 + j2;
        return j2;
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        zy zyVar;
        com.google.common.base.jk.a9(runnable);
        synchronized (this.f27602q) {
            zy zyVar2 = this.f27601n;
            if (zyVar2 != zy.RUNNING && zyVar2 != (zyVar = zy.QUEUED)) {
                long j2 = this.f27599g;
                RunnableC4855k runnableC4855k = new RunnableC4855k(runnable);
                this.f27602q.add(runnableC4855k);
                zy zyVar3 = zy.QUEUING;
                this.f27601n = zyVar3;
                try {
                    this.f27600k.execute(this.f27603y);
                    if (this.f27601n != zyVar3) {
                        return;
                    }
                    synchronized (this.f27602q) {
                        if (this.f27599g == j2 && this.f27601n == zyVar3) {
                            this.f27601n = zyVar;
                        }
                    }
                    return;
                } catch (Error | RuntimeException e2) {
                    synchronized (this.f27602q) {
                        zy zyVar4 = this.f27601n;
                        if ((zyVar4 != zy.IDLE && zyVar4 != zy.QUEUING) || !this.f27602q.removeLastOccurrence(runnableC4855k)) {
                            z = false;
                        }
                        if (!(e2 instanceof RejectedExecutionException) || z) {
                            throw e2;
                        }
                    }
                    return;
                }
            }
            this.f27602q.add(runnable);
        }
    }
}
