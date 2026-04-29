package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
class i1 implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f31379k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ Intent f31380q;

    i1(Context context, Intent intent) {
        this.f31379k = context;
        this.f31380q = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f31379k.startService(this.f31380q);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0(e2.getMessage());
        }
    }
}
