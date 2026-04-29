package com.google.android.material.resources;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import androidx.appcompat.widget.C0184b;
import ij.C6095k;
import p023g.C6045k;
import zy.InterfaceC7831j;
import zy.dd;
import zy.hb;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: MaterialResources.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class zy {

    /* JADX INFO: renamed from: k */
    private static final float f24879k = 1.3f;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final float f67790toq = 2.0f;

    private zy() {
    }

    @dd
    public static C4092q f7l8(@lvui Context context, @lvui TypedArray typedArray, @InterfaceC7831j int i2) {
        int resourceId;
        if (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0) {
            return null;
        }
        return new C4092q(context, resourceId);
    }

    @InterfaceC7831j
    /* JADX INFO: renamed from: g */
    static int m14752g(@lvui TypedArray typedArray, @InterfaceC7831j int i2, @InterfaceC7831j int i3) {
        return typedArray.hasValue(i2) ? i2 : i3;
    }

    @dd
    /* JADX INFO: renamed from: k */
    public static ColorStateList m14753k(@lvui Context context, @lvui TypedArray typedArray, @InterfaceC7831j int i2) {
        int resourceId;
        ColorStateList colorStateListM22274k;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (colorStateListM22274k = C6045k.m22274k(context, resourceId)) == null) ? typedArray.getColorStateList(i2) : colorStateListM22274k;
    }

    @dd
    /* JADX INFO: renamed from: n */
    public static Drawable m14754n(@lvui Context context, @lvui TypedArray typedArray, @InterfaceC7831j int i2) {
        int resourceId;
        Drawable qVar;
        return (!typedArray.hasValue(i2) || (resourceId = typedArray.getResourceId(i2, 0)) == 0 || (qVar = C6045k.toq(context, resourceId)) == null) ? typedArray.getDrawable(i2) : qVar;
    }

    /* JADX INFO: renamed from: p */
    public static boolean m14755p(@lvui Context context) {
        return context.getResources().getConfiguration().fontScale >= 2.0f;
    }

    /* JADX INFO: renamed from: q */
    public static int m14756q(@lvui Context context, @lvui TypedArray typedArray, @InterfaceC7831j int i2, int i3) {
        TypedValue typedValue = new TypedValue();
        if (!typedArray.getValue(i2, typedValue) || typedValue.type != 2) {
            return typedArray.getDimensionPixelSize(i2, i3);
        }
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, i3);
        typedArrayObtainStyledAttributes.recycle();
        return dimensionPixelSize;
    }

    /* JADX INFO: renamed from: s */
    public static boolean m14757s(@lvui Context context) {
        return context.getResources().getConfiguration().fontScale >= f24879k;
    }

    @dd
    public static ColorStateList toq(@lvui Context context, @lvui C0184b c0184b, @InterfaceC7831j int i2) {
        int iFn3e;
        ColorStateList colorStateListM22274k;
        return (!c0184b.mcp(i2) || (iFn3e = c0184b.fn3e(i2, 0)) == 0 || (colorStateListM22274k = C6045k.m22274k(context, iFn3e)) == null) ? c0184b.m550q(i2) : colorStateListM22274k;
    }

    /* JADX INFO: renamed from: y */
    public static int m14758y(@lvui Context context, @hb int i2, int i3) {
        if (i2 == 0) {
            return i3;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, C6095k.kja0.uw73);
        TypedValue typedValue = new TypedValue();
        boolean value = typedArrayObtainStyledAttributes.getValue(C6095k.kja0.l1l1, typedValue);
        typedArrayObtainStyledAttributes.recycle();
        return !value ? i3 : zy(typedValue) == 2 ? Math.round(TypedValue.complexToFloat(typedValue.data) * context.getResources().getDisplayMetrics().density) : TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics());
    }

    private static int zy(TypedValue typedValue) {
        return typedValue.getComplexUnit();
    }
}
