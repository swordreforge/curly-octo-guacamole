package com.google.common.collect;

/* JADX INFO: compiled from: EmptyImmutableSetMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
class vyq extends mbx<Object, Object> {
    static final vyq INSTANCE = new vyq();
    private static final long serialVersionUID = 0;

    private vyq() {
        super(zkd.of(), 0, null);
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
