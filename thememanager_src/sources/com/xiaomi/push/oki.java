package com.xiaomi.push;

import android.content.Context;
import com.xiaomi.push.service.XMJobService;

/* JADX INFO: loaded from: classes3.dex */
public final class oki {

    /* JADX INFO: renamed from: k */
    private static InterfaceC5887k f33498k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73517toq = XMJobService.class.getCanonicalName();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static int f73518zy = 0;

    /* JADX INFO: renamed from: com.xiaomi.push.oki$k */
    interface InterfaceC5887k {
        /* JADX INFO: renamed from: a */
        void mo21269a();

        /* JADX INFO: renamed from: a */
        void mo21270a(boolean z2);

        /* JADX INFO: renamed from: a */
        boolean mo21271a();
    }

    /* JADX INFO: renamed from: k */
    public static synchronized void m21367k() {
        if (f33498k == null) {
            return;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("[Alarm] stop alarm.");
        f33498k.mo21269a();
    }

    /* JADX INFO: renamed from: n */
    public static synchronized boolean m21368n() {
        InterfaceC5887k interfaceC5887k = f33498k;
        if (interfaceC5887k == null) {
            return false;
        }
        return interfaceC5887k.mo21271a();
    }

    /* JADX INFO: renamed from: q */
    public static synchronized void m21369q(boolean z2) {
        if (f33498k == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("timer is not initialized");
            return;
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("[Alarm] register alarm. (" + z2 + ")");
        f33498k.mo21270a(z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007a A[EDGE_INSN: B:48:0x007a->B:29:0x007a BREAK  A[LOOP:0: B:10:0x0030->B:26:0x0074], SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void toq(android.content.Context r9) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.oki.toq(android.content.Context):void");
    }

    public static synchronized void zy(Context context, int i2) {
        int i3 = f73518zy;
        if (!"com.xiaomi.xmsf".equals(context.getPackageName())) {
            if (i2 == 2) {
                f73518zy = 2;
            } else {
                f73518zy = 0;
            }
        }
        int i4 = f73518zy;
        if (i3 != i4 && i4 == 2) {
            m21367k();
            f33498k = new cnbm(context);
        }
    }
}
