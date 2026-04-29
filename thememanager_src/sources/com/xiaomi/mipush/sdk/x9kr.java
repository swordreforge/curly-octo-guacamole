package com.xiaomi.mipush.sdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xiaomi.push.C5883n;
import com.xiaomi.push.C5889p;
import com.xiaomi.push.erbd;
import com.xiaomi.push.oph;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public class x9kr {
    /* JADX INFO: Access modifiers changed from: private */
    public static String f7l8(List<String> list) {
        String str = "";
        if (C5883n.m21299k(list)) {
            return "";
        }
        ArrayList<String> arrayList = new ArrayList(list);
        Collections.sort(arrayList, Collator.getInstance(Locale.CHINA));
        for (String str2 : arrayList) {
            if (!TextUtils.isEmpty(str)) {
                str = str + ",";
            }
            str = str + str2;
        }
        return str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public static String m19567g(List<String> list) {
        String qVar = com.xiaomi.push.n5r1.toq(f7l8(list));
        return (TextUtils.isEmpty(qVar) || qVar.length() <= 4) ? "" : qVar.substring(0, 4).toLowerCase();
    }

    /* JADX INFO: renamed from: q */
    public static void m19570q(Context context, boolean z2) {
        C5889p.toq(context).f7l8(new ncyb(context, z2));
    }

    public static void toq(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("mipush_extra", 0);
        long j2 = sharedPreferences.getLong("last_sync_info", -1L);
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        long jM21553k = com.xiaomi.push.service.a9.m21550q(context).m21553k(oph.SyncInfoFrequency.m21370a(), 1209600);
        if (j2 == -1) {
            sharedPreferences.edit().putLong("last_sync_info", jCurrentTimeMillis).commit();
        } else if (Math.abs(jCurrentTimeMillis - j2) > jM21553k) {
            m19570q(context, true);
            sharedPreferences.edit().putLong("last_sync_info", jCurrentTimeMillis).commit();
        }
    }

    public static void zy(Context context, erbd erbdVar) {
        com.xiaomi.channel.commonutils.logger.zy.kja0("need to update local info with: " + erbdVar.m20788a());
        String str = erbdVar.m20788a().get(C5658n.f31413y);
        if (str != null) {
            cdj.m19386c(context);
            String[] strArrSplit = str.split(C5658n.f73185t8r);
            if (strArrSplit.length == 2) {
                cdj.m19390g(context, strArrSplit[0], strArrSplit[1]);
                if ("00:00".equals(strArrSplit[0]) && "00:00".equals(strArrSplit[1])) {
                    C5656l.m19500q(context).ld6(true);
                } else {
                    C5656l.m19500q(context).ld6(false);
                }
            }
        }
        String str2 = erbdVar.m20788a().get(C5658n.f31408p);
        if (str2 != null) {
            cdj.m19388e(context);
            if (!"".equals(str2)) {
                for (String str3 : str2.split(",")) {
                    cdj.m19407y(context, str3);
                }
            }
        }
        String str4 = erbdVar.m20788a().get(C5658n.f73188x2);
        if (str4 != null) {
            cdj.nn86(context);
            if (!"".equals(str4)) {
                for (String str5 : str4.split(",")) {
                    cdj.ld6(context, str5);
                }
            }
        }
        String str6 = erbdVar.m20788a().get(C5658n.f73180n7h);
        if (str6 != null) {
            cdj.vyq(context);
            if ("".equals(str6)) {
                return;
            }
            for (String str7 : str6.split(",")) {
                cdj.f7l8(context, str7);
            }
        }
    }
}
