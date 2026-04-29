package com.google.common.collect;

import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: RowSortedTable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface zff0<R, C, V> extends qh4d<R, C, V> {
    @Override // com.google.common.collect.qh4d
    SortedSet<R> rowKeySet();

    @Override // com.google.common.collect.qh4d
    SortedMap<R, Map<C, V>> rowMap();
}
