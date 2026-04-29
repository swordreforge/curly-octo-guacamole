package com.google.common.collect;

import com.google.common.collect.o05;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: compiled from: SortedMultiset.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
public interface gb<E> extends btvn<E>, f1bi<E> {
    Comparator<? super E> comparator();

    gb<E> descendingMultiset();

    @Override // com.google.common.collect.btvn, com.google.common.collect.o05
    NavigableSet<E> elementSet();

    @Override // com.google.common.collect.o05
    Set<o05.InterfaceC4482k<E>> entrySet();

    o05.InterfaceC4482k<E> firstEntry();

    gb<E> headMultiset(E e2, fu4 fu4Var);

    @Override // com.google.common.collect.o05, java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    o05.InterfaceC4482k<E> lastEntry();

    o05.InterfaceC4482k<E> pollFirstEntry();

    o05.InterfaceC4482k<E> pollLastEntry();

    gb<E> subMultiset(E e2, fu4 fu4Var, E e3, fu4 fu4Var2);

    gb<E> tailMultiset(E e2, fu4 fu4Var);
}
