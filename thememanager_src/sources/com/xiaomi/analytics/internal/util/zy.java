package com.xiaomi.analytics.internal.util;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: ApkTools.java */
/* JADX INFO: loaded from: classes3.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    private static final String f31219k = "ApkTools";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f73067toq = "armeabi";

    /* JADX INFO: renamed from: g */
    private static int m19262g(List<String> list, String str) {
        for (int i2 = 0; list != null && i2 < list.size(); i2++) {
            if (!TextUtils.isEmpty(str) && str.equalsIgnoreCase(list.get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0145 A[Catch: Exception -> 0x0149, TRY_ENTER, TRY_LEAVE, TryCatch #4 {Exception -> 0x0149, blocks: (B:62:0x0131, B:70:0x0145), top: B:84:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0154 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void m19263k(android.content.Context r12, java.lang.String r13, java.lang.String r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 353
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.xiaomi.analytics.internal.util.zy.m19263k(android.content.Context, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: renamed from: n */
    private static String m19264n(String str) {
        String[] strArrSplit;
        return (str == null || (strArrSplit = str.split("/")) == null || strArrSplit.length <= 0) ? str : strArrSplit[strArrSplit.length - 1];
    }

    /* JADX INFO: renamed from: q */
    private static String m19265q(String str) {
        String[] strArrSplit;
        return (str == null || (strArrSplit = str.split("/")) == null || strArrSplit.length <= 1) ? f73067toq : strArrSplit[strArrSplit.length - 2];
    }

    private static List<String> toq(Context context) {
        ArrayList arrayList = new ArrayList();
        String strZy = zy(context);
        if (!TextUtils.isEmpty(strZy)) {
            arrayList.add(strZy);
        }
        String qVar = x2.toq("ro.product.cpu.abi", "");
        if (!TextUtils.isEmpty(qVar)) {
            arrayList.add(qVar);
        }
        String qVar2 = x2.toq("ro.product.cpu.abi2", "");
        if (!TextUtils.isEmpty(qVar2)) {
            arrayList.add(qVar2);
        }
        String qVar3 = x2.toq("ro.product.cpu.abilist", "");
        if (!TextUtils.isEmpty(qVar3)) {
            String[] strArrSplit = qVar3.split(",");
            for (int i2 = 0; strArrSplit != null && i2 < strArrSplit.length; i2++) {
                if (!TextUtils.isEmpty(strArrSplit[i2])) {
                    arrayList.add(strArrSplit[i2]);
                }
            }
        }
        arrayList.add(f73067toq);
        return arrayList;
    }

    private static String zy(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            Field declaredField = Class.forName("android.content.pm.ApplicationInfo").getDeclaredField("primaryCpuAbi");
            declaredField.setAccessible(true);
            return (String) declaredField.get(applicationInfo);
        } catch (Throwable unused) {
            return null;
        }
    }
}
