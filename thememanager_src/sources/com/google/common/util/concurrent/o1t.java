package com.google.common.util.concurrent;

import com.google.errorprone.annotations.concurrent.GuardedBy;
import java.util.concurrent.Executor;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ExecutionList.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
public final class o1t {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final Logger f68641zy = Logger.getLogger(o1t.class.getName());

    /* JADX INFO: renamed from: k */
    @NullableDecl
    @GuardedBy("this")
    private C4834k f27498k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f68642toq;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.o1t$k */
    /* JADX INFO: compiled from: ExecutionList.java */
    private static final class C4834k {

        /* JADX INFO: renamed from: k */
        final Runnable f27499k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final Executor f68643toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @NullableDecl
        C4834k f68644zy;

        C4834k(Runnable runnable, Executor executor, C4834k c4834k) {
            this.f27499k = runnable;
            this.f68643toq = executor;
            this.f68644zy = c4834k;
        }
    }

    private static void zy(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f68641zy.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m16992k(Runnable runnable, Executor executor) {
        com.google.common.base.jk.fti(runnable, "Runnable was null.");
        com.google.common.base.jk.fti(executor, "Executor was null.");
        synchronized (this) {
            if (this.f68642toq) {
                zy(runnable, executor);
            } else {
                this.f27498k = new C4834k(runnable, executor, this.f27498k);
            }
        }
    }

    public void toq() {
        synchronized (this) {
            if (this.f68642toq) {
                return;
            }
            this.f68642toq = true;
            C4834k c4834k = this.f27498k;
            C4834k c4834k2 = null;
            this.f27498k = null;
            while (c4834k != null) {
                C4834k c4834k3 = c4834k.f68644zy;
                c4834k.f68644zy = c4834k2;
                c4834k2 = c4834k;
                c4834k = c4834k3;
            }
            while (c4834k2 != null) {
                zy(c4834k2.f27499k, c4834k2.f68643toq);
                c4834k2 = c4834k2.f68644zy;
            }
        }
    }
}
