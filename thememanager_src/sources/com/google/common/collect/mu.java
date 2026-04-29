package com.google.common.collect;

import com.google.common.collect.vy;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedMap;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ForwardingNavigableMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public abstract class mu<K, V> extends wo<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: com.google.common.collect.mu$k */
    /* JADX INFO: compiled from: ForwardingNavigableMap.java */
    @InterfaceC7731k
    protected class C4468k extends vy.cdj<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.mu$k$k */
        /* JADX INFO: compiled from: ForwardingNavigableMap.java */
        class k implements Iterator<Map.Entry<K, V>> {

            /* JADX INFO: renamed from: k */
            private Map.Entry<K, V> f26428k = null;

            /* JADX INFO: renamed from: q */
            private Map.Entry<K, V> f26430q;

            k() {
                this.f26430q = C4468k.this.kja0().lastEntry();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f26430q != null;
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                try {
                    Map.Entry<K, V> entry = this.f26430q;
                    this.f26428k = entry;
                    this.f26430q = C4468k.this.kja0().lowerEntry(this.f26430q.getKey());
                    return entry;
                } catch (Throwable th) {
                    this.f26428k = this.f26430q;
                    this.f26430q = C4468k.this.kja0().lowerEntry(this.f26430q.getKey());
                    throw th;
                }
            }

            @Override // java.util.Iterator
            public void remove() {
                C4524t.m15984n(this.f26428k != null);
                C4468k.this.kja0().remove(this.f26428k.getKey());
                this.f26428k = null;
            }
        }

        public C4468k() {
        }

        @Override // com.google.common.collect.vy.cdj
        NavigableMap<K, V> kja0() {
            return mu.this;
        }

        @Override // com.google.common.collect.vy.cdj
        protected Iterator<Map.Entry<K, V>> x2() {
            return new k();
        }
    }

    /* JADX INFO: compiled from: ForwardingNavigableMap.java */
    @InterfaceC7731k
    protected class toq extends vy.a9<K, V> {
        public toq() {
            super(mu.this);
        }
    }

    protected mu() {
    }

    protected Map.Entry<K, V> a9() {
        return (Map.Entry) zwy.m16120f(entrySet().iterator());
    }

    @InterfaceC7731k
    protected NavigableSet<K> cdj() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k2) {
        return delegate().ceilingEntry(k2);
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k2) {
        return delegate().ceilingKey(k2);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return delegate().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return delegate().descendingMap();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k2) {
        return delegate().floorEntry(k2);
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k2) {
        return delegate().floorKey(k2);
    }

    protected K fn3e() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    protected Map.Entry<K, V> fti() {
        return (Map.Entry) zwy.m16120f(descendingMap().entrySet().iterator());
    }

    protected SortedMap<K, V> fu4(K k2) {
        return headMap(k2, false);
    }

    /* JADX INFO: renamed from: h */
    protected K m15876h(K k2) {
        return (K) vy.hyr(ceilingEntry(k2));
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(K k2, boolean z2) {
        return delegate().headMap(k2, z2);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k2) {
        return delegate().higherEntry(k2);
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k2) {
        return delegate().higherKey(k2);
    }

    /* JADX INFO: renamed from: i */
    protected Map.Entry<K, V> m15877i() {
        return (Map.Entry) nsb.zurt(entrySet(), null);
    }

    protected K jk(K k2) {
        return (K) vy.hyr(lowerEntry(k2));
    }

    protected SortedMap<K, V> jp0y(K k2) {
        return tailMap(k2, true);
    }

    protected Map.Entry<K, V> kja0(K k2) {
        return tailMap(k2, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k2) {
        return delegate().lowerEntry(k2);
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k2) {
        return delegate().lowerKey(k2);
    }

    protected Map.Entry<K, V> mcp(K k2) {
        return headMap(k2, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return delegate().navigableKeySet();
    }

    protected K ni7(K k2) {
        return (K) vy.hyr(floorEntry(k2));
    }

    protected K o1t(K k2) {
        return (K) vy.hyr(higherEntry(k2));
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        return delegate().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        return delegate().pollLastEntry();
    }

    @Override // com.google.common.collect.wo
    protected SortedMap<K, V> standardSubMap(K k2, K k3) {
        return subMap(k2, true, k3, false);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(K k2, boolean z2, K k3, boolean z3) {
        return delegate().subMap(k2, z2, k3, z3);
    }

    /* JADX INFO: renamed from: t */
    protected K m15878t() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(K k2, boolean z2) {
        return delegate().tailMap(k2, z2);
    }

    protected Map.Entry<K, V> wvg() {
        return (Map.Entry) nsb.zurt(descendingMap().entrySet(), null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.wo, com.google.common.collect.xwq3, com.google.common.collect.qkj8
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public abstract NavigableMap<K, V> delegate();

    /* JADX INFO: renamed from: z */
    protected Map.Entry<K, V> m15879z(K k2) {
        return tailMap(k2, false).firstEntry();
    }

    protected Map.Entry<K, V> zurt(K k2) {
        return headMap(k2, true).lastEntry();
    }
}
