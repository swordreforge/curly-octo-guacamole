package com.android.thememanager.settings;

import android.util.LruCache;

/* JADX INFO: renamed from: com.android.thememanager.settings.p */
/* JADX INFO: compiled from: SettingsOnlineWallpaperCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2532p {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static C2532p f60801toq;

    /* JADX INFO: renamed from: k */
    private LruCache<String, k> f15164k = new LruCache<>(50);

    /* JADX INFO: renamed from: com.android.thememanager.settings.p$k */
    /* JADX INFO: compiled from: SettingsOnlineWallpaperCache.java */
    public static class k {

        /* JADX INFO: renamed from: k */
        String f15165k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        String f60802toq;

        public k(String type, String typeId) {
            this.f15165k = type;
            this.f60802toq = typeId;
        }
    }

    private C2532p() {
    }

    public static C2532p toq() {
        if (f60801toq == null) {
            f60801toq = new C2532p();
        }
        return f60801toq;
    }

    /* JADX INFO: renamed from: g */
    public k m9035g(String key) {
        return this.f15164k.remove(key);
    }

    /* JADX INFO: renamed from: k */
    public void m9036k() {
        this.f15164k.evictAll();
    }

    /* JADX INFO: renamed from: n */
    public void m9037n(String key, k cache) {
        if (p029m.zy.toq(key)) {
            return;
        }
        this.f15164k.put(key, cache);
    }

    /* JADX INFO: renamed from: q */
    public k m9038q(String key) {
        if (p029m.zy.toq(key)) {
            return null;
        }
        return this.f15164k.get(key);
    }

    public int zy() {
        return this.f15164k.size();
    }
}
