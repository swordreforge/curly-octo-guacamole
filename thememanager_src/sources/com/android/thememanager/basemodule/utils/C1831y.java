package com.android.thememanager.basemodule.utils;

import com.android.thememanager.util.d8wk;
import com.market.sdk.utils.C5012n;
import java.io.File;
import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.y */
/* JADX INFO: compiled from: DiskCacheUtil.java */
/* JADX INFO: loaded from: classes.dex */
public class C1831y {

    /* JADX INFO: renamed from: k */
    private static final String f10442k = "com.android.thememanager.basemodule.utils.y";

    /* JADX INFO: renamed from: k */
    public static Map<String, String> m7243k(@zy.lvui String runTimeDataFilePath, Map<String, String> map, boolean deleteWhenError) throws Throwable {
        FileInputStream fileInputStream;
        File file = new File(runTimeDataFilePath);
        if (map == null) {
            map = new HashMap<>();
        }
        if (!file.exists()) {
            return map;
        }
        Properties properties = new Properties();
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(file);
            } catch (Throwable th) {
                th = th;
                y9n.m7246g(fileInputStream2);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
        } catch (OutOfMemoryError e3) {
            e = e3;
        }
        try {
            properties.load(fileInputStream);
            for (String str : properties.stringPropertyNames()) {
                map.put(str, properties.getProperty(str));
            }
            y9n.m7246g(fileInputStream);
        } catch (Exception e4) {
            e = e4;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            y9n.m7246g(fileInputStream2);
        } catch (OutOfMemoryError e6) {
            e = e6;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            if (deleteWhenError) {
                String str2 = C5012n.ld6(runTimeDataFilePath) + "_" + file.getName();
                int i2 = 0;
                int iM7207q = C1824r.m7203y().m7207q(str2, 0) + 1;
                if (iM7207q >= 3) {
                    try {
                        d8wk.x2(runTimeDataFilePath);
                    } catch (Throwable th2) {
                        th2.printStackTrace();
                        i2 = iM7207q;
                        C1824r.m7203y().ld6(str2, i2).m7204k();
                        y9n.m7246g(fileInputStream2);
                        return map;
                    }
                    C1824r.m7203y().ld6(str2, i2).m7204k();
                } else {
                    i2 = iM7207q;
                    C1824r.m7203y().ld6(str2, i2).m7204k();
                }
            }
            y9n.m7246g(fileInputStream2);
        } catch (Throwable th3) {
            th = th3;
            fileInputStream2 = fileInputStream;
            y9n.m7246g(fileInputStream2);
            throw th;
        }
        return map;
    }

    public static Map<String, String> toq(@zy.lvui String runTimeDataFilePath, boolean deleteWhenError) {
        return m7243k(runTimeDataFilePath, null, deleteWhenError);
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0072 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void zy(java.util.Map<java.lang.String, java.lang.String> r4, @zy.lvui java.lang.String r5) throws java.lang.Throwable {
        /*
            java.io.File r0 = new java.io.File
            r0.<init>(r5)
            boolean r5 = r0.exists()
            if (r5 != 0) goto L28
            boolean r5 = com.android.thememanager.basemodule.utils.o1t.fu4()
            if (r5 == 0) goto L19
            java.lang.String r4 = com.android.thememanager.basemodule.utils.C1831y.f10442k
            java.lang.String r5 = "writeToDisk fail in second space"
            android.util.Log.d(r4, r5)
            return
        L19:
            java.io.File r5 = r0.getParentFile()     // Catch: java.io.IOException -> L24
            r5.mkdirs()     // Catch: java.io.IOException -> L24
            r0.createNewFile()     // Catch: java.io.IOException -> L24
            goto L28
        L24:
            r5 = move-exception
            r5.printStackTrace()
        L28:
            java.util.Properties r5 = new java.util.Properties
            r5.<init>()
            java.util.Set r1 = r4.keySet()
            java.util.Iterator r1 = r1.iterator()
        L35:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L4b
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r3 = r4.get(r2)
            java.lang.String r3 = (java.lang.String) r3
            r5.setProperty(r2, r3)
            goto L35
        L4b:
            r4 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5e
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L5a java.io.IOException -> L5e
            r5.store(r1, r4)     // Catch: java.io.IOException -> L58 java.lang.Throwable -> L6f
            r1.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L58:
            r4 = move-exception
            goto L61
        L5a:
            r5 = move-exception
            r1 = r4
            r4 = r5
            goto L70
        L5e:
            r5 = move-exception
            r1 = r4
            r4 = r5
        L61:
            r4.printStackTrace()     // Catch: java.lang.Throwable -> L6f
            if (r1 == 0) goto L6e
            r1.close()     // Catch: java.io.IOException -> L6a
            goto L6e
        L6a:
            r4 = move-exception
            r4.printStackTrace()
        L6e:
            return
        L6f:
            r4 = move-exception
        L70:
            if (r1 == 0) goto L7a
            r1.close()     // Catch: java.io.IOException -> L76
            goto L7a
        L76:
            r5 = move-exception
            r5.printStackTrace()
        L7a:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.basemodule.utils.C1831y.zy(java.util.Map, java.lang.String):void");
    }
}
