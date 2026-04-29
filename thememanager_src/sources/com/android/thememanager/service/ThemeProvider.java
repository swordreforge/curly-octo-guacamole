package com.android.thememanager.service;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.util.ArrayMap;
import android.util.Log;
import com.android.thememanager.activity.LargeIconPickerActivity;
import com.android.thememanager.activity.dxef;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.privacy.C1781k;
import com.android.thememanager.basemodule.resource.C1793p;
import com.android.thememanager.basemodule.resource.constants.C1788k;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.resource.model.Resource;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.fu4;
import com.android.thememanager.basemodule.utils.vyq;
import com.android.thememanager.basemodule.utils.y9n;
import com.android.thememanager.clockmessage.C1875q;
import com.android.thememanager.controller.C1900g;
import com.android.thememanager.controller.local.C1912s;
import com.android.thememanager.maml.C2158y;
import com.android.thememanager.mine.local.model.LocalFontModel;
import com.android.thememanager.model.PrecustSystemWallpaperInfo;
import com.android.thememanager.settings.eqxt;
import com.android.thememanager.util.ch;
import com.android.thememanager.util.d2ok;
import com.android.thememanager.util.fn3e;
import com.android.thememanager.util.g1;
import com.android.thememanager.util.mbx;
import com.android.thememanager.util.oc;
import com.android.thememanager.util.t8iq;
import com.android.thememanager.util.uc;
import com.android.thememanager.wallpaper.C2951n;
import com.google.android.exoplayer2.text.ttml.C3678q;
import com.google.gson.C4871g;
import com.xiaomi.mipush.sdk.C5658n;
import java.io.File;
import java.util.List;
import qkj8.C7617k;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class ThemeProvider extends ContentProvider implements InterfaceC1789q {

    /* JADX INFO: renamed from: a */
    private static final String f14738a = "package_name";

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private static final String f60760ab = "disableLockscreenV2";
    private static final String an = "resetRingtone";

    /* JADX INFO: renamed from: b */
    private static final String f14739b = "darken_bitmap";
    private static final String bb = "isSupportDisableLockscreenV2";

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final String f60761bo = "id";
    private static final String bp = "getUsingIconInfo";
    private static final String bv = "iconTitle";

    /* JADX INFO: renamed from: c */
    private static final String f14740c = "restoreWallpaperInfo";

    /* JADX INFO: renamed from: d */
    @Deprecated
    private static final String f14741d = "disableLockscreen";

    /* JADX INFO: renamed from: e */
    private static final String f14742e = "supportWallpaperExchange";

    /* JADX INFO: renamed from: f */
    private static final String f14743f = "backupWallpaperInfo";

    /* JADX INFO: renamed from: g */
    private static final String f14744g = "com.miui.miwallpaper";

    /* JADX INFO: renamed from: h */
    private static final String f14745h = "setupProvisionResources";

    /* JADX INFO: renamed from: i */
    private static final String f14746i = "getCurrentThemeInfo";

    /* JADX INFO: renamed from: j */
    private static final String f14747j = "support";

    /* JADX INFO: renamed from: k */
    private static final String f14748k = "ThemeProvider";

    /* JADX INFO: renamed from: l */
    private static final String f14749l = "isloop";

    /* JADX INFO: renamed from: m */
    private static final String f14750m = "support_largeicon";

    /* JADX INFO: renamed from: n */
    private static final String f14751n = "com.mfashiongallery.emag";

    /* JADX INFO: renamed from: o */
    private static final String f14752o = "isNew";

    /* JADX INFO: renamed from: p */
    private static final String f14753p = "key_superpower_state";

    /* JADX INFO: renamed from: q */
    public static final String f14754q = "com.android.thememanager.theme_provider";

    /* JADX INFO: renamed from: r */
    private static final String f14755r = "isKeyguard";

    /* JADX INFO: renamed from: s */
    private static final String f14756s = "changeSuperPowerMode";

    /* JADX INFO: renamed from: t */
    private static final String f14757t = "wallpaperLooper";

    /* JADX INFO: renamed from: u */
    private static final String f14758u = "isRetro";

    /* JADX INFO: renamed from: v */
    private static final String f14759v = "name";

    /* JADX INFO: renamed from: w */
    @Deprecated
    private static final String f14760w = "isSupportDisableLockscreen";

    /* JADX INFO: renamed from: x */
    private static final String f14761x = "restore_default_theme";

    /* JADX INFO: renamed from: y */
    private static final String f14762y = "changeExtremeMode";

    /* JADX INFO: renamed from: z */
    private static final String f14763z = "clearRuntimeSuperWallpaper";

    /* JADX INFO: renamed from: com.android.thememanager.service.ThemeProvider$k */
    class RunnableC2488k implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Bundle f14764k;

        RunnableC2488k(final Bundle val$extras) {
            this.f14764k = val$extras;
        }

        @Override // java.lang.Runnable
        public void run() {
            com.android.thememanager.controller.cdj.m7457k(this.f14764k);
        }
    }

    /* JADX INFO: renamed from: k */
    private boolean m8897k(String mode, String expectMode) {
        if (p029m.zy.m24738k(mode, expectMode)) {
            return true;
        }
        Log.w(f14748k, "openFile: mode is unsupported !");
        return false;
    }

    public static boolean toq(boolean isKeyguard) {
        boolean z2;
        List<com.android.thememanager.settings.subsettings.f7l8> listKi = eqxt.ki(false, false);
        String strFu4 = vyq.fu4(isKeyguard ? "lockscreen" : "wallpaper");
        String[] strArrSplit = strFu4 == null ? null : strFu4.split(com.android.thememanager.basemodule.resource.constants.toq.n96);
        if (strArrSplit == null || strArrSplit.length < 2 || y9n.mcp(listKi)) {
            return false;
        }
        String str = strArrSplit[0];
        int i2 = 0;
        while (true) {
            z2 = true;
            if (i2 >= listKi.size()) {
                break;
            }
            com.android.thememanager.settings.subsettings.f7l8 f7l8Var = listKi.get(i2);
            if (f7l8Var == null || str == null || !p029m.zy.m24738k(str, f7l8Var.f15454q) || y9n.mcp(f7l8Var.f60866zy)) {
                i2++;
            } else {
                String extraMeta = f7l8Var.f60866zy.get(0).getExtraMeta(PrecustSystemWallpaperInfo.INNERTAGS);
                z2 = extraMeta == null || extraMeta.contains("loop");
            }
        }
        Log.i(f14748k, "isVideoWallpaperLoop: " + isKeyguard + ",isSupportLoop : " + z2 + ",fileName : " + str);
        return z2;
    }

    private ParcelFileDescriptor zy(String filePath) {
        try {
            File file = new File(filePath);
            if (file.exists()) {
                return ParcelFileDescriptor.open(file, 268435456);
            }
            Log.w(f14748k, "openReadOnlyFile failed: file not exists. path = " + filePath);
            return null;
        } catch (Exception e2) {
            Log.e(f14748k, "openFile: error !" + e2.getMessage());
            return null;
        }
    }

    @Override // android.content.ContentProvider
    public Bundle call(String method, String arg, Bundle extras) {
        Bundle bundle;
        String callingPackage = getCallingPackage();
        Log.i(f14748k, "call " + method + " from " + callingPackage);
        if (p029m.zy.toq(method)) {
            return null;
        }
        if (method.equals(f14757t)) {
            boolean qVar = toq(extras.getBoolean(f14755r, true));
            Bundle bundle2 = new Bundle();
            bundle2.putBoolean(f14749l, qVar);
            return bundle2;
        }
        if (method.equals(f14762y)) {
            oc.hyr();
            return null;
        }
        if (C1793p.f57694toq.equals(method)) {
            if (C1788k.m6921k()) {
                return C1793p.zy(getContext(), callingPackage, arg, extras);
            }
            return null;
        }
        if ("com.mfashiongallery.emag".equals(callingPackage) || "com.miui.miwallpaper".equals(callingPackage)) {
            if (method.equals(f60760ab)) {
                C7617k.toq().m27925k("com.miui.home.none_provider");
                uc.m10026j();
                return null;
            }
            if (method.equals(bb)) {
                Bundle bundle3 = new Bundle();
                bundle3.putBoolean(bb, true);
                return bundle3;
            }
            if (!mbx.f61360zy.equals(method)) {
                if (!f14763z.equals(method)) {
                    return null;
                }
                uc.lrht(getContext(), true, true);
                return null;
            }
            if (y9n.m7250l()) {
                com.android.thememanager.controller.cdj.m7457k(extras);
                return null;
            }
            new Handler(Looper.getMainLooper()).post(new RunnableC2488k(extras));
            return null;
        }
        if (method.equals(f14756s)) {
            if (extras == null) {
                return null;
            }
            boolean z2 = extras.getBoolean(f14753p, false);
            SharedPreferences.Editor editorM9945f = oc.m9945f();
            editorM9945f.putBoolean(oc.tlhn, z2);
            editorM9945f.apply();
            oc.nn86();
            return null;
        }
        if (f14746i.equals(method)) {
            String strM7235z = vyq.m7235z("theme");
            String strFu4 = vyq.fu4("theme");
            boolean zX2 = C1875q.m7391g().x2(strM7235z);
            Bundle bundle4 = new Bundle();
            bundle4.putBoolean(f14758u, zX2);
            bundle4.putString("id", strM7235z);
            bundle4.putString("name", strFu4);
            return bundle4;
        }
        if (method.equals(f14745h)) {
            Log.w(f14748k, "ThemeProvider call setupProvisionResources to set wallpaper");
            try {
                if ("com.xiaomi.mihomemanager".equals(getCallingPackage())) {
                    Log.w(f14748k, "begin clear wallpaper for custom");
                    C2951n.fn3e().n7h();
                } else if (com.android.thememanager.controller.local.kja0.ld6()) {
                    Log.w(f14748k, "caller is not com.xiaomi.mihomemanager");
                    com.android.thememanager.controller.local.kja0.qrj();
                }
                if (!g1.eqxt()) {
                    dxef.m6406k();
                    g1.dr(true);
                }
                if (uc.x9kr()) {
                    fn3e.d3();
                }
                com.android.thememanager.controller.local.kja0.x2();
                com.android.thememanager.settings.personalize.f7l8.x2();
                return null;
            } catch (Throwable th) {
                th.printStackTrace();
                return null;
            }
        }
        if (com.android.thememanager.util.cache.zy.toq(method)) {
            com.android.thememanager.util.cache.zy.m9660k(getContext(), extras);
            return null;
        }
        if (f14743f.equals(method)) {
            fn3e.x2();
            return null;
        }
        if (f14740c.equals(method)) {
            fn3e.gvn7(f14752o.equals(arg));
            return null;
        }
        if (f14742e.equals(method)) {
            Bundle bundle5 = new Bundle();
            bundle5.putBoolean(f14747j, true);
            return bundle5;
        }
        if (C1912s.f57938toq.equals(method)) {
            Bundle bundle6 = new Bundle();
            if (!C1781k.toq(getContext())) {
                bundle6.putBoolean(C1912s.f57937f7l8, false);
            }
            List<LocalFontModel> listM7533n = C1912s.m7533n(getContext(), callingPackage);
            if (listM7533n == null) {
                Log.w(f14748k, "fonts is null.");
                return bundle6;
            }
            Log.d(f14748k, "font num: " + listM7533n.size());
            bundle6.putString("result", new C4871g().o1t(listM7533n));
            return bundle6;
        }
        if (C1912s.f57939zy.equals(method)) {
            Bundle bundle7 = new Bundle();
            if (!C1781k.toq(getContext())) {
                bundle7.putBoolean(C1912s.f57937f7l8, false);
            }
            int i2 = extras.getInt("fontScale", -1);
            int i3 = extras.getInt(C3678q.f65808d2ok, -1);
            boolean qVar2 = C1912s.toq(getContext(), extras.getString(C1912s.f10919q), i2, i3);
            bundle7.putBoolean(C1912s.f10916g, qVar2);
            bundle7.putBoolean("applyFontScale", qVar2 && i2 > 0);
            bundle7.putBoolean("applyFontWeight", qVar2 && i3 >= 0);
            return bundle7;
        }
        if (bp.equals(method)) {
            Resource resourceD2ok = ch.d2ok("icons", true);
            if (resourceD2ok != null) {
                String title = (resourceD2ok.getLocalInfo() == null || resourceD2ok.getLocalInfo().getTitles() == null) ? resourceD2ok.getTitle() : (String) fu4.f7l8(resourceD2ok.getLocalInfo().getTitles(), fu4.m7067k());
                bundle = new Bundle();
                bundle.putString(bv, title);
            } else {
                bundle = new Bundle();
                String strFu42 = vyq.fu4("icons");
                if (p029m.zy.toq(strFu42)) {
                    bundle.putString(bv, " ");
                } else {
                    bundle.putString(bv, strFu42);
                }
            }
            return bundle;
        }
        if (an.equals(method)) {
            Bundle bundle8 = new Bundle();
            com.android.thememanager.basemodule.utils.ch.ld6();
            return bundle8;
        }
        if (f14739b.equals(method)) {
            return C2498q.m8952k(getContext());
        }
        if (C2158y.f60441toq.equals(method)) {
            return C2158y.toq(extras);
        }
        if (C2158y.f60443zy.equals(method)) {
            return C2158y.zy(extras);
        }
        if (!f14750m.equals(method)) {
            if (f14761x.equals(method)) {
                if (!"com.android.systemui".equals(callingPackage)) {
                    return null;
                }
                t8iq.f7l8(false);
                return null;
            }
            Bundle bundleLd6 = C2497p.ld6(getContext(), method, extras, callingPackage);
            ArrayMap<String, Object> arrayMapM6679k = com.android.thememanager.basemodule.analysis.zy.m6679k();
            arrayMapM6679k.put(com.android.thememanager.basemodule.analysis.toq.gxqa, callingPackage);
            arrayMapM6679k.put("value", method);
            arrayMapM6679k.put("t", Long.valueOf(System.currentTimeMillis()));
            C1708s.f7l8().ld6().n7h(arrayMapM6679k);
            return bundleLd6;
        }
        Bundle bundle9 = new Bundle();
        if (!C1807g.m7077l()) {
            bundle9.putBoolean(f14750m, false);
            Log.i(f14748k, "device not support large icon");
            return bundle9;
        }
        if (!C1781k.toq(getContext()) || !C1900g.m7462q()) {
            bundle9.putBoolean(f14750m, true);
            C1900g.zy().m7463s(false);
            return bundle9;
        }
        String string = extras.getString("packageName");
        String string2 = extras.getString(LargeIconPickerActivity.ay);
        boolean zM7461n = C1900g.m7461n(string + C5658n.f73185t8r + string2);
        if (!zM7461n) {
            zM7461n = C1900g.m7461n(string);
        }
        Log.i(f14748k, "support largeIcon: packageName = " + string + ",activityName = " + string2 + ",support = " + zM7461n);
        bundle9.putBoolean(f14750m, zM7461n);
        return bundle9;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        return null;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return false;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(@lvui Uri uri, @lvui String mode) {
        if (getContext() != null && uri != null && !p029m.zy.toq(uri.getPath())) {
            if (d2ok.f16397y.equals(uri.getPath()) && m8897k(mode, "r")) {
                return zy(d2ok.m9689p().m9695y(d2ok.EnumC2772k.WALLPAPER_COPIED));
            }
            if (d2ok.f16396s.equals(uri.getPath()) && m8897k(mode, "r")) {
                return zy(d2ok.m9689p().m9695y(d2ok.EnumC2772k.WALLPAPER_CROPPED));
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        return 0;
    }
}
