package com.google.android.material.ripple;

import android.R;
import android.annotation.TargetApi;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Build;
import android.util.Log;
import android.util.StateSet;
import androidx.core.graphics.C0541p;
import zy.dd;
import zy.lvui;
import zy.uv6;
import zy.x2;
import zy.yz;

/* JADX INFO: compiled from: RippleUtils.java */
/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public class toq {

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    @yz
    static final String f67794qrj = "Use a non-transparent color for the default color as it will be used to finish ripple animations.";

    /* JADX INFO: renamed from: k */
    public static final boolean f24883k = true;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    private static final int[] f67795toq = {R.attr.state_pressed};

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int[] f67797zy = {R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: q */
    private static final int[] f24886q = {R.attr.state_focused};

    /* JADX INFO: renamed from: n */
    private static final int[] f24884n = {R.attr.state_hovered};

    /* JADX INFO: renamed from: g */
    private static final int[] f24882g = {R.attr.state_selected, R.attr.state_pressed};

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private static final int[] f67792f7l8 = {R.attr.state_selected, R.attr.state_hovered, R.attr.state_focused};

    /* JADX INFO: renamed from: y */
    private static final int[] f24888y = {R.attr.state_selected, R.attr.state_focused};

    /* JADX INFO: renamed from: s */
    private static final int[] f24887s = {R.attr.state_selected, R.attr.state_hovered};

    /* JADX INFO: renamed from: p */
    private static final int[] f24885p = {R.attr.state_selected};

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int[] f67793ld6 = {R.attr.state_enabled, R.attr.state_pressed};

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    @yz
    static final String f67796x2 = toq.class.getSimpleName();

    private toq() {
    }

    @lvui
    /* JADX INFO: renamed from: k */
    public static ColorStateList m14761k(@dd ColorStateList colorStateList) {
        if (f24883k) {
            return new ColorStateList(new int[][]{f24885p, StateSet.NOTHING}, new int[]{zy(colorStateList, f24882g), zy(colorStateList, f67795toq)});
        }
        int[] iArr = f24882g;
        int[] iArr2 = f67792f7l8;
        int[] iArr3 = f24888y;
        int[] iArr4 = f24887s;
        int[] iArr5 = f67795toq;
        int[] iArr6 = f67797zy;
        int[] iArr7 = f24886q;
        int[] iArr8 = f24884n;
        return new ColorStateList(new int[][]{iArr, iArr2, iArr3, iArr4, f24885p, iArr5, iArr6, iArr7, iArr8, StateSet.NOTHING}, new int[]{zy(colorStateList, iArr), zy(colorStateList, iArr2), zy(colorStateList, iArr3), zy(colorStateList, iArr4), 0, zy(colorStateList, iArr5), zy(colorStateList, iArr6), zy(colorStateList, iArr7), zy(colorStateList, iArr8), 0});
    }

    /* JADX INFO: renamed from: n */
    public static boolean m14762n(@lvui int[] iArr) {
        boolean z2 = false;
        boolean z3 = false;
        for (int i2 : iArr) {
            if (i2 == 16842910) {
                z2 = true;
            } else if (i2 == 16842908 || i2 == 16842919 || i2 == 16843623) {
                z3 = true;
            }
        }
        return z2 && z3;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    public static ColorStateList m14763q(@dd ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0 && Color.alpha(colorStateList.getColorForState(f67793ld6, 0)) != 0) {
            Log.w(f67796x2, f67794qrj);
        }
        return colorStateList;
    }

    @x2
    @TargetApi(21)
    private static int toq(@x2 int i2) {
        return C0541p.m2542t(i2, Math.min(Color.alpha(i2) * 2, 255));
    }

    @x2
    private static int zy(@dd ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return f24883k ? toq(colorForState) : colorForState;
    }
}
