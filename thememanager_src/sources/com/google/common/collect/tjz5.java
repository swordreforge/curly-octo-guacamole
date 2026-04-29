package com.google.common.collect;

import com.google.common.collect.m58i;
import com.google.common.collect.o05;
import java.util.Comparator;
import java.util.NavigableSet;
import org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl;

/* JADX INFO: compiled from: UnmodifiableSortedMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
final class tjz5<E> extends m58i.qrj<E> implements gb<E> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: k */
    @MonotonicNonNullDecl
    private transient tjz5<E> f26591k;

    tjz5(gb<E> gbVar) {
        super(gbVar);
    }

    @Override // com.google.common.collect.gb, com.google.common.collect.f1bi
    public Comparator<? super E> comparator() {
        return delegate().comparator();
    }

    @Override // com.google.common.collect.gb
    public gb<E> descendingMultiset() {
        tjz5<E> tjz5Var = this.f26591k;
        if (tjz5Var != null) {
            return tjz5Var;
        }
        tjz5<E> tjz5Var2 = new tjz5<>(delegate().descendingMultiset());
        tjz5Var2.f26591k = this;
        this.f26591k = tjz5Var2;
        return tjz5Var2;
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> firstEntry() {
        return delegate().firstEntry();
    }

    @Override // com.google.common.collect.gb
    public gb<E> headMultiset(E e2, fu4 fu4Var) {
        return m58i.m15841t(delegate().headMultiset(e2, fu4Var));
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> lastEntry() {
        return delegate().lastEntry();
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.gb
    public o05.InterfaceC4482k<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.gb
    public gb<E> subMultiset(E e2, fu4 fu4Var, E e3, fu4 fu4Var2) {
        return m58i.m15841t(delegate().subMultiset(e2, fu4Var, e3, fu4Var2));
    }

    @Override // com.google.common.collect.gb
    public gb<E> tailMultiset(E e2, fu4 fu4Var) {
        return m58i.m15841t(delegate().tailMultiset(e2, fu4Var));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.m58i.qrj
    public NavigableSet<E> createElementSet() {
        return g0ad.dd(delegate().elementSet());
    }

    @Override // com.google.common.collect.m58i.qrj, com.google.common.collect.AbstractC4333d, com.google.common.collect.o05
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.m58i.qrj, com.google.common.collect.AbstractC4333d, com.google.common.collect.AbstractC4572x, com.google.common.collect.qkj8
    public gb<E> delegate() {
        return (gb) super.delegate();
    }
}
