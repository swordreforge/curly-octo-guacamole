package com.xiaomi.push;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ek5k {
    public static boolean f7l8(Context context, String str) {
        File file = new File(str);
        long jM19306q = com.xiaomi.clientreport.manager.toq.m19328n(context).zy().m19306q();
        if (file.exists()) {
            try {
                if (file.length() > jM19306q) {
                    return false;
                }
            } catch (Exception e2) {
                com.xiaomi.channel.commonutils.logger.zy.t8r(e2);
                return false;
            }
        } else {
            f26p.m20828g(file);
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m20773g(Context context) {
        try {
            return context.getApplicationContext().getPackageManager().getPackageInfo("com.xiaomi.xmsf", 0).versionCode >= 108;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* JADX INFO: renamed from: k */
    public static String m20774k() {
        return Build.VERSION.RELEASE + C5658n.f73185t8r + Build.VERSION.INCREMENTAL;
    }

    /* JADX INFO: renamed from: n */
    public static void m20775n(Context context, List<String> list) {
        if (list == null || list.size() <= 0 || !m20773g(context)) {
            return;
        }
        for (String str : list) {
            if (!TextUtils.isEmpty(str)) {
                zy(context, str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x012b  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m20776q(android.content.Context r11, java.lang.String r12, java.lang.String r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.push.ek5k.m20776q(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: renamed from: s */
    public static File[] m20777s(Context context, String str) {
        return new File(context.getFilesDir(), str).listFiles(new y9n());
    }

    public static String toq(Context context) {
        String strZy = C5851b.toq(context).zy("sp_client_report_status", "sp_client_report_key", "");
        if (!TextUtils.isEmpty(strZy)) {
            return strZy;
        }
        String strM21302k = n5r1.m21302k(20);
        C5851b.toq(context).m20621n("sp_client_report_status", "sp_client_report_key", strM21302k);
        return strM21302k;
    }

    @TargetApi(9)
    /* JADX INFO: renamed from: y */
    public static byte[] m20778y(String str) {
        byte[] bArrCopyOf = Arrays.copyOf(x9kr.toq(str), 16);
        bArrCopyOf[0] = 68;
        bArrCopyOf[15] = 84;
        return bArrCopyOf;
    }

    public static void zy(Context context, String str) {
        Intent intent = new Intent("com.xiaomi.xmsf.push.XMSF_UPLOAD_ACTIVE");
        intent.putExtra("pkgname", context.getPackageName());
        intent.putExtra("category", "category_client_report_data");
        intent.putExtra("name", "quality_support");
        intent.putExtra("data", str);
        context.sendBroadcast(intent, "com.xiaomi.xmsf.permission.USE_XMSF_UPLOAD");
    }
}
