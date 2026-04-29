package com.android.thememanager.settings.superwallpaper.utils;

import android.app.WallpaperInfo;
import android.content.Context;
import android.net.Uri;
import android.provider.Settings;
import android.text.TextUtils;
import miui.os.Build;

/* JADX INFO: compiled from: WallpaperAuthorityUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class n7h {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f60979f7l8 = "com.android.systemui.wallpaper.Video24WallpaperService";

    /* JADX INFO: renamed from: g */
    public static final String f15784g = "com.miui.gallery.cloud.baby.wallpaper_provider";

    /* JADX INFO: renamed from: k */
    public static final String f15785k = "com.android.thememanager.theme_lock_live_wallpaper";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f60980ld6;

    /* JADX INFO: renamed from: n */
    public static final String f15786n = "com.miui.home.none_provider";

    /* JADX INFO: renamed from: p */
    public static final String f15787p;

    /* JADX INFO: renamed from: q */
    public static final String f15788q = "com.android.thememanager.set_lockwallpaper";

    /* JADX INFO: renamed from: s */
    public static final String f15789s = "com.miui.android.fashiongallery.lockscreen_magazine_provider";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f60981toq = "com.android.thememanager.theme_lock_video_wallpaper";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f60982x2 = "com.xiaomi.tv.gallerylockscreen.set_lockwallpaper";

    /* JADX INFO: renamed from: y */
    public static final String f15790y = "com.xiaomi.tv.gallerylockscreen.lockscreen_magazine_provider";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f60983zy = "com.android.thememanager.theme_lockwallpaper";

    static {
        String str = Build.IS_INTERNATIONAL_BUILD ? f15789s : "com.xiaomi.tv.gallerylockscreen.lockscreen_magazine_provider";
        f15787p = str;
        f60980ld6 = str;
    }

    private n7h() {
    }

    public static boolean f7l8(Context context) {
        return m9282g(context) || m9284n(context);
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9282g(Context context) {
        return f60980ld6.equals(m9283k(context));
    }

    /* JADX INFO: renamed from: k */
    public static String m9283k(Context context) {
        String string = Settings.System.getString(context.getContentResolver(), "lock_wallpaper_provider_authority");
        return TextUtils.isEmpty(string) ? "com.miui.home.none_provider" : string;
    }

    private static boolean kja0() {
        String str = Build.DEVICE;
        return "cepheus".equals(str) || "grus".equals(str) || "dipper".equals(str) || "beryllium".equals(str) || "equuleus".equals(str) || "perseus".equals(str) || "andromeda".equals(str) || "ursa".equals(str) || "polaris".equals(str) || "davinci".equals(str) || "raphael".equals(str);
    }

    public static boolean ld6(Context context) {
        return "com.android.thememanager.theme_lockwallpaper".equals(m9283k(context));
    }

    /* JADX INFO: renamed from: n */
    public static boolean m9284n(Context context) {
        return f60982x2.equals(m9283k(context));
    }

    public static boolean n7h(Context context, String authority) {
        return Settings.System.putString(context.getContentResolver(), "lock_wallpaper_provider_authority", authority);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m9285p(Context context) {
        return "com.android.thememanager.theme_lock_video_wallpaper".equals(m9283k(context));
    }

    /* JADX INFO: renamed from: q */
    public static boolean m9286q(Context context) {
        return "com.miui.home.none_provider".equals(m9283k(context));
    }

    public static boolean qrj(final Context context) {
        WallpaperInfo qVar;
        return kja0() && m9286q(context) && (qVar = kja0.toq(context)) != null && "com.android.systemui.wallpaper.Video24WallpaperService".equals(qVar.getServiceName());
    }

    /* JADX INFO: renamed from: s */
    public static boolean m9287s(final Context context) {
        if (qrj(context)) {
            return true;
        }
        return "com.android.thememanager.theme_lock_live_wallpaper".equals(m9283k(context));
    }

    public static boolean toq(Context context) {
        String strM9283k = m9283k(context);
        return "com.android.thememanager.set_lockwallpaper".equals(strM9283k) || "com.android.thememanager.theme_lock_live_wallpaper".equals(strM9283k) || "com.android.thememanager.theme_lock_video_wallpaper".equals(strM9283k);
    }

    public static boolean x2(Context context) {
        String strM9283k = m9283k(context);
        if (TextUtils.isEmpty(strM9283k) || "com.miui.home.none_provider".equals(strM9283k)) {
            return false;
        }
        return C2667q.zy(context, Uri.parse("content://" + strM9283k));
    }

    /* JADX INFO: renamed from: y */
    public static boolean m9288y(final Context context) {
        WallpaperInfo qVar = kja0.toq(context);
        return qVar != null && "com.miui.miwallpaper.MiWallpaper".equals(qVar.getServiceName());
    }

    public static boolean zy(Context context) {
        return f15784g.equals(m9283k(context));
    }
}
