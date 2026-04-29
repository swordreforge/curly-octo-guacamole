package com.xiaomi.push;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
class gc3c implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f32961k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ boolean f32962n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ long f32963q;

    gc3c(Context context, long j2, boolean z2) {
        this.f32961k = context;
        this.f32963q = j2;
        this.f32962n = z2;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            se.ki(this.f32961k, this.f32963q, this.f32962n);
        } catch (Exception e2) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("PowerStatsSP onSendMsg exception: " + e2.getMessage());
        }
    }
}
