package com.market.sdk.utils;

import android.os.Build;
import android.util.Log;
import com.market.sdk.MarketManager;
import com.xiaomi.onetrack.util.C5814z;

/* JADX INFO: renamed from: com.market.sdk.utils.i */
/* JADX INFO: compiled from: VersionUtils.java */
/* JADX INFO: loaded from: classes3.dex */
public class C5009i {
    /* JADX INFO: renamed from: k */
    public static boolean m17433k(String str) {
        try {
            if (!str.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{1,2}(-internal)?")) {
                return false;
            }
            String str2 = Build.VERSION.INCREMENTAL;
            if (!str2.matches("\\d{1,2}\\.\\d{1,2}\\.\\d{1,2}(-internal)?")) {
                return false;
            }
            String strReplace = str2.replace("-internal", "");
            String strReplace2 = str.replace("-internal", "");
            String[] strArrSplit = strReplace.split(C5814z.f32495a);
            String[] strArrSplit2 = strReplace2.split(C5814z.f32495a);
            return ((Long.parseLong(strArrSplit[0]) * 10000) + (Long.parseLong(strArrSplit[1]) * 100)) + Long.parseLong(strArrSplit[2]) >= ((Long.parseLong(strArrSplit2[0]) * 10000) + (Long.parseLong(strArrSplit2[1]) * 100)) + Long.parseLong(strArrSplit2[2]);
        } catch (Throwable th) {
            Log.d(MarketManager.f27964n, th.toString());
            return false;
        }
    }

    public static boolean toq(String str) {
        try {
            if (!str.matches("V\\d{1,2}\\.\\d{1,2}\\.\\d{1,2}\\.\\d{1,2}")) {
                C5013p.toq(MarketManager.f27964n, "targetVersion: " + str);
                return false;
            }
            String str2 = Build.VERSION.INCREMENTAL;
            if (!str2.matches("V\\d{1,2}\\.\\d{1,2}\\.\\d{1,2}\\.\\d{1,2}\\..*")) {
                C5013p.toq(MarketManager.f27964n, "currVersion: " + str2);
                C5013p.toq(MarketManager.f27964n, "targetVersion: " + str);
                return false;
            }
            String[] strArrSplit = str2.split(C5814z.f32495a);
            String[] strArrSplit2 = str.split(C5814z.f32495a);
            long j2 = (Long.parseLong(strArrSplit[0].substring(1)) * 1000000) + (Long.parseLong(strArrSplit[1]) * 10000) + (Long.parseLong(strArrSplit[2]) * 100) + Long.parseLong(strArrSplit[3]);
            long j3 = (Long.parseLong(strArrSplit2[0].substring(1)) * 1000000) + (Long.parseLong(strArrSplit2[1]) * 10000) + (Long.parseLong(strArrSplit2[2]) * 100) + Long.parseLong(strArrSplit2[3]);
            C5013p.toq(MarketManager.f27964n, "currVersionValue: " + j2);
            C5013p.toq(MarketManager.f27964n, "targetVersionValue: " + j3);
            return j2 >= j3;
        } catch (Throwable th) {
            Log.d(MarketManager.f27964n, th.toString());
            return false;
        }
    }
}
