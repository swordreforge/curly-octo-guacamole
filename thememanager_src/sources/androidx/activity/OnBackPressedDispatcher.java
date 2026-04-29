package androidx.activity;

import android.annotation.SuppressLint;
import androidx.lifecycle.InterfaceC0954z;
import androidx.lifecycle.fn3e;
import androidx.lifecycle.kja0;
import java.util.ArrayDeque;
import java.util.Iterator;
import zy.dd;
import zy.lvui;
import zy.oc;

/* JADX INFO: loaded from: classes.dex */
public final class OnBackPressedDispatcher {

    /* JADX INFO: renamed from: k */
    @dd
    private final Runnable f26k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    final ArrayDeque<zy> f46339toq;

    private class LifecycleOnBackPressedCancellable implements fn3e, toq {

        /* JADX INFO: renamed from: k */
        private final kja0 f28k;

        /* JADX INFO: renamed from: n */
        @dd
        private toq f29n;

        /* JADX INFO: renamed from: q */
        private final zy f30q;

        LifecycleOnBackPressedCancellable(@lvui kja0 kja0Var, @lvui zy zyVar) {
            this.f28k = kja0Var;
            this.f30q = zyVar;
            kja0Var.mo4451k(this);
        }

        @Override // androidx.activity.toq
        public void cancel() {
            this.f28k.zy(this);
            this.f30q.m90y(this);
            toq toqVar = this.f29n;
            if (toqVar != null) {
                toqVar.cancel();
                this.f29n = null;
            }
        }

        @Override // androidx.lifecycle.fn3e
        public void gvn7(@lvui InterfaceC0954z interfaceC0954z, @lvui kja0.toq toqVar) {
            if (toqVar == kja0.toq.ON_START) {
                this.f29n = OnBackPressedDispatcher.this.zy(this.f30q);
                return;
            }
            if (toqVar != kja0.toq.ON_STOP) {
                if (toqVar == kja0.toq.ON_DESTROY) {
                    cancel();
                }
            } else {
                toq toqVar2 = this.f29n;
                if (toqVar2 != null) {
                    toqVar2.cancel();
                }
            }
        }
    }

    /* JADX INFO: renamed from: androidx.activity.OnBackPressedDispatcher$k */
    private class C0045k implements toq {

        /* JADX INFO: renamed from: k */
        private final zy f31k;

        C0045k(zy zyVar) {
            this.f31k = zyVar;
        }

        @Override // androidx.activity.toq
        public void cancel() {
            OnBackPressedDispatcher.this.f46339toq.remove(this.f31k);
            this.f31k.m90y(this);
        }
    }

    public OnBackPressedDispatcher() {
        this(null);
    }

    @oc
    /* JADX INFO: renamed from: k */
    public void m12k(@lvui zy zyVar) {
        zy(zyVar);
    }

    @oc
    /* JADX INFO: renamed from: n */
    public void m13n() {
        Iterator<zy> itDescendingIterator = this.f46339toq.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            zy next = itDescendingIterator.next();
            if (next.m87g()) {
                next.mo21n();
                return;
            }
        }
        Runnable runnable = this.f26k;
        if (runnable != null) {
            runnable.run();
        }
    }

    @oc
    /* JADX INFO: renamed from: q */
    public boolean m14q() {
        Iterator<zy> itDescendingIterator = this.f46339toq.descendingIterator();
        while (itDescendingIterator.hasNext()) {
            if (itDescendingIterator.next().m87g()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"LambdaLast"})
    @oc
    public void toq(@lvui InterfaceC0954z interfaceC0954z, @lvui zy zyVar) {
        kja0 lifecycle = interfaceC0954z.getLifecycle();
        if (lifecycle.toq() == kja0.zy.DESTROYED) {
            return;
        }
        zyVar.m88q(new LifecycleOnBackPressedCancellable(lifecycle, zyVar));
    }

    @lvui
    @oc
    toq zy(@lvui zy zyVar) {
        this.f46339toq.add(zyVar);
        C0045k c0045k = new C0045k(zyVar);
        zyVar.m88q(c0045k);
        return c0045k;
    }

    public OnBackPressedDispatcher(@dd Runnable runnable) {
        this.f46339toq = new ArrayDeque<>();
        this.f26k = runnable;
    }
}
