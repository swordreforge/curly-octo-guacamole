package com.android.thememanager.util;

import android.app.Activity;
import android.app.ActivityOptions;
import android.app.WallpaperManager;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.provider.Settings;
import android.util.Log;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.model.WallpaperApplyInfos;
import java.io.File;
import java.io.IOException;
import miui.util.InputStreamLoader;

/* JADX INFO: renamed from: com.android.thememanager.util.r */
/* JADX INFO: compiled from: FoldUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2805r implements InterfaceC1789q {

    /* JADX INFO: renamed from: g */
    public static final int f16755g = 7;

    /* JADX INFO: renamed from: h */
    public static final String f16756h = ":miui:display.container";

    /* JADX INFO: renamed from: i */
    public static final String f16757i = ":miui:settings_av";

    /* JADX INFO: renamed from: k */
    private static final String f16758k = "FoldUtils";

    /* JADX INFO: renamed from: n */
    public static final int f16759n = 4;

    /* JADX INFO: renamed from: p */
    public static final int f16760p = 2;

    /* JADX INFO: renamed from: q */
    public static final int f16761q = 1;

    /* JADX INFO: renamed from: r */
    private static final Object f16762r = new Object();

    /* JADX INFO: renamed from: s */
    public static final int f16763s = 1;

    /* JADX INFO: renamed from: t */
    private static final String f16764t = "fold_apply_wallpaper_type";

    /* JADX INFO: renamed from: y */
    public static final int f16765y = 1;

    /* JADX INFO: renamed from: z */
    public static final String f16766z = ":miui:display.id";

    public static synchronized void f7l8(Context context, int type) {
        if (C1807g.zurt()) {
            try {
                Settings.Secure.putInt(context.getContentResolver(), f16764t, type);
            } catch (Exception e2) {
                Log.w(f16758k, "putInt FOLD_APPLY_WALLPAPER_TYPE fail!", e2);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public static void m9968g(String previewPath, int applyType) {
        InputStreamLoader inputStreamLoader;
        if (com.android.thememanager.ncyb.t8r()) {
            Context qVar = bf2.toq.toq();
            WallpaperManager wallpaperManager = WallpaperManager.getInstance(qVar);
            if (previewPath == null || !new File(previewPath).exists()) {
                Log.w(f16758k, "setDeskTopWallpaperPreview: bitmap is null");
                return;
            }
            synchronized (f16762r) {
                f7l8(qVar, applyType);
                InputStreamLoader inputStreamLoader2 = null;
                try {
                    try {
                        inputStreamLoader = new InputStreamLoader(previewPath);
                    } catch (IOException e2) {
                        e = e2;
                    }
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    if (C1807g.zurt()) {
                        BitmapFactory.Options options = new BitmapFactory.Options();
                        options.inJustDecodeBounds = true;
                        BitmapFactory.decodeFile(previewPath, options);
                        wallpaperManager.suggestDesiredDimensions(options.outWidth, options.outHeight);
                    }
                    wallpaperManager.setStream(inputStreamLoader.get(), null, false, 1);
                    inputStreamLoader.close();
                } catch (IOException e3) {
                    e = e3;
                    inputStreamLoader2 = inputStreamLoader;
                    Log.w(f16758k, "setDeskTopWallpaperPreview: IOException ");
                    e.printStackTrace();
                    if (inputStreamLoader2 != null) {
                        inputStreamLoader2.close();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    inputStreamLoader2 = inputStreamLoader;
                    if (inputStreamLoader2 != null) {
                        inputStreamLoader2.close();
                    }
                    m9970n(qVar);
                    throw th;
                }
                m9970n(qVar);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public static boolean m9969k(Context context, Bitmap destBitmap, Bitmap darkBitmap, boolean isLockscreen, boolean isScrollableWallpaper, String originPath, WallpaperApplyInfos applyInfo, boolean isApplyTheme, boolean needDark) {
        boolean zCdj;
        synchronized (f16762r) {
            f7l8(context, 7);
            zCdj = uc.cdj(context, destBitmap, darkBitmap, isLockscreen, isScrollableWallpaper, applyInfo, isApplyTheme, needDark);
            if (zCdj) {
                C1821p.zy(InterfaceC1789q.sxpt, 509);
                com.android.thememanager.ncyb.wvg(isLockscreen, "image");
            }
            m9970n(context);
        }
        return zCdj;
    }

    /* JADX INFO: renamed from: n */
    public static void m9970n(Context context) {
        if (C1807g.zurt()) {
            f7l8(context, 1);
        }
    }

    /* JADX INFO: renamed from: q */
    public static float m9971q(Bitmap bitmap, int screenCount, boolean userChanged, Matrix imageMatrix) {
        int i2 = zy().x;
        int width = bitmap.getWidth();
        RectF rectF = new RectF(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        imageMatrix.mapRect(rectF);
        int width2 = (int) (width / (bitmap.getWidth() / rectF.width()));
        if (userChanged && rectF.right - i2 >= 0.0f) {
            width2 = (int) (width2 + rectF.left);
        }
        float f2 = width2 / i2;
        if (f2 <= 1.1f || screenCount <= 0) {
            f2 = 1.1f;
        }
        float fM9858k = lvui.m9858k(Float.valueOf(f2), Float.valueOf(screenCount), Float.valueOf(4.0f));
        Log.i(f16758k, "getWallpaperWidthEnlarge: " + fM9858k);
        return fM9858k;
    }

    /* JADX INFO: renamed from: s */
    public static void m9972s(Activity activity, Intent intent) {
        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
        activityOptionsMakeBasic.setLaunchDisplayId(activity.getIntent().getIntExtra(f16766z, 0));
        intent.setFlags(268435456);
        activity.startActivityForResult(intent, 109, activityOptionsMakeBasic.toBundle());
    }

    public static Bitmap toq(Context context, int screen) {
        Bitmap bitmap;
        WallpaperManager wallpaperManager = (WallpaperManager) context.getSystemService("wallpaper");
        if (wallpaperManager != null && wallpaperManager.getWallpaperInfo() == null) {
            Drawable drawableFn3e = com.android.thememanager.basemodule.utils.cdj.fn3e(wallpaperManager, screen);
            if ((drawableFn3e instanceof BitmapDrawable) && (bitmap = ((BitmapDrawable) drawableFn3e).getBitmap()) != null && !bitmap.isRecycled()) {
                return bitmap;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    public static void m9973y(Activity activity, Intent intent) {
        ActivityOptions activityOptionsMakeBasic = ActivityOptions.makeBasic();
        activityOptionsMakeBasic.setLaunchDisplayId(activity.getIntent().getIntExtra(f16766z, 0));
        intent.setFlags(268435456);
        activity.startActivity(intent, activityOptionsMakeBasic.toBundle());
    }

    public static Point zy() {
        return com.android.thememanager.basemodule.utils.y9n.n7h(true);
    }
}
