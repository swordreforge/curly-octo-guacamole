package com.google.common.cache;

import com.google.common.base.jk;
import java.util.AbstractMap;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: RemovalNotification.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.toq
public final class t8r<K, V> extends AbstractMap.SimpleImmutableEntry<K, V> {
    private static final long serialVersionUID = 0;
    private final EnumC4283h cause;

    private t8r(@NullableDecl K k2, @NullableDecl V v2, EnumC4283h enumC4283h) {
        super(k2, v2);
        this.cause = (EnumC4283h) jk.a9(enumC4283h);
    }

    public static <K, V> t8r<K, V> create(@NullableDecl K k2, @NullableDecl V v2, EnumC4283h enumC4283h) {
        return new t8r<>(k2, v2, enumC4283h);
    }

    public EnumC4283h getCause() {
        return this.cause;
    }

    public boolean wasEvicted() {
        return this.cause.wasEvicted();
    }
}
