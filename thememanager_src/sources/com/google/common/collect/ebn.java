package com.google.common.collect;

/* JADX INFO: compiled from: IndexedImmutableSet.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true)
abstract class ebn<E> extends vep5<E> {

    /* JADX INFO: renamed from: com.google.common.collect.ebn$k */
    /* JADX INFO: compiled from: IndexedImmutableSet.java */
    class C4354k extends se<E> {
        C4354k() {
        }

        @Override // java.util.List
        public E get(int i2) {
            return (E) ebn.this.get(i2);
        }

        @Override // com.google.common.collect.z4
        boolean isPartialView() {
            return ebn.this.isPartialView();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return ebn.this.size();
        }
    }

    ebn() {
    }

    @Override // com.google.common.collect.z4
    @wlev.zy
    int copyIntoArray(Object[] objArr, int i2) {
        return asList().copyIntoArray(objArr, i2);
    }

    @Override // com.google.common.collect.vep5
    se<E> createAsList() {
        return new C4354k();
    }

    abstract E get(int i2);

    @Override // com.google.common.collect.vep5, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.o05
    public ab<E> iterator() {
        return asList().iterator();
    }
}
