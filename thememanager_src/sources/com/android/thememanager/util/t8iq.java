package com.android.thememanager.util;

import android.app.WallpaperManager;
import android.content.Context;
import android.provider.Settings;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.ThemeApplication;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1821p;
import com.android.thememanager.detail.theme.model.ApplyThemeInfo;
import com.android.thememanager.wallpaper.C2951n;
import ek5k.C6002g;
import java.io.File;
import m4.C6795k;
import miui.content.res.IconCustomizer;
import miui.content.res.ThemeResources;
import miui.drm.DrmManager;
import p001b.InterfaceC1356n;
import qkj8.C7617k;
import yz.C7794k;

/* JADX INFO: compiled from: RestoreDefault.java */
/* JADX INFO: loaded from: classes2.dex */
public class t8iq implements com.android.thememanager.basemodule.analysis.ld6, InterfaceC1789q {

    /* JADX INFO: renamed from: k */
    private static final String f16802k = t8iq.class.getName();

    /* JADX INFO: renamed from: com.android.thememanager.util.t8iq$k */
    /* JADX INFO: compiled from: RestoreDefault.java */
    class RunnableC2808k implements Runnable {
        RunnableC2808k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            t8iq.m10001y("/data/system/theme/", com.android.thememanager.basemodule.utils.bf2.f57718qrj);
        }
    }

    /* JADX INFO: compiled from: RestoreDefault.java */
    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ Context f16803k;

        toq(final Context val$context) {
            this.f16803k = val$context;
        }

        @Override // java.lang.Runnable
        public void run() {
            WallpaperManager wallpaperManager = (WallpaperManager) this.f16803k.getSystemService("wallpaper");
            if (wallpaperManager != null) {
                String strZy = C7617k.toq().zy();
                if ("com.android.thememanager.theme_lock_live_wallpaper".equals(strZy) || "com.android.thememanager.theme_lock_video_wallpaper".equals(strZy)) {
                    C7617k.toq().m27925k("com.miui.home.none_provider");
                }
                if (C2951n.fn3e().kja0()) {
                    C2951n.fn3e().n7h();
                } else {
                    C7617k.toq().m27925k("com.miui.home.none_provider");
                    uc.ni7(wallpaperManager);
                }
                h7am.m9796k(true);
                h7am.m9796k(false);
                if (C1807g.zurt()) {
                    d8wk.x2(p001b.f7l8.f53786i3x9);
                    com.android.thememanager.ncyb.toq();
                } else if (com.android.thememanager.basemodule.utils.y9n.lvui()) {
                    com.android.thememanager.ncyb.toq();
                }
                uc.m10020c();
                Log.i(t8iq.f16802k, "restoreDefault cls ws end !");
            }
        }
    }

    public static void f7l8(boolean isFoldOtaCase) {
        Log.d(f16802k, "restoreDefault: begin " + isFoldOtaCase);
        ThemeApplication qVar = C2082k.zy().toq();
        if (isFoldOtaCase) {
            C6002g.ld6().execute(new RunnableC2808k());
        } else {
            d8wk.x2("/data/system/theme/");
        }
        d8wk.x2(mcp.x2());
        d8wk.x2(InterfaceC1789q.uux);
        m10000q(null);
        if (!isFoldOtaCase) {
            C6002g.m22240g(new toq(qVar));
        }
        IconCustomizer.clearCustomizedIcons((String) null);
        ThemeResources.getSystem().resetIcons();
        m9997g();
        try {
            DrmManager.setSupportAd(qVar, false);
        } catch (IllegalArgumentException e2) {
            Log.e(f16802k, "setSupportAd error : ", e2);
        }
        com.android.thememanager.basemodule.utils.o1t.jp0y();
        C6795k.toq(qVar, 805337241L);
    }

    /* JADX INFO: renamed from: g */
    private static void m9997g() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        ThemeApplication qVar = C2082k.zy().toq();
        Settings.System.putLong(qVar.getContentResolver(), "clock_changed_time_" + InterfaceC1356n.f53839zy, jCurrentTimeMillis);
        Settings.System.putLong(qVar.getContentResolver(), "clock_changed_time_" + InterfaceC1356n.f7201q, jCurrentTimeMillis);
        Settings.System.putLong(qVar.getContentResolver(), "clock_changed_time_2x4", jCurrentTimeMillis);
        Settings.System.putLong(qVar.getContentResolver(), "clock_changed_time_4x4", jCurrentTimeMillis);
        Settings.System.putLong(qVar.getContentResolver(), "clock_changed_time_3x4", jCurrentTimeMillis);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m9999n(String[] strArr) {
        C2812v.toq("0", "Default", "Default");
        g1.y2("0", "Default", System.currentTimeMillis(), ApplyThemeInfo.THEME_USING_TYPE_FORCE_RESTORE, InterfaceC1789q.q68);
        com.android.thememanager.basemodule.utils.vyq.m7232s(strArr);
        com.android.thememanager.basemodule.utils.vyq.m7230p();
        nn86.toq();
    }

    /* JADX INFO: renamed from: q */
    public static void m10000q(final String[] paths) {
        C6002g.m22240g(new Runnable() { // from class: com.android.thememanager.util.lv5
            @Override // java.lang.Runnable
            public final void run() {
                t8iq.m9999n(paths);
            }
        });
        r8s8 r8s8VarM8003s = C2082k.zy().m8003s();
        r8s8VarM8003s.toq();
        r8s8VarM8003s.m9977k(bf2.toq.toq());
        r8s8VarM8003s.ld6();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static boolean m10001y(String path, String retainFileName) {
        if (path == null || path.length() < 1) {
            return false;
        }
        File file = new File(path);
        if (file.isDirectory()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null || fileArrListFiles.length < 1) {
                return file.delete();
            }
            for (File file2 : fileArrListFiles) {
                if (!file2.getName().equals(retainFileName)) {
                    C1821p.ki(file2.getPath());
                }
            }
            if (com.android.thememanager.basemodule.utils.y9n.m7250l()) {
                C7794k.f7l8("delete folder should on WorkThread");
            }
        }
        return file.delete();
    }
}
