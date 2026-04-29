package androidx.room;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: TransactionExecutor.java */
/* JADX INFO: loaded from: classes.dex */
class lvui implements Executor {

    /* JADX INFO: renamed from: k */
    private final Executor f6195k;

    /* JADX INFO: renamed from: n */
    private Runnable f6196n;

    /* JADX INFO: renamed from: q */
    private final ArrayDeque<Runnable> f6197q = new ArrayDeque<>();

    /* JADX INFO: renamed from: androidx.room.lvui$k */
    /* JADX INFO: compiled from: TransactionExecutor.java */
    class RunnableC1133k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Runnable f6198k;

        RunnableC1133k(Runnable runnable) {
            this.f6198k = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f6198k.run();
            } finally {
                lvui.this.m5164k();
            }
        }
    }

    lvui(@zy.lvui Executor executor) {
        this.f6195k = executor;
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable runnable) {
        this.f6197q.offer(new RunnableC1133k(runnable));
        if (this.f6196n == null) {
            m5164k();
        }
    }

    /* JADX INFO: renamed from: k */
    synchronized void m5164k() {
        Runnable runnablePoll = this.f6197q.poll();
        this.f6196n = runnablePoll;
        if (runnablePoll != null) {
            this.f6195k.execute(runnablePoll);
        }
    }
}
