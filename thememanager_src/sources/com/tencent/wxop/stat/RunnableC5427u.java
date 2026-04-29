package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.event.C5402b;
import com.tencent.wxop.stat.event.C5403c;

/* JADX INFO: renamed from: com.tencent.wxop.stat.u */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5427u implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30246a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ StatSpecifyReportedInfo f30247b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C5403c f30248c;

    RunnableC5427u(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo, C5403c c5403c) {
        this.f30246a = context;
        this.f30247b = statSpecifyReportedInfo;
        this.f30248c = c5403c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.f30246a;
            C5402b c5402b = new C5402b(context, StatServiceImpl.m18279a(context, false, this.f30247b), this.f30248c.f30183a, this.f30247b);
            c5402b.m18483b().f30185c = this.f30248c.f30185c;
            new aq(c5402b).m18332a();
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30246a, th);
        }
    }
}
