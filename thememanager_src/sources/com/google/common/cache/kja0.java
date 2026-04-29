package com.google.common.cache;

import com.google.common.cache.ld6;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: compiled from: ReferenceEntry.java */
/* JADX INFO: loaded from: classes2.dex */
@wlev.zy
interface kja0<K, V> {
    long getAccessTime();

    int getHash();

    @NullableDecl
    K getKey();

    @NullableDecl
    kja0<K, V> getNext();

    kja0<K, V> getNextInAccessQueue();

    kja0<K, V> getNextInWriteQueue();

    kja0<K, V> getPreviousInAccessQueue();

    kja0<K, V> getPreviousInWriteQueue();

    ld6.wvg<K, V> getValueReference();

    long getWriteTime();

    void setAccessTime(long j2);

    void setNextInAccessQueue(kja0<K, V> kja0Var);

    void setNextInWriteQueue(kja0<K, V> kja0Var);

    void setPreviousInAccessQueue(kja0<K, V> kja0Var);

    void setPreviousInWriteQueue(kja0<K, V> kja0Var);

    void setValueReference(ld6.wvg<K, V> wvgVar);

    void setWriteTime(long j2);
}
