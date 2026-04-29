package com.xiaomi.clientreport.manager;

/* JADX INFO: loaded from: classes3.dex */
class zy implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ com.xiaomi.clientreport.data.toq f31298k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ toq f31299q;

    zy(toq toqVar, com.xiaomi.clientreport.data.toq toqVar2) {
        this.f31299q = toqVar;
        this.f31298k = toqVar2;
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f31299q.m19326i(this.f31298k);
    }
}
