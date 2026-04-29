package com.google.common.collect;

import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: HashMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
public class v0af<E> extends AbstractC4375g<E> {

    @wlev.zy
    private static final long serialVersionUID = 0;

    v0af(int i2) {
        super(i2);
    }

    public static <E> v0af<E> create() {
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
        this.backingMap = new ew<>(i2);
    }

    @Override // com.google.common.collect.AbstractC4519s, java.util.AbstractCollection, java.util.Collection
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public static <E> v0af<E> create(int i2) {
        return new v0af<>(i2);
    }

    public static <E> v0af<E> create(Iterable<? extends E> iterable) {
        v0af<E> v0afVarCreate = create(m58i.x2(iterable));
        nsb.m15905k(v0afVarCreate, iterable);
        return v0afVarCreate;
    }
}
