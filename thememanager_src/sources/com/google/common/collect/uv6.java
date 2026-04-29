package com.google.common.collect;

/* JADX INFO: compiled from: EmptyImmutableListMultimap.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq(serializable = true)
class uv6 extends gc3c<Object, Object> {
    static final uv6 INSTANCE = new uv6();
    private static final long serialVersionUID = 0;

    private uv6() {
        super(zkd.of(), 0);
    }

    private Object readResolve() {
        return INSTANCE;
    }
}
