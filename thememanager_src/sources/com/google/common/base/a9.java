package com.google.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: Predicate.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public interface a9<T> {
    @CanIgnoreReturnValue
    boolean apply(@NullableDecl T t2);

    boolean equals(@NullableDecl Object obj);
}
