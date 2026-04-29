package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: compiled from: SortedIterables.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
final class tww7 {
    private tww7() {
    }

    /* JADX INFO: renamed from: k */
    public static <E> Comparator<? super E> m15986k(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? kx3.natural() : comparator;
    }

    public static boolean toq(Comparator<?> comparator, Iterable<?> iterable) {
        Comparator comparator2;
        com.google.common.base.jk.a9(comparator);
        com.google.common.base.jk.a9(iterable);
        if (iterable instanceof SortedSet) {
            comparator2 = m15986k((SortedSet) iterable);
        } else {
            if (!(iterable instanceof f1bi)) {
                return false;
            }
            comparator2 = ((f1bi) iterable).comparator();
        }
        return comparator.equals(comparator2);
    }
}
