package com.miui.privacypolicy;

import android.content.Context;
import android.util.Log;

/* JADX INFO: renamed from: com.miui.privacypolicy.n */
/* JADX INFO: compiled from: PackageUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5319n {

    /* JADX INFO: renamed from: k */
    private static final String f29753k = "Privacy_PackageUtils";

    private C5319n() {
    }

    /* JADX INFO: renamed from: k */
    protected static String m18121k(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (Exception e2) {
            Log.e(f29753k, "Exception", e2);
            return "";
        }
    }
}
