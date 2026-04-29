package com.android.thememanager.activity;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import l05.InterfaceC6768s;
import mub.InterfaceC7395n;
import mub.InterfaceC7396q;

/* JADX INFO: compiled from: ShadowLayout.kt */
/* JADX INFO: loaded from: classes.dex */
public final class pjz9 {
    @InterfaceC6768s
    public static final void f7l8(@InterfaceC7396q Paint paint) {
        kotlin.jvm.internal.d2ok.m23075h(paint, "<this>");
        m6471p(paint, null, null, 3, null);
    }

    /* JADX INFO: renamed from: g */
    public static final void m6468g(@InterfaceC7396q Canvas canvas, boolean z2) {
        kotlin.jvm.internal.d2ok.m23075h(canvas, "<this>");
        if (z2) {
            canvas.drawColor(-16711936);
        }
    }

    /* JADX INFO: renamed from: k */
    public static final boolean m6469k(int i2, int i3) {
        return (i3 | i2) == i2;
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ Paint m6470n(String str, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        return m6472q(str, num);
    }

    /* JADX INFO: renamed from: p */
    public static /* synthetic */ void m6471p(Paint paint, String str, Integer num, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = null;
        }
        if ((i2 & 2) != 0) {
            num = null;
        }
        m6473s(paint, str, num);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    /* JADX INFO: renamed from: q */
    public static final Paint m6472q(@InterfaceC7395n String str, @zy.x2 @InterfaceC7395n Integer num) {
        Paint paint = new Paint();
        m6473s(paint, str, num);
        return paint;
    }

    @InterfaceC6768s
    /* JADX INFO: renamed from: s */
    public static final void m6473s(@InterfaceC7396q Paint paint, @InterfaceC7395n String str, @zy.x2 @InterfaceC7395n Integer num) {
        int color;
        kotlin.jvm.internal.d2ok.m23075h(paint, "<this>");
        paint.reset();
        if (num != null) {
            color = num.intValue();
        } else {
            if (str == null) {
                str = "#FF00FF";
            }
            color = Color.parseColor(str);
        }
        paint.setColor(color);
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(0.0f);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final Paint toq() {
        return m6470n(null, null, 3, null);
    }

    @InterfaceC6768s
    /* JADX INFO: renamed from: y */
    public static final void m6474y(@InterfaceC7396q Paint paint, @InterfaceC7395n String str) {
        kotlin.jvm.internal.d2ok.m23075h(paint, "<this>");
        m6471p(paint, str, null, 2, null);
    }

    @InterfaceC6768s
    @InterfaceC7396q
    public static final Paint zy(@InterfaceC7395n String str) {
        return m6470n(str, null, 2, null);
    }
}
