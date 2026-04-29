package com.xiaomi.push.service.receivers;

import android.content.Context;

/* JADX INFO: renamed from: com.xiaomi.push.service.receivers.k */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5937k implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f33892k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ NetworkStatusReceiver f33893q;

    RunnableC5937k(NetworkStatusReceiver networkStatusReceiver, Context context) {
        this.f33893q = networkStatusReceiver;
        this.f33892k = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f33893q.m21748a(this.f33892k);
    }
}
