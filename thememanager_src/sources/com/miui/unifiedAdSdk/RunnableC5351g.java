package com.miui.unifiedAdSdk;

import com.miui.unifiedAdSdk.f7l8;

/* JADX INFO: renamed from: com.miui.unifiedAdSdk.g */
/* JADX INFO: compiled from: RemoteUnifiedAdService.java */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5351g implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Object f29878k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ f7l8.AbstractRunnableC5350k f29879q;

    RunnableC5351g(f7l8.AbstractRunnableC5350k abstractRunnableC5350k, Object obj) {
        this.f29879q = abstractRunnableC5350k;
        this.f29878k = obj;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f29879q.zy(this.f29878k);
    }
}
