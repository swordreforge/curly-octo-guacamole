package com.android.thememanager.backup;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.ncyb;
import com.android.thememanager.util.d8wk;
import com.android.thememanager.wallpaper.C2951n;
import java.io.File;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.backup.k */
/* JADX INFO: compiled from: ThemeBackupManager.kt */
/* JADX INFO: loaded from: classes.dex */
final class C1679k extends zy {
    public C1679k() {
        Log.w("ThemeBackupManager", "ThemeBackupControllerImpl init");
    }

    private final void f7l8(boolean z2) {
        int i2 = z2 ? 2 : 1;
        String str = z2 ? ThemeBackupAgent.f9617h : ThemeBackupAgent.f57408kja0;
        C1821p.m7191y(str);
        String strFu4 = C2951n.fn3e().fu4("video", i2, false, false);
        if (new File(strFu4).exists()) {
            Log.i("ThemeBackupManager", "buck up video wallpaper " + d8wk.toq(strFu4, str) + ", isLock: " + z2);
        }
    }

    /* JADX INFO: renamed from: g */
    private final void m6563g(boolean z2) {
        String str = ThemeBackupAgent.f57405cdj;
        C1821p.m7191y(str);
        int i2 = z2 ? 2 : 1;
        boolean z3 = C2951n.fn3e().fti(z2) && d2ok.f7l8("sensor", ncyb.m8420q());
        Log.i("ThemeBackupManager", "backupSensorVideoWallpaper isDefaultDeskSensor: " + z3 + " isLock: " + z2);
        Log.i("ThemeBackupManager", "backupSensorVideoWallpaper: sensor " + d8wk.toq(z3 ? ncyb.zy().f61168toq : C2951n.fn3e().fu4("sensor", i2, false, false), str));
    }

    /* JADX INFO: renamed from: n */
    private final void m6564n(Context context) throws Throwable {
        String str = ThemeBackupAgent.f9620p;
        C1821p.m7191y(str);
        Bitmap bitmapZurt = C2951n.fn3e().zurt(true, false);
        Bitmap bitmapZurt2 = C2951n.fn3e().zurt(true, true);
        if (bitmapZurt != null) {
            Log.i("ThemeBackupManager", "copy lock wallpaper T " + com.android.thememanager.v9.toq.m10205k(bitmapZurt, str));
        } else {
            Log.i("ThemeBackupManager", "copy lock wallpaper T fail");
        }
        if (bitmapZurt2 == null) {
            Log.i("ThemeBackupManager", "lockWallpaperBpDark not exist T");
            return;
        }
        Log.i("ThemeBackupManager", "copy dark lock wallpaper dark T " + com.android.thememanager.v9.toq.m10205k(bitmapZurt2, ThemeBackupAgent.f57414x2));
    }

    /* JADX INFO: renamed from: q */
    private final void m6565q(Context context, WallpaperManager wallpaperManager) throws Throwable {
        String str = ThemeBackupAgent.f9622s;
        C1821p.m7191y(str);
        Bitmap bitmapZurt = C2951n.fn3e().zurt(false, false);
        Bitmap bitmapZurt2 = C2951n.fn3e().zurt(false, true);
        if (bitmapZurt != null) {
            Log.i("ThemeBackupManager", "backup home wallpaper T: " + com.android.thememanager.v9.toq.m10205k(bitmapZurt, str));
        } else {
            Log.w("ThemeBackupManager", "backup home wallpaper fail T");
        }
        if (bitmapZurt2 == null) {
            Log.i("ThemeBackupManager", "homeWallpaperBpDark not exist T");
            return;
        }
        Log.i("ThemeBackupManager", "backup image home wallpaper dark T: " + com.android.thememanager.v9.toq.m10205k(bitmapZurt2, ThemeBackupAgent.f57409ld6));
    }

    @Override // com.android.thememanager.backup.zy
    /* JADX INFO: renamed from: k */
    public void mo6562k(@InterfaceC7396q Context context, @InterfaceC7396q WallpaperManager wm) throws Throwable {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(wm, "wm");
        if (wm.getWallpaperInfo() != null) {
            super.mo6562k(context, wm);
            return;
        }
        if (ncyb.n7h(false)) {
            m6565q(context, wm);
            return;
        }
        if (C2951n.fn3e().m10486r(false)) {
            f7l8(false);
        } else if (C1807g.nn86() && ncyb.cdj(false)) {
            m6563g(false);
        }
    }

    @Override // com.android.thememanager.backup.zy
    public void toq(@InterfaceC7396q Context context, @InterfaceC7396q WallpaperManager wm) throws Throwable {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(wm, "wm");
        if (C1807g.nn86() && C2951n.fn3e().eqxt(true)) {
            if (new File(ThemeBackupAgent.f57405cdj).exists()) {
                Log.i("ThemeBackupManager", "backupLockWallpaper: sensor wallpaper home already backup");
                return;
            } else {
                m6563g(true);
                return;
            }
        }
        if (C2951n.fn3e().m10486r(true)) {
            f7l8(true);
        } else if (ncyb.n7h(true)) {
            m6564n(context);
        }
    }
}
