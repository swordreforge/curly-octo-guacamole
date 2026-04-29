package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.event.C5402b;
import com.tencent.wxop.stat.event.C5403c;

/* JADX INFO: renamed from: com.tencent.wxop.stat.z */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5432z implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f30262a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ C5403c f30263b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ Context f30264c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ StatSpecifyReportedInfo f30265d;

    RunnableC5432z(String str, C5403c c5403c, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30262a = str;
        this.f30263b = c5403c;
        this.f30264c = context;
        this.f30265d = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (StatServiceImpl.m18287a(this.f30262a)) {
                StatServiceImpl.f29983q.error("The event_id of StatService.trackCustomEndEvent() can not be null or empty.");
                return;
            }
            Long l2 = (Long) StatServiceImpl.f29971e.remove(this.f30263b);
            if (l2 == null) {
                StatServiceImpl.f29983q.warn("No start time found for custom event: " + this.f30263b.toString() + ", lost trackCustomBeginKVEvent()?");
                return;
            }
            Context context = this.f30264c;
            C5402b c5402b = new C5402b(context, StatServiceImpl.m18279a(context, false, this.f30265d), this.f30263b.f30183a, this.f30265d);
            c5402b.m18483b().f30185c = this.f30263b.f30185c;
            Long lValueOf = Long.valueOf((System.currentTimeMillis() - l2.longValue()) / 1000);
            c5402b.m18482a(Long.valueOf(lValueOf.longValue() <= 0 ? 1L : lValueOf.longValue()).longValue());
            new aq(c5402b).m18332a();
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30264c, th);
        }
    }
}
