package com.bumptech.glide.load.resource.drawable;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import androidx.appcompat.view.C0136q;
import androidx.core.content.C0498q;
import androidx.core.content.res.C0506s;
import p023g.C6045k;
import zy.dd;
import zy.fn3e;

/* JADX INFO: compiled from: DrawableDecoderCompat.java */
/* JADX INFO: loaded from: classes2.dex */
public final class zy {

    /* JADX INFO: renamed from: k */
    private static volatile boolean f18781k = true;

    private zy() {
    }

    /* JADX INFO: renamed from: k */
    public static Drawable m11033k(Context context, @fn3e int i2, @dd Resources.Theme theme) {
        return zy(context, context, i2, theme);
    }

    /* JADX INFO: renamed from: n */
    private static Drawable m11034n(Context context, @fn3e int i2, @dd Resources.Theme theme) {
        if (theme != null) {
            C0136q c0136q = new C0136q(context, theme);
            c0136q.m397k(theme.getResources().getConfiguration());
            context = c0136q;
        }
        return C6045k.toq(context, i2);
    }

    /* JADX INFO: renamed from: q */
    private static Drawable m11035q(Context context, @fn3e int i2, @dd Resources.Theme theme) {
        return C0506s.f7l8(context.getResources(), i2, theme);
    }

    public static Drawable toq(Context context, Context context2, @fn3e int i2) {
        return zy(context, context2, i2, null);
    }

    private static Drawable zy(Context context, Context context2, @fn3e int i2, @dd Resources.Theme theme) {
        try {
            if (f18781k) {
                return m11034n(context2, i2, theme);
            }
        } catch (Resources.NotFoundException unused) {
        } catch (IllegalStateException e2) {
            if (context.getPackageName().equals(context2.getPackageName())) {
                throw e2;
            }
            return C0498q.m2259s(context2, i2);
        } catch (NoClassDefFoundError unused2) {
            f18781k = false;
        }
        if (theme == null) {
            theme = context2.getTheme();
        }
        return m11035q(context2, i2, theme);
    }
}
