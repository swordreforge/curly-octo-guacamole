package com.tencent.wxop.stat;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class ai implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30018a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ StatSpecifyReportedInfo f30019b;

    ai(Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30018a = context;
        this.f30019b = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            StatServiceImpl.stopSession();
            StatServiceImpl.m18279a(this.f30018a, true, this.f30019b);
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30018a, th);
        }
    }
}
