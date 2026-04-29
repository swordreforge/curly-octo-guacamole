package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.event.C5406f;

/* JADX INFO: loaded from: classes3.dex */
final class am implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ StatGameUser f30028a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Context f30029b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ StatSpecifyReportedInfo f30030c;

    am(StatGameUser statGameUser, Context context, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30028a = statGameUser;
        this.f30029b = context;
        this.f30030c = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        StatGameUser statGameUser = this.f30028a;
        if (statGameUser == null) {
            StatServiceImpl.f29983q.error("The gameUser of StatService.reportGameUser() can not be null!");
            return;
        }
        if (statGameUser.getAccount() == null || this.f30028a.getAccount().length() == 0) {
            StatServiceImpl.f29983q.error("The account of gameUser on StatService.reportGameUser() can not be null or empty!");
            return;
        }
        try {
            Context context = this.f30029b;
            new aq(new C5406f(context, StatServiceImpl.m18279a(context, false, this.f30030c), this.f30028a, this.f30030c)).m18332a();
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30029b, th);
        }
    }
}
