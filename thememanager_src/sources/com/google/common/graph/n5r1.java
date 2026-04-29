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

/* JADX INFO: compiled from: UndirectedMultiNetworkConnections.java */
/* JADX INFO: loaded from: classes2.dex */
final class n5r1<N, E> extends AbstractC4621g<N, E> {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @LazyInit
    private transient Reference<o05<N>> f68272toq;

    /* JADX INFO: renamed from: com.google.common.graph.n5r1$k */
    /* JADX INFO: compiled from: UndirectedMultiNetworkConnections.java */
    class C4632k extends gvn7<E> {

        /* JADX INFO: renamed from: n */
        final /* synthetic */ Object f26912n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4632k(Map map, Object obj, Object obj2) {
            super(map, obj);
            this.f26912n = obj2;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return n5r1.this.n7h().count(this.f26912n);
        }
    }

    private n5r1(Map<E, N> map) {
        super(map);
    }

    static <N, E> n5r1<N, E> cdj(Map<E, N> map) {
        return new n5r1<>(zkd.copyOf((Map) map));
    }

    /* JADX INFO: renamed from: h */
    static <N, E> n5r1<N, E> m16271h() {
        return new n5r1<>(new HashMap(2, 1.0f));
    }

    @NullableDecl
    private static <T> T kja0(@NullableDecl Reference<T> reference) {
        if (reference == null) {
            return null;
        }
        return reference.get();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public o05<N> n7h() {
        o05<N> o05Var = (o05) kja0(this.f68272toq);
        if (o05Var != null) {
            return o05Var;
        }
        v0af v0afVarCreate = v0af.create(this.f26871k.values());
        this.f68272toq = new SoftReference(v0afVarCreate);
        return v0afVarCreate;
    }

    @Override // com.google.common.graph.AbstractC4621g, com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: g */
    public void mo16223g(E e2, N n2, boolean z2) {
        if (z2) {
            return;
        }
        mo16225n(e2, n2);
    }

    @Override // com.google.common.graph.AbstractC4621g, com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: n */
    public void mo16225n(E e2, N n2) {
        super.mo16225n(e2, n2);
        o05 o05Var = (o05) kja0(this.f68272toq);
        if (o05Var != null) {
            com.google.common.base.jk.yz(o05Var.add(n2));
        }
    }

    @Override // com.google.common.graph.AbstractC4621g, com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: p */
    public N mo16226p(E e2) {
        N n2 = (N) super.mo16226p(e2);
        o05 o05Var = (o05) kja0(this.f68272toq);
        if (o05Var != null) {
            com.google.common.base.jk.yz(o05Var.remove(n2));
        }
        return n2;
    }

    @Override // com.google.common.graph.AbstractC4621g, com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: q */
    public N mo16227q(E e2, boolean z2) {
        if (z2) {
            return null;
        }
        return mo16226p(e2);
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<E> x2(N n2) {
        return new C4632k(this.f26871k, n2, n2);
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<N> zy() {
        return Collections.unmodifiableSet(n7h().elementSet());
    }
}
