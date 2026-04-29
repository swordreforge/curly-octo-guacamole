package com.android.thememanager.settings.superwallpaper.utils;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.router.recommend.entity.UIImageWithLink;
import com.google.gson.C4871g;
import com.google.gson.reflect.C4922k;
import java.util.LinkedList;

/* JADX INFO: compiled from: ThemeUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class x2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f60987f7l8 = "getOnlineWallpapers";

    /* JADX INFO: renamed from: g */
    public static final String f15793g = "miui.intent.action.WALLPAPER_PICKER_PAGE";

    /* JADX INFO: renamed from: k */
    private static final String f15794k = "ThemeUtils";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f60988ld6 = "METHOD_GET_SUPER_WALLPAPER_RESOURCE";

    /* JADX INFO: renamed from: n */
    public static final String f15795n = "com.android.thememanager.settings.WallpaperSettingsActivity";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static int f60989n7h = 109;

    /* JADX INFO: renamed from: p */
    public static String f15796p = "endless_subject_product_online_id";

    /* JADX INFO: renamed from: q */
    public static final String f15797q = "content://com.miui.miwallpaper.resource.wallpaper";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f60990qrj = "result_super_wallpaper_data";

    /* JADX INFO: renamed from: s */
    public static String f15798s = "endless_subject_product_index";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f60991toq = "com.android.thememanager";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f60992x2 = "ARG_GET_SUPER_WALLPAPER_ALL_RESOURCE";

    /* JADX INFO: renamed from: y */
    public static final String f15799y = "getWallpaperUri";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f60993zy = "content://com.android.thememanager.settings_onlinewallpaper_provider";

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.utils.x2$k */
    /* JADX INFO: compiled from: ThemeUtils.java */
    class C2669k extends C4922k<LinkedList<UIImageWithLink>> {
        C2669k() {
        }
    }

    private x2() {
    }

    public static void f7l8(Activity context, UIImageWithLink uiImageWithLink) {
        try {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName("com.android.thememanager", "com.android.thememanager.settings.ProxyToSystemOnlineWallpaperActivity"));
            intent.putExtra("wallpaper_data_list", C2666p.m9289g(context, C2666p.f15791k, ""));
            intent.putExtra("page_id", C2666p.m9289g(context, C2666p.f60984toq, ""));
            intent.putExtra("id", uiImageWithLink.link.link);
            Log.d(f15794k, "gotoWallpaperDetailActivity " + C2666p.m9289g(context, C2666p.f15791k, "") + " " + C2666p.m9289g(context, C2666p.f60984toq, "") + " " + uiImageWithLink.link.link);
            context.startActivityForResult(intent, f60989n7h);
        } catch (Exception e2) {
            Log.e(f15794k, "gotoWallpaperDetailActivity failed:" + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: g */
    public static Intent m9301g() {
        Intent intent = new Intent();
        intent.setClassName("com.android.thememanager", f15795n);
        return intent;
    }

    /* JADX INFO: renamed from: k */
    public static boolean m9302k(Context context) throws Throwable {
        try {
            C2667q.m9296k(context, Uri.parse("content://com.android.thememanager.theme_provider"), "disableLockscreenV2", null, null);
            Log.d(f15794k, "disableMamlLockScreen " + C2670y.m9305g());
            return C2670y.m9305g();
        } catch (Exception e2) {
            Log.e(f15794k, "Failed to disableMamlLockScreen", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: n */
    public static Intent m9303n() {
        Intent intent = new Intent("miui.intent.action.WALLPAPER_PICKER_PAGE");
        intent.setPackage("com.android.thememanager");
        return intent;
    }

    /* JADX INFO: renamed from: q */
    public static LinkedList<UIImageWithLink> m9304q(Context context, int pageNum) throws Throwable {
        LinkedList<UIImageWithLink> linkedList = null;
        try {
            Bundle bundle = new Bundle();
            bundle.putString("page_num", "" + pageNum);
            Bundle bundleM9296k = C2667q.m9296k(context, Uri.parse(f60993zy), f60987f7l8, "" + pageNum, bundle);
            String string = bundleM9296k.getString("json_list");
            C2666p.m9292p(context, C2666p.f60984toq, bundleM9296k.getString("page_id"));
            if (string != null) {
                LinkedList<UIImageWithLink> linkedList2 = (LinkedList) new C4871g().kja0(string, new C2669k().getType());
                try {
                    Log.d(f15794k, "getOnlineWallpaper list:" + linkedList2.size());
                    linkedList = linkedList2;
                } catch (Exception e2) {
                    e = e2;
                    linkedList = linkedList2;
                    Log.e(f15794k, "getOnlineWallpaper failed:" + e);
                }
            }
            Log.d(f15794k, "getOnlineWallpaper str:" + string);
        } catch (Exception e3) {
            e = e3;
        }
        return linkedList;
    }

    public static String toq(Context context, UIImageWithLink uiImageWithLink) throws Throwable {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("id", uiImageWithLink.link.link);
            bundle.putString("url", uiImageWithLink.imageUrl);
            Bundle bundleM9296k = C2667q.m9296k(context, Uri.parse(f60993zy), f15799y, null, bundle);
            Log.d(f15794k, "getLocalWallpaperUri result_uri:" + bundleM9296k.getString("result_uri"));
            return bundleM9296k.getString("result_uri");
        } catch (Exception e2) {
            Log.e(f15794k, "getLocalWallpaperUri failed:" + e2);
            return "";
        }
    }

    public static Intent zy() {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_TAB_ID", "wallpaper");
        intent.setData(Uri.parse("theme://zhuti.xiaomi.com:/mainpage"));
        return intent;
    }
}
