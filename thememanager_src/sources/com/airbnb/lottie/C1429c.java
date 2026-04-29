package com.airbnb.lottie;

import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.utils.C1510q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import zy.uv6;

/* JADX INFO: renamed from: com.airbnb.lottie.c */
/* JADX INFO: compiled from: LottieTask.java */
/* JADX INFO: loaded from: classes.dex */
public class C1429c<T> {

    /* JADX INFO: renamed from: n */
    public static Executor f7920n = Executors.newCachedThreadPool();

    /* JADX INFO: renamed from: k */
    private final Set<x9kr<T>> f7921k;

    /* JADX INFO: renamed from: q */
    @zy.dd
    private volatile hyr<T> f7922q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Set<x9kr<Throwable>> f55940toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Handler f55941zy;

    /* JADX INFO: renamed from: com.airbnb.lottie.c$k */
    /* JADX INFO: compiled from: LottieTask.java */
    private class k extends FutureTask<hyr<T>> {
        k(Callable<hyr<T>> callable) {
            super(callable);
        }

        @Override // java.util.concurrent.FutureTask
        protected void done() {
            if (isCancelled()) {
                return;
            }
            try {
                C1429c.this.ld6(get());
            } catch (InterruptedException | ExecutionException e2) {
                C1429c.this.ld6(new hyr(e2));
            }
        }
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    public C1429c(Callable<hyr<T>> callable) {
        this(callable, false);
    }

    private void f7l8() {
        this.f55941zy.post(new Runnable() { // from class: com.airbnb.lottie.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f7935k.m5949n();
            }
        });
    }

    /* JADX INFO: renamed from: g */
    private synchronized void m5947g(Throwable th) {
        ArrayList arrayList = new ArrayList(this.f55940toq);
        if (arrayList.isEmpty()) {
            C1510q.m6253g("Lottie encountered an error but no failure listener was added:", th);
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((x9kr) it.next()).onResult(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ld6(@zy.dd hyr<T> hyrVar) {
        if (this.f7922q != null) {
            throw new IllegalStateException("A task may only be set once.");
        }
        this.f7922q = hyrVar;
        f7l8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m5949n() {
        hyr<T> hyrVar = this.f7922q;
        if (hyrVar == null) {
            return;
        }
        if (hyrVar.toq() != null) {
            m5950y(hyrVar.toq());
        } else {
            m5947g(hyrVar.m5969k());
        }
    }

    /* JADX INFO: renamed from: y */
    private synchronized void m5950y(T t2) {
        Iterator it = new ArrayList(this.f7921k).iterator();
        while (it.hasNext()) {
            ((x9kr) it.next()).onResult(t2);
        }
    }

    /* JADX INFO: renamed from: p */
    public synchronized C1429c<T> m5951p(x9kr<T> x9krVar) {
        this.f7921k.remove(x9krVar);
        return this;
    }

    /* JADX INFO: renamed from: q */
    public synchronized C1429c<T> m5952q(x9kr<T> x9krVar) {
        hyr<T> hyrVar = this.f7922q;
        if (hyrVar != null && hyrVar.toq() != null) {
            x9krVar.onResult(hyrVar.toq());
        }
        this.f7921k.add(x9krVar);
        return this;
    }

    /* JADX INFO: renamed from: s */
    public synchronized C1429c<T> m5953s(x9kr<Throwable> x9krVar) {
        this.f55940toq.remove(x9krVar);
        return this;
    }

    public synchronized C1429c<T> zy(x9kr<Throwable> x9krVar) {
        hyr<T> hyrVar = this.f7922q;
        if (hyrVar != null && hyrVar.m5969k() != null) {
            x9krVar.onResult(hyrVar.m5969k());
        }
        this.f55940toq.add(x9krVar);
        return this;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    C1429c(Callable<hyr<T>> callable, boolean z2) {
        this.f7921k = new LinkedHashSet(1);
        this.f55940toq = new LinkedHashSet(1);
        this.f55941zy = new Handler(Looper.getMainLooper());
        this.f7922q = null;
        if (!z2) {
            f7920n.execute(new k(callable));
            return;
        }
        try {
            ld6(callable.call());
        } catch (Throwable th) {
            ld6(new hyr<>(th));
        }
    }
}
