package com.android.thememanager.backup;

import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.ncyb;
import com.android.thememanager.service.VideoWallpaperService;
import com.android.thememanager.util.d8wk;
import com.android.thememanager.util.h7am;
import com.android.thememanager.wallpaper.C2951n;
import java.io.File;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;
import qkj8.C7617k;

/* JADX INFO: compiled from: ThemeBackupManager.kt */
/* JADX INFO: loaded from: classes.dex */
public abstract class zy {
    /* JADX INFO: renamed from: k */
    public void mo6562k(@InterfaceC7396q Context context, @InterfaceC7396q WallpaperManager wm) {
        ComponentName component;
        d2ok.m23075h(context, "context");
        d2ok.m23075h(wm, "wm");
        String name = VideoWallpaperService.class.getName();
        WallpaperInfo wallpaperInfo = wm.getWallpaperInfo();
        if (d2ok.f7l8(name, (wallpaperInfo == null || (component = wallpaperInfo.getComponent()) == null) ? null : component.getClassName())) {
            Log.i("ThemeBackupManager", "copy home video wallpaper. " + d8wk.toq(p001b.f7l8.f53825z4j7, ThemeBackupAgent.f57408kja0));
        }
        StringBuilder sb = new StringBuilder();
        sb.append("backupWallpaper. info ");
        WallpaperInfo wallpaperInfo2 = wm.getWallpaperInfo();
        sb.append(wallpaperInfo2 != null ? wallpaperInfo2.getComponent() : null);
        Log.w("ThemeBackupManager", sb.toString());
    }

    public void toq(@InterfaceC7396q Context context, @InterfaceC7396q WallpaperManager wm) {
        d2ok.m23075h(context, "context");
        d2ok.m23075h(wm, "wm");
        String strZy = C7617k.toq().zy();
        Log.i("ThemeBackupManager", "current lock author: " + strZy);
        if (!ncyb.n7h(true)) {
            if ((ncyb.ki(wm.getWallpaperInfo()) || !d2ok.f7l8("com.android.thememanager.theme_lock_live_wallpaper", strZy)) && !d2ok.f7l8("com.android.thememanager.theme_lock_video_wallpaper", strZy)) {
                return;
            }
            String str = p001b.f7l8.f53800nyj;
            if (new File(str).exists()) {
                Log.i("ThemeBackupManager", "copy lock video wallpaper. " + d8wk.toq(str, ThemeBackupAgent.f9617h));
                return;
            }
            return;
        }
        String str2 = ThemeBackupAgent.f9620p;
        C1821p.m7191y(str2);
        String strZy2 = zy(context);
        if (new File(strZy2).exists()) {
            Log.i("ThemeBackupManager", " copy lock wallpaper. " + d8wk.toq(strZy2, str2));
            return;
        }
        Log.i("ThemeBackupManager", " copy lock wallpaper. " + strZy2 + " file is not exits");
    }

    @InterfaceC7396q
    public String zy(@InterfaceC7396q Context context) {
        d2ok.m23075h(context, "context");
        boolean zQrj = ncyb.qrj();
        Log.i("ThemeBackupManager", "backupWallpapers: isDefaultLock: " + zQrj + " defaultWallpaperType: " + ncyb.m8420q());
        if (zQrj) {
            String strM9799q = h7am.m9799q(C1819o.d2ok(context));
            d2ok.qrj(strM9799q);
            return strM9799q;
        }
        String strFu4 = (C2951n.fn3e().kja0() && C2951n.fn3e().jp0y(true)) ? C2951n.fn3e().fu4("gallery", 2, false, false) : InterfaceC1789q.sxpt;
        d2ok.qrj(strFu4);
        return strFu4;
    }
}
