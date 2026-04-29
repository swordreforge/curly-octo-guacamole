package com.google.common.collect;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

/* JADX INFO: renamed from: com.google.common.collect.w */
/* JADX INFO: compiled from: PeekingIterator.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface InterfaceC4555w<E> extends Iterator<E> {
    @Override // java.util.Iterator
    @CanIgnoreReturnValue
    E next();

    E peek();

    @Override // java.util.Iterator
    void remove();
}
