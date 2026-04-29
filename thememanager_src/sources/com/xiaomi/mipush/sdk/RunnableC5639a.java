package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.C5652i;
import com.xiaomi.push.kl7m;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.a */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5639a implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ kl7m f31310k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ C5652i.k.C8036k f31311q;

    RunnableC5639a(C5652i.k.C8036k c8036k, kl7m kl7mVar) {
        this.f31311q = c8036k;
        this.f31310k = kl7mVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f31311q.f73148toq.add(this.f31310k);
        this.f31311q.zy();
    }
}
