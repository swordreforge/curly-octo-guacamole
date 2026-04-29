package androidx.room;

import android.annotation.SuppressLint;
import androidx.arch.core.executor.C0230k;
import androidx.lifecycle.LiveData;
import androidx.room.t8r;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import zy.y9n;

/* JADX INFO: compiled from: RoomTrackingLiveData.java */
/* JADX INFO: loaded from: classes.dex */
class fti<T> extends LiveData<T> {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    final t8r.zy f52344cdj;

    /* JADX INFO: renamed from: h */
    private final ki f6166h;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    final Callable<T> f52347kja0;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    final boolean f52348n7h;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    final AbstractC1141t f52349qrj;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    final AtomicBoolean f52346ki = new AtomicBoolean(true);

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    final AtomicBoolean f52350t8r = new AtomicBoolean(false);

    /* JADX INFO: renamed from: i */
    final AtomicBoolean f6167i = new AtomicBoolean(false);

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    final Runnable f52345fn3e = new RunnableC1126k();

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    final Runnable f52351zurt = new toq();

    /* JADX INFO: renamed from: androidx.room.fti$k */
    /* JADX INFO: compiled from: RoomTrackingLiveData.java */
    class RunnableC1126k implements Runnable {
        RunnableC1126k() {
        }

        @Override // java.lang.Runnable
        @y9n
        public void run() {
            boolean z2;
            if (fti.this.f6167i.compareAndSet(false, true)) {
                fti.this.f52349qrj.x2().toq(fti.this.f52344cdj);
            }
            do {
                if (fti.this.f52350t8r.compareAndSet(false, true)) {
                    T tCall = null;
                    z2 = false;
                    while (fti.this.f52346ki.compareAndSet(true, false)) {
                        try {
                            try {
                                tCall = fti.this.f52347kja0.call();
                                z2 = true;
                            } catch (Exception e2) {
                                throw new RuntimeException("Exception while computing database live data.", e2);
                            }
                        } finally {
                            fti.this.f52350t8r.set(false);
                        }
                    }
                    if (z2) {
                        fti.this.n7h(tCall);
                    }
                } else {
                    z2 = false;
                }
                if (!z2) {
                    return;
                }
            } while (fti.this.f52346ki.get());
        }
    }

    /* JADX INFO: compiled from: RoomTrackingLiveData.java */
    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        @zy.oc
        public void run() {
            boolean zM4393y = fti.this.m4393y();
            if (fti.this.f52346ki.compareAndSet(false, true) && zM4393y) {
                fti.this.t8r().execute(fti.this.f52345fn3e);
            }
        }
    }

    /* JADX INFO: compiled from: RoomTrackingLiveData.java */
    class zy extends t8r.zy {
        zy(String[] strArr) {
            super(strArr);
        }

        @Override // androidx.room.t8r.zy
        public void toq(@zy.lvui Set<String> set) {
            C0230k.m762g().toq(fti.this.f52351zurt);
        }
    }

    @SuppressLint({"RestrictedApi"})
    fti(AbstractC1141t abstractC1141t, ki kiVar, boolean z2, Callable<T> callable, String[] strArr) {
        this.f52349qrj = abstractC1141t;
        this.f52348n7h = z2;
        this.f52347kja0 = callable;
        this.f6166h = kiVar;
        this.f52344cdj = new zy(strArr);
    }

    @Override // androidx.lifecycle.LiveData
    protected void qrj() {
        super.qrj();
        this.f6166h.zy(this);
    }

    Executor t8r() {
        return this.f52348n7h ? this.f52349qrj.m5184h() : this.f52349qrj.n7h();
    }

    @Override // androidx.lifecycle.LiveData
    protected void x2() {
        super.x2();
        this.f6166h.toq(this);
        t8r().execute(this.f52345fn3e);
    }
}
