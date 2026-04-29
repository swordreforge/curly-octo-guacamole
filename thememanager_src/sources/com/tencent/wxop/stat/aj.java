package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.common.C5392l;

/* JADX INFO: loaded from: classes3.dex */
final class aj implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30020a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ StatSpecifyReportedInfo f30021b;

    aj(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30020a = context;
        this.f30021b = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.f30020a;
        if (context == null) {
            StatServiceImpl.f29983q.error("The Context of StatService.onResume() can not be null!");
        } else {
            StatServiceImpl.trackBeginPage(context, C5392l.m18428f(context), this.f30021b);
        }
    }
}
