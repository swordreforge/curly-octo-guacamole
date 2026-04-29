package com.bumptech.glide.load.engine.executor;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import zy.a9;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.k */
/* JADX INFO: compiled from: GlideExecutor.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ExecutorServiceC3027k implements ExecutorService {

    /* JADX INFO: renamed from: g */
    static final int f18331g = 1;

    /* JADX INFO: renamed from: h */
    private static final long f18332h = TimeUnit.SECONDS.toMillis(10);

    /* JADX INFO: renamed from: i */
    private static final int f18333i = 4;

    /* JADX INFO: renamed from: n */
    static final String f18334n = "disk-cache";

    /* JADX INFO: renamed from: p */
    static final String f18335p = "animation";

    /* JADX INFO: renamed from: q */
    static final String f18336q = "source";

    /* JADX INFO: renamed from: s */
    private static final String f18337s = "source-unlimited";

    /* JADX INFO: renamed from: y */
    private static final String f18338y = "GlideExecutor";

    /* JADX INFO: renamed from: z */
    private static volatile int f18339z;

    /* JADX INFO: renamed from: k */
    private final ExecutorService f18340k;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.k$n */
    /* JADX INFO: compiled from: GlideExecutor.java */
    public interface n {

        /* JADX INFO: renamed from: k */
        public static final n f18341k = new k();

        /* JADX INFO: renamed from: q */
        public static final n f18342q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public static final n f62752toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public static final n f62753zy;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.k$n$k */
        /* JADX INFO: compiled from: GlideExecutor.java */
        class k implements n {
            k() {
            }

            @Override // com.bumptech.glide.load.engine.executor.ExecutorServiceC3027k.n
            /* JADX INFO: renamed from: k */
            public void mo10748k(Throwable th) {
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.k$n$toq */
        /* JADX INFO: compiled from: GlideExecutor.java */
        class toq implements n {
            toq() {
            }

            @Override // com.bumptech.glide.load.engine.executor.ExecutorServiceC3027k.n
            /* JADX INFO: renamed from: k */
            public void mo10748k(Throwable th) {
                if (th == null || !Log.isLoggable(ExecutorServiceC3027k.f18338y, 6)) {
                    return;
                }
                Log.e(ExecutorServiceC3027k.f18338y, "Request threw uncaught throwable", th);
            }
        }

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.k$n$zy */
        /* JADX INFO: compiled from: GlideExecutor.java */
        class zy implements n {
            zy() {
            }

            @Override // com.bumptech.glide.load.engine.executor.ExecutorServiceC3027k.n
            /* JADX INFO: renamed from: k */
            public void mo10748k(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            toq toqVar = new toq();
            f62752toq = toqVar;
            f62753zy = new zy();
            f18342q = toqVar;
        }

        /* JADX INFO: renamed from: k */
        void mo10748k(Throwable th);
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.k$q */
    /* JADX INFO: compiled from: GlideExecutor.java */
    private static final class q implements ThreadFactory {

        /* JADX INFO: renamed from: k */
        private final ThreadFactory f18343k;

        /* JADX INFO: renamed from: n */
        private final AtomicInteger f18344n = new AtomicInteger();

        /* JADX INFO: renamed from: q */
        final boolean f18345q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final String f62754toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        final n f62755zy;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.k$q$k */
        /* JADX INFO: compiled from: GlideExecutor.java */
        class k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Runnable f18346k;

            k(Runnable runnable) {
                this.f18346k = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                if (q.this.f18345q) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    this.f18346k.run();
                } catch (Throwable th) {
                    q.this.f62755zy.mo10748k(th);
                }
            }
        }

        q(ThreadFactory threadFactory, String str, n nVar, boolean z2) {
            this.f18343k = threadFactory;
            this.f62754toq = str;
            this.f62755zy = nVar;
            this.f18345q = z2;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@lvui Runnable runnable) {
            Thread threadNewThread = this.f18343k.newThread(new k(runnable));
            threadNewThread.setName("glide-" + this.f62754toq + "-thread-" + this.f18344n.getAndIncrement());
            return threadNewThread;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.k$toq */
    /* JADX INFO: compiled from: GlideExecutor.java */
    public static final class toq {

        /* JADX INFO: renamed from: y */
        public static final long f18348y = 0;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private long f62756f7l8;

        /* JADX INFO: renamed from: g */
        private String f18349g;

        /* JADX INFO: renamed from: k */
        private final boolean f18350k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f62757toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private int f62758zy;

        /* JADX INFO: renamed from: q */
        @lvui
        private final ThreadFactory f18352q = new zy();

        /* JADX INFO: renamed from: n */
        @lvui
        private n f18351n = n.f18342q;

        toq(boolean z2) {
            this.f18350k = z2;
        }

        /* JADX INFO: renamed from: k */
        public ExecutorServiceC3027k m10749k() {
            if (TextUtils.isEmpty(this.f18349g)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f18349g);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f62757toq, this.f62758zy, this.f62756f7l8, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new q(this.f18352q, this.f18349g, this.f18351n, this.f18350k));
            if (this.f62756f7l8 != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new ExecutorServiceC3027k(threadPoolExecutor);
        }

        /* JADX INFO: renamed from: n */
        public toq m10750n(@lvui n nVar) {
            this.f18351n = nVar;
            return this;
        }

        /* JADX INFO: renamed from: q */
        public toq m10751q(long j2) {
            this.f62756f7l8 = j2;
            return this;
        }

        public toq toq(String str) {
            this.f18349g = str;
            return this;
        }

        public toq zy(@a9(from = 1) int i2) {
            this.f62757toq = i2;
            this.f62758zy = i2;
            return this;
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.k$zy */
    /* JADX INFO: compiled from: GlideExecutor.java */
    private static final class zy implements ThreadFactory {

        /* JADX INFO: renamed from: k */
        private static final int f18353k = 9;

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.executor.k$zy$k */
        /* JADX INFO: compiled from: GlideExecutor.java */
        class k extends Thread {
            k(Runnable runnable) {
                super(runnable);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                Process.setThreadPriority(9);
                super.run();
            }
        }

        private zy() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@lvui Runnable runnable) {
            return new k(runnable);
        }
    }

    @yz
    ExecutorServiceC3027k(ExecutorService executorService) {
        this.f18340k = executorService;
    }

    public static ExecutorServiceC3027k f7l8() {
        return m10741g().m10749k();
    }

    /* JADX INFO: renamed from: g */
    public static toq m10741g() {
        return new toq(true).zy(1).toq(f18334n);
    }

    /* JADX INFO: renamed from: k */
    static int m10742k() {
        return toq() >= 4 ? 2 : 1;
    }

    public static ExecutorServiceC3027k ld6() {
        return m10744p().m10749k();
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public static ExecutorServiceC3027k m10743n(int i2, n nVar) {
        return zy().zy(i2).m10750n(nVar).m10749k();
    }

    public static ExecutorServiceC3027k n7h() {
        return new ExecutorServiceC3027k(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f18332h, TimeUnit.MILLISECONDS, new SynchronousQueue(), new q(new zy(), f18337s, n.f18342q, false)));
    }

    /* JADX INFO: renamed from: p */
    public static toq m10744p() {
        return new toq(false).zy(toq()).toq("source");
    }

    /* JADX INFO: renamed from: q */
    public static ExecutorServiceC3027k m10745q() {
        return zy().m10749k();
    }

    @Deprecated
    public static ExecutorServiceC3027k qrj(n nVar) {
        return m10744p().m10750n(nVar).m10749k();
    }

    @Deprecated
    /* JADX INFO: renamed from: s */
    public static ExecutorServiceC3027k m10746s(n nVar) {
        return m10741g().m10750n(nVar).m10749k();
    }

    public static int toq() {
        if (f18339z == 0) {
            f18339z = Math.min(4, com.bumptech.glide.load.engine.executor.toq.m10752k());
        }
        return f18339z;
    }

    @Deprecated
    public static ExecutorServiceC3027k x2(int i2, String str, n nVar) {
        return m10744p().zy(i2).toq(str).m10750n(nVar).m10749k();
    }

    @Deprecated
    /* JADX INFO: renamed from: y */
    public static ExecutorServiceC3027k m10747y(int i2, String str, n nVar) {
        return m10741g().zy(i2).toq(str).m10750n(nVar).m10749k();
    }

    public static toq zy() {
        return new toq(true).zy(m10742k()).toq("animation");
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, @lvui TimeUnit timeUnit) throws InterruptedException {
        return this.f18340k.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(@lvui Runnable runnable) {
        this.f18340k.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    @lvui
    public <T> List<Future<T>> invokeAll(@lvui Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f18340k.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    @lvui
    public <T> T invokeAny(@lvui Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f18340k.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f18340k.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f18340k.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f18340k.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @lvui
    public List<Runnable> shutdownNow() {
        return this.f18340k.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    @lvui
    public Future<?> submit(@lvui Runnable runnable) {
        return this.f18340k.submit(runnable);
    }

    public String toString() {
        return this.f18340k.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    @lvui
    public <T> List<Future<T>> invokeAll(@lvui Collection<? extends Callable<T>> collection, long j2, @lvui TimeUnit timeUnit) throws InterruptedException {
        return this.f18340k.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(@lvui Collection<? extends Callable<T>> collection, long j2, @lvui TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f18340k.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    @lvui
    public <T> Future<T> submit(@lvui Runnable runnable, T t2) {
        return this.f18340k.submit(runnable, t2);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(@lvui Callable<T> callable) {
        return this.f18340k.submit(callable);
    }
}
