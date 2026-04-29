package com.android.thememanager.util;

import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import miui.os.Build;

/* JADX INFO: renamed from: com.android.thememanager.util.a */
/* JADX INFO: compiled from: ResourceDebug.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2755a {

    /* JADX INFO: renamed from: g */
    public static final String f16307g = "ThemeManagerTag";

    /* JADX INFO: renamed from: k */
    private static final String f16308k = "/data/system/theme_staging";

    /* JADX INFO: renamed from: q */
    private static final String f16310q = "/data/system/theme_region";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61194toq = "/data/system/theme_dev";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f61195zy = "/data/system/theme_onebox";

    /* JADX INFO: renamed from: n */
    public static final String f16309n = toq();

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static int f61193f7l8 = 0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.AutoCloseable] */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.lang.String] */
    /* JADX INFO: renamed from: k */
    public static String m9602k() throws Throwable {
        ?? r2;
        Throwable th;
        BufferedReader bufferedReader;
        IOException e2;
        String line;
        if (!new File(f16310q).exists()) {
            return Build.getRegion();
        }
        try {
            try {
                bufferedReader = new BufferedReader(new FileReader(f16310q));
                try {
                    line = bufferedReader.readLine();
                    com.android.thememanager.basemodule.utils.y9n.m7246g(bufferedReader);
                } catch (IOException e3) {
                    e2 = e3;
                    e2.printStackTrace();
                    com.android.thememanager.basemodule.utils.y9n.m7246g(bufferedReader);
                    line = "";
                }
            } catch (Throwable th2) {
                th = th2;
                com.android.thememanager.basemodule.utils.y9n.m7246g(r2);
                throw th;
            }
        } catch (IOException e4) {
            bufferedReader = null;
            e2 = e4;
        } catch (Throwable th3) {
            r2 = 0;
            th = th3;
            com.android.thememanager.basemodule.utils.y9n.m7246g(r2);
            throw th;
        }
        r2 = f16307g;
        Log.d(f16307g, "Fake region is " + line);
        return line;
    }

    /* JADX INFO: renamed from: n */
    public static boolean m9603n() {
        String str = Build.DEVICE;
        return "tiffany".equals(str) || "sagit".equals(str);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m9604q() {
        if (f61193f7l8 == 0) {
            f61193f7l8 = new File(f16308k).exists() || new File(f61194toq).exists() || new File(f61195zy).exists() ? 1 : 2;
        }
        return f61193f7l8 == 2;
    }

    private static String toq() {
        return "https://thm.market.xiaomi.com/thm/drm/issue";
    }

    public static int zy() {
        if (new File(f16308k).exists()) {
            return 2;
        }
        if (new File(f61194toq).exists()) {
            return 1;
        }
        return new File(f61195zy).exists() ? 3 : 0;
    }
}
