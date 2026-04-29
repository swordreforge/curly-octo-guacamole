package com.google.common.util.concurrent;

import com.google.common.util.concurrent.AbstractC4837q;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ImmediateFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq(emulated = true)
abstract class n5r1<V> implements InterfaceFutureC4792c<V> {

    /* JADX INFO: renamed from: k */
    private static final Logger f27488k = Logger.getLogger(n5r1.class.getName());

    /* JADX INFO: renamed from: com.google.common.util.concurrent.n5r1$k */
    /* JADX INFO: compiled from: ImmediateFuture.java */
    static final class C4823k<V> extends AbstractC4837q.p<V> {
        C4823k() {
            cancel(false);
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.n5r1$n */
    /* JADX INFO: compiled from: ImmediateFuture.java */
    static class C4824n<V> extends n5r1<V> {

        /* JADX INFO: renamed from: n */
        static final C4824n<Object> f27489n = new C4824n<>(null);

        /* JADX INFO: renamed from: q */
        @NullableDecl
        private final V f27490q;

        C4824n(@NullableDecl V v2) {
            this.f27490q = v2;
        }

        @Override // com.google.common.util.concurrent.n5r1, java.util.concurrent.Future
        public V get() {
            return this.f27490q;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f27490q + "]]";
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.n5r1$q */
    /* JADX INFO: compiled from: ImmediateFuture.java */
    @wlev.zy
    static class C4825q<V, X extends Exception> extends n5r1<V> implements InterfaceC4813i<V, X> {

        /* JADX INFO: renamed from: q */
        @NullableDecl
        private final V f27491q;

        C4825q(@NullableDecl V v2) {
            this.f27491q = v2;
        }

        @Override // com.google.common.util.concurrent.InterfaceC4813i
        public V f7l8(long j2, TimeUnit timeUnit) {
            com.google.common.base.jk.a9(timeUnit);
            return this.f27491q;
        }

        @Override // com.google.common.util.concurrent.n5r1, java.util.concurrent.Future
        public V get() {
            return this.f27491q;
        }

        public String toString() {
            return super.toString() + "[status=SUCCESS, result=[" + this.f27491q + "]]";
        }

        @Override // com.google.common.util.concurrent.InterfaceC4813i
        public V zy() {
            return this.f27491q;
        }
    }

    /* JADX INFO: compiled from: ImmediateFuture.java */
    @wlev.zy
    static class toq<V, X extends Exception> extends n5r1<V> implements InterfaceC4813i<V, X> {

        /* JADX INFO: renamed from: q */
        private final X f27492q;

        toq(X x3) {
            this.f27492q = x3;
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Exception */
        @Override // com.google.common.util.concurrent.InterfaceC4813i
        public V f7l8(long j2, TimeUnit timeUnit) throws Exception {
            com.google.common.base.jk.a9(timeUnit);
            throw this.f27492q;
        }

        @Override // com.google.common.util.concurrent.n5r1, java.util.concurrent.Future
        public V get() throws ExecutionException {
            throw new ExecutionException(this.f27492q);
        }

        public String toString() {
            return super.toString() + "[status=FAILURE, cause=[" + this.f27492q + "]]";
        }

        /* JADX INFO: Thrown type has an unknown type hierarchy: X extends java.lang.Exception */
        @Override // com.google.common.util.concurrent.InterfaceC4813i
        public V zy() throws Exception {
            throw this.f27492q;
        }
    }

    /* JADX INFO: compiled from: ImmediateFuture.java */
    static final class zy<V> extends AbstractC4837q.p<V> {
        zy(Throwable th) {
            jk(th);
        }
    }

    n5r1() {
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z2) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get() throws ExecutionException;

    @Override // java.util.concurrent.Future
    public V get(long j2, TimeUnit timeUnit) throws ExecutionException {
        com.google.common.base.jk.a9(timeUnit);
        return get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    @Override // com.google.common.util.concurrent.InterfaceFutureC4792c
    public void n7h(Runnable runnable, Executor executor) {
        com.google.common.base.jk.fti(runnable, "Runnable was null.");
        com.google.common.base.jk.fti(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            f27488k.log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e2);
        }
    }
}
