package com.android.thememanager.util;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.android.thememanager.basemodule.utils.C1807g;
import com.google.android.exoplayer2.text.ttml.C3678q;
import java.io.File;
import miuix.core.util.C7083n;

/* JADX INFO: compiled from: FashionGalleryManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class d2ok {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f61224f7l8 = "com.miui.android.fashiongallery.thirdPartyWallpaperProvider";

    /* JADX INFO: renamed from: g */
    private static final String f16392g = "com.xiaomi.tv.gallerylockscreen.lockscreen_magazine_provider";

    /* JADX INFO: renamed from: n */
    private static final String f16393n = "com.miui.android.fashiongallery";

    /* JADX INFO: renamed from: p */
    private static volatile d2ok f16394p = null;

    /* JADX INFO: renamed from: q */
    private static final String f16395q = "com.mfashiongallery.emag";

    /* JADX INFO: renamed from: s */
    public static String f16396s = "/template_current/wallpaper_cropped";

    /* JADX INFO: renamed from: y */
    public static String f16397y = "/template_current/wallpaper_copied";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static String f61225zy = "FashionGalleryHelper";

    /* JADX INFO: renamed from: k */
    private String f16398k = bf2.toq.toq().getFilesDir().getAbsolutePath();

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private String f61226toq = this.f16398k + "/templates";

    /* JADX INFO: renamed from: com.android.thememanager.util.d2ok$k */
    /* JADX INFO: compiled from: FashionGalleryManager.java */
    public enum EnumC2772k {
        WALLPAPER_COPIED("wallpaper_copied"),
        WALLPAPER_CROPPED("wallpaper_cropped");

        private String fileName;

        EnumC2772k(String fileName) {
            this.fileName = fileName;
        }

        public String getFileName() {
            return this.fileName;
        }
    }

    private String ld6() {
        return C1807g.o1t() ? f61224f7l8 : "com.xiaomi.tv.gallerylockscreen.lockscreen_magazine_provider";
    }

    private boolean n7h(Context context) {
        Bundle qVar = toq(context, "isLockscreenMagazineOpen", null);
        if (qVar != null) {
            return qVar.getBoolean(C3678q.f65822ikck, false);
        }
        Log.w(f61225zy, "isLockscreenMagazineOpen: outBundle = null");
        return false;
    }

    /* JADX INFO: renamed from: p */
    public static d2ok m9689p() {
        if (f16394p == null) {
            synchronized (d2ok.class) {
                if (f16394p == null) {
                    f16394p = new d2ok();
                }
            }
        }
        return f16394p;
    }

    /* JADX INFO: renamed from: q */
    private String m9690q(boolean cropped, Bitmap croppedBitmap, String originUri) {
        if (!cropped) {
            return originUri;
        }
        String strZy = zy(croppedBitmap, m9695y(EnumC2772k.WALLPAPER_CROPPED), false);
        if (TextUtils.isEmpty(strZy)) {
            return null;
        }
        return f7l8(new File(strZy), f16396s).toString();
    }

    /* JADX INFO: renamed from: s */
    private String m9691s() {
        return C1807g.o1t() ? f16393n : "com.mfashiongallery.emag";
    }

    private Bundle toq(Context context, String method, Bundle extras) {
        try {
            return context.getContentResolver().call(ld6(), method, (String) null, extras);
        } catch (Exception e2) {
            Log.e(f61225zy, "callProviderMethod", e2);
            return null;
        }
    }

    private boolean x2(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(m9691s(), 0);
            if (packageInfo != null) {
                return packageInfo.versionCode >= 2023121400;
            }
            return false;
        } catch (Exception e2) {
            Log.e(f61225zy, "isFashionGalleryInstalled", e2);
            return false;
        }
    }

    private String zy(Bitmap bitmap, String target, boolean toWebp) {
        if (target == null || bitmap == null) {
            return null;
        }
        if (toWebp ? ni7.f16663k.m9903i(bitmap, target) : ni7.f16663k.t8r(bitmap, target)) {
            return target;
        }
        return null;
    }

    public Uri f7l8(File file, String path) {
        if (!file.exists()) {
            Log.w(f61225zy, "createContentUri failed: file not exists.");
            return null;
        }
        return Uri.parse("content://com.android.thememanager.theme_provider" + path);
    }

    /* JADX INFO: renamed from: g */
    public String m9692g(String originResourcePath) {
        try {
            String strM9695y = m9695y(EnumC2772k.WALLPAPER_COPIED);
            d8wk.x2(strM9695y);
            if (m9694n(originResourcePath, strM9695y)) {
                return f7l8(new File(strM9695y), f16397y).toString();
            }
            return null;
        } catch (Exception e2) {
            Log.e(f61225zy, "copy exception " + e2);
            return null;
        }
    }

    /* JADX INFO: renamed from: k */
    public void m9693k(Context context, String wallpaperUri, Bitmap wallpaperBitmap) {
        if (TextUtils.isEmpty(wallpaperUri) || !qrj(bf2.toq.toq())) {
            return;
        }
        String strM9692g = m9692g(wallpaperUri);
        String strM9690q = m9690q(true, wallpaperBitmap, strM9692g);
        Bundle bundle = new Bundle();
        bundle.putString("wallpaper_type", "image");
        bundle.putString("wallpaper_uri", strM9690q);
        bundle.putString("wallpaper_origin_uri", strM9692g);
        bundle.putBoolean("cropped", true);
        bundle.putString("gallery_json", "");
        toq(context, "addWallpaperFromEditor", bundle);
    }

    public void kja0(File file) {
        try {
            if (file.exists()) {
                return;
            }
            new File(file.getParent()).mkdirs();
            file.createNewFile();
        } catch (Exception e2) {
            Log.e(f61225zy, "makeParentDirExists:" + e2.getMessage());
        }
    }

    /* JADX INFO: renamed from: n */
    public boolean m9694n(String source, String des) {
        File file = new File(des);
        kja0(file);
        return C7083n.zy(new File(source), file);
    }

    public boolean qrj(Context context) {
        if (context instanceof Activity) {
            context = context.getApplicationContext();
        }
        boolean zX2 = x2(context);
        boolean zN7h = n7h(context);
        Log.i(f61225zy, "isInstalledAndOpen -> isInstalled: $isInstalled, isOpen: $isOpen");
        return zX2 && zN7h;
    }

    /* JADX INFO: renamed from: y */
    public String m9695y(EnumC2772k fileType) {
        return this.f61226toq + "/current/" + fileType.fileName;
    }
}
