package com.xiaomi.passport.uicontroller;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

/* JADX INFO: compiled from: SimpleFutureTask.java */
/* JADX INFO: loaded from: classes3.dex */
public class f7l8<T> extends FutureTask<T> {

    /* JADX INFO: renamed from: k */
    private toq<T> f32579k;

    /* JADX INFO: renamed from: com.xiaomi.passport.uicontroller.f7l8$k */
    /* JADX INFO: compiled from: SimpleFutureTask.java */
    class RunnableC5836k implements Runnable {
        RunnableC5836k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            f7l8.this.f32579k.mo20490k(f7l8.this);
        }
    }

    /* JADX INFO: compiled from: SimpleFutureTask.java */
    public static abstract class toq<T> {
        /* JADX INFO: renamed from: k */
        public abstract void mo20490k(f7l8<T> f7l8Var);
    }

    public f7l8(Callable<T> callable, toq<T> toqVar) {
        super(callable);
        this.f32579k = toqVar;
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        if (!isCancelled() && this.f32579k != null) {
            new Handler(Looper.getMainLooper()).post(new RunnableC5836k());
        }
        super.done();
    }
}
