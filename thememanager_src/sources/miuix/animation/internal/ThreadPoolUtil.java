package miuix.animation.internal;

import android.os.Process;
import com.xiaomi.mipush.sdk.C5658n;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class ThreadPoolUtil {
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE = 30;
    private static final int KEEP_POOL_SIZE;
    public static final int MAX_SPLIT_COUNT;
    private static final ThreadPoolExecutor sCacheThread;
    private static final Executor sSingleThread;
    public static int sThreadPriority;

    static {
        int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = iAvailableProcessors;
        int i2 = (iAvailableProcessors * 2) + 1;
        MAX_SPLIT_COUNT = i2;
        int i3 = iAvailableProcessors < 4 ? 0 : (iAvailableProcessors / 2) + 1;
        KEEP_POOL_SIZE = i3;
        sThreadPriority = -2;
        sCacheThread = new ThreadPoolExecutor(i3, i2 + 3, 30L, TimeUnit.SECONDS, new SynchronousQueue(), getThreadFactory("AnimThread"), new RejectedExecutionHandler() { // from class: miuix.animation.internal.ThreadPoolUtil.1
            @Override // java.util.concurrent.RejectedExecutionHandler
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
                ThreadPoolUtil.sSingleThread.execute(runnable);
            }
        });
        sSingleThread = Executors.newSingleThreadExecutor(getThreadFactory("WorkThread"));
    }

    public static void getSplitCount(int i2, int[] iArr) {
        int iMax = Math.max(i2 / 4000, 1);
        int i3 = MAX_SPLIT_COUNT;
        if (iMax > i3) {
            iMax = i3;
        }
        int iCeil = (int) Math.ceil(i2 / iMax);
        iArr[0] = iMax;
        iArr[1] = iCeil;
    }

    private static ThreadFactory getThreadFactory(final String str) {
        return new ThreadFactory() { // from class: miuix.animation.internal.ThreadPoolUtil.2
            final AtomicInteger threadNumber = new AtomicInteger(1);

            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(@lvui Runnable runnable) {
                return new Thread(runnable, str + C5658n.f73185t8r + this.threadNumber.getAndIncrement()) { // from class: miuix.animation.internal.ThreadPoolUtil.2.1
                    @Override // java.lang.Thread, java.lang.Runnable
                    public void run() {
                        Process.setThreadPriority(ThreadPoolUtil.sThreadPriority);
                        super.run();
                    }
                };
            }
        };
    }

    public static void post(Runnable runnable) {
        sCacheThread.execute(runnable);
    }

    public static void setThreadPriority(int i2) {
        sThreadPriority = i2;
    }
}
