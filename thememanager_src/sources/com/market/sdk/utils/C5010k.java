package com.market.sdk.utils;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import com.market.sdk.C4979n;
import com.market.sdk.utils.qrj;

/* JADX INFO: renamed from: com.market.sdk.utils.k */
/* JADX INFO: compiled from: AppGlobal.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5010k {

    /* JADX INFO: renamed from: k */
    private static Context f28208k;

    /* JADX INFO: renamed from: g */
    public static void m17434g(Context context) {
        f28208k = context.getApplicationContext();
        m17437q();
    }

    /* JADX INFO: renamed from: k */
    public static ContentResolver m17435k() {
        return f28208k.getContentResolver();
    }

    @Deprecated
    /* JADX INFO: renamed from: n */
    public static void m17436n(Activity activity) {
        f28208k = activity;
        m17437q();
    }

    /* JADX INFO: renamed from: q */
    private static void m17437q() {
        if (qrj.m17479g(C4979n.f68908kja0, new qrj.EnumC5015k[0]) == 0) {
            qrj.ki(C4979n.f68908kja0, System.currentTimeMillis(), new qrj.EnumC5015k[0]);
        }
    }

    public static Context toq() {
        Context context = f28208k;
        if (context != null) {
            return context;
        }
        throw new IllegalArgumentException("sContext is null,should call setContext first!!");
    }

    public static PackageManager zy() {
        return f28208k.getPackageManager();
    }
}
