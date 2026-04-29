package com.xiaomi.onetrack.util;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: com.xiaomi.onetrack.util.z */
/* JADX INFO: loaded from: classes3.dex */
public class C5814z {

    /* JADX INFO: renamed from: a */
    public static final String f32495a = "\\.";

    /* JADX INFO: renamed from: b */
    public static final String f32496b = ",";

    /* JADX INFO: renamed from: c */
    private static final String f32497c = "com.xiaomi.onetrack.util.z";

    /* JADX INFO: renamed from: a */
    public static boolean m20420a(String str) {
        if (str == null) {
            return false;
        }
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isDigit(str.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public static boolean m20421b(String str) {
        return (str == null || str.length() == 0 || str.equals("") || str.equals("null")) ? false : true;
    }

    /* JADX INFO: renamed from: a */
    public static List<String> m20418a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            String[] strArrSplit = str.split(str2);
            if (strArrSplit == null || strArrSplit.length <= 0) {
                return null;
            }
            return Arrays.asList(strArrSplit);
        } catch (Exception e2) {
            C5804p.m20347b(f32497c, "StringToList error: " + e2.getMessage());
            return null;
        }
    }

    /* JADX INFO: renamed from: a */
    public static Set<String> m20419a(String str, String str2, String str3) {
        HashSet hashSet = new HashSet();
        try {
            String[] strArrSplit = null;
            String[] strArrSplit2 = TextUtils.isEmpty(str) ? null : str.split(str3);
            if (strArrSplit2 != null && strArrSplit2.length > 0) {
                hashSet.addAll(Arrays.asList(strArrSplit2));
            }
            if (!TextUtils.isEmpty(str2)) {
                strArrSplit = str2.split(str3);
            }
            if (strArrSplit != null && strArrSplit.length > 0) {
                hashSet.addAll(Arrays.asList(strArrSplit));
            }
        } catch (Exception e2) {
            C5804p.m20347b(f32497c, "mergeParams error: " + e2.getMessage());
        }
        return hashSet;
    }
}
