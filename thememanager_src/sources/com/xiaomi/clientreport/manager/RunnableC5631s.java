package com.xiaomi.clientreport.manager;

import com.xiaomi.push.hb;

/* JADX INFO: renamed from: com.xiaomi.clientreport.manager.s */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5631s implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ hb f31288k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ toq f31289q;

    RunnableC5631s(toq toqVar, hb hbVar) {
        this.f31289q = toqVar;
        this.f31288k = hbVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f31288k.run();
    }
}
