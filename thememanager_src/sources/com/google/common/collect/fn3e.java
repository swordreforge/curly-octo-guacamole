package com.google.common.collect;

import com.google.common.base.C4280z;
import com.google.common.collect.hyow;
import com.google.common.collect.qh4d;
import com.google.common.collect.vy;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ArrayTable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
@InterfaceC7731k
public final class fn3e<R, C, V> extends cdj<R, C, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final V[][] array;
    private final zkd<C, Integer> columnKeyToIndex;
    private final se<C> columnList;

    /* JADX INFO: renamed from: g */
    @MonotonicNonNullDecl
    private transient fn3e<R, C, V>.C4374y f26117g;

    /* JADX INFO: renamed from: n */
    @MonotonicNonNullDecl
    private transient fn3e<R, C, V>.C4370g f26118n;
    private final zkd<R, Integer> rowKeyToIndex;
    private final se<R> rowList;

    /* JADX INFO: compiled from: ArrayTable.java */
    private class f7l8 extends AbstractC4373q<C, V> {

        /* JADX INFO: renamed from: q */
        final int f26120q;

        f7l8(int i2) {
            super(fn3e.this.columnKeyToIndex, null);
            this.f26120q = i2;
        }

        @Override // com.google.common.collect.fn3e.AbstractC4373q
        V f7l8(int i2, V v2) {
            return (V) fn3e.this.set(this.f26120q, i2, v2);
        }

        @Override // com.google.common.collect.fn3e.AbstractC4373q
        /* JADX INFO: renamed from: g */
        V mo15680g(int i2) {
            return (V) fn3e.this.at(this.f26120q, i2);
        }

        @Override // com.google.common.collect.fn3e.AbstractC4373q
        /* JADX INFO: renamed from: q */
        String mo15681q() {
            return "Column";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.fn3e$g */
    /* JADX INFO: compiled from: ArrayTable.java */
    private class C4370g extends AbstractC4373q<C, Map<R, V>> {
        /* synthetic */ C4370g(fn3e fn3eVar, C4371k c4371k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.fn3e.AbstractC4373q
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Map<R, V> f7l8(int i2, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.fn3e.AbstractC4373q, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Map<R, V> put(C c2, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.fn3e.AbstractC4373q
        /* JADX INFO: renamed from: q */
        String mo15681q() {
            return "Column";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.fn3e.AbstractC4373q
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Map<R, V> mo15680g(int i2) {
            return new C4372n(i2);
        }

        private C4370g() {
            super(fn3e.this.columnKeyToIndex, null);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.fn3e$k */
    /* JADX INFO: compiled from: ArrayTable.java */
    class C4371k extends com.google.common.collect.toq<qh4d.InterfaceC4517k<R, C, V>> {
        C4371k(int i2) {
            super(i2);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.toq
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public qh4d.InterfaceC4517k<R, C, V> mo15538k(int i2) {
            return fn3e.this.getCell(i2);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.fn3e$n */
    /* JADX INFO: compiled from: ArrayTable.java */
    private class C4372n extends AbstractC4373q<R, V> {

        /* JADX INFO: renamed from: q */
        final int f26124q;

        C4372n(int i2) {
            super(fn3e.this.rowKeyToIndex, null);
            this.f26124q = i2;
        }

        @Override // com.google.common.collect.fn3e.AbstractC4373q
        V f7l8(int i2, V v2) {
            return (V) fn3e.this.set(i2, this.f26124q, v2);
        }

        @Override // com.google.common.collect.fn3e.AbstractC4373q
        /* JADX INFO: renamed from: g */
        V mo15680g(int i2) {
            return (V) fn3e.this.at(i2, this.f26124q);
        }

        @Override // com.google.common.collect.fn3e.AbstractC4373q
        /* JADX INFO: renamed from: q */
        String mo15681q() {
            return "Row";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.fn3e$q */
    /* JADX INFO: compiled from: ArrayTable.java */
    private static abstract class AbstractC4373q<K, V> extends vy.wvg<K, V> {

        /* JADX INFO: renamed from: k */
        private final zkd<K, Integer> f26125k;

        /* JADX INFO: renamed from: com.google.common.collect.fn3e$q$k */
        /* JADX INFO: compiled from: ArrayTable.java */
        class k extends com.google.common.collect.f7l8<K, V> {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ int f26126k;

            k(int i2) {
                this.f26126k = i2;
            }

            @Override // com.google.common.collect.f7l8, java.util.Map.Entry
            public K getKey() {
                return (K) AbstractC4373q.this.zy(this.f26126k);
            }

            @Override // com.google.common.collect.f7l8, java.util.Map.Entry
            public V getValue() {
                return (V) AbstractC4373q.this.mo15680g(this.f26126k);
            }

            @Override // com.google.common.collect.f7l8, java.util.Map.Entry
            public V setValue(V v2) {
                return (V) AbstractC4373q.this.f7l8(this.f26126k, v2);
            }
        }

        /* JADX INFO: renamed from: com.google.common.collect.fn3e$q$toq */
        /* JADX INFO: compiled from: ArrayTable.java */
        class toq extends com.google.common.collect.toq<Map.Entry<K, V>> {
            toq(int i2) {
                super(i2);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.toq
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> mo15538k(int i2) {
                return AbstractC4373q.this.toq(i2);
            }
        }

        /* synthetic */ AbstractC4373q(zkd zkdVar, C4371k c4371k) {
            this(zkdVar);
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(@NullableDecl Object obj) {
            return this.f26125k.containsKey(obj);
        }

        @NullableDecl
        abstract V f7l8(int i2, V v2);

        @NullableDecl
        /* JADX INFO: renamed from: g */
        abstract V mo15680g(int i2);

        @Override // java.util.AbstractMap, java.util.Map
        public V get(@NullableDecl Object obj) {
            Integer num = this.f26125k.get(obj);
            if (num == null) {
                return null;
            }
            return mo15680g(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f26125k.isEmpty();
        }

        @Override // com.google.common.collect.vy.wvg
        /* JADX INFO: renamed from: k */
        Iterator<Map.Entry<K, V>> mo15684k() {
            return new toq(size());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f26125k.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k2, V v2) {
            Integer num = this.f26125k.get(k2);
            if (num != null) {
                return f7l8(num.intValue(), v2);
            }
            throw new IllegalArgumentException(mo15681q() + " " + k2 + " not in " + this.f26125k.keySet());
        }

        /* JADX INFO: renamed from: q */
        abstract String mo15681q();

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.vy.wvg, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f26125k.size();
        }

        Map.Entry<K, V> toq(int i2) {
            com.google.common.base.jk.mcp(i2, size());
            return new k(i2);
        }

        K zy(int i2) {
            return this.f26125k.keySet().asList().get(i2);
        }

        private AbstractC4373q(zkd<K, Integer> zkdVar) {
            this.f26125k = zkdVar;
        }
    }

    /* JADX INFO: compiled from: ArrayTable.java */
    class toq extends hyow.toq<R, C, V> {

        /* JADX INFO: renamed from: k */
        final int f26130k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f26131n;

        /* JADX INFO: renamed from: q */
        final int f26132q;

        toq(int i2) {
            this.f26131n = i2;
            this.f26130k = i2 / fn3e.this.columnList.size();
            this.f26132q = i2 % fn3e.this.columnList.size();
        }

        @Override // com.google.common.collect.qh4d.InterfaceC4517k
        public C getColumnKey() {
            return (C) fn3e.this.columnList.get(this.f26132q);
        }

        @Override // com.google.common.collect.qh4d.InterfaceC4517k
        public R getRowKey() {
            return (R) fn3e.this.rowList.get(this.f26130k);
        }

        @Override // com.google.common.collect.qh4d.InterfaceC4517k
        public V getValue() {
            return (V) fn3e.this.at(this.f26130k, this.f26132q);
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.fn3e$y */
    /* JADX INFO: compiled from: ArrayTable.java */
    private class C4374y extends AbstractC4373q<R, Map<C, V>> {
        /* synthetic */ C4374y(fn3e fn3eVar, C4371k c4371k) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.fn3e.AbstractC4373q
        /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
        public Map<C, V> f7l8(int i2, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.fn3e.AbstractC4373q, java.util.AbstractMap, java.util.Map
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public Map<C, V> put(R r2, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.fn3e.AbstractC4373q
        /* JADX INFO: renamed from: q */
        String mo15681q() {
            return "Row";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.fn3e.AbstractC4373q
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public Map<C, V> mo15680g(int i2) {
            return new f7l8(i2);
        }

        private C4374y() {
            super(fn3e.this.rowKeyToIndex, null);
        }
    }

    /* JADX INFO: compiled from: ArrayTable.java */
    class zy extends com.google.common.collect.toq<V> {
        zy(int i2) {
            super(i2);
        }

        @Override // com.google.common.collect.toq
        /* JADX INFO: renamed from: k */
        protected V mo15538k(int i2) {
            return (V) fn3e.this.getValue(i2);
        }
    }

    private fn3e(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        se<R> seVarCopyOf = se.copyOf(iterable);
        this.rowList = seVarCopyOf;
        se<C> seVarCopyOf2 = se.copyOf(iterable2);
        this.columnList = seVarCopyOf2;
        com.google.common.base.jk.m15383q(seVarCopyOf.isEmpty() == seVarCopyOf2.isEmpty());
        this.rowKeyToIndex = vy.ncyb(seVarCopyOf);
        this.columnKeyToIndex = vy.ncyb(seVarCopyOf2);
        this.array = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, seVarCopyOf.size(), seVarCopyOf2.size()));
        eraseAll();
    }

    public static <R, C, V> fn3e<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new fn3e<>(iterable, iterable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public qh4d.InterfaceC4517k<R, C, V> getCell(int i2) {
        return new toq(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V getValue(int i2) {
        return at(i2 / this.columnList.size(), i2 % this.columnList.size());
    }

    public V at(int i2, int i3) {
        com.google.common.base.jk.mcp(i2, this.rowList.size());
        com.google.common.base.jk.mcp(i3, this.columnList.size());
        return this.array[i2][i3];
    }

    @Override // com.google.common.collect.cdj
    Iterator<qh4d.InterfaceC4517k<R, C, V>> cellIterator() {
        return new C4371k(size());
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public Set<qh4d.InterfaceC4517k<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.qh4d
    public Map<R, V> column(C c2) {
        com.google.common.base.jk.a9(c2);
        Integer num = this.columnKeyToIndex.get(c2);
        return num == null ? zkd.of() : new C4372n(num.intValue());
    }

    public se<C> columnKeyList() {
        return this.columnList;
    }

    @Override // com.google.common.collect.qh4d
    public Map<C, Map<R, V>> columnMap() {
        fn3e<R, C, V>.C4370g c4370g = this.f26118n;
        if (c4370g != null) {
            return c4370g;
        }
        fn3e<R, C, V>.C4370g c4370g2 = new C4370g(this, null);
        this.f26118n = c4370g2;
        return c4370g2;
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean contains(@NullableDecl Object obj, @NullableDecl Object obj2) {
        return containsRow(obj) && containsColumn(obj2);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean containsColumn(@NullableDecl Object obj) {
        return this.columnKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean containsRow(@NullableDecl Object obj) {
        return this.rowKeyToIndex.containsKey(obj);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean containsValue(@NullableDecl Object obj) {
        for (V[] vArr : this.array) {
            for (V v2 : vArr) {
                if (C4280z.m15455k(obj, v2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ boolean equals(@NullableDecl Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public V erase(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), null);
    }

    public void eraseAll() {
        for (V[] vArr : this.array) {
            Arrays.fill(vArr, (Object) null);
        }
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public V get(@NullableDecl Object obj, @NullableDecl Object obj2) {
        Integer num = this.rowKeyToIndex.get(obj);
        Integer num2 = this.columnKeyToIndex.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return at(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public boolean isEmpty() {
        return this.rowList.isEmpty() || this.columnList.isEmpty();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    public V put(R r2, C c2, @NullableDecl V v2) {
        com.google.common.base.jk.a9(r2);
        com.google.common.base.jk.a9(c2);
        Integer num = this.rowKeyToIndex.get(r2);
        com.google.common.base.jk.m15391z(num != null, "Row %s not in %s", r2, this.rowList);
        Integer num2 = this.columnKeyToIndex.get(c2);
        com.google.common.base.jk.m15391z(num2 != null, "Column %s not in %s", c2, this.columnList);
        return set(num.intValue(), num2.intValue(), v2);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public void putAll(qh4d<? extends R, ? extends C, ? extends V> qh4dVar) {
        super.putAll(qh4dVar);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    @CanIgnoreReturnValue
    @Deprecated
    public V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.qh4d
    public Map<C, V> row(R r2) {
        com.google.common.base.jk.a9(r2);
        Integer num = this.rowKeyToIndex.get(r2);
        return num == null ? zkd.of() : new f7l8(num.intValue());
    }

    public se<R> rowKeyList() {
        return this.rowList;
    }

    @Override // com.google.common.collect.qh4d
    public Map<R, Map<C, V>> rowMap() {
        fn3e<R, C, V>.C4374y c4374y = this.f26117g;
        if (c4374y != null) {
            return c4374y;
        }
        fn3e<R, C, V>.C4374y c4374y2 = new C4374y(this, null);
        this.f26117g = c4374y2;
        return c4374y2;
    }

    @CanIgnoreReturnValue
    public V set(int i2, int i3, @NullableDecl V v2) {
        com.google.common.base.jk.mcp(i2, this.rowList.size());
        com.google.common.base.jk.mcp(i3, this.columnList.size());
        V[] vArr = this.array[i2];
        V v3 = vArr[i3];
        vArr[i3] = v2;
        return v3;
    }

    @Override // com.google.common.collect.qh4d
    public int size() {
        return this.rowList.size() * this.columnList.size();
    }

    @wlev.zy
    public V[][] toArray(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.rowList.size(), this.columnList.size()));
        for (int i2 = 0; i2 < this.rowList.size(); i2++) {
            V[] vArr2 = this.array[i2];
            System.arraycopy(vArr2, 0, vArr[i2], 0, vArr2.length);
        }
        return vArr;
    }

    @Override // com.google.common.collect.cdj
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.cdj
    Iterator<V> valuesIterator() {
        return new zy(size());
    }

    public static <R, C, V> fn3e<R, C, V> create(qh4d<R, C, V> qh4dVar) {
        return qh4dVar instanceof fn3e ? new fn3e<>((fn3e) qh4dVar) : new fn3e<>(qh4dVar);
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public vep5<C> columnKeySet() {
        return this.columnKeyToIndex.keySet();
    }

    @Override // com.google.common.collect.cdj, com.google.common.collect.qh4d
    public vep5<R> rowKeySet() {
        return this.rowKeyToIndex.keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private fn3e(qh4d<R, C, V> qh4dVar) {
        this(qh4dVar.rowKeySet(), qh4dVar.columnKeySet());
        putAll(qh4dVar);
    }

    private fn3e(fn3e<R, C, V> fn3eVar) {
        se<R> seVar = fn3eVar.rowList;
        this.rowList = seVar;
        se<C> seVar2 = fn3eVar.columnList;
        this.columnList = seVar2;
        this.rowKeyToIndex = fn3eVar.rowKeyToIndex;
        this.columnKeyToIndex = fn3eVar.columnKeyToIndex;
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) Object.class, seVar.size(), seVar2.size()));
        this.array = vArr;
        for (int i2 = 0; i2 < this.rowList.size(); i2++) {
            V[] vArr2 = fn3eVar.array[i2];
            System.arraycopy(vArr2, 0, vArr[i2], 0, vArr2.length);
        }
    }
}
