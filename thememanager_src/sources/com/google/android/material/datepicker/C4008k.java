package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.view.C0683f;
import com.google.android.material.shape.C4108p;
import ij.C6095k;
import zy.hb;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.datepicker.k */
/* JADX INFO: compiled from: CalendarItemStyle.java */
/* JADX INFO: loaded from: classes2.dex */
final class C4008k {

    /* JADX INFO: renamed from: g */
    private final com.google.android.material.shape.kja0 f24334g;

    /* JADX INFO: renamed from: k */
    @lvui
    private final Rect f24335k;

    /* JADX INFO: renamed from: n */
    private final int f24336n;

    /* JADX INFO: renamed from: q */
    private final ColorStateList f24337q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private final ColorStateList f67569toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final ColorStateList f67570zy;

    private C4008k(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i2, com.google.android.material.shape.kja0 kja0Var, @lvui Rect rect) {
        androidx.core.util.n7h.m2979s(rect.left);
        androidx.core.util.n7h.m2979s(rect.top);
        androidx.core.util.n7h.m2979s(rect.right);
        androidx.core.util.n7h.m2979s(rect.bottom);
        this.f24335k = rect;
        this.f67569toq = colorStateList2;
        this.f67570zy = colorStateList;
        this.f24337q = colorStateList3;
        this.f24336n = i2;
        this.f24334g = kja0Var;
    }

    @lvui
    /* JADX INFO: renamed from: k */
    static C4008k m14421k(@lvui Context context, @hb int i2) {
        androidx.core.util.n7h.toq(i2 != 0, "Cannot create a CalendarItemStyle with a styleResId of 0");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, C6095k.kja0.ymez);
        Rect rect = new Rect(typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6095k.kja0.ots, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6095k.kja0.yb3p, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6095k.kja0.qwyf, 0), typedArrayObtainStyledAttributes.getDimensionPixelOffset(C6095k.kja0.qsl8, 0));
        ColorStateList colorStateListM14753k = com.google.android.material.resources.zy.m14753k(context, typedArrayObtainStyledAttributes, C6095k.kja0.ezv);
        ColorStateList colorStateListM14753k2 = com.google.android.material.resources.zy.m14753k(context, typedArrayObtainStyledAttributes, C6095k.kja0.zx6);
        ColorStateList colorStateListM14753k3 = com.google.android.material.resources.zy.m14753k(context, typedArrayObtainStyledAttributes, C6095k.kja0.w5);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.gun, 0);
        com.google.android.material.shape.kja0 kja0VarQrj = com.google.android.material.shape.kja0.toq(context, typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.t4se, 0), typedArrayObtainStyledAttributes.getResourceId(C6095k.kja0.ekha, 0)).qrj();
        typedArrayObtainStyledAttributes.recycle();
        return new C4008k(colorStateListM14753k, colorStateListM14753k2, colorStateListM14753k3, dimensionPixelSize, kja0VarQrj, rect);
    }

    /* JADX INFO: renamed from: g */
    void m14422g(@lvui TextView textView) {
        C4108p c4108p = new C4108p();
        C4108p c4108p2 = new C4108p();
        c4108p.setShapeAppearanceModel(this.f24334g);
        c4108p2.setShapeAppearanceModel(this.f24334g);
        c4108p.m14867x(this.f67570zy);
        c4108p.vq(this.f24336n, this.f24337q);
        textView.setTextColor(this.f67569toq);
        RippleDrawable rippleDrawable = new RippleDrawable(this.f67569toq.withAlpha(30), c4108p, c4108p2);
        Rect rect = this.f24335k;
        C0683f.wlev(textView, new InsetDrawable((Drawable) rippleDrawable, rect.left, rect.top, rect.right, rect.bottom));
    }

    /* JADX INFO: renamed from: n */
    int m14423n() {
        return this.f24335k.top;
    }

    /* JADX INFO: renamed from: q */
    int m14424q() {
        return this.f24335k.right;
    }

    int toq() {
        return this.f24335k.bottom;
    }

    int zy() {
        return this.f24335k.left;
    }
}
