package com.tencent.wxop.stat;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class ae implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30010a;

    ae(Context context) {
        this.f30010a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new Thread(new ap(this.f30010a, null, null), "NetworkMonitorTask").start();
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30010a, th);
        }
    }
}
