package com.android.thememanager.settings.superwallpaper.utils;

import android.app.WallpaperInfo;
import android.app.WallpaperManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import androidx.core.content.C0498q;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1819o;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.basemodule.utils.bf2;
import com.android.thememanager.basemodule.utils.ki;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.ncyb;
import com.android.thememanager.util.C2805r;
import com.android.thememanager.util.ek5k;
import com.android.thememanager.util.h7am;
import com.android.thememanager.util.mcp;
import com.android.thememanager.util.py;
import com.android.thememanager.util.uc;
import com.android.thememanager.wallpaper.C2951n;
import java.io.File;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: HomeUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class f7l8 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f60949f7l8 = "hotSeatsNeedAlpha";

    /* JADX INFO: renamed from: g */
    private static final String f15753g = "wallpaperColorMode";

    /* JADX INFO: renamed from: k */
    private static final String f15754k = "HomeUtils";

    /* JADX INFO: renamed from: n */
    private static final String f15755n = "result_bitmap";

    /* JADX INFO: renamed from: q */
    private static final String f15756q = "getHomePreview";

    /* JADX INFO: renamed from: s */
    private static final String f15757s = "content://com.mfashiongallery.emag.file/dkmgs/wallpaper";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f60950toq;

    /* JADX INFO: renamed from: y */
    public static final String f15758y = "screenOrientation";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f60951zy;

    static {
        String strM26160k = miuix.os.f7l8.m26160k("ro.miui.product.home", InterfaceC1789q.k9);
        f60950toq = strM26160k;
        f60951zy = strM26160k + ".launcher.settings";
    }

    private f7l8() {
    }

    public static Bitmap f7l8(Context context) {
        if (y9n.m7251n(32) && context.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
            Log.e(f15754k, "getWallpaper no READ_EXTERNAL_STORAGE permission");
            return null;
        }
        if (C1807g.zurt()) {
            Bitmap qVar = C2805r.toq(bf2.toq.toq(), C1807g.wvg() ? 1 : 2);
            if (qVar != null && !qVar.isRecycled()) {
                return qVar;
            }
        }
        Bitmap qVar2 = com.android.thememanager.settings.superwallpaper.wallpaper.toq.m9322k(context).toq();
        Log.i(f15754k, "getWallpaperByManager success bitmap: " + qVar2);
        if (qVar2 == null || qVar2.isRecycled()) {
            return null;
        }
        return qVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: g */
    public static Bitmap m9254g(Context context, WallpaperManager wallpaperManager) throws Throwable {
        Bitmap qVar;
        ParcelFileDescriptor wallpaperFile;
        if (C2951n.fn3e().kja0()) {
            Bitmap bitmapM10488z = C2951n.fn3e().m10488z((!C1807g.zurt() || C1807g.wvg()) ? 1 : 4);
            if (bitmapM10488z != null) {
                return bitmapM10488z;
            }
        }
        WallpaperInfo wallpaperInfo = wallpaperManager.getWallpaperInfo();
        Log.d(f15754k, "getWallpaper");
        ParcelFileDescriptor parcelFileDescriptor = 0;
        if (wallpaperInfo == null) {
            if (m9258s("video")) {
                qVar = m9259y(context, kja0.f60974zy);
            } else if (m9258s("sensor")) {
                qVar = m9259y(context, C1807g.wvg() ? p001b.f7l8.f53774d1ts : p001b.f7l8.f53785i1an);
            } else if (!m9258s("maml")) {
                qVar = m9258s(ncyb.f60589qrj) ? toq() : f7l8(context);
            } else if (!C1807g.zurt()) {
                qVar = C1807g.lvui() ? BitmapFactory.decodeFile(mcp.m9879s(InterfaceC1789q.ftf)) : BitmapFactory.decodeFile(p001b.f7l8.f53779f3f);
            } else {
                if (y9n.m7251n(32) && C0498q.m2255k(context, "android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    return f7l8(context);
                }
                Drawable drawable = wallpaperManager.getDrawable();
                Bitmap bitmap = drawable instanceof BitmapDrawable ? ((BitmapDrawable) drawable).getBitmap() : null;
                if (bitmap == null) {
                    return f7l8(context);
                }
                qVar = bitmap;
            }
            try {
                if (qVar != null) {
                    return qVar;
                }
                try {
                    wallpaperFile = wallpaperManager.getWallpaperFile(1);
                    if (wallpaperFile != null) {
                        try {
                            BitmapFactory.Options options = new BitmapFactory.Options();
                            Log.d(f15754k, "getWallpaper return normal wallpaper");
                            Bitmap bitmapDecodeFileDescriptor = BitmapFactory.decodeFileDescriptor(wallpaperFile.getFileDescriptor(), null, options);
                            try {
                                wallpaperFile.close();
                            } catch (IOException e2) {
                                Log.e(f15754k, "getWallpaper fd close", e2);
                            }
                            return bitmapDecodeFileDescriptor;
                        } catch (OutOfMemoryError e3) {
                            e = e3;
                            Log.e(f15754k, "getWallpaper Can't decode file", e);
                            if (wallpaperFile != null) {
                                try {
                                    wallpaperFile.close();
                                } catch (IOException e4) {
                                    Log.e(f15754k, "getWallpaper fd close", e4);
                                }
                            }
                            return null;
                        } catch (SecurityException e6) {
                            e = e6;
                            Log.e(f15754k, "getWallpaper Can't decode file", e);
                            if (wallpaperFile != null) {
                                try {
                                    wallpaperFile.close();
                                } catch (IOException e7) {
                                    Log.e(f15754k, "getWallpaper fd close", e7);
                                }
                            }
                            return null;
                        }
                    }
                    if (wallpaperFile != null) {
                        try {
                            wallpaperFile.close();
                        } catch (IOException e8) {
                            Log.e(f15754k, "getWallpaper fd close", e8);
                        }
                    }
                } catch (OutOfMemoryError e9) {
                    e = e9;
                    wallpaperFile = null;
                } catch (SecurityException e10) {
                    e = e10;
                    wallpaperFile = null;
                } catch (Throwable th) {
                    th = th;
                    if (parcelFileDescriptor != 0) {
                        try {
                            parcelFileDescriptor.close();
                        } catch (IOException e11) {
                            Log.e(f15754k, "getWallpaper fd close", e11);
                        }
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                parcelFileDescriptor = qVar;
            }
        } else if (bf2.f57715kja0.equals(wallpaperInfo.getServiceName()) && kja0.zy()) {
            Drawable drawableF7l8 = C2662g.f7l8(context, kja0.f60974zy);
            if (drawableF7l8 != null) {
                Log.d(f15754k, "getWallpaper return video wallpaper");
                return ki.m7107k(drawableF7l8);
            }
        } else if (uc.f16816c.equals(wallpaperInfo.getServiceName())) {
            try {
                return BitmapFactory.decodeStream(context.getContentResolver().openInputStream(Uri.parse(f15757s)));
            } catch (Exception e12) {
                Log.e(f15754k, e12.getLocalizedMessage());
            }
        } else {
            if (!"com.miui.miwallpaper.MiWallpaper".equals(wallpaperInfo.getServiceName())) {
                return f7l8(context);
            }
            try {
                return BitmapFactory.decodeFile(p001b.f7l8.f53779f3f);
            } catch (Exception e13) {
                Log.e(f15754k, e13.getLocalizedMessage());
            }
        }
        Log.d(f15754k, "getWallpaper return null");
        return null;
    }

    /* JADX INFO: renamed from: k */
    public static Bitmap m9255k() {
        Context qVar = bf2.toq.toq();
        File file = new File(com.android.thememanager.basemodule.resource.constants.toq.y9);
        if (file.isDirectory() || !file.exists()) {
            Log.w(f15754k, "fold sensor default small wallpaper config file not exist");
            return f7l8(qVar);
        }
        try {
            String string = new JSONObject(ek5k.toq(file)).getString("smallPreviewPath");
            return p029m.zy.toq(string) ? f7l8(qVar) : m9259y(qVar, string);
        } catch (IOException | JSONException e2) {
            e2.printStackTrace();
            return f7l8(qVar);
        }
    }

    /* JADX INFO: renamed from: n */
    public static Bitmap m9256n(Context context, int colorMode, boolean hotSeatsNeedAlpha) throws Throwable {
        Bundle bundle = new Bundle();
        bundle.putInt(f15758y, context.getResources().getConfiguration().orientation);
        bundle.putInt(f15753g, colorMode);
        bundle.putBoolean(f60949f7l8, hotSeatsNeedAlpha);
        Bundle bundleM9296k = C2667q.m9296k(context, Uri.parse("content://" + f60951zy), f15756q, null, bundle);
        if (bundleM9296k == null) {
            if (C1807g.zurt()) {
                return zy();
            }
            return null;
        }
        byte[] byteArray = bundleM9296k.getByteArray(f15755n);
        Log.d(f15754k, "getPreview successful " + byteArray.length);
        Bitmap bitmapDecodeByteArray = BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length);
        StringBuilder sb = new StringBuilder();
        sb.append("getPreview successful 0x");
        sb.append(bitmapDecodeByteArray == null ? "null bitmap" : Integer.toHexString(bitmapDecodeByteArray.hashCode()));
        Log.d(f15754k, sb.toString());
        return bitmapDecodeByteArray;
    }

    /* JADX INFO: renamed from: q */
    public static Bitmap m9257q(Context context, int colorMode) {
        return m9256n(context, colorMode, true);
    }

    /* JADX INFO: renamed from: s */
    private static boolean m9258s(String destType) {
        if (!p029m.zy.toq(destType) && y9n.lvui()) {
            return ncyb.ld6(false).equals(destType);
        }
        return false;
    }

    private static Bitmap toq() {
        String str = ncyb.f60586kja0;
        Context qVar = bf2.toq.toq();
        Log.w(f15754k, "currentDefaultType: " + str);
        if (!str.equals("sensor")) {
            return (C1807g.zurt() && str.equals("image") && ncyb.x2()) ? m9259y(qVar, h7am.m9801y(false, C1819o.d2ok(qVar), false)) : f7l8(qVar);
        }
        File file = new File(com.android.thememanager.basemodule.resource.constants.toq.y9);
        if (file.isDirectory() || !file.exists()) {
            Log.w(f15754k, "fold sensor default wallpaper config file not exist");
            return f7l8(qVar);
        }
        try {
            JSONObject jSONObject = new JSONObject(ek5k.toq(file));
            String string = jSONObject.getString(py.f16704m);
            if (!C1807g.wvg()) {
                String string2 = jSONObject.getString("smallPreviewPath");
                if (C1821p.m7188p(string2)) {
                    string = string2;
                }
            }
            return p029m.zy.toq(string) ? f7l8(qVar) : m9259y(qVar, string);
        } catch (IOException | JSONException e2) {
            e2.printStackTrace();
            return f7l8(qVar);
        }
    }

    /* JADX INFO: renamed from: y */
    private static Bitmap m9259y(Context context, String videoThumbnailPath) {
        Drawable drawableF7l8 = C2662g.f7l8(context, videoThumbnailPath);
        if (drawableF7l8 != null) {
            return ki.m7107k(drawableF7l8);
        }
        Log.w(f15754k, "desktop thumbnail is null");
        return f7l8(context);
    }

    private static Bitmap zy() {
        boolean zWvg = C1807g.wvg();
        boolean zNcyb = C1819o.ncyb(bf2.toq.toq());
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(InterfaceC1789q.dg4q);
        stringBuffer.append(zWvg ? InterfaceC1789q.pub6 : InterfaceC1789q.v9zx);
        stringBuffer.append(zNcyb ? InterfaceC1789q.pj7 : InterfaceC1789q.qp5l);
        String string = new File(stringBuffer.toString()).exists() ? stringBuffer.toString() : null;
        if (p029m.zy.toq(string)) {
            Log.w(f15754k, "previewPath is not exist");
            return null;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inSampleSize = 4;
        options.inPreferredConfig = Bitmap.Config.RGB_565;
        return BitmapFactory.decodeFile(string, options);
    }
}
