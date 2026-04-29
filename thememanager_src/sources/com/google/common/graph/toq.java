package com.google.common.graph;

import com.google.common.collect.ab;
import com.google.common.collect.g0ad;
import com.google.common.collect.nsb;
import com.google.common.collect.zwy;
import com.google.common.math.C4723q;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: AbstractDirectedNetworkConnections.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class toq<N, E> implements InterfaceC4642r<N, E> {

    /* JADX INFO: renamed from: k */
    protected final Map<E, N> f26964k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    protected final Map<E, N> f68283toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private int f68284zy;

    /* JADX INFO: renamed from: com.google.common.graph.toq$k */
    /* JADX INFO: compiled from: AbstractDirectedNetworkConnections.java */
    class C4646k extends AbstractSet<E> {
        C4646k() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return toq.this.f26964k.containsKey(obj) || toq.this.f68283toq.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ab<E> iterator() {
            return zwy.ek5k((toq.this.f68284zy == 0 ? nsb.m15902g(toq.this.f26964k.keySet(), toq.this.f68283toq.keySet()) : g0ad.m15696r(toq.this.f26964k.keySet(), toq.this.f68283toq.keySet())).iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return C4723q.m16543i(toq.this.f26964k.size(), toq.this.f68283toq.size() - toq.this.f68284zy);
        }
    }

    protected toq(Map<E, N> map, Map<E, N> map2, int i2) {
        this.f26964k = (Map) com.google.common.base.jk.a9(map);
        this.f68283toq = (Map) com.google.common.base.jk.a9(map2);
        this.f68284zy = C4644t.toq(i2);
        com.google.common.base.jk.yz(i2 <= map.size() && i2 <= map2.size());
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<E> f7l8() {
        return new C4646k();
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: g */
    public void mo16223g(E e2, N n2, boolean z2) {
        if (z2) {
            int i2 = this.f68284zy + 1;
            this.f68284zy = i2;
            C4644t.m16299q(i2);
        }
        com.google.common.base.jk.yz(this.f26964k.put(e2, n2) == null);
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<E> ld6() {
        return Collections.unmodifiableSet(this.f68283toq.keySet());
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: n */
    public void mo16225n(E e2, N n2) {
        com.google.common.base.jk.yz(this.f68283toq.put(e2, n2) == null);
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: p */
    public N mo16226p(E e2) {
        return (N) com.google.common.base.jk.a9(this.f68283toq.remove(e2));
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: q */
    public N mo16227q(E e2, boolean z2) {
        if (z2) {
            int i2 = this.f68284zy - 1;
            this.f68284zy = i2;
            C4644t.toq(i2);
        }
        return (N) com.google.common.base.jk.a9(this.f26964k.remove(e2));
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: s */
    public Set<E> mo16228s() {
        return Collections.unmodifiableSet(this.f26964k.keySet());
    }

    @Override // com.google.common.graph.InterfaceC4642r
    /* JADX INFO: renamed from: y */
    public N mo16229y(E e2) {
        return (N) com.google.common.base.jk.a9(this.f68283toq.get(e2));
    }

    @Override // com.google.common.graph.InterfaceC4642r
    public Set<N> zy() {
        return g0ad.m15696r(toq(), mo16224k());
    }
}
