package com.google.android.exoplayer2.source;

import android.os.Handler;
import android.os.Looper;
import com.google.android.exoplayer2.drm.InterfaceC3312i;
import com.google.android.exoplayer2.pc;
import com.google.android.exoplayer2.source.fti;
import com.google.android.exoplayer2.source.lvui;
import com.google.android.exoplayer2.util.C3844k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.k */
/* JADX INFO: compiled from: BaseMediaSource.java */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3605k implements fti {

    /* JADX INFO: renamed from: s */
    @zy.dd
    private pc f21562s;

    /* JADX INFO: renamed from: y */
    @zy.dd
    private Looper f21563y;

    /* JADX INFO: renamed from: k */
    private final ArrayList<fti.toq> f21559k = new ArrayList<>(1);

    /* JADX INFO: renamed from: q */
    private final HashSet<fti.toq> f21561q = new HashSet<>(1);

    /* JADX INFO: renamed from: n */
    private final lvui.C3611k f21560n = new lvui.C3611k();

    /* JADX INFO: renamed from: g */
    private final InterfaceC3312i.k f21558g = new InterfaceC3312i.k();

    protected final InterfaceC3312i.k cdj(int i2, @zy.dd fti.C3596k c3596k) {
        return this.f21558g.fn3e(i2, c3596k);
    }

    @Override // com.google.android.exoplayer2.source.fti
    public final void f7l8(fti.toq toqVar, @zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var) {
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = this.f21563y;
        C3844k.m13629k(looper == null || looper == looperMyLooper);
        pc pcVar = this.f21562s;
        this.f21559k.add(toqVar);
        if (this.f21563y == null) {
            this.f21563y = looperMyLooper;
            this.f21561q.add(toqVar);
            wvg(uv6Var);
        } else if (pcVar != null) {
            mo12716y(toqVar);
            toqVar.mo12410s(this, pcVar);
        }
    }

    protected final lvui.C3611k fn3e(@zy.dd fti.C3596k c3596k) {
        return this.f21560n.fti(0, c3596k, 0L);
    }

    protected void fu4() {
    }

    protected final InterfaceC3312i.k ki(@zy.dd fti.C3596k c3596k) {
        return this.f21558g.fn3e(0, c3596k);
    }

    protected abstract void mcp();

    protected final lvui.C3611k ni7(fti.C3596k c3596k, long j2) {
        C3844k.f7l8(c3596k);
        return this.f21560n.fti(0, c3596k, j2);
    }

    protected final boolean o1t() {
        return !this.f21561q.isEmpty();
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: p */
    public final void mo12714p(fti.toq toqVar) {
        boolean z2 = !this.f21561q.isEmpty();
        this.f21561q.remove(toqVar);
        if (z2 && this.f21561q.isEmpty()) {
            fu4();
        }
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: q */
    public final void mo12715q(lvui lvuiVar) {
        this.f21560n.mcp(lvuiVar);
    }

    @Override // com.google.android.exoplayer2.source.fti
    public final void qrj(InterfaceC3312i interfaceC3312i) {
        this.f21558g.m11634i(interfaceC3312i);
    }

    /* JADX INFO: renamed from: t */
    protected final void m12741t(pc pcVar) {
        this.f21562s = pcVar;
        Iterator<fti.toq> it = this.f21559k.iterator();
        while (it.hasNext()) {
            it.next().mo12410s(this, pcVar);
        }
    }

    protected final lvui.C3611k t8r(int i2, @zy.dd fti.C3596k c3596k, long j2) {
        return this.f21560n.fti(i2, c3596k, j2);
    }

    @Override // com.google.android.exoplayer2.source.fti
    public final void toq(fti.toq toqVar) {
        this.f21559k.remove(toqVar);
        if (!this.f21559k.isEmpty()) {
            mo12714p(toqVar);
            return;
        }
        this.f21563y = null;
        this.f21562s = null;
        this.f21561q.clear();
        mcp();
    }

    protected abstract void wvg(@zy.dd com.google.android.exoplayer2.upstream.uv6 uv6Var);

    @Override // com.google.android.exoplayer2.source.fti
    public final void x2(Handler handler, InterfaceC3312i interfaceC3312i) {
        C3844k.f7l8(handler);
        C3844k.f7l8(interfaceC3312i);
        this.f21558g.f7l8(handler, interfaceC3312i);
    }

    @Override // com.google.android.exoplayer2.source.fti
    /* JADX INFO: renamed from: y */
    public final void mo12716y(fti.toq toqVar) {
        C3844k.f7l8(this.f21563y);
        boolean zIsEmpty = this.f21561q.isEmpty();
        this.f21561q.add(toqVar);
        if (zIsEmpty) {
            mo12594z();
        }
    }

    /* JADX INFO: renamed from: z */
    protected void mo12594z() {
    }

    @Override // com.google.android.exoplayer2.source.fti
    public final void zy(Handler handler, lvui lvuiVar) {
        C3844k.f7l8(handler);
        C3844k.f7l8(lvuiVar);
        this.f21560n.f7l8(handler, lvuiVar);
    }
}
