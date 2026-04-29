package ek5k;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: ek5k.g */
/* JADX INFO: compiled from: ExecutorHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class C6002g {

    /* JADX INFO: renamed from: k */
    private static volatile ThreadPoolExecutor f34396k;

    /* JADX INFO: renamed from: n */
    private static volatile ThreadPoolExecutor f34397n;

    /* JADX INFO: renamed from: q */
    private static volatile ThreadPoolExecutor f34398q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f73816toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static volatile ThreadPoolExecutor f73817zy;

    /* JADX INFO: renamed from: g */
    private static final Object f34395g = new Object();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final Handler f73815f7l8 = new Handler(Looper.getMainLooper());

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread cdj(Runnable runnable) {
        return new Thread(runnable, "L-OnlineTask");
    }

    public static void f7l8(Runnable runnable) {
        x2().execute(runnable);
    }

    public static void fn3e(Runnable runnable) {
        f73815f7l8.post(runnable);
    }

    /* JADX INFO: renamed from: g */
    public static void m22240g(Runnable runnable) {
        ld6().execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Thread m22241h(Runnable runnable) {
        return new Thread(runnable, "LocalTask");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public static /* synthetic */ Thread m22242i(Runnable runnable) {
        return new Thread(runnable, "VideoSerialTask");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread ki(Runnable runnable) {
        return new Thread(runnable, "SerialTask");
    }

    public static ThreadPoolExecutor kja0() {
        if (f34397n == null) {
            synchronized (f34395g) {
                if (f34397n == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(1), new ThreadFactory() { // from class: ek5k.n
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return C6002g.m22242i(runnable);
                        }
                    }, new ThreadPoolExecutor.DiscardOldestPolicy());
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f34397n = threadPoolExecutor;
                }
            }
        }
        return f34397n;
    }

    public static ThreadPoolExecutor ld6() {
        if (f34396k == null) {
            synchronized (f34395g) {
                if (f34396k == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: ek5k.toq
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return C6002g.m22241h(runnable);
                        }
                    });
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f34396k = threadPoolExecutor;
                }
            }
        }
        return f34396k;
    }

    public static ThreadPoolExecutor n7h() {
        if (f73817zy == null) {
            synchronized (f34395g) {
                if (f73817zy == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(3, 3, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: ek5k.k
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return C6002g.t8r(runnable);
                        }
                    });
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f73817zy = threadPoolExecutor;
                }
            }
        }
        return f73817zy;
    }

    /* JADX INFO: renamed from: p */
    public static void m22245p(Runnable runnable) {
        kja0().execute(runnable);
    }

    public static ThreadPoolExecutor qrj() {
        if (f73816toq == null) {
            synchronized (f34395g) {
                if (f73816toq == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: ek5k.zy
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return C6002g.ki(runnable);
                        }
                    });
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f73816toq = threadPoolExecutor;
                }
            }
        }
        return f73816toq;
    }

    /* JADX INFO: renamed from: s */
    public static void m22247s(Runnable runnable) {
        qrj().execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread t8r(Runnable runnable) {
        return new Thread(runnable, "S-OnlineTask");
    }

    public static ThreadPoolExecutor x2() {
        if (f34398q == null) {
            synchronized (f34395g) {
                if (f34398q == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: ek5k.q
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return C6002g.cdj(runnable);
                        }
                    });
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    f34398q = threadPoolExecutor;
                }
            }
        }
        return f34398q;
    }

    /* JADX INFO: renamed from: y */
    public static void m22248y(Runnable runnable) {
        n7h().execute(runnable);
    }

    public static void zurt(Runnable runnable, long j2) {
        f73815f7l8.postDelayed(runnable, j2);
    }
}
