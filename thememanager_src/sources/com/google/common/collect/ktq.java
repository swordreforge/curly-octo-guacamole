package com.google.common.collect;

import com.google.common.collect.el;
import com.google.common.collect.o05;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.j2objc.annotations.Weak;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ImmutableMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public abstract class ktq<K, V> extends zurt<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    final transient zkd<K, ? extends z4<V>> map;
    final transient int size;

    /* JADX INFO: compiled from: ImmutableMultimap.java */
    @wlev.zy
    private static final class f7l8 implements Serializable {
        final ktq<?, ?> multimap;

        f7l8(ktq<?, ?> ktqVar) {
            this.multimap = ktqVar;
        }

        Object readResolve() {
            return this.multimap.keys();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ktq$g */
    /* JADX INFO: compiled from: ImmutableMultimap.java */
    class C4431g extends b3e<K> {
        C4431g() {
        }

        @Override // com.google.common.collect.b3e, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(@NullableDecl Object obj) {
            return ktq.this.containsKey(obj);
        }

        @Override // com.google.common.collect.o05
        public int count(@NullableDecl Object obj) {
            z4<V> z4Var = ktq.this.map.get(obj);
            if (z4Var == null) {
                return 0;
            }
            return z4Var.size();
        }

        @Override // com.google.common.collect.b3e
        o05.InterfaceC4482k<K> getEntry(int i2) {
            Map.Entry<K, ? extends z4<V>> entry = ktq.this.map.entrySet().asList().get(i2);
            return m58i.ld6(entry.getKey(), entry.getValue().size());
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public int size() {
            return ktq.this.size();
        }

        @Override // com.google.common.collect.b3e, com.google.common.collect.z4
        @wlev.zy
        Object writeReplace() {
            return new f7l8(ktq.this);
        }

        @Override // com.google.common.collect.b3e, com.google.common.collect.o05
        public vep5<K> elementSet() {
            return ktq.this.keySet();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ktq$k */
    /* JADX INFO: compiled from: ImmutableMultimap.java */
    class C4432k extends ab<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: k */
        final Iterator<? extends Map.Entry<K, ? extends z4<V>>> f26280k;

        /* JADX INFO: renamed from: q */
        K f26282q = null;

        /* JADX INFO: renamed from: n */
        Iterator<V> f26281n = zwy.fn3e();

        C4432k() {
            this.f26280k = ktq.this.map.entrySet().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26281n.hasNext() || this.f26280k.hasNext();
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!this.f26281n.hasNext()) {
                Map.Entry<K, ? extends z4<V>> next = this.f26280k.next();
                this.f26282q = next.getKey();
                this.f26281n = next.getValue().iterator();
            }
            return vy.dd(this.f26282q, this.f26281n.next());
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ktq$n */
    /* JADX INFO: compiled from: ImmutableMultimap.java */
    @wlev.zy
    static class C4433n {

        /* JADX INFO: renamed from: k */
        static final el.toq<ktq> f26283k = el.m15645k(ktq.class, "map");

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        static final el.toq<ktq> f68221toq = el.m15645k(ktq.class, "size");

        C4433n() {
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ktq$q */
    /* JADX INFO: compiled from: ImmutableMultimap.java */
    private static class C4434q<K, V> extends z4<Map.Entry<K, V>> {
        private static final long serialVersionUID = 0;

        @Weak
        final ktq<K, V> multimap;

        C4434q(ktq<K, V> ktqVar) {
            this.multimap = ktqVar;
        }

        @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.multimap.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return this.multimap.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.multimap.size();
        }

        @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        public ab<Map.Entry<K, V>> iterator() {
            return this.multimap.entryIterator();
        }
    }

    /* JADX INFO: compiled from: ImmutableMultimap.java */
    class toq extends ab<V> {

        /* JADX INFO: renamed from: k */
        Iterator<? extends z4<V>> f26284k;

        /* JADX INFO: renamed from: q */
        Iterator<V> f26286q = zwy.fn3e();

        toq() {
            this.f26284k = ktq.this.map.values().iterator();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26286q.hasNext() || this.f26284k.hasNext();
        }

        @Override // java.util.Iterator
        public V next() {
            if (!this.f26286q.hasNext()) {
                this.f26286q = this.f26284k.next().iterator();
            }
            return this.f26286q.next();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.ktq$y */
    /* JADX INFO: compiled from: ImmutableMultimap.java */
    private static final class C4435y<K, V> extends z4<V> {
        private static final long serialVersionUID = 0;

        /* JADX INFO: renamed from: q */
        @Weak
        private final transient ktq<K, V> f26287q;

        C4435y(ktq<K, V> ktqVar) {
            this.f26287q = ktqVar;
        }

        @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(@NullableDecl Object obj) {
            return this.f26287q.containsValue(obj);
        }

        @Override // com.google.common.collect.z4
        @wlev.zy
        int copyIntoArray(Object[] objArr, int i2) {
            ab<? extends z4<V>> it = this.f26287q.map.values().iterator();
            while (it.hasNext()) {
                i2 = it.next().copyIntoArray(objArr, i2);
            }
            return i2;
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return this.f26287q.size();
        }

        @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        public ab<V> iterator() {
            return this.f26287q.valueIterator();
        }
    }

    /* JADX INFO: compiled from: ImmutableMultimap.java */
    public static class zy<K, V> {

        /* JADX INFO: renamed from: k */
        Map<K, Collection<V>> f26288k = m2t.m15832y();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @MonotonicNonNullDecl
        Comparator<? super K> f68222toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @MonotonicNonNullDecl
        Comparator<? super V> f68223zy;

        @CanIgnoreReturnValue
        public zy<K, V> f7l8(Map.Entry<? extends K, ? extends V> entry) {
            return mo15711g(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: g */
        public zy<K, V> mo15711g(K k2, V v2) {
            C4524t.m15983k(k2, v2);
            Collection<V> collection = this.f26288k.get(k2);
            if (collection == null) {
                Map<K, Collection<V>> map = this.f26288k;
                Collection<V> collectionZy = zy();
                map.put(k2, collectionZy);
                collection = collectionZy;
            }
            collection.add(v2);
            return this;
        }

        /* JADX INFO: renamed from: k */
        public ktq<K, V> mo15714k() {
            Collection collectionEntrySet = this.f26288k.entrySet();
            Comparator<? super K> comparator = this.f68222toq;
            if (comparator != null) {
                collectionEntrySet = kx3.from(comparator).onKeys().immutableSortedCopy(collectionEntrySet);
            }
            return gc3c.fromMapEntries(collectionEntrySet, this.f68223zy);
        }

        @CanIgnoreReturnValue
        public zy<K, V> ld6(K k2, V... vArr) {
            return mo15716p(k2, Arrays.asList(vArr));
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: n */
        public zy<K, V> mo15715n(Comparator<? super V> comparator) {
            this.f68223zy = (Comparator) com.google.common.base.jk.a9(comparator);
            return this;
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: p */
        public zy<K, V> mo15716p(K k2, Iterable<? extends V> iterable) {
            if (k2 == null) {
                throw new NullPointerException("null key in entry: null=" + nsb.hyr(iterable));
            }
            Collection<V> collection = this.f26288k.get(k2);
            if (collection != null) {
                for (V v2 : iterable) {
                    C4524t.m15983k(k2, v2);
                    collection.add(v2);
                }
                return this;
            }
            Iterator<? extends V> it = iterable.iterator();
            if (!it.hasNext()) {
                return this;
            }
            Collection<V> collectionZy = zy();
            while (it.hasNext()) {
                V next = it.next();
                C4524t.m15983k(k2, next);
                collectionZy.add(next);
            }
            this.f26288k.put(k2, collectionZy);
            return this;
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: q */
        public zy<K, V> mo15717q(Comparator<? super K> comparator) {
            this.f68222toq = (Comparator) com.google.common.base.jk.a9(comparator);
            return this;
        }

        @CanIgnoreReturnValue
        @InterfaceC7731k
        /* JADX INFO: renamed from: s */
        public zy<K, V> mo15718s(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                f7l8(it.next());
            }
            return this;
        }

        @CanIgnoreReturnValue
        zy<K, V> toq(zy<K, V> zyVar) {
            for (Map.Entry<K, Collection<V>> entry : zyVar.f26288k.entrySet()) {
                mo15716p(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: y */
        public zy<K, V> mo15719y(lw<? extends K, ? extends V> lwVar) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : lwVar.asMap().entrySet()) {
                mo15716p(entry.getKey(), entry.getValue());
            }
            return this;
        }

        Collection<V> zy() {
            return new ArrayList();
        }
    }

    ktq(zkd<K, ? extends z4<V>> zkdVar, int i2) {
        this.map = zkdVar;
        this.size = i2;
    }

    public static <K, V> zy<K, V> builder() {
        return new zy<>();
    }

    public static <K, V> ktq<K, V> copyOf(lw<? extends K, ? extends V> lwVar) {
        if (lwVar instanceof ktq) {
            ktq<K, V> ktqVar = (ktq) lwVar;
            if (!ktqVar.isPartialView()) {
                return ktqVar;
            }
        }
        return gc3c.copyOf((lw) lwVar);
    }

    public static <K, V> ktq<K, V> of() {
        return gc3c.of();
    }

    @Override // com.google.common.collect.lw
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ boolean containsEntry(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return super.containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.lw
    public boolean containsKey(@NullableDecl Object obj) {
        return this.map.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public boolean containsValue(@NullableDecl Object obj) {
        return obj != null && super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractC4579y
    Map<K, Collection<V>> createAsMap() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractC4579y
    Set<K> createKeySet() {
        throw new AssertionError("unreachable");
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.lw
    public abstract z4<V> get(K k2);

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public abstract ktq<V, K> inverse();

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    boolean isPartialView() {
        return this.map.isPartialView();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    @Deprecated
    public boolean put(K k2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    @Deprecated
    public boolean putAll(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    @Deprecated
    public boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.lw
    public int size() {
        return this.size;
    }

    @Override // com.google.common.collect.AbstractC4579y
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    public static <K, V> ktq<K, V> of(K k2, V v2) {
        return gc3c.of((Object) k2, (Object) v2);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw, com.google.common.collect.h4b
    public zkd<K, Collection<V>> asMap() {
        return this.map;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4579y
    public z4<Map.Entry<K, V>> createEntries() {
        return new C4434q(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4579y
    public b3e<K> createKeys() {
        return new C4431g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4579y
    public z4<V> createValues() {
        return new C4435y(this);
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public z4<Map.Entry<K, V>> entries() {
        return (z4) super.entries();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4579y
    public ab<Map.Entry<K, V>> entryIterator() {
        return new C4432k();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public vep5<K> keySet() {
        return this.map.keySet();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public b3e<K> keys() {
        return (b3e) super.keys();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    @Deprecated
    public boolean putAll(lw<? extends K, ? extends V> lwVar) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.lw
    @CanIgnoreReturnValue
    @Deprecated
    public z4<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    @Deprecated
    public z4<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractC4579y
    public ab<V> valueIterator() {
        return new toq();
    }

    @Override // com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public z4<V> values() {
        return (z4) super.values();
    }

    public static <K, V> ktq<K, V> of(K k2, V v2, K k3, V v3) {
        return gc3c.of((Object) k2, (Object) v2, (Object) k3, (Object) v3);
    }

    public static <K, V> ktq<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4) {
        return gc3c.of((Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4);
    }

    @InterfaceC7731k
    public static <K, V> ktq<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return gc3c.copyOf((Iterable) iterable);
    }

    public static <K, V> ktq<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        return gc3c.of((Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4, (Object) k5, (Object) v5);
    }

    public static <K, V> ktq<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        return gc3c.of((Object) k2, (Object) v2, (Object) k3, (Object) v3, (Object) k4, (Object) v4, (Object) k5, (Object) v5, (Object) k6, (Object) v6);
    }
}
