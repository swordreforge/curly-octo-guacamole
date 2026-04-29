package com.xiaomi.onetrack.util;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import com.xiaomi.accountsdk.account.C5497k;
import com.xiaomi.onetrack.p017f.C5756a;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.u */
/* JADX INFO: loaded from: classes3.dex */
public class C5809u {

    /* JADX INFO: renamed from: a */
    private static final String f32450a = "PermissionUtil";

    /* JADX INFO: renamed from: b */
    private static final String f32451b = "android.permission.READ_PRIVILEGED_PHONE_STATE";

    /* JADX INFO: renamed from: c */
    private static Set<String> f32452c;

    static {
        try {
            HashSet hashSet = new HashSet();
            f32452c = hashSet;
            hashSet.add("android");
            f32452c.add("com.miui.analytics");
            f32452c.add("com.miui.cit");
            f32452c.add(C5497k.f30745i);
            f32452c.add("com.miui.securitycenter");
            f32452c.add("com.android.settings");
            f32452c.add("com.android.vending");
            f32452c.add("com.google.android.gms");
            f32452c.add("com.xiaomi.factory.mmi");
            f32452c.add("com.miui.qr");
            f32452c.add("com.android.contacts");
            f32452c.add("com.qualcomm.qti.autoregistration");
            f32452c.add("com.miui.tsmclient");
            f32452c.add("com.miui.sekeytool");
            f32452c.add("com.android.updater");
            if ("cn_chinamobile".equals(ab.m20218a("ro.miui.cust_variant")) || "cn_chinatelecom".equals(ab.m20218a("ro.miui.cust_variant"))) {
                f32452c.add("com.mobiletools.systemhelper");
                f32452c.add("com.miui.dmregservice");
            }
        } catch (Exception e2) {
            Log.e(f32450a, "static initializer: " + e2.toString());
        }
    }

    /* JADX INFO: renamed from: a */
    public static boolean m20390a(Context context) {
        return Build.VERSION.SDK_INT < 29 ? m20391a(context, "android.permission.READ_PHONE_STATE") : m20389a() ? m20392a(C5756a.m20058e()) && m20391a(context, f32451b) : m20391a(context, f32451b);
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20393b(Context context) {
        return Build.VERSION.SDK_INT < 29 ? m20391a(context, "android.permission.READ_PHONE_STATE") : m20391a(context, f32451b);
    }

    /* JADX INFO: renamed from: a */
    private static boolean m20389a() {
        try {
            if (C5805q.m20359a() && !C5805q.m20369h()) {
                return "1".equals(ab.m20218a("ro.miui.restrict_imei"));
            }
            return false;
        } catch (Exception e2) {
            C5804p.m20347b(f32450a, "isRestrictIMEI " + e2.toString());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    private static boolean m20392a(String str) {
        Set<String> set;
        return (TextUtils.isEmpty(str) || (set = f32452c) == null || !set.contains(str)) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    private static boolean m20391a(Context context, String str) {
        return context.checkPermission(str, Process.myPid(), Process.myUid()) == 0;
    }
}
