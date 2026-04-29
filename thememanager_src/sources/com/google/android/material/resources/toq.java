package com.google.android.material.resources;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.InterfaceC7829h;
import zy.InterfaceC7833l;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: MaterialAttributes.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class toq {
    public static int f7l8(@lvui Context context, @InterfaceC7828g int i2, @lvui String str) {
        TypedValue typedValueM14747k = m14747k(context, i2);
        if (typedValueM14747k != null) {
            return typedValueM14747k.data;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    @InterfaceC7833l
    /* JADX INFO: renamed from: g */
    public static int m14746g(@lvui Context context) {
        return m14749q(context, C6095k.zy.vz, C6095k.g.fl);
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static TypedValue m14747k(@lvui Context context, @InterfaceC7828g int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static int m14748n(@lvui Context context, @InterfaceC7828g int i2, int i3) {
        TypedValue typedValueM14747k = m14747k(context, i2);
        return (typedValueM14747k == null || typedValueM14747k.type != 16) ? i3 : typedValueM14747k.data;
    }

    @InterfaceC7833l
    /* JADX INFO: renamed from: q */
    public static int m14749q(@lvui Context context, @InterfaceC7828g int i2, @InterfaceC7829h int i3) {
        TypedValue typedValueM14747k = m14747k(context, i2);
        return (int) ((typedValueM14747k == null || typedValueM14747k.type != 5) ? context.getResources().getDimension(i3) : typedValueM14747k.getDimension(context.getResources().getDisplayMetrics()));
    }

    public static boolean toq(@lvui Context context, @InterfaceC7828g int i2, boolean z2) {
        TypedValue typedValueM14747k = m14747k(context, i2);
        return (typedValueM14747k == null || typedValueM14747k.type != 18) ? z2 : typedValueM14747k.data != 0;
    }

    /* JADX INFO: renamed from: y */
    public static int m14750y(@lvui View view, @InterfaceC7828g int i2) {
        return f7l8(view.getContext(), i2, view.getClass().getCanonicalName());
    }

    public static boolean zy(@lvui Context context, @InterfaceC7828g int i2, @lvui String str) {
        return f7l8(context, i2, str) != 0;
    }
}
