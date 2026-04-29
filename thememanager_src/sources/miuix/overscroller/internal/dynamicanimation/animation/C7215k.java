package miuix.overscroller.internal.dynamicanimation.animation;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.ArrayMap;
import android.view.Choreographer;
import java.util.ArrayList;

/* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.k */
/* JADX INFO: compiled from: AnimationHandler.java */
/* JADX INFO: loaded from: classes3.dex */
class C7215k {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final long f87886f7l8 = 10;

    /* JADX INFO: renamed from: y */
    public static final ThreadLocal<C7215k> f40721y = new ThreadLocal<>();

    /* JADX INFO: renamed from: q */
    private zy f40725q;

    /* JADX INFO: renamed from: k */
    private final ArrayMap<toq, Long> f40723k = new ArrayMap<>();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final ArrayList<toq> f87887toq = new ArrayList<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final k f87888zy = new k();

    /* JADX INFO: renamed from: n */
    long f40724n = 0;

    /* JADX INFO: renamed from: g */
    private boolean f40722g = false;

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.k$k */
    /* JADX INFO: compiled from: AnimationHandler.java */
    class k {
        k() {
        }

        /* JADX INFO: renamed from: k */
        void m26192k() {
            C7215k.this.f40724n = SystemClock.uptimeMillis();
            C7215k c7215k = C7215k.this;
            c7215k.zy(c7215k.f40724n);
            if (C7215k.this.f87887toq.size() > 0) {
                C7215k.this.m26188g().mo26193k();
            }
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.k$n */
    /* JADX INFO: compiled from: AnimationHandler.java */
    private static class n extends zy {

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Choreographer f87889toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Choreographer.FrameCallback f87890zy;

        /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.k$n$k */
        /* JADX INFO: compiled from: AnimationHandler.java */
        class k implements Choreographer.FrameCallback {
            k() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public void doFrame(long j2) {
                n.this.f40730k.m26192k();
            }
        }

        n(k kVar) {
            super(kVar);
            this.f87889toq = Choreographer.getInstance();
            this.f87890zy = new k();
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.C7215k.zy
        /* JADX INFO: renamed from: k */
        void mo26193k() {
            this.f87889toq.postFrameCallback(this.f87890zy);
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.k$q */
    /* JADX INFO: compiled from: AnimationHandler.java */
    private static class q extends zy {

        /* JADX INFO: renamed from: q */
        long f40728q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Runnable f87891toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final Handler f87892zy;

        /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.k$q$k */
        /* JADX INFO: compiled from: AnimationHandler.java */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                q.this.f40728q = SystemClock.uptimeMillis();
                q.this.f40730k.m26192k();
            }
        }

        q(k kVar) {
            super(kVar);
            this.f40728q = -1L;
            this.f87891toq = new k();
            this.f87892zy = new Handler(Looper.myLooper());
        }

        @Override // miuix.overscroller.internal.dynamicanimation.animation.C7215k.zy
        /* JADX INFO: renamed from: k */
        void mo26193k() {
            this.f87892zy.postDelayed(this.f87891toq, Math.max(C7215k.f87886f7l8 - (SystemClock.uptimeMillis() - this.f40728q), 0L));
        }
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.k$toq */
    /* JADX INFO: compiled from: AnimationHandler.java */
    interface toq {
        boolean doAnimationFrame(long j2);
    }

    /* JADX INFO: renamed from: miuix.overscroller.internal.dynamicanimation.animation.k$zy */
    /* JADX INFO: compiled from: AnimationHandler.java */
    static abstract class zy {

        /* JADX INFO: renamed from: k */
        final k f40730k;

        zy(k kVar) {
            this.f40730k = kVar;
        }

        /* JADX INFO: renamed from: k */
        abstract void mo26193k();
    }

    C7215k() {
    }

    private boolean f7l8(toq toqVar, long j2) {
        Long l2 = this.f40723k.get(toqVar);
        if (l2 == null) {
            return true;
        }
        if (l2.longValue() >= j2) {
            return false;
        }
        this.f40723k.remove(toqVar);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public static C7215k m26186n() {
        ThreadLocal<C7215k> threadLocal = f40721y;
        if (threadLocal.get() == null) {
            threadLocal.set(new C7215k());
        }
        return threadLocal.get();
    }

    /* JADX INFO: renamed from: q */
    public static long m26187q() {
        ThreadLocal<C7215k> threadLocal = f40721y;
        if (threadLocal.get() == null) {
            return 0L;
        }
        return threadLocal.get().f40724n;
    }

    private void toq() {
        if (this.f40722g) {
            for (int size = this.f87887toq.size() - 1; size >= 0; size--) {
                if (this.f87887toq.get(size) == null) {
                    this.f87887toq.remove(size);
                }
            }
            this.f40722g = false;
        }
    }

    /* JADX INFO: renamed from: g */
    zy m26188g() {
        if (this.f40725q == null) {
            this.f40725q = new n(this.f87888zy);
        }
        return this.f40725q;
    }

    /* JADX INFO: renamed from: k */
    public void m26189k(toq toqVar, long j2) {
        if (this.f87887toq.size() == 0) {
            m26188g().mo26193k();
        }
        if (!this.f87887toq.contains(toqVar)) {
            this.f87887toq.add(toqVar);
        }
        if (j2 > 0) {
            this.f40723k.put(toqVar, Long.valueOf(SystemClock.uptimeMillis() + j2));
        }
    }

    /* JADX INFO: renamed from: s */
    public void m26190s(zy zyVar) {
        this.f40725q = zyVar;
    }

    /* JADX INFO: renamed from: y */
    public void m26191y(toq toqVar) {
        this.f40723k.remove(toqVar);
        int iIndexOf = this.f87887toq.indexOf(toqVar);
        if (iIndexOf >= 0) {
            this.f87887toq.set(iIndexOf, null);
            this.f40722g = true;
        }
    }

    void zy(long j2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        for (int i2 = 0; i2 < this.f87887toq.size(); i2++) {
            toq toqVar = this.f87887toq.get(i2);
            if (toqVar != null && f7l8(toqVar, jUptimeMillis)) {
                toqVar.doAnimationFrame(j2);
            }
        }
        toq();
    }
}
