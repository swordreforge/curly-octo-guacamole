package com.google.common.eventbus;

import com.google.common.base.jk;
import com.google.j2objc.annotations.Weak;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.concurrent.Executor;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: Subscriber.java */
/* JADX INFO: loaded from: classes2.dex */
class f7l8 {

    /* JADX INFO: renamed from: k */
    @Weak
    private C4611n f26839k;

    /* JADX INFO: renamed from: q */
    private final Executor f26840q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7732q
    final Object f68254toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Method f68255zy;

    /* JADX INFO: renamed from: com.google.common.eventbus.f7l8$k */
    /* JADX INFO: compiled from: Subscriber.java */
    class RunnableC4608k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object f26841k;

        RunnableC4608k(Object obj) {
            this.f26841k = obj;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                f7l8.this.mo16163g(this.f26841k);
            } catch (InvocationTargetException e2) {
                f7l8.this.f26839k.toq(e2.getCause(), f7l8.this.zy(this.f26841k));
            }
        }
    }

    /* JADX INFO: compiled from: Subscriber.java */
    @InterfaceC7732q
    static final class toq extends f7l8 {
        /* synthetic */ toq(C4611n c4611n, Object obj, Method method, RunnableC4608k runnableC4608k) {
            this(c4611n, obj, method);
        }

        @Override // com.google.common.eventbus.f7l8
        /* JADX INFO: renamed from: g */
        void mo16163g(Object obj) throws InvocationTargetException {
            synchronized (this) {
                super.mo16163g(obj);
            }
        }

        private toq(C4611n c4611n, Object obj, Method method) {
            super(c4611n, obj, method, null);
        }
    }

    /* synthetic */ f7l8(C4611n c4611n, Object obj, Method method, RunnableC4608k runnableC4608k) {
        this(c4611n, obj, method);
    }

    private static boolean f7l8(Method method) {
        return method.getAnnotation(InterfaceC4610k.class) != null;
    }

    /* JADX INFO: renamed from: q */
    static f7l8 m16162q(C4611n c4611n, Object obj, Method method) {
        return f7l8(method) ? new f7l8(c4611n, obj, method) : new toq(c4611n, obj, method, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C4615y zy(Object obj) {
        return new C4615y(this.f26839k, obj, this.f68254toq, this.f68255zy);
    }

    public final boolean equals(@NullableDecl Object obj) {
        if (!(obj instanceof f7l8)) {
            return false;
        }
        f7l8 f7l8Var = (f7l8) obj;
        return this.f68254toq == f7l8Var.f68254toq && this.f68255zy.equals(f7l8Var.f68255zy);
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: g */
    void mo16163g(Object obj) throws InvocationTargetException {
        try {
            this.f68255zy.invoke(this.f68254toq, jk.a9(obj));
        } catch (IllegalAccessException e2) {
            throw new Error("Method became inaccessible: " + obj, e2);
        } catch (IllegalArgumentException e3) {
            throw new Error("Method rejected target/argument: " + obj, e3);
        } catch (InvocationTargetException e4) {
            if (!(e4.getCause() instanceof Error)) {
                throw e4;
            }
            throw ((Error) e4.getCause());
        }
    }

    public final int hashCode() {
        return ((this.f68255zy.hashCode() + 31) * 31) + System.identityHashCode(this.f68254toq);
    }

    /* JADX INFO: renamed from: n */
    final void m16164n(Object obj) {
        this.f26840q.execute(new RunnableC4608k(obj));
    }

    private f7l8(C4611n c4611n, Object obj, Method method) {
        this.f26839k = c4611n;
        this.f68254toq = jk.a9(obj);
        this.f68255zy = method;
        method.setAccessible(true);
        this.f26840q = c4611n.m16166k();
    }
}
