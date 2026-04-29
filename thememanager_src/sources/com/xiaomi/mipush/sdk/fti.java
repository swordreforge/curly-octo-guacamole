package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes3.dex */
class fti implements Runnable {

    /* JADX INFO: renamed from: k */
    final /* synthetic */ Context f31356k;

    /* JADX INFO: renamed from: q */
    final /* synthetic */ Intent f31357q;

    fti(Context context, Intent intent) {
        this.f31356k = context;
        this.f31357q = intent;
    }

    @Override // java.lang.Runnable
    public void run() {
        PushMessageHandler.m19378b(this.f31356k, this.f31357q);
    }
}
