package com.google.common.collect;

import java.io.Serializable;

/* JADX INFO: compiled from: UsingToStringOrdering.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
final class f3f extends kx3<Object> implements Serializable {
    static final f3f INSTANCE = new f3f();
    private static final long serialVersionUID = 0;

    private f3f() {
    }

    private Object readResolve() {
        return INSTANCE;
    }

    @Override // com.google.common.collect.kx3, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return obj.toString().compareTo(obj2.toString());
    }

    public String toString() {
        return "Ordering.usingToString()";
    }
}
