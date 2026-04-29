package androidx.emoji2.text;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import zy.InterfaceC7830i;
import zy.hyr;
import zy.lvui;

/* JADX INFO: compiled from: ConcurrencyHelpers.java */
/* JADX INFO: loaded from: classes.dex */
class zy {

    /* JADX INFO: renamed from: k */
    private static final int f4581k = 15;

    /* JADX INFO: renamed from: androidx.emoji2.text.zy$k */
    /* JADX INFO: compiled from: ConcurrencyHelpers.java */
    @hyr(28)
    static class C0837k {
        private C0837k() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        public static Handler m4093k(Looper looper) {
            return Handler.createAsync(looper);
        }
    }

    private zy() {
    }

    /* JADX INFO: renamed from: n */
    static Handler m4091n() {
        return Build.VERSION.SDK_INT >= 28 ? C0837k.m4093k(Looper.getMainLooper()) : new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public static /* synthetic */ Thread m4092q(String str, Runnable runnable) {
        Thread thread = new Thread(runnable, str);
        thread.setPriority(10);
        return thread;
    }

    @lvui
    @Deprecated
    static Executor toq(@lvui Handler handler) {
        Objects.requireNonNull(handler);
        return new toq(handler);
    }

    static ThreadPoolExecutor zy(@lvui final String str) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactory() { // from class: androidx.emoji2.text.k
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return zy.m4092q(str, runnable);
            }
        });
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }
}
