package com.google.android.exoplayer2.offline;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.offline.InterfaceC3545z;
import com.google.android.exoplayer2.scheduler.Requirements;
import com.google.android.exoplayer2.scheduler.toq;
import com.google.android.exoplayer2.upstream.cache.InterfaceC3775k;
import com.google.android.exoplayer2.upstream.cache.zy;
import com.google.android.exoplayer2.upstream.kja0;
import com.google.android.exoplayer2.util.C3844k;
import com.google.android.exoplayer2.util.lrht;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executor;
import zy.InterfaceC7839p;
import zy.dd;

/* JADX INFO: compiled from: DownloadManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t8r {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    private static final int f65053a9 = 8;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final int f65054cdj = 3;

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    private static final int f65055d3 = 12;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f65056fn3e = 1;

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    private static final int f65057fti = 9;

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final int f65058fu4 = 1;

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    private static final int f65059gvn7 = 11;

    /* JADX INFO: renamed from: i */
    private static final int f21009i = 0;

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    private static final int f65060jk = 7;

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    private static final int f65061jp0y = 10;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f65062ki = 5;

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    private static final int f65063mcp = 6;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f65064ni7 = 0;

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    private static final int f65065o1t = 3;

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    private static final String f65066oc = "DownloadManager";

    /* JADX INFO: renamed from: t */
    private static final int f21010t = 5;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final Requirements f65067t8r = new Requirements(1);

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    private static final int f65068wvg = 4;

    /* JADX INFO: renamed from: z */
    private static final int f21011z = 2;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f65069zurt = 2;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f65070f7l8;

    /* JADX INFO: renamed from: g */
    private final CopyOnWriteArraySet<InterfaceC3542q> f21012g;

    /* JADX INFO: renamed from: h */
    private com.google.android.exoplayer2.scheduler.toq f21013h;

    /* JADX INFO: renamed from: k */
    private final Context f21014k;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private List<C3531n> f65071kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private int f65072ld6;

    /* JADX INFO: renamed from: n */
    private final toq.zy f21015n;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private boolean f65073n7h;

    /* JADX INFO: renamed from: p */
    private boolean f21016p;

    /* JADX INFO: renamed from: q */
    private final zy f21017q;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private int f65074qrj;

    /* JADX INFO: renamed from: s */
    private boolean f21018s;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final fti f65075toq;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private int f65076x2;

    /* JADX INFO: renamed from: y */
    private int f21019y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Handler f65077zy;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.t8r$n */
    /* JADX INFO: compiled from: DownloadManager.java */
    private static class C3541n extends Thread implements InterfaceC3545z.k {

        /* JADX INFO: renamed from: g */
        private final boolean f21020g;

        /* JADX INFO: renamed from: h */
        @dd
        private Exception f21021h;

        /* JADX INFO: renamed from: i */
        private long f21022i;

        /* JADX INFO: renamed from: k */
        private final DownloadRequest f21023k;

        /* JADX INFO: renamed from: n */
        private final fn3e f21024n;

        /* JADX INFO: renamed from: p */
        private volatile boolean f21025p;

        /* JADX INFO: renamed from: q */
        private final InterfaceC3545z f21026q;

        /* JADX INFO: renamed from: s */
        @dd
        private volatile zy f21027s;

        /* JADX INFO: renamed from: y */
        private final int f21028y;

        private static int f7l8(int i2) {
            return Math.min((i2 - 1) * 1000, 5000);
        }

        /* JADX INFO: renamed from: g */
        public void m12434g(boolean z2) {
            if (z2) {
                this.f21027s = null;
            }
            if (this.f21025p) {
                return;
            }
            this.f21025p = true;
            this.f21026q.cancel();
            interrupt();
        }

        @Override // com.google.android.exoplayer2.offline.InterfaceC3545z.k
        /* JADX INFO: renamed from: k */
        public void mo12435k(long j2, long j3, float f2) {
            this.f21024n.f20954k = j3;
            this.f21024n.f65025toq = f2;
            if (j2 != this.f21022i) {
                this.f21022i = j2;
                zy zyVar = this.f21027s;
                if (zyVar != null) {
                    zyVar.obtainMessage(10, (int) (j2 >> 32), (int) j2, this).sendToTarget();
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                if (this.f21020g) {
                    this.f21026q.remove();
                } else {
                    long j2 = -1;
                    int i2 = 0;
                    while (!this.f21025p) {
                        try {
                            this.f21026q.mo12370k(this);
                            break;
                        } catch (IOException e2) {
                            if (!this.f21025p) {
                                long j3 = this.f21024n.f20954k;
                                if (j3 != j2) {
                                    i2 = 0;
                                    j2 = j3;
                                }
                                i2++;
                                if (i2 > this.f21028y) {
                                    throw e2;
                                }
                                Thread.sleep(f7l8(i2));
                            }
                        }
                    }
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            } catch (Exception e3) {
                this.f21021h = e3;
            }
            zy zyVar = this.f21027s;
            if (zyVar != null) {
                zyVar.obtainMessage(9, this).sendToTarget();
            }
        }

        private C3541n(DownloadRequest downloadRequest, InterfaceC3545z interfaceC3545z, fn3e fn3eVar, boolean z2, int i2, zy zyVar) {
            this.f21023k = downloadRequest;
            this.f21026q = interfaceC3545z;
            this.f21024n = fn3eVar;
            this.f21020g = z2;
            this.f21028y = i2;
            this.f21027s = zyVar;
            this.f21022i = -1L;
        }
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.offline.t8r$q */
    /* JADX INFO: compiled from: DownloadManager.java */
    public interface InterfaceC3542q {
        default void f7l8(t8r t8rVar) {
        }

        /* JADX INFO: renamed from: g */
        default void mo12436g(t8r t8rVar) {
        }

        /* JADX INFO: renamed from: k */
        default void mo12437k(t8r t8rVar, boolean z2) {
        }

        /* JADX INFO: renamed from: n */
        default void mo12438n(t8r t8rVar, Requirements requirements, int i2) {
        }

        /* JADX INFO: renamed from: q */
        default void m12439q(t8r t8rVar, boolean z2) {
        }

        default void toq(t8r t8rVar, C3531n c3531n, @dd Exception exc) {
        }

        default void zy(t8r t8rVar, C3531n c3531n) {
        }
    }

    /* JADX INFO: compiled from: DownloadManager.java */
    private static final class toq {

        /* JADX INFO: renamed from: k */
        public final C3531n f21029k;

        /* JADX INFO: renamed from: q */
        @dd
        public final Exception f21030q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public final boolean f65078toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        public final List<C3531n> f65079zy;

        public toq(C3531n c3531n, boolean z2, List<C3531n> list, @dd Exception exc) {
            this.f21029k = c3531n;
            this.f65078toq = z2;
            this.f65079zy = list;
            this.f21030q = exc;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: compiled from: DownloadManager.java */
    static final class zy extends Handler {

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private static final int f65080qrj = 5000;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final HashMap<String, C3541n> f65081f7l8;

        /* JADX INFO: renamed from: g */
        private final ArrayList<C3531n> f21031g;

        /* JADX INFO: renamed from: k */
        public boolean f21032k;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private int f65082ld6;

        /* JADX INFO: renamed from: n */
        private final Handler f21033n;

        /* JADX INFO: renamed from: p */
        private int f21034p;

        /* JADX INFO: renamed from: q */
        private final o1t f21035q;

        /* JADX INFO: renamed from: s */
        private boolean f21036s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final HandlerThread f65083toq;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private int f65084x2;

        /* JADX INFO: renamed from: y */
        private int f21037y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private final fti f65085zy;

        public zy(HandlerThread handlerThread, fti ftiVar, o1t o1tVar, Handler handler, int i2, int i3, boolean z2) {
            super(handlerThread.getLooper());
            this.f65083toq = handlerThread;
            this.f65085zy = ftiVar;
            this.f21035q = o1tVar;
            this.f21033n = handler;
            this.f21034p = i2;
            this.f65082ld6 = i3;
            this.f21036s = z2;
            this.f21031g = new ArrayList<>();
            this.f65081f7l8 = new HashMap<>();
        }

        private void cdj(String str) {
            C3531n c3531nM12440g = m12440g(str, true);
            if (c3531nM12440g == null) {
                String strValueOf = String.valueOf(str);
                com.google.android.exoplayer2.util.ni7.m13702q(t8r.f65066oc, strValueOf.length() != 0 ? "Failed to remove nonexistent download: ".concat(strValueOf) : new String("Failed to remove nonexistent download: "));
            } else {
                n7h(c3531nM12440g, 5, 0);
                m12448t();
            }
        }

        private int f7l8(String str) {
            for (int i2 = 0; i2 < this.f21031g.size(); i2++) {
                if (this.f21031g.get(i2).f20973k.f20919k.equals(str)) {
                    return i2;
                }
            }
            return -1;
        }

        private void fn3e(int i2) {
            this.f21037y = i2;
            m12448t();
        }

        private void fu4(C3541n c3541n, C3531n c3531n, int i2) {
            C3844k.m13633s(!c3541n.f21020g);
            if (!zy() || i2 >= this.f21034p) {
                n7h(c3531n, 0, 0);
                c3541n.m12434g(false);
            }
        }

        @dd
        /* JADX INFO: renamed from: g */
        private C3531n m12440g(String str, boolean z2) {
            int iF7l8 = f7l8(str);
            if (iF7l8 != -1) {
                return this.f21031g.get(iF7l8);
            }
            if (!z2) {
                return null;
            }
            try {
                return this.f65085zy.f7l8(str);
            } catch (IOException e2) {
                String strValueOf = String.valueOf(str);
                com.google.android.exoplayer2.util.ni7.m13700n(t8r.f65066oc, strValueOf.length() != 0 ? "Failed to load download: ".concat(strValueOf) : new String("Failed to load download: "), e2);
                return null;
            }
        }

        /* JADX INFO: renamed from: h */
        private void m12441h() {
            ArrayList arrayList = new ArrayList();
            try {
                InterfaceC3526g interfaceC3526gMo12383q = this.f65085zy.mo12383q(3, 4);
                while (interfaceC3526gMo12383q.moveToNext()) {
                    try {
                        arrayList.add(interfaceC3526gMo12383q.mo12382u());
                    } finally {
                    }
                }
                interfaceC3526gMo12383q.close();
            } catch (IOException unused) {
                com.google.android.exoplayer2.util.ni7.m13702q(t8r.f65066oc, "Failed to load downloads.");
            }
            for (int i2 = 0; i2 < this.f21031g.size(); i2++) {
                ArrayList<C3531n> arrayList2 = this.f21031g;
                arrayList2.set(i2, m12444n(arrayList2.get(i2), 5, 0));
            }
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                this.f21031g.add(m12444n((C3531n) arrayList.get(i3), 5, 0));
            }
            Collections.sort(this.f21031g, new C3528i());
            try {
                this.f65085zy.mo12380n();
            } catch (IOException e2) {
                com.google.android.exoplayer2.util.ni7.m13700n(t8r.f65066oc, "Failed to update index.", e2);
            }
            ArrayList arrayList3 = new ArrayList(this.f21031g);
            for (int i4 = 0; i4 < this.f21031g.size(); i4++) {
                this.f21033n.obtainMessage(2, new toq(this.f21031g.get(i4), false, arrayList3, null)).sendToTarget();
            }
            m12448t();
        }

        /* JADX INFO: renamed from: i */
        private void m12442i(int i2) {
            this.f65082ld6 = i2;
        }

        private void ki(boolean z2) {
            this.f21036s = z2;
            m12448t();
        }

        private void kja0() {
            Iterator<C3541n> it = this.f65081f7l8.values().iterator();
            while (it.hasNext()) {
                it.next().m12434g(true);
            }
            try {
                this.f65085zy.mo12378g();
            } catch (IOException e2) {
                com.google.android.exoplayer2.util.ni7.m13700n(t8r.f65066oc, "Failed to update index.", e2);
            }
            this.f21031g.clear();
            this.f65083toq.quit();
            synchronized (this) {
                this.f21032k = true;
                notifyAll();
            }
        }

        private void ld6(C3531n c3531n) {
            if (c3531n.f65039toq == 7) {
                int i2 = c3531n.f20972g;
                n7h(c3531n, i2 == 0 ? 0 : 1, i2);
                m12448t();
            } else {
                this.f21031g.remove(f7l8(c3531n.f20973k.f20919k));
                try {
                    this.f65085zy.toq(c3531n.f20973k.f20919k);
                } catch (IOException unused) {
                    com.google.android.exoplayer2.util.ni7.m13702q(t8r.f65066oc, "Failed to remove from database");
                }
                this.f21033n.obtainMessage(2, new toq(c3531n, true, new ArrayList(this.f21031g), null)).sendToTarget();
            }
        }

        private void mcp() {
            for (int i2 = 0; i2 < this.f21031g.size(); i2++) {
                C3531n c3531n = this.f21031g.get(i2);
                if (c3531n.f65039toq == 2) {
                    try {
                        this.f65085zy.mo12381y(c3531n);
                    } catch (IOException e2) {
                        com.google.android.exoplayer2.util.ni7.m13700n(t8r.f65066oc, "Failed to update index.", e2);
                    }
                }
            }
            sendEmptyMessageDelayed(11, 5000L);
        }

        /* JADX INFO: renamed from: n */
        private static C3531n m12444n(C3531n c3531n, int i2, int i3) {
            return new C3531n(c3531n.f20973k, i2, c3531n.f65040zy, System.currentTimeMillis(), c3531n.f20974n, i3, 0, c3531n.f20976y);
        }

        private C3531n n7h(C3531n c3531n, int i2, int i3) {
            C3844k.m13633s((i2 == 3 || i2 == 4) ? false : true);
            return qrj(m12444n(c3531n, i2, i3));
        }

        private void ni7(@dd String str, int i2) {
            if (str == null) {
                for (int i3 = 0; i3 < this.f21031g.size(); i3++) {
                    zurt(this.f21031g.get(i3), i2);
                }
                try {
                    this.f65085zy.zy(i2);
                } catch (IOException e2) {
                    com.google.android.exoplayer2.util.ni7.m13700n(t8r.f65066oc, "Failed to set manual stop reason", e2);
                }
            } else {
                C3531n c3531nM12440g = m12440g(str, false);
                if (c3531nM12440g != null) {
                    zurt(c3531nM12440g, i2);
                } else {
                    try {
                        this.f65085zy.mo12379k(str, i2);
                    } catch (IOException e3) {
                        com.google.android.exoplayer2.util.ni7.m13700n(t8r.f65066oc, str.length() != 0 ? "Failed to set manual stop reason: ".concat(str) : new String("Failed to set manual stop reason: "), e3);
                    }
                }
            }
            m12448t();
        }

        private void o1t(@dd C3541n c3541n, C3531n c3531n) {
            if (c3541n != null) {
                if (c3541n.f21020g) {
                    return;
                }
                c3541n.m12434g(false);
            } else {
                C3541n c3541n2 = new C3541n(c3531n.f20973k, this.f21035q.mo12418k(c3531n.f20973k), c3531n.f20976y, true, this.f65082ld6, this);
                this.f65081f7l8.put(c3531n.f20973k.f20919k, c3541n2);
                c3541n2.start();
            }
        }

        /* JADX INFO: renamed from: p */
        private void m12445p(C3531n c3531n, @dd Exception exc) {
            C3531n c3531n2 = new C3531n(c3531n.f20973k, exc == null ? 3 : 4, c3531n.f65040zy, System.currentTimeMillis(), c3531n.f20974n, c3531n.f20972g, exc == null ? 0 : 1, c3531n.f20976y);
            this.f21031g.remove(f7l8(c3531n2.f20973k.f20919k));
            try {
                this.f65085zy.mo12381y(c3531n2);
            } catch (IOException e2) {
                com.google.android.exoplayer2.util.ni7.m13700n(t8r.f65066oc, "Failed to update index.", e2);
            }
            this.f21033n.obtainMessage(2, new toq(c3531n2, false, new ArrayList(this.f21031g), exc)).sendToTarget();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: q */
        public static int m12446q(C3531n c3531n, C3531n c3531n2) {
            return lrht.cdj(c3531n.f65040zy, c3531n2.f65040zy);
        }

        private C3531n qrj(C3531n c3531n) {
            int i2 = c3531n.f65039toq;
            C3844k.m13633s((i2 == 3 || i2 == 4) ? false : true);
            int iF7l8 = f7l8(c3531n.f20973k.f20919k);
            if (iF7l8 == -1) {
                this.f21031g.add(c3531n);
                Collections.sort(this.f21031g, new C3528i());
            } else {
                boolean z2 = c3531n.f65040zy != this.f21031g.get(iF7l8).f65040zy;
                this.f21031g.set(iF7l8, c3531n);
                if (z2) {
                    Collections.sort(this.f21031g, new C3528i());
                }
            }
            try {
                this.f65085zy.mo12381y(c3531n);
            } catch (IOException e2) {
                com.google.android.exoplayer2.util.ni7.m13700n(t8r.f65066oc, "Failed to update index.", e2);
            }
            this.f21033n.obtainMessage(2, new toq(c3531n, false, new ArrayList(this.f21031g), null)).sendToTarget();
            return c3531n;
        }

        /* JADX INFO: renamed from: s */
        private void m12447s(C3541n c3541n, long j2) {
            C3531n c3531n = (C3531n) C3844k.f7l8(m12440g(c3541n.f21023k.f20919k, false));
            if (j2 == c3531n.f20974n || j2 == -1) {
                return;
            }
            qrj(new C3531n(c3531n.f20973k, c3531n.f65039toq, c3531n.f65040zy, System.currentTimeMillis(), j2, c3531n.f20972g, c3531n.f65038f7l8, c3531n.f20976y));
        }

        /* JADX INFO: renamed from: t */
        private void m12448t() {
            int i2 = 0;
            for (int i3 = 0; i3 < this.f21031g.size(); i3++) {
                C3531n c3531n = this.f21031g.get(i3);
                C3541n c3541nM12450z = this.f65081f7l8.get(c3531n.f20973k.f20919k);
                int i4 = c3531n.f65039toq;
                if (i4 == 0) {
                    c3541nM12450z = m12450z(c3541nM12450z, c3531n);
                } else if (i4 == 1) {
                    wvg(c3541nM12450z);
                } else if (i4 == 2) {
                    C3844k.f7l8(c3541nM12450z);
                    fu4(c3541nM12450z, c3531n, i2);
                } else {
                    if (i4 != 5 && i4 != 7) {
                        throw new IllegalStateException();
                    }
                    o1t(c3541nM12450z, c3531n);
                }
                if (c3541nM12450z != null && !c3541nM12450z.f21020g) {
                    i2++;
                }
            }
        }

        private void t8r(int i2) {
            this.f21034p = i2;
            m12448t();
        }

        private void toq(DownloadRequest downloadRequest, int i2) {
            C3531n c3531nM12440g = m12440g(downloadRequest.f20919k, true);
            long jCurrentTimeMillis = System.currentTimeMillis();
            if (c3531nM12440g != null) {
                qrj(t8r.ki(c3531nM12440g, downloadRequest, i2, jCurrentTimeMillis));
            } else {
                qrj(new C3531n(downloadRequest, i2 == 0 ? 0 : 1, jCurrentTimeMillis, jCurrentTimeMillis, -1L, i2, 0));
            }
            m12448t();
        }

        private void wvg(@dd C3541n c3541n) {
            if (c3541n != null) {
                C3844k.m13633s(!c3541n.f21020g);
                c3541n.m12434g(false);
            }
        }

        private void x2(C3541n c3541n) {
            String str = c3541n.f21023k.f20919k;
            this.f65081f7l8.remove(str);
            boolean z2 = c3541n.f21020g;
            if (!z2) {
                int i2 = this.f65084x2 - 1;
                this.f65084x2 = i2;
                if (i2 == 0) {
                    removeMessages(11);
                }
            }
            if (c3541n.f21025p) {
                m12448t();
                return;
            }
            Exception exc = c3541n.f21021h;
            if (exc != null) {
                String strValueOf = String.valueOf(c3541n.f21023k);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
                sb.append("Task failed: ");
                sb.append(strValueOf);
                sb.append(", ");
                sb.append(z2);
                com.google.android.exoplayer2.util.ni7.m13700n(t8r.f65066oc, sb.toString(), exc);
            }
            C3531n c3531n = (C3531n) C3844k.f7l8(m12440g(str, false));
            int i3 = c3531n.f65039toq;
            if (i3 == 2) {
                C3844k.m13633s(!z2);
                m12445p(c3531n, exc);
            } else {
                if (i3 != 5 && i3 != 7) {
                    throw new IllegalStateException();
                }
                C3844k.m13633s(z2);
                ld6(c3531n);
            }
            m12448t();
        }

        /* JADX INFO: renamed from: y */
        private void m12449y(int i2) {
            this.f21037y = i2;
            InterfaceC3526g interfaceC3526gMo12383q = null;
            try {
                try {
                    this.f65085zy.mo12378g();
                    interfaceC3526gMo12383q = this.f65085zy.mo12383q(0, 1, 2, 5, 7);
                    while (interfaceC3526gMo12383q.moveToNext()) {
                        this.f21031g.add(interfaceC3526gMo12383q.mo12382u());
                    }
                } catch (IOException e2) {
                    com.google.android.exoplayer2.util.ni7.m13700n(t8r.f65066oc, "Failed to load index.", e2);
                    this.f21031g.clear();
                }
                lrht.m13659h(interfaceC3526gMo12383q);
                this.f21033n.obtainMessage(0, new ArrayList(this.f21031g)).sendToTarget();
                m12448t();
            } catch (Throwable th) {
                lrht.m13659h(interfaceC3526gMo12383q);
                throw th;
            }
        }

        @InterfaceC7839p
        @dd
        /* JADX INFO: renamed from: z */
        private C3541n m12450z(@dd C3541n c3541n, C3531n c3531n) {
            if (c3541n != null) {
                C3844k.m13633s(!c3541n.f21020g);
                c3541n.m12434g(false);
                return c3541n;
            }
            if (!zy() || this.f65084x2 >= this.f21034p) {
                return null;
            }
            C3531n c3531nN7h = n7h(c3531n, 2, 0);
            C3541n c3541n2 = new C3541n(c3531nN7h.f20973k, this.f21035q.mo12418k(c3531nN7h.f20973k), c3531nN7h.f20976y, false, this.f65082ld6, this);
            this.f65081f7l8.put(c3531nN7h.f20973k.f20919k, c3541n2);
            int i2 = this.f65084x2;
            this.f65084x2 = i2 + 1;
            if (i2 == 0) {
                sendEmptyMessageDelayed(11, 5000L);
            }
            c3541n2.start();
            return c3541n2;
        }

        private void zurt(C3531n c3531n, int i2) {
            if (i2 == 0) {
                if (c3531n.f65039toq == 1) {
                    n7h(c3531n, 0, 0);
                }
            } else if (i2 != c3531n.f20972g) {
                int i3 = c3531n.f65039toq;
                if (i3 == 0 || i3 == 2) {
                    i3 = 1;
                }
                qrj(new C3531n(c3531n.f20973k, i3, c3531n.f65040zy, System.currentTimeMillis(), c3531n.f20974n, i2, 0, c3531n.f20976y));
            }
        }

        private boolean zy() {
            return !this.f21036s && this.f21037y == 0;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i2 = 0;
            switch (message.what) {
                case 0:
                    m12449y(message.arg1);
                    i2 = 1;
                    this.f21033n.obtainMessage(1, i2, this.f65081f7l8.size()).sendToTarget();
                    return;
                case 1:
                    ki(message.arg1 != 0);
                    i2 = 1;
                    this.f21033n.obtainMessage(1, i2, this.f65081f7l8.size()).sendToTarget();
                    return;
                case 2:
                    fn3e(message.arg1);
                    i2 = 1;
                    this.f21033n.obtainMessage(1, i2, this.f65081f7l8.size()).sendToTarget();
                    return;
                case 3:
                    ni7((String) message.obj, message.arg1);
                    i2 = 1;
                    this.f21033n.obtainMessage(1, i2, this.f65081f7l8.size()).sendToTarget();
                    return;
                case 4:
                    t8r(message.arg1);
                    i2 = 1;
                    this.f21033n.obtainMessage(1, i2, this.f65081f7l8.size()).sendToTarget();
                    return;
                case 5:
                    m12442i(message.arg1);
                    i2 = 1;
                    this.f21033n.obtainMessage(1, i2, this.f65081f7l8.size()).sendToTarget();
                    return;
                case 6:
                    toq((DownloadRequest) message.obj, message.arg1);
                    i2 = 1;
                    this.f21033n.obtainMessage(1, i2, this.f65081f7l8.size()).sendToTarget();
                    return;
                case 7:
                    cdj((String) message.obj);
                    i2 = 1;
                    this.f21033n.obtainMessage(1, i2, this.f65081f7l8.size()).sendToTarget();
                    return;
                case 8:
                    m12441h();
                    i2 = 1;
                    this.f21033n.obtainMessage(1, i2, this.f65081f7l8.size()).sendToTarget();
                    return;
                case 9:
                    x2((C3541n) message.obj);
                    this.f21033n.obtainMessage(1, i2, this.f65081f7l8.size()).sendToTarget();
                    return;
                case 10:
                    m12447s((C3541n) message.obj, lrht.ebn(message.arg1, message.arg2));
                    return;
                case 11:
                    mcp();
                    return;
                case 12:
                    kja0();
                    return;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Deprecated
    public t8r(Context context, com.google.android.exoplayer2.database.zy zyVar, InterfaceC3775k interfaceC3775k, kja0.InterfaceC3804k interfaceC3804k) {
        this(context, zyVar, interfaceC3775k, interfaceC3804k, new androidx.window.layout.ni7());
    }

    private boolean d3() {
        boolean z2;
        if (this.f21016p || this.f65074qrj == 0) {
            z2 = false;
        } else {
            for (int i2 = 0; i2 < this.f65071kja0.size(); i2++) {
                if (this.f65071kja0.get(i2).f65039toq == 0) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        boolean z3 = this.f65073n7h != z2;
        this.f65073n7h = z2;
        return z3;
    }

    private void fn3e(List<C3531n> list) {
        this.f21018s = true;
        this.f65071kja0 = Collections.unmodifiableList(list);
        boolean zD3 = d3();
        Iterator<InterfaceC3542q> it = this.f21012g.iterator();
        while (it.hasNext()) {
            it.next().f7l8(this);
        }
        if (zD3) {
            t8r();
        }
    }

    /* JADX INFO: renamed from: i */
    private void m12421i(toq toqVar) {
        this.f65071kja0 = Collections.unmodifiableList(toqVar.f65079zy);
        C3531n c3531n = toqVar.f21029k;
        boolean zD3 = d3();
        if (toqVar.f65078toq) {
            Iterator<InterfaceC3542q> it = this.f21012g.iterator();
            while (it.hasNext()) {
                it.next().zy(this, c3531n);
            }
        } else {
            Iterator<InterfaceC3542q> it2 = this.f21012g.iterator();
            while (it2.hasNext()) {
                it2.next().toq(this, c3531n, toqVar.f21030q);
            }
        }
        if (zD3) {
            t8r();
        }
    }

    private void jk(boolean z2) {
        if (this.f21016p == z2) {
            return;
        }
        this.f21016p = z2;
        this.f65070f7l8++;
        this.f21017q.obtainMessage(1, z2 ? 1 : 0, 0).sendToTarget();
        boolean zD3 = d3();
        Iterator<InterfaceC3542q> it = this.f21012g.iterator();
        while (it.hasNext()) {
            it.next().m12439q(this, z2);
        }
        if (zD3) {
            t8r();
        }
    }

    static C3531n ki(C3531n c3531n, DownloadRequest downloadRequest, int i2, long j2) {
        int i3;
        int i4 = c3531n.f65039toq;
        long j3 = (i4 == 5 || c3531n.zy()) ? j2 : c3531n.f65040zy;
        if (i4 == 5 || i4 == 7) {
            i3 = 7;
        } else {
            i3 = i2 != 0 ? 1 : 0;
        }
        return new C3531n(c3531n.f20973k.zy(downloadRequest), i3, j3, j2, -1L, i2, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean n7h(Message message) {
        int i2 = message.what;
        if (i2 == 0) {
            fn3e((List) message.obj);
        } else if (i2 == 1) {
            zurt(message.arg1, message.arg2);
        } else {
            if (i2 != 2) {
                throw new IllegalStateException();
            }
            m12421i((toq) message.obj);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ni7(com.google.android.exoplayer2.scheduler.toq toqVar, int i2) {
        Requirements requirementsM12541g = toqVar.m12541g();
        if (this.f65074qrj != i2) {
            this.f65074qrj = i2;
            this.f65070f7l8++;
            this.f21017q.obtainMessage(2, i2, 0).sendToTarget();
        }
        boolean zD3 = d3();
        Iterator<InterfaceC3542q> it = this.f21012g.iterator();
        while (it.hasNext()) {
            it.next().mo12438n(this, requirementsM12541g, i2);
        }
        if (zD3) {
            t8r();
        }
    }

    private void t8r() {
        Iterator<InterfaceC3542q> it = this.f21012g.iterator();
        while (it.hasNext()) {
            it.next().mo12437k(this, this.f65073n7h);
        }
    }

    private void zurt(int i2, int i3) {
        this.f65070f7l8 -= i2;
        this.f21019y = i3;
        if (kja0()) {
            Iterator<InterfaceC3542q> it = this.f21012g.iterator();
            while (it.hasNext()) {
                it.next().mo12436g(this);
            }
        }
    }

    public void a9(@zy.a9(from = 1) int i2) {
        C3844k.m13629k(i2 > 0);
        if (this.f65072ld6 == i2) {
            return;
        }
        this.f65072ld6 = i2;
        this.f65070f7l8++;
        this.f21017q.obtainMessage(4, i2, 0).sendToTarget();
    }

    public boolean cdj() {
        return this.f65073n7h;
    }

    public List<C3531n> f7l8() {
        return this.f65071kja0;
    }

    public void fti(int i2) {
        C3844k.m13629k(i2 >= 0);
        if (this.f65076x2 == i2) {
            return;
        }
        this.f65076x2 = i2;
        this.f65070f7l8++;
        this.f21017q.obtainMessage(5, i2, 0).sendToTarget();
    }

    public void fu4() {
        jk(true);
    }

    /* JADX INFO: renamed from: g */
    public Looper m12423g() {
        return this.f65077zy.getLooper();
    }

    public void gvn7(@dd String str, int i2) {
        this.f65070f7l8++;
        this.f21017q.obtainMessage(3, i2, 0, str).sendToTarget();
    }

    /* JADX INFO: renamed from: h */
    public boolean m12424h() {
        return this.f21018s;
    }

    public void jp0y(Requirements requirements) {
        if (requirements.equals(this.f21013h.m12541g())) {
            return;
        }
        this.f21013h.m12542p();
        com.google.android.exoplayer2.scheduler.toq toqVar = new com.google.android.exoplayer2.scheduler.toq(this.f21014k, this.f21015n, requirements);
        this.f21013h = toqVar;
        ni7(this.f21013h, toqVar.m12543s());
    }

    public boolean kja0() {
        return this.f21019y == 0 && this.f65070f7l8 == 0;
    }

    public int ld6() {
        return this.f65076x2;
    }

    public void mcp() {
        jk(false);
    }

    /* JADX INFO: renamed from: n */
    public void m12425n(InterfaceC3542q interfaceC3542q) {
        C3844k.f7l8(interfaceC3542q);
        this.f21012g.add(interfaceC3542q);
    }

    public void o1t() {
        this.f65070f7l8++;
        this.f21017q.obtainMessage(8).sendToTarget();
    }

    /* JADX INFO: renamed from: p */
    public int m12426p() {
        return this.f65072ld6;
    }

    /* JADX INFO: renamed from: q */
    public void m12427q(DownloadRequest downloadRequest, int i2) {
        this.f65070f7l8++;
        this.f21017q.obtainMessage(6, i2, 0, downloadRequest).sendToTarget();
    }

    public Requirements qrj() {
        return this.f21013h.m12541g();
    }

    /* JADX INFO: renamed from: s */
    public boolean m12428s() {
        return this.f21016p;
    }

    /* JADX INFO: renamed from: t */
    public void m12429t(InterfaceC3542q interfaceC3542q) {
        this.f21012g.remove(interfaceC3542q);
    }

    public void wvg(String str) {
        this.f65070f7l8++;
        this.f21017q.obtainMessage(7, str).sendToTarget();
    }

    public int x2() {
        return this.f65074qrj;
    }

    /* JADX INFO: renamed from: y */
    public InterfaceC3527h m12430y() {
        return this.f65075toq;
    }

    /* JADX INFO: renamed from: z */
    public void m12431z() {
        synchronized (this.f21017q) {
            zy zyVar = this.f21017q;
            if (zyVar.f21032k) {
                return;
            }
            zyVar.sendEmptyMessage(12);
            boolean z2 = false;
            while (true) {
                zy zyVar2 = this.f21017q;
                if (zyVar2.f21032k) {
                    break;
                }
                try {
                    zyVar2.wait();
                } catch (InterruptedException unused) {
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            this.f65077zy.removeCallbacksAndMessages(null);
            this.f65071kja0 = Collections.emptyList();
            this.f65070f7l8 = 0;
            this.f21019y = 0;
            this.f21018s = false;
            this.f65074qrj = 0;
            this.f65073n7h = false;
        }
    }

    public void zy(DownloadRequest downloadRequest) {
        m12427q(downloadRequest, 0);
    }

    public t8r(Context context, com.google.android.exoplayer2.database.zy zyVar, InterfaceC3775k interfaceC3775k, kja0.InterfaceC3804k interfaceC3804k, Executor executor) {
        this(context, new com.google.android.exoplayer2.offline.zy(zyVar), new C3537q(new zy.C3786q().m13443p(interfaceC3775k).m13441h(interfaceC3804k), executor));
    }

    public t8r(Context context, fti ftiVar, o1t o1tVar) {
        this.f21014k = context.getApplicationContext();
        this.f65075toq = ftiVar;
        this.f65072ld6 = 3;
        this.f65076x2 = 5;
        this.f21016p = true;
        this.f65071kja0 = Collections.emptyList();
        this.f21012g = new CopyOnWriteArraySet<>();
        Handler handlerM13671t = lrht.m13671t(new Handler.Callback() { // from class: com.google.android.exoplayer2.offline.cdj
            @Override // android.os.Handler.Callback
            public final boolean handleMessage(Message message) {
                return this.f20953k.n7h(message);
            }
        });
        this.f65077zy = handlerM13671t;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:DownloadManager");
        handlerThread.start();
        zy zyVar = new zy(handlerThread, ftiVar, o1tVar, handlerM13671t, this.f65072ld6, this.f65076x2, this.f21016p);
        this.f21017q = zyVar;
        toq.zy zyVar2 = new toq.zy() { // from class: com.google.android.exoplayer2.offline.ki
            @Override // com.google.android.exoplayer2.scheduler.toq.zy
            /* JADX INFO: renamed from: k */
            public final void mo12390k(com.google.android.exoplayer2.scheduler.toq toqVar, int i2) {
                this.f20966k.ni7(toqVar, i2);
            }
        };
        this.f21015n = zyVar2;
        com.google.android.exoplayer2.scheduler.toq toqVar = new com.google.android.exoplayer2.scheduler.toq(context, zyVar2, f65067t8r);
        this.f21013h = toqVar;
        int iM12543s = toqVar.m12543s();
        this.f65074qrj = iM12543s;
        this.f65070f7l8 = 1;
        zyVar.obtainMessage(0, iM12543s, 0).sendToTarget();
    }
}
