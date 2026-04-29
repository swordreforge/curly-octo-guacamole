package com.xiaomi.push.service.receivers;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.xiaomi.channel.commonutils.logger.zy;
import com.xiaomi.mipush.sdk.C5656l;
import com.xiaomi.mipush.sdk.C5662q;
import com.xiaomi.mipush.sdk.C5664s;
import com.xiaomi.mipush.sdk.C5668y;
import com.xiaomi.mipush.sdk.cdj;
import com.xiaomi.mipush.sdk.d3;
import com.xiaomi.mipush.sdk.dd;
import com.xiaomi.mipush.sdk.hyr;
import com.xiaomi.mipush.sdk.o1t;
import com.xiaomi.push.oc;
import com.xiaomi.push.service.C5922k;
import com.xiaomi.push.verb;
import com.xiaomi.push.z4j7;

/* JADX INFO: loaded from: classes3.dex */
public class NetworkStatusReceiver extends BroadcastReceiver {

    /* JADX INFO: renamed from: a */
    private static boolean f33890a = false;

    /* JADX INFO: renamed from: b */
    private boolean f33891b = true;

    public NetworkStatusReceiver() {
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.f33891b) {
            return;
        }
        oc.ki();
        verb.m21901n().post(new RunnableC5937k(this, context));
    }

    /* JADX INFO: renamed from: a */
    public static boolean m21750a() {
        return f33890a;
    }

    public NetworkStatusReceiver(Object obj) {
        f33890a = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a */
    public void m21748a(Context context) {
        if (!d3.m19429y(context).oc() && C5656l.m19500q(context).zurt() && !C5656l.m19500q(context).m19508t()) {
            try {
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, "com.xiaomi.push.service.XMPushService"));
                intent.setAction("com.xiaomi.push.network_status_changed");
                C5922k.zurt(context).oc(intent);
            } catch (Exception e2) {
                zy.t8r(e2);
            }
        }
        z4j7.m22071y(context);
        if (oc.zurt(context) && d3.m19429y(context).ncyb()) {
            d3.m19429y(context).n5r1();
        }
        if (oc.zurt(context)) {
            if ("syncing".equals(o1t.toq(context).zy(dd.DISABLE_PUSH))) {
                cdj.zurt(context);
            }
            if ("syncing".equals(o1t.toq(context).zy(dd.ENABLE_PUSH))) {
                cdj.ni7(context);
            }
            o1t qVar = o1t.toq(context);
            dd ddVar = dd.UPLOAD_HUAWEI_TOKEN;
            if ("syncing".equals(qVar.zy(ddVar))) {
                d3.m19429y(context).a9(null, ddVar, hyr.ASSEMBLE_PUSH_HUAWEI, "net");
            }
            if ("syncing".equals(o1t.toq(context).zy(dd.UPLOAD_FCM_TOKEN))) {
                d3.m19429y(context).a9(null, ddVar, hyr.ASSEMBLE_PUSH_HUAWEI, "net");
            }
            o1t qVar2 = o1t.toq(context);
            dd ddVar2 = dd.UPLOAD_COS_TOKEN;
            if ("syncing".equals(qVar2.zy(ddVar2))) {
                d3.m19429y(context).a9(null, ddVar2, hyr.ASSEMBLE_PUSH_COS, "net");
            }
            o1t qVar3 = o1t.toq(context);
            dd ddVar3 = dd.UPLOAD_FTOS_TOKEN;
            if ("syncing".equals(qVar3.zy(ddVar3))) {
                d3.m19429y(context).a9(null, ddVar3, hyr.ASSEMBLE_PUSH_FTOS, "net");
            }
            if (C5664s.m19550n() && C5664s.n7h(context)) {
                C5664s.m19551p(context);
                C5664s.m19554y(context);
            }
            C5662q.toq(context);
            C5668y.toq(context);
        }
    }
}
