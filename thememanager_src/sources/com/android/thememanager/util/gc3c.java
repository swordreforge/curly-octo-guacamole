package com.android.thememanager.util;

import android.app.Activity;
import android.app.KeyguardManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.util.DisplayMetrics;
import android.view.Window;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import java.lang.reflect.Method;
import java.util.Random;
import miuix.view.InterfaceC7387s;

/* JADX INFO: compiled from: UIUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class gc3c {

    /* JADX INFO: renamed from: k */
    private static DisplayMetrics f16510k = null;

    /* JADX INFO: renamed from: q */
    private static Random f16511q = null;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static float f61248toq = -1.0f;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static int f61249zy = -1;

    public static boolean cdj(Activity activity) {
        return (activity == null || activity.isFinishing() || activity.isDestroyed()) ? false : true;
    }

    private static int f7l8(Resources resources, String name, String defType, String defPackage) {
        int identifier = resources.getIdentifier(name, defType, defPackage);
        if (identifier > 0) {
            return resources.getDimensionPixelOffset(identifier);
        }
        return -1;
    }

    public static void fn3e() {
        f16510k = null;
        f61248toq = -1.0f;
        f61249zy = -1;
        C1819o.uv6();
        com.android.thememanager.basemodule.utils.y9n.m7245f();
    }

    public static void fu4(boolean darkMode, Activity activity) {
        Class<?> cls = activity.getWindow().getClass();
        try {
            Class<?> cls2 = Class.forName("android.view.MiuiWindowManager$LayoutParams");
            int i2 = cls2.getField("EXTRA_FLAG_STATUS_BAR_DARK_MODE").getInt(cls2);
            Class<?> cls3 = Integer.TYPE;
            Method method = cls.getMethod("setExtraFlags", cls3, cls3);
            Window window = activity.getWindow();
            Object[] objArr = new Object[2];
            objArr[0] = Integer.valueOf(darkMode ? i2 : 0);
            objArr[1] = Integer.valueOf(i2);
            method.invoke(window, objArr);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: g */
    public static int m9776g(int level) {
        int i2 = level % 6;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? R.drawable.thumbnail_big_corner_bg_yellow : R.drawable.thumbnail_big_corner_bg_light_purple : R.drawable.thumbnail_big_corner_bg_light_blue : R.drawable.thumbnail_big_corner_bg_sky_blue : R.drawable.thumbnail_big_corner_bg_light_pink : R.drawable.thumbnail_big_corner_bg_pink : R.drawable.thumbnail_big_corner_bg_yellow;
    }

    /* JADX INFO: renamed from: h */
    public static boolean m9777h() {
        return Settings.Global.getInt(C2082k.m7998k().getContentResolver(), "force_fsg_nav_bar", 0) != 0;
    }

    /* JADX INFO: renamed from: i */
    public static int m9778i(int pxValue) {
        if (f61248toq <= 0.0f) {
            f61248toq = C2082k.zy().toq().getResources().getDisplayMetrics().density;
        }
        return (int) (pxValue / f61248toq);
    }

    /* JADX INFO: renamed from: k */
    public static int m9779k(float dp) {
        if (f61248toq <= 0.0f) {
            f61248toq = C2082k.zy().toq().getResources().getDisplayMetrics().density;
        }
        return (int) ((f61248toq * dp) + 0.5f);
    }

    public static boolean ki(Activity activity) {
        return activity != null && activity.isInMultiWindowMode();
    }

    public static Point kja0(Activity activity) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        activity.getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static int ld6(int level) {
        int i2 = level % 6;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? R.color.preview_bg_yellow : R.color.preview_bg_light_purple : R.color.preview_bg_light_blue : R.color.preview_bg_sky_blue : R.color.preview_bg_light_pink : R.color.preview_bg_pink : R.color.preview_bg_yellow;
    }

    /* JADX INFO: renamed from: n */
    public static int m9780n(int level) {
        int i2 = level % 6;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? i2 != 5 ? R.drawable.thumbnail_bg_yellow : R.drawable.thumbnail_bg_light_purple : R.drawable.thumbnail_bg_light_blue : R.drawable.thumbnail_bg_sky_blue : R.drawable.thumbnail_bg_light_pink : R.drawable.thumbnail_bg_pink : R.drawable.thumbnail_bg_yellow;
    }

    public static int n7h() {
        if (f61249zy == -1) {
            f61249zy = qrj(com.android.thememanager.basemodule.utils.kja0.m7111p()) + com.android.thememanager.basemodule.utils.kja0.m7114y(com.android.thememanager.basemodule.utils.y9n.jp0y() ? R.dimen.search_panel_notch_height : R.dimen.search_panel_normal_height);
        }
        return f61249zy;
    }

    public static void ni7(Activity activity) {
        if (Build.VERSION.SDK_INT >= 27) {
            activity.setShowWhenLocked(true);
        }
    }

    /* JADX INFO: renamed from: p */
    public static int m9781p() {
        Resources resources = C2082k.m7998k().getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* JADX INFO: renamed from: q */
    public static int m9782q() {
        if (f16511q == null) {
            f16511q = new Random();
        }
        return f16511q.nextInt(7);
    }

    public static int qrj(Resources resources) {
        return f7l8(resources, "status_bar_height", "dimen", "android");
    }

    /* JADX INFO: renamed from: s */
    public static Point m9783s(Context activity) {
        if (C1807g.zurt()) {
            return C1807g.m7083t(activity) ? new Point(1080, 2460) : new Point(880, 2640);
        }
        return null;
    }

    public static boolean t8r(Context context) {
        KeyguardManager keyguardManager = (KeyguardManager) context.getSystemService("keyguard");
        if (keyguardManager != null) {
            return keyguardManager.isKeyguardLocked();
        }
        return false;
    }

    public static int toq(Resources resources) {
        return qrj(resources) + zy(resources);
    }

    public static int x2() {
        return C1819o.jk(bf2.toq.toq());
    }

    /* JADX INFO: renamed from: y */
    public static DisplayMetrics m9784y(Context context) {
        if (f16510k == null) {
            f16510k = context.getResources().getDisplayMetrics();
        }
        return f16510k;
    }

    public static void zurt(@zy.lvui InterfaceC7387s actionMode, boolean isSelectAll) {
        if (fti.f61240zy) {
            actionMode.cdj(16908314, "", isSelectAll ? R.drawable.action_select_all : R.drawable.action_deselect_all);
        } else {
            actionMode.ki(16908314, isSelectAll ? R.string.miuix_appcompat_select_all : R.string.miuix_appcompat_deselect_all);
        }
    }

    public static int zy(Resources resources) {
        return f7l8(resources, "action_bar_default_height", "dimen", miuix.core.util.x2.f87403zy);
    }
}
