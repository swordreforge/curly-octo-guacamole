package com.google.common.collect;

import com.google.common.collect.vy;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: compiled from: StandardRowSortedTable.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
class cn02<R, C, V> extends ovdh<R, C, V> implements zff0<R, C, V> {
    private static final long serialVersionUID = 0;

    /* JADX INFO: compiled from: StandardRowSortedTable.java */
    private class toq extends ovdh<R, C, V>.C4506y implements SortedMap<R, Map<C, V>> {
        private toq() {
            super();
        }

        @Override // java.util.SortedMap
        public Comparator<? super R> comparator() {
            return cn02.this.m15594n().comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.vy.AbstractC4543l
        /* JADX INFO: renamed from: f7l8, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> mo15887y() {
            return new vy.jp0y(this);
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) cn02.this.m15594n().firstKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r2) {
            com.google.common.base.jk.a9(r2);
            return new cn02(cn02.this.m15594n().headMap(r2), cn02.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) cn02.this.m15594n().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r2, R r3) {
            com.google.common.base.jk.a9(r2);
            com.google.common.base.jk.a9(r3);
            return new cn02(cn02.this.m15594n().subMap(r2, r3), cn02.this.factory).rowMap();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r2) {
            com.google.common.base.jk.a9(r2);
            return new cn02(cn02.this.m15594n().tailMap(r2), cn02.this.factory).rowMap();
        }

        @Override // com.google.common.collect.vy.AbstractC4543l, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public SortedSet<R> mo15886p() {
            return (SortedSet) super.mo15886p();
        }
    }

    cn02(SortedMap<R, Map<C, V>> sortedMap, com.google.common.base.lvui<? extends Map<C, V>> lvuiVar) {
        super(sortedMap, lvuiVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public SortedMap<R, Map<C, V>> m15594n() {
        return (SortedMap) this.backingMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ovdh
    public SortedMap<R, Map<C, V>> createRowMap() {
        return new toq();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.cdj, com.google.common.collect.qh4d
    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    @Override // com.google.common.collect.ovdh, com.google.common.collect.qh4d
    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }
}
