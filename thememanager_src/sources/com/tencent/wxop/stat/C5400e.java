package com.tencent.wxop.stat;

import com.tencent.wxop.stat.common.C5392l;
import java.util.TimerTask;

/* JADX INFO: renamed from: com.tencent.wxop.stat.e */
/* JADX INFO: loaded from: classes3.dex */
class C5400e extends TimerTask {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ C5399d f30177a;

    C5400e(C5399d c5399d) {
        this.f30177a = c5399d;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        if (StatConfig.isDebugEnable()) {
            C5392l.m18418b().m18377i("TimerTask run");
        }
        StatServiceImpl.m18298e(this.f30177a.f30176c);
        cancel();
        this.f30177a.m18476a();
    }
}
