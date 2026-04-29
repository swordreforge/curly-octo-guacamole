package com.google.common.util.concurrent;

import com.google.j2objc.annotations.ReflectionSupport;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.LockSupport;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: InterruptibleTask.java */
/* JADX INFO: loaded from: classes3.dex */
@ReflectionSupport(ReflectionSupport.Level.FULL)
@wlev.toq(emulated = true)
abstract class hyr<T> extends AtomicReference<Runnable> implements Runnable {

    /* JADX INFO: renamed from: g */
    private static final int f27445g = 1000;

    /* JADX INFO: renamed from: k */
    private static final Runnable f27446k;

    /* JADX INFO: renamed from: n */
    private static final Runnable f27447n;

    /* JADX INFO: renamed from: q */
    private static final Runnable f27448q;

    /* JADX INFO: compiled from: InterruptibleTask.java */
    private static final class toq implements Runnable {
        private toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
        }
    }

    static {
        f27446k = new toq();
        f27448q = new toq();
        f27447n = new toq();
    }

    hyr() {
    }

    abstract void afterRanInterruptibly(@NullableDecl T t2, @NullableDecl Throwable th);

    final void interruptTask() {
        Runnable runnable = get();
        if ((runnable instanceof Thread) && compareAndSet(runnable, f27448q)) {
            try {
                ((Thread) runnable).interrupt();
            } finally {
                if (getAndSet(f27446k) == f27447n) {
                    LockSupport.unpark((Thread) runnable);
                }
            }
        }
    }

    abstract boolean isDone();

    @Override // java.lang.Runnable
    public final void run() {
        T tRunInterruptibly;
        Thread threadCurrentThread = Thread.currentThread();
        if (compareAndSet(null, threadCurrentThread)) {
            boolean z2 = !isDone();
            if (z2) {
                try {
                    tRunInterruptibly = runInterruptibly();
                } catch (Throwable th) {
                    if (!compareAndSet(threadCurrentThread, f27446k)) {
                        Runnable runnable = get();
                        boolean z3 = false;
                        int i2 = 0;
                        while (true) {
                            Runnable runnable2 = f27448q;
                            if (runnable != runnable2 && runnable != f27447n) {
                                break;
                            }
                            i2++;
                            if (i2 > 1000) {
                                Runnable runnable3 = f27447n;
                                if (runnable == runnable3 || compareAndSet(runnable2, runnable3)) {
                                    z3 = Thread.interrupted() || z3;
                                    LockSupport.park(this);
                                }
                            } else {
                                Thread.yield();
                            }
                            runnable = get();
                        }
                        if (z3) {
                            threadCurrentThread.interrupt();
                        }
                    }
                    if (z2) {
                        afterRanInterruptibly(null, th);
                        return;
                    }
                    return;
                }
            } else {
                tRunInterruptibly = null;
            }
            if (!compareAndSet(threadCurrentThread, f27446k)) {
                Runnable runnable4 = get();
                boolean z5 = false;
                int i3 = 0;
                while (true) {
                    Runnable runnable5 = f27448q;
                    if (runnable4 != runnable5 && runnable4 != f27447n) {
                        break;
                    }
                    i3++;
                    if (i3 > 1000) {
                        Runnable runnable6 = f27447n;
                        if (runnable4 == runnable6 || compareAndSet(runnable5, runnable6)) {
                            z5 = Thread.interrupted() || z5;
                            LockSupport.park(this);
                        }
                    } else {
                        Thread.yield();
                    }
                    runnable4 = get();
                }
                if (z5) {
                    threadCurrentThread.interrupt();
                }
            }
            if (z2) {
                afterRanInterruptibly(tRunInterruptibly, null);
            }
        }
    }

    abstract T runInterruptibly() throws Exception;

    abstract String toPendingString();

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        String str;
        Runnable runnable = get();
        if (runnable == f27446k) {
            str = "running=[DONE]";
        } else if (runnable == f27448q) {
            str = "running=[INTERRUPTED]";
        } else if (runnable instanceof Thread) {
            str = "running=[RUNNING ON " + ((Thread) runnable).getName() + "]";
        } else {
            str = "running=[NOT STARTED YET]";
        }
        return str + ", " + toPendingString();
    }
}
