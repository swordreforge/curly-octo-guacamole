package com.android.thememanager.util.cache;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: com.android.thememanager.util.cache.k */
/* JADX INFO: compiled from: DataCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2764k<K, V> extends LinkedHashMap<K, V> {
    private static final long serialVersionUID = 1;
    private int maximumCapacity;

    public C2764k(int maximumCapacity) {
        this(maximumCapacity, 0);
    }

    public int getMaximumCapacity() {
        return this.maximumCapacity;
    }

    @Override // java.util.LinkedHashMap
    protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
        return size() > this.maximumCapacity;
    }

    public void setMaximumCapacity(int maximumCapacity) {
        this.maximumCapacity = maximumCapacity;
    }

    public C2764k(int maximumCapacity, int initialCapacity) {
        this(maximumCapacity, initialCapacity, 0.75f);
    }

    public C2764k(int maximumCapacity, int initialCapacity, float loadFactor) {
        super(initialCapacity, loadFactor, true);
        this.maximumCapacity = maximumCapacity;
    }

    public C2764k(Map<? extends K, ? extends V> map, int maximumCapacity) {
        this(maximumCapacity);
        putAll(map);
    }
}
