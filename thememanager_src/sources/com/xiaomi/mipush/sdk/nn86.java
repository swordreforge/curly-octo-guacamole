package com.xiaomi.mipush.sdk;

import com.xiaomi.push.oph;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class nn86 {

    /* JADX INFO: renamed from: k */
    private static HashMap<hyr, C5659k> f31419k = new HashMap<>();

    /* JADX INFO: renamed from: com.xiaomi.mipush.sdk.nn86$k */
    static class C5659k {

        /* JADX INFO: renamed from: k */
        public String f31420k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public String f73192toq;

        public C5659k(String str, String str2) {
            this.f31420k = str;
            this.f73192toq = str2;
        }
    }

    static {
        m19530q(hyr.ASSEMBLE_PUSH_HUAWEI, new C5659k("com.xiaomi.assemble.control.HmsPushManager", "newInstance"));
        m19530q(hyr.ASSEMBLE_PUSH_FCM, new C5659k("com.xiaomi.assemble.control.FCMPushManager", "newInstance"));
        m19530q(hyr.ASSEMBLE_PUSH_COS, new C5659k("com.xiaomi.assemble.control.COSPushManager", "newInstance"));
        m19530q(hyr.ASSEMBLE_PUSH_FTOS, new C5659k("com.xiaomi.assemble.control.FTOSPushManager", "newInstance"));
    }

    /* JADX INFO: renamed from: k */
    public static dd m19529k(hyr hyrVar) {
        int i2 = hb.f31364k[hyrVar.ordinal()];
        if (i2 == 1) {
            return dd.UPLOAD_HUAWEI_TOKEN;
        }
        if (i2 == 2) {
            return dd.UPLOAD_FCM_TOKEN;
        }
        if (i2 == 3) {
            return dd.UPLOAD_COS_TOKEN;
        }
        if (i2 != 4) {
            return null;
        }
        return dd.UPLOAD_FTOS_TOKEN;
    }

    /* JADX INFO: renamed from: q */
    private static void m19530q(hyr hyrVar, C5659k c5659k) {
        if (c5659k != null) {
            f31419k.put(hyrVar, c5659k);
        }
    }

    public static C5659k toq(hyr hyrVar) {
        return f31419k.get(hyrVar);
    }

    public static oph zy(hyr hyrVar) {
        return oph.AggregatePushSwitch;
    }
}
