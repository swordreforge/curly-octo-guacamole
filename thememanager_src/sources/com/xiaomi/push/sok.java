package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
class sok implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f33961k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ long f33962q;

    sok(Context context, long j2) {
        this.f33961k = context;
        this.f33962q = j2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            v0af.m21891h(this.f33961k, this.f33962q);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("DisconnectStatsSP onReconnection exception: " + e2.getMessage());
        }
    }
}
