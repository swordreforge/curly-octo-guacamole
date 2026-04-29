package com.xiaomi.clientreport.manager;

import com.xiaomi.push.C5889p;

/* JADX INFO: renamed from: com.xiaomi.clientreport.manager.n */
/* JADX INFO: loaded from: classes3.dex */
class C5628n extends C5889p.k {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ toq f31283k;

    C5628n(toq toqVar) {
        this.f31283k = toqVar;
    }

    @Override // com.xiaomi.push.C5889p.k
    /* JADX INFO: renamed from: k */
    public String mo19320k() {
        return "100888";
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f31283k.m19327k() > 0) {
            this.f31283k.f31293k.execute(new RunnableC5626g(this));
        }
    }
}
