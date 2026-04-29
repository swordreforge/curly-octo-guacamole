package androidx.concurrent.futures;

import com.google.common.util.concurrent.InterfaceFutureC4792c;
import java.lang.ref.WeakReference;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: CallbackToFutureAdapter.java */
/* JADX INFO: loaded from: classes.dex */
public final class zy {

    /* JADX INFO: renamed from: androidx.concurrent.futures.zy$k */
    /* JADX INFO: compiled from: CallbackToFutureAdapter.java */
    public static final class C0260k<T> {

        /* JADX INFO: renamed from: k */
        Object f1408k;

        /* JADX INFO: renamed from: q */
        private boolean f1409q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        C0261q<T> f47049toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private C0258n<Void> f47050zy = C0258n.fu4();

        C0260k() {
        }

        /* JADX INFO: renamed from: n */
        private void m908n() {
            this.f1408k = null;
            this.f47049toq = null;
            this.f47050zy = null;
        }

        protected void finalize() {
            C0258n<Void> c0258n;
            C0261q<T> c0261q = this.f47049toq;
            if (c0261q != null && !c0261q.isDone()) {
                c0261q.m913q(new toq("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.f1408k));
            }
            if (this.f1409q || (c0258n = this.f47050zy) == null) {
                return;
            }
            c0258n.t8r(null);
        }

        /* JADX INFO: renamed from: g */
        public boolean m909g(@lvui Throwable th) {
            this.f1409q = true;
            C0261q<T> c0261q = this.f47049toq;
            boolean z2 = c0261q != null && c0261q.m913q(th);
            if (z2) {
                m908n();
            }
            return z2;
        }

        /* JADX INFO: renamed from: k */
        public void m910k(@lvui Runnable runnable, @lvui Executor executor) {
            C0258n<Void> c0258n = this.f47050zy;
            if (c0258n != null) {
                c0258n.n7h(runnable, executor);
            }
        }

        /* JADX INFO: renamed from: q */
        public boolean m911q() {
            this.f1409q = true;
            C0261q<T> c0261q = this.f47049toq;
            boolean z2 = c0261q != null && c0261q.m912k(true);
            if (z2) {
                m908n();
            }
            return z2;
        }

        void toq() {
            this.f1408k = null;
            this.f47049toq = null;
            this.f47050zy.t8r(null);
        }

        public boolean zy(T t2) {
            this.f1409q = true;
            C0261q<T> c0261q = this.f47049toq;
            boolean z2 = c0261q != null && c0261q.toq(t2);
            if (z2) {
                m908n();
            }
            return z2;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.zy$q */
    /* JADX INFO: compiled from: CallbackToFutureAdapter.java */
    private static final class C0261q<T> implements InterfaceFutureC4792c<T> {

        /* JADX INFO: renamed from: k */
        final WeakReference<C0260k<T>> f1410k;

        /* JADX INFO: renamed from: q */
        private final AbstractC0257k<T> f1411q = new k();

        /* JADX INFO: renamed from: androidx.concurrent.futures.zy$q$k */
        /* JADX INFO: compiled from: CallbackToFutureAdapter.java */
        class k extends AbstractC0257k<T> {
            k() {
            }

            @Override // androidx.concurrent.futures.AbstractC0257k
            /* JADX INFO: renamed from: h */
            protected String mo900h() {
                C0260k<T> c0260k = C0261q.this.f1410k.get();
                if (c0260k == null) {
                    return "Completer object has been garbage collected, future will fail soon";
                }
                return "tag=[" + c0260k.f1408k + "]";
            }
        }

        C0261q(C0260k<T> c0260k) {
            this.f1410k = new WeakReference<>(c0260k);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z2) {
            C0260k<T> c0260k = this.f1410k.get();
            boolean zCancel = this.f1411q.cancel(z2);
            if (zCancel && c0260k != null) {
                c0260k.toq();
            }
            return zCancel;
        }

        @Override // java.util.concurrent.Future
        public T get() throws ExecutionException, InterruptedException {
            return this.f1411q.get();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.f1411q.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.f1411q.isDone();
        }

        /* JADX INFO: renamed from: k */
        boolean m912k(boolean z2) {
            return this.f1411q.cancel(z2);
        }

        @Override // com.google.common.util.concurrent.InterfaceFutureC4792c
        public void n7h(@lvui Runnable runnable, @lvui Executor executor) {
            this.f1411q.n7h(runnable, executor);
        }

        /* JADX INFO: renamed from: q */
        boolean m913q(Throwable th) {
            return this.f1411q.mo901i(th);
        }

        public String toString() {
            return this.f1411q.toString();
        }

        boolean toq(T t2) {
            return this.f1411q.t8r(t2);
        }

        @Override // java.util.concurrent.Future
        public T get(long j2, @lvui TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
            return this.f1411q.get(j2, timeUnit);
        }
    }

    /* JADX INFO: compiled from: CallbackToFutureAdapter.java */
    static final class toq extends Throwable {
        toq(String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized Throwable fillInStackTrace() {
            return this;
        }
    }

    /* JADX INFO: renamed from: androidx.concurrent.futures.zy$zy, reason: collision with other inner class name */
    /* JADX INFO: compiled from: CallbackToFutureAdapter.java */
    public interface InterfaceC7854zy<T> {
        @dd
        /* JADX INFO: renamed from: k */
        Object m914k(@lvui C0260k<T> c0260k) throws Exception;
    }

    private zy() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static <T> InterfaceFutureC4792c<T> m907k(@lvui InterfaceC7854zy<T> interfaceC7854zy) {
        C0260k<T> c0260k = new C0260k<>();
        C0261q<T> c0261q = new C0261q<>(c0260k);
        c0260k.f47049toq = c0261q;
        c0260k.f1408k = interfaceC7854zy.getClass();
        try {
            Object objM914k = interfaceC7854zy.m914k(c0260k);
            if (objM914k != null) {
                c0260k.f1408k = objM914k;
            }
        } catch (Exception e2) {
            c0261q.m913q(e2);
        }
        return c0261q;
    }
}
