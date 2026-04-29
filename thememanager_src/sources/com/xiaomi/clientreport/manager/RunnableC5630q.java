package com.xiaomi.clientreport.manager;

/* JADX INFO: renamed from: com.xiaomi.clientreport.manager.q */
/* JADX INFO: loaded from: classes3.dex */
class RunnableC5630q implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ com.xiaomi.clientreport.data.zy f31286k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ toq f31287q;

    RunnableC5630q(toq toqVar, com.xiaomi.clientreport.data.zy zyVar) {
        this.f31287q = toqVar;
        this.f31286k = zyVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f31287q.fn3e(this.f31286k);
    }
}
