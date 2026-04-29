package com.google.common.util.concurrent;

import com.google.common.collect.kx3;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: FuturesGetChecked.java */
/* JADX INFO: loaded from: classes3.dex */
@wlev.zy
final class x9kr {

    /* JADX INFO: renamed from: k */
    private static final kx3<Constructor<?>> f27574k = kx3.natural().onResultOf(new C4852k()).reverse();

    /* JADX INFO: renamed from: com.google.common.util.concurrent.x9kr$k */
    /* JADX INFO: compiled from: FuturesGetChecked.java */
    static class C4852k implements com.google.common.base.t8r<Constructor<?>, Boolean> {
        C4852k() {
        }

        @Override // com.google.common.base.t8r
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Boolean apply(Constructor<?> constructor) {
            return Boolean.valueOf(Arrays.asList(constructor.getParameterTypes()).contains(String.class));
        }
    }

    /* JADX INFO: compiled from: FuturesGetChecked.java */
    @InterfaceC7732q
    interface toq {
        void validateClass(Class<? extends Exception> cls);
    }

    /* JADX INFO: compiled from: FuturesGetChecked.java */
    @InterfaceC7732q
    static class zy {

        /* JADX INFO: renamed from: k */
        static final String f27575k = zy.class.getName() + "$ClassValueValidator";

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final toq f68675toq = m17038k();

        /* JADX INFO: renamed from: com.google.common.util.concurrent.x9kr$zy$k */
        /* JADX INFO: compiled from: FuturesGetChecked.java */
        @IgnoreJRERequirement
        enum EnumC4853k implements toq {
            INSTANCE;


            /* JADX INFO: renamed from: k */
            private static final ClassValue<Boolean> f27576k = new k();

            /* JADX INFO: renamed from: com.google.common.util.concurrent.x9kr$zy$k$k */
            /* JADX INFO: compiled from: FuturesGetChecked.java */
            static class k extends ClassValue<Boolean> {
                k() {
                }

                /* JADX INFO: Access modifiers changed from: protected */
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public Boolean toq(Class<?> cls) {
                    x9kr.toq(cls.asSubclass(Exception.class));
                    return Boolean.TRUE;
                }
            }

            @Override // com.google.common.util.concurrent.x9kr.toq
            public void validateClass(Class<? extends Exception> cls) {
                f27576k.get(cls);
            }
        }

        /* JADX INFO: compiled from: FuturesGetChecked.java */
        enum toq implements toq {
            INSTANCE;


            /* JADX INFO: renamed from: k */
            private static final Set<WeakReference<Class<? extends Exception>>> f27578k = new CopyOnWriteArraySet();

            @Override // com.google.common.util.concurrent.x9kr.toq
            public void validateClass(Class<? extends Exception> cls) {
                Iterator<WeakReference<Class<? extends Exception>>> it = f27578k.iterator();
                while (it.hasNext()) {
                    if (cls.equals(it.next().get())) {
                        return;
                    }
                }
                x9kr.toq(cls);
                Set<WeakReference<Class<? extends Exception>>> set = f27578k;
                if (set.size() > 1000) {
                    set.clear();
                }
                set.add(new WeakReference<>(cls));
            }
        }

        zy() {
        }

        /* JADX INFO: renamed from: k */
        static toq m17038k() {
            try {
                return (toq) Class.forName(f27575k).getEnumConstants()[0];
            } catch (Throwable unused) {
                return x9kr.x2();
            }
        }
    }

    private x9kr() {
    }

    private static boolean f7l8(Class<? extends Exception> cls) {
        try {
            m17033p(cls, new Exception());
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: g */
    static <V, X extends Exception> V m17030g(Future<V> future, Class<X> cls, long j2, TimeUnit timeUnit) throws Exception {
        m17031k().validateClass(cls);
        try {
            return future.get(j2, timeUnit);
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw m17033p(cls, e2);
        } catch (ExecutionException e3) {
            qrj(e3.getCause(), cls);
            throw new AssertionError();
        } catch (TimeoutException e4) {
            throw m17033p(cls, e4);
        }
    }

    /* JADX INFO: renamed from: k */
    private static toq m17031k() {
        return zy.f68675toq;
    }

    private static <X extends Exception> List<Constructor<X>> ld6(List<Constructor<X>> list) {
        return (List<Constructor<X>>) f27574k.sortedCopy(list);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: n */
    static <V, X extends Exception> V m17032n(Future<V> future, Class<X> cls) throws Exception {
        return (V) m17034q(m17031k(), future, cls);
    }

    /* JADX INFO: renamed from: p */
    private static <X extends Exception> X m17033p(Class<X> cls, Throwable th) {
        Iterator it = ld6(Arrays.asList(cls.getConstructors())).iterator();
        while (it.hasNext()) {
            X x3 = (X) m17035s((Constructor) it.next(), th);
            if (x3 != null) {
                if (x3.getCause() == null) {
                    x3.initCause(th);
                }
                return x3;
            }
        }
        throw new IllegalArgumentException("No appropriate constructor for exception of type " + cls + " in response to chained exception", th);
    }

    @CanIgnoreReturnValue
    @InterfaceC7732q
    /* JADX INFO: renamed from: q */
    static <V, X extends Exception> V m17034q(toq toqVar, Future<V> future, Class<X> cls) throws Exception {
        toqVar.validateClass(cls);
        try {
            return future.get();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
            throw m17033p(cls, e2);
        } catch (ExecutionException e3) {
            qrj(e3.getCause(), cls);
            throw new AssertionError();
        }
    }

    private static <X extends Exception> void qrj(Throwable th, Class<X> cls) throws Exception {
        if (th instanceof Error) {
            throw new C4857z((Error) th);
        }
        if (!(th instanceof RuntimeException)) {
            throw m17033p(cls, th);
        }
        throw new bo(th);
    }

    @NullableDecl
    /* JADX INFO: renamed from: s */
    private static <X> X m17035s(Constructor<X> constructor, Throwable th) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        Object[] objArr = new Object[parameterTypes.length];
        for (int i2 = 0; i2 < parameterTypes.length; i2++) {
            Class<?> cls = parameterTypes[i2];
            if (cls.equals(String.class)) {
                objArr[i2] = th.toString();
            } else {
                if (!cls.equals(Throwable.class)) {
                    return null;
                }
                objArr[i2] = th;
            }
        }
        try {
            return constructor.newInstance(objArr);
        } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    @InterfaceC7732q
    static void toq(Class<? extends Exception> cls) {
        com.google.common.base.jk.fn3e(m17036y(cls), "Futures.getChecked exception type (%s) must not be a RuntimeException", cls);
        com.google.common.base.jk.fn3e(f7l8(cls), "Futures.getChecked exception type (%s) must be an accessible class with an accessible constructor whose parameters (if any) must be of type String and/or Throwable", cls);
    }

    @InterfaceC7732q
    static toq x2() {
        return zy.toq.INSTANCE;
    }

    @InterfaceC7732q
    /* JADX INFO: renamed from: y */
    static boolean m17036y(Class<? extends Exception> cls) {
        return !RuntimeException.class.isAssignableFrom(cls);
    }

    @InterfaceC7732q
    static toq zy() {
        return zy.EnumC4853k.INSTANCE;
    }
}
