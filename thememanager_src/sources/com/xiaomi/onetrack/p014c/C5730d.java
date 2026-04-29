package com.xiaomi.onetrack.p014c;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.xiaomi.onetrack.c.d */
/* JADX INFO: loaded from: classes3.dex */
final class C5730d extends BroadcastReceiver {
    C5730d() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        C5727a.m19938a(new RunnableC5731e(this, intent));
    }
}
