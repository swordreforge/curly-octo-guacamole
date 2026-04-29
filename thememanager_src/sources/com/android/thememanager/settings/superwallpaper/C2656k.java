package com.android.thememanager.settings.superwallpaper;

import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.provider.Settings;
import android.util.Log;
import bf2.toq;
import com.android.thememanager.settings.superwallpaper.utils.zy;
import ek5k.C6002g;
import java.util.Iterator;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.k */
/* JADX INFO: compiled from: UnitySuperWallpaperUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2656k {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final String f60905a9 = "condition_provider_pre_method";

    /* JADX INFO: renamed from: c */
    public static final int f15707c = 2;

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f60906cdj = "path";

    /* JADX INFO: renamed from: d2ok, reason: collision with root package name */
    public static final String f60907d2ok = "previewType";

    /* JADX INFO: renamed from: d3, reason: collision with root package name */
    public static final String f60908d3 = "0";

    /* JADX INFO: renamed from: dd, reason: collision with root package name */
    public static final String f60909dd = "darkPreview";

    /* JADX INFO: renamed from: eqxt, reason: collision with root package name */
    public static final String f60910eqxt = "2";

    /* JADX INFO: renamed from: f */
    public static final int f15708f = 1;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f60911f7l8 = "is_super_wallpaper";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final String f60912fn3e = "aod_small_preview";

    /* JADX INFO: renamed from: fti, reason: collision with root package name */
    public static final String f60913fti = "aod_category";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final String f60914fu4 = "home_small_preview_0_dark";

    /* JADX INFO: renamed from: g */
    public static final String f15709g = "com.miui.miwallpaper.saturn";

    /* JADX INFO: renamed from: gvn7, reason: collision with root package name */
    public static final String f60915gvn7 = "blank_super_wallpaper";

    /* JADX INFO: renamed from: h */
    public static final String f15710h = "preview";

    /* JADX INFO: renamed from: hyr, reason: collision with root package name */
    public static final String f60916hyr = "wallpaper_sunset";

    /* JADX INFO: renamed from: i */
    public static final String f15711i = "lockscreen_small_preview_dark";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final String f60917jk = "condition_provider_post_method";

    /* JADX INFO: renamed from: jp0y, reason: collision with root package name */
    public static final String f60918jp0y = "getPreview";

    /* JADX INFO: renamed from: k */
    private static final String f15712k = "SuperWallpaperUtils";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f60919ki = "desk_position_count";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f60920kja0 = "banner";

    /* JADX INFO: renamed from: l */
    public static final String f15713l = "super_wall_paper_service_name";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f60921ld6 = "package_name";

    /* JADX INFO: renamed from: lrht, reason: collision with root package name */
    private static WallpaperManager f60922lrht = null;

    /* JADX INFO: renamed from: lvui, reason: collision with root package name */
    public static final String f60923lvui = "darkMode";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final String f60924mcp = "condition_provider";

    /* JADX INFO: renamed from: n */
    public static final String f15714n = "com.miui.miwallpaper.earth";

    /* JADX INFO: renamed from: n5r1, reason: collision with root package name */
    public static final String f60925n5r1 = "wallpaper_sunrise";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f60926n7h = "summary";

    /* JADX INFO: renamed from: ncyb, reason: collision with root package name */
    public static final String f60927ncyb = "_super_wallpaper_home_temp_position";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final String f60928ni7 = "home_small_preview_0";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final String f60929o1t = "clock_position_y";

    /* JADX INFO: renamed from: oc, reason: collision with root package name */
    public static final String f60930oc = "1";

    /* JADX INFO: renamed from: p */
    public static final String f15715p = "id";

    /* JADX INFO: renamed from: q */
    public static final String f15716q = "com.miui.miwallpaper.mars";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f60931qrj = "title";

    /* JADX INFO: renamed from: r */
    public static final String f15717r = "preview";

    /* JADX INFO: renamed from: s */
    public static final String f15718s = "search";

    /* JADX INFO: renamed from: t */
    public static final String f15719t = "dual_clock_position_y";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f60932t8r = "lockscreen_small_preview";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f60933toq = "miui.service.wallpaper.SuperWallpaperService";

    /* JADX INFO: renamed from: uv6, reason: collision with root package name */
    private static Context f60934uv6 = null;

    /* JADX INFO: renamed from: vyq, reason: collision with root package name */
    private static final String f60935vyq = "darkmode_change_mode";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final String f60936wvg = "dual_clock_position_x_anchor_right";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f60937x2 = "downgrade_package_name";

    /* JADX INFO: renamed from: x9kr, reason: collision with root package name */
    public static final String f60938x9kr = "_super_wallpaper_home_position";

    /* JADX INFO: renamed from: y */
    public static final String f15720y = "from";

    /* JADX INFO: renamed from: z */
    public static final String f15721z = "clock_position_x";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final String f60939zurt = "aod_small_preview_dark";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f60940zy = "com.miui.miwallpaper";

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.k$k */
    /* JADX INFO: compiled from: UnitySuperWallpaperUtils.java */
    class k implements Runnable {
        k() {
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0048  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() throws java.lang.Throwable {
            /*
                r5 = this;
                android.content.Context r0 = bf2.toq.toq()
                r1 = 0
                android.content.ContentResolver r0 = r0.getContentResolver()     // Catch: java.lang.Throwable -> L2f android.os.RemoteException -> L34
                java.lang.String r2 = "content://com.miui.miwallpaper.resource.wallpaper"
                android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> L2f android.os.RemoteException -> L34
                android.content.ContentProviderClient r0 = r0.acquireUnstableContentProviderClient(r2)     // Catch: java.lang.Throwable -> L2f android.os.RemoteException -> L34
                if (r0 != 0) goto L1b
                if (r0 == 0) goto L1a
                r0.close()
            L1a:
                return
            L1b:
                java.lang.String r2 = "METHOD_GET_SUPER_WALLPAPER_RESOURCE"
                java.lang.String r3 = "ARG_GET_SUPER_WALLPAPER_ALL_RESOURCE"
                android.os.Bundle r1 = r0.call(r2, r3, r1)     // Catch: android.os.RemoteException -> L2d java.lang.Throwable -> L45
                if (r1 == 0) goto L41
                r1 = 1
                bf2.toq.m5815s(r1)     // Catch: android.os.RemoteException -> L2d java.lang.Throwable -> L45
                r0.close()
                return
            L2d:
                r1 = move-exception
                goto L38
            L2f:
                r0 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
                goto L46
            L34:
                r0 = move-exception
                r4 = r1
                r1 = r0
                r0 = r4
            L38:
                java.lang.String r2 = "SuperWallpaperUtils"
                java.lang.String r3 = "getResultFromProvider"
                android.util.Log.e(r2, r3, r1)     // Catch: java.lang.Throwable -> L45
                if (r0 == 0) goto L44
            L41:
                r0.close()
            L44:
                return
            L45:
                r1 = move-exception
            L46:
                if (r0 == 0) goto L4b
                r0.close()
            L4b:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.superwallpaper.C2656k.k.run():void");
        }
    }

    private C2656k() {
    }

    public static String f7l8(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), f15713l);
    }

    /* JADX INFO: renamed from: g */
    public static int m9240g(Context context, String wpName) {
        int i2 = Settings.Secure.getInt(context.getContentResolver(), wpName, -1);
        if (i2 == -1) {
            i2 = Settings.Secure.getInt(context.getContentResolver(), zy.ld6(wpName.substring(wpName.lastIndexOf(46), wpName.length() - 14)) + f60938x9kr, 0);
        }
        Log.d(f15712k, "getSuperWallpaperHomeTempPosition " + wpName + " " + i2);
        return i2;
    }

    /* JADX INFO: renamed from: k */
    public static void m9241k() {
        C6002g.m22240g(new k());
    }

    public static boolean ld6(Context context, String wpName, int position) {
        Log.d(f15712k, "setSuperWallpaperHomePosition " + wpName + " position: " + position);
        return Settings.Secure.putInt(context.getContentResolver(), wpName + f60938x9kr, position);
    }

    /* JADX INFO: renamed from: n */
    public static int m9242n(Context context, String wpName) {
        int i2 = Settings.Secure.getInt(context.getContentResolver(), wpName + f60938x9kr, -1);
        if (i2 == -1) {
            i2 = Settings.Secure.getInt(context.getContentResolver(), zy.ld6(wpName.substring(wpName.lastIndexOf(46), wpName.length() - 14)) + f60938x9kr, 0);
        }
        Log.d(f15712k, "getSuperWallpaperHomePosition " + wpName + " " + i2);
        return i2;
    }

    /* JADX INFO: renamed from: p */
    public static int m9243p(int number, int min, int max) {
        return number < min ? min : number > max ? max : number;
    }

    /* JADX INFO: renamed from: q */
    public static int m9244q(Context context) {
        WallpaperManager wallpaperManager = (WallpaperManager) context.getSystemService("wallpaper");
        if (wallpaperManager.getWallpaperInfo() == null || wallpaperManager.getWallpaperInfo().getServiceInfo() == null || wallpaperManager.getWallpaperInfo().getServiceInfo().metaData == null) {
            return 0;
        }
        return wallpaperManager.getWallpaperInfo().getServiceInfo().metaData.getInt(f60919ki);
    }

    public static void qrj(Context context, String typeName) {
        Settings.Secure.putString(context.getContentResolver(), f15713l, typeName);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m9245s(Context context, WallpaperInfo wallpaperInfo) {
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentServices(new Intent("miui.service.wallpaper.SuperWallpaperService"), 128).iterator();
        while (it.hasNext()) {
            if (it.next().serviceInfo.name.equals(wallpaperInfo.getComponent().getClassName())) {
                return true;
            }
        }
        return false;
    }

    public static Bitmap toq(Context context) {
        WallpaperManager wallpaperManager = (WallpaperManager) context.getApplicationContext().getSystemService("wallpaper");
        if (wallpaperManager.getWallpaperInfo() != null && wallpaperManager.getWallpaperInfo().getServiceInfo() != null && wallpaperManager.getWallpaperInfo().getServiceInfo().metaData != null) {
            ServiceInfo serviceInfo = wallpaperManager.getWallpaperInfo().getServiceInfo();
            try {
                return BitmapFactory.decodeResource(context.createPackageContext(serviceInfo.packageName, 0).getResources(), serviceInfo.metaData.getInt(m9246y(serviceInfo) ? f15711i : f60932t8r));
            } catch (PackageManager.NameNotFoundException e2) {
                Log.e(f15712k, e2.getMessage());
            }
        }
        return null;
    }

    public static boolean x2(Context context, String wpName, int position) {
        boolean zPutInt = Settings.Secure.putInt(context.getContentResolver(), wpName, position);
        Log.d(f15712k, "setSuperWallpaperHomeTempPosition " + wpName + " position: " + position + " succeed " + zPutInt);
        return zPutInt;
    }

    /* JADX INFO: renamed from: y */
    public static boolean m9246y(ServiceInfo serviceInfo) {
        if (serviceInfo == null) {
            return false;
        }
        int i2 = serviceInfo.metaData.getInt(f60935vyq, 3);
        if (!zy.m9317y(toq.toq()) || (i2 & 1) == 0) {
            return com.android.thememanager.settings.superwallpaper.basesuperwallpaper.toq.x2().t8r() && (i2 & 2) != 0;
        }
        return true;
    }

    public static Drawable zy(Context context) {
        WallpaperManager wallpaperManager = (WallpaperManager) context.getApplicationContext().getSystemService("wallpaper");
        if (wallpaperManager.getWallpaperInfo() == null || wallpaperManager.getWallpaperInfo().getServiceInfo() == null || wallpaperManager.getWallpaperInfo().getServiceInfo().metaData == null) {
            return null;
        }
        ServiceInfo serviceInfo = wallpaperManager.getWallpaperInfo().getServiceInfo();
        return m9246y(serviceInfo) ? Icon.createWithResource(serviceInfo.packageName, serviceInfo.metaData.getInt(f15711i)).loadDrawable(context) : Icon.createWithResource(serviceInfo.packageName, serviceInfo.metaData.getInt(f60932t8r)).loadDrawable(context);
    }
}
