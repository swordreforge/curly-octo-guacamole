package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
class jz5 implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f33104k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ boolean f33105n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ long f33106q;

    jz5(Context context, long j2, boolean z2) {
        this.f33104k = context;
        this.f33106q = j2;
        this.f33105n = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            se.fn3e(this.f33104k, this.f33106q, this.f33105n);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("PowerStatsSP onPong exception: " + e2.getMessage());
        }
    }
}
