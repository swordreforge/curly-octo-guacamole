package com.android.thememanager.util;

import android.content.ContentResolver;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;
import android.util.Log;
import com.android.thememanager.C2082k;

/* JADX INFO: compiled from: HomeSearchBarHelper.java */
/* JADX INFO: loaded from: classes2.dex */
public class ncyb {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final String f61367f7l8 = "key_home_screen_search_bar_source";

    /* JADX INFO: renamed from: g */
    private static final String f16655g = "key_home_screen_search_bar";

    /* JADX INFO: renamed from: k */
    public static final String f16656k = "home_search_theme";

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final String f61368ld6 = "0";

    /* JADX INFO: renamed from: n */
    private static boolean f16657n = false;

    /* JADX INFO: renamed from: p */
    private static final String f16658p = "1";

    /* JADX INFO: renamed from: q */
    private static boolean f16659q = false;

    /* JADX INFO: renamed from: s */
    private static final String f16660s = "android.provider.Settings.System.putString";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    public static final String f61369toq = "home_search_theme_provision";

    /* JADX INFO: renamed from: y */
    private static final Uri f16661y = Uri.parse("content://com.miui.home.launcher.settings/settings");

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final String f61370zy = "HomeSearchBarHelper";

    public static void f7l8(ContentResolver resolver, boolean show) {
        m9896y(resolver, show, f16656k);
    }

    /* JADX INFO: renamed from: g */
    private static void m9892g(ContentResolver resolver, Bundle extras) {
        resolver.call(f16661y, f16660s, (String) null, extras);
    }

    /* JADX INFO: renamed from: k */
    public static void m9893k() {
        if (m9895q() && Settings.System.getInt(C2082k.m7998k().getContentResolver(), f16655g, -1) == -1) {
            zy(f61369toq);
        }
    }

    /* JADX INFO: renamed from: n */
    public static boolean m9894n() {
        return m9895q() && Settings.System.getInt(C2082k.m7998k().getContentResolver(), f16655g, 0) == 1;
    }

    /* JADX INFO: renamed from: q */
    public static boolean m9895q() {
        if (!f16659q) {
            boolean z2 = false;
            try {
                Resources resourcesForApplication = C2082k.m7998k().getPackageManager().getResourcesForApplication("com.android.quicksearchbox");
                int identifier = resourcesForApplication.getIdentifier("support_home_screen_search_bar", "bool", "com.android.quicksearchbox");
                if (identifier > 0) {
                    z2 = resourcesForApplication.getBoolean(identifier);
                }
            } catch (PackageManager.NameNotFoundException unused) {
                Log.w(f61370zy, "home screen search bar is not supported");
            }
            f16657n = z2;
            f16659q = true;
        }
        return f16657n;
    }

    public static void toq() {
        if (m9895q() && m9894n()) {
            try {
                Settings.System.putString(C2082k.m7998k().getContentResolver(), f61367f7l8, f16656k);
                Settings.System.putInt(C2082k.m7998k().getContentResolver(), f16655g, 0);
            } catch (Exception unused) {
                f7l8(C2082k.m7998k().getContentResolver(), false);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public static void m9896y(ContentResolver resolver, boolean show, String prefSource) {
        Bundle bundle = new Bundle();
        bundle.putString(f16655g, show ? "1" : "0");
        bundle.putString(f61367f7l8, prefSource);
        m9892g(resolver, bundle);
    }

    public static void zy(String prefSource) {
        if (m9895q() && !m9894n()) {
            try {
                Settings.System.putString(C2082k.m7998k().getContentResolver(), f61367f7l8, prefSource);
                Settings.System.putInt(C2082k.m7998k().getContentResolver(), f16655g, 1);
            } catch (Exception unused) {
                m9896y(C2082k.m7998k().getContentResolver(), true, prefSource);
            }
        }
    }
}
