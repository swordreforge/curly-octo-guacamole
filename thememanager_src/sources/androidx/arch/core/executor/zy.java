package androidx.arch.core.executor;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: DefaultTaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class zy extends AbstractC0231q {

    /* JADX INFO: renamed from: k */
    private final Object f1262k = new Object();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ExecutorService f47005toq = Executors.newFixedThreadPool(4, new ThreadFactoryC0232k());

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @dd
    private volatile Handler f47006zy;

    /* JADX INFO: renamed from: androidx.arch.core.executor.zy$k */
    /* JADX INFO: compiled from: DefaultTaskExecutor.java */
    class ThreadFactoryC0232k implements ThreadFactory {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final String f47007zy = "arch_disk_io_%d";

        /* JADX INFO: renamed from: k */
        private final AtomicInteger f1263k = new AtomicInteger(0);

        ThreadFactoryC0232k() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName(String.format(f47007zy, Integer.valueOf(this.f1263k.getAndIncrement())));
            return thread;
        }
    }

    /* JADX INFO: renamed from: n */
    private static Handler m768n(@lvui Looper looper) {
        if (Build.VERSION.SDK_INT >= 28) {
            return Handler.createAsync(looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (IllegalAccessException | InstantiationException | NoSuchMethodException unused) {
            return new Handler(looper);
        } catch (InvocationTargetException unused2) {
            return new Handler(looper);
        }
    }

    @Override // androidx.arch.core.executor.AbstractC0231q
    /* JADX INFO: renamed from: k */
    public void mo764k(Runnable runnable) {
        this.f47005toq.execute(runnable);
    }

    @Override // androidx.arch.core.executor.AbstractC0231q
    /* JADX INFO: renamed from: q */
    public void mo765q(Runnable runnable) {
        if (this.f47006zy == null) {
            synchronized (this.f1262k) {
                if (this.f47006zy == null) {
                    this.f47006zy = m768n(Looper.getMainLooper());
                }
            }
        }
        this.f47006zy.post(runnable);
    }

    @Override // androidx.arch.core.executor.AbstractC0231q
    public boolean zy() {
        return Looper.getMainLooper().getThread() == Thread.currentThread();
    }
}
