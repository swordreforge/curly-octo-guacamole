package com.xiaomi.clientreport.manager;

import com.xiaomi.push.C5871j;

/* JADX INFO: renamed from: com.xiaomi.clientreport.manager.p */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5629p implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ C5871j f31284k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ toq f31285q;

    RunnableC5629p(toq toqVar, C5871j c5871j) {
        this.f31285q = toqVar;
        this.f31284k = c5871j;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f31284k.run();
    }
}
