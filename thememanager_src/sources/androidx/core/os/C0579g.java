package androidx.core.os;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import zy.lvui;

/* JADX INFO: renamed from: androidx.core.os.g */
/* JADX INFO: compiled from: ExecutorCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class C0579g {

    /* JADX INFO: renamed from: androidx.core.os.g$k */
    /* JADX INFO: compiled from: ExecutorCompat.java */
    private static class k implements Executor {

        /* JADX INFO: renamed from: k */
        private final Handler f3703k;

        k(@lvui Handler handler) {
            this.f3703k = (Handler) androidx.core.util.n7h.x2(handler);
        }

        @Override // java.util.concurrent.Executor
        public void execute(@lvui Runnable runnable) {
            if (this.f3703k.post((Runnable) androidx.core.util.n7h.x2(runnable))) {
                return;
            }
            throw new RejectedExecutionException(this.f3703k + " is shutting down");
        }
    }

    private C0579g() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static Executor m2721k(@lvui Handler handler) {
        return new k(handler);
    }
}
