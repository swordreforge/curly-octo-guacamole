package com.google.common.graph;

import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: NetworkBuilder.java */
/* JADX INFO: loaded from: classes2.dex */
@InterfaceC7731k
public final class lvui<N, E> extends AbstractC4641q<N> {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    com.google.common.base.o1t<Integer> f68271f7l8;

    /* JADX INFO: renamed from: g */
    ki<? super E> f26901g;

    /* JADX INFO: renamed from: n */
    boolean f26902n;

    private lvui(boolean z2) {
        super(z2);
        this.f26902n = false;
        this.f26901g = ki.m16247q();
        this.f68271f7l8 = com.google.common.base.o1t.absent();
    }

    public static lvui<Object, Object> ld6() {
        return new lvui<>(false);
    }

    /* JADX INFO: renamed from: n */
    public static lvui<Object, Object> m16260n() {
        return new lvui<>(true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private <N1 extends N, E1 extends E> lvui<N1, E1> m16261q() {
        return this;
    }

    /* JADX INFO: renamed from: s */
    public static <N, E> lvui<N, E> m16262s(d2ok<N, E> d2okVar) {
        return new lvui(d2okVar.mo16205n()).m16264k(d2okVar.fu4()).toq(d2okVar.mo16206p()).m16265p(d2okVar.mo16209y()).m16263g(d2okVar.jp0y());
    }

    public lvui<N, E> f7l8(int i2) {
        this.f68271f7l8 = com.google.common.base.o1t.of(Integer.valueOf(C4644t.toq(i2)));
        return this;
    }

    /* JADX INFO: renamed from: g */
    public <E1 extends E> lvui<N, E1> m16263g(ki<E1> kiVar) {
        lvui<N, E1> lvuiVar = (lvui<N, E1>) m16261q();
        lvuiVar.f26901g = (ki) com.google.common.base.jk.a9(kiVar);
        return lvuiVar;
    }

    /* JADX INFO: renamed from: k */
    public lvui<N, E> m16264k(boolean z2) {
        this.f26902n = z2;
        return this;
    }

    /* JADX INFO: renamed from: p */
    public <N1 extends N> lvui<N1, E> m16265p(ki<N1> kiVar) {
        lvui<N1, E> lvuiVar = (lvui<N1, E>) m16261q();
        lvuiVar.f68280zy = (ki) com.google.common.base.jk.a9(kiVar);
        return lvuiVar;
    }

    public lvui<N, E> toq(boolean z2) {
        this.f68279toq = z2;
        return this;
    }

    /* JADX INFO: renamed from: y */
    public lvui<N, E> m16266y(int i2) {
        this.f26953q = com.google.common.base.o1t.of(Integer.valueOf(C4644t.toq(i2)));
        return this;
    }

    public <N1 extends N, E1 extends E> oc<N1, E1> zy() {
        return new C4640p(this);
    }
}
