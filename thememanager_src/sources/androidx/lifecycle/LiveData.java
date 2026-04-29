package androidx.lifecycle;

import androidx.arch.core.executor.C0230k;
import androidx.lifecycle.kja0;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class LiveData<T> {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    static final int f51562ld6 = -1;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    static final Object f51563x2 = new Object();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f51564f7l8;

    /* JADX INFO: renamed from: g */
    volatile Object f5011g;

    /* JADX INFO: renamed from: k */
    final Object f5012k;

    /* JADX INFO: renamed from: n */
    private volatile Object f5013n;

    /* JADX INFO: renamed from: p */
    private final Runnable f5014p;

    /* JADX INFO: renamed from: q */
    private boolean f5015q;

    /* JADX INFO: renamed from: s */
    private boolean f5016s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private androidx.arch.core.internal.toq<jp0y<? super T>, LiveData<T>.zy> f51565toq;

    /* JADX INFO: renamed from: y */
    private boolean f5017y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    int f51566zy;

    class LifecycleBoundObserver extends LiveData<T>.zy implements fn3e {

        /* JADX INFO: renamed from: y */
        @zy.lvui
        final InterfaceC0954z f5019y;

        LifecycleBoundObserver(@zy.lvui InterfaceC0954z interfaceC0954z, jp0y<? super T> jp0yVar) {
            super(jp0yVar);
            this.f5019y = interfaceC0954z;
        }

        @Override // androidx.lifecycle.fn3e
        public void gvn7(@zy.lvui InterfaceC0954z interfaceC0954z, @zy.lvui kja0.toq toqVar) {
            kja0.zy qVar = this.f5019y.getLifecycle().toq();
            if (qVar == kja0.zy.DESTROYED) {
                LiveData.this.kja0(this.f5023k);
                return;
            }
            kja0.zy zyVar = null;
            while (zyVar != qVar) {
                m4395k(mo4394q());
                zyVar = qVar;
                qVar = this.f5019y.getLifecycle().toq();
            }
        }

        @Override // androidx.lifecycle.LiveData.zy
        /* JADX INFO: renamed from: q */
        boolean mo4394q() {
            return this.f5019y.getLifecycle().toq().isAtLeast(kja0.zy.STARTED);
        }

        @Override // androidx.lifecycle.LiveData.zy
        void toq() {
            this.f5019y.getLifecycle().zy(this);
        }

        @Override // androidx.lifecycle.LiveData.zy
        boolean zy(InterfaceC0954z interfaceC0954z) {
            return this.f5019y == interfaceC0954z;
        }
    }

    /* JADX INFO: renamed from: androidx.lifecycle.LiveData$k */
    class RunnableC0916k implements Runnable {
        RunnableC0916k() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Object obj;
            synchronized (LiveData.this.f5012k) {
                obj = LiveData.this.f5011g;
                LiveData.this.f5011g = LiveData.f51563x2;
            }
            LiveData.this.cdj(obj);
        }
    }

    private class toq extends LiveData<T>.zy {
        toq(jp0y<? super T> jp0yVar) {
            super(jp0yVar);
        }

        @Override // androidx.lifecycle.LiveData.zy
        /* JADX INFO: renamed from: q */
        boolean mo4394q() {
            return true;
        }
    }

    private abstract class zy {

        /* JADX INFO: renamed from: k */
        final jp0y<? super T> f5023k;

        /* JADX INFO: renamed from: n */
        int f5024n = -1;

        /* JADX INFO: renamed from: q */
        boolean f5025q;

        zy(jp0y<? super T> jp0yVar) {
            this.f5023k = jp0yVar;
        }

        /* JADX INFO: renamed from: k */
        void m4395k(boolean z2) {
            if (z2 == this.f5025q) {
                return;
            }
            this.f5025q = z2;
            LiveData.this.zy(z2 ? 1 : -1);
            if (this.f5025q) {
                LiveData.this.m4390n(this);
            }
        }

        /* JADX INFO: renamed from: q */
        abstract boolean mo4394q();

        void toq() {
        }

        boolean zy(InterfaceC0954z interfaceC0954z) {
            return false;
        }
    }

    public LiveData(T t2) {
        this.f5012k = new Object();
        this.f51565toq = new androidx.arch.core.internal.toq<>();
        this.f51566zy = 0;
        this.f5011g = f51563x2;
        this.f5014p = new RunnableC0916k();
        this.f5013n = t2;
        this.f51564f7l8 = 0;
    }

    /* JADX INFO: renamed from: q */
    private void m4387q(LiveData<T>.zy zyVar) {
        if (zyVar.f5025q) {
            if (!zyVar.mo4394q()) {
                zyVar.m4395k(false);
                return;
            }
            int i2 = zyVar.f5024n;
            int i3 = this.f51564f7l8;
            if (i2 >= i3) {
                return;
            }
            zyVar.f5024n = i3;
            zyVar.f5023k.toq((Object) this.f5013n);
        }
    }

    static void toq(String str) {
        if (C0230k.m762g().zy()) {
            return;
        }
        throw new IllegalStateException("Cannot invoke " + str + " on a background thread");
    }

    @zy.oc
    protected void cdj(T t2) {
        toq("setValue");
        this.f51564f7l8++;
        this.f5013n = t2;
        m4390n(null);
    }

    int f7l8() {
        return this.f51564f7l8;
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    public T m4388g() {
        T t2 = (T) this.f5013n;
        if (t2 != f51563x2) {
            return t2;
        }
        return null;
    }

    @zy.oc
    /* JADX INFO: renamed from: h */
    public void m4389h(@zy.lvui InterfaceC0954z interfaceC0954z) {
        toq("removeObservers");
        for (Map.Entry<jp0y<? super T>, LiveData<T>.zy> entry : this.f51565toq) {
            if (entry.getValue().zy(interfaceC0954z)) {
                kja0(entry.getKey());
            }
        }
    }

    @zy.oc
    public void kja0(@zy.lvui jp0y<? super T> jp0yVar) {
        toq("removeObserver");
        LiveData<T>.zy zyVarMo770y = this.f51565toq.mo770y(jp0yVar);
        if (zyVarMo770y == null) {
            return;
        }
        zyVarMo770y.toq();
        zyVarMo770y.m4395k(false);
    }

    @zy.oc
    public void ld6(@zy.lvui jp0y<? super T> jp0yVar) {
        toq("observeForever");
        toq toqVar = new toq(jp0yVar);
        LiveData<T>.zy zyVarF7l8 = this.f51565toq.f7l8(jp0yVar, toqVar);
        if (zyVarF7l8 instanceof LifecycleBoundObserver) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (zyVarF7l8 != null) {
            return;
        }
        toqVar.m4395k(true);
    }

    /* JADX INFO: renamed from: n */
    void m4390n(@zy.dd LiveData<T>.zy zyVar) {
        if (this.f5017y) {
            this.f5016s = true;
            return;
        }
        this.f5017y = true;
        do {
            this.f5016s = false;
            if (zyVar != null) {
                m4387q(zyVar);
                zyVar = null;
            } else {
                androidx.arch.core.internal.toq<jp0y<? super T>, LiveData<T>.zy>.C0237q c0237qZy = this.f51565toq.zy();
                while (c0237qZy.hasNext()) {
                    m4387q((zy) c0237qZy.next().getValue());
                    if (this.f5016s) {
                        break;
                    }
                }
            }
        } while (this.f5016s);
        this.f5017y = false;
    }

    protected void n7h(T t2) {
        boolean z2;
        synchronized (this.f5012k) {
            z2 = this.f5011g == f51563x2;
            this.f5011g = t2;
        }
        if (z2) {
            C0230k.m762g().mo765q(this.f5014p);
        }
    }

    @zy.oc
    /* JADX INFO: renamed from: p */
    public void m4391p(@zy.lvui InterfaceC0954z interfaceC0954z, @zy.lvui jp0y<? super T> jp0yVar) {
        toq("observe");
        if (interfaceC0954z.getLifecycle().toq() == kja0.zy.DESTROYED) {
            return;
        }
        LifecycleBoundObserver lifecycleBoundObserver = new LifecycleBoundObserver(interfaceC0954z, jp0yVar);
        LiveData<T>.zy zyVarF7l8 = this.f51565toq.f7l8(jp0yVar, lifecycleBoundObserver);
        if (zyVarF7l8 != null && !zyVarF7l8.zy(interfaceC0954z)) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (zyVarF7l8 != null) {
            return;
        }
        interfaceC0954z.getLifecycle().mo4451k(lifecycleBoundObserver);
    }

    protected void qrj() {
    }

    /* JADX INFO: renamed from: s */
    public boolean m4392s() {
        return this.f51565toq.size() > 0;
    }

    protected void x2() {
    }

    /* JADX INFO: renamed from: y */
    public boolean m4393y() {
        return this.f51566zy > 0;
    }

    @zy.oc
    void zy(int i2) {
        int i3 = this.f51566zy;
        this.f51566zy = i2 + i3;
        if (this.f5015q) {
            return;
        }
        this.f5015q = true;
        while (true) {
            try {
                int i4 = this.f51566zy;
                if (i3 == i4) {
                    return;
                }
                boolean z2 = i3 == 0 && i4 > 0;
                boolean z3 = i3 > 0 && i4 == 0;
                if (z2) {
                    x2();
                } else if (z3) {
                    qrj();
                }
                i3 = i4;
            } finally {
                this.f5015q = false;
            }
        }
    }

    public LiveData() {
        this.f5012k = new Object();
        this.f51565toq = new androidx.arch.core.internal.toq<>();
        this.f51566zy = 0;
        Object obj = f51563x2;
        this.f5011g = obj;
        this.f5014p = new RunnableC0916k();
        this.f5013n = obj;
        this.f51564f7l8 = -1;
    }
}
