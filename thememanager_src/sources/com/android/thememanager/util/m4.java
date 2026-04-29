package com.android.thememanager.util;

import android.util.Log;
import com.android.thememanager.basemodule.utils.C1831y;
import ek5k.C6002g;
import java.util.Map;

/* JADX INFO: compiled from: ThemeWallpaperDataHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class m4 {

    /* JADX INFO: renamed from: k */
    private static final String f16627k = "ThemeWallpaperDataHelper";

    /* JADX INFO: renamed from: q */
    private static Map<String, String> f16628q = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61342toq = "user_wallpaper_gallery_data.properties";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f61343zy = com.android.thememanager.basemodule.utils.vyq.f10426q + f61342toq;

    /* JADX INFO: compiled from: ThemeWallpaperDataHelper.java */
    private static class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        Map<String, String> f16629k;

        @Override // java.lang.Runnable
        public void run() {
            m4.m9865q(this.f16629k);
        }

        private toq(Map<String, String> map) {
            this.f16629k = map;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x001f A[Catch: all -> 0x0011, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0007, B:12:0x001b, B:14:0x001f, B:15:0x0026, B:11:0x0014), top: B:20:0x0003, inners: #1 }] */
    /* JADX INFO: renamed from: k */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static synchronized java.util.Map<java.lang.String, java.lang.String> m9863k() {
        /*
            java.lang.Class<com.android.thememanager.util.m4> r0 = com.android.thememanager.util.m4.class
            monitor-enter(r0)
            java.util.Map<java.lang.String, java.lang.String> r1 = com.android.thememanager.util.m4.f16628q     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
            if (r1 != 0) goto L1b
            java.lang.String r1 = com.android.thememanager.util.m4.f61343zy     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
            r2 = 1
            java.util.Map r1 = com.android.thememanager.basemodule.utils.C1831y.toq(r1, r2)     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
            com.android.thememanager.util.m4.f16628q = r1     // Catch: java.lang.Throwable -> L11 java.lang.Exception -> L13
            goto L1b
        L11:
            r1 = move-exception
            goto L2a
        L13:
            r1 = move-exception
            java.lang.String r2 = "ThemeDataHelper"
            java.lang.String r3 = "loadData: "
            android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L11
        L1b:
            java.util.Map<java.lang.String, java.lang.String> r1 = com.android.thememanager.util.m4.f16628q     // Catch: java.lang.Throwable -> L11
            if (r1 != 0) goto L26
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> L11
            r1.<init>()     // Catch: java.lang.Throwable -> L11
            com.android.thememanager.util.m4.f16628q = r1     // Catch: java.lang.Throwable -> L11
        L26:
            java.util.Map<java.lang.String, java.lang.String> r1 = com.android.thememanager.util.m4.f16628q     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)
            return r1
        L2a:
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.m4.m9863k():java.util.Map");
    }

    /* JADX INFO: renamed from: n */
    public static synchronized void m9864n(Map<String, String> map) {
        C6002g.m22240g(new toq(map));
    }

    /* JADX INFO: renamed from: q */
    public static synchronized void m9865q(Map<String, String> map) {
        Map<String, String> mapM9863k = m9863k();
        try {
            mapM9863k.putAll(map);
            C1831y.zy(mapM9863k, f61343zy);
        } catch (Exception e2) {
            Log.e("ThemeDataHelper", "saveData: ", e2);
        }
    }

    public static synchronized String toq(String key) {
        return m9863k().get(key);
    }

    public static synchronized void zy(@zy.lvui String code) {
        Map<String, String> mapM9863k = m9863k();
        try {
            mapM9863k.remove(code);
            C1831y.zy(mapM9863k, f61343zy);
        } catch (Exception e2) {
            Log.e("ThemeDataHelper", "removeData: ", e2);
        }
    }
}
