package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: compiled from: SortedIterable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
interface f1bi<T> extends Iterable<T> {
    Comparator<? super T> comparator();

    @Override // java.lang.Iterable
    Iterator<T> iterator();
}
