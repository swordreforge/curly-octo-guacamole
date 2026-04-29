package com.android.thememanager.settings.superwallpaper.utils;

import android.app.UiModeManager;
import android.content.Context;
import android.graphics.Point;
import android.hardware.display.DisplayManager;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.Display;
import java.io.File;

/* JADX INFO: compiled from: CommonUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class zy {

    /* JADX INFO: renamed from: k */
    public static final boolean f15809k = true;

    private zy() {
    }

    public static boolean f7l8() {
        return Build.VERSION.SDK_INT >= 27;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m9311g() {
        return true;
    }

    /* JADX INFO: renamed from: k */
    public static int m9312k(Context context, String name) {
        return toq(context, name, "drawable");
    }

    public static String ld6(String str) {
        if (TextUtils.isEmpty(str) || str.length() == 0) {
            return "";
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /* JADX INFO: renamed from: n */
    public static int m9313n(Context context, String name) {
        return toq(context, name, "string");
    }

    /* JADX INFO: renamed from: p */
    public static boolean m9314p() {
        return !new File("/data/system/theme/fonts").exists();
    }

    /* JADX INFO: renamed from: q */
    public static String m9315q(Context context, String name) {
        return context.getResources().getString(toq(context, name, "string"));
    }

    /* JADX INFO: renamed from: s */
    public static boolean m9316s(Context context) {
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "is_super_wallpaper_user") == 1;
        } catch (Exception unused) {
            return false;
        }
    }

    private static int toq(Context context, String name, String type) {
        try {
            return context.getResources().getIdentifier(name, type, context.getPackageName());
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    /* JADX INFO: renamed from: y */
    public static boolean m9317y(Context ctx) {
        UiModeManager uiModeManager = (UiModeManager) ctx.getSystemService("uimode");
        return uiModeManager != null && uiModeManager.getNightMode() == 2;
    }

    public static Point zy(Context context) {
        Display display = ((DisplayManager) context.getSystemService("display")).getDisplay(0);
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }
}
