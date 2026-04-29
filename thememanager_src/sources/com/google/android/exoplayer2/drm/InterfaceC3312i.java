package com.google.android.exoplayer2.drm;

import android.os.Handler;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.util.concurrent.CopyOnWriteArrayList;
import zy.InterfaceC7839p;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.i */
/* JADX INFO: compiled from: DrmSessionEventListener.java */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC3312i {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.i$k */
    /* JADX INFO: compiled from: DrmSessionEventListener.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        public final int f19660k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        public final fti.C3596k f63617toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final CopyOnWriteArrayList<C7952k> f63618zy;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.drm.i$k$k, reason: collision with other inner class name */
        /* JADX INFO: compiled from: DrmSessionEventListener.java */
        private static final class C7952k {

            /* JADX INFO: renamed from: k */
            public Handler f19661k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            public InterfaceC3312i f63619toq;

            public C7952k(Handler handler, InterfaceC3312i interfaceC3312i) {
                this.f19661k = handler;
                this.f63619toq = interfaceC3312i;
            }
        }

        public k() {
            this(new CopyOnWriteArrayList(), 0, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void cdj(InterfaceC3312i interfaceC3312i, int i2) {
            interfaceC3312i.eqxt(this.f19660k, this.f63617toq);
            interfaceC3312i.zp(this.f19660k, this.f63617toq, i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public /* synthetic */ void m11630h(InterfaceC3312i interfaceC3312i) {
            interfaceC3312i.t8iq(this.f19660k, this.f63617toq);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ki(InterfaceC3312i interfaceC3312i, Exception exc) {
            interfaceC3312i.nn86(this.f19660k, this.f63617toq, exc);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void kja0(InterfaceC3312i interfaceC3312i) {
            interfaceC3312i.d3(this.f19660k, this.f63617toq);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n7h(InterfaceC3312i interfaceC3312i) {
            interfaceC3312i.mo11362b(this.f19660k, this.f63617toq);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void t8r(InterfaceC3312i interfaceC3312i) {
            interfaceC3312i.mo11376x(this.f19660k, this.f63617toq);
        }

        public void f7l8(Handler handler, InterfaceC3312i interfaceC3312i) {
            C3844k.f7l8(handler);
            C3844k.f7l8(interfaceC3312i);
            this.f63618zy.add(new C7952k(handler, interfaceC3312i));
        }

        @InterfaceC7839p
        public k fn3e(int i2, @zy.dd fti.C3596k c3596k) {
            return new k(this.f63618zy, i2, c3596k);
        }

        /* JADX INFO: renamed from: i */
        public void m11634i(InterfaceC3312i interfaceC3312i) {
            for (C7952k c7952k : this.f63618zy) {
                if (c7952k.f63619toq == interfaceC3312i) {
                    this.f63618zy.remove(c7952k);
                }
            }
        }

        public void ld6(final int i2) {
            for (C7952k c7952k : this.f63618zy) {
                final InterfaceC3312i interfaceC3312i = c7952k.f63619toq;
                lrht.gc3c(c7952k.f19661k, new Runnable() { // from class: com.google.android.exoplayer2.drm.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19657k.cdj(interfaceC3312i, i2);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: p */
        public void m11635p() {
            for (C7952k c7952k : this.f63618zy) {
                final InterfaceC3312i interfaceC3312i = c7952k.f63619toq;
                lrht.gc3c(c7952k.f19661k, new Runnable() { // from class: com.google.android.exoplayer2.drm.t8r
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19688k.m11630h(interfaceC3312i);
                    }
                });
            }
        }

        public void qrj() {
            for (C7952k c7952k : this.f63618zy) {
                final InterfaceC3312i interfaceC3312i = c7952k.f63619toq;
                lrht.gc3c(c7952k.f19661k, new Runnable() { // from class: com.google.android.exoplayer2.drm.n7h
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19672k.t8r(interfaceC3312i);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: s */
        public void m11636s() {
            for (C7952k c7952k : this.f63618zy) {
                final InterfaceC3312i interfaceC3312i = c7952k.f63619toq;
                lrht.gc3c(c7952k.f19661k, new Runnable() { // from class: com.google.android.exoplayer2.drm.cdj
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19631k.kja0(interfaceC3312i);
                    }
                });
            }
        }

        public void x2(final Exception exc) {
            for (C7952k c7952k : this.f63618zy) {
                final InterfaceC3312i interfaceC3312i = c7952k.f63619toq;
                lrht.gc3c(c7952k.f19661k, new Runnable() { // from class: com.google.android.exoplayer2.drm.kja0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19667k.ki(interfaceC3312i, exc);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: y */
        public void m11637y() {
            for (C7952k c7952k : this.f63618zy) {
                final InterfaceC3312i interfaceC3312i = c7952k.f63619toq;
                lrht.gc3c(c7952k.f19661k, new Runnable() { // from class: com.google.android.exoplayer2.drm.ki
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f19665k.n7h(interfaceC3312i);
                    }
                });
            }
        }

        private k(CopyOnWriteArrayList<C7952k> copyOnWriteArrayList, int i2, @zy.dd fti.C3596k c3596k) {
            this.f63618zy = copyOnWriteArrayList;
            this.f19660k = i2;
            this.f63617toq = c3596k;
        }
    }

    /* JADX INFO: renamed from: b */
    default void mo11362b(int i2, @zy.dd fti.C3596k c3596k) {
    }

    default void d3(int i2, @zy.dd fti.C3596k c3596k) {
    }

    @Deprecated
    default void eqxt(int i2, @zy.dd fti.C3596k c3596k) {
    }

    default void nn86(int i2, @zy.dd fti.C3596k c3596k, Exception exc) {
    }

    default void t8iq(int i2, @zy.dd fti.C3596k c3596k) {
    }

    /* JADX INFO: renamed from: x */
    default void mo11376x(int i2, @zy.dd fti.C3596k c3596k) {
    }

    default void zp(int i2, @zy.dd fti.C3596k c3596k, int i3) {
    }
}
