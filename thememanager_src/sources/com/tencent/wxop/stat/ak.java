package com.tencent.wxop.stat;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class ak implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ String f30022a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f30023b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ StatSpecifyReportedInfo f30024c;

    ak(String str, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30022a = str;
        this.f30023b = context;
        this.f30024c = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = this.f30022a;
        if (str == null || str.trim().length() == 0) {
            StatServiceImpl.f29983q.m18379w("qq num is null or empty.");
            return;
        }
        String str2 = this.f30022a;
        StatConfig.f29941f = str2;
        StatServiceImpl.m18290b(this.f30023b, new StatAccount(str2), this.f30024c);
    }
}
