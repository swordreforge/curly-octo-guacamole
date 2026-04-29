package com.google.common.base;

import java.lang.ref.PhantomReference;

/* JADX INFO: compiled from: FinalizablePhantomReference.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
public abstract class n7h<T> extends PhantomReference<T> implements kja0 {
    protected n7h(T t2, C4259h c4259h) {
        super(t2, c4259h.f25676k);
        c4259h.zy();
    }
}
