package com.tencent.wxop.stat;

import com.tencent.wxop.stat.event.AbstractC5405e;
import com.tencent.wxop.stat.event.C5404d;
import java.lang.Thread;

/* JADX INFO: loaded from: classes3.dex */
class ao implements Thread.UncaughtExceptionHandler {
    ao() {
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        if (!StatConfig.isEnableStatService() || StatServiceImpl.f29986t == null) {
            return;
        }
        if (StatConfig.isAutoExceptionCaught()) {
            au.m18335a(StatServiceImpl.f29986t).m18364a((AbstractC5405e) new C5404d(StatServiceImpl.f29986t, StatServiceImpl.m18279a(StatServiceImpl.f29986t, false, (StatSpecifyReportedInfo) null), 2, th, thread, null), (InterfaceC5414h) null, false, true);
            StatServiceImpl.f29983q.debug("MTA has caught the following uncaught exception:");
            StatServiceImpl.f29983q.error(th);
        }
        StatServiceImpl.flushDataToDB(StatServiceImpl.f29986t);
        if (StatServiceImpl.f29984r != null) {
            StatServiceImpl.f29983q.m18374d("Call the original uncaught exception handler.");
            if (StatServiceImpl.f29984r instanceof ao) {
                return;
            }
            StatServiceImpl.f29984r.uncaughtException(thread, th);
        }
    }
}
