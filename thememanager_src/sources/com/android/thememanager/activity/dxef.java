package com.android.thememanager.activity;

import android.app.WallpaperManager;
import android.content.Intent;
import android.util.Log;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import java.io.File;
import java.io.FileInputStream;

/* JADX INFO: compiled from: ThemeProvisionActivity.java */
/* JADX INFO: loaded from: classes.dex */
public class dxef implements InterfaceC1789q, com.android.thememanager.basemodule.analysis.toq {

    /* JADX INFO: renamed from: g */
    private static final String f8985g;

    /* JADX INFO: renamed from: h */
    public static final String f8986h = "_lockscreen";

    /* JADX INFO: renamed from: i */
    public static final String f8987i = "_wallpaper";

    /* JADX INFO: renamed from: k */
    private static final String f8988k = dxef.class.getSimpleName();

    /* JADX INFO: renamed from: n */
    private static final String f8989n = "/system/media/lockscreen/";

    /* JADX INFO: renamed from: p */
    private static final String f8990p = "/system/media/lockscreen/video/default_video_wallpaper.mp4";

    /* JADX INFO: renamed from: q */
    private static final String f8991q = "/system/media/wallpaper/";

    /* JADX INFO: renamed from: s */
    private static final String f8992s;

    /* JADX INFO: renamed from: y */
    private static final String f8993y;

    static {
        String strM9678o = com.android.thememanager.util.ch.m9678o(com.android.thememanager.basemodule.resource.constants.toq.v6we);
        f8985g = strM9678o;
        f8993y = strM9678o + "default_wallpaper.jpg";
        f8992s = strM9678o + "default_lock_wallpaper.jpg";
    }

    /* JADX INFO: renamed from: k */
    public static void m6406k() throws Throwable {
        FileInputStream fileInputStream;
        String strO1t = com.android.thememanager.util.uc.o1t();
        File file = new File(f8992s);
        if (file.exists()) {
            strO1t = file.getAbsolutePath();
        }
        if (strO1t != null) {
            Log.d(f8988k, "applyCustDefaultWallpapers custLockWallpaperPath = " + strO1t);
            com.android.thememanager.util.d8wk.toq(strO1t, InterfaceC1789q.sxpt);
            bf2.toq.toq().sendBroadcast(new Intent(miuix.android.content.toq.f86697toq));
        } else {
            Log.d(f8988k, "applyCustDefaultWallpapers using default lock");
            if (com.android.thememanager.util.h7am.ld6()) {
                com.android.thememanager.util.h7am.m9795h(true);
            }
        }
        String strM10039z = com.android.thememanager.util.uc.m10039z();
        File file2 = new File(f8993y);
        if (file2.exists()) {
            strM10039z = file2.getAbsolutePath();
        }
        if (strM10039z == null) {
            Log.d(f8988k, "applyCustDefaultWallpapers using default desk wallpaper");
            if (com.android.thememanager.util.h7am.ld6()) {
                com.android.thememanager.util.h7am.m9795h(false);
                return;
            }
            return;
        }
        Log.d(f8988k, "applyCustDefaultWallpapers custDeskWallpaperPath = " + strM10039z);
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(strM10039z);
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            WallpaperManager.getInstance(bf2.toq.toq()).setStream(fileInputStream, null, true, 1);
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileInputStream);
        } catch (Exception e3) {
            e = e3;
            fileInputStream2 = fileInputStream;
            e.printStackTrace();
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileInputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = fileInputStream;
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileInputStream2);
            throw th;
        }
    }
}
