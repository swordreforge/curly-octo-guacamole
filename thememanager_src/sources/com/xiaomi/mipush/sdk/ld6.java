package com.xiaomi.mipush.sdk;

import com.xiaomi.mipush.sdk.cdj;

/* JADX INFO: loaded from: classes3.dex */
class ld6 implements Runnable {

    /* JADX INFO: renamed from: g */
    final /* synthetic */ cdj.toq f31396g;

    /* JADX INFO: renamed from: k */
    final /* synthetic */ String f31397k;

    /* JADX INFO: renamed from: n */
    final /* synthetic */ String f31398n;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ String f31399q;

    ld6(String str, String str2, String str3, cdj.toq toqVar) {
        this.f31397k = str;
        this.f31399q = str2;
        this.f31398n = str3;
        this.f31396g = toqVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        cdj.eqxt(cdj.f73122ld6, this.f31397k, this.f31399q, null, this.f31398n, this.f31396g);
    }
}
