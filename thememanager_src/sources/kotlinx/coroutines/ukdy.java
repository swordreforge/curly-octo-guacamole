package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ThreadPoolDispatcher.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.d3(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u001a\u0018\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¨\u0006\u0007"}, d2 = {"", "name", "Lkotlinx/coroutines/xwq3;", "q", "", "nThreads", "toq", "kotlinx-coroutines-core"}, m22787k = 2, mv = {1, 6, 0})
public final class ukdy {
    @InterfaceC7396q
    @yz
    /* JADX INFO: renamed from: q */
    public static final xwq3 m24637q(@InterfaceC7396q String str) {
        return toq(1, str);
    }

    @InterfaceC7396q
    @yz
    public static final xwq3 toq(final int i2, @InterfaceC7396q final String str) {
        if (i2 >= 1) {
            final AtomicInteger atomicInteger = new AtomicInteger();
            return ikck.m24313q(Executors.newScheduledThreadPool(i2, new ThreadFactory() { // from class: kotlinx.coroutines.do
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return ukdy.zy(i2, str, atomicInteger, runnable);
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i2 + " specified").toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Thread zy(int i2, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i2 != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
