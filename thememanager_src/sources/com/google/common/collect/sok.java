package com.google.common.collect;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: compiled from: ImmutableAsList.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(emulated = true, serializable = true)
abstract class sok<E> extends se<E> {

    /* JADX INFO: renamed from: com.google.common.collect.sok$k */
    /* JADX INFO: compiled from: ImmutableAsList.java */
    @wlev.zy
    static class C4523k implements Serializable {
        private static final long serialVersionUID = 0;
        final z4<?> collection;

        C4523k(z4<?> z4Var) {
            this.collection = z4Var;
        }

        Object readResolve() {
            return this.collection.asList();
        }
    }

    sok() {
    }

    @wlev.zy
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.se, com.google.common.collect.z4, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.o05
    public boolean contains(Object obj) {
        return delegateCollection().contains(obj);
    }

    abstract z4<E> delegateCollection();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return delegateCollection().isEmpty();
    }

    @Override // com.google.common.collect.z4
    boolean isPartialView() {
        return delegateCollection().isPartialView();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return delegateCollection().size();
    }

    @Override // com.google.common.collect.se, com.google.common.collect.z4
    @wlev.zy
    Object writeReplace() {
        return new C4523k(delegateCollection());
    }
}
