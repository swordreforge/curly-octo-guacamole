package com.bumptech.glide.util;

import androidx.collection.C0247k;

/* JADX INFO: compiled from: CachedHashCodeArrayMap.java */
/* JADX INFO: loaded from: classes2.dex */
public final class toq<K, V> extends C0247k<K, V> {

    /* JADX INFO: renamed from: e */
    private int f19098e;

    @Override // androidx.collection.qrj, java.util.Map
    public void clear() {
        this.f19098e = 0;
        super.clear();
    }

    @Override // androidx.collection.qrj, java.util.Map
    public int hashCode() {
        if (this.f19098e == 0) {
            this.f19098e = super.hashCode();
        }
        return this.f19098e;
    }

    @Override // androidx.collection.qrj
    public V kja0(int i2, V v2) {
        this.f19098e = 0;
        return (V) super.kja0(i2, v2);
    }

    @Override // androidx.collection.qrj
    public V n7h(int i2) {
        this.f19098e = 0;
        return (V) super.n7h(i2);
    }

    @Override // androidx.collection.qrj, java.util.Map
    public V put(K k2, V v2) {
        this.f19098e = 0;
        return (V) super.put(k2, v2);
    }

    @Override // androidx.collection.qrj
    public void x2(androidx.collection.qrj<? extends K, ? extends V> qrjVar) {
        this.f19098e = 0;
        super.x2(qrjVar);
    }
}
