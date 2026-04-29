package com.google.common.graph;

import com.google.common.collect.ab;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: MapIteratorCache.java */
/* JADX INFO: loaded from: classes2.dex */
class fti<K, V> {

    /* JADX INFO: renamed from: k */
    private final Map<K, V> f26867k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @NullableDecl
    private transient Map.Entry<K, V> f68267toq;

    /* JADX INFO: renamed from: com.google.common.graph.fti$k */
    /* JADX INFO: compiled from: MapIteratorCache.java */
    class C4620k extends AbstractSet<K> {

        /* JADX INFO: renamed from: com.google.common.graph.fti$k$k */
        /* JADX INFO: compiled from: MapIteratorCache.java */
        class k extends ab<K> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Iterator f26869k;

            k(Iterator it) {
                this.f26869k = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f26869k.hasNext();
            }

            @Override // java.util.Iterator
            public K next() {
                Map.Entry entry = (Map.Entry) this.f26869k.next();
                fti.this.f68267toq = entry;
                return (K) entry.getKey();
            }
        }

        C4620k() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(@NullableDecl Object obj) {
            return fti.this.m16217n(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public ab<K> iterator() {
            return new k(fti.this.f26867k.entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return fti.this.f26867k.size();
        }
    }

    fti(Map<K, V> map) {
        this.f26867k = (Map) com.google.common.base.jk.a9(map);
    }

    protected V f7l8(@NullableDecl Object obj) {
        Map.Entry<K, V> entry = this.f68267toq;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }

    /* JADX INFO: renamed from: g */
    public V mo16216g(@NullableDecl Object obj) {
        V vF7l8 = f7l8(obj);
        return vF7l8 != null ? vF7l8 : m16221y(obj);
    }

    public final Set<K> ld6() {
        return new C4620k();
    }

    /* JADX INFO: renamed from: n */
    public final boolean m16217n(@NullableDecl Object obj) {
        return f7l8(obj) != null || this.f26867k.containsKey(obj);
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: p */
    public V m16218p(@NullableDecl Object obj) {
        mo16219q();
        return this.f26867k.remove(obj);
    }

    /* JADX INFO: renamed from: q */
    protected void mo16219q() {
        this.f68267toq = null;
    }

    @CanIgnoreReturnValue
    /* JADX INFO: renamed from: s */
    public V m16220s(@NullableDecl K k2, @NullableDecl V v2) {
        mo16219q();
        return this.f26867k.put(k2, v2);
    }

    /* JADX INFO: renamed from: y */
    public final V m16221y(@NullableDecl Object obj) {
        return this.f26867k.get(obj);
    }

    public void zy() {
        mo16219q();
        this.f26867k.clear();
    }
}
