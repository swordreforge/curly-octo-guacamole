package com.tencent.wxop.stat;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.tencent.wxop.stat.b */
/* JADX INFO: loaded from: classes3.dex */
class C5379b extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5378a f30076a;

    C5379b(C5378a c5378a) {
        this.f30076a = c5378a;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f30076a.f29997e != null) {
            this.f30076a.f29997e.m18389a(new RunnableC5380c(this));
        }
    }
}
