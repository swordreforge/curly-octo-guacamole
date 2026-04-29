package com.google.android.exoplayer2.trackselection;

import com.google.android.exoplayer2.h7am;
import com.google.android.exoplayer2.pjz9;
import com.google.android.exoplayer2.util.lrht;
import zy.dd;

/* JADX INFO: compiled from: TrackSelectorResult.java */
/* JADX INFO: loaded from: classes2.dex */
public final class ni7 {

    /* JADX INFO: renamed from: k */
    public final int f22335k;

    /* JADX INFO: renamed from: n */
    @dd
    public final Object f22336n;

    /* JADX INFO: renamed from: q */
    public final pjz9 f22337q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public final h7am[] f66060toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public final InterfaceC3715s[] f66061zy;

    @Deprecated
    public ni7(h7am[] h7amVarArr, InterfaceC3715s[] interfaceC3715sArr, @dd Object obj) {
        this(h7amVarArr, interfaceC3715sArr, pjz9.f21162q, obj);
    }

    /* JADX INFO: renamed from: k */
    public boolean m13149k(@dd ni7 ni7Var) {
        if (ni7Var == null || ni7Var.f66061zy.length != this.f66061zy.length) {
            return false;
        }
        for (int i2 = 0; i2 < this.f66061zy.length; i2++) {
            if (!toq(ni7Var, i2)) {
                return false;
            }
        }
        return true;
    }

    public boolean toq(@dd ni7 ni7Var, int i2) {
        return ni7Var != null && lrht.zy(this.f66060toq[i2], ni7Var.f66060toq[i2]) && lrht.zy(this.f66061zy[i2], ni7Var.f66061zy[i2]);
    }

    public boolean zy(int i2) {
        return this.f66060toq[i2] != null;
    }

    public ni7(h7am[] h7amVarArr, InterfaceC3715s[] interfaceC3715sArr, pjz9 pjz9Var, @dd Object obj) {
        this.f66060toq = h7amVarArr;
        this.f66061zy = (InterfaceC3715s[]) interfaceC3715sArr.clone();
        this.f22337q = pjz9Var;
        this.f22336n = obj;
        this.f22335k = h7amVarArr.length;
    }
}
