package com.google.common.collect;

import com.google.common.collect.z4;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ImmutableMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public abstract class zkd<K, V> implements Map<K, V>, Serializable {
    static final Map.Entry<?, ?>[] EMPTY_ENTRY_ARRAY = new Map.Entry[0];

    /* JADX INFO: renamed from: g */
    @LazyInit
    private transient mbx<K, V> f26772g;

    /* JADX INFO: renamed from: k */
    @LazyInit
    private transient vep5<Map.Entry<K, V>> f26773k;

    /* JADX INFO: renamed from: n */
    @RetainedWith
    @LazyInit
    private transient z4<V> f26774n;

    /* JADX INFO: renamed from: q */
    @RetainedWith
    @LazyInit
    private transient vep5<K> f26775q;

    /* JADX INFO: renamed from: com.google.common.collect.zkd$k */
    /* JADX INFO: compiled from: ImmutableMap.java */
    class C4585k extends ab<K> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ab f26776k;

        C4585k(ab abVar) {
            this.f26776k = abVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f26776k.hasNext();
        }

        @Override // java.util.Iterator
        public K next() {
            return (K) ((Map.Entry) this.f26776k.next()).getKey();
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.zkd$n */
    /* JADX INFO: compiled from: ImmutableMap.java */
    static class C4586n implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object[] keys;
        private final Object[] values;

        C4586n(zkd<?, ?> zkdVar) {
            this.keys = new Object[zkdVar.size()];
            this.values = new Object[zkdVar.size()];
            ab<Map.Entry<?, ?>> it = zkdVar.entrySet().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                this.keys[i2] = next.getKey();
                this.values[i2] = next.getValue();
                i2++;
            }
        }

        Object createMap(toq<Object, Object> toqVar) {
            int i2 = 0;
            while (true) {
                Object[] objArr = this.keys;
                if (i2 >= objArr.length) {
                    return toqVar.mo15589k();
                }
                toqVar.mo15592q(objArr[i2], this.values[i2]);
                i2++;
            }
        }

        Object readResolve() {
            return createMap(new toq<>(this.keys.length));
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.zkd$q */
    /* JADX INFO: compiled from: ImmutableMap.java */
    private final class C4587q extends zy<K, vep5<V>> {

        /* JADX INFO: renamed from: com.google.common.collect.zkd$q$k */
        /* JADX INFO: compiled from: ImmutableMap.java */
        class k extends ab<Map.Entry<K, vep5<V>>> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ Iterator f26778k;

            /* JADX INFO: renamed from: com.google.common.collect.zkd$q$k$k, reason: collision with other inner class name */
            /* JADX INFO: compiled from: ImmutableMap.java */
            class C8002k extends f7l8<K, vep5<V>> {

                /* JADX INFO: renamed from: k */
                final /* synthetic */ Map.Entry f26780k;

                C8002k(Map.Entry entry) {
                    this.f26780k = entry;
                }

                @Override // com.google.common.collect.f7l8, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f26780k.getKey();
                }

                @Override // com.google.common.collect.f7l8, java.util.Map.Entry
                /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
                public vep5<V> getValue() {
                    return vep5.of(this.f26780k.getValue());
                }
            }

            k(Iterator it) {
                this.f26778k = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f26778k.hasNext();
            }

            @Override // java.util.Iterator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, vep5<V>> next() {
                return new C8002k((Map.Entry) this.f26778k.next());
            }
        }

        private C4587q() {
        }

        @Override // com.google.common.collect.zkd, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return zkd.this.containsKey(obj);
        }

        @Override // com.google.common.collect.zkd.zy, com.google.common.collect.zkd
        vep5<K> createKeySet() {
            return zkd.this.keySet();
        }

        @Override // com.google.common.collect.zkd.zy
        ab<Map.Entry<K, vep5<V>>> entryIterator() {
            return new k(zkd.this.entrySet().iterator());
        }

        @Override // com.google.common.collect.zkd, java.util.Map
        public int hashCode() {
            return zkd.this.hashCode();
        }

        @Override // com.google.common.collect.zkd
        boolean isHashCodeFast() {
            return zkd.this.isHashCodeFast();
        }

        @Override // com.google.common.collect.zkd
        boolean isPartialView() {
            return zkd.this.isPartialView();
        }

        @Override // java.util.Map
        public int size() {
            return zkd.this.size();
        }

        /* synthetic */ C4587q(zkd zkdVar, C4585k c4585k) {
            this();
        }

        @Override // com.google.common.collect.zkd, java.util.Map
        public vep5<V> get(@NullableDecl Object obj) {
            Object obj2 = zkd.this.get(obj);
            if (obj2 == null) {
                return null;
            }
            return vep5.of(obj2);
        }
    }

    /* JADX INFO: compiled from: ImmutableMap.java */
    public static class toq<K, V> {

        /* JADX INFO: renamed from: k */
        @MonotonicNonNullDecl
        Comparator<? super V> f26782k;

        /* JADX INFO: renamed from: q */
        boolean f26783q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        Object[] f68240toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        int f68241zy;

        public toq() {
            this(4);
        }

        private void toq(int i2) {
            int i3 = i2 * 2;
            Object[] objArr = this.f68240toq;
            if (i3 > objArr.length) {
                this.f68240toq = Arrays.copyOf(objArr, z4.toq.m16103g(objArr.length, i3));
                this.f26783q = false;
            }
        }

        @CanIgnoreReturnValue
        public toq<K, V> f7l8(Map<? extends K, ? extends V> map) {
            return mo15588g(map.entrySet());
        }

        @CanIgnoreReturnValue
        @InterfaceC7731k
        /* JADX INFO: renamed from: g */
        public toq<K, V> mo15588g(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            if (iterable instanceof Collection) {
                toq(this.f68241zy + ((Collection) iterable).size());
            }
            Iterator<? extends Map.Entry<? extends K, ? extends V>> it = iterable.iterator();
            while (it.hasNext()) {
                mo15590n(it.next());
            }
            return this;
        }

        /* JADX INFO: renamed from: k */
        public zkd<K, V> mo15589k() {
            m16117y();
            this.f26783q = true;
            return ec.create(this.f68241zy, this.f68240toq);
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: n */
        public toq<K, V> mo15590n(Map.Entry<? extends K, ? extends V> entry) {
            return mo15592q(entry.getKey(), entry.getValue());
        }

        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: q */
        public toq<K, V> mo15592q(K k2, V v2) {
            toq(this.f68241zy + 1);
            C4524t.m15983k(k2, v2);
            Object[] objArr = this.f68240toq;
            int i2 = this.f68241zy;
            objArr[i2 * 2] = k2;
            objArr[(i2 * 2) + 1] = v2;
            this.f68241zy = i2 + 1;
            return this;
        }

        /* JADX INFO: renamed from: y */
        void m16117y() {
            int i2;
            if (this.f26782k != null) {
                if (this.f26783q) {
                    this.f68240toq = Arrays.copyOf(this.f68240toq, this.f68241zy * 2);
                }
                Map.Entry[] entryArr = new Map.Entry[this.f68241zy];
                int i3 = 0;
                while (true) {
                    i2 = this.f68241zy;
                    if (i3 >= i2) {
                        break;
                    }
                    Object[] objArr = this.f68240toq;
                    int i4 = i3 * 2;
                    entryArr[i3] = new AbstractMap.SimpleImmutableEntry(objArr[i4], objArr[i4 + 1]);
                    i3++;
                }
                Arrays.sort(entryArr, 0, i2, kx3.from(this.f26782k).onResultOf(vy.gbni()));
                for (int i5 = 0; i5 < this.f68241zy; i5++) {
                    int i6 = i5 * 2;
                    this.f68240toq[i6] = entryArr[i5].getKey();
                    this.f68240toq[i6 + 1] = entryArr[i5].getValue();
                }
            }
        }

        @CanIgnoreReturnValue
        @InterfaceC7731k
        public toq<K, V> zy(Comparator<? super V> comparator) {
            com.google.common.base.jk.y9n(this.f26782k == null, "valueComparator was already set");
            this.f26782k = (Comparator) com.google.common.base.jk.fti(comparator, "valueComparator");
            return this;
        }

        toq(int i2) {
            this.f68240toq = new Object[i2 * 2];
            this.f68241zy = 0;
            this.f26783q = false;
        }
    }

    /* JADX INFO: compiled from: ImmutableMap.java */
    static abstract class zy<K, V> extends zkd<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.zkd$zy$k */
        /* JADX INFO: compiled from: ImmutableMap.java */
        class C4588k extends bz2<K, V> {
            C4588k() {
            }

            @Override // com.google.common.collect.bz2
            zkd<K, V> map() {
                return zy.this;
            }

            @Override // com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
            public ab<Map.Entry<K, V>> iterator() {
                return zy.this.entryIterator();
            }
        }

        zy() {
        }

        @Override // com.google.common.collect.zkd
        vep5<Map.Entry<K, V>> createEntrySet() {
            return new C4588k();
        }

        @Override // com.google.common.collect.zkd
        vep5<K> createKeySet() {
            return new uj2j(this);
        }

        @Override // com.google.common.collect.zkd
        z4<V> createValues() {
            return new jz5(this);
        }

        abstract ab<Map.Entry<K, V>> entryIterator();

        @Override // com.google.common.collect.zkd, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Set entrySet() {
            return super.entrySet();
        }

        @Override // com.google.common.collect.zkd, java.util.Map, java.util.SortedMap
        public /* bridge */ /* synthetic */ Set keySet() {
            return super.keySet();
        }

        @Override // com.google.common.collect.zkd, java.util.Map
        public /* bridge */ /* synthetic */ Collection values() {
            return super.values();
        }
    }

    zkd() {
    }

    public static <K, V> toq<K, V> builder() {
        return new toq<>();
    }

    @InterfaceC7731k
    public static <K, V> toq<K, V> builderWithExpectedSize(int i2) {
        C4524t.toq(i2, "expectedSize");
        return new toq<>(i2);
    }

    static void checkNoConflict(boolean z2, String str, Map.Entry<?, ?> entry, Map.Entry<?, ?> entry2) {
        if (!z2) {
            throw conflictException(str, entry, entry2);
        }
    }

    static IllegalArgumentException conflictException(String str, Object obj, Object obj2) {
        return new IllegalArgumentException("Multiple entries with same " + str + ": " + obj + " and " + obj2);
    }

    public static <K, V> zkd<K, V> copyOf(Map<? extends K, ? extends V> map) {
        if ((map instanceof zkd) && !(map instanceof SortedMap)) {
            zkd<K, V> zkdVar = (zkd) map;
            if (!zkdVar.isPartialView()) {
                return zkdVar;
            }
        }
        return copyOf(map.entrySet());
    }

    static <K, V> Map.Entry<K, V> entryOf(K k2, V v2) {
        C4524t.m15983k(k2, v2);
        return new AbstractMap.SimpleImmutableEntry(k2, v2);
    }

    public static <K, V> zkd<K, V> of() {
        return (zkd<K, V>) ec.EMPTY;
    }

    public mbx<K, V> asMultimap() {
        if (isEmpty()) {
            return mbx.of();
        }
        mbx<K, V> mbxVar = this.f26772g;
        if (mbxVar != null) {
            return mbxVar;
        }
        mbx<K, V> mbxVar2 = new mbx<>(new C4587q(this, null), size(), null);
        this.f26772g = mbxVar2;
        return mbxVar2;
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    abstract vep5<Map.Entry<K, V>> createEntrySet();

    abstract vep5<K> createKeySet();

    abstract z4<V> createValues();

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        return vy.ni7(this, obj);
    }

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v2) {
        V v3 = get(obj);
        return v3 != null ? v3 : v2;
    }

    @Override // java.util.Map
    public int hashCode() {
        return g0ad.ld6(entrySet());
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    boolean isHashCodeFast() {
        return false;
    }

    abstract boolean isPartialView();

    ab<K> keyIterator() {
        return new C4585k(entrySet().iterator());
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V put(K k2, V v2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @CanIgnoreReturnValue
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        return vy.c8jq(this);
    }

    Object writeReplace() {
        return new C4586n(this);
    }

    public static <K, V> zkd<K, V> of(K k2, V v2) {
        C4524t.m15983k(k2, v2);
        return ec.create(1, new Object[]{k2, v2});
    }

    @Override // java.util.Map, java.util.SortedMap
    public vep5<Map.Entry<K, V>> entrySet() {
        vep5<Map.Entry<K, V>> vep5Var = this.f26773k;
        if (vep5Var != null) {
            return vep5Var;
        }
        vep5<Map.Entry<K, V>> vep5VarCreateEntrySet = createEntrySet();
        this.f26773k = vep5VarCreateEntrySet;
        return vep5VarCreateEntrySet;
    }

    @Override // java.util.Map, java.util.SortedMap
    public vep5<K> keySet() {
        vep5<K> vep5Var = this.f26775q;
        if (vep5Var != null) {
            return vep5Var;
        }
        vep5<K> vep5VarCreateKeySet = createKeySet();
        this.f26775q = vep5VarCreateKeySet;
        return vep5VarCreateKeySet;
    }

    @Override // java.util.Map
    public z4<V> values() {
        z4<V> z4Var = this.f26774n;
        if (z4Var != null) {
            return z4Var;
        }
        z4<V> z4VarCreateValues = createValues();
        this.f26774n = z4VarCreateValues;
        return z4VarCreateValues;
    }

    public static <K, V> zkd<K, V> of(K k2, V v2, K k3, V v3) {
        C4524t.m15983k(k2, v2);
        C4524t.m15983k(k3, v3);
        return ec.create(2, new Object[]{k2, v2, k3, v3});
    }

    @InterfaceC7731k
    public static <K, V> zkd<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        toq toqVar = new toq(iterable instanceof Collection ? ((Collection) iterable).size() : 4);
        toqVar.mo15588g(iterable);
        return toqVar.mo15589k();
    }

    public static <K, V> zkd<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4) {
        C4524t.m15983k(k2, v2);
        C4524t.m15983k(k3, v3);
        C4524t.m15983k(k4, v4);
        return ec.create(3, new Object[]{k2, v2, k3, v3, k4, v4});
    }

    public static <K, V> zkd<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C4524t.m15983k(k2, v2);
        C4524t.m15983k(k3, v3);
        C4524t.m15983k(k4, v4);
        C4524t.m15983k(k5, v5);
        return ec.create(4, new Object[]{k2, v2, k3, v3, k4, v4, k5, v5});
    }

    public static <K, V> zkd<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        C4524t.m15983k(k2, v2);
        C4524t.m15983k(k3, v3);
        C4524t.m15983k(k4, v4);
        C4524t.m15983k(k5, v5);
        C4524t.m15983k(k6, v6);
        return ec.create(5, new Object[]{k2, v2, k3, v3, k4, v4, k5, v5, k6, v6});
    }
}
