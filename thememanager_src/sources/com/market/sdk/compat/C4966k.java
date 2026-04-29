package com.market.sdk.compat;

import com.market.sdk.utils.n7h;
import p027k.InterfaceC6106k;

/* JADX INFO: renamed from: com.market.sdk.compat.k */
/* JADX INFO: compiled from: ActivityThreadCompat.java */
/* JADX INFO: loaded from: classes3.dex */
public class C4966k {

    /* JADX INFO: renamed from: k */
    private static Class<?> f28033k = n7h.zy("android.app.ActivityThread");

    /* JADX INFO: renamed from: k */
    public static InterfaceC6106k m17299k() {
        try {
            Class<?> clsZy = n7h.zy("android.content.pm.IPackageManager");
            Class<?> cls = f28033k;
            return (InterfaceC6106k) n7h.m17459s(cls, cls, "getPackageManager", n7h.f7l8(clsZy, new Class[0]), new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
