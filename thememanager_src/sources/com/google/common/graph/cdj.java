package com.google.common.graph;

import com.google.common.collect.ab;
import com.google.common.collect.vep5;
import com.google.common.collect.zwy;
import java.util.AbstractSet;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: EdgesConnecting.java */
/* JADX INFO: loaded from: classes2.dex */
final class cdj<E> extends AbstractSet<E> {

    /* JADX INFO: renamed from: k */
    private final Map<?, E> f26863k;

    /* JADX INFO: renamed from: q */
    private final Object f26864q;

    cdj(Map<?, E> map, Object obj) {
        this.f26863k = (Map) com.google.common.base.jk.a9(map);
        this.f26864q = com.google.common.base.jk.a9(obj);
    }

    @NullableDecl
    /* JADX INFO: renamed from: k */
    private E m16203k() {
        return this.f26863k.get(this.f26864q);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(@NullableDecl Object obj) {
        E eM16203k = m16203k();
        return eM16203k != null && eM16203k.equals(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return m16203k() == null ? 0 : 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
    public ab<E> iterator() {
        E eM16203k = m16203k();
        return eM16203k == null ? vep5.of().iterator() : zwy.vyq(eM16203k);
    }
}
