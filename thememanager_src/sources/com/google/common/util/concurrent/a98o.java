package com.google.common.util.concurrent;

import com.google.common.collect.g0ad;
import com.google.common.collect.r25n;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: SimpleTimeLimiter.java */
/* JADX INFO: loaded from: classes3.dex */
@InterfaceC7731k
@wlev.zy
public final class a98o implements nmn5 {

    /* JADX INFO: renamed from: k */
    private final ExecutorService f27366k;

    /* JADX INFO: renamed from: com.google.common.util.concurrent.a98o$k */
    /* JADX INFO: compiled from: SimpleTimeLimiter.java */
    class C4784k implements InvocationHandler {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Object f27367k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Set f27369q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final /* synthetic */ long f68615toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final /* synthetic */ TimeUnit f68616zy;

        /* JADX INFO: renamed from: com.google.common.util.concurrent.a98o$k$k */
        /* JADX INFO: compiled from: SimpleTimeLimiter.java */
        class k implements Callable<Object> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Method f27370k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ Object[] f27372q;

            k(Method method, Object[] objArr) {
                this.f27370k = method;
                this.f27372q = objArr;
            }

            @Override // java.util.concurrent.Callable
            public Object call() throws Exception {
                try {
                    return this.f27370k.invoke(C4784k.this.f27367k, this.f27372q);
                } catch (InvocationTargetException e2) {
                    throw a98o.n7h(e2, false);
                }
            }
        }

        C4784k(Object obj, long j2, TimeUnit timeUnit, Set set) {
            this.f27367k = obj;
            this.f68615toq = j2;
            this.f68616zy = timeUnit;
            this.f27369q = set;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) throws Throwable {
            return a98o.this.m16861y(new k(method, objArr), this.f68615toq, this.f68616zy, this.f27369q.contains(method));
        }
    }

    private a98o(ExecutorService executorService) {
        this.f27366k = (ExecutorService) com.google.common.base.jk.a9(executorService);
    }

    /* JADX INFO: renamed from: h */
    private void m16858h(Throwable th) {
        if (!(th instanceof Error)) {
            throw new bo(th);
        }
        throw new C4857z((Error) th);
    }

    private void kja0(Throwable th) throws ExecutionException {
        if (th instanceof Error) {
            throw new C4857z((Error) th);
        }
        if (!(th instanceof RuntimeException)) {
            throw new ExecutionException(th);
        }
        throw new bo(th);
    }

    private static boolean ld6(Method method) {
        for (Class<?> cls : method.getExceptionTypes()) {
            if (cls == InterruptedException.class) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Exception n7h(Exception exc, boolean z2) throws Exception {
        Throwable cause = exc.getCause();
        if (cause == null) {
            throw exc;
        }
        if (z2) {
            cause.setStackTrace((StackTraceElement[]) r25n.m15972g(cause.getStackTrace(), exc.getStackTrace(), StackTraceElement.class));
        }
        if (cause instanceof Exception) {
            throw ((Exception) cause);
        }
        if (cause instanceof Error) {
            throw ((Error) cause);
        }
        throw exc;
    }

    /* JADX INFO: renamed from: p */
    public static a98o m16859p(ExecutorService executorService) {
        return new a98o(executorService);
    }

    private static <T> T qrj(Class<T> cls, InvocationHandler invocationHandler) {
        return cls.cast(Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, invocationHandler));
    }

    /* JADX INFO: renamed from: s */
    private static void m16860s(long j2) {
        com.google.common.base.jk.m15374h(j2 > 0, "timeout must be positive: %s", j2);
    }

    private static Set<Method> x2(Class<?> cls) {
        HashSet hashSetFn3e = g0ad.fn3e();
        for (Method method : cls.getMethods()) {
            if (ld6(method)) {
                hashSetFn3e.add(method);
            }
        }
        return hashSetFn3e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public <T> T m16861y(Callable<T> callable, long j2, TimeUnit timeUnit, boolean z2) throws Exception {
        com.google.common.base.jk.a9(callable);
        com.google.common.base.jk.a9(timeUnit);
        m16860s(j2);
        Future<T> futureSubmit = this.f27366k.submit(callable);
        try {
            if (!z2) {
                return (T) c8jq.m16893n(futureSubmit, j2, timeUnit);
            }
            try {
                return futureSubmit.get(j2, timeUnit);
            } catch (InterruptedException e2) {
                futureSubmit.cancel(true);
                throw e2;
            }
        } catch (ExecutionException e3) {
            throw n7h(e3, true);
        } catch (TimeoutException e4) {
            futureSubmit.cancel(true);
            throw new y2(e4);
        }
    }

    @Override // com.google.common.util.concurrent.nmn5
    /* JADX INFO: renamed from: k */
    public void mo16862k(Runnable runnable, long j2, TimeUnit timeUnit) throws Throwable {
        com.google.common.base.jk.a9(runnable);
        com.google.common.base.jk.a9(timeUnit);
        m16860s(j2);
        Future<?> futureSubmit = this.f27366k.submit(runnable);
        try {
            futureSubmit.get(j2, timeUnit);
        } catch (InterruptedException e2) {
            e = e2;
            futureSubmit.cancel(true);
            throw e;
        } catch (ExecutionException e3) {
            m16858h(e3.getCause());
            throw new AssertionError();
        } catch (TimeoutException e4) {
            e = e4;
            futureSubmit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.nmn5
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    public <T> T mo16863n(Callable<T> callable, long j2, TimeUnit timeUnit) throws Throwable {
        com.google.common.base.jk.a9(callable);
        com.google.common.base.jk.a9(timeUnit);
        m16860s(j2);
        Future<T> futureSubmit = this.f27366k.submit(callable);
        try {
            return futureSubmit.get(j2, timeUnit);
        } catch (InterruptedException e2) {
            e = e2;
            futureSubmit.cancel(true);
            throw e;
        } catch (ExecutionException e3) {
            kja0(e3.getCause());
            throw new AssertionError();
        } catch (TimeoutException e4) {
            e = e4;
            futureSubmit.cancel(true);
            throw e;
        }
    }

    @Override // com.google.common.util.concurrent.nmn5
    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: q */
    public <T> T mo16864q(Callable<T> callable, long j2, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        com.google.common.base.jk.a9(callable);
        com.google.common.base.jk.a9(timeUnit);
        m16860s(j2);
        Future<T> futureSubmit = this.f27366k.submit(callable);
        try {
            return (T) c8jq.m16893n(futureSubmit, j2, timeUnit);
        } catch (ExecutionException e2) {
            kja0(e2.getCause());
            throw new AssertionError();
        } catch (TimeoutException e3) {
            futureSubmit.cancel(true);
            throw e3;
        }
    }

    @Override // com.google.common.util.concurrent.nmn5
    public <T> T toq(T t2, Class<T> cls, long j2, TimeUnit timeUnit) {
        com.google.common.base.jk.a9(t2);
        com.google.common.base.jk.a9(cls);
        com.google.common.base.jk.a9(timeUnit);
        m16860s(j2);
        com.google.common.base.jk.m15380n(cls.isInterface(), "interfaceType must be an interface type");
        return (T) qrj(cls, new C4784k(t2, j2, timeUnit, x2(cls)));
    }

    @Override // com.google.common.util.concurrent.nmn5
    public void zy(Runnable runnable, long j2, TimeUnit timeUnit) throws TimeoutException {
        com.google.common.base.jk.a9(runnable);
        com.google.common.base.jk.a9(timeUnit);
        m16860s(j2);
        Future<?> futureSubmit = this.f27366k.submit(runnable);
        try {
            c8jq.m16893n(futureSubmit, j2, timeUnit);
        } catch (ExecutionException e2) {
            m16858h(e2.getCause());
            throw new AssertionError();
        } catch (TimeoutException e3) {
            futureSubmit.cancel(true);
            throw e3;
        }
    }
}
