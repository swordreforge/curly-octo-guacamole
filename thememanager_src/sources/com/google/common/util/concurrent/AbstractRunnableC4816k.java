package com.google.common.util.concurrent;

import com.google.common.util.concurrent.mcp;
import com.google.errorprone.annotations.ForOverride;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.util.concurrent.k */
/* JADX INFO: compiled from: AbstractCatchingFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
abstract class AbstractRunnableC4816k<V, X extends Throwable, F, T> extends mcp.AbstractC4821k<V> implements Runnable {

    /* JADX INFO: renamed from: i */
    @NullableDecl
    InterfaceFutureC4792c<? extends V> f27471i;

    /* JADX INFO: renamed from: t */
    @NullableDecl
    F f27472t;

    /* JADX INFO: renamed from: z */
    @NullableDecl
    Class<X> f27473z;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.k$k */
    /* JADX INFO: compiled from: AbstractCatchingFuture.java */
    private static final class k<V, X extends Throwable> extends AbstractRunnableC4816k<V, X, n7h<? super X, ? extends V>, InterfaceFutureC4792c<? extends V>> {
        k(InterfaceFutureC4792c<? extends V> interfaceFutureC4792c, Class<X> cls, n7h<? super X, ? extends V> n7hVar) {
            super(interfaceFutureC4792c, cls, n7hVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractRunnableC4816k
        /* JADX INFO: renamed from: hyr, reason: merged with bridge method [inline-methods] */
        public void mo16967l(InterfaceFutureC4792c<? extends V> interfaceFutureC4792c) {
            a9(interfaceFutureC4792c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractRunnableC4816k
        /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
        public InterfaceFutureC4792c<? extends V> ncyb(n7h<? super X, ? extends V> n7hVar, X x3) throws Exception {
            InterfaceFutureC4792c<? extends V> interfaceFutureC4792cApply = n7hVar.apply(x3);
            com.google.common.base.jk.m15369c(interfaceFutureC4792cApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", n7hVar);
            return interfaceFutureC4792cApply;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.k$toq */
    /* JADX INFO: compiled from: AbstractCatchingFuture.java */
    private static final class toq<V, X extends Throwable> extends AbstractRunnableC4816k<V, X, com.google.common.base.t8r<? super X, ? extends V>, V> {
        toq(InterfaceFutureC4792c<? extends V> interfaceFutureC4792c, Class<X> cls, com.google.common.base.t8r<? super X, ? extends V> t8rVar) {
            super(interfaceFutureC4792c, cls, t8rVar);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC4816k
        /* JADX INFO: renamed from: l */
        void mo16967l(@NullableDecl V v2) {
            mcp(v2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractRunnableC4816k
        @NullableDecl
        /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
        public V ncyb(com.google.common.base.t8r<? super X, ? extends V> t8rVar, X x3) throws Exception {
            return t8rVar.apply(x3);
        }
    }

    AbstractRunnableC4816k(InterfaceFutureC4792c<? extends V> interfaceFutureC4792c, Class<X> cls, F f2) {
        this.f27471i = (InterfaceFutureC4792c) com.google.common.base.jk.a9(interfaceFutureC4792c);
        this.f27473z = (Class) com.google.common.base.jk.a9(cls);
        this.f27472t = (F) com.google.common.base.jk.a9(f2);
    }

    static <V, X extends Throwable> InterfaceFutureC4792c<V> dd(InterfaceFutureC4792c<? extends V> interfaceFutureC4792c, Class<X> cls, com.google.common.base.t8r<? super X, ? extends V> t8rVar, Executor executor) {
        toq toqVar = new toq(interfaceFutureC4792c, cls, t8rVar);
        interfaceFutureC4792c.n7h(toqVar, C4815j.m16953h(executor, toqVar));
        return toqVar;
    }

    static <X extends Throwable, V> InterfaceFutureC4792c<V> x9kr(InterfaceFutureC4792c<? extends V> interfaceFutureC4792c, Class<X> cls, n7h<? super X, ? extends V> n7hVar, Executor executor) {
        k kVar = new k(interfaceFutureC4792c, cls, n7hVar);
        interfaceFutureC4792c.n7h(kVar, C4815j.m16953h(executor, kVar));
        return kVar;
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q
    /* JADX INFO: renamed from: h */
    protected final void mo16921h() {
        m17002z(this.f27471i);
        this.f27471i = null;
        this.f27473z = null;
        this.f27472t = null;
    }

    @ForOverride
    /* JADX INFO: renamed from: l */
    abstract void mo16967l(@NullableDecl T t2);

    @NullableDecl
    @ForOverride
    abstract T ncyb(F f2, X x3) throws Exception;

    @Override // com.google.common.util.concurrent.AbstractC4837q
    protected String o1t() {
        String str;
        InterfaceFutureC4792c<? extends V> interfaceFutureC4792c = this.f27471i;
        Class<X> cls = this.f27473z;
        F f2 = this.f27472t;
        String strO1t = super.o1t();
        if (interfaceFutureC4792c != null) {
            str = "inputFuture=[" + interfaceFutureC4792c + "], ";
        } else {
            str = "";
        }
        if (cls == null || f2 == null) {
            if (strO1t == null) {
                return null;
            }
            return str + strO1t;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + f2 + "]";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [F, java.lang.Class<X extends java.lang.Throwable>] */
    @Override // java.lang.Runnable
    public final void run() throws ExecutionException {
        Object objM16915y;
        InterfaceFutureC4792c<? extends V> interfaceFutureC4792c = this.f27471i;
        Class<X> cls = this.f27473z;
        F f2 = this.f27472t;
        if (((f2 == null) | (interfaceFutureC4792c == null) | (cls == null)) || isCancelled()) {
            return;
        }
        ?? r3 = (Class<X>) null;
        this.f27471i = null;
        try {
            objM16915y = dd.m16915y(interfaceFutureC4792c);
            th = null;
        } catch (ExecutionException e2) {
            th = (Throwable) com.google.common.base.jk.a9(e2.getCause());
            objM16915y = null;
        } catch (Throwable th) {
            th = th;
            objM16915y = null;
        }
        if (th == null) {
            mcp(objM16915y);
            return;
        }
        if (!C4820m.m16978k(th, cls)) {
            a9(interfaceFutureC4792c);
            return;
        }
        try {
            Object objNcyb = ncyb(f2, th);
            this.f27473z = null;
            this.f27472t = null;
            mo16967l(objNcyb);
        } catch (Throwable th2) {
            try {
                jk(th2);
            } finally {
                this.f27473z = null;
                this.f27472t = null;
            }
        }
    }
}
