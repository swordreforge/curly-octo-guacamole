package com.android.thememanager.settings.superwallpaper.utils;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.android.thememanager.basemodule.utils.a9;
import com.android.thememanager.basemodule.utils.vyq;
import org.json.JSONObject;
import zy.dd;

/* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.utils.k */
/* JADX INFO: compiled from: AodUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2663k {

    /* JADX INFO: renamed from: a9, reason: collision with root package name */
    public static final String f60952a9 = "com.android.thememanager.permission.AOD_RECEIVE";

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    public static final String f60953cdj = "name";

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f60954f7l8 = "page_source";

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    public static final String f60955fn3e = "dual_clock_position_x_anchor_right";

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final String f60956fu4 = "thumbnail";

    /* JADX INFO: renamed from: g */
    public static final String f15760g = "intent_target";

    /* JADX INFO: renamed from: h */
    public static final String f15761h = "aod_using_super_wallpaper";

    /* JADX INFO: renamed from: i */
    public static final String f15762i = "clock_position_y";

    /* JADX INFO: renamed from: jk, reason: collision with root package name */
    public static final String f60957jk = "com.android.thememanager.AOD_CHANGED";

    /* JADX INFO: renamed from: k */
    private static final String f15763k = "AodUtils";

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    public static final String f60958ki = "super_wallpaper";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f60959kja0;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f60960ld6 = "getThumbnailForWallpaper";

    /* JADX INFO: renamed from: mcp, reason: collision with root package name */
    public static final String f60961mcp = "reason";

    /* JADX INFO: renamed from: n */
    public static final String f15764n = "miui.miwallpaper.action.SUPER_WALLPAPER_APPLY_STATE_CHANGED";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final String f60962n7h = "getNotifyThumbnail";

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    public static final String f60963ni7 = "aod_category";

    /* JADX INFO: renamed from: o1t, reason: collision with root package name */
    public static final String f60964o1t = "state";

    /* JADX INFO: renamed from: p */
    public static final String f15765p = "wallpaper";

    /* JADX INFO: renamed from: q */
    public static final String f15766q = "miui.aod.action.router";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final String f60965qrj = "getAodThumbnail";

    /* JADX INFO: renamed from: s */
    public static final String f15767s = "style_list";

    /* JADX INFO: renamed from: t */
    public static final String f15768t = "super_wallpaper_bean";

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    public static final String f60966t8r = "clock_position_x";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f60967toq = "com.miui.aod";

    /* JADX INFO: renamed from: wvg, reason: collision with root package name */
    public static final String f60968wvg = "theme";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f60969x2 = "getClockImageForSuperWallpaper";

    /* JADX INFO: renamed from: y */
    public static final String f15769y = "style_select";

    /* JADX INFO: renamed from: z */
    private static final String f15770z = "notifyStyleName";

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    public static final String f60970zurt = "dual_clock_position_y";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final String f60971zy = "content://com.miui.aod.settings";

    static {
        f60959kja0 = Build.VERSION.SDK_INT >= 28 ? "doze_always_on" : "aod_mode";
    }

    private C2663k() {
    }

    public static int f7l8(int curPos) {
        return (curPos + 1) % 3;
    }

    /* JADX INFO: renamed from: g */
    public static int m9265g(Context context, int curPos) {
        int i2 = zy.zy(context).y;
        int i3 = i2 / 2;
        int i4 = (int) (((double) i2) * 0.11d);
        return curPos != 0 ? curPos != 2 ? i3 : i3 + i4 : i3 - i4;
    }

    /* JADX INFO: renamed from: k */
    public static Intent m9266k() {
        Intent intent = new Intent();
        intent.setPackage("com.miui.aod");
        intent.setAction(f15766q);
        intent.putExtra(f15760g, f15767s);
        intent.putExtra(f60954f7l8, "wallpaper");
        return intent;
    }

    public static boolean ld6(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), f15761h, 0) == 1;
    }

    @dd
    /* JADX INFO: renamed from: n */
    public static Bitmap m9267n(Context context, float clockPositionX, float clockPositionY, float dualClockPositionXAnchorRight, float dualClockPositionY) throws Throwable {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "super_wallpaper");
            jSONObject.put("clock_position_x", clockPositionX);
            jSONObject.put("clock_position_y", clockPositionY);
            jSONObject.put("dual_clock_position_x_anchor_right", dualClockPositionXAnchorRight);
            jSONObject.put("dual_clock_position_y", dualClockPositionY);
            Bundle bundle = new Bundle();
            bundle.putString(f15768t, jSONObject.toString());
            Log.d(f15763k, "getClockImageForSuperWallpaper super_wallpaper_bean:" + jSONObject.toString());
            Bundle bundleM9296k = C2667q.m9296k(context, Uri.parse(f60971zy), f60969x2, null, bundle);
            if (bundleM9296k != null) {
                return (Bitmap) bundleM9296k.getParcelable("image");
            }
            return null;
        } catch (Exception e2) {
            Log.e(f15763k, "getClockImageForSuperWallpaper failed:" + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: p */
    public static boolean m9268p(Context context) {
        return Settings.Secure.getInt(context.getContentResolver(), f60959kja0, 0) == 1;
    }

    /* JADX INFO: renamed from: q */
    public static int m9269q(Context context) {
        if (Settings.Secure.getInt(context.getContentResolver(), f15761h, 0) == 1) {
            return !TextUtils.isEmpty(vyq.zurt("spaod")) ? 2 : 1;
        }
        return 0;
    }

    public static boolean qrj() {
        try {
            Context qVar = bf2.toq.toq();
            int identifier = qVar.getResources().getIdentifier("config_dozeAlwaysOnDisplayAvailable", "bool", "android");
            if (identifier > 0) {
                return qVar.getResources().getBoolean(identifier);
            }
            return false;
        } catch (Exception e2) {
            Log.e(f15763k, "Error while checking AOD support: ", e2);
            return false;
        }
    }

    /* JADX INFO: renamed from: s */
    public static Bitmap m9270s(Context context) throws Throwable {
        try {
            Bundle bundleM9296k = C2667q.m9296k(context, Uri.parse(f60971zy), f60960ld6, null, new Bundle());
            if (bundleM9296k != null) {
                return (Bitmap) bundleM9296k.getParcelable("image");
            }
            return null;
        } catch (Exception e2) {
            Log.e(f15763k, "getPreview failed:" + e2);
            return null;
        }
    }

    public static Intent toq(boolean state, float clockPositionX, float clockPositionY, float dualClockPositionXAnchorRight, float dualClockPositionY) {
        Intent intent = new Intent();
        intent.setPackage("com.miui.aod");
        intent.setAction(f15766q);
        intent.putExtra(f15760g, f15769y);
        intent.putExtra(f60954f7l8, "wallpaper");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "super_wallpaper");
            jSONObject.put("clock_position_x", clockPositionX);
            jSONObject.put("clock_position_y", clockPositionY);
            jSONObject.put("dual_clock_position_x_anchor_right", dualClockPositionXAnchorRight);
            jSONObject.put("dual_clock_position_y", dualClockPositionY);
            intent.putExtra("state", state);
            intent.putExtra(f15768t, jSONObject.toString());
            Log.d(f15763k, "getAodStyleSelectIntent super_wallpaper_bean:" + jSONObject.toString());
        } catch (Exception e2) {
            Log.e(f15763k, "getAodStyleSelectIntent failed:" + e2);
        }
        return intent;
    }

    public static void x2(Context context, boolean state, float clockPositionX, float clockPositionY, float dualClockPositionXAnchorRight, float dualClockPositionY, String aodCategory) {
        try {
            Intent intent = new Intent();
            intent.setAction(f15764n);
            intent.setPackage(a9.zy());
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "super_wallpaper");
            jSONObject.put("clock_position_x", clockPositionX);
            jSONObject.put("clock_position_y", clockPositionY);
            jSONObject.put("dual_clock_position_x_anchor_right", dualClockPositionXAnchorRight);
            jSONObject.put("dual_clock_position_y", dualClockPositionY);
            jSONObject.put("aod_category", aodCategory);
            intent.putExtra("theme", true);
            intent.putExtra("state", state);
            intent.putExtra(f15768t, jSONObject.toString());
            Log.d(f15763k, "notifySuperWallpaperApplyStateChanged super_wallpaper_bean:" + jSONObject.toString());
            context.sendBroadcast(intent);
        } catch (Exception e2) {
            Log.e(f15763k, "notifySuperWallpaperApplyStateChanged " + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: y */
    public static Pair<String, Bitmap> m9271y(Context context) throws Throwable {
        try {
            Bundle bundleM9296k = C2667q.m9296k(context, Uri.parse(f60971zy), f60962n7h, null, new Bundle());
            if (bundleM9296k != null) {
                return new Pair<>(bundleM9296k.getString(f15770z), (Bitmap) bundleM9296k.getParcelable(f60956fu4));
            }
        } catch (Exception e2) {
            Log.e(f15763k, e2.getMessage());
        }
        return null;
    }

    public static Bitmap zy(Context context) throws Throwable {
        try {
            Bundle bundleM9296k = C2667q.m9296k(context, Uri.parse(f60971zy), f60965qrj, null, new Bundle());
            if (bundleM9296k != null) {
                return (Bitmap) bundleM9296k.getParcelable(f60956fu4);
            }
        } catch (Exception e2) {
            Log.e(f15763k, e2.getMessage());
        }
        return null;
    }
}
