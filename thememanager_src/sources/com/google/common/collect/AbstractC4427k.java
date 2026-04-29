package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.RetainedWith;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: renamed from: com.google.common.collect.k */
/* JADX INFO: compiled from: AbstractBiMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
abstract class AbstractC4427k<K, V> extends xwq3<K, V> implements ni7<K, V>, Serializable {

    @wlev.zy
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: g */
    @MonotonicNonNullDecl
    private transient Set<Map.Entry<K, V>> f26261g;

    @RetainedWith
    @MonotonicNonNullDecl
    transient AbstractC4427k<V, K> inverse;

    /* JADX INFO: renamed from: k */
    @MonotonicNonNullDecl
    private transient Map<K, V> f26262k;

    /* JADX INFO: renamed from: n */
    @MonotonicNonNullDecl
    private transient Set<V> f26263n;

    /* JADX INFO: renamed from: q */
    @MonotonicNonNullDecl
    private transient Set<K> f26264q;

    /* JADX INFO: renamed from: com.google.common.collect.k$g */
    /* JADX INFO: compiled from: AbstractBiMap.java */
    private class g extends qo<V> {

        /* JADX INFO: renamed from: k */
        final Set<V> f26265k;

        private g() {
            this.f26265k = AbstractC4427k.this.inverse.keySet();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<V> iterator() {
            return vy.zsr0(AbstractC4427k.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.qkj8, com.google.common.collect.o05
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        /* synthetic */ g(AbstractC4427k abstractC4427k, k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Set<V> delegate() {
            return this.f26265k;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.k$k */
    /* JADX INFO: compiled from: AbstractBiMap.java */
    class k implements Iterator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: k */
        @NullableDecl
        Map.Entry<K, V> f26267k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Iterator f26269q;

        k(Iterator it) {
            this.f26269q = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26269q.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            Map.Entry<K, V> entry = (Map.Entry) this.f26269q.next();
            this.f26267k = entry;
            return new toq(entry);
        }

        @Override // java.util.Iterator
        public void remove() {
            C4524t.m15984n(this.f26267k != null);
            V value = this.f26267k.getValue();
            this.f26269q.remove();
            AbstractC4427k.this.kja0(value);
            this.f26267k = null;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.k$n */
    /* JADX INFO: compiled from: AbstractBiMap.java */
    private class n extends qo<K> {
        private n() {
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC4427k.this.clear();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return vy.n5r1(AbstractC4427k.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            AbstractC4427k.this.x2(obj);
            return true;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        /* synthetic */ n(AbstractC4427k abstractC4427k, k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Set<K> delegate() {
            return AbstractC4427k.this.f26262k.keySet();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.k$q */
    /* JADX INFO: compiled from: AbstractBiMap.java */
    static class q<K, V> extends AbstractC4427k<K, V> {

        @wlev.zy
        private static final long serialVersionUID = 0;

        q(Map<K, V> map, AbstractC4427k<V, K> abstractC4427k) {
            super(map, abstractC4427k, null);
        }

        @wlev.zy
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            setInverse((AbstractC4427k) objectInputStream.readObject());
        }

        @wlev.zy
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(inverse());
        }

        @Override // com.google.common.collect.AbstractC4427k
        K checkKey(K k2) {
            return this.inverse.checkValue(k2);
        }

        @Override // com.google.common.collect.AbstractC4427k
        V checkValue(V v2) {
            return this.inverse.checkKey(v2);
        }

        @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.xwq3, com.google.common.collect.qkj8
        protected /* bridge */ /* synthetic */ Object delegate() {
            return super.delegate();
        }

        @wlev.zy
        Object readResolve() {
            return inverse().inverse();
        }

        @Override // com.google.common.collect.AbstractC4427k, com.google.common.collect.xwq3, java.util.Map, com.google.common.collect.ni7
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.k$toq */
    /* JADX INFO: compiled from: AbstractBiMap.java */
    class toq extends AbstractC4531v<K, V> {

        /* JADX INFO: renamed from: k */
        private final Map.Entry<K, V> f26271k;

        toq(Map.Entry<K, V> entry) {
            this.f26271k = entry;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractC4531v, com.google.common.collect.qkj8
        /* JADX INFO: renamed from: ld6 */
        public Map.Entry<K, V> delegate() {
            return this.f26271k;
        }

        @Override // com.google.common.collect.AbstractC4531v, java.util.Map.Entry
        public V setValue(V v2) {
            AbstractC4427k.this.checkValue(v2);
            com.google.common.base.jk.y9n(AbstractC4427k.this.entrySet().contains(this), "entry no longer in map");
            if (C4280z.m15455k(v2, getValue())) {
                return v2;
            }
            com.google.common.base.jk.fn3e(!AbstractC4427k.this.containsValue(v2), "value already present: %s", v2);
            V value = this.f26271k.setValue(v2);
            com.google.common.base.jk.y9n(C4280z.m15455k(v2, AbstractC4427k.this.get(getKey())), "entry no longer in map");
            AbstractC4427k.this.m15777h(getKey(), true, value, v2);
            return value;
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.k$zy */
    /* JADX INFO: compiled from: AbstractBiMap.java */
    private class zy extends qo<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: k */
        final Set<Map.Entry<K, V>> f26273k;

        private zy() {
            this.f26273k = AbstractC4427k.this.f26262k.entrySet();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public void clear() {
            AbstractC4427k.this.clear();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean contains(Object obj) {
            return vy.m16015h(delegate(), obj);
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return standardContainsAll(collection);
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractC4427k.this.entrySetIterator();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection
        public boolean remove(Object obj) {
            if (!this.f26273k.contains(obj)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            ((AbstractC4427k) AbstractC4427k.this.inverse).f26262k.remove(entry.getValue());
            this.f26273k.remove(entry);
            return true;
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return standardRemoveAll(collection);
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return standardRetainAll(collection);
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return standardToArray();
        }

        @Override // com.google.common.collect.AbstractC4572x, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) standardToArray(tArr);
        }

        /* synthetic */ zy(AbstractC4427k abstractC4427k, k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.qo, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
        public Set<Map.Entry<K, V>> delegate() {
            return this.f26273k;
        }
    }

    /* synthetic */ AbstractC4427k(Map map, AbstractC4427k abstractC4427k, k kVar) {
        this(map, abstractC4427k);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m15777h(K k2, boolean z2, V v2, V v3) {
        if (z2) {
            kja0(v2);
        }
        this.inverse.f26262k.put(v3, k2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void kja0(V v2) {
        this.inverse.f26262k.remove(v2);
    }

    private V ld6(@NullableDecl K k2, @NullableDecl V v2, boolean z2) {
        checkKey(k2);
        checkValue(v2);
        boolean zContainsKey = containsKey(k2);
        if (zContainsKey && C4280z.m15455k(v2, get(k2))) {
            return v2;
        }
        if (z2) {
            inverse().remove(v2);
        } else {
            com.google.common.base.jk.fn3e(!containsValue(v2), "value already present: %s", v2);
        }
        V vPut = this.f26262k.put(k2, v2);
        m15777h(k2, zContainsKey, vPut, v2);
        return vPut;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @CanIgnoreReturnValue
    public V x2(Object obj) {
        V vRemove = this.f26262k.remove(obj);
        kja0(vRemove);
        return vRemove;
    }

    @CanIgnoreReturnValue
    K checkKey(@NullableDecl K k2) {
        return k2;
    }

    @CanIgnoreReturnValue
    V checkValue(@NullableDecl V v2) {
        return v2;
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    public void clear() {
        this.f26262k.clear();
        this.inverse.f26262k.clear();
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return this.inverse.containsKey(obj);
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.f26261g;
        if (set != null) {
            return set;
        }
        zy zyVar = new zy(this, null);
        this.f26261g = zyVar;
        return zyVar;
    }

    Iterator<Map.Entry<K, V>> entrySetIterator() {
        return new k(this.f26262k.entrySet().iterator());
    }

    @Override // com.google.common.collect.ni7
    @CanIgnoreReturnValue
    public V forcePut(@NullableDecl K k2, @NullableDecl V v2) {
        return ld6(k2, v2, true);
    }

    public ni7<V, K> inverse() {
        return this.inverse;
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    public Set<K> keySet() {
        Set<K> set = this.f26264q;
        if (set != null) {
            return set;
        }
        n nVar = new n(this, null);
        this.f26264q = nVar;
        return nVar;
    }

    AbstractC4427k<V, K> makeInverse(Map<V, K> map) {
        return new q(map, this);
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    @CanIgnoreReturnValue
    public V put(@NullableDecl K k2, @NullableDecl V v2) {
        return ld6(k2, v2, false);
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.collect.xwq3, java.util.Map
    @CanIgnoreReturnValue
    public V remove(@NullableDecl Object obj) {
        if (containsKey(obj)) {
            return x2(obj);
        }
        return null;
    }

    void setDelegates(Map<K, V> map, Map<V, K> map2) {
        com.google.common.base.jk.yz(this.f26262k == null);
        com.google.common.base.jk.yz(this.inverse == null);
        com.google.common.base.jk.m15383q(map.isEmpty());
        com.google.common.base.jk.m15383q(map2.isEmpty());
        com.google.common.base.jk.m15383q(map != map2);
        this.f26262k = map;
        this.inverse = makeInverse(map2);
    }

    void setInverse(AbstractC4427k<V, K> abstractC4427k) {
        this.inverse = abstractC4427k;
    }

    AbstractC4427k(Map<K, V> map, Map<V, K> map2) {
        setDelegates(map, map2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.xwq3, com.google.common.collect.qkj8
    public Map<K, V> delegate() {
        return this.f26262k;
    }

    @Override // com.google.common.collect.xwq3, java.util.Map, com.google.common.collect.ni7
    public Set<V> values() {
        Set<V> set = this.f26263n;
        if (set != null) {
            return set;
        }
        g gVar = new g(this, null);
        this.f26263n = gVar;
        return gVar;
    }

    private AbstractC4427k(Map<K, V> map, AbstractC4427k<V, K> abstractC4427k) {
        this.f26262k = map;
        this.inverse = abstractC4427k;
    }
}
