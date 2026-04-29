package com.android.thememanager.basemodule.utils;

import android.content.Context;
import miui.os.Build;
import miui.theme.GlobalUtils;
import miui.theme.ThemeManagerHelper;

/* JADX INFO: compiled from: AppAbilityController.java */
/* JADX INFO: loaded from: classes.dex */
public class toq {
    /* JADX INFO: renamed from: k */
    private static boolean m7223k(Context context) {
        return "mx_telcel".equals(miuix.os.f7l8.m26160k("ro.miui.customized.region", "")) && ThemeManagerHelper.needDisableTheme(context);
    }

    /* JADX INFO: renamed from: q */
    public static boolean m7224q(String resourceCode) {
        return !C1807g.n5r1();
    }

    private static boolean toq(Context context) {
        return Build.IS_TABLET || (Build.IS_INTERNATIONAL_BUILD && GlobalUtils.isReligiousArea(context)) || m7223k(context);
    }

    public static boolean zy(String resourceCode) {
        return true;
    }
}
