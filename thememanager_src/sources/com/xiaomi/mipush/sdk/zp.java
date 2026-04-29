package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.C5652i;

/* JADX INFO: loaded from: classes3.dex */
class zp implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ C5652i.k.C8036k f31446k;

    zp(C5652i.k.C8036k c8036k) {
        this.f31446k = c8036k;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.f31446k.f73148toq.size() != 0) {
            this.f31446k.m19475g();
        } else if (this.f31446k.f73149zy != null) {
            this.f31446k.f73149zy.cancel(false);
            this.f31446k.f73149zy = null;
        }
    }
}
