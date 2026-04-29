package com.google.common.graph;

import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.graph.z */
/* JADX INFO: compiled from: GraphBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class C4649z<N> extends AbstractC4641q<N> {
    private C4649z(boolean z2) {
        super(z2);
    }

    /* JADX INFO: renamed from: g */
    public static <N> C4649z<N> m16313g(fu4<N> fu4Var) {
        return (C4649z<N>) new C4649z(fu4Var.mo16193n()).m16316k(fu4Var.mo16194p()).f7l8(fu4Var.mo16196y());
    }

    /* JADX INFO: renamed from: q */
    public static C4649z<Object> m16314q() {
        return new C4649z<>(true);
    }

    /* JADX INFO: renamed from: y */
    public static C4649z<Object> m16315y() {
        return new C4649z<>(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N> C4649z<N1> zy() {
        return this;
    }

    public <N1 extends N> C4649z<N1> f7l8(ki<N1> kiVar) {
        C4649z<N1> c4649zZy = zy();
        c4649zZy.f68280zy = (ki) com.google.common.base.jk.a9(kiVar);
        return c4649zZy;
    }

    /* JADX INFO: renamed from: k */
    public C4649z<N> m16316k(boolean z2) {
        this.f68279toq = z2;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C4649z<N> m16317n(int i2) {
        this.f26953q = com.google.common.base.o1t.of(Integer.valueOf(C4644t.toq(i2)));
        return this;
    }

    public <N1 extends N> d3<N1> toq() {
        return new C4643s(this);
    }
}
