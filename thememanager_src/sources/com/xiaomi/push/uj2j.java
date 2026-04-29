package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
class uj2j implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f33986k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ boolean f33987n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ long f33988q;

    uj2j(Context context, long j2, boolean z2) {
        this.f33986k = context;
        this.f33988q = j2;
        this.f33987n = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            se.m21471i(this.f33986k, this.f33988q, this.f33987n);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("PowerStatsSP onPing exception: " + e2.getMessage());
        }
    }
}
