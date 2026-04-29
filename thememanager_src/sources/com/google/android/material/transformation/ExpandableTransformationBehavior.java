package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import zy.InterfaceC7842s;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* JADX INFO: renamed from: n */
    @dd
    private AnimatorSet f25410n;

    /* JADX INFO: renamed from: com.google.android.material.transformation.ExpandableTransformationBehavior$k */
    class C4184k extends AnimatorListenerAdapter {
        C4184k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ExpandableTransformationBehavior.this.f25410n = null;
        }
    }

    public ExpandableTransformationBehavior() {
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior
    @InterfaceC7842s
    protected boolean eqxt(View view, View view2, boolean z2, boolean z3) {
        AnimatorSet animatorSet = this.f25410n;
        boolean z5 = animatorSet != null;
        if (z5) {
            animatorSet.cancel();
        }
        AnimatorSet animatorSetLvui = lvui(view, view2, z2, z5);
        this.f25410n = animatorSetLvui;
        animatorSetLvui.addListener(new C4184k());
        this.f25410n.start();
        if (!z3) {
            this.f25410n.end();
        }
        return true;
    }

    @lvui
    protected abstract AnimatorSet lvui(View view, View view2, boolean z2, boolean z3);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
