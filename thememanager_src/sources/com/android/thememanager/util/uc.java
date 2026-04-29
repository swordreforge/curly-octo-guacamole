package com.android.thememanager.util;

import android.app.Activity;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.opengl.GLUtils;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import bek6.C1367k;
import com.android.thememanager.C2082k;
import com.android.thememanager.C2964y;
import com.android.thememanager.R;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.PathEntry;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.android.thememanager.model.ResourceResolver;
import com.android.thememanager.model.WallpaperApplyInfos;
import com.android.thememanager.service.VideoWallpaperService;
import com.android.thememanager.settings.C2687z;
import com.android.thememanager.settings.WallpaperSettingsActivity;
import com.android.thememanager.settings.personalize.C2567p;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import com.android.thememanager.util.C2763c;
import com.android.thememanager.wallpaper.C2949g;
import com.android.thememanager.wallpaper.C2951n;
import com.miui.miwallpaper.C5306p;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import m4.C6795k;
import miui.util.InputStreamLoader;
import miuix.graphics.C7111k;
import org.json.JSONException;
import org.json.JSONObject;
import p001b.InterfaceC1357q;
import qkj8.C7617k;

/* JADX INFO: compiled from: WallpaperUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class uc implements InterfaceC1789q, p001b.f7l8 {

    /* JADX INFO: renamed from: a */
    public static final int f16814a = 1;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f61417ab;
    private static volatile boolean ac = false;
    private static final Object ad;
    private static int am = 0;
    public static final String an = "pref_key_wallpaper_screen_scrolled_span";
    private static final String as = "content://com.miui.miwallpaper.wallpaper";
    private static volatile boolean ax = false;
    private static final Set<String> ay;
    private static final String az = "default_super_wallpaper";

    /* JADX INFO: renamed from: b */
    public static final int f16815b = -1;
    private static String ba = null;
    public static final String bb = "currentDesktopWallpaperPath";
    private static Boolean be = null;
    private static final String bg = "support_super_wallpaper";
    private static final String bl = "GET_SUPPORT_SUPER_WALLPAPER";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f61418bo = "wallpaperColorMode";
    public static final int bp = 2;
    private static String bq = null;
    public static final String bv = "pref_key_wallpaper_screen_span";

    /* JADX INFO: renamed from: c */
    public static final String f16816c = "com.mfashiongallery.emag.wallpaper.DesktopWallpaperService";

    /* JADX INFO: renamed from: d */
    private static final String f16817d = "getHomePreview";

    /* JADX INFO: renamed from: e */
    public static final String f16818e = "common";

    /* JADX INFO: renamed from: f */
    public static final String f16819f = "com.mfashiongallery.emag";

    /* JADX INFO: renamed from: g */
    public static final String f16820g = "Wallpaper_uri";

    /* JADX INFO: renamed from: h */
    public static final int f16821h = 16;

    /* JADX INFO: renamed from: i */
    public static final int f16822i = 32;
    private static final String id = "_split";
    private static final String in = "com.miui.aod";

    /* JADX INFO: renamed from: j */
    public static final String f16823j = "miui_code_time";

    /* JADX INFO: renamed from: k */
    private static final String f16824k = "WallpaperUtils";

    /* JADX INFO: renamed from: l */
    public static final String f16825l = "com.android.systemui";

    /* JADX INFO: renamed from: m */
    public static final String f16826m = "apply_wallpaper_id";

    /* JADX INFO: renamed from: n */
    public static final String f16827n = "miui.intent.action.START_WALLPAPER_DETAIL";

    /* JADX INFO: renamed from: o */
    public static final String f16828o = "incall_show_version";

    /* JADX INFO: renamed from: p */
    public static final int f16829p = 8;

    /* JADX INFO: renamed from: q */
    public static final String f16830q = "apply_default_wallpaper";

    /* JADX INFO: renamed from: r */
    public static final String f16831r = "com.android.systemui.wallpaper.Video24WallpaperService";

    /* JADX INFO: renamed from: s */
    public static final int f16832s = 2;

    /* JADX INFO: renamed from: t */
    public static final int f16833t = 206000260;

    /* JADX INFO: renamed from: u */
    private static final String f16834u;

    /* JADX INFO: renamed from: v */
    private static final String f16835v = "result_bitmap";

    /* JADX INFO: renamed from: w */
    private static final String f16836w = "getLockScreenPreview";

    /* JADX INFO: renamed from: x */
    public static final int f16837x = 0;

    /* JADX INFO: renamed from: y */
    public static final int f16838y = 1;

    /* JADX INFO: renamed from: z */
    public static final int f16839z = 206000231;

    static {
        String strM26160k = miuix.os.f7l8.m26160k("ro.miui.product.home", InterfaceC1789q.k9);
        f16834u = strM26160k;
        f61417ab = strM26160k + ".launcher.settings";
        ad = new Object();
        am = 0;
        HashSet hashSet = new HashSet();
        ay = hashSet;
        hashSet.add("cappu");
        hashSet.add("capricorn");
        hashSet.add("chiron");
        hashSet.add("flo");
        hashSet.add("helium");
        hashSet.add("hydrogen");
        hashSet.add("jason");
        hashSet.add("lithium");
        hashSet.add("markw");
        hashSet.add("mido");
        hashSet.add("natrium");
        hashSet.add("nikel");
        hashSet.add("omega");
        hashSet.add("oxygen");
        hashSet.add("prada");
        hashSet.add("riva");
        hashSet.add("santoni");
        hashSet.add("scorpio");
        hashSet.add("song");
        hashSet.add("ugg");
        hashSet.add("ugglite");
        be = null;
    }

    /* JADX INFO: renamed from: a */
    public static Pair<File, File> m10018a(File videoFile) {
        File file;
        String absolutePath = videoFile.getAbsolutePath();
        String strM9702y = d8wk.m9702y(absolutePath);
        if (absolutePath.startsWith("/system")) {
            file = new File(C1788k.f10167c + strM9702y + id);
        } else {
            file = new File(videoFile.getParent() + File.separator + strM9702y + id);
        }
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            return jz5.toq(videoFile, new File(file, strM9702y + com.android.thememanager.basemodule.resource.constants.toq.dt), new File(file, strM9702y + com.android.thememanager.basemodule.resource.constants.toq.pm14));
        } catch (IOException unused) {
            return new Pair<>(null, null);
        }
    }

    private static C2687z.k a9(int rate, int allFrameCount, int smallScreenFrameCount, int stiffness, String thumbnailPath) {
        C2687z.k kVar = new C2687z.k();
        kVar.f15946k = "sensor";
        kVar.f61027toq = rate;
        kVar.f61028zy = allFrameCount;
        kVar.f15948q = smallScreenFrameCount;
        kVar.f15945g = stiffness;
        kVar.f15947n = thumbnailPath;
        return kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void a98o(int i2, boolean z2, boolean z3, WallpaperApplyInfos wallpaperApplyInfos) {
        Object[] objArr = (i2 & 1) == 1 || (i2 & 8) == 8;
        Object[] objArr2 = (i2 & 2) == 2 || (i2 & 16) == 16;
        char c2 = (objArr == true && objArr2 == true) ? (char) 2 : objArr2 != false ? (char) 1 : (char) 0;
        Integer[][][] numArr = (Integer[][][]) Array.newInstance((Class<?>) Integer.class, 3, 2, 2);
        numArr[0][0][0] = Integer.valueOf(R.string.toast_lockscreen_apply_failured);
        numArr[0][0][1] = Integer.valueOf(R.string.toast_lockscreen_apply_failured);
        numArr[0][1][0] = Integer.valueOf(R.string.toast_lockscreen_apply_success);
        numArr[0][1][1] = Integer.valueOf(R.string.toast_lockscreen_apply_success);
        numArr[1][0][0] = Integer.valueOf(R.string.toast_home_apply_failured);
        numArr[1][0][1] = Integer.valueOf(R.string.toast_home_apply_success);
        numArr[1][1][0] = Integer.valueOf(R.string.toast_home_apply_failured);
        numArr[1][1][1] = Integer.valueOf(R.string.toast_home_apply_success);
        numArr[2][0][0] = Integer.valueOf(R.string.toast_both_all_apply_failured);
        numArr[2][0][1] = Integer.valueOf(R.string.toast_lockscreen_apply_failured_but_home_apply_success);
        numArr[2][1][0] = Integer.valueOf(R.string.toast_lockscreen_apply_success_but_home_apply_failured);
        numArr[2][1][1] = Integer.valueOf(R.string.toast_both_all_apply_success);
        String string = C2082k.zy().toq().getString(numArr[c2][z2 ? 1 : 0][z3 ? 1 : 0].intValue());
        if (wallpaperApplyInfos != null && wallpaperApplyInfos.isSyncToFashionGallery()) {
            if (z2) {
                return;
            }
            if (z2 && z3) {
                return;
            }
        }
        com.android.thememanager.basemodule.utils.nn86.toq(string, 0);
    }

    /* JADX INFO: renamed from: b */
    public static void m10019b(Context context, boolean z2) {
        if (C2951n.fn3e().kja0()) {
            Settings.Secure.putInt(context.getContentResolver(), an, z2 ? 1 : 0);
        } else {
            Settings.Global.putInt(context.getContentResolver(), an, z2 ? 1 : 0);
        }
    }

    public static boolean bf2(Context context, Bitmap bitmap, int width, int height, boolean isScrollableWallpaper, WallpaperApplyInfos applyInfos) throws Throwable {
        FileOutputStream fileOutputStreamOpenFileOutput;
        FileInputStream fileInputStreamOpenFileInput;
        FileInputStream fileInputStream = null;
        try {
            try {
                fileOutputStreamOpenFileOutput = context.openFileOutput("apply_wallpaper.tmp", 0);
                try {
                    bitmap.compress(C1807g.zurt() ? Bitmap.CompressFormat.JPEG : Bitmap.CompressFormat.PNG, 100, fileOutputStreamOpenFileOutput);
                    fileInputStreamOpenFileInput = context.openFileInput("apply_wallpaper.tmp");
                } catch (IOException e2) {
                    e = e2;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e3) {
            e = e3;
            fileOutputStreamOpenFileOutput = null;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStreamOpenFileOutput = null;
        }
        try {
            boolean zI1 = i1(context, fileInputStreamOpenFileInput, width, height, isScrollableWallpaper, applyInfos);
            context.getFileStreamPath("apply_wallpaper.tmp").delete();
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileInputStreamOpenFileInput);
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileOutputStreamOpenFileOutput);
            return zI1;
        } catch (IOException e4) {
            e = e4;
            fileInputStream = fileInputStreamOpenFileInput;
            Log.w(f16824k, "apply home wallpaper by bitmap failed!", e);
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileInputStream);
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileOutputStreamOpenFileOutput);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = fileInputStreamOpenFileInput;
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileInputStream);
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileOutputStreamOpenFileOutput);
            throw th;
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m10020c() {
        if (com.android.thememanager.basemodule.utils.a9.m7000y(bf2.toq.toq(), "com.miui.miwallpaper") >= 206000472) {
            Intent intent = new Intent(miuix.android.content.toq.f86697toq);
            intent.setPackage("com.miui.miwallpaper");
            bf2.toq.toq().sendBroadcast(intent);
        }
    }

    public static boolean cdj(Context context, Bitmap bitmap, Bitmap darkBitmap, boolean isLockscreen, boolean isScrollableWallpaper, WallpaperApplyInfos applyInfos, boolean isApplyTheme, boolean needDark) throws Throwable {
        boolean zUv6;
        Bitmap bitmap2 = (C1819o.d2ok(context) && darkBitmap != null && ncyb(darkBitmap)) ? darkBitmap : bitmap;
        Log.i(f16824k, "applyWallpaperByBitmap: " + isLockscreen);
        if (darkBitmap != null && com.android.thememanager.basemodule.utils.o1t.m7179z()) {
            h7am.n7h(bitmap, darkBitmap, isLockscreen);
        }
        boolean zBf2 = false;
        if (isLockscreen) {
            String str = InterfaceC1789q.sxpt;
            yz(str);
            if (C2951n.fn3e().kja0()) {
                StringBuilder sb = new StringBuilder();
                sb.append("applyWallpaperByBitmap: apply lock wallpaper, start AIDL to WallpaperService ");
                sb.append(darkBitmap != null);
                Log.i(f16824k, sb.toString());
                zUv6 = darkBitmap != null ? C2951n.fn3e().uv6(bitmap2, bitmap, darkBitmap, true, needDark) : C2951n.fn3e().m10480j(bitmap2, true, needDark);
                Log.i(f16824k, "applyWallpaperByBitmap: apply lock wallpaper, AIDL to WallpaperService finish, saveSuccess: " + zUv6);
            } else {
                zUv6 = true;
            }
            String absolutePath = context.getFileStreamPath("lockwallpaper.tmp").getAbsolutePath();
            if (C2763c.mcp(bitmap2, absolutePath, true, 100)) {
                if (d8wk.toq(absolutePath, str)) {
                    zBf2 = zUv6;
                } else {
                    Log.w(f16824k, "tmpPath copy to RUNTIME_PATH_LOCKSCREEN failed!");
                }
                if (applyInfos != null && applyInfos.isSyncToFashionGallery()) {
                    m10027k(applyInfos.getOriginPath(), bitmap2);
                }
            } else {
                Log.w(f16824k, "bitmap save to tmpPath failed!");
            }
        } else if (C2951n.fn3e().kja0()) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("applyWallpaperByBitmap: apply home wallpaper, start AIDL to WallpaperService ");
            sb2.append(darkBitmap != null);
            Log.i(f16824k, sb2.toString());
            zBf2 = darkBitmap != null ? C2951n.fn3e().uv6(bitmap2, bitmap, darkBitmap, false, needDark) : C2951n.fn3e().m10480j(bitmap2, false, needDark);
            Log.i(f16824k, "applyWallpaperByBitmap: apply home wallpaper, AIDL to WallpaperService finish, saveSuccess: " + zBf2);
            m10019b(context, isScrollableWallpaper);
        } else {
            Pair<Integer, Integer> pairJp0y = jp0y(isScrollableWallpaper);
            zBf2 = bf2(context, bitmap2, ((Integer) pairJp0y.first).intValue(), ((Integer) pairJp0y.second).intValue(), isScrollableWallpaper, applyInfos);
        }
        if (!zBf2) {
            Log.w(f16824k, "applyWallpaperByBitmap fail.");
        } else if (C1807g.m7081r()) {
            C2567p.m9074s(isLockscreen);
        }
        return zBf2;
    }

    public static boolean ch() {
        Bundle bundleBwp = WallpaperSettingsActivity.bwp(bf2.toq.toq(), Uri.parse("content://com.miui.miwallpaper.wallpaper"), "GET_SUPPORT_SUPER_WALLPAPER", null, null);
        if (bundleBwp == null || !bundleBwp.getBoolean(bg) || !x9kr()) {
            return false;
        }
        com.android.thememanager.basemodule.utils.cdj.zurt((WallpaperManager) bf2.toq.toq().getSystemService("wallpaper"), com.android.thememanager.basemodule.utils.o1t.m7170h() ? new ComponentName("com.miui.miwallpaper", bundleBwp.getString(az, p001b.f7l8.f53771c25)) : new ComponentName("com.miui.miwallpaper", bundleBwp.getString(az, p001b.f7l8.f53777exv8)));
        C7617k.toq().m27925k("com.android.thememanager.theme_lock_live_wallpaper");
        C2082k.m7998k().sendBroadcast(new Intent(miuix.android.content.toq.f86697toq));
        n5r1(new String[0]);
        h7am.m9796k(true);
        h7am.m9796k(false);
        return true;
    }

    private static boolean d2ok(int width, int height, Context context, boolean isScrollableWallpaper) {
        Pair<Integer, Integer> pairJp0y = jp0y(isScrollableWallpaper);
        return width == ((Integer) pairJp0y.first).intValue() && height == ((Integer) pairJp0y.second).intValue();
    }

    public static Bitmap d3(String imagePath, int suggestWidth, int suggestHeight) {
        if (imagePath != null) {
            File file = new File(imagePath);
            if (!file.canRead()) {
                return null;
            }
            try {
                BitmapFactory.Options optionsWvg = wvg(C7111k.mcp(imagePath), suggestWidth, suggestHeight);
                return C7111k.t8r(file.getAbsolutePath(), optionsWvg.outWidth, optionsWvg.outHeight, false);
            } catch (IOException unused) {
            }
        }
        return null;
    }

    private static boolean dd() {
        return new File(InterfaceC1789q.iq).exists();
    }

    /* JADX INFO: renamed from: e */
    public static void m10021e() {
        nn86(InterfaceC1789q.iq, "splockscreen");
    }

    private static void ek5k() {
        nn86(InterfaceC1789q.rg, "wallpaper");
    }

    public static boolean eqxt() {
        return C2951n.fn3e().kja0() ? Settings.Secure.getInt(bf2.toq.toq().getContentResolver(), an, -1) == 1 : Settings.Global.getInt(bf2.toq.toq().getContentResolver(), an, -1) == 1;
    }

    /* JADX INFO: renamed from: f */
    private static void m10022f() {
        C2082k.m7998k().sendBroadcast(new Intent(miuix.android.content.toq.f86697toq));
        Activity activityM10533k = C2964y.toq().m10533k();
        C6795k.zy(C2082k.m7998k(), 4096L, activityM10533k != null && C1807g.lvui() && C1819o.m7164r(bf2.toq.toq()) && C1819o.dd(activityM10533k));
    }

    public static boolean f7l8(Context context, String originPath, jbh trackData) {
        return kja0(context, originPath, null, null, true, false, false, null, trackData);
    }

    public static void fn3e(Resource r2, String thumbnailPath, String previewPath, boolean withLocal) {
        if (!TextUtils.isEmpty(thumbnailPath)) {
            ArrayList arrayList = new ArrayList();
            PathEntry pathEntry = new PathEntry();
            pathEntry.setOnlinePath(thumbnailPath);
            if (withLocal) {
                File fileQrj = com.android.thememanager.basemodule.imageloader.x2.qrj(thumbnailPath);
                if (fileQrj != null) {
                    pathEntry.setLocalPath(fileQrj.getPath());
                } else {
                    pathEntry.setLocalPath(null);
                }
            }
            arrayList.add(pathEntry);
            r2.setThumbnails(arrayList);
        }
        if (TextUtils.isEmpty(previewPath)) {
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        PathEntry pathEntry2 = new PathEntry();
        pathEntry2.setOnlinePath(previewPath);
        if (withLocal) {
            File fileQrj2 = com.android.thememanager.basemodule.imageloader.x2.qrj(previewPath);
            if (fileQrj2 != null) {
                pathEntry2.setLocalPath(fileQrj2.getPath());
            } else {
                pathEntry2.setLocalPath(null);
            }
        }
        arrayList2.add(pathEntry2);
        r2.setPreviews(arrayList2);
    }

    private static float fti(int pic_width, int pic_height) {
        Point pointN7h = com.android.thememanager.basemodule.utils.y9n.n7h(true);
        if (pointN7h == null) {
            return 1.0f;
        }
        return (((double) pic_width) >= ((double) pointN7h.x) * 0.7d || ((double) pic_height) >= ((double) pointN7h.y) * 0.7d) ? 0.5f : 1.0f;
    }

    public static Bitmap fu4(WallpaperManager wm) {
        Drawable drawable = wm.getDrawable();
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        return null;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m10023g(Context context, boolean isLockscreen) {
        if (!C1807g.zurt() && com.android.thememanager.basemodule.utils.y9n.lvui()) {
            com.android.thememanager.ncyb.wvg(isLockscreen, com.android.thememanager.ncyb.f60589qrj);
        }
        boolean zY9n = true;
        if (isLockscreen) {
            m10026j();
            vyq();
            y9n(context, false);
            C7617k.toq().m27925k("com.miui.home.none_provider");
            context.sendBroadcast(new Intent(miuix.android.content.toq.f86697toq));
        } else {
            lrht(context, true, true);
            ek5k();
            zY9n = y9n(context, true);
        }
        if (zY9n) {
            h7am.m9796k(isLockscreen);
            if (C1807g.m7081r()) {
                C2567p.m9074s(isLockscreen);
            }
        }
        if (zY9n && C1807g.zurt()) {
            com.android.thememanager.ncyb.wvg(isLockscreen, com.android.thememanager.ncyb.f60589qrj);
        }
        return zY9n;
    }

    public static WallpaperManager gvn7(Context context) {
        WallpaperManager wallpaperManager = (WallpaperManager) context.getApplicationContext().getSystemService("wallpaper");
        if (wallpaperManager == null) {
            Log.w(f16824k, "WallpaperManager is null!");
        }
        return wallpaperManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01b2  */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r14v4, types: [int] */
    /* JADX WARN: Type inference failed for: r23v0, types: [android.content.Context] */
    /* JADX WARN: Type inference failed for: r32v0, types: [com.android.thememanager.util.jbh] */
    /* JADX WARN: Type inference failed for: r3v7, types: [android.content.Intent] */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m10024h(android.content.Context r23, java.lang.String r24, android.graphics.Bitmap r25, android.graphics.Matrix r26, boolean r27, boolean r28, boolean r29, boolean r30, android.graphics.Bitmap r31, com.android.thememanager.util.jbh r32, com.android.thememanager.model.WallpaperApplyInfos r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 749
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.uc.m10024h(android.content.Context, java.lang.String, android.graphics.Bitmap, android.graphics.Matrix, boolean, boolean, boolean, boolean, android.graphics.Bitmap, com.android.thememanager.util.jbh, com.android.thememanager.model.WallpaperApplyInfos):boolean");
    }

    private static void hb() {
        File file = new File(InterfaceC1789q.re);
        if (file.exists()) {
            file.delete();
            com.android.thememanager.basemodule.utils.vyq.f7l8(InterfaceC1789q.gx2z);
            new File(InterfaceC1789q.sxpt).delete();
        }
        if (C1807g.zurt()) {
            try {
                C1821p.ki(mcp.m9880y(InterfaceC1789q.jk2b));
                com.android.thememanager.basemodule.utils.vyq.f7l8(InterfaceC1789q.jk2b);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        if (C1807g.lvui()) {
            C1821p.ki(mcp.m9880y(InterfaceC1789q.k3));
            C1821p.ki(mcp.m9880y(InterfaceC1789q.sxpt));
            com.android.thememanager.basemodule.utils.vyq.f7l8(InterfaceC1789q.k3);
        }
    }

    private static void hyr(Context context) {
        Intent intent = new Intent(C2663k.f60957jk);
        intent.setPackage("com.miui.aod");
        context.sendBroadcast(intent, C2663k.f60952a9);
    }

    /* JADX INFO: renamed from: i */
    public static void m10025i(Context context, Bitmap destBitmap, String originPath, boolean isLockscreen) {
        if (isLockscreen) {
            C1821p.zy(InterfaceC1789q.sxpt, 509);
        } else if (destBitmap == null) {
            InputStreamLoader inputStreamLoader = new InputStreamLoader(originPath);
            C1821p.f7l8(inputStreamLoader.get(), new File(InterfaceC1789q.rg));
            inputStreamLoader.close();
        } else {
            C2763c.m9653t(destBitmap, InterfaceC1789q.rg);
        }
        com.android.thememanager.basemodule.utils.vyq.jp0y(isLockscreen ? "lockscreen" : "wallpaper", originPath, null, null, com.android.thememanager.basemodule.utils.bf2.m7004g(originPath) ? originPath.substring(originPath.lastIndexOf(47) + 1) : context.getString(R.string.theme_description_title_customized), null, (String) ch.i1(ch.mcp(originPath)).second);
    }

    private static boolean i1(Context context, InputStream is, int sourceWidth, int sourceHeight, boolean isScrollableWallpaper, WallpaperApplyInfos infos) {
        WallpaperManager wallpaperManagerGvn7 = gvn7(context);
        boolean z2 = true;
        if (wallpaperManagerGvn7 == null) {
            return false;
        }
        if (!m10028l()) {
            int i2 = isScrollableWallpaper ? 2 : 1;
            Point pointFn3e = com.android.thememanager.basemodule.utils.y9n.fn3e();
            if (sourceWidth <= 0 || sourceHeight <= 0) {
                wallpaperManagerGvn7.suggestDesiredDimensions(pointFn3e.x * i2, pointFn3e.y);
            } else {
                int i3 = pointFn3e.y;
                wallpaperManagerGvn7.suggestDesiredDimensions((sourceWidth * i3) / sourceHeight, i3);
            }
            try {
                Settings.System.putFloat(context.getContentResolver(), bv, i2);
            } catch (Exception e2) {
                Log.w(f16824k, "putFloat pref_key_wallpaper_screen_span fail!", e2);
            }
        }
        m10019b(context, isScrollableWallpaper);
        try {
            if (C1807g.zurt()) {
                wallpaperManagerGvn7.suggestDesiredDimensions(sourceWidth, sourceHeight);
                Log.d(f16824k, "setStream: sourceHeight = " + sourceWidth + ",sourceHeight：" + sourceHeight);
            }
            Log.i(f16824k, "start setStream");
            am = wallpaperManagerGvn7.setStream(is, null, true, 1);
            Log.i(f16824k, "start setStream finish");
        } catch (IOException e3) {
            e = e3;
            z2 = false;
        }
        try {
            m10019b(context, isScrollableWallpaper);
            return true;
        } catch (IOException e4) {
            e = e4;
            Log.w(f16824k, "WallpaperManager setStream fail!", e);
            return z2;
        }
    }

    /* JADX INFO: renamed from: j */
    public static void m10026j() {
        if (m10034r()) {
            m10021e();
            hb();
            m10022f();
        }
    }

    public static String jk(com.android.thememanager.fu4 resourceContext, Resource r2) {
        if (TextUtils.isEmpty(r2.getContentPath())) {
            r2.setContentPath(com.android.thememanager.o1t.f7l8(r2, resourceContext));
        }
        return r2.getContentPath();
    }

    public static Pair<Integer, Integer> jp0y(boolean isScrollableWallpaper) {
        if (C1807g.n5r1()) {
            return new Pair<>(2088, 2250);
        }
        Point pointFn3e = com.android.thememanager.basemodule.utils.y9n.fn3e();
        if (pointFn3e == null) {
            return new Pair<>(0, 0);
        }
        return new Pair<>(Integer.valueOf(Math.min(pointFn3e.x, pointFn3e.y) * (!isScrollableWallpaper ? 1 : 2)), Integer.valueOf(Math.max(pointFn3e.x, pointFn3e.y)));
    }

    /* JADX INFO: renamed from: k */
    private static void m10027k(String originResourcePath, Bitmap wallpaperBitmap) {
        d2ok.m9689p().m9693k(bf2.toq.toq(), originResourcePath, wallpaperBitmap);
    }

    private static boolean ki(Context context, String originPath, String darkModePath, boolean isLockscreen, boolean isScrollableWallpaper, WallpaperApplyInfos applyInfos, boolean isApplyTheme, boolean needDark) throws Throwable {
        int i2;
        int i3;
        int i4;
        int i5;
        String str = (!C1819o.d2ok(context) || TextUtils.isEmpty(darkModePath)) ? originPath : darkModePath;
        InputStreamLoader inputStreamLoader = new InputStreamLoader(str);
        BitmapFactory.Options optionsKja0 = C2763c.kja0(inputStreamLoader);
        boolean zI1 = true;
        Bitmap bitmapM9650p = C2763c.m9650p(inputStreamLoader, 1, 1);
        boolean zNcyb = ncyb(bitmapM9650p);
        if (bitmapM9650p != null) {
            bitmapM9650p.recycle();
        }
        if (zNcyb) {
            if (!TextUtils.isEmpty(darkModePath)) {
                h7am.kja0(originPath, darkModePath, isLockscreen);
            }
            if (isLockscreen) {
                String str2 = InterfaceC1789q.sxpt;
                yz(str2);
                zVyq = C2951n.fn3e().kja0() ? !TextUtils.isEmpty(darkModePath) ? C2951n.fn3e().vyq(inputStreamLoader.get(), originPath, darkModePath, true, TextUtils.equals(str, darkModePath), needDark) : C2951n.fn3e().m10484o(inputStreamLoader.get(), true, needDark) : false;
                if (!C1821p.f7l8(inputStreamLoader.get(), new File(str2))) {
                    Log.w(f16824k, "originStream save to RUNTIME_PATH_LOCKSCREEN failed!");
                    zI1 = zVyq;
                } else if (applyInfos != null && applyInfos.isSyncToFashionGallery()) {
                    Point pointFn3e = com.android.thememanager.basemodule.utils.y9n.fn3e();
                    int i6 = optionsKja0.outWidth;
                    m10027k(originPath, (i6 <= pointFn3e.x || (i4 = optionsKja0.outHeight) <= (i5 = pointFn3e.y)) ? C2763c.m9650p(inputStreamLoader, i6, optionsKja0.outHeight) : C2763c.m9650p(inputStreamLoader, (i6 * i5) / i4, i5));
                }
            } else if (C2951n.fn3e().kja0()) {
                zI1 = !TextUtils.isEmpty(darkModePath) ? C2951n.fn3e().vyq(inputStreamLoader.get(), originPath, darkModePath, false, TextUtils.equals(str, darkModePath), needDark) : C2951n.fn3e().m10484o(inputStreamLoader.get(), false, needDark);
                m10019b(context, isScrollableWallpaper);
            } else {
                Point pointFn3e2 = com.android.thememanager.basemodule.utils.y9n.fn3e();
                int i7 = optionsKja0.outWidth;
                if (i7 <= pointFn3e2.x || (i2 = optionsKja0.outHeight) <= (i3 = pointFn3e2.y)) {
                    zI1 = i1(context, inputStreamLoader.get(), optionsKja0.outWidth, optionsKja0.outHeight, isScrollableWallpaper, applyInfos);
                } else {
                    int i8 = (i7 * i3) / i2;
                    zI1 = bf2(context, C2763c.m9650p(inputStreamLoader, i8, i3), i8, i3, isScrollableWallpaper, applyInfos);
                }
            }
            inputStreamLoader.close();
            zVyq = zI1;
        } else {
            Log.w(f16824k, "origin bitmap is not valid!");
        }
        if (!zVyq) {
            Log.w(f16824k, "applyWallpaperByOriginPath fail.");
        }
        return zVyq;
    }

    public static boolean kja0(Context context, String originPath, Bitmap manualBmp, Matrix matrix, boolean autoCrop, boolean isLockscreen, boolean isScrollableWallpaper, Bitmap darkBmp, jbh trackData) {
        return m10024h(context, originPath, manualBmp, matrix, autoCrop, isLockscreen, isScrollableWallpaper, false, darkBmp, trackData, null);
    }

    /* JADX INFO: renamed from: l */
    private static boolean m10028l() {
        int i2 = -1;
        try {
            PackageInfo packageInfo = C2082k.zy().toq().getPackageManager().getPackageInfo(f16834u, 0);
            if (packageInfo != null) {
                i2 = packageInfo.versionCode;
            }
        } catch (PackageManager.NameNotFoundException e2) {
            Log.d(f16824k, f16834u + " not found: " + e2);
        }
        return i2 >= 2020100;
    }

    public static boolean ld6(Context context, String originPath, jbh trackData) {
        return x2(context, originPath, false, trackData);
    }

    public static void lrht(Context context, boolean notifyLockScreen, boolean notifyAod) {
        if (new File(InterfaceC1789q.mnxh).exists()) {
            m10029m();
        }
        if (new File(InterfaceC1789q.iq).exists()) {
            m10021e();
            if (notifyLockScreen) {
                context.sendBroadcast(new Intent(miuix.android.content.toq.f86697toq));
                C6795k.toq(C2082k.m7998k(), 4096L);
            }
        }
        if (new File(InterfaceC1789q.l7p).exists()) {
            m10031o();
            if (notifyAod) {
                hyr(context);
            }
        }
    }

    public static boolean lvui() {
        return new File(InterfaceC1789q.re).exists() || (C1807g.lvui() && new File(mcp.m9880y(InterfaceC1789q.k3)).exists()) || (C1807g.zurt() && (new File(mcp.m9880y("lockstyle_outer")).exists() || new File(mcp.m9880y("lockstyle_inner")).exists()));
    }

    /* JADX INFO: renamed from: m */
    private static void m10029m() {
        nn86(InterfaceC1789q.mnxh, "spwallpaper");
    }

    public static Resource mcp(JSONObject json, com.android.thememanager.fu4 resContext, boolean hasThumbnail) throws JSONException {
        String string = json.getString("title");
        String string2 = json.getString("moduleId");
        String string3 = hasThumbnail ? json.getString(InterfaceC1789q.ziq) : null;
        String string4 = json.getString(InterfaceC1789q.dc);
        String string5 = json.getString(InterfaceC1789q.ce);
        Resource resource = new Resource();
        resource.setOnlineId(string2);
        resource.getOnlineInfo().setTitle(string);
        fn3e(resource, string3, string4 + String.format(InterfaceC1925p.ohc0, Integer.valueOf(resContext.getPreviewImageWidth()), 70) + string5, true);
        return resource;
    }

    /* JADX INFO: renamed from: n */
    private static boolean m10030n(boolean isLockScreen) {
        return m10024h(bf2.toq.toq(), com.android.thememanager.controller.local.kja0.zy(isLockScreen), null, null, false, isLockScreen, false, false, null, null, null);
    }

    public static void n5r1(String... reason) {
        Context qVar = bf2.toq.toq();
        Intent intent = new Intent(C2663k.f15764n);
        intent.setPackage(com.android.thememanager.basemodule.utils.a9.zy());
        intent.putExtra("theme", true);
        intent.putExtra("state", true);
        if (reason.length > 0) {
            intent.putExtra("reason", reason[0]);
        }
        qVar.sendBroadcast(intent);
        Log.i(f16824k, "notifyAodAfterSuperWallpaper: " + Arrays.toString(reason));
    }

    public static boolean n7h(boolean isAudioOn, boolean isSupportLoop, boolean isBoth, String originPath, boolean needCompress, jbh trackData) {
        String absolutePath;
        WallpaperInfo wallpaperInfo;
        ThemeApplication qVar = C2082k.zy().toq();
        String strZy = C7617k.toq().zy();
        boolean zEqxt = eqxt();
        if (com.android.thememanager.basemodule.utils.y9n.lvui()) {
            m10019b(qVar, false);
        }
        if (isBoth) {
            m10026j();
            if (com.android.thememanager.basemodule.utils.y9n.lvui()) {
                C7617k.toq().m27925k("com.android.thememanager.theme_lock_video_wallpaper");
            } else {
                C7617k.toq().m27925k("com.android.thememanager.theme_lock_live_wallpaper");
            }
        } else if (com.android.thememanager.basemodule.utils.y9n.lvui() && C1807g.lvui() && zEqxt && com.android.thememanager.ncyb.m8415h(true, "image")) {
            C7617k.toq().m27925k("com.android.thememanager.set_lockwallpaper");
            strZy = "com.android.thememanager.set_lockwallpaper";
        } else if ("com.android.thememanager.theme_lock_live_wallpaper".equals(strZy)) {
            C7617k.toq().m27925k("com.android.thememanager.theme_lock_video_wallpaper");
            strZy = "com.android.thememanager.theme_lock_video_wallpaper";
        }
        lrht(qVar, true, true);
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(qVar);
        if (!C2951n.fn3e().kja0() && (((wallpaperInfo = wallpaperManager.getWallpaperInfo()) == null || !VideoWallpaperService.class.getName().equals(wallpaperInfo.getServiceName())) && !com.android.thememanager.basemodule.utils.y9n.lvui())) {
            com.android.thememanager.basemodule.utils.cdj.zurt(wallpaperManager, new ComponentName(qVar.getPackageName(), VideoWallpaperService.class.getCanonicalName()));
        }
        if (isAudioOn) {
            absolutePath = originPath;
        } else {
            Object obj = m10018a(new File(originPath)).first;
            if (obj == null) {
                Log.w(f16824k, "applyThemeVideoWallpaper, splitVideo fail...");
                return false;
            }
            absolutePath = ((File) obj).getAbsolutePath();
        }
        if (C2951n.fn3e().kja0()) {
            C2951n.fn3e().yz(absolutePath, isBoth ? 3 : 1, isSupportLoop);
        }
        toq.m10014q();
        String strM9679p = ch.m9679p(absolutePath);
        g1.m9752p(absolutePath, p001b.f7l8.f53825z4j7);
        g1.m9752p(strM9679p, p001b.f7l8.f53792kz28);
        String strLd6 = C1821p.ld6(originPath);
        if (isBoth) {
            g1.m9752p(absolutePath, p001b.f7l8.f53800nyj);
            g1.m9752p(strM9679p, p001b.f7l8.f53814vss1);
            String str = absolutePath;
            com.android.thememanager.basemodule.utils.vyq.jp0y("lockscreen", str, null, null, strLd6, null, strLd6);
            com.android.thememanager.basemodule.utils.vyq.jp0y("wallpaper", str, null, null, strLd6, null, strLd6);
        } else {
            if (!TextUtils.equals(strZy, "com.android.thememanager.theme_lock_video_wallpaper")) {
                d8wk.x2(p001b.f7l8.f53800nyj);
                d8wk.x2(p001b.f7l8.f53814vss1);
            }
            com.android.thememanager.basemodule.utils.vyq.jp0y("wallpaper", absolutePath, null, null, strLd6, null, strLd6);
        }
        C2687z.toq(originPath, null, 1);
        if (com.android.thememanager.basemodule.utils.y9n.lvui()) {
            com.android.thememanager.ncyb.wvg(false, "video");
            Intent intent = new Intent(p001b.f7l8.f53803oph);
            intent.putExtra(bb, originPath);
            qVar.sendBroadcast(intent);
            if (isBoth) {
                com.android.thememanager.ncyb.wvg(true, "video");
            }
            com.android.thememanager.ncyb.m8416i(strM9679p, null);
        } else {
            Intent intent2 = new Intent();
            intent2.setAction(p001b.f7l8.f53809sc);
            intent2.putExtra(p001b.f7l8.mete, isAudioOn);
            intent2.putExtra(p001b.f7l8.zma, needCompress);
            intent2.putExtra(p001b.f7l8.k4jz, isSupportLoop);
            intent2.putExtra(p001b.f7l8.vg, isBoth);
            qVar.sendStickyBroadcast(intent2);
        }
        if (trackData != null) {
            h7am.m9796k(false);
            trackData.m9834g(qVar, new Intent(p001b.f7l8.f53803oph));
        }
        if (isBoth) {
            h7am.m9796k(true);
            Intent intent3 = new Intent(miuix.android.content.toq.f86697toq);
            if (trackData != null) {
                trackData.m9834g(qVar, intent3);
            } else {
                qVar.sendBroadcast(intent3);
            }
        }
        if (C1807g.m7081r()) {
            C2567p.m9074s(false);
            if (isBoth) {
                C2567p.m9074s(true);
            }
        }
        return true;
    }

    public static boolean ncyb(Bitmap destBitmap) {
        try {
            GLUtils.texImage2D(3553, 0, destBitmap, 0);
            return true;
        } catch (Exception e2) {
            Log.e(f16824k, "invalid wallpaper bitmap " + e2);
            return false;
        }
    }

    public static void ni7(WallpaperManager wallpaperManager) {
        if (Build.VERSION.SDK_INT >= 28) {
            if (C2951n.fn3e().kja0()) {
                C2951n.fn3e().qrj(false);
                return;
            } else {
                wallpaperManager.clearWallpaper();
                return;
            }
        }
        try {
            wallpaperManager.clear();
        } catch (IOException e2) {
            Log.w(f16824k, "clear wallpaper failed!", e2);
        }
    }

    private static void nn86(String path, String code) {
        yz(path);
        com.android.thememanager.basemodule.utils.vyq.f7l8(code);
    }

    /* JADX INFO: renamed from: o */
    private static void m10031o() {
        nn86(InterfaceC1789q.l7p, "spaod");
    }

    public static String o1t() {
        if (!ac) {
            synchronized (ad) {
                if (!ac) {
                    String qVar = ltg8.toq();
                    if (!TextUtils.isEmpty(qVar)) {
                        String str = com.android.thememanager.basemodule.resource.constants.toq.e2 + (qVar + com.android.thememanager.basemodule.resource.constants.toq.nyhr);
                        if (new File(str).exists()) {
                            bq = str;
                        }
                        if (bq == null) {
                            String str2 = com.android.thememanager.basemodule.resource.constants.toq.e2 + "common_lockscreen.jpg";
                            if (new File(str2).exists()) {
                                bq = str2;
                            }
                        }
                    }
                    ac = true;
                }
            }
        }
        return bq;
    }

    public static boolean oc(com.android.thememanager.fu4 resContext) {
        return ((String) resContext.getExtraMeta(InterfaceC1357q.f53952vep5)) != null;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m10032p(boolean isAudioOn, String originPath, jbh trackData, boolean isSupportLoop) {
        String absolutePath;
        if (isAudioOn) {
            absolutePath = originPath;
        } else {
            Object obj = m10018a(new File(originPath)).first;
            if (obj == null) {
                return false;
            }
            absolutePath = ((File) obj).getAbsolutePath();
        }
        m10026j();
        C7617k.toq().m27925k("com.android.thememanager.theme_lock_video_wallpaper");
        if (C2951n.fn3e().kja0()) {
            C2951n.fn3e().yz(absolutePath, 2, isSupportLoop);
        }
        String strM9679p = ch.m9679p(absolutePath);
        toq.m10014q();
        g1.m9752p(absolutePath, p001b.f7l8.f53800nyj);
        g1.m9752p(strM9679p, p001b.f7l8.f53814vss1);
        C2687z.toq(originPath, null, 1);
        String strLd6 = C1821p.ld6(originPath);
        com.android.thememanager.basemodule.utils.vyq.jp0y("lockscreen", absolutePath, null, null, strLd6, null, strLd6);
        if (!C1807g.zurt() && com.android.thememanager.basemodule.utils.y9n.lvui()) {
            bf2.toq.toq();
            com.android.thememanager.ncyb.wvg(true, "video");
        }
        Intent intent = new Intent(miuix.android.content.toq.f86697toq);
        if (trackData != null) {
            trackData.m9834g(bf2.toq.toq(), intent);
        } else {
            bf2.toq.toq().sendBroadcast(intent);
        }
        h7am.m9796k(true);
        if (C1807g.m7081r()) {
            C2567p.m9074s(true);
        }
        return true;
    }

    /* JADX INFO: renamed from: q */
    public static void m10033q(String originPath) {
        zy();
        String strLd6 = C1821p.ld6(originPath);
        com.android.thememanager.basemodule.utils.vyq.jp0y(InterfaceC1789q.y6, null, null, null, strLd6, null, strLd6);
    }

    @zy.y9n
    public static boolean qrj(String videoPath, int rate, int allFrameCount, int smallScreenFrameCount, int stiffness, String thumbnailPath) throws Throwable {
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        String str;
        String str2;
        FileOutputStream fileOutputStream3;
        FileOutputStream fileOutputStream4;
        int i2 = stiffness;
        if (!zurt(videoPath)) {
            return false;
        }
        Log.w(f16824k, "applySensorFoldVideoWallpaper rate: " + rate + " allFrameCount: " + allFrameCount + " smallScreenFrameCount: " + smallScreenFrameCount + " stiffness: " + i2);
        if (rate < 0 || allFrameCount < 1 || smallScreenFrameCount < 0) {
            Log.w(f16824k, "frameCount error rate: " + rate + " allFrameCount: " + allFrameCount + " smallScreenFrameCount: " + smallScreenFrameCount);
            return false;
        }
        if (i2 <= 0) {
            i2 = 10;
        }
        Bitmap qVar = com.android.thememanager.basemodule.video.f7l8.toq(videoPath, com.android.thememanager.basemodule.video.f7l8.m7263k(allFrameCount, rate), 2);
        Bitmap qVar2 = com.android.thememanager.basemodule.video.f7l8.toq(videoPath, 0L, 2);
        if (qVar == null || qVar2 == null) {
            Log.w(f16824k, "bitmap preview is null");
            return false;
        }
        float fFti = fti(qVar.getWidth(), qVar.getHeight());
        Matrix matrix = new Matrix();
        matrix.postScale(fFti, fFti);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(qVar, 0, 0, qVar.getWidth(), qVar.getHeight(), matrix, false);
        if (com.android.thememanager.basemodule.utils.y9n.n7h(false) == null) {
            Log.w(f16824k, "applySensorFoldVideoWallpaper: smallScreenSize is null");
            return false;
        }
        Matrix matrix2 = new Matrix();
        matrix2.postScale(fFti, fFti);
        int height = (int) ((r13.x / r13.y) * qVar2.getHeight());
        int height2 = qVar2.getHeight();
        int width = (qVar2.getWidth() - height) / 2;
        if (width + height <= qVar2.getWidth()) {
            qVar2 = Bitmap.createBitmap(qVar2, width, 0, height, height2, matrix2, false);
        } else {
            Log.w(f16824k, "crop sensor image Error");
        }
        boolean zKja0 = C2951n.fn3e().kja0();
        Context qVar3 = bf2.toq.toq();
        if (zKja0) {
            d8wk.m9699p(p001b.f7l8.f53786i3x9);
        } else {
            g1.m9752p(videoPath, p001b.f7l8.f53813uo);
        }
        try {
            str = p001b.f7l8.f53785i1an;
            if (new File(str).exists()) {
                try {
                    C1821p.ki(str);
                } catch (FileNotFoundException e2) {
                    e = e2;
                    fileOutputStream = null;
                    fileOutputStream2 = null;
                    try {
                        e.printStackTrace();
                        miuix.core.util.f7l8.zy(fileOutputStream2);
                        miuix.core.util.f7l8.zy(fileOutputStream);
                        return false;
                    } catch (Throwable th) {
                        th = th;
                        miuix.core.util.f7l8.zy(fileOutputStream2);
                        miuix.core.util.f7l8.zy(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = null;
                    fileOutputStream2 = null;
                    miuix.core.util.f7l8.zy(fileOutputStream2);
                    miuix.core.util.f7l8.zy(fileOutputStream);
                    throw th;
                }
            }
            str2 = p001b.f7l8.f53774d1ts;
            if (new File(str2).exists()) {
                C1821p.ki(str2);
            }
            fileOutputStream3 = new FileOutputStream(str2);
            try {
                fileOutputStream4 = new FileOutputStream(str);
            } catch (FileNotFoundException e3) {
                e = e3;
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException e4) {
            e = e4;
            fileOutputStream = null;
            fileOutputStream2 = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
            fileOutputStream2 = null;
        }
        try {
            if (bitmapCreateBitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream3)) {
                C1821p.zy(str2, 493);
            }
            if (qVar2.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream4)) {
                C1821p.zy(str, 493);
            }
            miuix.core.util.f7l8.zy(fileOutputStream3);
            miuix.core.util.f7l8.zy(fileOutputStream4);
            com.android.thememanager.ncyb.ni7(qVar3, true, smallScreenFrameCount);
            com.android.thememanager.ncyb.ni7(qVar3, false, allFrameCount);
            com.android.thememanager.ncyb.o1t(qVar3, rate);
            com.android.thememanager.ncyb.m8424z(qVar3, i2);
            h7am.m9796k(true);
            h7am.m9796k(false);
            if (zKja0) {
                C2951n.fn3e().ek5k(videoPath, bitmapCreateBitmap, qVar2, C5306p.f72418zurt);
            } else {
                com.android.thememanager.ncyb.wvg(false, "sensor");
                com.android.thememanager.ncyb.wvg(true, "sensor");
            }
            if (thumbnailPath != null) {
                C2687z.zy(videoPath, null, 1, a9(rate, allFrameCount, smallScreenFrameCount, i2, thumbnailPath));
            }
            com.android.thememanager.ncyb.m8416i(str2, str);
            toq();
            return true;
        } catch (FileNotFoundException e6) {
            e = e6;
            fileOutputStream = fileOutputStream4;
            fileOutputStream2 = fileOutputStream3;
            e.printStackTrace();
            miuix.core.util.f7l8.zy(fileOutputStream2);
            miuix.core.util.f7l8.zy(fileOutputStream);
            return false;
        } catch (Throwable th5) {
            th = th5;
            fileOutputStream = fileOutputStream4;
            fileOutputStream2 = fileOutputStream3;
            miuix.core.util.f7l8.zy(fileOutputStream2);
            miuix.core.util.f7l8.zy(fileOutputStream);
            throw th;
        }
    }

    /* JADX INFO: renamed from: r */
    public static boolean m10034r() {
        return dd() || lvui();
    }

    /* JADX INFO: renamed from: s */
    public static boolean m10035s(boolean isAudioOn, String originPath, jbh trackData) {
        return m10032p(isAudioOn, originPath, trackData, false);
    }

    /* JADX INFO: renamed from: t */
    public static Pair<String, Integer> m10036t() {
        int count;
        String string;
        ThemeApplication qVar = C2082k.zy().toq();
        Uri contentUri = MediaStore.Files.getContentUri("external");
        Cursor cursorQuery = qVar.getContentResolver().query(contentUri, new String[]{"_data", "_size"}, "_data LIKE '%/DCIM/%' ", null, "date_added DESC");
        if (cursorQuery != null) {
            count = cursorQuery.getCount();
            cursorQuery.close();
        } else {
            count = 0;
        }
        int i2 = count;
        Cursor cursorQuery2 = qVar.getContentResolver().query(contentUri, new String[]{"_data", "_size"}, "_data LIKE '%/DCIM/Camera/%' ", null, "date_added DESC");
        string = "";
        if (cursorQuery2 != null) {
            string = cursorQuery2.moveToNext() ? cursorQuery2.getString(cursorQuery2.getColumnIndex("_data")) : "";
            cursorQuery2.close();
        }
        return new Pair<>(string, Integer.valueOf(i2));
    }

    public static Bitmap t8r(Context context, String originPath, boolean isScrollableWallpaper) throws Throwable {
        Bitmap bitmap;
        Pair<Integer, Integer> pairJp0y = jp0y(isScrollableWallpaper);
        Bitmap bitmapCreateBitmap = null;
        if (((Integer) pairJp0y.first).intValue() <= 0 || ((Integer) pairJp0y.second).intValue() <= 0) {
            Log.e(f16824k, "autoCropWallpaper fail. size invalid. " + pairJp0y);
            return null;
        }
        BitmapFactory.Options optionsCdj = C2763c.cdj();
        if (C2949g.f17747k.ld6()) {
            optionsCdj.inPreferredColorSpace = ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        InputStreamLoader inputStreamLoader = new InputStreamLoader(originPath);
        optionsCdj.inSampleSize = C2763c.m9651q(inputStreamLoader, ((Integer) pairJp0y.first).intValue() * ((Integer) pairJp0y.second).intValue() * 2);
        inputStreamLoader.close();
        try {
            try {
                Bitmap bitmapM9646h = C2763c.m9646h(originPath, optionsCdj);
                if (bitmapM9646h == null) {
                    if (bitmapM9646h != null) {
                        bitmapM9646h.recycle();
                    }
                    return null;
                }
                try {
                    Bitmap.Config config = bitmapM9646h.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    bitmapCreateBitmap = Bitmap.createBitmap(((Integer) pairJp0y.first).intValue(), ((Integer) pairJp0y.second).intValue(), config);
                    C2763c.jp0y(bitmapM9646h.getColorSpace(), bitmapCreateBitmap);
                    float fMin = Math.min((bitmapM9646h.getWidth() * 1.0f) / ((Integer) pairJp0y.first).intValue(), (bitmapM9646h.getHeight() * 1.0f) / ((Integer) pairJp0y.second).intValue());
                    int width = (int) ((bitmapM9646h.getWidth() - (((Integer) pairJp0y.first).intValue() * fMin)) / 2.0f);
                    int height = (int) ((bitmapM9646h.getHeight() - (((Integer) pairJp0y.second).intValue() * fMin)) / 2.0f);
                    C2763c.k kVar = new C2763c.k();
                    kVar.f16351n = new Rect(width, height, bitmapM9646h.getWidth() - width, bitmapM9646h.getHeight() - height);
                    C2763c.f7l8(bitmapM9646h, bitmapCreateBitmap, kVar);
                    bitmapM9646h.recycle();
                    return bitmapCreateBitmap;
                } catch (OutOfMemoryError e2) {
                    e = e2;
                    Bitmap bitmap2 = bitmapCreateBitmap;
                    bitmapCreateBitmap = bitmapM9646h;
                    bitmap = bitmap2;
                    Log.e(f16824k, "autoCropWallpaper error" + e);
                    if (bitmapCreateBitmap != null) {
                        bitmapCreateBitmap.recycle();
                    }
                    return bitmap;
                } catch (Throwable th) {
                    th = th;
                    bitmapCreateBitmap = bitmapM9646h;
                    if (bitmapCreateBitmap != null) {
                        bitmapCreateBitmap.recycle();
                    }
                    throw th;
                }
            } catch (OutOfMemoryError e3) {
                e = e3;
                bitmap = null;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static void toq() {
        if (C1807g.zurt()) {
            C2567p.m9074s(true);
            C2567p.m9074s(false);
        }
    }

    public static List<Resource> uv6(List<Resource> list, com.android.thememanager.fu4 resContext) {
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Resource resource : list) {
            String strWvg = ch.wvg(new ResourceResolver(resource, resContext).getMetaPath());
            if (!hashSet.contains(strWvg) && !TextUtils.isEmpty(strWvg)) {
                hashSet.add(strWvg);
                arrayList.add(resource);
            }
        }
        return arrayList;
    }

    private static void vyq() {
        if (C1807g.zurt()) {
            String str = InterfaceC1789q.yza;
            if (new File(str).exists()) {
                yz(str);
            }
        }
        nn86(InterfaceC1789q.sxpt, "lockscreen");
    }

    private static BitmapFactory.Options wvg(BitmapFactory.Options srcOpt, int suggestWidth, int suggestHeight) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        int i2 = srcOpt.outWidth;
        float f2 = suggestWidth / i2;
        int i3 = srcOpt.outHeight;
        float f3 = suggestHeight / i3;
        if (f2 > f3) {
            options.outWidth = suggestWidth;
            options.outHeight = (int) (f2 * i3);
        } else {
            options.outHeight = suggestHeight;
            options.outWidth = (int) (f3 * i2);
        }
        return options;
    }

    /* JADX INFO: renamed from: x */
    public static boolean m10037x() {
        if (!com.android.thememanager.basemodule.utils.o1t.m7171i()) {
            return false;
        }
        try {
            return bf2.toq.toq().getPackageManager().getApplicationInfo("com.miui.miwallpaper", 128).metaData.getBoolean(InterfaceC1789q.n7c, false);
        } catch (Exception e2) {
            Log.d(f16824k, "get support video effect exception " + e2);
            return false;
        }
    }

    public static boolean x2(Context context, String originPath, boolean isApplyTheme, jbh trackData) {
        return m10024h(context, originPath, null, null, true, true, false, isApplyTheme, null, trackData, null);
    }

    public static boolean x9kr() {
        if (com.android.thememanager.basemodule.utils.o1t.cdj()) {
            return false;
        }
        Boolean bool = be;
        if (bool != null) {
            return bool.booleanValue();
        }
        HashSet hashSet = new HashSet();
        hashSet.add("venus");
        hashSet.add("haydn");
        hashSet.add(InterfaceC1925p.esx1);
        hashSet.add(C1367k.f7260q);
        hashSet.add("renoir");
        hashSet.add("ares");
        hashSet.add("agate");
        hashSet.add("odin");
        hashSet.add("ingres");
        hashSet.add("poussin");
        hashSet.add("zeus");
        hashSet.add("cupid");
        hashSet.add("psyche");
        Boolean boolValueOf = Boolean.valueOf(!hashSet.contains(C1807g.m7073g()));
        be = boolValueOf;
        return boolValueOf.booleanValue();
    }

    /* JADX INFO: renamed from: y */
    public static boolean m10038y(String videoPath, boolean isLockScreen, boolean isBoth, boolean isSupportLoop) {
        if (!zurt(videoPath)) {
            return false;
        }
        if (C2951n.fn3e().kja0()) {
            C2951n.fn3e().nn86(videoPath, isLockScreen, isBoth, isSupportLoop);
        }
        String strM9679p = ch.m9679p(videoPath);
        if (!isLockScreen || isBoth) {
            g1.m9752p(videoPath, p001b.f7l8.f53825z4j7);
            g1.m9752p(strM9679p, p001b.f7l8.f53792kz28);
            h7am.m9796k(false);
            com.android.thememanager.ncyb.wvg(false, "video");
            com.android.thememanager.ncyb.m8416i(strM9679p, null);
        }
        if (isLockScreen || isBoth) {
            g1.m9752p(videoPath, p001b.f7l8.f53800nyj);
            g1.m9752p(strM9679p, p001b.f7l8.f53814vss1);
            h7am.m9796k(true);
            com.android.thememanager.ncyb.wvg(true, "video");
        }
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(bf2.toq.toq());
        if (wallpaperManager.getWallpaperInfo() != null) {
            com.android.thememanager.basemodule.utils.cdj.zurt(wallpaperManager, new ComponentName("com.miui.miwallpaper", "com.miui.miwallpaper.wallpaperservice.ImageWallpaper"));
        }
        C2687z.k kVar = new C2687z.k();
        kVar.f15947n = strM9679p;
        kVar.f15946k = "video";
        C2687z.zy(videoPath, null, 1, kVar);
        toq();
        return true;
    }

    private static boolean y9n(Context context, boolean isDeskWallpaper) {
        WallpaperManager wallpaperManagerGvn7 = gvn7(context);
        if (wallpaperManagerGvn7 == null) {
            return false;
        }
        if (isDeskWallpaper) {
            if (!m10028l()) {
                Point pointFn3e = com.android.thememanager.basemodule.utils.y9n.fn3e();
                wallpaperManagerGvn7.suggestDesiredDimensions(pointFn3e.x, pointFn3e.y);
                try {
                    Settings.System.putFloat(context.getContentResolver(), bv, 1.0f);
                } catch (Exception e2) {
                    Log.d(f16824k, "put float error:" + e2);
                }
            }
            m10019b(context, false);
            if (com.android.thememanager.controller.local.kja0.ld6()) {
                m10030n(false);
            } else {
                ni7(wallpaperManagerGvn7);
            }
        } else if (com.android.thememanager.controller.local.kja0.ld6()) {
            m10030n(true);
        } else {
            C2951n.fn3e().qrj(true);
        }
        return true;
    }

    public static boolean yz(String path) {
        boolean zX2 = d8wk.x2(path);
        if (!zX2) {
            Log.w(f16824k, "remove " + path + " failed!");
        }
        return zX2;
    }

    /* JADX INFO: renamed from: z */
    public static String m10039z() {
        if (!ax) {
            synchronized (ad) {
                if (!ax) {
                    String qVar = ltg8.toq();
                    if (!TextUtils.isEmpty(qVar)) {
                        String str = com.android.thememanager.basemodule.resource.constants.toq.wc6 + (qVar + com.android.thememanager.basemodule.resource.constants.toq.n7);
                        if (new File(str).exists()) {
                            ba = str;
                        }
                        if (ba == null) {
                            String str2 = com.android.thememanager.basemodule.resource.constants.toq.wc6 + "common_wallpaper.jpg";
                            if (new File(str2).exists()) {
                                ba = str2;
                            }
                        }
                    }
                    ax = true;
                }
            }
        }
        return ba;
    }

    public static Pair<File, File> zp(File videoFile) {
        String strM9702y = d8wk.m9702y(videoFile.getAbsolutePath());
        File file = new File(C1788k.f10167c + strM9702y + id);
        if (!file.exists()) {
            file.mkdir();
        }
        try {
            return jz5.toq(videoFile, new File(file, strM9702y + com.android.thememanager.basemodule.resource.constants.toq.dt), new File(file, strM9702y + com.android.thememanager.basemodule.resource.constants.toq.pm14));
        } catch (IOException unused) {
            return new Pair<>(null, null);
        }
    }

    private static boolean zurt(String path) {
        boolean z2 = !TextUtils.isEmpty(path) && new File(path).isFile() && new File(path).exists();
        if (!z2) {
            Log.d(f16824k, "checkWallpaperPath: file path is not exist");
        }
        return z2;
    }

    public static void zy() {
        ThemeApplication themeApplicationM7998k = C2082k.m7998k();
        m10026j();
        lrht(themeApplicationM7998k, false, true);
        C7617k.toq().m27925k("com.android.thememanager.theme_lock_live_wallpaper");
        WallpaperManager wallpaperManager = WallpaperManager.getInstance(themeApplicationM7998k);
        WallpaperInfo wallpaperInfo = wallpaperManager.getWallpaperInfo();
        if (wallpaperInfo == null || !"com.android.systemui.wallpaper.Video24WallpaperService".equals(wallpaperInfo.getServiceName())) {
            com.android.thememanager.basemodule.utils.cdj.zurt(wallpaperManager, new ComponentName("com.android.systemui", "com.android.systemui.wallpaper.Video24WallpaperService"));
        }
    }
}
