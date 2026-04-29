package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.event.C5404d;
import com.tencent.wxop.stat.event.C5408h;

/* JADX INFO: renamed from: com.tencent.wxop.stat.q */
/* JADX INFO: loaded from: classes3.dex */
final class RunnableC5423q implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30238a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Throwable f30239b;

    RunnableC5423q(Context context, Throwable th) {
        this.f30238a = context;
        this.f30239b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (StatConfig.isEnableStatService()) {
                Context context = this.f30238a;
                new aq(new C5404d(context, StatServiceImpl.m18279a(context, false, (StatSpecifyReportedInfo) null), 99, this.f30239b, C5408h.f30206a)).m18332a();
            }
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18375e("reportSdkSelfException error: " + th);
        }
    }
}
