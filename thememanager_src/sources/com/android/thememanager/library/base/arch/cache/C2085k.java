package com.android.thememanager.library.base.arch.cache;

import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.library.base.arch.cache.k */
/* JADX INFO: compiled from: DiskCache.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2085k implements com.android.thememanager.library.base.arch.cache.toq {

    /* JADX INFO: renamed from: com.android.thememanager.library.base.arch.cache.k$toq */
    /* JADX INFO: compiled from: DiskCache.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private static C2085k f12321k = new C2085k();

        private toq() {
        }
    }

    /* JADX INFO: renamed from: k */
    public static C2085k m8013k() {
        return toq.f12321k;
    }

    @Override // com.android.thememanager.library.base.arch.cache.toq
    public void clear() {
    }

    @Override // com.android.thememanager.library.base.arch.cache.toq
    public boolean contains(@lvui String key) {
        return false;
    }

    @Override // com.android.thememanager.library.base.arch.cache.toq
    public void remove(@lvui String key) {
    }

    private C2085k() {
    }
}
