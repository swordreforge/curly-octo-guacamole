package com.android.thememanager.basemodule.resource;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.SystemClock;
import android.os.storage.StorageManager;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.util.Log;
import androidx.preference.ki;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.cdj;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.settings.C2687z;
import ek5k.C6002g;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import miui.app.constants.ResourceBrowserConstants;
import zy.hyr;

/* JADX INFO: compiled from: StorageMigration.java */
/* JADX INFO: loaded from: classes.dex */
@hyr(29)
public class qrj {

    /* JADX INFO: renamed from: k */
    private static final String f10238k = "StorageMigration";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static String f57696toq = "isDoneMigration";

    private static boolean cdj() {
        String str = ResourceBrowserConstants.MIUI_PATH + ".theme_migrate_back";
        if (new File(str).exists()) {
            return false;
        }
        m6958h();
        C1821p.m7191y(str);
        return true;
    }

    private static boolean f7l8(StorageManager sm, File file) {
        try {
            StructStat structStatLstat = Os.lstat(file.getPath());
            if (structStatLstat.st_uid == y9n.fu4() || structStatLstat.st_uid != 9801) {
                return false;
            }
            Log.i(f10238k, "uid not match. real:" + structStatLstat.st_uid + ", need:" + y9n.fu4() + ", path=" + file);
            cdj.kja0(sm, file.getParentFile());
            StructStat structStatLstat2 = Os.lstat(file.getPath());
            StringBuilder sb = new StringBuilder();
            sb.append("after fixed uid= ");
            sb.append(structStatLstat2.st_uid);
            Log.i(f10238k, sb.toString());
            return true;
        } catch (ErrnoException e2) {
            Log.i(f10238k, "can not access " + e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: g */
    private static void m6957g(File file) {
        try {
            C1821p.cdj(file.getPath());
        } catch (Exception e2) {
            Log.i(f10238k, "deleteFile fail." + e2);
        }
    }

    /* JADX INFO: renamed from: h */
    private static boolean m6958h() {
        int[] iArr = {0};
        File file = new File(ResourceBrowserConstants.MIUI_PATH);
        String[] strArr = {".ringtone", ".config"};
        String str = C1788k.f10175k;
        for (int i2 = 0; i2 < 2; i2++) {
            String str2 = strArr[i2];
            File file2 = new File(str, str2);
            File file3 = new File(file, str2);
            if (file2.exists()) {
                m6962q(file2, file3, iArr);
            }
        }
        return iArr[0] > 0;
    }

    public static boolean ki() {
        if (Build.VERSION.SDK_INT != 31 || miuix.os.f7l8.zy("ro.product.first_api_level", 0) >= 31) {
            return false;
        }
        Context qVar = bf2.toq.toq();
        SharedPreferences sharedPreferencesM4689q = ki.m4689q(qVar);
        if (sharedPreferencesM4689q.getBoolean("RS.fixupAppDataDone", false)) {
            return false;
        }
        StorageManager storageManager = (StorageManager) qVar.getSystemService(StorageManager.class);
        File externalFilesDir = qVar.getExternalFilesDir(null);
        File parentFile = externalFilesDir != null ? externalFilesDir.getParentFile() : null;
        boolean zZy = parentFile != null ? zy(storageManager, parentFile) : false;
        sharedPreferencesM4689q.edit().putBoolean("RS.fixupAppDataDone", true).apply();
        return zZy;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static boolean kja0(java.io.File r10, java.io.File r11, int[] r12) {
        /*
            r0 = 0
            r1 = 1
            java.lang.String r2 = r11.getPath()     // Catch: java.io.IOException -> L20
            com.android.thememanager.basemodule.utils.C1821p.m7190s(r2)     // Catch: java.io.IOException -> L20
            java.nio.file.Path r2 = r10.toPath()     // Catch: java.io.IOException -> L20
            java.nio.file.Path r3 = r11.toPath()     // Catch: java.io.IOException -> L20
            java.nio.file.CopyOption[] r4 = new java.nio.file.CopyOption[r1]     // Catch: java.io.IOException -> L20
            java.nio.file.StandardCopyOption r5 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.io.IOException -> L20
            r4[r0] = r5     // Catch: java.io.IOException -> L20
            java.nio.file.Files.move(r2, r3, r4)     // Catch: java.io.IOException -> L20
            r2 = r12[r0]     // Catch: java.io.IOException -> L20
            int r2 = r2 + r1
            r12[r0] = r2     // Catch: java.io.IOException -> L20
            return r1
        L20:
            java.lang.String[] r2 = r10.list()
            if (r2 == 0) goto L9d
            int r3 = r2.length
            if (r3 >= r1) goto L2b
            goto L9d
        L2b:
            int r3 = r2.length
            r4 = r0
            r5 = r1
        L2e:
            if (r4 >= r3) goto L96
            r6 = r2[r4]
            java.io.File r7 = new java.io.File
            r7.<init>(r10, r6)
            boolean r8 = r7.isDirectory()
            if (r8 == 0) goto L4e
            java.io.File r5 = new java.io.File
            r5.<init>(r10, r6)
            java.io.File r7 = new java.io.File
            r7.<init>(r11, r6)
            boolean r5 = kja0(r5, r7, r12)
            if (r5 != 0) goto L93
            goto L96
        L4e:
            boolean r8 = r7.isFile()
            if (r8 == 0) goto L93
            java.io.File r8 = new java.io.File
            r8.<init>(r11, r6)
            java.lang.String r6 = r8.getPath()
            com.android.thememanager.basemodule.utils.C1821p.m7191y(r6)
            java.nio.file.Path r6 = r7.toPath()     // Catch: java.io.IOException -> L77
            java.nio.file.Path r7 = r8.toPath()     // Catch: java.io.IOException -> L77
            java.nio.file.CopyOption[] r8 = new java.nio.file.CopyOption[r1]     // Catch: java.io.IOException -> L77
            java.nio.file.StandardCopyOption r9 = java.nio.file.StandardCopyOption.REPLACE_EXISTING     // Catch: java.io.IOException -> L77
            r8[r0] = r9     // Catch: java.io.IOException -> L77
            java.nio.file.Files.move(r6, r7, r8)     // Catch: java.io.IOException -> L77
            r6 = r12[r0]     // Catch: java.io.IOException -> L77
            int r6 = r6 + r1
            r12[r0] = r6     // Catch: java.io.IOException -> L77
            goto L93
        L77:
            r11 = move-exception
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r1 = " Fail move file , "
            r12.append(r1)
            java.lang.String r11 = r11.toString()
            r12.append(r11)
            java.lang.String r11 = r12.toString()
            java.lang.String r12 = "StorageMigration"
            android.util.Log.w(r12, r11)
            goto L97
        L93:
            int r4 = r4 + 1
            goto L2e
        L96:
            r0 = r5
        L97:
            if (r0 == 0) goto L9c
            m6957g(r10)
        L9c:
            return r0
        L9d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.basemodule.resource.qrj.kja0(java.io.File, java.io.File, int[]):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void ld6(File file, File file2, Runnable runnable) {
        boolean zX2 = (file.exists() || m6963s(file2)) ? x2(file2, file) : false;
        if (C1796y.m6977s()) {
            Log.i(f10238k, "PluginInStorage migrate result(some change?): " + qrj());
        }
        if (zX2) {
            SystemClock.sleep(1000L);
            C6002g.fn3e(runnable);
        }
    }

    /* JADX INFO: renamed from: n */
    private static boolean m6960n(File from, File to, int[] moveCount) {
        String[] list = from.list();
        if (list == null || list.length < 1) {
            return true;
        }
        for (String str : list) {
            File file = new File(from, str);
            if (!file.isDirectory()) {
                if (file.isFile()) {
                    File file2 = new File(to, str);
                    C1821p.m7191y(file2.getPath());
                    try {
                        Files.copy(file.toPath(), file2.toPath(), StandardCopyOption.REPLACE_EXISTING);
                        moveCount[0] = moveCount[0] + 1;
                        Log.d(f10238k, String.format("copy success. %s -> %s", file, to));
                    } catch (IOException e2) {
                        Log.w(f10238k, " Fail copyDir file , " + e2.toString());
                    }
                } else {
                    continue;
                }
            } else {
                if (!m6962q(new File(from, str), new File(to, str), moveCount)) {
                    break;
                }
            }
        }
        return moveCount[0] > 0;
    }

    @zy.y9n
    public static synchronized void n7h(final Runnable killSelfRunnable) {
        Log.i(f10238k, "fixupAppDataDir, some changed: " + ki());
        SharedPreferences sharedPreferencesM4689q = ki.m4689q(bf2.toq.toq());
        String str = ResourceBrowserConstants.MIUI_PATH + ".theme_migrate";
        if (!new File(str).exists() && !sharedPreferencesM4689q.getBoolean(f57696toq, false)) {
            C1821p.m7191y(str);
            final File file = new File(ResourceBrowserConstants.MIUI_PATH);
            final File file2 = new File(file, "theme");
            boolean zExists = file2.exists();
            boolean zM6963s = m6963s(file);
            boolean zM6977s = C1796y.m6977s();
            if (zExists || zM6963s || zM6977s) {
                Log.d(f10238k, "migrationIfNeed run migration task");
                C6002g.ld6().execute(new Runnable() { // from class: com.android.thememanager.basemodule.resource.ld6
                    @Override // java.lang.Runnable
                    public final void run() {
                        qrj.ld6(file2, file, killSelfRunnable);
                    }
                });
            } else {
                Log.i(f10238k, "no migrate.  no MiuiThemeFolder ,no HideThemeFolder");
            }
            return;
        }
        cdj();
        C1821p.m7191y(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static /* synthetic */ Boolean m6961p(File file, File file2) throws Exception {
        String[] list = file.list();
        if (list == null || list.length == 0) {
            Log.i(f10238k, "empty:  MIUI/theme");
            m6957g(file);
            if (!m6963s(file2)) {
                return Boolean.FALSE;
            }
        }
        Log.i(f10238k, "start migration, " + file2);
        int[] iArr = {0};
        List listAsList = Arrays.asList(".download", ".cache");
        String str = C1788k.f10175k + "theme";
        if (list != null) {
            boolean z2 = true;
            for (String str2 : list) {
                if (!listAsList.contains(str2)) {
                    File file3 = new File(file, str2);
                    if (file3.exists()) {
                        z2 = z2 && kja0(file3, new File(str, str2), iArr);
                    }
                }
            }
            if (z2) {
                Log.i(f10238k, "migrate MIUI/theme success, delete it.");
                m6957g(file);
            }
        }
        String[] strArr = {".ringtone", ".config"};
        String str3 = C1788k.f10175k;
        for (int i2 = 0; i2 < 2; i2++) {
            String str4 = strArr[i2];
            File file4 = new File(file2, str4);
            if (file4.exists()) {
                m6962q(file4, new File(str3, str4), iArr);
            }
        }
        String[] strArr2 = {".wallpaper", ".videowallpaper", ".loopwallpaper", C2687z.f15942q};
        for (int i3 = 0; i3 < 4; i3++) {
            String str5 = strArr2[i3];
            File file5 = new File(file2, str5);
            if (file5.exists()) {
                kja0(file5, new File(str3, str5), iArr);
            }
        }
        String[] list2 = file.list();
        if (list2 != null && list2.length > 0) {
            Log.i(f10238k, "after dir ," + com.android.thememanager.basemodule.utils.hyr.zy(",", Arrays.asList(list2)));
        }
        File file6 = new File(file2, ".cache");
        if (file6.exists()) {
            m6957g(file6);
        }
        Log.i(f10238k, " migration complete!. " + iArr[0]);
        return Boolean.valueOf(iArr[0] > 0);
    }

    /* JADX INFO: renamed from: q */
    private static boolean m6962q(File from, File to, int[] moveCount) {
        try {
            if (from.exists()) {
                C1821p.m7190s(to.getPath());
                if (from.isDirectory()) {
                    m6960n(from, to, moveCount);
                } else {
                    Files.copy(from.toPath(), to.toPath(), StandardCopyOption.REPLACE_EXISTING);
                    moveCount[0] = moveCount[0] + 1;
                }
                Log.d(f10238k, String.format("copy success. %s -> %s", from, to));
            }
            return moveCount[0] > 0;
        } catch (Exception e2) {
            Log.d(f10238k, String.format("Fail copy, %s->%s" + e2.toString(), from.toString(), to.toString()));
            return false;
        }
    }

    private static boolean qrj() {
        String strZy = C1796y.zy();
        if (strZy == null) {
            return false;
        }
        File file = new File(strZy);
        if (file.exists()) {
            File file2 = new File(file, "theme");
            if (file2.exists()) {
                try {
                    return m6964y(file, file2).call().booleanValue();
                } catch (Exception unused) {
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: s */
    private static boolean m6963s(File miuiPath) {
        if (miuiPath != null && miuiPath.exists()) {
            String[] strArr = {".wallpaper", ".ringtone", ".videowallpaper", ".loopwallpaper", C2687z.f15942q, ".config"};
            for (int i2 = 0; i2 < 6; i2++) {
                if (new File(miuiPath, strArr[i2]).exists()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean x2(File miuiPath, File miuiTheme) {
        try {
            return m6964y(miuiPath, miuiTheme).call().booleanValue();
        } catch (Exception e2) {
            Log.w(f10238k, "runnable.call error: " + e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    private static Callable<Boolean> m6964y(final File miuiPath, final File miuiTheme) {
        return new Callable() { // from class: com.android.thememanager.basemodule.resource.x2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return qrj.m6961p(miuiTheme, miuiPath);
            }
        };
    }

    private static boolean zy(StorageManager sm, File dir) {
        File[] fileArrListFiles = dir.listFiles();
        if (fileArrListFiles == null) {
            return false;
        }
        boolean z2 = false;
        for (File file : fileArrListFiles) {
            boolean z3 = true;
            z2 = f7l8(sm, file) || z2;
            if (file.isDirectory()) {
                if (!zy(sm, file) && !z2) {
                    z3 = false;
                }
                z2 = z3;
            }
        }
        return z2;
    }
}
