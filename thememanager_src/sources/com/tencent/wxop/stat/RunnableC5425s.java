package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.event.C5402b;
import com.tencent.wxop.stat.event.C5403c;

/* JADX INFO: renamed from: com.tencent.wxop.stat.s */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5425s implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30243a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ StatSpecifyReportedInfo f30244b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C5403c f30245c;

    RunnableC5425s(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo, C5403c c5403c) {
        this.f30243a = context;
        this.f30244b = statSpecifyReportedInfo;
        this.f30245c = c5403c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.f30243a;
            C5402b c5402b = new C5402b(context, StatServiceImpl.m18279a(context, false, this.f30244b), this.f30245c.f30183a, this.f30244b);
            c5402b.m18483b().f30184b = this.f30245c.f30184b;
            new aq(c5402b).m18332a();
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30243a, th);
        }
    }
}
