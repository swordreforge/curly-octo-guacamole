package com.android.thememanager.basemodule.utils;

import android.view.View;

/* JADX INFO: renamed from: com.android.thememanager.basemodule.utils.k */
/* JADX INFO: compiled from: AccessibilityUtils.java */
/* JADX INFO: loaded from: classes.dex */
public class C1812k {
    /* JADX INFO: renamed from: k */
    public static void m7106k(View view, int stringId) {
        toq(view, view.getContext().getString(stringId));
    }

    public static void toq(View view, String description) {
        if (view != null) {
            view.setContentDescription(description);
        }
    }

    public static void zy(String description, View... views) {
        if (views != null) {
            for (View view : views) {
                view.setContentDescription(description);
            }
        }
    }
}
