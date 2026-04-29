package com.tencent.mm.opensdk.utils;

/* JADX INFO: renamed from: com.tencent.mm.opensdk.utils.d */
/* JADX INFO: loaded from: classes3.dex */
public final class C5377d {
    /* JADX INFO: renamed from: h */
    public static boolean m18261h(String str) {
        return str == null || str.length() <= 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m18262i(String str) {
        if (str != null) {
            try {
                if (str.length() > 0) {
                    return Integer.parseInt(str);
                }
            } catch (Exception unused) {
            }
        }
        return 0;
    }
}
