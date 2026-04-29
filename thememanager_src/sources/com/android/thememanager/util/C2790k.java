package com.android.thememanager.util;

import android.util.LruCache;
import com.android.thememanager.C2082k;

/* JADX INFO: renamed from: com.android.thememanager.util.k */
/* JADX INFO: compiled from: AppCacheManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2790k {

    /* JADX INFO: renamed from: k */
    private LruCache<String, com.android.thememanager.fu4> f16580k;

    /* JADX INFO: renamed from: com.android.thememanager.util.k$toq */
    /* JADX INFO: compiled from: AppCacheManager.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private static final C2790k f16581k = new C2790k();

        private toq() {
        }
    }

    public static final C2790k toq() {
        return toq.f16581k;
    }

    /* JADX INFO: renamed from: k */
    public void m9840k() {
        this.f16580k.trimToSize(0);
    }

    public com.android.thememanager.fu4 zy(String resourceCode) {
        com.android.thememanager.fu4 fu4Var = this.f16580k.get(resourceCode);
        if (fu4Var != null) {
            return fu4Var;
        }
        com.android.thememanager.fu4 fu4VarM10535g = C2082k.zy().m8001n().m10535g(resourceCode);
        this.f16580k.put(resourceCode, fu4VarM10535g);
        return fu4VarM10535g;
    }

    private C2790k() {
        this.f16580k = new LruCache<>(6);
    }
}
