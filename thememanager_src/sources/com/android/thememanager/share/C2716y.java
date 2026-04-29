package com.android.thememanager.share;

import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: com.android.thememanager.share.y */
/* JADX INFO: compiled from: ShareResultManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2716y {

    /* JADX INFO: renamed from: k */
    private static WeakReference<toq> f16090k;

    /* JADX INFO: renamed from: k */
    public static void m9478k(int flag, int result) {
        toq toqVar;
        WeakReference<toq> weakReference = f16090k;
        if (weakReference == null || (toqVar = weakReference.get()) == null) {
            return;
        }
        toqVar.mo7981k(flag, result);
    }

    static void toq(toq listener) {
        f16090k = listener == null ? null : new WeakReference<>(listener);
    }
}
