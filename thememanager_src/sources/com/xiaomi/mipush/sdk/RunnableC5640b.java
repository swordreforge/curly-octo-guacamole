package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.util.Log;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.b */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5640b implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f31313k;

    RunnableC5640b(Context context) {
        this.f31313k = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            PackageInfo packageInfo = this.f31313k.getPackageManager().getPackageInfo(this.f31313k.getPackageName(), 4612);
            y9n.m19578p(this.f31313k);
            y9n.x2(this.f31313k, packageInfo);
            y9n.ld6(this.f31313k, packageInfo);
        } catch (Throwable th) {
            Log.e("ManifestChecker", "", th);
        }
    }
}
