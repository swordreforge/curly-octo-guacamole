package com.tencent.wxop.stat;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
final class al implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ StatAccount f30025a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f30026b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ StatSpecifyReportedInfo f30027c;

    al(StatAccount statAccount, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30025a = statAccount;
        this.f30026b = context;
        this.f30027c = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StatAccount statAccount = this.f30025a;
        if (statAccount == null || statAccount.getAccount().trim().length() == 0) {
            StatServiceImpl.f29983q.m18379w("account is null or empty.");
        } else {
            StatConfig.setQQ(this.f30026b, this.f30025a.getAccount());
            StatServiceImpl.m18290b(this.f30026b, this.f30025a, this.f30027c);
        }
    }
}
