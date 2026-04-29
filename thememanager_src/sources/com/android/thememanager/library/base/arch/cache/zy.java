package com.android.thememanager.library.base.arch.cache;

import android.text.TextUtils;
import android.util.LruCache;
import com.android.thememanager.util.C2789j;
import zy.lvui;

/* JADX INFO: compiled from: MemoryCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy implements com.android.thememanager.library.base.arch.cache.toq {

    /* JADX INFO: renamed from: k */
    private LruCache<String, Object> f12324k;

    /* JADX INFO: compiled from: MemoryCache.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private static zy f12325k = new zy();

        private toq() {
        }
    }

    /* JADX INFO: renamed from: k */
    public static zy m8023k() {
        return toq.f12325k;
    }

    @Override // com.android.thememanager.library.base.arch.cache.toq
    public void clear() {
        this.f12324k.evictAll();
    }

    @Override // com.android.thememanager.library.base.arch.cache.toq
    public boolean contains(@lvui String key) {
        return this.f12324k.get(key) != null;
    }

    /* JADX INFO: renamed from: q */
    public synchronized void m8024q(@lvui String key, Object value) {
        if (TextUtils.isEmpty(key)) {
            return;
        }
        if (this.f12324k.get(key) != null) {
            this.f12324k.remove(key);
        }
        this.f12324k.put(key, value);
    }

    @Override // com.android.thememanager.library.base.arch.cache.toq
    public synchronized void remove(@lvui String key) {
        if (this.f12324k.get(key) != null) {
            this.f12324k.remove(key);
        }
    }

    public synchronized Object toq(@lvui String key) {
        return this.f12324k.get(key);
    }

    public synchronized <T> T zy(@lvui String key, @lvui Class<T> clazz) {
        try {
        } catch (Exception e2) {
            C2789j.qrj(zy.class.getSimpleName(), e2);
            return null;
        }
        return clazz.cast(this.f12324k.get(key));
    }

    private zy() {
        this.f12324k = new LruCache<>(((int) Runtime.getRuntime().maxMemory()) / 8);
    }
}
