package androidx.appcompat.widget;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import androidx.core.graphics.C0541p;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: renamed from: androidx.appcompat.widget.o */
/* JADX INFO: compiled from: ThemeUtils.java */
/* JADX INFO: loaded from: classes.dex */
@zy.uv6({uv6.EnumC7844k.LIBRARY})
public class C0214o {

    /* JADX INFO: renamed from: k */
    private static final String f1157k = "ThemeUtils";

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final ThreadLocal<TypedValue> f46936toq = new ThreadLocal<>();

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    static final int[] f46937zy = {-16842910};

    /* JADX INFO: renamed from: q */
    static final int[] f1160q = {R.attr.state_focused};

    /* JADX INFO: renamed from: n */
    static final int[] f1158n = {R.attr.state_activated};

    /* JADX INFO: renamed from: g */
    static final int[] f1156g = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    static final int[] f46934f7l8 = {R.attr.state_checked};

    /* JADX INFO: renamed from: y */
    static final int[] f1162y = {R.attr.state_selected};

    /* JADX INFO: renamed from: s */
    static final int[] f1161s = {-16842919, -16842908};

    /* JADX INFO: renamed from: p */
    static final int[] f1159p = new int[0];

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int[] f46935ld6 = new int[1];

    private C0214o() {
    }

    private static TypedValue f7l8() {
        ThreadLocal<TypedValue> threadLocal = f46936toq;
        TypedValue typedValue = threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    @zy.dd
    /* JADX INFO: renamed from: g */
    public static ColorStateList m691g(@zy.lvui Context context, int i2) {
        int[] iArr = f46935ld6;
        iArr[0] = i2;
        C0184b c0184bFti = C0184b.fti(context, null, iArr);
        try {
            return c0184bFti.m550q(0);
        } finally {
            c0184bFti.d3();
        }
    }

    /* JADX INFO: renamed from: k */
    public static void m692k(@zy.lvui View view, @zy.lvui Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(C7397k.qrj.f92638e5);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(C7397k.qrj.oaex)) {
                Log.e(f1157k, "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: n */
    static int m693n(@zy.lvui Context context, int i2, float f2) {
        return C0541p.m2542t(m694q(context, i2), Math.round(Color.alpha(r0) * f2));
    }

    /* JADX INFO: renamed from: q */
    public static int m694q(@zy.lvui Context context, int i2) {
        int[] iArr = f46935ld6;
        iArr[0] = i2;
        C0184b c0184bFti = C0184b.fti(context, null, iArr);
        try {
            return c0184bFti.zy(0, 0);
        } finally {
            c0184bFti.d3();
        }
    }

    @zy.lvui
    public static ColorStateList toq(int i2, int i3) {
        return new ColorStateList(new int[][]{f46937zy, f1159p}, new int[]{i3, i2});
    }

    public static int zy(@zy.lvui Context context, int i2) {
        ColorStateList colorStateListM691g = m691g(context, i2);
        if (colorStateListM691g != null && colorStateListM691g.isStateful()) {
            return colorStateListM691g.getColorForState(f46937zy, colorStateListM691g.getDefaultColor());
        }
        TypedValue typedValueF7l8 = f7l8();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF7l8, true);
        return m693n(context, i2, typedValueF7l8.getFloat());
    }
}
