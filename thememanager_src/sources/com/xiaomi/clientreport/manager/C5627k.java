package com.xiaomi.clientreport.manager;

import android.content.Context;
import android.os.Process;
import com.xiaomi.clientreport.data.C5623k;
import com.xiaomi.clientreport.processor.C5636q;
import com.xiaomi.clientreport.processor.InterfaceC5634k;
import com.xiaomi.push.uf;

/* JADX INFO: renamed from: com.xiaomi.clientreport.manager.k */
/* JADX INFO: loaded from: classes3.dex */
public class C5627k {
    /* JADX INFO: renamed from: g */
    public static void m19321g(Context context, C5623k c5623k) {
        if (c5623k == null) {
            return;
        }
        toq.m19328n(context).m19330h(c5623k.f7l8(), c5623k.m19307y(), c5623k.zy(), c5623k.m19305n());
    }

    /* JADX INFO: renamed from: k */
    public static void m19322k(Context context) {
        zy(context, C5623k.m19303k(context), new com.xiaomi.clientreport.processor.zy(context), new C5636q(context));
    }

    /* JADX INFO: renamed from: n */
    public static void m19323n(Context context, com.xiaomi.clientreport.data.zy zyVar) {
        if (zyVar != null) {
            toq.m19328n(context).m19331p(zyVar);
        }
    }

    /* JADX INFO: renamed from: q */
    public static void m19324q(Context context, com.xiaomi.clientreport.data.toq toqVar) {
        if (toqVar != null) {
            toq.m19328n(context).m19333s(toqVar);
        }
    }

    public static void toq(Context context, C5623k c5623k) {
        zy(context, c5623k, new com.xiaomi.clientreport.processor.zy(context), new C5636q(context));
    }

    public static void zy(Context context, C5623k c5623k, InterfaceC5634k interfaceC5634k, com.xiaomi.clientreport.processor.toq toqVar) {
        com.xiaomi.channel.commonutils.logger.zy.m19300t("init in  pid :" + Process.myPid() + " threadId: " + Thread.currentThread().getId());
        toq.m19328n(context).m19334y(c5623k, interfaceC5634k, toqVar);
        if (uf.ld6(context)) {
            com.xiaomi.channel.commonutils.logger.zy.m19300t("init in process\u3000start scheduleJob");
            toq.m19328n(context).f7l8();
        }
    }
}
