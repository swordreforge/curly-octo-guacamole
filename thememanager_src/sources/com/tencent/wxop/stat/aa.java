package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.event.C5407g;

/* JADX INFO: loaded from: classes3.dex */
final class aa implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30001a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ StatSpecifyReportedInfo f30002b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ StatAppMonitor f30003c;

    aa(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo, StatAppMonitor statAppMonitor) {
        this.f30001a = context;
        this.f30002b = statSpecifyReportedInfo;
        this.f30003c = statAppMonitor;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Context context = this.f30001a;
            new aq(new C5407g(context, StatServiceImpl.m18279a(context, false, this.f30002b), this.f30003c, this.f30002b)).m18332a();
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30001a, th);
        }
    }
}
