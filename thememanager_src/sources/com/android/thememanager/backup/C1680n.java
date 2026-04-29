package com.android.thememanager.backup;

import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.Log;
import androidx.core.content.C0498q;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.ncyb;
import com.android.thememanager.util.d8wk;
import kotlin.jvm.internal.d2ok;
import mub.InterfaceC7396q;

/* JADX INFO: renamed from: com.android.thememanager.backup.n */
/* JADX INFO: compiled from: ThemeBackupManager.kt */
/* JADX INFO: loaded from: classes.dex */
final class C1680n extends zy {
    public C1680n() {
        Log.w("ThemeBackupManager", "ThemeBackupNewMiwallpaperImpl init");
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
        if (!ncyb.n7h(false)) {
            if (d2ok.f7l8(ncyb.ld6(false), "video")) {
                Log.i("ThemeBackupManager", "new miWallpaper copy home video wallpaper. " + d8wk.toq(p001b.f7l8.f53825z4j7, ThemeBackupAgent.f57408kja0));
                StringBuilder sb = new StringBuilder();
                sb.append(" new miWallpaper backupWallpaper. info ");
                WallpaperInfo wallpaperInfo = wm.getWallpaperInfo();
                sb.append(wallpaperInfo != null ? wallpaperInfo.getComponent() : null);
                Log.w("ThemeBackupManager", sb.toString());
                return;
            }
            return;
        }
        boolean z2 = y9n.toq(33) || C0498q.m2255k(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
        Object drawable = z2 ? wm.getDrawable() : null;
        if (!(drawable instanceof BitmapDrawable)) {
            Log.w("ThemeBackupManager", "drawable not Bitmap. " + drawable + ", hasPermission " + z2);
            return;
        }
        Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
        String str = ThemeBackupAgent.f9622s;
        C1821p.m7191y(str);
        Log.i("ThemeBackupManager", "backup home wallpaper: " + com.android.thememanager.v9.toq.m10205k(bitmap, str));
    }
}
