package com.google.common.collect;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: LinkedHashMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public final class lh<E> extends AbstractC4375g<E> {
    lh(int i2) {
        super(i2);
    }

    public static <E> lh<E> create() {
        return create(3);
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public /* bridge */ /* synthetic */ boolean contains(@NullableDecl Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractC4519s, com.google.common.collect.o05
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractC4375g
    void init(int i2) {
        this.backingMap = new ix(i2);
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public static <E> lh<E> create(int i2) {
        return new lh<>(i2);
    }

    public static <E> lh<E> create(Iterable<? extends E> iterable) {
        lh<E> lhVarCreate = create(m58i.x2(iterable));
        nsb.m15905k(lhVarCreate, iterable);
        return lhVarCreate;
    }
}
