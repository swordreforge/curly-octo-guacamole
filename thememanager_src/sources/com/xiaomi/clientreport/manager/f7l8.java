package com.xiaomi.clientreport.manager;

import com.xiaomi.push.C5889p;

/* JADX INFO: loaded from: classes3.dex */
class f7l8 extends C5889p.k {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ toq f31281k;

    f7l8(toq toqVar) {
        this.f31281k = toqVar;
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return "100889";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f31281k.cdj() > 0) {
            this.f31281k.f31293k.execute(new RunnableC5632y(this));
        }
    }
}
