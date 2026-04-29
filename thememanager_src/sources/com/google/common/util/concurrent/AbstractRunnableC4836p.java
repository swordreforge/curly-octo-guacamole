package com.google.common.util.concurrent;

import com.google.common.util.concurrent.mcp;
import com.google.errorprone.annotations.ForOverride;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.util.concurrent.p */
/* JADX INFO: compiled from: AbstractTransformFuture.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.toq
abstract class AbstractRunnableC4836p<I, O, F, T> extends mcp.AbstractC4821k<O> implements Runnable {

    /* JADX INFO: renamed from: i */
    @NullableDecl
    InterfaceFutureC4792c<? extends I> f27501i;

    /* JADX INFO: renamed from: z */
    @NullableDecl
    F f27502z;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.p$k */
    /* JADX INFO: compiled from: AbstractTransformFuture.java */
    private static final class k<I, O> extends AbstractRunnableC4836p<I, O, n7h<? super I, ? extends O>, InterfaceFutureC4792c<? extends O>> {
        k(InterfaceFutureC4792c<? extends I> interfaceFutureC4792c, n7h<? super I, ? extends O> n7hVar) {
            super(interfaceFutureC4792c, n7hVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractRunnableC4836p
        /* JADX INFO: renamed from: hyr, reason: merged with bridge method [inline-methods] */
        public void mo16993l(InterfaceFutureC4792c<? extends O> interfaceFutureC4792c) {
            a9(interfaceFutureC4792c);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractRunnableC4836p
        /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
        public InterfaceFutureC4792c<? extends O> ncyb(n7h<? super I, ? extends O> n7hVar, @NullableDecl I i2) throws Exception {
            InterfaceFutureC4792c<? extends O> interfaceFutureC4792cApply = n7hVar.apply(i2);
            com.google.common.base.jk.m15369c(interfaceFutureC4792cApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", n7hVar);
            return interfaceFutureC4792cApply;
        }
    }

    /* JADX INFO: renamed from: com.google.common.util.concurrent.p$toq */
    /* JADX INFO: compiled from: AbstractTransformFuture.java */
    private static final class toq<I, O> extends AbstractRunnableC4836p<I, O, com.google.common.base.t8r<? super I, ? extends O>, O> {
        toq(InterfaceFutureC4792c<? extends I> interfaceFutureC4792c, com.google.common.base.t8r<? super I, ? extends O> t8rVar) {
            super(interfaceFutureC4792c, t8rVar);
        }

        @Override // com.google.common.util.concurrent.AbstractRunnableC4836p
        /* JADX INFO: renamed from: l */
        void mo16993l(@NullableDecl O o2) {
            mcp(o2);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.util.concurrent.AbstractRunnableC4836p
        @NullableDecl
        /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
        public O ncyb(com.google.common.base.t8r<? super I, ? extends O> t8rVar, @NullableDecl I i2) {
            return t8rVar.apply(i2);
        }
    }

    AbstractRunnableC4836p(InterfaceFutureC4792c<? extends I> interfaceFutureC4792c, F f2) {
        this.f27501i = (InterfaceFutureC4792c) com.google.common.base.jk.a9(interfaceFutureC4792c);
        this.f27502z = (F) com.google.common.base.jk.a9(f2);
    }

    static <I, O> InterfaceFutureC4792c<O> dd(InterfaceFutureC4792c<I> interfaceFutureC4792c, com.google.common.base.t8r<? super I, ? extends O> t8rVar, Executor executor) {
        com.google.common.base.jk.a9(t8rVar);
        toq toqVar = new toq(interfaceFutureC4792c, t8rVar);
        interfaceFutureC4792c.n7h(toqVar, C4815j.m16953h(executor, toqVar));
        return toqVar;
    }

    static <I, O> InterfaceFutureC4792c<O> x9kr(InterfaceFutureC4792c<I> interfaceFutureC4792c, n7h<? super I, ? extends O> n7hVar, Executor executor) {
        com.google.common.base.jk.a9(executor);
        k kVar = new k(interfaceFutureC4792c, n7hVar);
        interfaceFutureC4792c.n7h(kVar, C4815j.m16953h(executor, kVar));
        return kVar;
    }

    @Override // com.google.common.util.concurrent.AbstractC4837q
    /* JADX INFO: renamed from: h */
    protected final void mo16921h() {
        m17002z(this.f27501i);
        this.f27501i = null;
        this.f27502z = null;
    }

    @ForOverride
    /* JADX INFO: renamed from: l */
    abstract void mo16993l(@NullableDecl T t2);

    @NullableDecl
    @ForOverride
    abstract T ncyb(F f2, @NullableDecl I i2) throws Exception;

    @Override // com.google.common.util.concurrent.AbstractC4837q
    protected String o1t() {
        String str;
        InterfaceFutureC4792c<? extends I> interfaceFutureC4792c = this.f27501i;
        F f2 = this.f27502z;
        String strO1t = super.o1t();
        if (interfaceFutureC4792c != null) {
            str = "inputFuture=[" + interfaceFutureC4792c + "], ";
        } else {
            str = "";
        }
        if (f2 != null) {
            return str + "function=[" + f2 + "]";
        }
        if (strO1t == null) {
            return null;
        }
        return str + strO1t;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        InterfaceFutureC4792c<? extends I> interfaceFutureC4792c = this.f27501i;
        F f2 = this.f27502z;
        if ((isCancelled() | (interfaceFutureC4792c == null)) || (f2 == null)) {
            return;
        }
        this.f27501i = null;
        if (interfaceFutureC4792c.isCancelled()) {
            a9(interfaceFutureC4792c);
            return;
        }
        try {
            try {
                Object objNcyb = ncyb(f2, dd.m16915y(interfaceFutureC4792c));
                this.f27502z = null;
                mo16993l(objNcyb);
            } catch (Throwable th) {
                try {
                    jk(th);
                } finally {
                    this.f27502z = null;
                }
            }
        } catch (Error e2) {
            jk(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e3) {
            jk(e3);
        } catch (ExecutionException e4) {
            jk(e4.getCause());
        }
    }
}
