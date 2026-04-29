package com.xiaomi.mipush.sdk;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
class a98o implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f31312k;

    a98o(Context context) {
        this.f31312k = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        MessageHandleService.m19359c(this.f31312k);
    }
}
