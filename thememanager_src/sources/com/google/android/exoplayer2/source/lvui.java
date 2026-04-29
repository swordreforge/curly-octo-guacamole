package com.google.android.exoplayer2.source;

import android.os.Handler;
import com.google.android.exoplayer2.C3548p;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.xwq3;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArrayList;
import zy.InterfaceC7839p;

/* JADX INFO: compiled from: MediaSourceEventListener.java */
/* JADX INFO: loaded from: classes2.dex */
public interface lvui {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.lvui$k */
    /* JADX INFO: compiled from: MediaSourceEventListener.java */
    public static class C3611k {

        /* JADX INFO: renamed from: k */
        public final int f21599k;

        /* JADX INFO: renamed from: q */
        private final long f21600q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @zy.dd
        public final fti.C3596k f65422toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final CopyOnWriteArrayList<k> f65423zy;

        /* JADX INFO: renamed from: com.google.android.exoplayer2.source.lvui$k$k */
        /* JADX INFO: compiled from: MediaSourceEventListener.java */
        private static final class k {

            /* JADX INFO: renamed from: k */
            public Handler f21601k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            public lvui f65424toq;

            public k(Handler handler, lvui lvuiVar) {
                this.f21601k = handler;
                this.f65424toq = lvuiVar;
            }
        }

        public C3611k() {
            this(new CopyOnWriteArrayList(), 0, null, 0L);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: h */
        public /* synthetic */ void m12756h(lvui lvuiVar, fti.C3596k c3596k, wvg wvgVar) {
            lvuiVar.vyq(this.f21599k, c3596k, wvgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void kja0(lvui lvuiVar, ni7 ni7Var, wvg wvgVar) {
            lvuiVar.a9(this.f21599k, this.f65422toq, ni7Var, wvgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void ld6(lvui lvuiVar, wvg wvgVar) {
            lvuiVar.mo11366i(this.f21599k, this.f65422toq, wvgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void n7h(lvui lvuiVar, ni7 ni7Var, wvg wvgVar, IOException iOException, boolean z2) {
            lvuiVar.nmn5(this.f21599k, this.f65422toq, ni7Var, wvgVar, iOException, z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void qrj(lvui lvuiVar, ni7 ni7Var, wvg wvgVar) {
            lvuiVar.mo11361a(this.f21599k, this.f65422toq, ni7Var, wvgVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void x2(lvui lvuiVar, ni7 ni7Var, wvg wvgVar) {
            lvuiVar.zurt(this.f21599k, this.f65422toq, ni7Var, wvgVar);
        }

        /* JADX INFO: renamed from: y */
        private long m12760y(long j2) {
            long jZwy = com.google.android.exoplayer2.util.lrht.zwy(j2);
            return jZwy == C3548p.f65257toq ? C3548p.f65257toq : this.f21600q + jZwy;
        }

        public void a9(final wvg wvgVar) {
            final fti.C3596k c3596k = (fti.C3596k) C3844k.f7l8(this.f65422toq);
            for (k kVar : this.f65423zy) {
                final lvui lvuiVar = kVar.f65424toq;
                com.google.android.exoplayer2.util.lrht.gc3c(kVar.f21601k, new Runnable() { // from class: com.google.android.exoplayer2.source.d2ok
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21427k.m12756h(lvuiVar, c3596k, wvgVar);
                    }
                });
            }
        }

        public void cdj(ni7 ni7Var, int i2) {
            ki(ni7Var, i2, -1, null, 0, null, C3548p.f65257toq, C3548p.f65257toq);
        }

        public void f7l8(Handler handler, lvui lvuiVar) {
            C3844k.f7l8(handler);
            C3844k.f7l8(lvuiVar);
            this.f65423zy.add(new k(handler, lvuiVar));
        }

        public void fn3e(ni7 ni7Var, int i2, int i3, @zy.dd xwq3 xwq3Var, int i4, @zy.dd Object obj, long j2, long j3) {
            zurt(ni7Var, new wvg(i2, i3, xwq3Var, i4, obj, m12760y(j2), m12760y(j3)));
        }

        @InterfaceC7839p
        public C3611k fti(int i2, @zy.dd fti.C3596k c3596k, long j2) {
            return new C3611k(this.f65423zy, i2, c3596k, j2);
        }

        public void fu4(ni7 ni7Var, int i2, IOException iOException, boolean z2) {
            ni7(ni7Var, i2, -1, null, 0, null, C3548p.f65257toq, C3548p.f65257toq, iOException, z2);
        }

        /* JADX INFO: renamed from: i */
        public void m12761i(ni7 ni7Var, int i2) {
            fn3e(ni7Var, i2, -1, null, 0, null, C3548p.f65257toq, C3548p.f65257toq);
        }

        public void jk(int i2, long j2, long j3) {
            a9(new wvg(1, i2, null, 3, null, m12760y(j2), m12760y(j3)));
        }

        public void ki(ni7 ni7Var, int i2, int i3, @zy.dd xwq3 xwq3Var, int i4, @zy.dd Object obj, long j2, long j3) {
            t8r(ni7Var, new wvg(i2, i3, xwq3Var, i4, obj, m12760y(j2), m12760y(j3)));
        }

        public void mcp(lvui lvuiVar) {
            for (k kVar : this.f65423zy) {
                if (kVar.f65424toq == lvuiVar) {
                    this.f65423zy.remove(kVar);
                }
            }
        }

        public void ni7(ni7 ni7Var, int i2, int i3, @zy.dd xwq3 xwq3Var, int i4, @zy.dd Object obj, long j2, long j3, IOException iOException, boolean z2) {
            m12765z(ni7Var, new wvg(i2, i3, xwq3Var, i4, obj, m12760y(j2), m12760y(j3)), iOException, z2);
        }

        public void o1t(ni7 ni7Var, int i2) {
            wvg(ni7Var, i2, -1, null, 0, null, C3548p.f65257toq, C3548p.f65257toq);
        }

        /* JADX INFO: renamed from: p */
        public void m12762p(final wvg wvgVar) {
            for (k kVar : this.f65423zy) {
                final lvui lvuiVar = kVar.f65424toq;
                com.google.android.exoplayer2.util.lrht.gc3c(kVar.f21601k, new Runnable() { // from class: com.google.android.exoplayer2.source.gvn7
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21534k.ld6(lvuiVar, wvgVar);
                    }
                });
            }
        }

        /* JADX INFO: renamed from: s */
        public void m12763s(int i2, @zy.dd xwq3 xwq3Var, int i3, @zy.dd Object obj, long j2) {
            m12762p(new wvg(1, i2, xwq3Var, i3, obj, m12760y(j2), C3548p.f65257toq));
        }

        /* JADX INFO: renamed from: t */
        public void m12764t(final ni7 ni7Var, final wvg wvgVar) {
            for (k kVar : this.f65423zy) {
                final lvui lvuiVar = kVar.f65424toq;
                com.google.android.exoplayer2.util.lrht.gc3c(kVar.f21601k, new Runnable() { // from class: com.google.android.exoplayer2.source.jp0y
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21555k.kja0(lvuiVar, ni7Var, wvgVar);
                    }
                });
            }
        }

        public void t8r(final ni7 ni7Var, final wvg wvgVar) {
            for (k kVar : this.f65423zy) {
                final lvui lvuiVar = kVar.f65424toq;
                com.google.android.exoplayer2.util.lrht.gc3c(kVar.f21601k, new Runnable() { // from class: com.google.android.exoplayer2.source.eqxt
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21474k.x2(lvuiVar, ni7Var, wvgVar);
                    }
                });
            }
        }

        public void wvg(ni7 ni7Var, int i2, int i3, @zy.dd xwq3 xwq3Var, int i4, @zy.dd Object obj, long j2, long j3) {
            m12764t(ni7Var, new wvg(i2, i3, xwq3Var, i4, obj, m12760y(j2), m12760y(j3)));
        }

        /* JADX INFO: renamed from: z */
        public void m12765z(final ni7 ni7Var, final wvg wvgVar, final IOException iOException, final boolean z2) {
            for (k kVar : this.f65423zy) {
                final lvui lvuiVar = kVar.f65424toq;
                com.google.android.exoplayer2.util.lrht.gc3c(kVar.f21601k, new Runnable() { // from class: com.google.android.exoplayer2.source.d3
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21431k.n7h(lvuiVar, ni7Var, wvgVar, iOException, z2);
                    }
                });
            }
        }

        public void zurt(final ni7 ni7Var, final wvg wvgVar) {
            for (k kVar : this.f65423zy) {
                final lvui lvuiVar = kVar.f65424toq;
                com.google.android.exoplayer2.util.lrht.gc3c(kVar.f21601k, new Runnable() { // from class: com.google.android.exoplayer2.source.oc
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21676k.qrj(lvuiVar, ni7Var, wvgVar);
                    }
                });
            }
        }

        private C3611k(CopyOnWriteArrayList<k> copyOnWriteArrayList, int i2, @zy.dd fti.C3596k c3596k, long j2) {
            this.f65423zy = copyOnWriteArrayList;
            this.f21599k = i2;
            this.f65422toq = c3596k;
            this.f21600q = j2;
        }
    }

    /* JADX INFO: renamed from: a */
    default void mo11361a(int i2, @zy.dd fti.C3596k c3596k, ni7 ni7Var, wvg wvgVar) {
    }

    default void a9(int i2, @zy.dd fti.C3596k c3596k, ni7 ni7Var, wvg wvgVar) {
    }

    /* JADX INFO: renamed from: i */
    default void mo11366i(int i2, @zy.dd fti.C3596k c3596k, wvg wvgVar) {
    }

    default void nmn5(int i2, @zy.dd fti.C3596k c3596k, ni7 ni7Var, wvg wvgVar, IOException iOException, boolean z2) {
    }

    default void vyq(int i2, fti.C3596k c3596k, wvg wvgVar) {
    }

    default void zurt(int i2, @zy.dd fti.C3596k c3596k, ni7 ni7Var, wvg wvgVar) {
    }
}
