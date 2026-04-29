package com.google.common.collect;

import com.google.common.collect.el;
import com.google.common.collect.ixz;
import com.google.common.collect.ktq;
import com.google.common.collect.vep5;
import com.google.common.collect.zkd;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.concurrent.LazyInit;
import com.google.j2objc.annotations.RetainedWith;
import com.google.j2objc.annotations.Weak;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: ImmutableSetMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public class mbx<K, V> extends ktq<K, V> implements wt<K, V> {

    @wlev.zy
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: h */
    @MonotonicNonNullDecl
    private transient vep5<Map.Entry<K, V>> f26399h;

    /* JADX INFO: renamed from: p */
    @RetainedWith
    @LazyInit
    @MonotonicNonNullDecl
    private transient mbx<V, K> f26400p;

    /* JADX INFO: renamed from: s */
    private final transient vep5<V> f26401s;

    /* JADX INFO: renamed from: com.google.common.collect.mbx$k */
    /* JADX INFO: compiled from: ImmutableSetMultimap.java */
    public static final class C4461k<K, V> extends ktq.zy<K, V> {
        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: cdj, reason: merged with bridge method [inline-methods] */
        public C4461k<K, V> mo15719y(lw<? extends K, ? extends V> lwVar) {
            for (Map.Entry<? extends K, Collection<? extends V>> entry : lwVar.asMap().entrySet()) {
                mo15716p(entry.getKey(), entry.getValue());
            }
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public C4461k<K, V> f7l8(Map.Entry<? extends K, ? extends V> entry) {
            super.f7l8(entry);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public C4461k<K, V> ld6(K k2, V... vArr) {
            return mo15716p(k2, Arrays.asList(vArr));
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        @InterfaceC7731k
        /* JADX INFO: renamed from: ki, reason: merged with bridge method [inline-methods] */
        public C4461k<K, V> mo15718s(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
            super.mo15718s(iterable);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: kja0, reason: merged with bridge method [inline-methods] */
        public C4461k<K, V> mo15711g(K k2, V v2) {
            super.mo15711g(k2, v2);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
        public C4461k<K, V> mo15715n(Comparator<? super V> comparator) {
            super.mo15715n(comparator);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
        public C4461k<K, V> mo15717q(Comparator<? super K> comparator) {
            super.mo15717q(comparator);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        @CanIgnoreReturnValue
        /* JADX INFO: renamed from: t8r, reason: merged with bridge method [inline-methods] */
        public C4461k<K, V> mo15716p(K k2, Iterable<? extends V> iterable) {
            super.mo15716p(k2, iterable);
            return this;
        }

        @Override // com.google.common.collect.ktq.zy
        /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
        public mbx<K, V> mo15714k() {
            Collection collectionEntrySet = this.f26288k.entrySet();
            Comparator<? super K> comparator = this.f68222toq;
            if (comparator != null) {
                collectionEntrySet = kx3.from(comparator).onKeys().immutableSortedCopy(collectionEntrySet);
            }
            return mbx.fromMapEntries(collectionEntrySet, this.f68223zy);
        }

        @Override // com.google.common.collect.ktq.zy
        Collection<V> zy() {
            return m2t.f7l8();
        }
    }

    /* JADX INFO: compiled from: ImmutableSetMultimap.java */
    private static final class toq<K, V> extends vep5<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: y */
        @Weak
        private final transient mbx<K, V> f26402y;

        toq(mbx<K, V> mbxVar) {
            this.f26402y = mbxVar;
        }

        @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
        public boolean contains(@NullableDecl Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return this.f26402y.containsEntry(entry.getKey(), entry.getValue());
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return this.f26402y.size();
        }

        @Override // com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
        public ab<Map.Entry<K, V>> iterator() {
            return this.f26402y.entryIterator();
        }
    }

    /* JADX INFO: compiled from: ImmutableSetMultimap.java */
    @wlev.zy
    private static final class zy {

        /* JADX INFO: renamed from: k */
        static final el.toq<mbx> f26403k = el.m15645k(mbx.class, "emptySet");

        private zy() {
        }
    }

    mbx(zkd<K, vep5<V>> zkdVar, int i2, @NullableDecl Comparator<? super V> comparator) {
        super(zkdVar, i2);
        this.f26401s = zy(comparator);
    }

    public static <K, V> C4461k<K, V> builder() {
        return new C4461k<>();
    }

    public static <K, V> mbx<K, V> copyOf(lw<? extends K, ? extends V> lwVar) {
        return m15852k(lwVar, null);
    }

    static <K, V> mbx<K, V> fromMapEntries(Collection<? extends Map.Entry<? extends K, ? extends Collection<? extends V>>> collection, @NullableDecl Comparator<? super V> comparator) {
        if (collection.isEmpty()) {
            return of();
        }
        zkd.toq toqVar = new zkd.toq(collection.size());
        int size = 0;
        for (Map.Entry<? extends K, ? extends Collection<? extends V>> entry : collection) {
            K key = entry.getKey();
            vep5 vep5VarM15853n = m15853n(comparator, entry.getValue());
            if (!vep5VarM15853n.isEmpty()) {
                toqVar.mo15592q(key, vep5VarM15853n);
                size += vep5VarM15853n.size();
            }
        }
        return new mbx<>(toqVar.mo15589k(), size, comparator);
    }

    /* JADX INFO: renamed from: g */
    private static <V> vep5.C4532k<V> m15851g(@NullableDecl Comparator<? super V> comparator) {
        return comparator == null ? new vep5.C4532k<>() : new ixz.C4416k(comparator);
    }

    /* JADX INFO: renamed from: k */
    private static <K, V> mbx<K, V> m15852k(lw<? extends K, ? extends V> lwVar, Comparator<? super V> comparator) {
        com.google.common.base.jk.a9(lwVar);
        if (lwVar.isEmpty() && comparator == null) {
            return of();
        }
        if (lwVar instanceof mbx) {
            mbx<K, V> mbxVar = (mbx) lwVar;
            if (!mbxVar.isPartialView()) {
                return mbxVar;
            }
        }
        return fromMapEntries(lwVar.asMap().entrySet(), comparator);
    }

    /* JADX INFO: renamed from: n */
    private static <V> vep5<V> m15853n(@NullableDecl Comparator<? super V> comparator, Collection<? extends V> collection) {
        return comparator == null ? vep5.copyOf((Collection) collection) : ixz.copyOf((Comparator) comparator, (Collection) collection);
    }

    public static <K, V> mbx<K, V> of() {
        return vyq.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q */
    private mbx<V, K> m15854q() {
        C4461k c4461kBuilder = builder();
        ab it = entries().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c4461kBuilder.mo15711g(entry.getValue(), entry.getKey());
        }
        mbx<V, K> mbxVarMo15714k = c4461kBuilder.mo15714k();
        mbxVarMo15714k.f26400p = this;
        return mbxVarMo15714k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        int i2 = objectInputStream.readInt();
        if (i2 < 0) {
            throw new InvalidObjectException("Invalid key count " + i2);
        }
        zkd.toq toqVarBuilder = zkd.builder();
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            Object object = objectInputStream.readObject();
            int i5 = objectInputStream.readInt();
            if (i5 <= 0) {
                throw new InvalidObjectException("Invalid value count " + i5);
            }
            vep5.C4532k c4532kM15851g = m15851g(comparator);
            for (int i6 = 0; i6 < i5; i6++) {
                c4532kM15851g.f7l8(objectInputStream.readObject());
            }
            vep5 vep5VarMo15570n = c4532kM15851g.mo15570n();
            if (vep5VarMo15570n.size() != i5) {
                throw new InvalidObjectException("Duplicate key-value pairs exist for key " + object);
            }
            toqVarBuilder.mo15592q(object, vep5VarMo15570n);
            i3 += i5;
        }
        try {
            ktq.C4433n.f26283k.toq(this, toqVarBuilder.mo15589k());
            ktq.C4433n.f68221toq.m15651k(this, i3);
            zy.f26403k.toq(this, zy(comparator));
        } catch (IllegalArgumentException e2) {
            throw ((InvalidObjectException) new InvalidObjectException(e2.getMessage()).initCause(e2));
        }
    }

    @wlev.zy
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(valueComparator());
        el.m15647p(this, objectOutputStream);
    }

    private static <V> vep5<V> zy(@NullableDecl Comparator<? super V> comparator) {
        return comparator == null ? vep5.of() : ixz.emptySet(comparator);
    }

    @NullableDecl
    Comparator<? super V> valueComparator() {
        vep5<V> vep5Var = this.f26401s;
        if (vep5Var instanceof ixz) {
            return ((ixz) vep5Var).comparator();
        }
        return null;
    }

    @InterfaceC7731k
    public static <K, V> mbx<K, V> copyOf(Iterable<? extends Map.Entry<? extends K, ? extends V>> iterable) {
        return new C4461k().mo15718s(iterable).mo15714k();
    }

    public static <K, V> mbx<K, V> of(K k2, V v2) {
        C4461k c4461kBuilder = builder();
        c4461kBuilder.mo15711g(k2, v2);
        return c4461kBuilder.mo15714k();
    }

    @Override // com.google.common.collect.ktq
    public mbx<V, K> inverse() {
        mbx<V, K> mbxVar = this.f26400p;
        if (mbxVar != null) {
            return mbxVar;
        }
        mbx<V, K> mbxVarM15854q = m15854q();
        this.f26400p = mbxVarM15854q;
        return mbxVarM15854q;
    }

    @Override // com.google.common.collect.ktq, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    public vep5<Map.Entry<K, V>> entries() {
        vep5<Map.Entry<K, V>> vep5Var = this.f26399h;
        if (vep5Var != null) {
            return vep5Var;
        }
        toq toqVar = new toq(this);
        this.f26399h = toqVar;
        return toqVar;
    }

    @Override // com.google.common.collect.ktq, com.google.common.collect.lw
    public vep5<V> get(@NullableDecl K k2) {
        return (vep5) com.google.common.base.fu4.m15351k((vep5) this.map.get(k2), this.f26401s);
    }

    @Override // com.google.common.collect.ktq, com.google.common.collect.lw
    @CanIgnoreReturnValue
    @Deprecated
    public vep5<V> removeAll(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ktq, com.google.common.collect.AbstractC4579y, com.google.common.collect.lw
    @CanIgnoreReturnValue
    @Deprecated
    public vep5<V> replaceValues(K k2, Iterable<? extends V> iterable) {
        throw new UnsupportedOperationException();
    }

    public static <K, V> mbx<K, V> of(K k2, V v2, K k3, V v3) {
        C4461k c4461kBuilder = builder();
        c4461kBuilder.mo15711g(k2, v2);
        c4461kBuilder.mo15711g(k3, v3);
        return c4461kBuilder.mo15714k();
    }

    public static <K, V> mbx<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4) {
        C4461k c4461kBuilder = builder();
        c4461kBuilder.mo15711g(k2, v2);
        c4461kBuilder.mo15711g(k3, v3);
        c4461kBuilder.mo15711g(k4, v4);
        return c4461kBuilder.mo15714k();
    }

    public static <K, V> mbx<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        C4461k c4461kBuilder = builder();
        c4461kBuilder.mo15711g(k2, v2);
        c4461kBuilder.mo15711g(k3, v3);
        c4461kBuilder.mo15711g(k4, v4);
        c4461kBuilder.mo15711g(k5, v5);
        return c4461kBuilder.mo15714k();
    }

    public static <K, V> mbx<K, V> of(K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        C4461k c4461kBuilder = builder();
        c4461kBuilder.mo15711g(k2, v2);
        c4461kBuilder.mo15711g(k3, v3);
        c4461kBuilder.mo15711g(k4, v4);
        c4461kBuilder.mo15711g(k5, v5);
        c4461kBuilder.mo15711g(k6, v6);
        return c4461kBuilder.mo15714k();
    }
}
