package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.event.C5402b;
import com.tencent.wxop.stat.event.C5403c;

/* JADX INFO: loaded from: classes3.dex */
final class ac implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30004a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ StatSpecifyReportedInfo f30005b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C5403c f30006c;

    /* JADX INFO: renamed from: d */
    final /* synthetic */ int f30007d;

    ac(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo, C5403c c5403c, int i2) {
        this.f30004a = context;
        this.f30005b = statSpecifyReportedInfo;
        this.f30006c = c5403c;
        this.f30007d = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.f30004a;
            C5402b c5402b = new C5402b(context, StatServiceImpl.m18279a(context, false, this.f30005b), this.f30006c.f30183a, this.f30005b);
            c5402b.m18483b().f30185c = this.f30006c.f30185c;
            Long lValueOf = Long.valueOf(this.f30007d);
            c5402b.m18482a(Long.valueOf(lValueOf.longValue() <= 0 ? 1L : lValueOf.longValue()).longValue());
            new aq(c5402b).m18332a();
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30004a, th);
        }
    }
}
