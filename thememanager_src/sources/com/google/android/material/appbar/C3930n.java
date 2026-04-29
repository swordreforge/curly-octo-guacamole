package com.google.android.material.appbar;

import android.R;
import android.animation.AnimatorInflater;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.material.internal.cdj;
import ij.C6095k;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.appbar.n */
/* JADX INFO: compiled from: ViewUtilsLollipop.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
class C3930n {

    /* JADX INFO: renamed from: k */
    private static final int[] f23874k = {R.attr.stateListAnimator};

    C3930n() {
    }

    /* JADX INFO: renamed from: k */
    static void m14050k(@lvui View view) {
        view.setOutlineProvider(ViewOutlineProvider.BOUNDS);
    }

    static void toq(@lvui View view, float f2) {
        int integer = view.getResources().getInteger(C6095k.s.f79911zy);
        StateListAnimator stateListAnimator = new StateListAnimator();
        long j2 = integer;
        stateListAnimator.addState(new int[]{R.attr.state_enabled, C6095k.zy.c7, -C6095k.zy.qvyi}, ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(j2));
        stateListAnimator.addState(new int[]{R.attr.state_enabled}, ObjectAnimator.ofFloat(view, "elevation", f2).setDuration(j2));
        stateListAnimator.addState(new int[0], ObjectAnimator.ofFloat(view, "elevation", 0.0f).setDuration(0L));
        view.setStateListAnimator(stateListAnimator);
    }

    static void zy(@lvui View view, AttributeSet attributeSet, int i2, int i3) {
        Context context = view.getContext();
        TypedArray typedArrayM14534p = cdj.m14534p(context, attributeSet, f23874k, i2, i3, new int[0]);
        try {
            if (typedArrayM14534p.hasValue(0)) {
                view.setStateListAnimator(AnimatorInflater.loadStateListAnimator(context, typedArrayM14534p.getResourceId(0, 0)));
            }
        } finally {
            typedArrayM14534p.recycle();
        }
    }
}
