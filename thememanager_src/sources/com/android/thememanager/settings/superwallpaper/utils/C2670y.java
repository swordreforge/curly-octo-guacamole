package com.android.thememanager.settings.superwallpaper.utils;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.lockscreen.lock.TemplateConfig;
import com.android.thememanager.lockscreen.lock.WallpaperInfo;
import com.android.thememanager.ncyb;
import com.android.thememanager.wallpaper.C2951n;
import com.google.gson.C4871g;
import java.io.File;
import java.util.Arrays;
import miuix.provider.C7317k;
import zy.lvui;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.utils.y */
/* JADX INFO: compiled from: LockScreenUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2670y {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final String f60994cdj = "magazine_a";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f60995f7l8 = "SET_KEYGUARD_CLOCK_POSITION";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final String f60996fn3e = "color_scheme";

    /* JADX INFO: renamed from: g */
    public static final String f15800g = "getLockWallpaper";

    /* JADX INFO: renamed from: h */
    private static final String f15801h = "smart_frame";

    /* JADX INFO: renamed from: i */
    public static final String f15802i = "constant_lockscreen_info";

    /* JADX INFO: renamed from: k */
    private static final String f15803k = "LockScreenUtils";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final String f60997ki = "magazine_b";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final String f60998kja0 = "doodle";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f60999ld6 = "miui.keyguard.editor.settings";

    /* JADX INFO: renamed from: n */
    public static final String f15804n = "com.android.keyguard.settings.ChooseKeyguardClockActivity";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f61000n7h = "rhombus";

    /* JADX INFO: renamed from: p */
    public static final String f15805p = "miui.keyguard.editor";

    /* JADX INFO: renamed from: q */
    public static final String f15806q = "content://com.miui.systemui.keyguard.wallpaper";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f61001qrj = "fingerStyle";

    /* JADX INFO: renamed from: s */
    private static final String f15807s = "getGxzwAnimStyle";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final String f61002t8r = "magazine_c";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f61003toq = "com.android.systemui";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final String f61004x2 = "thumbnail";

    /* JADX INFO: renamed from: y */
    public static final String f15808y = "setLockWallpaperAuthority";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f61005zy;

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f61005zy = "content://com.miui.miwallpaper.keyguard.wallpaper";
        } else {
            f61005zy = f15806q;
        }
    }

    private C2670y() {
    }

    public static boolean f7l8(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), "wallpaper_matting_support_2", 0) == 1;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9305g() {
        File file = new File(InterfaceC1789q.re);
        File file2 = new File(InterfaceC1789q.iq);
        if (file.exists() || file2.exists()) {
            return false;
        }
        return (C1807g.m7081r() && ncyb.m8415h(true, "maml")) ? false : true;
    }

    /* JADX INFO: renamed from: k */
    public static TemplateConfig m9306k() {
        String string = Settings.Secure.getString(bf2.toq.toq().getContentResolver(), "constant_lockscreen_info");
        if (TextUtils.isEmpty(string)) {
            Log.d(f15803k, "get current lock screen info is null");
            return null;
        }
        TemplateConfig templateConfig = (TemplateConfig) new C4871g().n7h(string, TemplateConfig.class);
        if (templateConfig != null && templateConfig.getWallpaperInfo() != null) {
            WallpaperInfo wallpaperInfo = templateConfig.getWallpaperInfo();
            wallpaperInfo.setMagicType(C2951n.fn3e().mcp());
            wallpaperInfo.setEnableBlur(C2951n.fn3e().wvg());
        }
        return templateConfig;
    }

    /* JADX INFO: renamed from: n */
    public static synchronized Drawable m9307n(Context context) {
        String str;
        if (C2951n.fn3e().kja0()) {
            Bitmap bitmapM10488z = C2951n.fn3e().m10488z((C2951n.fn3e().eqxt(true) && C1807g.zurt() && !C1807g.wvg()) ? 8 : 2);
            if (bitmapM10488z != null) {
                return new BitmapDrawable(bitmapM10488z);
            }
        }
        try {
            Bundle bundleM9296k = C2667q.m9296k(context, Uri.parse(f61005zy), f15800g, null, null);
            if (bundleM9296k != null) {
                Bitmap bitmap = (Bitmap) bundleM9296k.getParcelable("wallpaper");
                if (bitmap != null) {
                    str = "getPreview successful " + bitmap.hashCode();
                } else {
                    str = "bitmap is empty";
                }
                Log.d(f15803k, str);
                return new BitmapDrawable(context.getResources(), bitmap);
            }
        } catch (Exception e2) {
            Log.e(f15803k, "getWallpaper uri failed:" + e2);
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static int m9308q(@lvui Context context) {
        if ("com.android.thememanager.theme_lock_live_wallpaper".equals(n7h.m9283k(context))) {
            return !TextUtils.isEmpty(vyq.zurt("spwallpaper")) ? 2 : 1;
        }
        return 0;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m9309s(@lvui Context context) {
        if (!Arrays.asList("vermeer", "manet", "duchamp").contains(Build.DEVICE)) {
            return miuix.os.f7l8.toq("ro.hardware.fp.fod", false);
        }
        Pair<Integer, Bitmap> qVar = toq(context);
        return (qVar == null || qVar.second == null) ? false : true;
    }

    public static Pair<Integer, Bitmap> toq(@lvui Context context) {
        String str;
        try {
            Bundle bundleCall = context.getContentResolver().call(Uri.parse(f15806q), f15807s, (String) null, new Bundle());
            if (bundleCall != null) {
                Bitmap bitmap = (Bitmap) bundleCall.getParcelable(f61004x2);
                if (bitmap != null) {
                    str = "get finger bitmap successful" + bitmap.hashCode();
                } else {
                    str = "finger bitmap is empty";
                }
                Log.d(f15803k, str);
                return new Pair<>(Integer.valueOf(bundleCall.getInt(f61001qrj, -1)), bitmap);
            }
        } catch (Exception e2) {
            Log.e(f15803k, e2.getMessage());
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static synchronized void m9310y(Context context, int position) {
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("position", position);
            C2667q.m9296k(context, Uri.parse(f61005zy), f60995f7l8, null, bundle);
        } catch (Exception e2) {
            Log.e(f15803k, "getWallpaper uri failed:" + e2);
        }
    }

    public static int zy() {
        return C7317k.k.m26504g(bf2.toq.toq().getContentResolver(), f60996fn3e, 3);
    }
}
