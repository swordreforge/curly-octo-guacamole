package com.google.common.collect;

import org.checkerframework.checker.nullness.compatqual.NullableDecl;
import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: RegularImmutableSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
final class yw<E> extends vep5<E> {
    static final yw<Object> EMPTY = new yw<>(new Object[0], 0, null, 0, 0);

    @InterfaceC7732q
    final transient Object[] elements;

    /* JADX INFO: renamed from: p */
    private final transient int f26745p;

    /* JADX INFO: renamed from: s */
    private final transient int f26746s;

    @InterfaceC7732q
    final transient Object[] table;

    /* JADX INFO: renamed from: y */
    private final transient int f26747y;

    yw(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.elements = objArr;
        this.table = objArr2;
        this.f26747y = i3;
        this.f26746s = i2;
        this.f26745p = i4;
    }

    @Override // com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.table;
        if (obj == null || objArr == null) {
            return false;
        }
        int iM15653q = etdu.m15653q(obj);
        while (true) {
            int i2 = iM15653q & this.f26747y;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iM15653q = i2 + 1;
        }
    }

    @Override // com.google.common.collect.z4
    int copyIntoArray(Object[] objArr, int i2) {
        System.arraycopy(this.elements, 0, objArr, i2, this.f26745p);
        return i2 + this.f26745p;
    }

    @Override // com.google.common.collect.vep5
    se<E> createAsList() {
        return se.asImmutableList(this.elements, this.f26745p);
    }

    @Override // com.google.common.collect.vep5, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f26746s;
    }

    @Override // com.google.common.collect.z4
    Object[] internalArray() {
        return this.elements;
    }

    @Override // com.google.common.collect.z4
    int internalArrayEnd() {
        return this.f26745p;
    }

    @Override // com.google.common.collect.z4
    int internalArrayStart() {
        return 0;
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
        return this.f26745p;
    }

    @Override // com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public ab<E> iterator() {
        return asList().iterator();
    }
}
