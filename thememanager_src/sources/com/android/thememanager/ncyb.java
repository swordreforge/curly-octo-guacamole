package com.android.thememanager;

import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.AsyncTask;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.util.C2805r;
import com.android.thememanager.util.uc;
import com.android.thememanager.wallpaper.C2951n;
import com.google.gson.C4871g;
import ek5k.C6002g;
import java.io.File;
import miuix.provider.C7317k;
import qkj8.C7617k;

/* JADX INFO: compiled from: WallpaperApplyHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class ncyb {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f60585f7l8 = "sensor_type_all_video_rate";

    /* JADX INFO: renamed from: g */
    public static final String f13428g = "sensor_type_all_screen_frame_count";

    /* JADX INFO: renamed from: k */
    private static final String f13429k = "WallpaperApplyHelper";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f60586kja0 = m8420q();

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f60587ld6 = "maml";

    /* JADX INFO: renamed from: n */
    public static final String f13430n = "sensor_type_small_screen_frame_count";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f60588n7h = "super";

    /* JADX INFO: renamed from: p */
    public static final String f13431p = "image";

    /* JADX INFO: renamed from: q */
    public static final String f13432q = "large_screen_keyguard_wallpaper_type";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f60589qrj = "type_default";

    /* JADX INFO: renamed from: s */
    public static final String f13433s = "video";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static C2739t f60590toq = null;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f60591x2 = "sensor";

    /* JADX INFO: renamed from: y */
    public static final String f13434y = "sensor_type_stiffness";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f60592zy = "large_screen_wallpaper_type";

    /* JADX INFO: renamed from: com.android.thememanager.ncyb$k */
    /* JADX INFO: compiled from: WallpaperApplyHelper.java */
    static class AsyncTaskC2305k extends AsyncTask<Void, Void, Void> {

        /* JADX INFO: renamed from: k */
        private String f13435k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private String f60593toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private Runnable f60594zy;

        public AsyncTaskC2305k(String previewPath, String smallPreviewPath, Runnable afterSetDeskTopPreviewCallback) {
            this.f13435k = previewPath;
            if (C1807g.zurt()) {
                this.f60593toq = smallPreviewPath;
            }
            this.f60594zy = afterSetDeskTopPreviewCallback;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Void doInBackground(Void... voids) {
            if (TextUtils.isEmpty(this.f60593toq)) {
                if (!TextUtils.isEmpty(this.f13435k)) {
                    C2805r.m9968g(this.f13435k, 7);
                }
                return null;
            }
            if (!TextUtils.isEmpty(this.f13435k)) {
                C2805r.m9968g(this.f13435k, 1);
            }
            if (!TextUtils.isEmpty(this.f60593toq)) {
                C2805r.m9968g(this.f60593toq, 4);
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // android.os.AsyncTask
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void onPostExecute(Void unused) {
            Runnable runnable = this.f60594zy;
            if (runnable != null) {
                runnable.run();
                this.f60594zy = null;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean cdj(boolean r4) {
        /*
            com.android.thememanager.wallpaper.n r0 = com.android.thememanager.wallpaper.C2951n.fn3e()
            boolean r0 = r0.kja0()
            r1 = 1
            java.lang.String r2 = "sensor"
            r3 = 0
            if (r0 == 0) goto L30
            com.android.thememanager.wallpaper.n r0 = com.android.thememanager.wallpaper.C2951n.fn3e()
            boolean r0 = r0.eqxt(r4)
            if (r0 != 0) goto L2e
            com.android.thememanager.wallpaper.n r0 = com.android.thememanager.wallpaper.C2951n.fn3e()
            boolean r4 = r0.fti(r4)
            if (r4 == 0) goto L2d
            java.lang.String r4 = m8420q()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L2d
            goto L2e
        L2d:
            r1 = r3
        L2e:
            r3 = r1
            goto L51
        L30:
            boolean r0 = com.android.thememanager.basemodule.utils.y9n.lvui()
            if (r0 == 0) goto L51
            boolean r0 = m8415h(r4, r2)
            if (r0 != 0) goto L2e
            com.android.thememanager.wallpaper.n r0 = com.android.thememanager.wallpaper.C2951n.fn3e()
            boolean r4 = r0.fti(r4)
            if (r4 == 0) goto L2d
            java.lang.String r4 = m8420q()
            boolean r4 = r2.equals(r4)
            if (r4 == 0) goto L2d
            goto L2e
        L51:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.ncyb.cdj(boolean):boolean");
    }

    private static String f7l8(Context context) {
        return new n5r1(C7317k.k.m26508p(context.getContentResolver(), f13432q, f60589qrj)).m8411n();
    }

    public static void fn3e(String previewPath, String smallPreviewPath, Runnable afterSetDeskTopPreviewCallback) {
        if (t8r()) {
            new AsyncTaskC2305k(previewPath, smallPreviewPath, afterSetDeskTopPreviewCallback).executeOnExecutor(C6002g.ld6(), new Void[0]);
        }
    }

    private static void fu4(Context context, String type) {
        if (m8417k()) {
            String string = n5r1.m8410q(type, true).toString();
            C7317k.k.m26505h(context.getContentResolver(), f13432q, string);
            Log.w(f13429k, "setLockWallpaperType: " + string);
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m8414g(Context context, boolean isSmallFrameCount) {
        return C7317k.k.m26504g(context.getContentResolver(), isSmallFrameCount ? f13430n : f13428g, 0);
    }

    /* JADX INFO: renamed from: h */
    public static boolean m8415h(boolean isLockScreen, String applyType) {
        Context qVar = bf2.toq.toq();
        String strF7l8 = isLockScreen ? f7l8(qVar) : m8418n(qVar);
        if (strF7l8 == null) {
            strF7l8 = f60589qrj;
        }
        return strF7l8.equals(applyType);
    }

    /* JADX INFO: renamed from: i */
    public static void m8416i(String previewPath, String smallPreviewPath) {
        fn3e(previewPath, smallPreviewPath, null);
    }

    /* JADX INFO: renamed from: k */
    private static boolean m8417k() {
        return y9n.lvui();
    }

    public static boolean ki(WallpaperInfo info) {
        return info != null && info.getServiceName().endsWith("SuperWallpaper") && info.getServiceName().startsWith(InterfaceC1789q.y380);
    }

    public static boolean kja0(boolean isLock) {
        boolean z2 = false;
        if (C1807g.m7081r()) {
            return false;
        }
        if (C2951n.fn3e().kja0()) {
            return C2951n.fn3e().oc(isLock);
        }
        if (isLock) {
            return uc.lvui();
        }
        WallpaperManager wallpaperManager = (WallpaperManager) bf2.toq.toq().getSystemService("wallpaper");
        if (wallpaperManager == null) {
            Log.w(f13429k, "isMamlWallpaper: WallpaperManager is null");
            return false;
        }
        WallpaperInfo wallpaperInfo = wallpaperManager.getWallpaperInfo();
        if (wallpaperInfo != null && wallpaperInfo.getServiceName().equals("com.miui.miwallpaper.MiWallpaper")) {
            z2 = true;
        }
        return z2;
    }

    public static String ld6(boolean isLockScreen) {
        Context qVar = bf2.toq.toq();
        return isLockScreen ? f7l8(qVar) : m8418n(qVar);
    }

    /* JADX INFO: renamed from: n */
    private static String m8418n(Context context) {
        return new n5r1(C7317k.k.m26508p(context.getContentResolver(), f60592zy, f60589qrj)).m8411n();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0041  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean n7h(boolean r5) {
        /*
            Method dump skipped, instruction units count: 259
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.ncyb.n7h(boolean):boolean");
    }

    public static void ni7(Context context, boolean isSmallFrameCount, int frameCount) {
        C7317k.k.n7h(context.getContentResolver(), isSmallFrameCount ? f13430n : f13428g, frameCount);
    }

    public static void o1t(Context context, int rate) {
        if (rate <= 0) {
            rate = 60;
        }
        C7317k.k.n7h(context.getContentResolver(), f60585f7l8, rate);
    }

    /* JADX INFO: renamed from: p */
    public static int m8419p(boolean isLock, Context context) {
        int i2 = isLock ? 2 : 1;
        int i3 = Settings.Secure.getInt(context.getContentResolver(), "wallpaper_effect_type_" + i2, 0);
        Log.d(f13429k, "get magicType from wallpaper magicType is " + i3);
        return i3;
    }

    /* JADX INFO: renamed from: q */
    public static String m8420q() {
        try {
            Resources resourcesForApplication = bf2.toq.toq().getPackageManager().getResourcesForApplication("com.miui.miwallpaper");
            int identifier = resourcesForApplication.getIdentifier("default_wallpaper_type", "string", "com.miui.miwallpaper");
            if (identifier <= 0) {
                Log.i(f13429k, "getDefaultWallpaperType: resId not found");
                return "image";
            }
            String string = resourcesForApplication.getString(identifier);
            Log.w(f13429k, "getDefaultWallpaperType: " + string);
            return string;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return "image";
        }
    }

    public static boolean qrj() {
        if (C2951n.fn3e().kja0()) {
            return C2951n.fn3e().fti(true);
        }
        if (y9n.lvui()) {
            return m8415h(true, f60589qrj);
        }
        return "com.miui.home.none_provider".equals(C7617k.toq().zy()) && !new File(InterfaceC1789q.sxpt).exists();
    }

    /* JADX INFO: renamed from: s */
    public static int m8421s(Context context) {
        return C7317k.k.m26504g(context.getContentResolver(), f60585f7l8, 60);
    }

    /* JADX INFO: renamed from: t */
    public static boolean m8422t() {
        return uc.m10037x() && com.android.thememanager.lockscreen.lock.wallpaper.kja0.f12503k.m8125g(C2951n.fn3e().mcp(), C2951n.fn3e().wvg());
    }

    public static boolean t8r() {
        return C1807g.m7081r() && y9n.lvui() && y9n.toq(31);
    }

    public static void toq() {
        Context qVar = bf2.toq.toq();
        zurt(qVar, f60589qrj);
        fu4(qVar, f60589qrj);
    }

    public static void wvg(boolean isLockScreen, String type) {
        Context qVar = bf2.toq.toq();
        if (isLockScreen) {
            fu4(qVar, type);
        } else {
            zurt(qVar, type);
        }
    }

    public static boolean x2() {
        if (!m8420q().equals("image")) {
            return false;
        }
        try {
            Resources resourcesForApplication = bf2.toq.toq().getPackageManager().getResourcesForApplication("com.miui.miwallpaper");
            int identifier = resourcesForApplication.getIdentifier("default_wallpaper_support_dark_mode", "bool", "com.miui.miwallpaper");
            if (identifier > 0) {
                return resourcesForApplication.getBoolean(identifier);
            }
            Log.i(f13429k, "isDarkModeDefaultWallpaper: resId not found");
            return true;
        } catch (PackageManager.NameNotFoundException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: y */
    public static int m8423y(Context context) {
        return C7317k.k.m26504g(context.getContentResolver(), f13434y, 10);
    }

    /* JADX INFO: renamed from: z */
    public static void m8424z(Context context, int stiffness) {
        C7317k.k.n7h(context.getContentResolver(), f13434y, stiffness);
    }

    private static void zurt(Context context, String type) {
        if (m8417k()) {
            String string = n5r1.m8410q(type, false).toString();
            C7317k.k.m26505h(context.getContentResolver(), f60592zy, string);
            Log.w(f13429k, "setDesktopWallpaperType: " + string);
        }
    }

    public static C2739t zy() {
        if (f60590toq == null) {
            File file = new File(com.android.thememanager.basemodule.resource.constants.toq.y9);
            if (file.isDirectory() || !file.exists()) {
                Log.w(f13429k, "fold sensor default wallpaper config file not exist");
                return null;
            }
            try {
                f60590toq = (C2739t) new C4871g().n7h(C1821p.m7184h(com.android.thememanager.basemodule.resource.constants.toq.y9), C2739t.class);
            } catch (Exception e2) {
                e2.printStackTrace();
                return null;
            }
        }
        return f60590toq;
    }
}
