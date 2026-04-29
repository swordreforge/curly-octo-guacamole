package androidx.concurrent.futures;

import java.util.concurrent.Executor;

/* JADX INFO: renamed from: androidx.concurrent.futures.q */
/* JADX INFO: compiled from: DirectExecutor.java */
/* JADX INFO: loaded from: classes.dex */
enum EnumC0259q implements Executor {
    INSTANCE;

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
