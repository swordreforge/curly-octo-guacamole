package com.google.common.collect;

import com.google.common.collect.o05;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: DescendingImmutableSortedMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
final class n5r1<E> extends uc<E> {

    /* JADX INFO: renamed from: g */
    private final transient uc<E> f26470g;

    n5r1(uc<E> ucVar) {
        this.f26470g = ucVar;
    }

    @Override // com.google.common.collect.o05
    public int count(@NullableDecl Object obj) {
        return this.f26470g.count(obj);
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> firstEntry() {
        return this.f26470g.lastEntry();
    }

    @Override // com.google.common.collect.b3e
    o05.InterfaceC4482k<E> getEntry(int i2) {
        return this.f26470g.entrySet().asList().reverse().get(i2);
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return this.f26470g.isPartialView();
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> lastEntry() {
        return this.f26470g.firstEntry();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public int size() {
        return this.f26470g.size();
    }

    @Override // com.google.common.collect.uc, com.google.common.collect.gb
    public uc<E> descendingMultiset() {
        return this.f26470g;
    }

    @Override // com.google.common.collect.uc, com.google.common.collect.gb
    public uc<E> headMultiset(E e2, fu4 fu4Var) {
        return this.f26470g.tailMultiset((Object) e2, fu4Var).descendingMultiset();
    }

    @Override // com.google.common.collect.uc, com.google.common.collect.gb
    public uc<E> tailMultiset(E e2, fu4 fu4Var) {
        return this.f26470g.headMultiset((Object) e2, fu4Var).descendingMultiset();
    }

    @Override // com.google.common.collect.uc, com.google.common.collect.b3e, com.google.common.collect.o05
    public ixz<E> elementSet() {
        return this.f26470g.elementSet().descendingSet();
    }
}
