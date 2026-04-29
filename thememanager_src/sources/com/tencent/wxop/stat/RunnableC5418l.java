package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C5392l;
import java.lang.Thread;

/* JADX INFO: renamed from: com.tencent.wxop.stat.l */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5418l implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30230a;

    RunnableC5418l(Context context) {
        this.f30230a = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5378a.m18307a(StatServiceImpl.f29986t).m18322h();
        C5392l.m18407a(this.f30230a, true);
        au.m18335a(this.f30230a);
        C5415i.m18501b(this.f30230a);
        Thread.UncaughtExceptionHandler unused = StatServiceImpl.f29984r = Thread.getDefaultUncaughtExceptionHandler();
        Thread.setDefaultUncaughtExceptionHandler(new ao());
        if (StatConfig.getStatSendStrategy() == StatReportStrategy.APP_LAUNCH) {
            StatServiceImpl.commitEvents(this.f30230a, -1);
        }
        if (StatConfig.isDebugEnable()) {
            StatServiceImpl.f29983q.m18374d("Init MTA StatService success.");
        }
    }
}
