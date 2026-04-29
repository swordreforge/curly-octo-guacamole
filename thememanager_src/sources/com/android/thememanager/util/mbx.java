package com.android.thememanager.util;

import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.content.FileProvider;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.base.AbstractActivityC1717k;
import com.android.thememanager.wallpaper.C2951n;
import com.bumptech.glide.load.engine.cache.InterfaceC3016k;
import com.google.android.exoplayer2.text.ttml.C3678q;
import java.io.File;
import java.util.Iterator;
import miui.os.Build;

/* JADX INFO: compiled from: WallpaperGalleryUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class mbx {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f61344cdj = "setMagazineServiceStatus";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f61345f7l8 = "extra_key_wallpaper_group_category_id";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final String f61346fn3e = "com.xiaomi.tv.gallerylockscreen.lockscreen_magazine_provider";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    public static final int f61347fu4 = -1;

    /* JADX INFO: renamed from: g */
    public static final String f16630g = "extra_key_wallpaper_group_switch_interval";

    /* JADX INFO: renamed from: h */
    public static final String f16631h = "set_desk_service";

    /* JADX INFO: renamed from: i */
    private static final String f16632i = "getSettingsComponent";

    /* JADX INFO: renamed from: k */
    public static final String f16633k = "content://com.xiaomi.tv.gallerylockscreen.lockscreen_magazine_provider";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f61348ki = "mazagine_wallpaper_pref";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f61349kja0 = "set_lock_service";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f61350ld6 = "thememanager_wallpapergroup";

    /* JADX INFO: renamed from: n */
    public static final String f16634n = "extra_key_wallpaper_group_support";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f61351n7h = "from";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final String f61352ni7 = "result_string";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final int f61353o1t = 2;

    /* JADX INFO: renamed from: p */
    public static final String f16635p = "extra_key_wallpaper_group_cta";

    /* JADX INFO: renamed from: q */
    public static final String f16636q = "extra_key_wallpaper_group_subscribe";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f61354qrj = "extra_key_wallpaper_group_image_title";

    /* JADX INFO: renamed from: s */
    public static final String f16637s = "extra_key_wallpaper_group_image_uri";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f61355t8r = "pref_key_no_warning_set_mazagine";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f61356toq = "method_ext_wallpaper_group_get";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final int f61357wvg = 3;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f61358x2 = "extra_key_wallpaper_group_category_tag";

    /* JADX INFO: renamed from: y */
    public static final String f16638y = "extra_key_wallpaper_group_set";

    /* JADX INFO: renamed from: z */
    public static final int f16639z = 1;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final String f61359zurt = "com.miui.android.fashiongallery.lockscreen_magazine_provider";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f61360zy = "method_ext_wallpaper_group_set";

    private static boolean cdj(Context context, String typeId) {
        if (m9869n(context)) {
            return false;
        }
        Bundle bundle = new Bundle();
        bundle.putBoolean(f16636q, false);
        bundle.putString(f61345f7l8, typeId);
        Bundle bundleM9868k = m9868k(bf2.toq.toq(), Uri.parse(f16633k), f61356toq, bundle);
        Bundle bundleM9868k2 = m9868k(context, Uri.parse(f16633k), yz.yl25, null);
        return (bundleM9868k == null || bundleM9868k.getBoolean(f16636q, false) || bundleM9868k2 == null || !bundleM9868k2.getBoolean(yz.s8y, false)) ? false : true;
    }

    public static String f7l8() {
        return bf2.toq.toq().getCacheDir() + "/" + InterfaceC3016k.k.f62732toq + "/set_wallpaper_gallery.tmp";
    }

    /* JADX INFO: renamed from: g */
    private static ComponentName m9866g(Context context, String authority) {
        try {
            String string = context.getContentResolver().call(Uri.parse("content://" + authority), f16632i, (String) null, (Bundle) null).getString(f61352ni7);
            if (TextUtils.isEmpty(string)) {
                return null;
            }
            return ComponentName.unflattenFromString(string);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: h */
    public static void m9867h(Context context, boolean noShow) {
        context.getSharedPreferences(f61348ki, 0).edit().putBoolean(f61355t8r, noShow).apply();
    }

    /* JADX INFO: renamed from: k */
    public static Bundle m9868k(Context context, Uri uri, String method, Bundle paramsBundle) {
        try {
            return context.getContentResolver().call(uri, method, (String) null, paramsBundle);
        } catch (Exception e2) {
            Log.e("theme:WallpaperGallery", "callProvider error:" + e2);
            e2.printStackTrace();
            return null;
        }
    }

    public static int ki(Context context, String typeId, String type, String imageTitle, Uri uri) {
        if (uri == null || typeId == null) {
            return -1;
        }
        Bundle bundle = new Bundle();
        bundle.putString(f61345f7l8, typeId);
        bundle.putString(f16637s, String.valueOf(uri));
        bundle.putString("from", f61350ld6);
        bundle.putString(f61358x2, type);
        bundle.putString(f61354qrj, imageTitle);
        if (!kja0(context) || !qrj(context)) {
            return 2;
        }
        if (cdj(context, typeId)) {
            return 3;
        }
        toq(context, bundle);
        new jbh(jbh.f16567g, typeId, imageTitle, "theme").m9834g(context, new Intent(miuix.android.content.toq.f86697toq));
        return 1;
    }

    public static boolean kja0(Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(f16635p, false);
        Bundle bundleM9868k = m9868k(context, Uri.parse(f16633k), f61356toq, bundle);
        return bundleM9868k != null && bundleM9868k.getBoolean(f16635p, false);
    }

    private static boolean ld6(Context context) {
        return m9868k(context, Uri.parse(f16633k), "isLockscreenMagazineOpen", null).getBoolean(C3678q.f65822ikck, false);
    }

    /* JADX INFO: renamed from: n */
    private static boolean m9869n(Context context) {
        return context.getSharedPreferences(f61348ki, 0).getBoolean(f61355t8r, false);
    }

    private static boolean n7h(Context context, String authority) {
        return "com.xiaomi.tv.gallerylockscreen.lockscreen_magazine_provider".equals(authority) || "com.miui.android.fashiongallery.lockscreen_magazine_provider".equals(authority);
    }

    /* JADX INFO: renamed from: p */
    public static boolean m9870p() {
        return com.android.thememanager.basemodule.utils.a9.m6999s(uc.f16819f) && ld6(bf2.toq.toq());
    }

    /* JADX INFO: renamed from: q */
    public static Uri m9871q(Context context, File file) {
        if (file == null) {
            return null;
        }
        Uri uriM2162g = FileProvider.m2162g(context, com.android.thememanager.basemodule.resource.constants.toq.o9qk, file);
        context.grantUriPermission(uc.f16819f, uriM2162g, 1);
        return uriM2162g;
    }

    public static boolean qrj(Context context) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(f16634n, false);
        Bundle bundleM9868k = m9868k(context, Uri.parse(f16633k), f61356toq, bundle);
        return bundleM9868k != null && bundleM9868k.getBoolean(f16634n, false);
    }

    /* JADX INFO: renamed from: s */
    public static boolean m9872s(Context context) {
        if (C2951n.fn3e().kja0()) {
            return C2951n.fn3e().gvn7();
        }
        WallpaperInfo wallpaperInfo = WallpaperManager.getInstance(context).getWallpaperInfo();
        if (wallpaperInfo != null) {
            return uc.f16816c.equals(wallpaperInfo.getServiceName());
        }
        return false;
    }

    public static void toq(Context context, Bundle bundle) {
        m9868k(context, Uri.parse(f16633k), f61360zy, bundle);
        if (context instanceof AbstractActivityC1717k) {
            C1708s.f7l8().ld6().n5r1(com.android.thememanager.basemodule.analysis.toq.yaw, C1706p.kja0(((AbstractActivityC1717k) context).yz(), null, ""));
        }
    }

    public static Boolean x2(Context context) {
        Bundle bundleM9868k = m9868k(context, Uri.parse(f16633k), yz.yl25, null);
        if (bundleM9868k == null) {
            return null;
        }
        return Boolean.valueOf(bundleM9868k.getBoolean(yz.xk5, false) || bundleM9868k.getBoolean(yz.s8y, false));
    }

    /* JADX INFO: renamed from: y */
    public static Intent m9873y(Context context) {
        Intent intent;
        Iterator<ResolveInfo> it = context.getPackageManager().queryIntentContentProviders(new Intent(miuix.android.content.toq.f38586m), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                return null;
            }
            String str = it.next().providerInfo.authority;
            try {
            } catch (Exception e2) {
                Log.e("theme:WallpaperGallery", "getWallpaperIntent error ", e2);
            }
            if (n7h(context, str)) {
                intent = !Build.IS_INTERNATIONAL_BUILD ? new Intent("android.intent.action.VIEW", Uri.parse("mifg://fashiongallery/jump_setting")) : com.market.sdk.utils.kja0.f28213k.equalsIgnoreCase(Build.getRegion()) ? new Intent("com.miui.android.fashiongallery.setting.SETTING") : null;
                if ((intent != null ? context.getPackageManager().resolveActivity(intent, 64) : null) != null) {
                    break;
                }
                intent = new Intent();
                intent.setComponent(m9866g(context, str));
                if (context.getPackageManager().resolveActivity(intent, 64) != null) {
                    break;
                }
            }
        }
        return intent;
    }

    public static void zy() {
        Bundle bundle = new Bundle();
        bundle.putBoolean(f61349kja0, false);
        bundle.putBoolean(f16631h, false);
        m9868k(bf2.toq.toq(), Uri.parse(f16633k), f61344cdj, bundle);
    }
}
