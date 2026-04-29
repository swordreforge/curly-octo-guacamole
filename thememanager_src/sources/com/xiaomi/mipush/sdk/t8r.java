package com.xiaomi.mipush.sdk;

import android.content.Context;
import com.xiaomi.push.erbd;
import com.xiaomi.push.kq;
import com.xiaomi.push.wwp;

/* JADX INFO: loaded from: classes3.dex */
public class t8r {
    /* JADX INFO: renamed from: k */
    public static void m19555k(Context context, String str) {
        erbd erbdVar = new erbd();
        erbdVar.m20799c(kq.VRUpload.f33227a);
        erbdVar.m20795b(C5656l.m19500q(context).m19505n());
        erbdVar.m20803d(context.getPackageName());
        erbdVar.m20790a("data", str);
        erbdVar.m20782a(com.xiaomi.push.service.gvn7.m21617k());
        d3.m19429y(context).ni7(erbdVar, wwp.Notification, null);
    }
}
