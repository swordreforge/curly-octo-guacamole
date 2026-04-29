package com.android.thememanager.util;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import com.android.thememanager.C2082k;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.resource.constants.InterfaceC1789q;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.model.WallpaperApplyInfos;
import com.android.thememanager.settings.C2687z;
import com.android.thememanager.wallpaper.C2951n;
import ek5k.C6002g;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashSet;
import m4.C6795k;
import miui.content.res.ThemeResources;
import miui.util.FeatureParser;
import miuix.appcompat.app.ki;

/* JADX INFO: compiled from: ExtremeModeManager.java */
/* JADX INFO: loaded from: classes2.dex */
public class oc extends fn3e {
    private static final String dy = "content://com.miui.powerkeeper.configure";
    private static final Object hp;
    private static final String k6e = "theme_is_extreme_mode";
    private static final boolean mjvl;
    private static final String s8y;
    private static final String sk1t = "content://com.miui.powercenter.powersaver";
    private static final String tgs = "EXTREME_POWER_MODE_ENABLE";
    public static final String tlhn = "pref_system_in_super_power";
    private static final String vb6 = "pref_extreme_mode";
    private static final String w97r = "ExtremeModeManager";
    private static final String xk5;
    private static final String yl25 = "EXTREME_POWER_SAVE_MODE_OPEN";
    private static final String zmmu = "power_supersave_mode_open";

    /* JADX INFO: renamed from: com.android.thememanager.util.oc$k */
    /* JADX INFO: compiled from: ExtremeModeManager.java */
    class RunnableC2801k implements Runnable {
        RunnableC2801k() {
        }

        @Override // java.lang.Runnable
        public void run() throws Throwable {
            boolean zHb = oc.this.hb();
            boolean zM9946j = oc.this.m9946j();
            if (zHb && !zM9946j) {
                oc.this.f16445t.putBoolean(oc.k6e, true);
                oc.this.f16445t.apply();
                if (C2082k.zy().m8003s().m9976g() != null) {
                    t8iq.f7l8(false);
                }
                oc.this.m9947l();
                return;
            }
            if (zHb || !zM9946j) {
                return;
            }
            try {
                oc.this.n5r1();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            oc.this.f16445t.putBoolean(oc.k6e, false);
            oc.this.f16445t.apply();
        }
    }

    /* JADX INFO: compiled from: ExtremeModeManager.java */
    private static class toq {

        /* JADX INFO: renamed from: k */
        private static final oc f16690k = new oc(null);

        private toq() {
        }
    }

    static {
        String str = ThemeResources.THEME_MAGIC_PATH + "backup_extreme_mode/";
        xk5 = str;
        s8y = str + "black_wallpaper";
        mjvl = FeatureParser.getBoolean("support_extreme_battery_saver", false);
        hp = new Object();
    }

    /* synthetic */ oc(RunnableC2801k runnableC2801k) {
        this();
    }

    /* JADX INFO: renamed from: c */
    public static oc m9943c() {
        return toq.f16690k;
    }

    private boolean dd() {
        boolean zM10024h;
        synchronized (hp) {
            WallpaperApplyInfos wallpaperApplyInfos = new WallpaperApplyInfos();
            wallpaperApplyInfos.updateFoldApplyStatus(true, WallpaperApplyInfos.ApplyCode.BOTH_SCREEN, WallpaperApplyInfos.ApplyCode.HOME);
            zM10024h = uc.m10024h(this.f16443r, s8y, null, null, true, false, false, false, null, null, wallpaperApplyInfos);
        }
        return zM10024h;
    }

    /* JADX INFO: renamed from: e */
    private void m9944e() {
        if (C2951n.fn3e().kja0()) {
            return;
        }
        C6002g.m22240g(new RunnableC2801k());
    }

    /* JADX INFO: renamed from: f */
    public static SharedPreferences.Editor m9945f() {
        return m9943c().f16445t;
    }

    public static void hyr() {
        if (mjvl) {
            m9943c().m9944e();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: j */
    public boolean m9946j() {
        return this.f16447z.getBoolean(k6e, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m9947l() throws Throwable {
        FileOutputStream fileOutputStream;
        Log.i(w97r, "enter Extreme Mode.");
        zy();
        boolean zM9727q = m9727q();
        m9729y();
        InputStream inputStreamOpenRawResource = this.f16443r.getResources().openRawResource(R.raw.black_wallpaper);
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(s8y);
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e2) {
            e = e2;
        }
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int i2 = inputStreamOpenRawResource.read(bArr);
                if (i2 == -1) {
                    break;
                } else {
                    fileOutputStream.write(bArr, 0, i2);
                }
            }
            if (C1807g.zurt()) {
                x9kr();
                if (zM9727q) {
                    dd();
                }
            } else {
                Log.i(w97r, " apply black wallpaper ! withHomeWallpaper = " + zM9727q);
                Context context = this.f16443r;
                String str = s8y;
                uc.ld6(context, str, null);
                if (zM9727q) {
                    uc.f7l8(this.f16443r, str, null);
                }
            }
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileOutputStream);
        } catch (IOException e3) {
            e = e3;
            fileOutputStream2 = fileOutputStream;
            Log.d(w97r, "write black home wallpaper failure : " + e);
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileOutputStream2);
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            com.android.thememanager.basemodule.utils.y9n.m7246g(fileOutputStream2);
            com.android.thememanager.basemodule.utils.y9n.m7246g(inputStreamOpenRawResource);
            throw th;
        }
        com.android.thememanager.basemodule.utils.y9n.m7246g(inputStreamOpenRawResource);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void n5r1() {
        Log.i(w97r, "exit Extreme Mode. ");
        fti();
        fu4();
        wvg();
        if (new File(InterfaceC1789q.re).exists()) {
            HashSet hashSet = new HashSet();
            hashSet.add(InterfaceC1789q.gx2z);
            C6795k.toq(this.f16443r, g1.o1t(hashSet));
        }
        ArrayList arrayList = new ArrayList(1);
        String str = s8y;
        arrayList.add(str);
        C2687z.m9378h(arrayList, 0);
        if (new File(str).exists()) {
            d8wk.x2(str);
        }
    }

    public static boolean ncyb(Activity activity) {
        if (mjvl) {
            return m9943c().vyq(activity);
        }
        return false;
    }

    public static void nn86() {
        m9943c().m9944e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void uv6(Activity activity, DialogInterface dialogInterface, int i2) {
        Bundle bundle = new Bundle();
        bundle.putBoolean(yl25, false);
        bundle.putString("SOURCE", "theme");
        try {
            activity.getContentResolver().call(Uri.parse(sk1t), "changeExtremePowerMode", (String) null, bundle);
        } catch (IllegalArgumentException e2) {
            Log.d(w97r, "exit extreme mode failure : " + e2);
        }
        try {
            activity.getContentResolver().call(Uri.parse(dy), "changeExtremePowerMode", (String) null, bundle);
        } catch (IllegalArgumentException e3) {
            Log.d(w97r, "exit extreme mode failure : " + e3);
        }
    }

    private boolean vyq(final Activity activity) {
        if (gc3c.cdj(activity)) {
            if (hb()) {
                new ki.C6947k(activity).uv6(activity.getString(R.string.exit_extreme_mode_dialog_title)).m25050z(activity.getString(R.string.extreme_mode_dialog_message)).m25047s(true).x9kr(activity.getString(R.string.exit_extreme_mode_dialog_agree), new DialogInterface.OnClickListener() { // from class: com.android.thememanager.util.d3
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        oc.uv6(activity, dialogInterface, i2);
                    }
                }).jk(activity.getString(R.string.exit_extreme_mode_dialog_cancel), null).hb();
                return true;
            }
            if (m9946j()) {
                new ki.C6947k(activity).uv6(activity.getString(R.string.extreme_mode_dialog_title)).m25050z(activity.getString(R.string.extreme_mode_dialog_message)).m25047s(true).jk(activity.getString(R.string.extreme_mode_dialog_ok), null).hb();
                return true;
            }
        }
        return false;
    }

    private boolean x9kr() {
        boolean zM10024h;
        synchronized (hp) {
            WallpaperApplyInfos wallpaperApplyInfos = new WallpaperApplyInfos();
            wallpaperApplyInfos.updateFoldApplyStatus(true, WallpaperApplyInfos.ApplyCode.BOTH_SCREEN, WallpaperApplyInfos.ApplyCode.LOCK);
            zM10024h = uc.m10024h(this.f16443r, s8y, null, null, true, true, false, false, null, null, wallpaperApplyInfos);
        }
        return zM10024h;
    }

    public boolean hb() {
        return this.f16447z.getBoolean(tlhn, false) || Settings.Secure.getInt(this.f16443r.getContentResolver(), tgs, 0) == 1;
    }

    public boolean lrht() {
        return com.android.thememanager.basemodule.utils.y9n.toq(33) ? Settings.System.getInt(this.f16443r.getContentResolver(), zmmu, 0) == 1 : this.f16447z.getBoolean(tlhn, false);
    }

    private oc() {
        super(xk5, vb6, null);
    }
}
