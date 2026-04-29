package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import zy.dd;
import zy.hb;
import zy.lvui;

/* JADX INFO: compiled from: ThemeUtils.java */
/* JADX INFO: loaded from: classes2.dex */
final class cdj {
    private cdj() {
    }

    /* JADX INFO: renamed from: k */
    static void m14257k(@lvui Context context, @hb int i2) {
        Resources.Theme qVar;
        context.getTheme().applyStyle(i2, true);
        if (!(context instanceof Activity) || (qVar = toq((Activity) context)) == null) {
            return;
        }
        qVar.applyStyle(i2, true);
    }

    @dd
    private static Resources.Theme toq(@lvui Activity activity) {
        View viewPeekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window == null || (viewPeekDecorView = window.peekDecorView()) == null || (context = viewPeekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }
}
