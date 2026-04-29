package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.event.C5404d;

/* JADX INFO: renamed from: com.tencent.wxop.stat.r */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5424r implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Throwable f30240a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f30241b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ StatSpecifyReportedInfo f30242c;

    RunnableC5424r(Throwable th, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30240a = th;
        this.f30241b = context;
        this.f30242c = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f30240a == null) {
            StatServiceImpl.f29983q.error("The Throwable error message of StatService.reportException() can not be null!");
        } else {
            Context context = this.f30241b;
            new aq(new C5404d(context, StatServiceImpl.m18279a(context, false, this.f30242c), 1, this.f30240a, this.f30242c)).m18332a();
        }
    }
}
