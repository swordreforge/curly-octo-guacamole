package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.erbd;
import com.xiaomi.push.kq;
import com.xiaomi.push.m28;
import com.xiaomi.push.nc;
import com.xiaomi.push.wwp;
import java.util.HashMap;

/* JADX INFO: renamed from: com.xiaomi.mipush.sdk.m */
/* JADX INFO: loaded from: classes3.dex */
public class C5657m {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static volatile C5657m f73161toq;

    /* JADX INFO: renamed from: k */
    private final Context f31402k;

    private C5657m(Context context) {
        this.f31402k = context.getApplicationContext();
    }

    public static void f7l8(Context context, m28 m28Var, boolean z2) {
        m19519k(context).m19521q(m28Var, 4, z2);
    }

    /* JADX INFO: renamed from: g */
    public static void m19518g(Context context, m28 m28Var, boolean z2) {
        m19519k(context).m19521q(m28Var, 3, z2);
    }

    /* JADX INFO: renamed from: k */
    private static C5657m m19519k(Context context) {
        if (f73161toq == null) {
            synchronized (C5657m.class) {
                if (f73161toq == null) {
                    f73161toq = new C5657m(context);
                }
            }
        }
        return f73161toq;
    }

    /* JADX INFO: renamed from: n */
    public static void m19520n(Context context, m28 m28Var, boolean z2) {
        m19519k(context).m19521q(m28Var, 2, z2);
    }

    /* JADX INFO: renamed from: q */
    private void m19521q(m28 m28Var, int i2, boolean z2) {
        if (nc.m21313p(this.f31402k) || !nc.m21315s() || m28Var == null || m28Var.f33388a != wwp.SendMessage || m28Var.m21235a() == null || !z2) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("click to start activity result:" + String.valueOf(i2));
        erbd erbdVar = new erbd(m28Var.m21235a().m20906a(), false);
        erbdVar.m20799c(kq.SDK_START_ACTIVITY.f33227a);
        erbdVar.m20795b(m28Var.m21243a());
        erbdVar.m20803d(m28Var.f33393b);
        HashMap map = new HashMap();
        erbdVar.f32866a = map;
        map.put("result", String.valueOf(i2));
        d3.m19429y(this.f31402k).jk(erbdVar, wwp.Notification, false, false, null, true, m28Var.f33393b, m28Var.f33389a, true, false);
    }

    public static void toq(Context context, m28 m28Var) {
        m19519k(context).m19521q(m28Var, 0, true);
    }

    /* JADX INFO: renamed from: y */
    public static void m19522y(Context context, m28 m28Var, boolean z2) {
        C5656l c5656lM19500q = C5656l.m19500q(context);
        if (TextUtils.isEmpty(c5656lM19500q.m19503i()) || TextUtils.isEmpty(c5656lM19500q.ni7())) {
            m19519k(context).m19521q(m28Var, 6, z2);
        } else if (c5656lM19500q.m19508t()) {
            m19519k(context).m19521q(m28Var, 7, z2);
        } else {
            m19519k(context).m19521q(m28Var, 5, z2);
        }
    }

    public static void zy(Context context, m28 m28Var, boolean z2) {
        m19519k(context).m19521q(m28Var, 1, z2);
    }
}
