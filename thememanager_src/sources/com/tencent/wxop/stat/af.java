package com.tencent.wxop.stat;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class af implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30011a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ Map f30012b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ StatSpecifyReportedInfo f30013c;

    af(Context context, Map map, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30011a = context;
        this.f30012b = map;
        this.f30013c = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            new Thread(new ap(this.f30011a, this.f30012b, this.f30013c), "NetworkMonitorTask").start();
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30011a, th);
        }
    }
}
