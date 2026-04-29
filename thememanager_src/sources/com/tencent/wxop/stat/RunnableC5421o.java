package com.tencent.wxop.stat;

import android.content.Context;

/* JADX INFO: renamed from: com.tencent.wxop.stat.o */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5421o implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30234a;

    RunnableC5421o(Context context) {
        this.f30234a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StatServiceImpl.flushDataToDB(this.f30234a);
    }
}
