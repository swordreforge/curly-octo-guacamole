package com.google.common.collect;

import com.google.errorprone.annotations.concurrent.LazyInit;
import java.io.Serializable;
import java.lang.Enum;
import java.util.Collection;
import java.util.EnumSet;

/* JADX INFO: compiled from: ImmutableEnumSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
final class bwp<E extends Enum<E>> extends vep5<E> {

    /* JADX INFO: renamed from: s */
    @LazyInit
    private transient int f26010s;

    /* JADX INFO: renamed from: y */
    private final transient EnumSet<E> f26011y;

    /* JADX INFO: compiled from: ImmutableEnumSet.java */
    private static class toq<E extends Enum<E>> implements Serializable {
        private static final long serialVersionUID = 0;
        final EnumSet<E> delegate;

        toq(EnumSet<E> enumSet) {
            this.delegate = enumSet;
        }

        Object readResolve() {
            return new bwp(this.delegate.clone());
        }
    }

    static vep5 asImmutable(EnumSet enumSet) {
        int size = enumSet.size();
        return size != 0 ? size != 1 ? new bwp(enumSet) : vep5.of(nsb.o1t(enumSet)) : vep5.of();
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(Object obj) {
        return this.f26011y.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof bwp) {
            collection = ((bwp) collection).f26011y;
        }
        return this.f26011y.containsAll(collection);
    }

    @Override // com.google.common.collect.vep5, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bwp) {
            obj = ((bwp) obj).f26011y;
        }
        return this.f26011y.equals(obj);
    }

    @Override // com.google.common.collect.vep5, java.util.Collection, java.util.Set
    public int hashCode() {
        int i2 = this.f26010s;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.f26011y.hashCode();
        this.f26010s = iHashCode;
        return iHashCode;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f26011y.isEmpty();
    }

    @Override // com.google.common.collect.vep5
    boolean isHashCodeFast() {
        return true;
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f26011y.size();
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return this.f26011y.toString();
    }

    @Override // com.google.common.collect.vep5, com.google.common.collect.z4
    Object writeReplace() {
        return new toq(this.f26011y);
    }

    private bwp(EnumSet<E> enumSet) {
        this.f26011y = enumSet;
    }

    @Override // com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public ab<E> iterator() {
        return zwy.ek5k(this.f26011y.iterator());
    }
}
