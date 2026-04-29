package com.google.common.collect;

import wlev.InterfaceC7732q;

/* JADX INFO: compiled from: RegularImmutableList.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
class bih<E> extends se<E> {
    static final se<Object> EMPTY = new bih(new Object[0], 0);

    @InterfaceC7732q
    final transient Object[] array;

    /* JADX INFO: renamed from: n */
    private final transient int f26009n;

    bih(Object[] objArr, int i2) {
        this.array = objArr;
        this.f26009n = i2;
    }

    @Override // com.google.common.collect.se, com.google.common.collect.z4
    int copyIntoArray(Object[] objArr, int i2) {
        System.arraycopy(this.array, 0, objArr, i2, this.f26009n);
        return i2 + this.f26009n;
    }

    @Override // java.util.List
    public E get(int i2) {
        com.google.common.base.jk.mcp(i2, this.f26009n);
        return (E) this.array[i2];
    }

    @Override // com.google.common.collect.z4
    Object[] internalArray() {
        return this.array;
    }

    @Override // com.google.common.collect.z4
    int internalArrayEnd() {
        return this.f26009n;
    }

    @Override // com.google.common.collect.z4
    int internalArrayStart() {
        return 0;
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f26009n;
    }
}
