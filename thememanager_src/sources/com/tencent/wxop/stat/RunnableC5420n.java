package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C5392l;

/* JADX INFO: renamed from: com.tencent.wxop.stat.n */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5420n implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30233a;

    RunnableC5420n(Context context) {
        this.f30233a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f30233a;
        if (context == null) {
            StatServiceImpl.f29983q.error("The Context of StatService.onStop() can not be null!");
            return;
        }
        StatServiceImpl.flushDataToDB(context);
        if (StatServiceImpl.m18286a()) {
            return;
        }
        try {
            Thread.sleep(100L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        if (C5392l.m18450z(this.f30233a)) {
            if (StatConfig.isDebugEnable()) {
                StatServiceImpl.f29983q.m18377i("onStop isBackgroundRunning flushDataToDB");
            }
            StatServiceImpl.commitEvents(this.f30233a, -1);
        }
    }
}
