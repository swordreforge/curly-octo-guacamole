package com.android.thememanager.basemodule.privacy;

import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.util.Log;
import com.android.thememanager.R;
import com.android.thememanager.basemodule.analysis.C1706p;
import com.android.thememanager.basemodule.analysis.C1708s;
import com.android.thememanager.basemodule.utils.C1807g;
import com.android.thememanager.basemodule.utils.C1824r;
import com.android.thememanager.basemodule.utils.kja0;
import com.android.thememanager.util.C2755a;
import miuix.appcompat.app.ki;
import p000a.InterfaceC0000k;

/* JADX INFO: compiled from: UserModeManager.java */
/* JADX INFO: loaded from: classes.dex */
public class x2 {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    public static final String f57639f7l8 = "key_user_mode_base_func";

    /* JADX INFO: renamed from: g */
    public static final String f10154g = "key_user_mode_look_only";

    /* JADX INFO: renamed from: k */
    public static final int f10155k = 3;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static Boolean f57640kja0 = null;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final String f57641ld6 = "privacy_version_update";

    /* JADX INFO: renamed from: n */
    public static final String f10156n = "key_user_mode_full_func";

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static int f57642n7h = -1;

    /* JADX INFO: renamed from: p */
    public static final String f10157p = "request_flag";

    /* JADX INFO: renamed from: q */
    public static final String f10158q = "key_user_selected_mode";

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    public static final String f57643qrj = "action.open_local_mode";

    /* JADX INFO: renamed from: s */
    public static final String f10159s = "key_intent_hide_base_mode";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final int f57644toq = 2;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    public static final String f57645x2 = "disagree_cta";

    /* JADX INFO: renamed from: y */
    public static final String f10160y = "key_local_mode";

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    public static final int f57646zy = 1;

    public static boolean f7l8() {
        if (m6914n() < 3) {
            return false;
        }
        if (f57640kja0 == null) {
            f57640kja0 = Boolean.valueOf(C1824r.m7203y().zy(f10160y, false));
        }
        return f57640kja0.booleanValue();
    }

    /* JADX INFO: renamed from: g */
    public static Intent m6912g(boolean hideBaseMode, String sourceType) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName("com.android.thememanager", "com.android.thememanager.activity.SelectModeActivity"));
        intent.putExtra(f10159s, hideBaseMode);
        intent.putExtra("request_flag", sourceType);
        return intent;
    }

    public static void ld6(boolean isLocalMode) {
        f57640kja0 = Boolean.valueOf(isLocalMode);
    }

    /* JADX INFO: renamed from: n */
    public static int m6914n() {
        int i2 = f57642n7h;
        if (i2 > -1) {
            return i2;
        }
        if (!x2()) {
            f57642n7h = 3;
            return 3;
        }
        f57642n7h = C1824r.m7203y().m7207q(f10158q, -1);
        Log.d(C2755a.f16307g, "user select mode is: " + f57642n7h);
        return f57642n7h;
    }

    /* JADX INFO: renamed from: p */
    public static void m6915p(int mode) {
        f57642n7h = mode;
        C1824r.m7203y().ld6(f10158q, mode).m7204k();
    }

    /* JADX INFO: renamed from: q */
    public static void m6916q(Context context, final p000a.toq callback) {
        new ki.C6947k(context).uv6(kja0.ld6(R.string.local_mode_close)).fu4(R.string.local_mode_close_desc).m25047s(false).dd(android.R.string.ok, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.privacy.p
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                x2.m6918y(callback, dialogInterface, i2);
            }
        }).mcp(android.R.string.cancel, new DialogInterface.OnClickListener() { // from class: com.android.thememanager.basemodule.privacy.ld6
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i2) {
                x2.m6917s(callback, dialogInterface, i2);
            }
        }).m25037g().show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public static /* synthetic */ void m6917s(p000a.toq toqVar, DialogInterface dialogInterface, int i2) {
        if (toqVar instanceof InterfaceC0000k) {
            ((InterfaceC0000k) toqVar).onCancel();
        }
    }

    public static boolean x2() {
        return !C1807g.m7081r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y */
    public static /* synthetic */ void m6918y(p000a.toq toqVar, DialogInterface dialogInterface, int i2) {
        Boolean bool = Boolean.FALSE;
        f57640kja0 = bool;
        C1824r.m7203y().m7206p(f10160y, false).m7204k();
        if (toqVar != null) {
            toqVar.onSuccess();
        }
        C1708s.f7l8().ld6().ni7(C1706p.f7l8(com.android.thememanager.basemodule.analysis.toq.eg6, null, String.valueOf(bool), com.android.thememanager.basemodule.analysis.toq.n4kc));
    }

    public static boolean zy() {
        return m6914n() > 2;
    }
}
