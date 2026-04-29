package androidx.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.qrj;
import java.util.ArrayList;
import zy.hyr;

/* JADX INFO: renamed from: androidx.dynamicanimation.animation.k */
/* JADX INFO: compiled from: AnimationHandler.java */
/* JADX INFO: loaded from: classes.dex */
class C0791k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final long f51037f7l8 = 10;

    /* JADX INFO: renamed from: y */
    public static final ThreadLocal<C0791k> f4394y = new ThreadLocal<>();

    /* JADX INFO: renamed from: q */
    private zy f4398q;

    /* JADX INFO: renamed from: k */
    private final qrj<toq, Long> f4396k = new qrj<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final ArrayList<toq> f51038toq = new ArrayList<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final k f51039zy = new k();

    /* JADX INFO: renamed from: n */
    long f4397n = 0;

    /* JADX INFO: renamed from: g */
    private boolean f4395g = false;

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.k$k */
    /* JADX INFO: compiled from: AnimationHandler.java */
    class k {
        k() {
        }

        /* JADX INFO: renamed from: k */
        void m3809k() {
            C0791k.this.f4397n = SystemClock.uptimeMillis();
            C0791k c0791k = C0791k.this;
            c0791k.zy(c0791k.f4397n);
            if (C0791k.this.f51038toq.size() > 0) {
                C0791k.this.m3805g().mo3810k();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.k$n */
    /* JADX INFO: compiled from: AnimationHandler.java */
    @hyr(16)
    private static class n extends zy {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Choreographer f51040toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Choreographer.FrameCallback f51041zy;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.k$n$k */
        /* JADX INFO: compiled from: AnimationHandler.java */
        class k implements Choreographer.FrameCallback {
            k() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j2) {
                n.this.f4403k.m3809k();
            }
        }

        n(k kVar) {
            super(kVar);
            this.f51040toq = Choreographer.getInstance();
            this.f51041zy = new k();
        }

        @Override // androidx.dynamicanimation.animation.C0791k.zy
        /* JADX INFO: renamed from: k */
        void mo3810k() {
            this.f51040toq.postFrameCallback(this.f51041zy);
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.k$q */
    /* JADX INFO: compiled from: AnimationHandler.java */
    private static class q extends zy {

        /* JADX INFO: renamed from: q */
        long f4401q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Runnable f51042toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Handler f51043zy;

        /* JADX INFO: renamed from: androidx.dynamicanimation.animation.k$q$k */
        /* JADX INFO: compiled from: AnimationHandler.java */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                q.this.f4401q = SystemClock.uptimeMillis();
                q.this.f4403k.m3809k();
            }
        }

        q(k kVar) {
            super(kVar);
            this.f4401q = -1L;
            this.f51042toq = new k();
            this.f51043zy = new Handler(Looper.myLooper());
        }

        @Override // androidx.dynamicanimation.animation.C0791k.zy
        /* JADX INFO: renamed from: k */
        void mo3810k() {
            this.f51043zy.postDelayed(this.f51042toq, Math.max(C0791k.f51037f7l8 - (SystemClock.uptimeMillis() - this.f4401q), 0L));
        }
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.k$toq */
    /* JADX INFO: compiled from: AnimationHandler.java */
    interface toq {
        boolean doAnimationFrame(long j2);
    }

    /* JADX INFO: renamed from: androidx.dynamicanimation.animation.k$zy */
    /* JADX INFO: compiled from: AnimationHandler.java */
    static abstract class zy {

        /* JADX INFO: renamed from: k */
        final k f4403k;

        zy(k kVar) {
            this.f4403k = kVar;
        }

        /* JADX INFO: renamed from: k */
        abstract void mo3810k();
    }

    C0791k() {
    }

    private boolean f7l8(toq toqVar, long j2) {
        Long l2 = this.f4396k.get(toqVar);
        if (l2 == null) {
            return true;
        }
        if (l2.longValue() >= j2) {
            return false;
        }
        this.f4396k.remove(toqVar);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static C0791k m3803n() {
        ThreadLocal<C0791k> threadLocal = f4394y;
        if (threadLocal.get() == null) {
            threadLocal.set(new C0791k());
        }
        return threadLocal.get();
    }

    /* JADX INFO: renamed from: q */
    public static long m3804q() {
        ThreadLocal<C0791k> threadLocal = f4394y;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f4397n;
    }

    private void toq() {
        if (this.f4395g) {
            for (int size = this.f51038toq.size() - 1; size >= 0; size--) {
                if (this.f51038toq.get(size) == null) {
                    this.f51038toq.remove(size);
                }
            }
            this.f4395g = false;
        }
    }

    /* JADX INFO: renamed from: g */
    zy m3805g() {
        if (this.f4398q == null) {
            this.f4398q = new n(this.f51039zy);
        }
        return this.f4398q;
    }

    /* JADX INFO: renamed from: k */
    public void m3806k(toq toqVar, long j2) {
        if (this.f51038toq.size() == 0) {
            m3805g().mo3810k();
        }
        if (!this.f51038toq.contains(toqVar)) {
            this.f51038toq.add(toqVar);
        }
        if (j2 > 0) {
            this.f4396k.put(toqVar, Long.valueOf(SystemClock.uptimeMillis() + j2));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m3807s(zy zyVar) {
        this.f4398q = zyVar;
    }

    /* JADX INFO: renamed from: y */
    public void m3808y(toq toqVar) {
        this.f4396k.remove(toqVar);
        int iIndexOf = this.f51038toq.indexOf(toqVar);
        if (iIndexOf >= 0) {
            this.f51038toq.set(iIndexOf, null);
            this.f4395g = true;
        }
    }

    void zy(long j2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i2 = 0; i2 < this.f51038toq.size(); i2++) {
            toq toqVar = this.f51038toq.get(i2);
            if (toqVar != null && f7l8(toqVar, jUptimeMillis)) {
                toqVar.doAnimationFrame(j2);
            }
        }
        toq();
    }
}
