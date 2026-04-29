package com.google.common.io;

import com.google.common.base.dd;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Closeable;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: Closer.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
@wlev.zy
public final class n7h implements Closeable {

    /* JADX INFO: renamed from: g */
    private static final zy f27087g;

    /* JADX INFO: renamed from: k */
    @InterfaceC7732q
    final zy f27088k;

    /* JADX INFO: renamed from: n */
    @MonotonicNonNullDecl
    private Throwable f27089n;

    /* JADX INFO: renamed from: q */
    private final Deque<Closeable> f27090q = new ArrayDeque(4);

    /* JADX INFO: renamed from: com.google.common.io.n7h$k */
    /* JADX INFO: compiled from: Closer.java */
    @InterfaceC7732q
    static final class C4698k implements zy {

        /* JADX INFO: renamed from: k */
        static final C4698k f27091k = new C4698k();

        C4698k() {
        }

        @Override // com.google.common.io.n7h.zy
        /* JADX INFO: renamed from: k */
        public void mo16429k(Closeable closeable, Throwable th, Throwable th2) {
            qrj.f27099k.log(Level.WARNING, "Suppressing exception thrown when closing " + closeable, th2);
        }
    }

    /* JADX INFO: compiled from: Closer.java */
    @InterfaceC7732q
    static final class toq implements zy {

        /* JADX INFO: renamed from: k */
        static final toq f27092k = new toq();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final Method f68335toq = toq();

        toq() {
        }

        private static Method toq() {
            try {
                return Throwable.class.getMethod("addSuppressed", Throwable.class);
            } catch (Throwable unused) {
                return null;
            }
        }

        static boolean zy() {
            return f68335toq != null;
        }

        @Override // com.google.common.io.n7h.zy
        /* JADX INFO: renamed from: k */
        public void mo16429k(Closeable closeable, Throwable th, Throwable th2) {
            if (th == th2) {
                return;
            }
            try {
                f68335toq.invoke(th, th2);
            } catch (Throwable unused) {
                C4698k.f27091k.mo16429k(closeable, th, th2);
            }
        }
    }

    /* JADX INFO: compiled from: Closer.java */
    @InterfaceC7732q
    interface zy {
        /* JADX INFO: renamed from: k */
        void mo16429k(Closeable closeable, Throwable th, Throwable th2);
    }

    static {
        f27087g = toq.zy() ? toq.f27092k : C4698k.f27091k;
    }

    @InterfaceC7732q
    n7h(zy zyVar) {
        this.f27088k = (zy) com.google.common.base.jk.a9(zyVar);
    }

    /* JADX INFO: renamed from: k */
    public static n7h m16425k() {
        return new n7h(f27087g);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        Throwable th = this.f27089n;
        while (!this.f27090q.isEmpty()) {
            Closeable closeableRemoveFirst = this.f27090q.removeFirst();
            try {
                closeableRemoveFirst.close();
            } catch (Throwable th2) {
                if (th == null) {
                    th = th2;
                } else {
                    this.f27088k.mo16429k(closeableRemoveFirst, th, th2);
                }
            }
        }
        if (this.f27089n != null || th == null) {
            return;
        }
        dd.m15318i(th, IOException.class);
        throw new AssertionError(th);
    }

    /* JADX INFO: renamed from: p */
    public <X1 extends Exception, X2 extends Exception> RuntimeException m16426p(Throwable th, Class<X1> cls, Class<X2> cls2) throws Exception {
        com.google.common.base.jk.a9(th);
        this.f27089n = th;
        dd.m15318i(th, IOException.class);
        dd.fn3e(th, cls, cls2);
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: q */
    public RuntimeException m16427q(Throwable th) throws Throwable {
        com.google.common.base.jk.a9(th);
        this.f27089n = th;
        dd.m15318i(th, IOException.class);
        throw new RuntimeException(th);
    }

    /* JADX INFO: renamed from: y */
    public <X extends Exception> RuntimeException m16428y(Throwable th, Class<X> cls) throws Exception {
        com.google.common.base.jk.a9(th);
        this.f27089n = th;
        dd.m15318i(th, IOException.class);
        dd.m15318i(th, cls);
        throw new RuntimeException(th);
    }

    @CanIgnoreReturnValue
    public <C extends Closeable> C zy(@NullableDecl C c2) {
        if (c2 != null) {
            this.f27090q.addFirst(c2);
        }
        return c2;
    }
}
