package com.google.common.graph;

import com.google.common.collect.o05;
import com.google.common.collect.v0af;
import com.google.common.collect.zkd;
import com.google.errorprone.annotations.concurrent.LazyInit;
import java.lang.ref.Reference;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: DirectedMultiNetworkConnections.java */
/* JADX INFO: loaded from: classes2.dex */
final class kja0<N, E> extends toq<N, E> {

    /* JADX INFO: renamed from: n */
    @LazyInit
    private transient Reference<o05<N>> f26896n;

    /* JADX INFO: renamed from: q */
    @LazyInit
    private transient Reference<o05<N>> f26897q;

    /* JADX INFO: renamed from: com.google.common.graph.kja0$k */
    /* JADX INFO: compiled from: DirectedMultiNetworkConnections.java */
    class C4629k extends gvn7<E> {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Object f26899n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4629k(Map map, Object obj, Object obj2) {
            super(map, obj);
            this.f26899n = obj2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return kja0.this.t8r().count(this.f26899n);
        }
    }

    private kja0(Map<E, N> map, Map<E, N> map2, int i2) {
        super(map, map2, i2);
    }

    static <N, E> kja0<N, E> cdj(Map<E, N> map, Map<E, N> map2, int i2) {
        return new kja0<>(zkd.copyOf((Map) map), zkd.copyOf((Map) map2), i2);
    }

    /* JADX INFO: renamed from: h */
    static <N, E> kja0<N, E> m16250h() {
        return new kja0<>(new HashMap(2, 1.0f), new HashMap(2, 1.0f), 0);
    }

    private o05<N> ki() {
        o05<N> o05Var = (o05) kja0(this.f26897q);
        if (o05Var != null) {
            return o05Var;
        }
        v0af v0afVarCreate = v0af.create(this.f26964k.values());
        this.f26897q = new SoftReference(v0afVarCreate);
        return v0afVarCreate;
    }

    @NullableDecl
    private static <T> T kja0(@NullableDecl Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o05<N> t8r() {
        o05<N> o05Var = (o05) kja0(this.f26896n);
        if (o05Var != null) {
            return o05Var;
        }
        v0af v0afVarCreate = v0af.create(this.f68283toq.values());
        this.f26896n = new SoftReference(v0afVarCreate);
        return v0afVarCreate;
    }

    @Override // com.google.common.graph.toq, com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: g */
    public void mo16223g(E e2, N n2, boolean z2) {
        super.mo16223g(e2, n2, z2);
        o05 o05Var = (o05) kja0(this.f26897q);
        if (o05Var != null) {
            com.google.common.base.jk.yz(o05Var.add(n2));
        }
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: k */
    public Set<N> mo16224k() {
        return Collections.unmodifiableSet(t8r().elementSet());
    }

    @Override // com.google.common.graph.toq, com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: n */
    public void mo16225n(E e2, N n2) {
        super.mo16225n(e2, n2);
        o05 o05Var = (o05) kja0(this.f26896n);
        if (o05Var != null) {
            com.google.common.base.jk.yz(o05Var.add(n2));
        }
    }

    @Override // com.google.common.graph.toq, com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: p */
    public N mo16226p(E e2) {
        N n2 = (N) super.mo16226p(e2);
        o05 o05Var = (o05) kja0(this.f26896n);
        if (o05Var != null) {
            com.google.common.base.jk.yz(o05Var.remove(n2));
        }
        return n2;
    }

    @Override // com.google.common.graph.toq, com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: q */
    public N mo16227q(E e2, boolean z2) {
        N n2 = (N) super.mo16227q(e2, z2);
        o05 o05Var = (o05) kja0(this.f26897q);
        if (o05Var != null) {
            com.google.common.base.jk.yz(o05Var.remove(n2));
        }
        return n2;
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<N> toq() {
        return Collections.unmodifiableSet(ki().elementSet());
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<E> x2(N n2) {
        return new C4629k(this.f68283toq, n2, n2);
    }
}
