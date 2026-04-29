package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.n7h;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import zy.a9;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.provider.s */
/* JADX INFO: compiled from: RequestExecutor.java */
/* JADX INFO: loaded from: classes.dex */
class C0604s {

    /* JADX INFO: renamed from: androidx.core.provider.s$k */
    /* JADX INFO: compiled from: RequestExecutor.java */
    private static class k implements ThreadFactory {

        /* JADX INFO: renamed from: k */
        private String f3767k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f50561toq;

        /* JADX INFO: renamed from: androidx.core.provider.s$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RequestExecutor.java */
        private static class C7867k extends Thread {

            /* JADX INFO: renamed from: k */
            private final int f3768k;

            C7867k(Runnable runnable, String str, int i2) {
                super(runnable, str);
                this.f3768k = i2;
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(this.f3768k);
                super.run();
            }
        }

        k(@lvui String str, int i2) {
            this.f3767k = str;
            this.f50561toq = i2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new C7867k(runnable, this.f3767k, this.f50561toq);
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.s$toq */
    /* JADX INFO: compiled from: RequestExecutor.java */
    private static class toq implements Executor {

        /* JADX INFO: renamed from: k */
        private final Handler f3769k;

        toq(@lvui Handler handler) {
            this.f3769k = (Handler) n7h.x2(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@lvui Runnable runnable) {
            if (this.f3769k.post((Runnable) n7h.x2(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f3769k + " is shutting down");
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.s$zy */
    /* JADX INFO: compiled from: RequestExecutor.java */
    private static class zy<T> implements Runnable {

        /* JADX INFO: renamed from: k */
        @lvui
        private Callable<T> f3770k;

        /* JADX INFO: renamed from: n */
        @lvui
        private Handler f3771n;

        /* JADX INFO: renamed from: q */
        @lvui
        private androidx.core.util.zy<T> f3772q;

        /* JADX INFO: renamed from: androidx.core.provider.s$zy$k */
        /* JADX INFO: compiled from: RequestExecutor.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ androidx.core.util.zy f3773k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ Object f3775q;

            k(androidx.core.util.zy zyVar, Object obj) {
                this.f3773k = zyVar;
                this.f3775q = obj;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                this.f3773k.accept(this.f3775q);
            }
        }

        zy(@lvui Handler handler, @lvui Callable<T> callable, @lvui androidx.core.util.zy<T> zyVar) {
            this.f3770k = callable;
            this.f3772q = zyVar;
            this.f3771n = handler;
        }

        @Override // java.lang.Runnable
        public void run() {
            T tCall;
            try {
                tCall = this.f3770k.call();
            } catch (Exception unused) {
                tCall = null;
            }
            this.f3771n.post(new k(this.f3772q, tCall));
        }
    }

    private C0604s() {
    }

    /* JADX INFO: renamed from: k */
    static ThreadPoolExecutor m2810k(@lvui String str, int i2, @a9(from = 0) int i3) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, i3, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new k(str, i2));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    /* JADX INFO: renamed from: q */
    static <T> T m2811q(@lvui ExecutorService executorService, @lvui Callable<T> callable, @a9(from = 0) int i2) throws InterruptedException {
        try {
            return executorService.submit(callable).get(i2, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            throw e2;
        } catch (ExecutionException e3) {
            throw new RuntimeException(e3);
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    static Executor toq(@lvui Handler handler) {
        return new toq(handler);
    }

    static <T> void zy(@lvui Executor executor, @lvui Callable<T> callable, @lvui androidx.core.util.zy<T> zyVar) {
        executor.execute(new zy(androidx.core.provider.toq.m2812k(), callable, zyVar));
    }
}
