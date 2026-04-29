package com.tencent.wxop.stat;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class an implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30031a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ StatSpecifyReportedInfo f30032b;

    an(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30031a = context;
        this.f30032b = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            StatServiceImpl.m18279a(this.f30031a, false, this.f30032b);
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
        }
    }
}
