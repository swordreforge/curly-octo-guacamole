package com.android.thememanager.library.util.app;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageManager;
import com.android.thememanager.C2082k;
import com.android.thememanager.util.C2789j;
import vq.C7706k;

/* JADX INFO: renamed from: com.android.thememanager.library.util.app.k */
/* JADX INFO: compiled from: AppUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2088k {
    private C2088k() {
        throw new C7706k(C2088k.class);
    }

    /* JADX INFO: renamed from: k */
    public static Context m8026k() {
        return C2082k.m7998k();
    }

    public static int toq() {
        try {
            return m8026k().getPackageManager().getPackageInfo(m8026k().getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e2) {
            C2789j.qrj(C2088k.class.getSimpleName(), e2);
            return 0;
        }
    }

    public static void zy(Application application) {
    }
}
