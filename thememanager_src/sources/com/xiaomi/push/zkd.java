package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
class zkd implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f34272k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ boolean f34273n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ long f34274q;

    zkd(Context context, long j2, boolean z2) {
        this.f34272k = context;
        this.f34274q = j2;
        this.f34273n = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            se.t8r(this.f34272k, this.f34274q, this.f34273n);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("PowerStatsSP onReceiveMsg exception: " + e2.getMessage());
        }
    }
}
