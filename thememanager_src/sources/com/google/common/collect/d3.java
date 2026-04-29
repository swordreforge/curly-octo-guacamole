package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import wlev.InterfaceC7731k;

/* JADX INFO: compiled from: Comparators.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
@InterfaceC7731k
public final class d3 {
    private d3() {
    }

    /* JADX INFO: renamed from: k */
    public static <T> boolean m15599k(Iterable<? extends T> iterable, Comparator<T> comparator) {
        com.google.common.base.jk.a9(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T> boolean toq(Iterable<? extends T> iterable, Comparator<T> comparator) {
        com.google.common.base.jk.a9(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    public static <T, S extends T> Comparator<Iterable<S>> zy(Comparator<T> comparator) {
        return new n2t((Comparator) com.google.common.base.jk.a9(comparator));
    }
}
