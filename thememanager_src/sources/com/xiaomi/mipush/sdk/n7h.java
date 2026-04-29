package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.text.TextUtils;

/* JADX INFO: loaded from: classes3.dex */
class n7h implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ String[] f31415k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ Context f31416q;

    n7h(String[] strArr, Context context) {
        this.f31415k = strArr;
        this.f31416q = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        PackageInfo packageInfo;
        try {
            for (String str : this.f31415k) {
                if (!TextUtils.isEmpty(str) && (packageInfo = this.f31416q.getPackageManager().getPackageInfo(str, 4)) != null) {
                    cdj.n7h(this.f31416q, packageInfo);
                }
            }
        } catch (Throwable th) {
            com.xiaomi.channel.commonutils.logger.zy.t8r(th);
        }
    }
}
