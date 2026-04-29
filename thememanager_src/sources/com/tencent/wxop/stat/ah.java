package com.tencent.wxop.stat;

import android.content.Context;
import com.tencent.wxop.stat.event.C5410j;
import com.xiaomi.mipush.sdk.C5658n;

/* JADX INFO: loaded from: classes3.dex */
final class ah implements Runnable {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ Context f30015a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ String f30016b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ StatSpecifyReportedInfo f30017c;

    ah(Context context, String str, StatSpecifyReportedInfo statSpecifyReportedInfo) {
        this.f30015a = context;
        this.f30016b = str;
        this.f30017c = statSpecifyReportedInfo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Long l2;
        try {
            StatServiceImpl.flushDataToDB(this.f30015a);
            synchronized (StatServiceImpl.f29981o) {
                l2 = (Long) StatServiceImpl.f29981o.remove(this.f30016b);
            }
            if (l2 == null) {
                StatServiceImpl.f29983q.m18375e("Starttime for PageID:" + this.f30016b + " not found, lost onResume()?");
                return;
            }
            Long lValueOf = Long.valueOf((System.currentTimeMillis() - l2.longValue()) / 1000);
            if (lValueOf.longValue() <= 0) {
                lValueOf = 1L;
            }
            Long l3 = lValueOf;
            String str = StatServiceImpl.f29980n;
            if (str != null && str.equals(this.f30016b)) {
                str = C5658n.f73185t8r;
            }
            Context context = this.f30015a;
            C5410j c5410j = new C5410j(context, str, this.f30016b, StatServiceImpl.m18279a(context, false, this.f30017c), l3, this.f30017c);
            if (!this.f30016b.equals(StatServiceImpl.f29979m)) {
                StatServiceImpl.f29983q.warn("Invalid invocation since previous onResume on diff page.");
            }
            new aq(c5410j).m18332a();
            String unused = StatServiceImpl.f29980n = this.f30016b;
        } catch (Throwable th) {
            StatServiceImpl.f29983q.m18376e(th);
            StatServiceImpl.m18285a(this.f30015a, th);
        }
    }
}
