package com.google.common.util.concurrent;

import com.google.common.collect.g0ad;
import com.google.j2objc.annotations.ReflectionSupport;
import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: compiled from: AggregateFutureState.java */
/* JADX INFO: loaded from: classes3.dex */
@ReflectionSupport(ReflectionSupport.Level.FULL)
@wlev.toq(emulated = true)
abstract class x2 {

    /* JADX INFO: renamed from: g */
    private static final Logger f27569g = Logger.getLogger(x2.class.getName());

    /* JADX INFO: renamed from: n */
    private static final toq f27570n;

    /* JADX INFO: renamed from: k */
    private volatile Set<Throwable> f27571k = null;

    /* JADX INFO: renamed from: q */
    private volatile int f27572q;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.x2$q */
    /* JADX INFO: compiled from: AggregateFutureState.java */
    private static final class C4851q extends toq {
        private C4851q() {
            super();
        }

        @Override // com.google.common.util.concurrent.x2.toq
        /* JADX INFO: renamed from: k */
        void mo17029k(x2 x2Var, Set<Throwable> set, Set<Throwable> set2) {
            synchronized (x2Var) {
                if (x2Var.f27571k == set) {
                    x2Var.f27571k = set2;
                }
            }
        }

        @Override // com.google.common.util.concurrent.x2.toq
        int toq(x2 x2Var) {
            int i2;
            synchronized (x2Var) {
                x2.m17027q(x2Var);
                i2 = x2Var.f27572q;
            }
            return i2;
        }
    }

    /* JADX INFO: compiled from: AggregateFutureState.java */
    private static abstract class toq {
        private toq() {
        }

        /* JADX INFO: renamed from: k */
        abstract void mo17029k(x2 x2Var, Set<Throwable> set, Set<Throwable> set2);

        abstract int toq(x2 x2Var);
    }

    /* JADX INFO: compiled from: AggregateFutureState.java */
    private static final class zy extends toq {

        /* JADX INFO: renamed from: k */
        final AtomicReferenceFieldUpdater<x2, Set<Throwable>> f27573k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final AtomicIntegerFieldUpdater<x2> f68674toq;

        zy(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
            super();
            this.f27573k = atomicReferenceFieldUpdater;
            this.f68674toq = atomicIntegerFieldUpdater;
        }

        @Override // com.google.common.util.concurrent.x2.toq
        /* JADX INFO: renamed from: k */
        void mo17029k(x2 x2Var, Set<Throwable> set, Set<Throwable> set2) {
            androidx.concurrent.futures.toq.m906k(this.f27573k, x2Var, set, set2);
        }

        @Override // com.google.common.util.concurrent.x2.toq
        int toq(x2 x2Var) {
            return this.f68674toq.decrementAndGet(x2Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        toq c4851q;
        Throwable th = null;
        Object[] objArr = 0;
        try {
            c4851q = new zy(AtomicReferenceFieldUpdater.newUpdater(x2.class, Set.class, "k"), AtomicIntegerFieldUpdater.newUpdater(x2.class, "q"));
        } catch (Throwable th2) {
            c4851q = new C4851q();
            th = th2;
        }
        f27570n = c4851q;
        if (th != null) {
            f27569g.log(Level.SEVERE, "SafeAtomicHelper is broken!", th);
        }
    }

    x2(int i2) {
        this.f27572q = i2;
    }

    /* JADX INFO: renamed from: q */
    static /* synthetic */ int m17027q(x2 x2Var) {
        int i2 = x2Var.f27572q;
        x2Var.f27572q = i2 - 1;
        return i2;
    }

    final Set<Throwable> f7l8() {
        Set<Throwable> set = this.f27571k;
        if (set != null) {
            return set;
        }
        Set<Throwable> setM15690h = g0ad.m15690h();
        mo16974n(setM15690h);
        f27570n.mo17029k(this, null, setM15690h);
        return this.f27571k;
    }

    /* JADX INFO: renamed from: g */
    final int m17028g() {
        return f27570n.toq(this);
    }

    /* JADX INFO: renamed from: n */
    abstract void mo16974n(Set<Throwable> set);
}
