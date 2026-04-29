package com.android.thememanager.cloudbackup;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.android.thememanager.backup.ThemeBackupAgent;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.bf2;
import com.android.thememanager.ncyb;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.util.uc;
import com.xiaomi.settingsdk.backup.InterfaceC5976k;
import com.xiaomi.settingsdk.backup.data.DataPackage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import miuix.core.util.f7l8;

/* JADX INFO: compiled from: ThemeCloudBackupImpl.java */
/* JADX INFO: loaded from: classes.dex */
public class zy implements InterfaceC5976k {

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    static final String f57871toq = "ThemeCloudBackupImpl";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57872zy = "invalid";

    /* JADX INFO: renamed from: k */
    private String f10673k = f57872zy;

    /* JADX INFO: renamed from: g */
    private void m7408g(Context context, DataPackage dataPackage) {
        if (!ncyb.n7h(true)) {
            Log.d(f57871toq, "backupHomeImageWallpaper: current lock wallpaper not Image isDefault: " + ncyb.qrj() + " defaultType: " + ncyb.m8420q());
            return;
        }
        File cacheDir = context.getCacheDir();
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        Bitmap bitmapMo7406k = toq.f10672k.m7407k().mo7406k();
        if (bitmapMo7406k == null) {
            Log.d(f57871toq, "lockWallpaperBp is null");
            return;
        }
        File file = new File(cacheDir, "tmpLockwallpaper");
        try {
            if (file.exists()) {
                file.delete();
            }
            file.createNewFile();
            if (!C2763c.m9653t(bitmapMo7406k, file.getAbsolutePath())) {
                Log.e(f57871toq, "failed to copy lockscreen file");
            } else {
                Log.i(f57871toq, "cloud backup lock wallpaper");
                dataPackage.zy(InterfaceC1789q.txyb, file);
            }
        } catch (IOException e2) {
            Log.e(f57871toq, "failed to backup lockscreen file", e2);
        }
    }

    /* JADX INFO: renamed from: n */
    private void m7409n(Context context, DataPackage dataPackage) {
        if (!ncyb.n7h(false)) {
            Log.d(f57871toq, "backupHomeImageWallpaper: current home wallpaper not Image " + ncyb.m8420q());
            return;
        }
        WallpaperManager.getInstance(context.getApplicationContext());
        Bitmap qVar = toq.f10672k.m7407k().toq();
        if (qVar == null) {
            return;
        }
        File cacheDir = context.getCacheDir();
        if (!cacheDir.exists()) {
            cacheDir.mkdirs();
        }
        File file = new File(cacheDir, "tmpwallpaper");
        if (file.exists()) {
            Log.d(f57871toq, "tmpWallpaper is null");
            file.delete();
        }
        try {
            try {
                file.createNewFile();
            } catch (FileNotFoundException e2) {
                Log.e(f57871toq, "FileNotFoundException", e2);
            } catch (IOException e3) {
                Log.e(f57871toq, "IOException when create temp wallpaper", e3);
            }
            if (!C2763c.m9653t(qVar, file.getAbsolutePath())) {
                Log.e(f57871toq, "failed to compress wallpaper bitmap");
            } else {
                Log.i(f57871toq, "cloud backup wallpaper");
                dataPackage.zy(InterfaceC1789q.u07, file);
            }
        } finally {
            qVar.recycle();
        }
    }

    /* JADX INFO: renamed from: q */
    private void m7410q(Context context, DataPackage dataPackage) {
        dataPackage.f7l8(ThemeBackupAgent.f57413toq, C1807g.n7h());
    }

    /* JADX INFO: renamed from: s */
    private void m7411s(Context context, String path, ParcelFileDescriptor data) throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        String strSubstring;
        File file;
        byte[] bArr;
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(data.getFileDescriptor());
                try {
                    strSubstring = path.substring(path.lastIndexOf(File.separator) + 1, path.length());
                    file = new File(context.getCacheDir(), "tmpRestore" + strSubstring);
                    if (file.exists()) {
                        file.delete();
                    }
                    file.createNewFile();
                    fileOutputStream = new FileOutputStream(file);
                    try {
                        bArr = new byte[1024];
                    } catch (FileNotFoundException e2) {
                        e = e2;
                        fileInputStream2 = fileInputStream;
                        Log.e(f57871toq, "FileNotFoundException in restoreFiles: " + path, e);
                        f7l8.toq(fileInputStream2);
                    } catch (IOException e3) {
                        e = e3;
                        fileInputStream2 = fileInputStream;
                        Log.e(f57871toq, "IOException in restoreFiles: " + path, e);
                        f7l8.toq(fileInputStream2);
                    } catch (Throwable th) {
                        th = th;
                        fileInputStream2 = fileInputStream;
                        f7l8.toq(fileInputStream2);
                        f7l8.zy(fileOutputStream);
                        throw th;
                    }
                } catch (FileNotFoundException e4) {
                    e = e4;
                    fileOutputStream = null;
                } catch (IOException e6) {
                    e = e6;
                    fileOutputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (FileNotFoundException e7) {
            e = e7;
            fileOutputStream = null;
        } catch (IOException e8) {
            e = e8;
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
        while (true) {
            int i2 = fileInputStream.read(bArr);
            if (i2 <= 0) {
                break;
            } else {
                fileOutputStream.write(bArr, 0, i2);
            }
            f7l8.zy(fileOutputStream);
        }
        fileOutputStream.flush();
        Log.i(f57871toq, "cloud backup, restore " + strSubstring);
        if (strSubstring.equals(bf2.f57718qrj)) {
            uc.ld6(context, file.getAbsolutePath(), null);
        } else if (strSubstring.equals("wallpaper")) {
            uc.kja0(context, file.getAbsolutePath(), null, null, false, false, false, null, null);
        }
        file.delete();
        f7l8.toq(fileInputStream);
        f7l8.zy(fileOutputStream);
    }

    /* JADX INFO: renamed from: y */
    private void m7412y(Context context, DataPackage dataPackage) throws Throwable {
        String strN7h = C1807g.n7h();
        if (f57872zy.equals(this.f10673k)) {
            this.f10673k = C1807g.f10328q;
            Log.i(f57871toq, "restoreFiles: backup Device is old, not backup deviceType  DEFAULT = DEVICE_TYPE_MI_PHONE");
        }
        if (strN7h.equals(this.f10673k)) {
            for (Map.Entry<String, ParcelFileDescriptor> entry : dataPackage.getFileItems().entrySet()) {
                m7411s(context, entry.getKey(), entry.getValue());
            }
            return;
        }
        Log.i(f57871toq, "device not match, backupDevice: " + this.f10673k + " restoreDeviceType: " + strN7h);
    }

    public void f7l8(Context context, DataPackage dataPackage) {
        if (dataPackage.ld6(ThemeBackupAgent.f57413toq) != null) {
            String str = (String) dataPackage.ld6(ThemeBackupAgent.f57413toq).getValue();
            Log.w(f57871toq, "restoreDataItems: restoreDeviceType backupDeviceTypeTmp: " + str);
            if (p029m.zy.toq(str)) {
                str = f57872zy;
            }
            this.f10673k = str;
        }
    }

    @Override // com.xiaomi.settingsdk.backup.InterfaceC5976k
    /* JADX INFO: renamed from: k */
    public void mo7413k(Context context, DataPackage dataPackage) {
        m7410q(context, dataPackage);
        m7409n(context, dataPackage);
        m7408g(context, dataPackage);
    }

    @Override // com.xiaomi.settingsdk.backup.InterfaceC5976k
    public void toq(Context context, DataPackage dataPackage, int packageVersion) throws Throwable {
        f7l8(context, dataPackage);
        m7412y(context, dataPackage);
    }

    @Override // com.xiaomi.settingsdk.backup.InterfaceC5976k
    public int zy(Context context) {
        return 1;
    }
}
