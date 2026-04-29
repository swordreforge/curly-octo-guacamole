package com.tencent.wxop.stat;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class ad implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30008a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ int f30009b;

    ad(Context context, int i2) {
        this.f30008a = context;
        this.f30009b = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            StatServiceImpl.flushDataToDB(this.f30008a);
            au.m18335a(this.f30008a).m18363a(this.f30009b);
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30008a, th);
        }
    }
}
