package androidx.recyclerview.widget;

import android.os.AsyncTask;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import androidx.recyclerview.widget.C1111r;
import androidx.recyclerview.widget.lvui;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: MessageThreadUtil.java */
/* JADX INFO: loaded from: classes.dex */
class ni7<T> implements lvui<T> {

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ni7$k */
    /* JADX INFO: compiled from: MessageThreadUtil.java */
    class C1103k implements lvui.toq<T> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        static final int f52231f7l8 = 2;

        /* JADX INFO: renamed from: g */
        static final int f5994g = 1;

        /* JADX INFO: renamed from: y */
        static final int f5995y = 3;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ lvui.toq f5998q;

        /* JADX INFO: renamed from: k */
        final zy f5996k = new zy();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Handler f52232toq = new Handler(Looper.getMainLooper());

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Runnable f52233zy = new k();

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ni7$k$k */
        /* JADX INFO: compiled from: MessageThreadUtil.java */
        class k implements Runnable {
            k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                C1104q c1104qM5082k = C1103k.this.f5996k.m5082k();
                while (c1104qM5082k != null) {
                    int i2 = c1104qM5082k.f52235toq;
                    if (i2 == 1) {
                        C1103k.this.f5998q.zy(c1104qM5082k.f52236zy, c1104qM5082k.f6005q);
                    } else if (i2 == 2) {
                        C1103k.this.f5998q.toq(c1104qM5082k.f52236zy, (C1111r.k) c1104qM5082k.f6006y);
                    } else if (i2 != 3) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + c1104qM5082k.f52235toq);
                    } else {
                        C1103k.this.f5998q.mo5045k(c1104qM5082k.f52236zy, c1104qM5082k.f6005q);
                    }
                    c1104qM5082k = C1103k.this.f5996k.m5082k();
                }
            }
        }

        C1103k(lvui.toq toqVar) {
            this.f5998q = toqVar;
        }

        /* JADX INFO: renamed from: q */
        private void m5077q(C1104q c1104q) {
            this.f5996k.zy(c1104q);
            this.f52232toq.post(this.f52233zy);
        }

        @Override // androidx.recyclerview.widget.lvui.toq
        /* JADX INFO: renamed from: k */
        public void mo5045k(int i2, int i3) {
            m5077q(C1104q.m5078k(3, i2, i3));
        }

        @Override // androidx.recyclerview.widget.lvui.toq
        public void toq(int i2, C1111r.k<T> kVar) {
            m5077q(C1104q.zy(2, i2, kVar));
        }

        @Override // androidx.recyclerview.widget.lvui.toq
        public void zy(int i2, int i3) {
            m5077q(C1104q.m5078k(1, i2, i3));
        }
    }

    /* JADX INFO: renamed from: androidx.recyclerview.widget.ni7$q */
    /* JADX INFO: compiled from: MessageThreadUtil.java */
    static class C1104q {

        /* JADX INFO: renamed from: p */
        private static final Object f6000p = new Object();

        /* JADX INFO: renamed from: s */
        private static C1104q f6001s;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public int f52234f7l8;

        /* JADX INFO: renamed from: g */
        public int f6002g;

        /* JADX INFO: renamed from: k */
        C1104q f6003k;

        /* JADX INFO: renamed from: n */
        public int f6004n;

        /* JADX INFO: renamed from: q */
        public int f6005q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public int f52235toq;

        /* JADX INFO: renamed from: y */
        public Object f6006y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public int f52236zy;

        C1104q() {
        }

        /* JADX INFO: renamed from: k */
        static C1104q m5078k(int i2, int i3, int i4) {
            return toq(i2, i3, i4, 0, 0, 0, null);
        }

        static C1104q toq(int i2, int i3, int i4, int i5, int i6, int i7, Object obj) {
            C1104q c1104q;
            synchronized (f6000p) {
                c1104q = f6001s;
                if (c1104q == null) {
                    c1104q = new C1104q();
                } else {
                    f6001s = c1104q.f6003k;
                    c1104q.f6003k = null;
                }
                c1104q.f52235toq = i2;
                c1104q.f52236zy = i3;
                c1104q.f6005q = i4;
                c1104q.f6004n = i5;
                c1104q.f6002g = i6;
                c1104q.f52234f7l8 = i7;
                c1104q.f6006y = obj;
            }
            return c1104q;
        }

        static C1104q zy(int i2, int i3, Object obj) {
            return toq(i2, i3, 0, 0, 0, 0, obj);
        }

        /* JADX INFO: renamed from: q */
        void m5079q() {
            this.f6003k = null;
            this.f52234f7l8 = 0;
            this.f6002g = 0;
            this.f6004n = 0;
            this.f6005q = 0;
            this.f52236zy = 0;
            this.f52235toq = 0;
            this.f6006y = null;
            synchronized (f6000p) {
                C1104q c1104q = f6001s;
                if (c1104q != null) {
                    this.f6003k = c1104q;
                }
                f6001s = this;
            }
        }
    }

    /* JADX INFO: compiled from: MessageThreadUtil.java */
    class toq implements lvui.InterfaceC1098k<T> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        static final int f52237f7l8 = 1;

        /* JADX INFO: renamed from: p */
        static final int f6007p = 4;

        /* JADX INFO: renamed from: s */
        static final int f6008s = 3;

        /* JADX INFO: renamed from: y */
        static final int f6009y = 2;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ lvui.InterfaceC1098k f6012n;

        /* JADX INFO: renamed from: k */
        final zy f6011k = new zy();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Executor f52238toq = AsyncTask.THREAD_POOL_EXECUTOR;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        AtomicBoolean f52239zy = new AtomicBoolean(false);

        /* JADX INFO: renamed from: q */
        private Runnable f6013q = new RunnableC1105k();

        /* JADX INFO: renamed from: androidx.recyclerview.widget.ni7$toq$k */
        /* JADX INFO: compiled from: MessageThreadUtil.java */
        class RunnableC1105k implements Runnable {
            RunnableC1105k() {
            }

            @Override // java.lang.Runnable
            public void run() {
                while (true) {
                    C1104q c1104qM5082k = toq.this.f6011k.m5082k();
                    if (c1104qM5082k == null) {
                        toq.this.f52239zy.set(false);
                        return;
                    }
                    int i2 = c1104qM5082k.f52235toq;
                    if (i2 == 1) {
                        toq.this.f6011k.toq(1);
                        toq.this.f6012n.zy(c1104qM5082k.f52236zy);
                    } else if (i2 == 2) {
                        toq.this.f6011k.toq(2);
                        toq.this.f6011k.toq(3);
                        toq.this.f6012n.mo5043k(c1104qM5082k.f52236zy, c1104qM5082k.f6005q, c1104qM5082k.f6004n, c1104qM5082k.f6002g, c1104qM5082k.f52234f7l8);
                    } else if (i2 == 3) {
                        toq.this.f6012n.toq(c1104qM5082k.f52236zy, c1104qM5082k.f6005q);
                    } else if (i2 != 4) {
                        Log.e("ThreadUtil", "Unsupported message, what=" + c1104qM5082k.f52235toq);
                    } else {
                        toq.this.f6012n.mo5044q((C1111r.k) c1104qM5082k.f6006y);
                    }
                }
            }
        }

        toq(lvui.InterfaceC1098k interfaceC1098k) {
            this.f6012n = interfaceC1098k;
        }

        private void f7l8(C1104q c1104q) {
            this.f6011k.m5083q(c1104q);
            m5081n();
        }

        /* JADX INFO: renamed from: g */
        private void m5080g(C1104q c1104q) {
            this.f6011k.zy(c1104q);
            m5081n();
        }

        /* JADX INFO: renamed from: n */
        private void m5081n() {
            if (this.f52239zy.compareAndSet(false, true)) {
                this.f52238toq.execute(this.f6013q);
            }
        }

        @Override // androidx.recyclerview.widget.lvui.InterfaceC1098k
        /* JADX INFO: renamed from: k */
        public void mo5043k(int i2, int i3, int i4, int i5, int i6) {
            f7l8(C1104q.toq(2, i2, i3, i4, i5, i6, null));
        }

        @Override // androidx.recyclerview.widget.lvui.InterfaceC1098k
        /* JADX INFO: renamed from: q */
        public void mo5044q(C1111r.k<T> kVar) {
            m5080g(C1104q.zy(4, 0, kVar));
        }

        @Override // androidx.recyclerview.widget.lvui.InterfaceC1098k
        public void toq(int i2, int i3) {
            m5080g(C1104q.m5078k(3, i2, i3));
        }

        @Override // androidx.recyclerview.widget.lvui.InterfaceC1098k
        public void zy(int i2) {
            f7l8(C1104q.zy(1, i2, null));
        }
    }

    /* JADX INFO: compiled from: MessageThreadUtil.java */
    static class zy {

        /* JADX INFO: renamed from: k */
        private C1104q f6015k;

        zy() {
        }

        /* JADX INFO: renamed from: k */
        synchronized C1104q m5082k() {
            C1104q c1104q = this.f6015k;
            if (c1104q == null) {
                return null;
            }
            this.f6015k = c1104q.f6003k;
            return c1104q;
        }

        /* JADX INFO: renamed from: q */
        synchronized void m5083q(C1104q c1104q) {
            c1104q.f6003k = this.f6015k;
            this.f6015k = c1104q;
        }

        synchronized void toq(int i2) {
            C1104q c1104q;
            while (true) {
                c1104q = this.f6015k;
                if (c1104q == null || c1104q.f52235toq != i2) {
                    break;
                }
                this.f6015k = c1104q.f6003k;
                c1104q.m5079q();
            }
            if (c1104q != null) {
                C1104q c1104q2 = c1104q.f6003k;
                while (c1104q2 != null) {
                    C1104q c1104q3 = c1104q2.f6003k;
                    if (c1104q2.f52235toq == i2) {
                        c1104q.f6003k = c1104q3;
                        c1104q2.m5079q();
                    } else {
                        c1104q = c1104q2;
                    }
                    c1104q2 = c1104q3;
                }
            }
        }

        synchronized void zy(C1104q c1104q) {
            C1104q c1104q2 = this.f6015k;
            if (c1104q2 == null) {
                this.f6015k = c1104q;
                return;
            }
            while (true) {
                C1104q c1104q3 = c1104q2.f6003k;
                if (c1104q3 == null) {
                    c1104q2.f6003k = c1104q;
                    return;
                }
                c1104q2 = c1104q3;
            }
        }
    }

    ni7() {
    }

    @Override // androidx.recyclerview.widget.lvui
    /* JADX INFO: renamed from: k */
    public lvui.InterfaceC1098k<T> mo5042k(lvui.InterfaceC1098k<T> interfaceC1098k) {
        return new toq(interfaceC1098k);
    }

    @Override // androidx.recyclerview.widget.lvui
    public lvui.toq<T> toq(lvui.toq<T> toqVar) {
        return new C1103k(toqVar);
    }
}
