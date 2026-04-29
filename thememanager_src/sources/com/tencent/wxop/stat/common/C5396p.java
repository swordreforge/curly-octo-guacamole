package com.tencent.wxop.stat.common;

import java.io.File;

/* JADX INFO: renamed from: com.tencent.wxop.stat.common.p */
/* JADX INFO: loaded from: classes3.dex */
class C5396p {

    /* JADX INFO: renamed from: a */
    private static int f30171a = -1;

    /* JADX INFO: renamed from: a */
    public static boolean m18455a() {
        int i2 = f30171a;
        if (i2 == 1) {
            return true;
        }
        if (i2 == 0) {
            return false;
        }
        String[] strArr = {"/bin", "/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        for (int i3 = 0; i3 < 6; i3++) {
            try {
                if (new File(strArr[i3] + "su").exists()) {
                    f30171a = 1;
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        f30171a = 0;
        return false;
    }
}
