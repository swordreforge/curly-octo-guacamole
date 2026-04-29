package com.google.common.collect;

import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.common.collect.z4;
import com.google.common.collect.zkd;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.SortedMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ImmutableSortedMap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public final class jbh<K, V> extends yl<K, V> implements NavigableMap<K, V> {

    /* JADX INFO: renamed from: h */
    private static final Comparator<Comparable> f26224h = kx3.natural();

    /* JADX INFO: renamed from: i */
    private static final jbh<Comparable, Object> f26225i = new jbh<>(ixz.emptySet(kx3.natural()), se.of());
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: p */
    private transient jbh<K, V> f26226p;

    /* JADX INFO: renamed from: s */
    private final transient se<V> f26227s;

    /* JADX INFO: renamed from: y */
    private final transient l05<K> f26228y;

    /* JADX INFO: renamed from: com.google.common.collect.jbh$k */
    /* JADX INFO: compiled from: ImmutableSortedMap.java */
    static class C4418k implements Comparator<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Comparator f26229k;

        C4418k(Comparator comparator) {
            this.f26229k = comparator;
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public int compare(Map.Entry<K, V> entry, Map.Entry<K, V> entry2) {
            return this.f26229k.compare(entry.getKey(), entry2.getKey());
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.jbh$q */
    /* JADX INFO: compiled from: ImmutableSortedMap.java */
    private static class C4419q extends zkd.C4586n {
        private static final long serialVersionUID = 0;
        private final Comparator<Object> comparator;

        C4419q(jbh<?, ?> jbhVar) {
            super(jbhVar);
            this.comparator = jbhVar.comparator();
        }

        @Override // com.google.common.collect.zkd.C4586n
        Object readResolve() {
            return createMap(new zy(this.comparator));
        }
    }

    /* JADX INFO: compiled from: ImmutableSortedMap.java */
    class toq extends bz2<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.jbh$toq$k */
        /* JADX INFO: compiled from: ImmutableSortedMap.java */
        class C4420k extends se<Map.Entry<K, V>> {
            C4420k() {
            }

            @Override // com.google.common.collect.z4
            boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return jbh.this.size();
            }

            @Override // java.util.List
            public Map.Entry<K, V> get(int i2) {
                return new AbstractMap.SimpleImmutableEntry(jbh.this.f26228y.asList().get(i2), jbh.this.f26227s.get(i2));
            }
        }

        toq() {
        }

        @Override // com.google.common.collect.vep5
        se<Map.Entry<K, V>> createAsList() {
            return new C4420k();
        }

        @Override // com.google.common.collect.bz2
        zkd<K, V> map() {
            return jbh.this;
        }

        @Override // com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        public ab<Map.Entry<K, V>> iterator() {
            return asList().iterator();
        }
    }

    /* JADX INFO: compiled from: ImmutableSortedMap.java */
    public static class zy<K, V> extends zkd.toq<K, V> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final Comparator<? super K> f68220f7l8;

        /* JADX INFO: renamed from: g */
        private transient Object[] f26230g;

        /* JADX INFO: renamed from: n */
        private transient Object[] f26231n;

        public zy(Comparator<? super K> comparator) {
            this(comparator, 4);
        }

        private void toq(int i2) {
            Object[] objArr = this.f26231n;
            if (i2 > objArr.length) {
                int iM16103g = z4.toq.m16103g(objArr.length, i2);
                this.f26231n = Arrays.copyOf(this.f26231n, iM16103g);
                this.f26230g = Arrays.copyOf(this.f26230g, iM16103g);
            }
        }

        @Override // com.google.common.collect.zkd.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public zy<K, V> mo15592q(K k2, V v2) {
            toq(this.f68241zy + 1);
            C4524t.m15983k(k2, v2);
            Object[] objArr = this.f26231n;
            int i2 = this.f68241zy;
            objArr[i2] = k2;
            this.f26230g[i2] = v2;
            this.f68241zy = i2 + 1;
            return this;
        }

        @Override // com.google.common.collect.zkd.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
        public zy<K, V> f7l8(Map<? extends K, ? extends V> map) {
            super.f7l8(map);
            return this;
        }

        @Override // com.google.common.collect.zkd.toq
        @CanIgnoreReturnValue
        @InterfaceC7731k
        @Deprecated
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public zy<K, V> zy(Comparator<? super V> comparator) {
            throw new UnsupportedOperationException("Not available on ImmutableSortedMap.Builder");
        }

        @Override // com.google.common.collect.zkd.toq
        @CanIgnoreReturnValue
        @InterfaceC7731k
        /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
        public zy<K, V> mo15588g(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo15588g(iterable);
            return this;
        }

        @Override // com.google.common.collect.zkd.toq
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public jbh<K, V> mo15589k() {
            int i2 = this.f68241zy;
            if (i2 == 0) {
                return jbh.emptyMap(this.f68220f7l8);
            }
            if (i2 == 1) {
                return jbh.m15764g(this.f68220f7l8, this.f26231n[0], this.f26230g[0]);
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f26231n, i2);
            Arrays.sort(objArrCopyOf, this.f68220f7l8);
            Object[] objArr = new Object[this.f68241zy];
            for (int i3 = 0; i3 < this.f68241zy; i3++) {
                if (i3 > 0) {
                    int i4 = i3 - 1;
                    if (this.f68220f7l8.compare(objArrCopyOf[i4], objArrCopyOf[i3]) == 0) {
                        throw new IllegalArgumentException("keys required to be distinct but compared as equal: " + objArrCopyOf[i4] + " and " + objArrCopyOf[i3]);
                    }
                }
                objArr[Arrays.binarySearch(objArrCopyOf, this.f26231n[i3], this.f68220f7l8)] = this.f26230g[i3];
            }
            return new jbh<>(new l05(se.asImmutableList(objArrCopyOf), this.f68220f7l8), se.asImmutableList(objArr));
        }

        @Override // com.google.common.collect.zkd.toq
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public zy<K, V> mo15590n(Map.Entry<? extends K, ? extends V> entry) {
            super.mo15590n(entry);
            return this;
        }

        private zy(Comparator<? super K> comparator, int i2) {
            this.f68220f7l8 = (Comparator) com.google.common.base.jk.a9(comparator);
            this.f26231n = new Object[i2];
            this.f26230g = new Object[i2];
        }
    }

    jbh(l05<K> l05Var, se<V> seVar) {
        this(l05Var, seVar, null);
    }

    public static <K, V> jbh<K, V> copyOf(Map<? extends K, ? extends V> map) {
        return m15765k(map, (kx3) f26224h);
    }

    public static <K, V> jbh<K, V> copyOfSorted(SortedMap<K, ? extends V> sortedMap) {
        Comparator<? super K> comparator = sortedMap.comparator();
        if (comparator == null) {
            comparator = f26224h;
        }
        if (sortedMap instanceof jbh) {
            jbh<K, V> jbhVar = (jbh) sortedMap;
            if (!jbhVar.isPartialView()) {
                return jbhVar;
            }
        }
        return toq(comparator, true, sortedMap.entrySet());
    }

    static <K, V> jbh<K, V> emptyMap(Comparator<? super K> comparator) {
        return kx3.natural().equals(comparator) ? of() : new jbh<>(ixz.emptySet(comparator), se.of());
    }

    private static <K extends Comparable<? super K>, V> jbh<K, V> f7l8(Map.Entry<K, V>... entryArr) {
        return zy(kx3.natural(), false, entryArr, entryArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static <K, V> jbh<K, V> m15764g(Comparator<? super K> comparator, K k2, V v2) {
        return new jbh<>(new l05(se.of(k2), (Comparator) com.google.common.base.jk.a9(comparator)), se.of(v2));
    }

    /* JADX INFO: renamed from: k */
    private static <K, V> jbh<K, V> m15765k(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        boolean zEquals;
        boolean z2 = false;
        if (map instanceof SortedMap) {
            Comparator<? super K> comparator2 = ((SortedMap) map).comparator();
            if (comparator2 != null) {
                zEquals = comparator.equals(comparator2);
            } else if (comparator == f26224h) {
                zEquals = true;
            }
            z2 = zEquals;
        }
        if (z2 && (map instanceof jbh)) {
            jbh<K, V> jbhVar = (jbh) map;
            if (!jbhVar.isPartialView()) {
                return jbhVar;
            }
        }
        return toq(comparator, z2, map.entrySet());
    }

    public static <K extends Comparable<?>, V> zy<K, V> naturalOrder() {
        return new zy<>(kx3.natural());
    }

    public static <K, V> jbh<K, V> of() {
        return (jbh<K, V>) f26225i;
    }

    public static <K, V> zy<K, V> orderedBy(Comparator<K> comparator) {
        return new zy<>(comparator);
    }

    /* JADX INFO: renamed from: q */
    private jbh<K, V> m15766q(int i2, int i3) {
        return (i2 == 0 && i3 == size()) ? this : i2 == i3 ? emptyMap(comparator()) : new jbh<>(this.f26228y.getSubSet(i2, i3), this.f26227s.subList(i2, i3));
    }

    public static <K extends Comparable<?>, V> zy<K, V> reverseOrder() {
        return new zy<>(kx3.natural().reverse());
    }

    private static <K, V> jbh<K, V> toq(Comparator<? super K> comparator, boolean z2, Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        Map.Entry[] entryArr = (Map.Entry[]) nsb.m15906l(iterable, zkd.EMPTY_ENTRY_ARRAY);
        return zy(comparator, z2, entryArr, entryArr.length);
    }

    private static <K, V> jbh<K, V> zy(Comparator<? super K> comparator, boolean z2, Map.Entry<K, V>[] entryArr, int i2) {
        if (i2 == 0) {
            return emptyMap(comparator);
        }
        if (i2 == 1) {
            return m15764g(comparator, entryArr[0].getKey(), entryArr[0].getValue());
        }
        Object[] objArr = new Object[i2];
        Object[] objArr2 = new Object[i2];
        if (z2) {
            for (int i3 = 0; i3 < i2; i3++) {
                K key = entryArr[i3].getKey();
                V value = entryArr[i3].getValue();
                C4524t.m15983k(key, value);
                objArr[i3] = key;
                objArr2[i3] = value;
            }
        } else {
            Arrays.sort(entryArr, 0, i2, new C4418k(comparator));
            Object key2 = entryArr[0].getKey();
            objArr[0] = key2;
            V value2 = entryArr[0].getValue();
            objArr2[0] = value2;
            C4524t.m15983k(objArr[0], value2);
            int i4 = 1;
            while (i4 < i2) {
                Object key3 = entryArr[i4].getKey();
                V value3 = entryArr[i4].getValue();
                C4524t.m15983k(key3, value3);
                objArr[i4] = key3;
                objArr2[i4] = value3;
                zkd.checkNoConflict(comparator.compare(key2, key3) != 0, InterfaceC1925p.qn, entryArr[i4 - 1], entryArr[i4]);
                i4++;
                key2 = key3;
            }
        }
        return new jbh<>(new l05(se.asImmutableList(objArr), comparator), se.asImmutableList(objArr2));
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(K k2) {
        return tailMap((Object) k2, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(K k2) {
        return (K) vy.hyr(ceilingEntry(k2));
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return keySet().comparator();
    }

    @Override // com.google.common.collect.zkd
    vep5<Map.Entry<K, V>> createEntrySet() {
        return isEmpty() ? vep5.of() : new toq();
    }

    @Override // com.google.common.collect.zkd
    vep5<K> createKeySet() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.zkd
    z4<V> createValues() {
        throw new AssertionError("should never be called");
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(0);
    }

    @Override // java.util.SortedMap
    public K firstKey() {
        return keySet().first();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(K k2) {
        return headMap((Object) k2, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(K k2) {
        return (K) vy.hyr(floorEntry(k2));
    }

    @Override // com.google.common.collect.zkd, java.util.Map
    public V get(@NullableDecl Object obj) {
        int iIndexOf = this.f26228y.indexOf(obj);
        if (iIndexOf == -1) {
            return null;
        }
        return this.f26227s.get(iIndexOf);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(K k2) {
        return tailMap((Object) k2, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K higherKey(K k2) {
        return (K) vy.hyr(higherEntry(k2));
    }

    @Override // com.google.common.collect.zkd
    boolean isPartialView() {
        return this.f26228y.isPartialView() || this.f26227s.isPartialView();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return entrySet().asList().get(size() - 1);
    }

    @Override // java.util.SortedMap
    public K lastKey() {
        return keySet().last();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(K k2) {
        return headMap((Object) k2, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(K k2) {
        return (K) vy.hyr(lowerEntry(k2));
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @Deprecated
    public final Map.Entry<K, V> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableMap
    @CanIgnoreReturnValue
    @Deprecated
    public final Map.Entry<K, V> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public int size() {
        return this.f26227s.size();
    }

    @Override // com.google.common.collect.zkd
    Object writeReplace() {
        return new C4419q(this);
    }

    jbh(l05<K> l05Var, se<V> seVar, jbh<K, V> jbhVar) {
        this.f26228y = l05Var;
        this.f26227s = seVar;
        this.f26226p = jbhVar;
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;)Lcom/google/common/collect/jbh<TK;TV;>; */
    public static jbh of(Comparable comparable, Object obj) {
        return m15764g(kx3.natural(), comparable, obj);
    }

    @Override // java.util.NavigableMap
    public ixz<K> descendingKeySet() {
        return this.f26228y.descendingSet();
    }

    @Override // java.util.NavigableMap
    public jbh<K, V> descendingMap() {
        jbh<K, V> jbhVar = this.f26226p;
        return jbhVar == null ? isEmpty() ? emptyMap(kx3.from(comparator()).reverse()) : new jbh<>((l05) this.f26228y.descendingSet(), this.f26227s.reverse(), this) : jbhVar;
    }

    @Override // com.google.common.collect.zkd, java.util.Map, java.util.SortedMap
    public vep5<Map.Entry<K, V>> entrySet() {
        return super.entrySet();
    }

    @Override // java.util.NavigableMap
    public ixz<K> navigableKeySet() {
        return this.f26228y;
    }

    @Override // com.google.common.collect.zkd, java.util.Map
    public z4<V> values() {
        return this.f26227s;
    }

    public static <K, V> jbh<K, V> copyOf(Map<? extends K, ? extends V> map, Comparator<? super K> comparator) {
        return m15765k(map, (Comparator) com.google.common.base.jk.a9(comparator));
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;)Lcom/google/common/collect/jbh<TK;TV;>; */
    public static jbh of(Comparable comparable, Object obj, Comparable comparable2, Object obj2) {
        return f7l8(zkd.entryOf(comparable, obj), zkd.entryOf(comparable2, obj2));
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public jbh<K, V> headMap(K k2) {
        return headMap((Object) k2, false);
    }

    @Override // com.google.common.collect.zkd, java.util.Map, java.util.SortedMap
    public ixz<K> keySet() {
        return this.f26228y;
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public jbh<K, V> subMap(K k2, K k3) {
        return subMap((Object) k2, true, (Object) k3, false);
    }

    @Override // java.util.NavigableMap, java.util.SortedMap
    public jbh<K, V> tailMap(K k2) {
        return tailMap((Object) k2, true);
    }

    @InterfaceC7731k
    public static <K, V> jbh<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return copyOf(iterable, (kx3) f26224h);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/jbh<TK;TV;>; */
    public static jbh of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3) {
        return f7l8(zkd.entryOf(comparable, obj), zkd.entryOf(comparable2, obj2), zkd.entryOf(comparable3, obj3));
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    public jbh<K, V> headMap(K k2, boolean z2) {
        return m15766q(0, this.f26228y.headIndex((K) com.google.common.base.jk.a9(k2), z2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableMap
    public jbh<K, V> subMap(K k2, boolean z2, K k3, boolean z3) {
        com.google.common.base.jk.a9(k2);
        com.google.common.base.jk.a9(k3);
        com.google.common.base.jk.m15391z(comparator().compare(k2, k3) <= 0, "expected fromKey <= toKey but %s > %s", k2, k3);
        return headMap((Object) k3, z3).tailMap((Object) k2, z2);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // java.util.NavigableMap
    public jbh<K, V> tailMap(K k2, boolean z2) {
        return m15766q(this.f26228y.tailIndex((K) com.google.common.base.jk.a9(k2), z2), size());
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/jbh<TK;TV;>; */
    public static jbh of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4) {
        return f7l8(zkd.entryOf(comparable, obj), zkd.entryOf(comparable2, obj2), zkd.entryOf(comparable3, obj3), zkd.entryOf(comparable4, obj4));
    }

    @InterfaceC7731k
    public static <K, V> jbh<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable, Comparator<? super K> comparator) {
        return toq((Comparator) com.google.common.base.jk.a9(comparator), false, iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <K::Ljava/lang/Comparable<-TK;>;V:Ljava/lang/Object;>(TK;TV;TK;TV;TK;TV;TK;TV;TK;TV;)Lcom/google/common/collect/jbh<TK;TV;>; */
    public static jbh of(Comparable comparable, Object obj, Comparable comparable2, Object obj2, Comparable comparable3, Object obj3, Comparable comparable4, Object obj4, Comparable comparable5, Object obj5) {
        return f7l8(zkd.entryOf(comparable, obj), zkd.entryOf(comparable2, obj2), zkd.entryOf(comparable3, obj3), zkd.entryOf(comparable4, obj4), zkd.entryOf(comparable5, obj5));
    }
}
