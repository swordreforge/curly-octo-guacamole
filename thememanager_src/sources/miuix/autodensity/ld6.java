package miuix.autodensity;

import android.os.Build;
import java.io.File;

/* JADX INFO: compiled from: RootUtil.java */
/* JADX INFO: loaded from: classes3.dex */
public class ld6 {

    /* JADX INFO: renamed from: k */
    private static boolean f39749k = m25504k();

    /* JADX INFO: renamed from: k */
    private static boolean m25504k() {
        String str = Build.TAGS;
        boolean z2 = true;
        boolean z3 = str != null && str.contains("test-keys");
        if (z3) {
            z2 = z3;
        } else {
            String[] strArr = {"/system/bin/su", "/system/xbin/su"};
            for (int i2 = 0; i2 < 2; i2++) {
                if (new File(strArr[i2]).exists()) {
                    break;
                }
            }
            z2 = z3;
        }
        if (z2) {
            zy.m25521q("Current device is rooted");
        }
        return z2;
    }

    public static boolean toq() {
        return f39749k;
    }
}
