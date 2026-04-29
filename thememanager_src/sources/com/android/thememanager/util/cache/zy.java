package com.android.thememanager.util.cache;

import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.controller.local.kja0;
import com.android.thememanager.settings.superwallpaper.utils.n7h;
import com.android.thememanager.util.h7am;
import com.android.thememanager.util.t8iq;
import com.android.thememanager.util.uc;
import com.android.thememanager.wallpaper.C2951n;
import java.io.File;
import kotlin.jvm.internal.d2ok;
import l05.qrj;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: MiuiDefaultWallpaperMigrate.kt */
/* JADX INFO: loaded from: classes2.dex */
public final class zy {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f61214f7l8 = "/system/media/wallpaper/wallpaper13.jpg";

    /* JADX INFO: renamed from: g */
    private static final int f16360g = 0;

    /* JADX INFO: renamed from: k */
    @InterfaceC7396q
    public static final zy f16361k = new zy();

    /* JADX INFO: renamed from: n */
    private static final int f16362n = 1;

    /* JADX INFO: renamed from: q */
    @InterfaceC7396q
    private static final String f16363q = "MiuiDefaultWallpaperMigrate";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f61215toq = "restoreDefaultTheme";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @InterfaceC7396q
    private static final String f61216zy = "key_experience_new_home";

    private zy() {
    }

    @qrj
    /* JADX INFO: renamed from: k */
    public static final void m9660k(@InterfaceC7395n Context context, @InterfaceC7395n Bundle bundle) {
        if (bundle != null) {
            int i2 = bundle.getInt(f61216zy);
            Log.d(f16363q, "experience:" + i2);
            if (i2 != 0) {
                if (i2 != 1) {
                    return;
                }
                t8iq.f7l8(C1807g.zurt());
            } else if (kja0.m7517y()) {
                Log.w(f16363q, "is customized machine,do nothing!");
            } else {
                f16361k.m9662q(context);
            }
        }
    }

    /* JADX INFO: renamed from: n */
    private final void m9661n(Context context, boolean z2) {
        if (C1807g.zurt()) {
            return;
        }
        Bitmap bitmapDecodeFile = p029m.zy.toq(h7am.m9798p(f61214f7l8)) ? null : BitmapFactory.decodeFile(h7am.m9798p(f61214f7l8));
        StringBuilder sb = new StringBuilder();
        sb.append("darkBitmap is empty: ");
        sb.append(bitmapDecodeFile == null);
        Log.i(f16363q, sb.toString());
        uc.kja0(context, f61214f7l8, null, null, true, z2, false, bitmapDecodeFile, null);
    }

    /* JADX INFO: renamed from: q */
    private final void m9662q(Context context) {
        if (context == null || C1807g.zurt()) {
            return;
        }
        boolean z2 = Build.VERSION.SDK_INT >= 33;
        boolean zFti = z2 ? C2951n.fn3e().fti(false) : zy(context, false);
        Log.i(f16363q, "isAndroid13Version :" + z2 + ",setDefaultHomeWallpaper?" + zFti);
        if (zFti) {
            m9661n(context, false);
        }
        boolean zFti2 = z2 ? C2951n.fn3e().fti(true) : zy(context, true);
        Log.i(f16363q, "isAndroid13Version :" + z2 + ",setDefaultLockScreenWallpaper?" + zFti2);
        if (zFti2) {
            m9661n(context, true);
        }
    }

    @qrj
    public static final boolean toq(@InterfaceC7396q String method) {
        d2ok.m23075h(method, "method");
        return d2ok.f7l8(f61215toq, method);
    }

    private final boolean zy(Context context, boolean z2) {
        if (!z2) {
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(context);
            if (wallpaperManager != null && wallpaperManager.getWallpaperInfo() == null && wallpaperManager.peekDrawable() == null) {
                return true;
            }
        } else if (n7h.m9286q(context) && !new File(InterfaceC1789q.sxpt).exists()) {
            return true;
        }
        return false;
    }
}
