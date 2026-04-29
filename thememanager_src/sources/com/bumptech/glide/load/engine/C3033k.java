package com.bumptech.glide.load.engine;

import android.os.Process;
import com.bumptech.glide.load.engine.C3031h;
import com.bumptech.glide.util.C3199g;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: com.bumptech.glide.load.engine.k */
/* JADX INFO: compiled from: ActiveResources.java */
/* JADX INFO: loaded from: classes2.dex */
final class C3033k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @dd
    private volatile zy f62776f7l8;

    /* JADX INFO: renamed from: g */
    private volatile boolean f18385g;

    /* JADX INFO: renamed from: k */
    private final boolean f18386k;

    /* JADX INFO: renamed from: n */
    private C3031h.k f18387n;

    /* JADX INFO: renamed from: q */
    private final ReferenceQueue<C3031h<?>> f18388q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final Executor f62777toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @yz
    final Map<com.bumptech.glide.load.f7l8, q> f62778zy;

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.k$k */
    /* JADX INFO: compiled from: ActiveResources.java */
    class k implements ThreadFactory {

        /* JADX INFO: renamed from: com.bumptech.glide.load.engine.k$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: ActiveResources.java */
        class RunnableC7945k implements Runnable {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Runnable f18389k;

            RunnableC7945k(Runnable runnable) {
                this.f18389k = runnable;
            }

            @Override // java.lang.Runnable
            public void run() {
                Process.setThreadPriority(10);
                this.f18389k.run();
            }
        }

        k() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(@lvui Runnable runnable) {
            return new Thread(new RunnableC7945k(runnable), "glide-active-resources");
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.k$q */
    /* JADX INFO: compiled from: ActiveResources.java */
    @yz
    static final class q extends WeakReference<C3031h<?>> {

        /* JADX INFO: renamed from: k */
        final com.bumptech.glide.load.f7l8 f18391k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        final boolean f62779toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        zurt<?> f62780zy;

        q(@lvui com.bumptech.glide.load.f7l8 f7l8Var, @lvui C3031h<?> c3031h, @lvui ReferenceQueue<? super C3031h<?>> referenceQueue, boolean z2) {
            super(c3031h, referenceQueue);
            this.f18391k = (com.bumptech.glide.load.f7l8) com.bumptech.glide.util.qrj.m11262q(f7l8Var);
            this.f62780zy = (c3031h.m10769g() && z2) ? (zurt) com.bumptech.glide.util.qrj.m11262q(c3031h.m10771q()) : null;
            this.f62779toq = c3031h.m10769g();
        }

        /* JADX INFO: renamed from: k */
        void m10779k() {
            this.f62780zy = null;
            clear();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.k$toq */
    /* JADX INFO: compiled from: ActiveResources.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C3033k.this.toq();
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.load.engine.k$zy */
    /* JADX INFO: compiled from: ActiveResources.java */
    @yz
    interface zy {
        /* JADX INFO: renamed from: k */
        void m10780k();
    }

    C3033k(boolean z2) {
        this(z2, Executors.newSingleThreadExecutor(new k()));
    }

    void f7l8(C3031h.k kVar) {
        synchronized (kVar) {
            synchronized (this) {
                this.f18387n = kVar;
            }
        }
    }

    @yz
    /* JADX INFO: renamed from: g */
    void m10774g(zy zyVar) {
        this.f62776f7l8 = zyVar;
    }

    /* JADX INFO: renamed from: k */
    synchronized void m10775k(com.bumptech.glide.load.f7l8 f7l8Var, C3031h<?> c3031h) {
        q qVarPut = this.f62778zy.put(f7l8Var, new q(f7l8Var, c3031h, this.f18388q, this.f18386k));
        if (qVarPut != null) {
            qVarPut.m10779k();
        }
    }

    @dd
    /* JADX INFO: renamed from: n */
    synchronized C3031h<?> m10776n(com.bumptech.glide.load.f7l8 f7l8Var) {
        q qVar = this.f62778zy.get(f7l8Var);
        if (qVar == null) {
            return null;
        }
        C3031h<?> c3031h = qVar.get();
        if (c3031h == null) {
            zy(qVar);
        }
        return c3031h;
    }

    /* JADX INFO: renamed from: q */
    synchronized void m10777q(com.bumptech.glide.load.f7l8 f7l8Var) {
        q qVarRemove = this.f62778zy.remove(f7l8Var);
        if (qVarRemove != null) {
            qVarRemove.m10779k();
        }
    }

    void toq() {
        while (!this.f18385g) {
            try {
                zy((q) this.f18388q.remove());
                zy zyVar = this.f62776f7l8;
                if (zyVar != null) {
                    zyVar.m10780k();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    @yz
    /* JADX INFO: renamed from: y */
    void m10778y() {
        this.f18385g = true;
        Executor executor = this.f62777toq;
        if (executor instanceof ExecutorService) {
            C3199g.zy((ExecutorService) executor);
        }
    }

    void zy(@lvui q qVar) {
        zurt<?> zurtVar;
        synchronized (this) {
            this.f62778zy.remove(qVar.f18391k);
            if (qVar.f62779toq && (zurtVar = qVar.f62780zy) != null) {
                this.f18387n.mo10772q(qVar.f18391k, new C3031h<>(zurtVar, true, false, qVar.f18391k, this.f18387n));
            }
        }
    }

    @yz
    C3033k(boolean z2, Executor executor) {
        this.f62778zy = new HashMap();
        this.f18388q = new ReferenceQueue<>();
        this.f18386k = z2;
        this.f62777toq = executor;
        executor.execute(new toq());
    }
}
