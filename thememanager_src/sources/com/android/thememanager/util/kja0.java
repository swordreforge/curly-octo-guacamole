package com.android.thememanager.util;

import android.content.Context;
import android.content.DialogInterface;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.settings.superwallpaper.utils.C2663k;
import com.android.thememanager.wallpaper.C2951n;
import miuix.appcompat.app.ki;

/* JADX INFO: compiled from: ApplyWallpaperDialog.java */
/* JADX INFO: loaded from: classes2.dex */
public class kja0 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f61324f7l8 = "video";

    /* JADX INFO: renamed from: g */
    public static final String f16599g = "image";

    /* JADX INFO: renamed from: n */
    public static final int f16600n = 2;

    /* JADX INFO: renamed from: q */
    public static final int f16601q = 1;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f61325toq = "ApplyWallpaperDialog";

    /* JADX INFO: renamed from: y */
    public static final String f16602y = "loop";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f61326zy = 0;

    /* JADX INFO: renamed from: k */
    private miuix.appcompat.app.ki f16603k;

    /* JADX WARN: Removed duplicated region for block: B:36:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean f7l8(java.lang.String r8, java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 226
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.kja0.f7l8(java.lang.String, java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0055  */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean m9846g(java.lang.String r9, java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.util.kja0.m9846g(java.lang.String, java.lang.Object):boolean");
    }

    public static int toq() {
        boolean zD2ok = C2951n.fn3e().d2ok();
        Log.w(f61325toq, "isCurrentSuper: " + zD2ok);
        return !zD2ok ? 1 : 0;
    }

    private String zy(Context context, int flag) {
        if (flag == 0) {
            boolean z2 = C2663k.m9269q(context) == 1;
            return (C2663k.qrj() && C2663k.m9268p(context) && C2951n.fn3e().d2ok() && z2) ? context.getResources().getString(R.string.apply_wallpaper_warning_use_aod_and_super_wallpaper) : context.getResources().getString(R.string.apply_wallpaper_warning_use_super_wallpaper);
        }
        if (flag == 1) {
            return com.android.thememanager.basemodule.utils.o1t.m7171i() ? context.getString(R.string.restore_history_lock_screen_when_apply_theme) : context.getResources().getString(R.string.apply_wallpaper_after_three_theme);
        }
        String string = flag != 2 ? "" : context.getString(R.string.restore_default_lockscreen_when_special_lock_style);
        Log.i(f61325toq, "invalid flag");
        return string;
    }

    /* JADX INFO: renamed from: k */
    public kja0 m9847k() {
        miuix.appcompat.app.ki kiVar = this.f16603k;
        if (kiVar != null && kiVar.isShowing()) {
            this.f16603k.dismiss();
        }
        return this;
    }

    /* JADX INFO: renamed from: n */
    public kja0 m9848n(Context context, int flag, boolean isDoubleButton, DialogInterface.OnClickListener positiveCallback, DialogInterface.OnClickListener negativeCallback) {
        if (context == null) {
            return this;
        }
        ki.C6947k c6947k = new ki.C6947k(context);
        c6947k.lrht(R.string.application_notify_title).m25050z(zy(context, flag)).m25047s(false).dd(isDoubleButton ? R.string.miuix_compat_dialog_ok : R.string.incompatible_dialog_ok, positiveCallback);
        if (isDoubleButton) {
            c6947k.mcp(R.string.miuix_compat_dialog_cancel, negativeCallback).m25037g();
        }
        this.f16603k = c6947k.m25037g();
        return this;
    }

    /* JADX INFO: renamed from: q */
    public kja0 m9849q(Context context, int flag, boolean isDoubleButton, DialogInterface.OnClickListener positiveCallback) {
        m9848n(context, flag, isDoubleButton, positiveCallback, null);
        return this;
    }

    /* JADX INFO: renamed from: y */
    public kja0 m9850y() {
        miuix.appcompat.app.ki kiVar = this.f16603k;
        if (kiVar != null && !kiVar.isShowing()) {
            this.f16603k.show();
        }
        return this;
    }
}
