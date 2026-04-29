package com.google.android.exoplayer2.analytics;

import android.util.Base64;
import com.google.android.exoplayer2.analytics.InterfaceC3239x;
import com.google.android.exoplayer2.analytics.lv5;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.util.C3844k;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: compiled from: DefaultPlaybackSessionManager.java */
/* JADX INFO: loaded from: classes2.dex */
public final class nmn5 implements lv5 {

    /* JADX INFO: renamed from: p */
    private static final int f19180p = 12;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @zy.dd
    private String f63148f7l8;

    /* JADX INFO: renamed from: g */
    private pc f19183g;

    /* JADX INFO: renamed from: k */
    private final pc.C3550q f19184k;

    /* JADX INFO: renamed from: n */
    private lv5.InterfaceC3227k f19185n;

    /* JADX INFO: renamed from: q */
    private final com.google.common.base.lvui<String> f19186q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final pc.toq f63149toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final HashMap<String, C3230k> f63150zy;

    /* JADX INFO: renamed from: y */
    public static final com.google.common.base.lvui<String> f19182y = new com.google.common.base.lvui() { // from class: com.google.android.exoplayer2.analytics.ch
        @Override // com.google.common.base.lvui
        public final Object get() {
            return nmn5.x2();
        }
    };

    /* JADX INFO: renamed from: s */
    private static final Random f19181s = new Random();

    /* JADX INFO: renamed from: com.google.android.exoplayer2.analytics.nmn5$k */
    /* JADX INFO: compiled from: DefaultPlaybackSessionManager.java */
    private final class C3230k {

        /* JADX INFO: renamed from: g */
        private boolean f19187g;

        /* JADX INFO: renamed from: k */
        private final String f19188k;

        /* JADX INFO: renamed from: n */
        private boolean f19189n;

        /* JADX INFO: renamed from: q */
        private fti.C3596k f19190q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private int f63152toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private long f63153zy;

        public C3230k(String str, int i2, @zy.dd fti.C3596k c3596k) {
            this.f19188k = str;
            this.f63152toq = i2;
            this.f63153zy = c3596k == null ? -1L : c3596k.f21227q;
            if (c3596k == null || !c3596k.zy()) {
                return;
            }
            this.f19190q = c3596k;
        }

        private int x2(pc pcVar, pc pcVar2, int i2) {
            if (i2 >= pcVar.zurt()) {
                if (i2 < pcVar2.zurt()) {
                    return i2;
                }
                return -1;
            }
            pcVar.m12484i(i2, nmn5.this.f19184k);
            for (int i3 = nmn5.this.f19184k.f21126c; i3 <= nmn5.this.f19184k.f21127e; i3++) {
                int iMo12147g = pcVar2.mo12147g(pcVar.t8r(i3));
                if (iMo12147g != -1) {
                    return pcVar2.m12485p(iMo12147g, nmn5.this.f63149toq).f21151n;
                }
            }
            return -1;
        }

        public void ld6(int i2, @zy.dd fti.C3596k c3596k) {
            if (this.f63153zy == -1 && i2 == this.f63152toq && c3596k != null) {
                this.f63153zy = c3596k.f21227q;
            }
        }

        /* JADX INFO: renamed from: p */
        public boolean m11305p(InterfaceC3239x.toq toqVar) {
            long j2 = this.f63153zy;
            if (j2 == -1) {
                return false;
            }
            fti.C3596k c3596k = toqVar.f19268q;
            if (c3596k == null) {
                return this.f63152toq != toqVar.f63298zy;
            }
            if (c3596k.f21227q > j2) {
                return true;
            }
            if (this.f19190q == null) {
                return false;
            }
            int iMo12147g = toqVar.f63297toq.mo12147g(c3596k.f21225k);
            int iMo12147g2 = toqVar.f63297toq.mo12147g(this.f19190q.f21225k);
            fti.C3596k c3596k2 = toqVar.f19268q;
            if (c3596k2.f21227q < this.f19190q.f21227q || iMo12147g < iMo12147g2) {
                return false;
            }
            if (iMo12147g > iMo12147g2) {
                return true;
            }
            if (!c3596k2.zy()) {
                int i2 = toqVar.f19268q.f21226n;
                return i2 == -1 || i2 > this.f19190q.f65325toq;
            }
            fti.C3596k c3596k3 = toqVar.f19268q;
            int i3 = c3596k3.f65325toq;
            int i4 = c3596k3.f65326zy;
            fti.C3596k c3596k4 = this.f19190q;
            int i5 = c3596k4.f65325toq;
            return i3 > i5 || (i3 == i5 && i4 > c3596k4.f65326zy);
        }

        public boolean qrj(pc pcVar, pc pcVar2) {
            int iX2 = x2(pcVar, pcVar2, this.f63152toq);
            this.f63152toq = iX2;
            if (iX2 == -1) {
                return false;
            }
            fti.C3596k c3596k = this.f19190q;
            return c3596k == null || pcVar2.mo12147g(c3596k.f21225k) != -1;
        }

        /* JADX INFO: renamed from: s */
        public boolean m11306s(int i2, @zy.dd fti.C3596k c3596k) {
            if (c3596k == null) {
                return i2 == this.f63152toq;
            }
            fti.C3596k c3596k2 = this.f19190q;
            return c3596k2 == null ? !c3596k.zy() && c3596k.f21227q == this.f63153zy : c3596k.f21227q == c3596k2.f21227q && c3596k.f65325toq == c3596k2.f65325toq && c3596k.f65326zy == c3596k2.f65326zy;
        }
    }

    public nmn5() {
        this(f19182y);
    }

    @RequiresNonNull({"listener"})
    private void n7h(InterfaceC3239x.toq toqVar) {
        if (toqVar.f63297toq.ni7()) {
            this.f63148f7l8 = null;
            return;
        }
        C3230k c3230k = this.f63150zy.get(this.f63148f7l8);
        C3230k c3230kQrj = qrj(toqVar.f63298zy, toqVar.f19268q);
        this.f63148f7l8 = c3230kQrj.f19188k;
        mo11294q(toqVar);
        fti.C3596k c3596k = toqVar.f19268q;
        if (c3596k == null || !c3596k.zy()) {
            return;
        }
        if (c3230k != null && c3230k.f63153zy == toqVar.f19268q.f21227q && c3230k.f19190q != null && c3230k.f19190q.f65325toq == toqVar.f19268q.f65325toq && c3230k.f19190q.f65326zy == toqVar.f19268q.f65326zy) {
            return;
        }
        fti.C3596k c3596k2 = toqVar.f19268q;
        this.f19185n.xwq3(toqVar, qrj(toqVar.f63298zy, new fti.C3596k(c3596k2.f21225k, c3596k2.f21227q)).f19188k, c3230kQrj.f19188k);
    }

    private C3230k qrj(int i2, @zy.dd fti.C3596k c3596k) {
        C3230k c3230k = null;
        long j2 = Long.MAX_VALUE;
        for (C3230k c3230k2 : this.f63150zy.values()) {
            c3230k2.ld6(i2, c3596k);
            if (c3230k2.m11306s(i2, c3596k)) {
                long j3 = c3230k2.f63153zy;
                if (j3 == -1 || j3 < j2) {
                    c3230k = c3230k2;
                    j2 = j3;
                } else if (j3 == j2 && ((C3230k) com.google.android.exoplayer2.util.lrht.ld6(c3230k)).f19190q != null && c3230k2.f19190q != null) {
                    c3230k = c3230k2;
                }
            }
        }
        if (c3230k != null) {
            return c3230k;
        }
        String str = this.f19186q.get();
        C3230k c3230k3 = new C3230k(str, i2, c3596k);
        this.f63150zy.put(str, c3230k3);
        return c3230k3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String x2() {
        byte[] bArr = new byte[12];
        f19181s.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // com.google.android.exoplayer2.analytics.lv5
    public synchronized void f7l8(InterfaceC3239x.toq toqVar) {
        C3844k.f7l8(this.f19185n);
        pc pcVar = this.f19183g;
        this.f19183g = toqVar.f63297toq;
        Iterator<C3230k> it = this.f63150zy.values().iterator();
        while (it.hasNext()) {
            C3230k next = it.next();
            if (!next.qrj(pcVar, this.f19183g)) {
                it.remove();
                if (next.f19189n) {
                    if (next.f19188k.equals(this.f63148f7l8)) {
                        this.f63148f7l8 = null;
                    }
                    this.f19185n.mo11297o(toqVar, next.f19188k, false);
                }
            }
        }
        n7h(toqVar);
    }

    @Override // com.google.android.exoplayer2.analytics.lv5
    /* JADX INFO: renamed from: g */
    public synchronized void mo11291g(InterfaceC3239x.toq toqVar, int i2) {
        C3844k.f7l8(this.f19185n);
        boolean z2 = i2 == 0;
        Iterator<C3230k> it = this.f63150zy.values().iterator();
        while (it.hasNext()) {
            C3230k next = it.next();
            if (next.m11305p(toqVar)) {
                it.remove();
                if (next.f19189n) {
                    boolean zEquals = next.f19188k.equals(this.f63148f7l8);
                    boolean z3 = z2 && zEquals && next.f19187g;
                    if (zEquals) {
                        this.f63148f7l8 = null;
                    }
                    this.f19185n.mo11297o(toqVar, next.f19188k, z3);
                }
            }
        }
        n7h(toqVar);
    }

    @Override // com.google.android.exoplayer2.analytics.lv5
    @zy.dd
    /* JADX INFO: renamed from: k */
    public synchronized String mo11292k() {
        return this.f63148f7l8;
    }

    @Override // com.google.android.exoplayer2.analytics.lv5
    /* JADX INFO: renamed from: n */
    public synchronized boolean mo11293n(InterfaceC3239x.toq toqVar, String str) {
        C3230k c3230k = this.f63150zy.get(str);
        if (c3230k == null) {
            return false;
        }
        c3230k.ld6(toqVar.f63298zy, toqVar.f19268q);
        return c3230k.m11306s(toqVar.f63298zy, toqVar.f19268q);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1 A[Catch: all -> 0x0118, TryCatch #0 {, blocks: (B:4:0x0005, B:8:0x0014, B:11:0x0025, B:13:0x0030, B:16:0x003a, B:23:0x004b, B:25:0x0057, B:26:0x005d, B:28:0x0061, B:30:0x0067, B:32:0x0080, B:34:0x00db, B:36:0x00e1, B:38:0x00f7, B:40:0x0103, B:42:0x0109), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00f3  */
    @Override // com.google.android.exoplayer2.analytics.lv5
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public synchronized void mo11294q(com.google.android.exoplayer2.analytics.InterfaceC3239x.toq r25) {
        /*
            Method dump skipped, instruction units count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.analytics.nmn5.mo11294q(com.google.android.exoplayer2.analytics.x$toq):void");
    }

    @Override // com.google.android.exoplayer2.analytics.lv5
    public void toq(lv5.InterfaceC3227k interfaceC3227k) {
        this.f19185n = interfaceC3227k;
    }

    @Override // com.google.android.exoplayer2.analytics.lv5
    /* JADX INFO: renamed from: y */
    public synchronized String mo11295y(pc pcVar, fti.C3596k c3596k) {
        return qrj(pcVar.x2(c3596k.f21225k, this.f63149toq).f21151n, c3596k).f19188k;
    }

    @Override // com.google.android.exoplayer2.analytics.lv5
    public synchronized void zy(InterfaceC3239x.toq toqVar) {
        lv5.InterfaceC3227k interfaceC3227k;
        this.f63148f7l8 = null;
        Iterator<C3230k> it = this.f63150zy.values().iterator();
        while (it.hasNext()) {
            C3230k next = it.next();
            it.remove();
            if (next.f19189n && (interfaceC3227k = this.f19185n) != null) {
                interfaceC3227k.mo11297o(toqVar, next.f19188k, false);
            }
        }
    }

    public nmn5(com.google.common.base.lvui<String> lvuiVar) {
        this.f19186q = lvuiVar;
        this.f19184k = new pc.C3550q();
        this.f63149toq = new pc.toq();
        this.f63150zy = new HashMap<>();
        this.f19183g = pc.f21113k;
    }
}
