package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.C0184b;
import ij.C6095k;
import zy.InterfaceC7828g;
import zy.InterfaceC7831j;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: ThemeEnforcement.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public final class cdj {

    /* JADX INFO: renamed from: q */
    private static final String f24543q = "Theme.MaterialComponents";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final String f67640toq = "Theme.AppCompat";

    /* JADX INFO: renamed from: k */
    private static final int[] f24542k = {C6095k.zy.f80219kz28};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int[] f67641zy = {C6095k.zy.f80233m8};

    private cdj() {
    }

    private static boolean f7l8(@lvui Context context, AttributeSet attributeSet, @InterfaceC7831j @lvui int[] iArr, @InterfaceC7828g int i2, @hb int i3, @InterfaceC7831j @lvui int... iArr2) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
        for (int i4 : iArr2) {
            if (typedArrayObtainStyledAttributes.getResourceId(i4, -1) == -1) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    /* JADX INFO: renamed from: g */
    public static boolean m14531g(@lvui Context context) {
        return m14536s(context, f24542k);
    }

    /* JADX INFO: renamed from: k */
    public static void m14532k(@lvui Context context) {
        m14533n(context, f24542k, f67640toq);
    }

    public static C0184b ld6(@lvui Context context, AttributeSet attributeSet, @InterfaceC7831j @lvui int[] iArr, @InterfaceC7828g int i2, @hb int i3, @InterfaceC7831j int... iArr2) {
        toq(context, attributeSet, i2, i3);
        m14535q(context, attributeSet, iArr, i2, i3, iArr2);
        return C0184b.jp0y(context, attributeSet, iArr, i2, i3);
    }

    /* JADX INFO: renamed from: n */
    private static void m14533n(@lvui Context context, @lvui int[] iArr, String str) {
        if (m14536s(context, iArr)) {
            return;
        }
        throw new IllegalArgumentException("The style on this component requires your app theme to be " + str + " (or a descendant).");
    }

    @lvui
    /* JADX INFO: renamed from: p */
    public static TypedArray m14534p(@lvui Context context, AttributeSet attributeSet, @InterfaceC7831j @lvui int[] iArr, @InterfaceC7828g int i2, @hb int i3, @InterfaceC7831j int... iArr2) {
        toq(context, attributeSet, i2, i3);
        m14535q(context, attributeSet, iArr, i2, i3, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i2, i3);
    }

    /* JADX INFO: renamed from: q */
    private static void m14535q(@lvui Context context, AttributeSet attributeSet, @InterfaceC7831j @lvui int[] iArr, @InterfaceC7828g int i2, @hb int i3, @InterfaceC7831j @dd int... iArr2) {
        boolean zF7l8;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6095k.kja0.v7x, i2, i3);
        if (!typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.sy9g, false)) {
            typedArrayObtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 == null || iArr2.length == 0) {
            zF7l8 = typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.nou, -1) != -1;
        } else {
            zF7l8 = f7l8(context, attributeSet, iArr, i2, i3, iArr2);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!zF7l8) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }

    /* JADX INFO: renamed from: s */
    private static boolean m14536s(@lvui Context context, @lvui int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        for (int i2 = 0; i2 < iArr.length; i2++) {
            if (!typedArrayObtainStyledAttributes.hasValue(i2)) {
                typedArrayObtainStyledAttributes.recycle();
                return false;
            }
        }
        typedArrayObtainStyledAttributes.recycle();
        return true;
    }

    private static void toq(@lvui Context context, AttributeSet attributeSet, @InterfaceC7828g int i2, @hb int i3) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6095k.kja0.v7x, i2, i3);
        boolean z2 = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.mqz, false);
        typedArrayObtainStyledAttributes.recycle();
        if (z2) {
            TypedValue typedValue = new TypedValue();
            if (!context.getTheme().resolveAttribute(C6095k.zy.ep5q, typedValue, true) || (typedValue.type == 18 && typedValue.data == 0)) {
                zy(context);
            }
        }
        m14532k(context);
    }

    /* JADX INFO: renamed from: y */
    public static boolean m14537y(@lvui Context context) {
        return m14536s(context, f67641zy);
    }

    public static void zy(@lvui Context context) {
        m14533n(context, f67641zy, f24543q);
    }
}
