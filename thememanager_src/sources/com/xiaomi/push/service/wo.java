package com.xiaomi.push.service;

import com.xiaomi.push.erbd;
import com.xiaomi.push.nc;
import com.xiaomi.push.wu;

/* JADX INFO: loaded from: classes3.dex */
public class wo {

    /* JADX INFO: renamed from: k */
    private static toq f33924k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static InterfaceC5942k f73675toq;

    /* JADX INFO: renamed from: com.xiaomi.push.service.wo$k */
    public interface InterfaceC5942k {
        /* JADX INFO: renamed from: k */
        boolean m21780k(erbd erbdVar);
    }

    public interface toq {
    }

    /* JADX INFO: renamed from: k */
    public static void m21779k(toq toqVar) {
        f33924k = toqVar;
    }

    public static boolean toq(erbd erbdVar) {
        if (f73675toq == null || erbdVar == null) {
            com.xiaomi.channel.commonutils.logger.zy.kja0("rc params is null, not cpra");
            return false;
        }
        if (nc.m21313p(wu.toq())) {
            return f73675toq.m21780k(erbdVar);
        }
        com.xiaomi.channel.commonutils.logger.zy.kja0("rc app not permission to cpra");
        return false;
    }
}
