package com.google.android.material.internal;

import android.R;
import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.graphics.C0541p;
import androidx.core.view.ikck;
import androidx.core.view.sok;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: renamed from: com.google.android.material.internal.n */
/* JADX INFO: compiled from: EdgeToEdgeUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class C4049n {

    /* JADX INFO: renamed from: k */
    private static final int f24553k = 128;

    private C4049n() {
    }

    /* JADX INFO: renamed from: k */
    public static void m14559k(@lvui Window window, boolean z2) {
        toq(window, z2, null, null);
    }

    /* JADX INFO: renamed from: n */
    private static boolean m14560n(int i2, boolean z2) {
        return com.google.android.material.color.kja0.ld6(i2) || (i2 == 0 && z2);
    }

    @TargetApi(21)
    /* JADX INFO: renamed from: q */
    private static int m14561q(Context context, boolean z2) {
        if (z2) {
            return 0;
        }
        return com.google.android.material.color.kja0.toq(context, R.attr.statusBarColor, -16777216);
    }

    public static void toq(@lvui Window window, boolean z2, @zy.x2 @dd Integer num, @zy.x2 @dd Integer num2) {
        boolean z3 = num == null || num.intValue() == 0;
        boolean z5 = num2 == null || num2.intValue() == 0;
        if (z3 || z5) {
            int qVar = com.google.android.material.color.kja0.toq(window.getContext(), R.attr.colorBackground, -16777216);
            if (z3) {
                num = Integer.valueOf(qVar);
            }
            if (z5) {
                num2 = Integer.valueOf(qVar);
            }
        }
        ikck.zy(window, !z2);
        int iM14561q = m14561q(window.getContext(), z2);
        int iZy = zy(window.getContext(), z2);
        window.setStatusBarColor(iM14561q);
        window.setNavigationBarColor(iZy);
        boolean zM14560n = m14560n(iM14561q, com.google.android.material.color.kja0.ld6(num.intValue()));
        boolean zM14560n2 = m14560n(iZy, com.google.android.material.color.kja0.ld6(num2.intValue()));
        sok sokVarM3315k = ikck.m3315k(window, window.getDecorView());
        if (sokVarM3315k != null) {
            sokVarM3315k.m3441s(zM14560n);
            sokVarM3315k.m3442y(zM14560n2);
        }
    }

    @TargetApi(21)
    private static int zy(Context context, boolean z2) {
        if (z2 && Build.VERSION.SDK_INT < 27) {
            return C0541p.m2542t(com.google.android.material.color.kja0.toq(context, R.attr.navigationBarColor, -16777216), 128);
        }
        if (z2) {
            return 0;
        }
        return com.google.android.material.color.kja0.toq(context, R.attr.navigationBarColor, -16777216);
    }
}
