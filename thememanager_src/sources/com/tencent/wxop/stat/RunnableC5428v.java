package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.event.C5403c;

/* JADX INFO: renamed from: com.tencent.wxop.stat.v */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5428v implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f30249a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5403c f30250b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Context f30251c;

    RunnableC5428v(String str, C5403c c5403c, Context context) {
        this.f30249a = str;
        this.f30250b = c5403c;
        this.f30251c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (StatServiceImpl.m18287a(this.f30249a)) {
                StatServiceImpl.f29983q.error("The event_id of StatService.trackCustomBeginEvent() can not be null or empty.");
                return;
            }
            if (StatConfig.isDebugEnable()) {
                StatServiceImpl.f29983q.m18377i("add begin key:" + this.f30250b.toString());
            }
            if (StatServiceImpl.f29971e.containsKey(this.f30250b)) {
                StatServiceImpl.f29983q.error("Duplicate CustomEvent key: " + this.f30250b.toString() + ", trackCustomBeginEvent() repeated?");
                return;
            }
            if (StatServiceImpl.f29971e.size() <= StatConfig.getMaxParallelTimmingEvents()) {
                StatServiceImpl.f29971e.put(this.f30250b, Long.valueOf(System.currentTimeMillis()));
                return;
            }
            StatServiceImpl.f29983q.error("The number of timedEvent exceeds the maximum value " + Integer.toString(StatConfig.getMaxParallelTimmingEvents()));
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30251c, th);
        }
    }
}
