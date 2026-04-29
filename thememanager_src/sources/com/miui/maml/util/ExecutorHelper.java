package com.miui.maml.util;

import android.util.Log;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public class ExecutorHelper {
    private static final Object MUTEX_LOCK = new Object();
    private static volatile ThreadPoolExecutor sBigOnlineTaskExecutor;
    private static volatile ThreadPoolExecutor sLocalExecutor;

    private ExecutorHelper() {
    }

    public static ThreadPoolExecutor getLocalTaskExecutor() {
        if (sLocalExecutor == null) {
            synchronized (MUTEX_LOCK) {
                if (sLocalExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 10, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() { // from class: com.miui.maml.util.k
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return ExecutorHelper.lambda$getLocalTaskExecutor$0(runnable);
                        }
                    });
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    threadPoolExecutor.setRejectedExecutionHandler(new RejectedExecutionHandler() { // from class: com.miui.maml.util.toq
                        @Override // java.util.concurrent.RejectedExecutionHandler
                        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor2) {
                            ExecutorHelper.lambda$getLocalTaskExecutor$1(runnable, threadPoolExecutor2);
                        }
                    });
                    sLocalExecutor = threadPoolExecutor;
                }
            }
        }
        return sLocalExecutor;
    }

    public static ThreadPoolExecutor getLongOnlineTaskExecutor() {
        if (sBigOnlineTaskExecutor == null) {
            synchronized (MUTEX_LOCK) {
                if (sBigOnlineTaskExecutor == null) {
                    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 5, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactory() { // from class: com.miui.maml.util.zy
                        @Override // java.util.concurrent.ThreadFactory
                        public final Thread newThread(Runnable runnable) {
                            return ExecutorHelper.lambda$getLongOnlineTaskExecutor$2(runnable);
                        }
                    });
                    threadPoolExecutor.allowCoreThreadTimeOut(true);
                    sBigOnlineTaskExecutor = threadPoolExecutor;
                }
            }
        }
        return sBigOnlineTaskExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$getLocalTaskExecutor$0(Runnable runnable) {
        return new Thread(runnable, "MAML-LocalTask");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void lambda$getLocalTaskExecutor$1(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        Log.w("ExecutorHelper", "Exceeded Local ThreadPoolExecutor pool size. useOnline");
        getLongOnlineTaskExecutor().execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Thread lambda$getLongOnlineTaskExecutor$2(Runnable runnable) {
        return new Thread(runnable, "MAML-OnlineTask");
    }
}
