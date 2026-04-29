package com.android.thememanager.service;

import android.app.Service;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Binder;
import android.os.IBinder;
import android.os.Process;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.util.d8wk;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.uc;
import miui.content.res.IThemeService;
import miui.content.res.IconCustomizer;
import miui.content.res.ThemeNativeUtils;
import miui.content.res.ThemeRuntimeManager;
import miuix.core.util.C7083n;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeService extends Service {

    /* JADX INFO: renamed from: q */
    private static final String f14785q = "ThemeService";

    /* JADX INFO: renamed from: k */
    private Binder f14786k = new IThemeService.Stub() { // from class: com.android.thememanager.service.ThemeService.1
        public boolean saveCustomizedIcon(String fileName, Bitmap icon) throws RemoteException {
            return ThemeService.this.m8914y(fileName, icon);
        }

        public boolean saveIcon(String srcImagePath) throws RemoteException {
            return ThemeService.this.f7l8(srcImagePath);
        }

        public boolean saveLockWallpaper(String srcImagePath) throws RemoteException {
            return ThemeService.this.m8913s(srcImagePath);
        }

        public boolean saveWallpaper(String srcImagePath) throws RemoteException {
            return ThemeService.this.m8911p(srcImagePath);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public boolean f7l8(String srcIconPath) {
        boolean qVar = false;
        if (!TextUtils.isEmpty(srcIconPath)) {
            boolean zM8910n = m8910n(srcIconPath);
            Log.i(f14785q, "saving icon remotely(" + Binder.getCallingPid() + ") for " + srcIconPath + " ALLOW: " + zM8910n);
            if (zM8910n) {
                String str = IconCustomizer.CUSTOMIZED_ICON_PATH + C7083n.m25584g(srcIconPath);
                qVar = d8wk.toq(srcIconPath, str);
                if (qVar) {
                    qVar = ThemeNativeUtils.updateFilePermissionWithThemeContext(str);
                }
                IconCustomizer.ensureMiuiVersionFlagExist(this);
            }
            d8wk.x2(srcIconPath);
        }
        return qVar;
    }

    /* JADX INFO: renamed from: g */
    private boolean m8908g() {
        int callingUid;
        PackageManager packageManager;
        try {
            callingUid = Binder.getCallingUid();
            packageManager = getPackageManager();
        } catch (Exception unused) {
        }
        return (packageManager.getApplicationInfo(packageManager.getPackagesForUid(callingUid)[0], 0).flags & 1) != 0;
    }

    /* JADX INFO: renamed from: n */
    private boolean m8910n(String srcIconPath) {
        return m8908g() && (Binder.getCallingPid() == Process.myPid() || g1.m9750n(srcIconPath));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public boolean m8911p(String srcImagePath) {
        return uc.f7l8(this, srcImagePath, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public boolean m8913s(String srcImagePath) {
        return uc.ld6(this, srcImagePath, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public boolean m8914y(String fileName, Bitmap icon) {
        return f7l8(ThemeRuntimeManager.createTempIconFile(getApplicationContext(), fileName, icon));
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f14786k;
    }
}
