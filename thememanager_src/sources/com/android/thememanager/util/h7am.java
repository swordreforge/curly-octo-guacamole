package com.android.thememanager.util;

import android.app.WallpaperManager;
import android.content.Intent;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.util.Log;
import androidx.constraintlayout.core.motion.utils.zurt;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1821p;
import java.io.File;
import java.io.IOException;
import miui.content.res.ThemeResources;
import miui.os.UserHandle;
import miui.util.InputStreamLoader;

/* JADX INFO: compiled from: WallpaperDarkModeUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class h7am {

    /* JADX INFO: renamed from: k */
    private static final String f16526k = "h7am";

    /* JADX INFO: renamed from: q */
    public static final String f16527q = "miui_support_dark_wallpaper";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61255toq = C1821p.n7h(ThemeResources.THEME_MAGIC_PATH) + "users/";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    @zy.dd
    private static String f61256zy = null;

    public static void cdj(boolean isLock, int id, boolean supportDarkMode, boolean isSystem) {
        Log.d(f16526k, "updateDarkModeIdFile,isLock = " + isLock + ",id = " + id + ",supportDarkMode = " + supportDarkMode);
        String strF7l8 = f7l8(isLock);
        File file = new File(strF7l8);
        if (!isSystem) {
            if (file.exists()) {
                file.delete();
                return;
            }
            return;
        }
        x2();
        if (!isLock && !supportDarkMode) {
            id = -id;
        }
        if (file.exists()) {
            try {
                if (Integer.parseInt(C1821p.m7184h(strF7l8)) == id) {
                    return;
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        try {
            C1821p.m7185i(strF7l8, String.valueOf(id));
            C1821p.zy(strF7l8, 438);
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }

    public static String f7l8(boolean isLockScreen) {
        return m9794g() + (isLockScreen ? "lock_wallpaper_id" : "desktop_wallpaper_id");
    }

    /* JADX INFO: renamed from: g */
    private static String m9794g() {
        return f61255toq + UserHandle.myUserId() + "/wallpaper/";
    }

    /* JADX INFO: renamed from: h */
    public static synchronized void m9795h(boolean isLockScreen) {
        Intent intent;
        String str = f16526k;
        Log.d(str, "setDefaultWallpaperWithDarkMode..");
        if (ld6()) {
            WallpaperManager wallpaperManagerGvn7 = uc.gvn7(bf2.toq.toq());
            if (wallpaperManagerGvn7 == null) {
                return;
            }
            x2();
            String strM10006p = tfm.m10006p();
            if (strM10006p != null) {
                String strM9801y = m9801y(isLockScreen, false, false);
                boolean zM7183g = C1821p.m7183g(new File(strM10006p), new File(strM9801y));
                C1821p.zy(strM9801y, zurt.zy.f47496ki);
                Log.i(str, "setDefaultWallpaperWithDarkMode :: " + zM7183g + ", " + strM10006p + "->" + strM9801y);
            }
            if (com.android.thememanager.basemodule.utils.o1t.m7179z()) {
                String strM9801y2 = m9801y(isLockScreen, true, false);
                zy();
                C1821p.m7183g(new File(f61256zy), new File(strM9801y2));
                C1821p.zy(strM9801y2, zurt.zy.f47496ki);
                boolean zD2ok = C1819o.d2ok(bf2.toq.toq());
                if (isLockScreen) {
                    intent = new Intent(miuix.android.content.toq.f86697toq);
                    intent.putExtra(uc.f16826m, 1);
                } else {
                    if (zD2ok) {
                        InputStreamLoader inputStreamLoader = new InputStreamLoader(strM9801y2);
                        try {
                            try {
                                wallpaperManagerGvn7.setStream(inputStreamLoader.get(), null, true, 1);
                            } catch (Exception e2) {
                                Log.e(f16526k, "setDefaultWallpaperWithDarkMode desk night error: " + e2.getMessage());
                            }
                        } finally {
                            inputStreamLoader.close();
                        }
                    }
                    intent = new Intent(p001b.f7l8.f53803oph);
                    intent.putExtra(uc.bb, f61256zy);
                    intent.putExtra(f16527q, 1);
                }
                new jbh(jbh.f16570n, "default", "default", "default").m9834g(bf2.toq.toq(), intent);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m9796k(boolean isLockScreen) {
        String strM9801y = m9801y(isLockScreen, false, false);
        String strM9801y2 = m9801y(isLockScreen, true, false);
        File file = new File(strM9801y);
        if (file.exists()) {
            file.delete();
        }
        File file2 = new File(strM9801y2);
        if (file2.exists()) {
            file2.delete();
        }
        if (C1807g.zurt()) {
            String strM9801y3 = m9801y(isLockScreen, false, true);
            String strM9801y4 = m9801y(isLockScreen, true, true);
            File file3 = new File(strM9801y3);
            if (file3.exists()) {
                file3.delete();
            }
            File file4 = new File(strM9801y4);
            if (file4.exists()) {
                file4.delete();
            }
        }
    }

    public static synchronized void kja0(String filePath, String darkFilePath, boolean isLockScreen) {
        if (!com.android.thememanager.basemodule.utils.o1t.m7179z() || TextUtils.isEmpty(filePath) || TextUtils.isEmpty(darkFilePath)) {
            return;
        }
        try {
            x2();
            String strM9801y = m9801y(isLockScreen, true, false);
            String strM9801y2 = m9801y(isLockScreen, false, false);
            C1821p.m7183g(new File(filePath), new File(strM9801y2));
            C1821p.m7183g(new File(darkFilePath), new File(strM9801y));
            C1821p.zy(strM9801y2, 438);
            C1821p.zy(strM9801y, 438);
        } catch (Exception e2) {
            Log.e(f16526k, "saveMagicDarkModeWallpaperFile error" + e2);
        }
    }

    public static boolean ld6() {
        zy();
        if (!com.android.thememanager.basemodule.utils.o1t.m7179z()) {
            return false;
        }
        Boolean boolCdj = tfm.cdj();
        if (boolCdj != null) {
            return boolCdj.booleanValue();
        }
        String str = f61256zy;
        return str != null && str.length() > 1 && new File(f61256zy).exists();
    }

    /* JADX INFO: renamed from: n */
    private static String m9797n(boolean isDark, boolean isLargeScreen) {
        return isDark ? isLargeScreen ? InterfaceC1789q.ah9 : InterfaceC1789q.qzh : isLargeScreen ? InterfaceC1789q.jad : InterfaceC1789q.gi;
    }

    public static synchronized void n7h(Bitmap bitmap, Bitmap darkBitmap, boolean isLockScreen) {
        if (com.android.thememanager.basemodule.utils.o1t.m7179z() && bitmap != null && uc.ncyb(bitmap) && darkBitmap != null && uc.ncyb(darkBitmap)) {
            try {
                x2();
                String strM9801y = m9801y(isLockScreen, true, false);
                String strM9801y2 = m9801y(isLockScreen, false, false);
                qrj(darkBitmap, strM9801y);
                qrj(bitmap, strM9801y2);
            } catch (Exception e2) {
                Log.e(f16526k, "saveMagicDarkModeBitmap error" + e2);
            }
        }
    }

    /* JADX INFO: renamed from: p */
    public static String m9798p(String originPath) {
        if (!com.android.thememanager.basemodule.utils.o1t.m7179z()) {
            return null;
        }
        if (ch.vyq(originPath) || ch.n5r1(originPath) || ch.m9681r(originPath)) {
            return zsr0.toq.m28220k(originPath);
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public static String m9799q(boolean isDark) {
        return (isDark && new File(InterfaceC1789q.ah9).exists()) ? InterfaceC1789q.ah9 : InterfaceC1789q.jad;
    }

    private static void qrj(Bitmap bitmap, String path) {
        String str = path + ".tmp";
        C2763c.m9653t(bitmap, str);
        File file = new File(path);
        if (file.exists()) {
            file.delete();
        }
        new File(str).renameTo(file);
        C1821p.zy(path, 438);
    }

    /* JADX INFO: renamed from: s */
    public static int m9800s(boolean isLockScreen) {
        String strF7l8 = f7l8(isLockScreen);
        if (!new File(strF7l8).exists()) {
            return 0;
        }
        try {
            return Integer.parseInt(C1821p.m7184h(strF7l8));
        } catch (Exception e2) {
            e2.printStackTrace();
            return 0;
        }
    }

    public static void toq(boolean isDark, boolean isLargeScreen) {
        x2();
        String strM9797n = m9797n(isDark, isLargeScreen);
        if (!new File(strM9797n).exists()) {
            Log.i(f16526k, "default wallpaper file not exists: " + strM9797n);
            return;
        }
        String strM9801y = m9801y(true, isDark, !isLargeScreen);
        String strM9801y2 = m9801y(false, isDark, !isLargeScreen);
        d8wk.toq(strM9797n, strM9801y);
        d8wk.toq(strM9797n, strM9801y2);
        C1821p.zy(strM9801y, 438);
        C1821p.zy(strM9801y2, 438);
    }

    private static void x2() {
        String strM9794g = m9794g();
        File file = new File(strM9794g);
        if (!file.exists()) {
            file.mkdirs();
            String str = f61255toq;
            C1821p.zy(str, 511);
            C1821p.zy(str + UserHandle.myUserId(), 511);
        }
        C1821p.zy(strM9794g, 511);
    }

    /* JADX INFO: renamed from: y */
    public static String m9801y(boolean isLockScreen, boolean isDark, boolean isSmallFoldScreen) {
        String str = isLockScreen ? com.android.thememanager.basemodule.utils.bf2.f57718qrj : "desktop_wallpaper";
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(isSmallFoldScreen ? "_small" : "");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(string);
        sb2.append(isDark ? "_dark.jpg" : com.android.thememanager.basemodule.resource.constants.toq.ybu);
        return m9794g() + sb2.toString();
    }

    private static void zy() {
        if (f61256zy != null) {
            return;
        }
        if (!com.android.thememanager.basemodule.utils.o1t.m7170h()) {
            f61256zy = "";
            return;
        }
        f61256zy = tfm.m10008s();
        Log.i(f16526k, "WallpaperDefaultDarkPath from miwallpaper : " + f61256zy);
    }
}
