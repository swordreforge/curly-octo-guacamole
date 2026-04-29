package com.android.thememanager.backup;

import android.app.WallpaperManager;
import android.content.Context;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.android.thememanager.C2739t;
import com.android.thememanager.backup.toq;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1824r;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.ncyb;
import com.android.thememanager.service.ThemeProvider;
import com.android.thememanager.util.d8wk;
import com.android.thememanager.wallpaper.C2951n;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import miui.app.backup.BackupMeta;
import miui.app.backup.FullBackupAgent;
import miui.app.constants.ResourceBrowserConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ThemeBackupAgent extends FullBackupAgent {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f57405cdj;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f57406f7l8 = "video_lock_loop";

    /* JADX INFO: renamed from: g */
    public static final String f9616g = "sensor_video_param";

    /* JADX INFO: renamed from: h */
    public static final String f9617h;

    /* JADX INFO: renamed from: i */
    public static final int f9618i = 3;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final int f57407ki = 1;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f57408kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f57409ld6;

    /* JADX INFO: renamed from: n */
    public static final String f9619n = "device";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f57410n7h = "backup_lock_wallpaper.mp4";

    /* JADX INFO: renamed from: p */
    public static final String f9620p;

    /* JADX INFO: renamed from: q */
    public static final String f9621q = "theme_backup_device_config";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f57411qrj = "backup_home_wallpaper.mp4";

    /* JADX INFO: renamed from: s */
    public static final String f9622s;

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final int f57412t8r = 2;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f57413toq = "device_type";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f57414x2;

    /* JADX INFO: renamed from: y */
    public static final String f9623y = "video_home_loop";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57415zy = "ThemeBackupAgent";

    /* JADX INFO: renamed from: k */
    private String f9624k = null;

    /* JADX INFO: renamed from: com.android.thememanager.backup.ThemeBackupAgent$k */
    @Retention(RetentionPolicy.SOURCE)
    public @interface InterfaceC1673k {
    }

    static {
        StringBuilder sb = new StringBuilder();
        String str = C1788k.f10190z;
        sb.append(str);
        sb.append("backup_home_wallpaper.jpg");
        f9622s = sb.toString();
        f9620p = str + "backup_lock_wallpaper.jpg";
        f57409ld6 = str + "backup_home_wallpaper_dark.jpg";
        f57414x2 = str + "backup_lock_wallpaper_dark.jpg";
        StringBuilder sb2 = new StringBuilder();
        String str2 = C1788k.f10167c;
        sb2.append(str2);
        sb2.append(f57411qrj);
        f57408kja0 = sb2.toString();
        f9617h = str2 + f57410n7h;
        f57405cdj = str2 + "backup_wallpaper";
    }

    public static int f7l8() {
        if (C2951n.fn3e().kja0()) {
            return 3;
        }
        return y9n.lvui() ? 2 : 1;
    }

    /* JADX INFO: renamed from: g */
    public static void m6547g() {
        String[] strArr = {f57408kja0, f9617h, f9620p, f9622s, f57405cdj, f57409ld6, f57414x2};
        for (int i2 = 0; i2 < 7; i2++) {
            d8wk.x2(strArr[i2]);
        }
    }

    /* JADX INFO: renamed from: k */
    private void m6548k(File file) {
        if (file.exists()) {
            if (!file.isDirectory()) {
                try {
                    addAttachedFile(file.getAbsolutePath());
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length < 1 || p029m.zy.m24738k(file.getName(), "rights") || p029m.zy.m24738k(file.getName(), p001b.f7l8.f53796m8)) {
                return;
            }
            for (File file2 : fileArrListFiles) {
                m6548k(file2);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private void m6549n() {
        m6547g();
        Context qVar = bf2.toq.toq();
        if (qVar == null) {
            Log.w(f57415zy, "backupWallpaper fail. context null");
            return;
        }
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(qVar);
        if (wallpaperManager == null) {
            Log.w(f57415zy, "backupWallpaper fail. manage null");
            return;
        }
        Log.i(f57415zy, "backupWallpapers start, isSecondApplyWallpaperWay: " + y9n.lvui());
        toq.C1682k c1682k = toq.f57418toq;
        c1682k.m6568k().zy(qVar, wallpaperManager);
        c1682k.m6568k().m6567q(qVar, wallpaperManager);
    }

    /* JADX INFO: renamed from: q */
    private void m6550q(JSONObject jsonObject) throws JSONException {
        C2951n c2951nFn3e = C2951n.fn3e();
        if (c2951nFn3e.kja0()) {
            String strM8420q = ncyb.m8420q();
            Log.w(f57415zy, "backupVideoWallpaperLoopInfo defaultWallpaperType: " + strM8420q);
            if ((c2951nFn3e.fti(true) && "video".equals(strM8420q)) || c2951nFn3e.m10486r(true)) {
                boolean qVar = ThemeProvider.toq(true);
                jsonObject.put(f57406f7l8, qVar);
                Log.w(f57415zy, "backupVideoWallpaperLoopInfo isLockLoop: " + qVar);
            }
            if ((c2951nFn3e.fti(false) && "video".equals(strM8420q)) || c2951nFn3e.m10486r(false)) {
                boolean qVar2 = ThemeProvider.toq(false);
                jsonObject.put(f9623y, qVar2);
                Log.w(f57415zy, "backupVideoWallpaperLoopInfo isHomeLoop: " + qVar2);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public static boolean m6551s() {
        return !C1807g.m7081r();
    }

    /* JADX INFO: renamed from: y */
    public static void m6552y(String componentName, String lockAuth) {
        try {
            if (m6551s()) {
                try {
                    f7l8.f57416toq.toq().m6557y(componentName, lockAuth);
                } catch (Exception e2) {
                    Log.w(f57415zy, "restoreWallpaper: Exception");
                    e2.printStackTrace();
                }
            }
        } finally {
            m6547g();
        }
    }

    private void zy(JSONObject jsonObject) throws JSONException {
        int iM8423y;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if (C2951n.fn3e().kja0() && C1807g.zurt() && C1807g.nn86()) {
            int i9 = 60;
            if ((C2951n.fn3e().fti(true) && "sensor".equals(ncyb.m8420q())) || (C2951n.fn3e().fti(false) && "sensor".equals(ncyb.m8420q()))) {
                C2739t c2739tZy = ncyb.zy();
                if (c2739tZy != null) {
                    i7 = c2739tZy.f16218g;
                    i8 = c2739tZy.f16220n;
                    i5 = c2739tZy.f16219k;
                    i6 = c2739tZy.f61167f7l8;
                    Log.i(f57415zy, "backupDefaultSensorMessage: success");
                } else {
                    i5 = 60;
                    i6 = 10;
                    i7 = 0;
                    i8 = 0;
                }
                i2 = i8;
                i3 = i7;
                i9 = i5;
                iM8423y = i6;
            } else {
                if (!C2951n.fn3e().eqxt(true) && !C2951n.fn3e().eqxt(false)) {
                    iM8423y = 10;
                    i3 = 0;
                    i4 = 0;
                    String string = Arrays.toString(new int[]{i9, i3, i4, iM8423y});
                    jsonObject.put(f9616g, string);
                    Log.i(f57415zy, "backupSensorMessage: success" + string);
                }
                int iM8414g = ncyb.m8414g(bf2.toq.toq(), false);
                int iM8414g2 = ncyb.m8414g(bf2.toq.toq(), true);
                int iM8421s = ncyb.m8421s(bf2.toq.toq());
                iM8423y = ncyb.m8423y(bf2.toq.toq());
                Log.i(f57415zy, "backupSensorMessage: success");
                i2 = iM8414g2;
                i3 = iM8414g;
                i9 = iM8421s;
            }
            i4 = i2;
            String string2 = Arrays.toString(new int[]{i9, i3, i4, iM8423y});
            jsonObject.put(f9616g, string2);
            Log.i(f57415zy, "backupSensorMessage: success" + string2);
        }
    }

    protected int getVersion(int feature) {
        return 1;
    }

    protected int onAttachRestore(BackupMeta meta, ParcelFileDescriptor fd, String path) throws Throwable {
        FileInputStream fileInputStream;
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream2;
        if (!m6551s()) {
            return 0;
        }
        if (y9n.toq(30)) {
            String str = ResourceBrowserConstants.MIUI_PATH;
            String strT8r = this.f9624k;
            if (strT8r == null) {
                strT8r = y9n.t8r();
                this.f9624k = strT8r;
            }
            if (!path.startsWith("/")) {
                path = "/" + path;
            }
            if (path.startsWith(str)) {
                path = path.replace(str, strT8r);
            }
        }
        File file = new File(path);
        FileOutputStream fileOutputStream2 = null;
        try {
            if (file.exists()) {
                file.delete();
            }
            File parentFile = file.getParentFile();
            if (!parentFile.exists()) {
                parentFile.mkdirs();
            }
            file.createNewFile();
            fileOutputStream = new FileOutputStream(file);
            try {
                fileInputStream2 = new FileInputStream(fd.getFileDescriptor());
            } catch (Exception e2) {
                e = e2;
                fileInputStream = null;
                fileOutputStream2 = fileOutputStream;
            } catch (Throwable th) {
                th = th;
                fileInputStream = null;
                fileOutputStream2 = fileOutputStream;
            }
        } catch (Exception e3) {
            e = e3;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int i2 = fileInputStream2.read(bArr);
                if (i2 <= 0) {
                    miuix.core.util.f7l8.zy(fileOutputStream);
                    miuix.core.util.f7l8.toq(fileInputStream2);
                    return 0;
                }
                fileOutputStream.write(bArr, 0, i2);
            }
        } catch (Exception e4) {
            fileOutputStream2 = fileOutputStream;
            fileInputStream = fileInputStream2;
            e = e4;
            try {
                Log.w(f57415zy, "onAttachRestore happens error e = " + e);
                miuix.core.util.f7l8.zy(fileOutputStream2);
                miuix.core.util.f7l8.toq(fileInputStream);
                return 1;
            } catch (Throwable th3) {
                th = th3;
                miuix.core.util.f7l8.zy(fileOutputStream2);
                miuix.core.util.f7l8.toq(fileInputStream);
                throw th;
            }
        } catch (Throwable th4) {
            fileOutputStream2 = fileOutputStream;
            fileInputStream = fileInputStream2;
            th = th4;
            miuix.core.util.f7l8.zy(fileOutputStream2);
            miuix.core.util.f7l8.toq(fileInputStream);
            throw th;
        }
    }

    protected int onFullBackup(ParcelFileDescriptor data, int feature) throws IOException {
        if (!m6551s()) {
            return 0;
        }
        File[] fileArr = {new File(C1788k.am), new File(com.android.thememanager.basemodule.resource.constants.zy.f10201y), new File(C1788k.f10190z), new File(C1788k.f10182r), new File(C1788k.f10167c), new File(C1788k.f10174j)};
        toq();
        m6549n();
        for (int i2 = 0; i2 < 6; i2++) {
            m6548k(fileArr[i2]);
        }
        return 0;
    }

    public void toq() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("device", C1807g.m7073g());
            jSONObject.put(f57413toq, C1807g.n7h());
            zy(jSONObject);
            m6550q(jSONObject);
            C1824r.m7202s(f9621q).qrj("device", jSONObject.toString()).toq();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
