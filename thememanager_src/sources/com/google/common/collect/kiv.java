package com.google.common.collect;

/* JADX INFO: compiled from: RegularImmutableAsList.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
class kiv<E> extends sok<E> {
    private final z4<E> delegate;
    private final se<? extends E> delegateList;

    kiv(z4<E> z4Var, se<? extends E> seVar) {
        this.delegate = z4Var;
        this.delegateList = seVar;
    }

    @Override // com.google.common.collect.se, com.google.common.collect.z4
    @wlev.zy
    int copyIntoArray(Object[] objArr, int i2) {
        return this.delegateList.copyIntoArray(objArr, i2);
    }

    @Override // com.google.common.collect.sok
    z4<E> delegateCollection() {
        return this.delegate;
    }

    se<? extends E> delegateList() {
        return this.delegateList;
    }

    @Override // java.util.List
    public E get(int i2) {
        return this.delegateList.get(i2);
    }

    @Override // com.google.common.collect.z4
    Object[] internalArray() {
        return this.delegateList.internalArray();
    }

    @Override // com.google.common.collect.z4
    int internalArrayEnd() {
        return this.delegateList.internalArrayEnd();
    }

    @Override // com.google.common.collect.z4
    int internalArrayStart() {
        return this.delegateList.internalArrayStart();
    }

    @Override // com.google.common.collect.se, java.util.List
    public c25<E> listIterator(int i2) {
        return this.delegateList.listIterator(i2);
    }

    kiv(z4<E> z4Var, Object[] objArr) {
        this(z4Var, se.asImmutableList(objArr));
    }

    kiv(z4<E> z4Var, Object[] objArr, int i2) {
        this(z4Var, se.asImmutableList(objArr, i2));
    }
}
