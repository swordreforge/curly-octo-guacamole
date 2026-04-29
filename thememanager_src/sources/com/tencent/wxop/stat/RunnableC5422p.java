package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.event.C5404d;

/* JADX INFO: renamed from: com.tencent.wxop.stat.p */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5422p implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f30235a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f30236b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ StatSpecifyReportedInfo f30237c;

    RunnableC5422p(String str, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30235a = str;
        this.f30236b = context;
        this.f30237c = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (StatServiceImpl.m18287a(this.f30235a)) {
                StatServiceImpl.f29983q.error("Error message in StatService.reportError() is empty.");
            } else {
                Context context = this.f30236b;
                new aq(new C5404d(context, StatServiceImpl.m18279a(context, false, this.f30237c), this.f30235a, 0, StatConfig.getMaxReportEventLength(), null, this.f30237c)).m18332a();
            }
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30236b, th);
        }
    }
}
