package com.tencent.wxop.stat;

import android.content.Context;

/* JADX INFO: renamed from: com.tencent.wxop.stat.w */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5429w implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f30252a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f30253b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ StatSpecifyReportedInfo f30254c;

    RunnableC5429w(String str, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30252a = str;
        this.f30253b = context;
        this.f30254c = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            synchronized (StatServiceImpl.f29981o) {
                if (StatServiceImpl.f29981o.size() >= StatConfig.getMaxParallelTimmingEvents()) {
                    StatServiceImpl.f29983q.error("The number of page events exceeds the maximum value " + Integer.toString(StatConfig.getMaxParallelTimmingEvents()));
                    return;
                }
                String unused = StatServiceImpl.f29979m = this.f30252a;
                if (!StatServiceImpl.f29981o.containsKey(StatServiceImpl.f29979m)) {
                    StatServiceImpl.f29981o.put(StatServiceImpl.f29979m, Long.valueOf(System.currentTimeMillis()));
                    StatServiceImpl.m18279a(this.f30253b, true, this.f30254c);
                    return;
                }
                StatServiceImpl.f29983q.m18375e("Duplicate PageID : " + StatServiceImpl.f29979m + ", onResume() repeated?");
            }
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30253b, th);
        }
    }
}
