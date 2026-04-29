package com.android.thememanager.wallpaper;

import android.annotation.SuppressLint;
import android.app.WallpaperColors;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Build;
import android.util.Log;
import androidx.core.content.C0498q;
import com.android.thememanager.basemodule.resource.C1792n;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.o1t;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.basemodule.video.f7l8;
import com.android.thememanager.controller.local.kja0;
import com.android.thememanager.ncyb;
import com.android.thememanager.router.detail.entity.VideoInfoUtils;
import com.android.thememanager.settings.superwallpaper.C2656k;
import com.android.thememanager.settings.superwallpaper.activity.data.SuperWallpaperSummaryData;
import com.android.thememanager.settings.superwallpaper.utils.C2662g;
import com.android.thememanager.settings.superwallpaper.utils.n7h;
import com.android.thememanager.util.h7am;
import com.android.thememanager.util.uc;
import com.miui.maml.widget.edit.MamlutilKt;
import com.miui.miwallpaper.C5306p;
import com.miui.miwallpaper.IMiuiWallpaperManagerCallback;
import java.io.File;
import java.io.InputStream;
import java.util.List;
import miui.util.InputStreamLoader;

/* JADX INFO: renamed from: com.android.thememanager.wallpaper.n */
/* JADX INFO: compiled from: WallpaperController.java */
/* JADX INFO: loaded from: classes2.dex */
public class C2951n {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final int f61571f7l8 = 0;

    /* JADX INFO: renamed from: g */
    @SuppressLint({"StaticFieldLeak"})
    private static volatile C2951n f17754g = null;

    /* JADX INFO: renamed from: n */
    public static final String f17755n = "WallpaperControllerTTM";

    /* JADX INFO: renamed from: k */
    private C5306p f17756k;

    /* JADX INFO: renamed from: q */
    private k f17757q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final boolean f61572toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final Context f61573zy;

    /* JADX INFO: renamed from: com.android.thememanager.wallpaper.n$k */
    /* JADX INFO: compiled from: WallpaperController.java */
    public interface k {
        /* JADX INFO: renamed from: k */
        void mo7518k(C5306p manager);
    }

    private C2951n() {
        Context qVar = bf2.toq.toq();
        this.f61573zy = qVar;
        boolean z2 = Build.VERSION.SDK_INT >= 33;
        this.f61572toq = z2;
        if (z2) {
            try {
                C5306p.lrht(qVar, new C5306p.zy() { // from class: com.android.thememanager.wallpaper.q
                    @Override // com.miui.miwallpaper.C5306p.zy
                    /* JADX INFO: renamed from: k */
                    public final void mo10489k(C5306p c5306p) {
                        this.f17758k.x9kr(c5306p);
                    }
                });
            } catch (Exception e2) {
                Log.e(f17755n, "Error! MiuiWallpaperManager.init fail", e2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void dd(C5306p c5306p) {
        Log.d(f17755n, "bindSuccess: clearWallpaper");
        c5306p.ki(C5306p.f72418zurt);
    }

    public static C2951n fn3e() {
        if (f17754g == null) {
            synchronized (C2951n.class) {
                if (f17754g == null) {
                    f17754g = new C2951n();
                }
            }
        }
        return f17754g;
    }

    /* JADX INFO: renamed from: i */
    private static int m10469i(boolean isLockScreen) {
        return C1807g.zurt() ? ki(isLockScreen) : isLockScreen ? 2 : 1;
    }

    private static int ki(boolean isLockScreen) {
        return isLockScreen ? 10 : 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void ncyb(IMiuiWallpaperManagerCallback iMiuiWallpaperManagerCallback, int i2, C5306p c5306p) {
        C5306p c5306p2;
        if (!this.f61572toq || (c5306p2 = this.f17756k) == null) {
            return;
        }
        c5306p2.bf2(iMiuiWallpaperManagerCallback, i2);
    }

    /* JADX INFO: renamed from: q */
    private void m10471q() {
        uc.m10023g(this.f61573zy, true);
        uc.m10023g(this.f61573zy, false);
    }

    /* JADX INFO: renamed from: s */
    private boolean m10472s(Bitmap bitmap, int which) {
        if (!this.f61572toq || this.f17756k == null) {
            Log.d(f17755n, "applyThemeImageWallpaper null, return");
            return false;
        }
        Log.d(f17755n, "applyThemeImageWallpaper bitmap, which = " + which);
        if (bitmap == null) {
            bitmap = this.f17756k.lvui(which);
        }
        this.f17756k.lv5(bitmap, which);
        return true;
    }

    /* JADX INFO: renamed from: t */
    private C5306p.g m10473t() {
        return new C5306p.g(this.f17756k);
    }

    private static int t8r(boolean isLockScreen, boolean isBoth) {
        if (isBoth) {
            return 15;
        }
        return isLockScreen ? 10 : 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void x9kr(C5306p c5306p) {
        Log.e(f17755n, "on success connected");
        this.f17756k = c5306p;
        k kVar = this.f17757q;
        if (kVar != null) {
            kVar.mo7518k(c5306p);
        }
    }

    public boolean a9(boolean isLock) {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            return C5306p.f72406o1t.equals(c5306p.n5r1(isLock ? 2 : 1));
        }
        Log.w(f17755n, "isDarkType: false");
        return false;
    }

    /* JADX INFO: renamed from: b */
    public void m10474b(ComponentName componentName, SuperWallpaperSummaryData summaryData, int position) {
        Drawable drawableLoadDrawable;
        Drawable drawableLoadDrawable2;
        Drawable drawableLoadDrawable3;
        SuperWallpaperSummaryData.SuperWallpaperLandData superWallpaperLandData;
        Drawable drawableLoadDrawable4;
        if (!this.f61572toq || this.f17756k == null) {
            Log.d(f17755n, "setSuperWallpaper null, return");
            return;
        }
        Log.d(f17755n, "setSuperWallpaper is, position = " + position + componentName);
        Context context = this.f61573zy;
        Drawable drawableLoadDrawable5 = null;
        if (summaryData == null || (superWallpaperLandData = summaryData.f15594f) == null) {
            Log.e(f17755n, "summaryData or summaryData.landData is null, summaryData = " + summaryData);
            drawableLoadDrawable = null;
            drawableLoadDrawable2 = null;
            drawableLoadDrawable3 = null;
        } else {
            Icon icon = superWallpaperLandData.f15616p;
            Drawable drawableLoadDrawable6 = icon != null ? icon.loadDrawable(context) : null;
            Icon icon2 = summaryData.f15594f.f15618s;
            drawableLoadDrawable3 = icon2 != null ? icon2.loadDrawable(context) : null;
            if (position == 0) {
                Icon icon3 = summaryData.f15594f.f15613i;
                Drawable drawableLoadDrawable7 = icon3 != null ? icon3.loadDrawable(context) : null;
                Icon icon4 = summaryData.f15594f.f15612h;
                drawableLoadDrawable4 = icon4 != null ? icon4.loadDrawable(context) : null;
                drawableLoadDrawable5 = drawableLoadDrawable7;
            } else {
                drawableLoadDrawable4 = null;
            }
            Log.d(f17755n, "summaryData.landData not null, lockDark = " + drawableLoadDrawable6 + ", lock = " + drawableLoadDrawable3 + ", desktopDark = " + drawableLoadDrawable5 + ", desktop  " + drawableLoadDrawable4);
            Drawable drawable = drawableLoadDrawable6;
            drawableLoadDrawable2 = drawableLoadDrawable4;
            drawableLoadDrawable = drawableLoadDrawable5;
            drawableLoadDrawable5 = drawable;
        }
        if (drawableLoadDrawable5 == null || drawableLoadDrawable3 == null || drawableLoadDrawable == null || drawableLoadDrawable2 == null) {
            Intent intent = new Intent("miui.service.wallpaper.SuperWallpaperService");
            intent.setPackage(componentName.getPackageName());
            List<ResolveInfo> listQueryIntentServices = context.getPackageManager().queryIntentServices(intent, 128);
            if (listQueryIntentServices == null || listQueryIntentServices.size() <= 0) {
                Log.e(f17755n, "queryIntentServices is null or list size empty, list = " + listQueryIntentServices);
            } else {
                ServiceInfo serviceInfo = listQueryIntentServices.get(0).serviceInfo;
                if (drawableLoadDrawable == null) {
                    drawableLoadDrawable = Icon.createWithResource(componentName.getPackageName(), serviceInfo.metaData.getInt("home_small_preview_" + position + MamlutilKt.PREVIEW_DARK_SUF)).loadDrawable(context);
                }
                if (drawableLoadDrawable2 == null) {
                    drawableLoadDrawable2 = Icon.createWithResource(componentName.getPackageName(), serviceInfo.metaData.getInt("home_small_preview_" + position)).loadDrawable(context);
                }
                if (drawableLoadDrawable5 == null) {
                    drawableLoadDrawable5 = Icon.createWithResource(componentName.getPackageName(), serviceInfo.metaData.getInt(C2656k.f15711i)).loadDrawable(context);
                }
                if (drawableLoadDrawable3 == null) {
                    drawableLoadDrawable3 = Icon.createWithResource(componentName.getPackageName(), serviceInfo.metaData.getInt(C2656k.f60932t8r)).loadDrawable(context);
                }
            }
        }
        this.f17756k.qkj8(componentName, C2662g.toq(drawableLoadDrawable2), C2662g.toq(drawableLoadDrawable), C2662g.toq(drawableLoadDrawable3), C2662g.toq(drawableLoadDrawable5));
    }

    public void bf2(IMiuiWallpaperManagerCallback cb) {
        C5306p c5306p = this.f17756k;
        if (c5306p != null) {
            if (!this.f61572toq || c5306p == null) {
                return;
            } else {
                c5306p.zsr0(cb);
            }
        }
        Log.d(f17755n, "unRegisterWallpaperChangeListener");
    }

    /* JADX INFO: renamed from: c */
    public void m10475c(k callBack) {
        Log.w(f17755n, "setBindCallBackImmediately");
        this.f17757q = callBack;
        if (m10481l()) {
            this.f17757q.mo7518k(this.f17756k);
        }
    }

    public String cdj() {
        C5306p c5306p = this.f17756k;
        if (c5306p != null) {
            return c5306p.o1t();
        }
        return null;
    }

    public boolean d2ok() {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            return "super_wallpaper".equals(c5306p.n5r1(1));
        }
        Log.w(f17755n, "isSuperWallpaperType: false");
        return false;
    }

    public boolean d3(boolean isLock) {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            return "image".equals(c5306p.n5r1(isLock ? 2 : 1));
        }
        Log.w(f17755n, "isImageType: false");
        return false;
    }

    /* JADX INFO: renamed from: e */
    public boolean m10476e(Bitmap useBitmap, Bitmap bitmap, Bitmap darkBitmap, boolean isLockscreen, boolean needDark) {
        return lrht(useBitmap, bitmap, darkBitmap, isLockscreen ? 8 : 4, needDark);
    }

    public void ek5k(String videoPath, Bitmap largePreview, Bitmap smallPreview, int multiWhich) {
        C5306p c5306p;
        if (!this.f61572toq || (c5306p = this.f17756k) == null) {
            return;
        }
        c5306p.xwq3(videoPath, largePreview, smallPreview, multiWhich);
    }

    public boolean eqxt(boolean isLock) {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            return "sensor".equals(c5306p.n5r1(isLock ? 2 : 1));
        }
        Log.w(f17755n, "isSensorVideoWallpaper: false");
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m10477f(k callBack) {
        Log.w(f17755n, "setBindCallBack");
        this.f17757q = callBack;
    }

    public boolean f7l8(Bitmap bitmap) {
        return m10472s(bitmap, C1807g.zurt() ? ki(true) : 2);
    }

    public boolean fti(boolean isLock) {
        C5306p c5306p;
        if (!this.f61572toq || (c5306p = this.f17756k) == null) {
            Log.w(f17755n, "isSuperWallpaperType: false");
            return false;
        }
        int i2 = isLock ? 2 : 1;
        String strN5r1 = c5306p.n5r1(i2);
        Log.d(f17755n, "isDefaultWallpaperType: type: " + strN5r1);
        if ("default".equals(strN5r1)) {
            Log.d(f17755n, "isDefaultWallpaperType!");
            return true;
        }
        if (C5306p.f72406o1t.equals(strN5r1)) {
            String strD2ok = this.f17756k.d2ok(strN5r1, i2, true, false);
            return strD2ok == null || !new File(strD2ok).exists();
        }
        if (!"image".equals(strN5r1) && !"sensor".equals(strN5r1) && !"video".equals(strN5r1)) {
            return false;
        }
        String strD2ok2 = this.f17756k.d2ok(strN5r1, i2, false, false);
        return strD2ok2 == null || !new File(strD2ok2).exists();
    }

    public String fu4(String type, int singleWhich, boolean isDark, boolean isVideoThumbnail) {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            return c5306p.d2ok(type, singleWhich, isDark, isVideoThumbnail);
        }
        Log.w(f17755n, "getMiuiWallpaperPreviewPath: is false");
        return null;
    }

    /* JADX INFO: renamed from: g */
    public boolean m10478g(InputStream is) {
        return m10485p(is, 1);
    }

    public boolean gvn7() {
        if (!this.f61572toq || this.f17756k == null || C1807g.zurt()) {
            return false;
        }
        return "gallery".equals(this.f17756k.n5r1(1));
    }

    /* JADX INFO: renamed from: h */
    public String m10479h() {
        C5306p c5306p = this.f17756k;
        if (c5306p != null) {
            return c5306p.m18066z();
        }
        return null;
    }

    public boolean hb(Bitmap destBitmap, int which, boolean needDark) {
        if (!this.f61572toq || this.f17756k == null) {
            Log.d(f17755n, "setMiuiImageWallpaper null, return");
            return false;
        }
        Log.d(f17755n, "setMiuiImageWallpaper bitmap, which = " + which);
        m10473t().t8r(which).m18074y(destBitmap).qrj(needDark).m18069k();
        return true;
    }

    public void hyr(final IMiuiWallpaperManagerCallback cb, final int multiWhich) {
        C5306p c5306p = this.f17756k;
        if (c5306p != null) {
            c5306p.bf2(cb, multiWhich);
        } else {
            fn3e().m10477f(new k() { // from class: com.android.thememanager.wallpaper.zy
                @Override // com.android.thememanager.wallpaper.C2951n.k
                /* JADX INFO: renamed from: k */
                public final void mo7518k(C5306p c5306p2) {
                    this.f17759k.ncyb(cb, multiWhich, c5306p2);
                }
            });
        }
        Log.d(f17755n, "registerWallpaperChangeListener");
    }

    /* JADX INFO: renamed from: j */
    public boolean m10480j(Bitmap destBitmap, boolean isLockScreen, boolean needDark) {
        return hb(destBitmap, m10469i(isLockScreen), needDark);
    }

    public boolean jk() {
        if (o1t.C1820k.m7181n() == o1t.C1820k.f57802ld6) {
            return true;
        }
        C5306p c5306p = this.f17756k;
        return c5306p != null && c5306p.dd() >= 21;
    }

    public boolean jp0y(boolean isLock) {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            return "gallery".equals(c5306p.n5r1(isLock ? 2 : 1));
        }
        Log.w(f17755n, "isGalleryType: false");
        return false;
    }

    public boolean kja0() {
        return this.f61572toq;
    }

    /* JADX INFO: renamed from: l */
    public boolean m10481l() {
        return this.f17756k != null;
    }

    public boolean ld6(Object deskMamlPreviewIs, Object lockMamlPreviewIs, int which) {
        if (!this.f61572toq || this.f17756k == null) {
            Log.d(f17755n, "applyThemeImageWallpaper null, return");
            return false;
        }
        Log.d(f17755n, "applyThemeImageWallpaper is, which = " + which);
        m10473t().t8r(which).m18070n(0).m18073s(deskMamlPreviewIs, lockMamlPreviewIs).m18069k();
        return true;
    }

    public boolean lrht(Bitmap bitmap, Bitmap destBitmap, Bitmap darkBitmap, int which, boolean needDark) {
        if (!this.f61572toq || this.f17756k == null) {
            Log.d(f17755n, "setMiuiDarkModeWallpaper null, return");
            return false;
        }
        Log.d(f17755n, "setMiuiDarkModeWallpaper bitmap, which = " + which);
        m10473t().t8r(which).m18072q(destBitmap, darkBitmap).qrj(needDark).m18069k();
        return true;
    }

    public boolean lvui() {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            return p029m.zy.m24738k(c5306p.n5r1(2), "maml");
        }
        Log.d(f17755n, "mMiuiWallpaperManager is null");
        return false;
    }

    /* JADX INFO: renamed from: m */
    public boolean m10482m(Bitmap useBitmap, boolean isLockscreen, boolean needDark) {
        return hb(useBitmap, isLockscreen ? 8 : 4, needDark);
    }

    public int mcp() {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            return c5306p.wvg(2);
        }
        Log.d(f17755n, "get wallpaper effectId fail, return");
        return 0;
    }

    /* JADX INFO: renamed from: n */
    public boolean m10483n(Bitmap bitmap) {
        return m10472s(bitmap, C1807g.zurt() ? ki(false) : 1);
    }

    public void n5r1(boolean needReopenHomeGallery, boolean needReopenLockGallery) {
        if (!this.f61572toq || this.f17756k == null) {
            return;
        }
        if (needReopenLockGallery) {
            n7h.n7h(this.f61573zy, n7h.f60980ld6);
        }
        if (needReopenHomeGallery) {
            C5306p c5306p = this.f17756k;
            c5306p.m18056a(c5306p.lvui(1), 1, "");
        }
    }

    public void n7h() {
        if (this.f61572toq) {
            if (kja0.ld6()) {
                m10471q();
                return;
            }
            C5306p c5306p = this.f17756k;
            if (c5306p != null) {
                c5306p.ki(C5306p.f72418zurt);
            } else {
                Log.d(f17755n, "mMiuiWallpaperManager is not init !");
                fn3e().m10477f(new k() { // from class: com.android.thememanager.wallpaper.toq
                    @Override // com.android.thememanager.wallpaper.C2951n.k
                    /* JADX INFO: renamed from: k */
                    public final void mo7518k(C5306p c5306p2) {
                        C2951n.dd(c5306p2);
                    }
                });
            }
        }
    }

    public WallpaperColors ni7(int which) {
        C5306p c5306p;
        if (!this.f61572toq || (c5306p = this.f17756k) == null) {
            return null;
        }
        return c5306p.gvn7(which);
    }

    public boolean nn86(String videoPath, boolean isLockScreen, boolean isBoth, boolean loop) {
        return y9n(videoPath, null, t8r(isLockScreen, isBoth), loop);
    }

    /* JADX INFO: renamed from: o */
    public boolean m10484o(InputStream is, boolean isLockScreen, boolean needDark) {
        if (!this.f61572toq || this.f17756k == null) {
            Log.d(f17755n, "setMiuiImageWallpaper null, return");
            return false;
        }
        Log.d(f17755n, "setMiuiImageWallpaper is, isLockScreen = " + isLockScreen);
        m10473t().t8r(m10469i(isLockScreen)).m18074y(is).qrj(needDark).m18069k();
        return true;
    }

    public boolean o1t(boolean isLock) {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            return c5306p.d8wk(isLock ? 2 : 1);
        }
        Log.d(f17755n, "get blur state fail, return");
        return false;
    }

    public boolean oc(boolean isLock) {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            return "maml".equals(c5306p.n5r1(isLock ? 2 : 1));
        }
        Log.w(f17755n, "isMamlWallpaperType: false");
        return false;
    }

    /* JADX INFO: renamed from: p */
    public boolean m10485p(InputStream is, int which) {
        if (!this.f61572toq || this.f17756k == null) {
            Log.d(f17755n, "applyThemeImageWallpaper null, return");
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("applyThemeImageWallpaper is, which = ");
        sb.append(which);
        sb.append(",inputStream is null ? ");
        sb.append(is == null);
        Log.d(f17755n, sb.toString());
        m10473t().t8r(which).m18070n(0).m18073s(is, null).m18069k();
        return true;
    }

    public void qrj(boolean isLockScreen) {
        if (this.f61572toq) {
            int i2 = isLockScreen ? 2 : 1;
            if (C1807g.zurt()) {
                i2 |= isLockScreen ? 8 : 4;
            }
            C5306p c5306p = this.f17756k;
            if (c5306p == null) {
                Log.w(f17755n, "clearWallpaper: mMiuiWallpaperManager is null");
            } else {
                c5306p.ki(i2);
            }
        }
    }

    /* JADX INFO: renamed from: r */
    public boolean m10486r(boolean isLock) {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            return "video".equals(c5306p.n5r1(isLock ? 2 : 1));
        }
        Log.w(f17755n, "isVideoType: false");
        return false;
    }

    public boolean uv6(Bitmap bitmap, Bitmap destBitmap, Bitmap darkBitmap, boolean isLockScreen, boolean needDark) {
        return lrht(bitmap, destBitmap, darkBitmap, m10469i(isLockScreen), needDark);
    }

    public boolean vyq(InputStream is, String originPath, String darkModePath, boolean isLockScreen, boolean isUseDark, boolean needDark) {
        InputStreamLoader inputStreamLoader;
        InputStream inputStream;
        if (!this.f61572toq || this.f17756k == null) {
            Log.d(f17755n, "setMiuiDarkModeWallpaper null, return");
            return false;
        }
        Log.d(f17755n, "setMiuiDarkModeWallpaper is, isLockScreen = " + isLockScreen);
        if (isUseDark) {
            InputStreamLoader inputStreamLoader2 = new InputStreamLoader(originPath);
            InputStream inputStream2 = inputStreamLoader2.get();
            inputStream = is;
            is = inputStream2;
            inputStreamLoader = inputStreamLoader2;
        } else {
            inputStreamLoader = new InputStreamLoader(darkModePath);
            inputStream = inputStreamLoader.get();
        }
        m10473t().t8r(m10469i(isLockScreen)).m18072q(is, inputStream).qrj(needDark).m18069k();
        inputStreamLoader.close();
        return true;
    }

    public boolean wvg() {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            return c5306p.m18059h(2);
        }
        Log.d(f17755n, "get blur state fail, return");
        return false;
    }

    public boolean x2(String videoPath) {
        if (p029m.zy.toq(videoPath)) {
            return false;
        }
        String strN7h = C1792n.n7h(videoPath);
        return strN7h.contains(com.android.thememanager.basemodule.resource.constants.toq.n96) && !strN7h.endsWith(VideoInfoUtils.NO_LOOP);
    }

    /* JADX INFO: renamed from: y */
    public boolean m10487y(InputStream is) {
        return m10485p(is, 2);
    }

    public boolean y9n(String videoPath, Bitmap bitmap, int which, boolean loop) {
        if (!this.f61572toq || this.f17756k == null) {
            Log.d(f17755n, "setMiuiVideoWallpaper null, return");
            return false;
        }
        Log.d(f17755n, "setMiuiVideoWallpaper, which = " + which);
        if (bitmap == null) {
            bitmap = f7l8.toq(videoPath, -1L, 2);
        }
        this.f17756k.m18058d(videoPath, bitmap, which, loop);
        return true;
    }

    public boolean yz(String videoPath, int which, boolean loop) {
        return y9n(videoPath, null, which, loop);
    }

    /* JADX INFO: renamed from: z */
    public Bitmap m10488z(int which) {
        if (!this.f61572toq || this.f17756k == null) {
            return null;
        }
        if (!y9n.m7251n(32) || C0498q.m2255k(this.f61573zy, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            return this.f17756k.lvui(which);
        }
        Log.e(f17755n, "getMiuiWallpaperPreview fail, which = " + which + ", need Permission READ_EXTERNAL_STORAGE");
        return null;
    }

    public Bitmap zurt(boolean isLock, boolean isDark) {
        C5306p c5306p;
        if (this.f61572toq && (c5306p = this.f17756k) != null) {
            int i2 = isLock ? 2 : 1;
            String strN5r1 = c5306p.n5r1(i2);
            if (ncyb.n7h(isLock) && (C5306p.f72406o1t.equals(strN5r1) || !isDark)) {
                Bitmap bitmapDecodeFile = BitmapFactory.decodeFile(this.f17756k.d2ok(strN5r1, i2, isDark, false));
                if (bitmapDecodeFile == null && this.f17756k.nn86(i2)) {
                    Log.i(f17755n, "getMiuiImageWallpaperBitmapForBackUp: Try to get DEFAULT_WALLPAPER by WallpaperManager");
                    bitmapDecodeFile = BitmapFactory.decodeFile(this.f17756k.d2ok("default", i2, isDark, false));
                }
                if (bitmapDecodeFile != null) {
                    return bitmapDecodeFile;
                }
                Log.i(f17755n, "getMiuiImageWallpaperBitmapForBackUp: Try to get preset default wallpaper");
                return BitmapFactory.decodeFile(h7am.m9799q(isDark));
            }
        }
        return null;
    }
}
