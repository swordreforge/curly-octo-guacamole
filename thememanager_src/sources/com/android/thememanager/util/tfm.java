package com.android.thememanager.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.util.Log;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1821p;
import java.io.File;
import java.io.FilenameFilter;

/* JADX INFO: compiled from: ThemeCompoundPreviewUtil.java */
/* JADX INFO: loaded from: classes2.dex */
public class tfm {

    /* JADX INFO: renamed from: k */
    private static final String f16808k = "ThemeCompoundPreviewUtil";

    /* JADX INFO: renamed from: q */
    private static final int f16809q = 25;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61415toq = "mask";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f61416zy = "/system/media/theme/default/lock_wallpaper";

    public static Boolean cdj() {
        try {
            Resources resourcesForApplication = bf2.toq.toq().getPackageManager().getResourcesForApplication("com.miui.miwallpaper");
            int identifier = resourcesForApplication.getIdentifier("default_wallpaper_support_dark_mode", "bool", "com.miui.miwallpaper");
            if (identifier == 0) {
                return null;
            }
            boolean z2 = resourcesForApplication.getBoolean(identifier);
            Log.i(f16808k, "get support from miwallpaper : " + z2);
            return Boolean.valueOf(z2);
        } catch (Exception e2) {
            Log.e(f16808k, "fail get default_wallpaper_support_dark_mode . " + e2.getLocalizedMessage());
            return null;
        }
    }

    private static Bitmap f7l8(String previewType) {
        if ("lockscreen".equals(previewType)) {
            String strM10006p = m10006p();
            if (strM10006p == null) {
                strM10006p = "/system/media/theme/default/lock_wallpaper";
            }
            return BitmapFactory.decodeFile(strM10006p, new BitmapFactory.Options());
        }
        if (com.android.thememanager.controller.local.kja0.m7516s()) {
            return BitmapFactory.decodeFile(com.android.thememanager.controller.local.kja0.zy(false), new BitmapFactory.Options());
        }
        return BitmapFactory.decodeResource(bf2.toq.toq().getResources(), Resources.getSystem().getIdentifier("default_wallpaper", "drawable", "android"));
    }

    /* JADX INFO: renamed from: g */
    private static void m10002g(File parent) {
        File[] fileArrListFiles = parent.listFiles(new FilenameFilter() { // from class: com.android.thememanager.util.qo
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return tfm.qrj(file, str);
            }
        });
        if (fileArrListFiles == null || fileArrListFiles.length <= 0) {
            return;
        }
        for (File file : fileArrListFiles) {
            file.delete();
        }
    }

    /* JADX INFO: renamed from: h */
    private static Bitmap m10003h(Bitmap firstBitmap, Bitmap secondBitmap) {
        if (firstBitmap == null && secondBitmap == null) {
            return null;
        }
        if (firstBitmap == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(secondBitmap.getWidth(), secondBitmap.getHeight(), secondBitmap.getConfig());
            new Canvas(bitmapCreateBitmap).drawBitmap(secondBitmap, new Matrix(), null);
            return bitmapCreateBitmap;
        }
        if (secondBitmap == null) {
            return firstBitmap;
        }
        Bitmap bitmapM10005n = m10005n(firstBitmap, secondBitmap.getWidth(), secondBitmap.getHeight());
        if (bitmapM10005n == null) {
            return null;
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapM10005n.getWidth(), bitmapM10005n.getHeight(), bitmapM10005n.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        canvas.drawBitmap(bitmapM10005n, new Matrix(), null);
        canvas.drawBitmap(secondBitmap, (Rect) null, new RectF(0.0f, 0.0f, bitmapM10005n.getWidth(), bitmapM10005n.getHeight()), (Paint) null);
        return bitmapCreateBitmap2;
    }

    private static Bitmap kja0(Bitmap firstBitmap, Bitmap secondBitmap) {
        if (firstBitmap == null && secondBitmap == null) {
            return null;
        }
        if (firstBitmap == null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(secondBitmap.getWidth(), secondBitmap.getHeight(), secondBitmap.getConfig());
            new Canvas(bitmapCreateBitmap).drawBitmap(secondBitmap, new Matrix(), null);
            return bitmapCreateBitmap;
        }
        int width = firstBitmap.getWidth();
        int height = firstBitmap.getHeight();
        Matrix matrix = new Matrix();
        if (secondBitmap != null) {
            matrix.setScale((secondBitmap.getWidth() * 1.0f) / firstBitmap.getWidth(), (secondBitmap.getHeight() * 1.0f) / firstBitmap.getHeight());
            width = secondBitmap.getWidth();
            height = secondBitmap.getHeight();
        }
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(width, height, firstBitmap.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        canvas.drawBitmap(firstBitmap, matrix, null);
        if (secondBitmap == null) {
            return bitmapCreateBitmap2;
        }
        canvas.drawBitmap(secondBitmap, 0.0f, 0.0f, (Paint) null);
        return bitmapCreateBitmap2;
    }

    private static String ld6(String path, long startTime) {
        File file = new File(path);
        File parentFile = file.getParentFile();
        if (file.exists()) {
            file.delete();
        }
        final String name = file.getName();
        String[] list = parentFile == null ? null : parentFile.list(new FilenameFilter() { // from class: com.android.thememanager.util.fnq8
            @Override // java.io.FilenameFilter
            public final boolean accept(File file2, String str) {
                return tfm.n7h(name, file2, str);
            }
        });
        if (list == null || list.length == 0) {
            return path + "." + startTime + com.android.thememanager.basemodule.resource.constants.toq.ybu;
        }
        String str = list[0];
        try {
            long j2 = Long.parseLong(str.substring(name.length() + 1, str.lastIndexOf(".")));
            File file2 = new File(parentFile, str);
            if (Math.abs(startTime - j2) <= 3) {
                return file2.getPath();
            }
            m10002g(parentFile);
            return path + "." + startTime + com.android.thememanager.basemodule.resource.constants.toq.ybu;
        } catch (Exception e2) {
            Log.w(f16808k, "getPathForTime fail. " + e2);
            return path + "." + startTime + com.android.thememanager.basemodule.resource.constants.toq.ybu;
        }
    }

    /* JADX INFO: renamed from: n */
    private static Bitmap m10005n(Bitmap bitmap, float w2, float h2) {
        float f2;
        float f3;
        float f4;
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        float f5 = 0.0f;
        if (w2 > h2) {
            float f6 = w2 / h2;
            f3 = width / f6;
            if (height <= f3) {
                f4 = f6 * height;
                f3 = height;
                f2 = 0.0f;
                f5 = (width - f4) / 2.0f;
                width = f4;
            }
            f2 = (height - f3) / 2.0f;
        } else if (w2 < h2) {
            float f7 = h2 / w2;
            f4 = height / f7;
            if (width <= f4) {
                f3 = f7 * width;
                f2 = (height - f3) / 2.0f;
            }
            f3 = height;
            f2 = 0.0f;
            f5 = (width - f4) / 2.0f;
            width = f4;
        } else if (width > height) {
            float f8 = (width - height) / 2.0f;
            f3 = height;
            f2 = 0.0f;
            f5 = f8;
            width = f3;
        } else {
            f2 = (height - width) / 2.0f;
            f3 = width;
        }
        try {
            return Bitmap.createBitmap(bitmap, (int) f5, (int) f2, (int) width, (int) f3, (Matrix) null, false);
        } catch (Exception e2) {
            Log.w(f16808k, "cutBitmap: ", e2);
            e2.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean n7h(String str, File file, String str2) {
        return str2.startsWith(str);
    }

    @zy.dd
    /* JADX INFO: renamed from: p */
    public static String m10006p() {
        if (com.android.thememanager.controller.local.kja0.m7516s()) {
            String strZy = com.android.thememanager.controller.local.kja0.zy(true);
            if (C1821p.m7188p(strZy)) {
                return strZy;
            }
        }
        Resources resources = bf2.toq.toq().getResources();
        try {
            int identifier = resources.getIdentifier("default_lock_wallpaper_path", "string", "android.miui");
            if (identifier == 0) {
                Resources resourcesForApplication = bf2.toq.toq().getPackageManager().getResourcesForApplication("com.miui.miwallpaper");
                int identifier2 = resourcesForApplication.getIdentifier("default_lock_wallpaper_path", "string", "com.miui.miwallpaper");
                if (identifier2 > 0) {
                    return resourcesForApplication.getString(identifier2);
                }
                return null;
            }
            String string = resources.getString(identifier);
            if (string != null && string.length() > 0 && new File(string).exists()) {
                return string;
            }
            Log.w(f16808k, string + ", file invalid, for android.miui, use default.");
            return "/system/media/theme/default/lock_wallpaper";
        } catch (Exception e2) {
            Log.e(f16808k, "fail get default_lock_wallpaper_path : " + e2.getLocalizedMessage());
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7  */
    /* JADX INFO: renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String m10007q(java.lang.String r6, java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.tfm.m10007q(java.lang.String, java.lang.String, boolean):java.lang.String");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean qrj(File file, String str) {
        return str.contains(f61415toq);
    }

    /* JADX INFO: renamed from: s */
    public static String m10008s() {
        Resources resources = bf2.toq.toq().getResources();
        try {
            int identifier = resources.getIdentifier("default_wallpaper_dark_path", "string", "android.miui");
            if (identifier != 0) {
                return resources.getString(identifier);
            }
            Resources resourcesForApplication = bf2.toq.toq().getPackageManager().getResourcesForApplication("com.miui.miwallpaper");
            int identifier2 = resourcesForApplication.getIdentifier("default_wallpaper_dark_path", "string", "com.miui.miwallpaper");
            if (identifier2 == 0) {
                return "";
            }
            String string = resourcesForApplication.getString(identifier2);
            Log.i(f16808k, "get path from miwallpaper : " + string);
            return string;
        } catch (Exception e2) {
            Log.e(f16808k, "fail get default_wallpaper_dark_path . " + e2.getLocalizedMessage());
            return "";
        }
    }

    private static boolean x2(String previewType, boolean isThumbnails) {
        if (InterfaceC1789q.qwyf.equals(previewType)) {
            return true;
        }
        return "icons".equals(previewType) && isThumbnails;
    }

    /* JADX INFO: renamed from: y */
    public static String m10009y(String path) {
        if (path == null || !path.contains(f61415toq)) {
            return null;
        }
        if (path.contains("launcher")) {
            return "launcher";
        }
        if (path.contains("lockscreen")) {
            return "lockscreen";
        }
        if (path.contains(InterfaceC1789q.qwyf)) {
            return InterfaceC1789q.qwyf;
        }
        if (path.contains("icons")) {
            return "icons";
        }
        return null;
    }

    @TargetApi(17)
    private static Bitmap zy(Bitmap image) {
        if (image == null) {
            return null;
        }
        Context qVar = bf2.toq.toq();
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(image, image.getWidth() / 25, image.getHeight() / 25, false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
        RenderScript renderScriptCreate = RenderScript.create(qVar);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        if (bitmapCreateScaledBitmap == null || bitmapCreateBitmap == null || bitmapCreateScaledBitmap.isRecycled() || bitmapCreateBitmap.isRecycled()) {
            Log.w(f16808k, "blurBitmap error , inputBitmap = " + bitmapCreateScaledBitmap + ",outputBitmap = " + bitmapCreateBitmap);
            return null;
        }
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        scriptIntrinsicBlurCreate.setRadius(25.0f);
        scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
        scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
        allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(image.getWidth(), image.getHeight(), image.getConfig());
        Canvas canvas = new Canvas(bitmapCreateBitmap2);
        Matrix matrix = new Matrix();
        matrix.setScale(image.getWidth() / bitmapCreateBitmap.getWidth(), image.getHeight() / bitmapCreateBitmap.getHeight());
        canvas.drawBitmap(bitmapCreateBitmap, matrix, new Paint());
        return bitmapCreateBitmap2;
    }
}
