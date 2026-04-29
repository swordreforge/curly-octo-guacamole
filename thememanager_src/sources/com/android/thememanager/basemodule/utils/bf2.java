package com.android.thememanager.basemodule.utils;

import android.app.WallpaperColors;
import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import java.io.File;
import miuix.graphics.C7111k;

/* JADX INFO: compiled from: WallpaperHelper.java */
/* JADX INFO: loaded from: classes.dex */
public class bf2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f57714f7l8;

    /* JADX INFO: renamed from: g */
    private static final String f10275g = "result_bitmap";

    /* JADX INFO: renamed from: k */
    private static final String f10276k = "WallpaperHelper";

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    public static final String f57715kja0 = "com.android.thememanager.service.VideoWallpaperService";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final int f57716ld6 = 2;

    /* JADX INFO: renamed from: n */
    private static final String f10277n = "getHomePreview";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    public static final String f57717n7h = "wallpaper";

    /* JADX INFO: renamed from: p */
    public static final int f10278p = 1;

    /* JADX INFO: renamed from: q */
    private static final String f10279q = "getLockScreenPreview";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f57718qrj = "lock_wallpaper";

    /* JADX INFO: renamed from: s */
    public static final int f10280s = 0;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f57719toq = "wallpaperColorMode";

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final int f57720x2 = 3;

    /* JADX INFO: renamed from: y */
    private static final String f10281y;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f57721zy = "onlyShortCut";

    static {
        String strM26160k = miuix.os.f7l8.m26160k("ro.miui.product.home", InterfaceC1789q.k9);
        f57714f7l8 = strM26160k;
        f10281y = strM26160k + ".launcher.settings";
    }

    /* JADX INFO: renamed from: g */
    public static boolean m7004g(String path) {
        return path != null && path.startsWith(com.android.thememanager.basemodule.resource.constants.toq.trbh);
    }

    @zy.y9n
    /* JADX INFO: renamed from: k */
    public static int m7005k(@zy.lvui Bitmap bitmap, int sampleRatio) {
        if (Build.VERSION.SDK_INT < 27) {
            return C7111k.wvg(bitmap, sampleRatio);
        }
        int iT8r = cdj.t8r();
        if (bitmap != null && !bitmap.isRecycled()) {
            return (cdj.m7013i(WallpaperColors.fromBitmap(bitmap)) & iT8r) == iT8r ? 2 : 0;
        }
        Log.w(f10276k, "getBitmapColorMode default dark Mode ,because bitmap is recycled");
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public static Bitmap m7006n(int colorMode, boolean isLockscreen, boolean isOnlyShortCut) {
        ContentResolver contentResolver = bf2.toq.toq().getContentResolver();
        Bundle bundle = new Bundle();
        bundle.putInt(f57719toq, colorMode);
        bundle.putBoolean(f57721zy, (C1807g.lvui() && C1819o.m7164r(bf2.toq.toq())) ? false : true);
        try {
            Bundle bundleCall = contentResolver.call(Uri.parse("content://" + f10281y), isLockscreen ? f10279q : f10277n, (String) null, bundle);
            StringBuilder sb = new StringBuilder();
            sb.append("getWallpaperPreviewFromHome: ");
            sb.append(bundleCall != null);
            Log.i(f10276k, sb.toString());
            if (bundleCall != null) {
                byte[] byteArray = bundleCall.getByteArray(f10275g);
                boolean z2 = byteArray != null && byteArray.length > 0;
                Log.i(f10276k, "getWallpaperPreviewFromHome: bytes " + z2);
                if (z2) {
                    return BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
                }
            }
            return null;
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("get ");
            sb2.append(isLockscreen ? "lockscreen " : "wallpaper ");
            sb2.append("preview throw an exception -");
            sb2.append(e2);
            Log.e(f10276k, sb2.toString());
            return null;
        }
    }

    /* JADX INFO: renamed from: q */
    public static Bitmap m7007q() {
        String string;
        if (C1807g.zurt()) {
            boolean zWvg = C1807g.wvg();
            boolean zNcyb = C1819o.ncyb(bf2.toq.toq());
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(InterfaceC1789q.dg4q);
            stringBuffer.append(zWvg ? InterfaceC1789q.pub6 : InterfaceC1789q.v9zx);
            stringBuffer.append(zNcyb ? InterfaceC1789q.pj7 : InterfaceC1789q.qp5l);
            string = stringBuffer.toString();
        } else {
            string = C1807g.lvui() ? C1819o.ncyb(bf2.toq.toq()) ? InterfaceC1789q.o703 : InterfaceC1789q.ol : InterfaceC1789q.xx8g;
        }
        if (!new File(string).exists()) {
            Log.w(f10276k, "getWallpaperDefaultPreviewFromHome: previewPath is not exist");
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return BitmapFactory.decodeFile(string, options);
    }

    public static int toq() {
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = bf2.toq.toq().getContentResolver().query(Uri.parse("content://" + f10281y + "/screens"), null, null, null, null);
                if (cursorQuery != null) {
                    int count = cursorQuery.getCount();
                    cursorQuery.close();
                    return count;
                }
                if (cursorQuery == null) {
                    return -1;
                }
            } catch (Exception e2) {
                Log.e(f10276k, "getLauncherScreenCount: ", e2);
                if (cursorQuery == null) {
                    return -1;
                }
            }
            cursorQuery.close();
            return -1;
        } catch (Throwable th) {
            if (cursorQuery != null) {
                cursorQuery.close();
            }
            throw th;
        }
    }

    public static int zy(Context context) {
        WallpaperInfo wallpaperInfo = ((WallpaperManager) context.getApplicationContext().getSystemService("wallpaper")).getWallpaperInfo();
        if (wallpaperInfo == null) {
            return 0;
        }
        if ("com.miui.miwallpaper.MiWallpaper".equals(wallpaperInfo.getServiceName())) {
            return 1;
        }
        return f57715kja0.equals(wallpaperInfo.getServiceName()) ? 2 : 3;
    }
}
