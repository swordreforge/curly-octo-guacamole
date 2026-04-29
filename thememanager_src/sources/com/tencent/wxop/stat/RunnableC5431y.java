package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.event.C5403c;

/* JADX INFO: renamed from: com.tencent.wxop.stat.y */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5431y implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f30259a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5403c f30260b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Context f30261c;

    RunnableC5431y(String str, C5403c c5403c, Context context) {
        this.f30259a = str;
        this.f30260b = c5403c;
        this.f30261c = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (StatServiceImpl.m18287a(this.f30259a)) {
                StatServiceImpl.f29983q.error("The event_id of StatService.trackCustomBeginEvent() can not be null or empty.");
                return;
            }
            if (StatConfig.isDebugEnable()) {
                StatServiceImpl.f29983q.m18377i("add begin key:" + this.f30260b);
            }
            if (StatServiceImpl.f29971e.containsKey(this.f30260b)) {
                StatServiceImpl.f29983q.warn("Duplicate CustomEvent key: " + this.f30260b.toString() + ", trackCustomBeginKVEvent() repeated?");
                return;
            }
            if (StatServiceImpl.f29971e.size() <= StatConfig.getMaxParallelTimmingEvents()) {
                StatServiceImpl.f29971e.put(this.f30260b, Long.valueOf(System.currentTimeMillis()));
                return;
            }
            StatServiceImpl.f29983q.error("The number of timedEvent exceeds the maximum value " + Integer.toString(StatConfig.getMaxParallelTimmingEvents()));
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30261c, th);
        }
    }
}
