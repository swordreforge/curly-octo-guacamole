package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C5392l;

/* JADX INFO: renamed from: com.tencent.wxop.stat.m */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5419m implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30231a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ StatSpecifyReportedInfo f30232b;

    RunnableC5419m(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30231a = context;
        this.f30232b = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f30231a;
        if (context == null) {
            StatServiceImpl.f29983q.error("The Context of StatService.onPause() can not be null!");
        } else {
            StatServiceImpl.trackEndPage(context, C5392l.m18428f(context), this.f30232b);
        }
    }
}
