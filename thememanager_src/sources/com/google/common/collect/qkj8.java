package com.google.common.collect;

/* JADX INFO: compiled from: ForwardingObject.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public abstract class qkj8 {
    protected qkj8() {
    }

    protected abstract Object delegate();

    public String toString() {
        return delegate().toString();
    }
}
