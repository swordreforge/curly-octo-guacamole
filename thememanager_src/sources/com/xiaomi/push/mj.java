package com.xiaomi.push;

/* JADX INFO: loaded from: classes3.dex */
class mj implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ String f33422k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ btvn f33423q;

    mj(btvn btvnVar, String str) {
        this.f33423q = btvnVar;
        this.f33422k = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        tfm.zy().toq(this.f33422k, true);
    }
}
