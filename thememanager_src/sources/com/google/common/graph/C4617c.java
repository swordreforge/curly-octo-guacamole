package com.google.common.graph;

import wlev.InterfaceC7731k;

/* JADX INFO: renamed from: com.google.common.graph.c */
/* JADX INFO: compiled from: ValueGraphBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class C4617c<N, V> extends AbstractC4641q<N> {
    private C4617c(boolean z2) {
        super(z2);
    }

    /* JADX INFO: renamed from: g */
    public static <N, V> C4617c<N, V> m16198g(InterfaceC4618f<N, V> interfaceC4618f) {
        return (C4617c<N, V>) new C4617c(interfaceC4618f.mo16193n()).m16201k(interfaceC4618f.mo16194p()).f7l8(interfaceC4618f.mo16196y());
    }

    /* JADX INFO: renamed from: q */
    public static C4617c<Object, Object> m16199q() {
        return new C4617c<>(true);
    }

    /* JADX INFO: renamed from: y */
    public static C4617c<Object, Object> m16200y() {
        return new C4617c<>(false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private <N1 extends N, V1 extends V> C4617c<N1, V1> zy() {
        return this;
    }

    public <N1 extends N> C4617c<N1, V> f7l8(ki<N1> kiVar) {
        C4617c<N1, V> c4617c = (C4617c<N1, V>) zy();
        c4617c.f68280zy = (ki) com.google.common.base.jk.a9(kiVar);
        return c4617c;
    }

    /* JADX INFO: renamed from: k */
    public C4617c<N, V> m16201k(boolean z2) {
        this.f68279toq = z2;
        return this;
    }

    /* JADX INFO: renamed from: n */
    public C4617c<N, V> m16202n(int i2) {
        this.f26953q = com.google.common.base.o1t.of(Integer.valueOf(C4644t.toq(i2)));
        return this;
    }

    public <N1 extends N, V1 extends V> eqxt<N1, V1> toq() {
        return new ld6(this);
    }
}
