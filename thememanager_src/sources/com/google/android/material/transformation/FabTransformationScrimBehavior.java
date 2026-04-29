package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Property;
import android.view.MotionEvent;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.animation.C3914s;
import com.google.android.material.animation.toq;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import java.util.ArrayList;
import java.util.List;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class FabTransformationScrimBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    public static final long f67976ld6 = 150;

    /* JADX INFO: renamed from: p */
    public static final long f25428p = 0;

    /* JADX INFO: renamed from: s */
    public static final long f25429s = 150;

    /* JADX INFO: renamed from: y */
    public static final long f25430y = 75;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final C3914s f67977f7l8;

    /* JADX INFO: renamed from: g */
    private final C3914s f25431g;

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationScrimBehavior$k */
    class C4188k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f25432k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f25434q;

        C4188k(boolean z2, View view) {
            this.f25432k = z2;
            this.f25434q = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f25432k) {
                return;
            }
            this.f25434q.setVisibility(4);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f25432k) {
                this.f25434q.setVisibility(0);
            }
        }
    }

    public FabTransformationScrimBehavior() {
        this.f25431g = new C3914s(75L, 150L);
        this.f67977f7l8 = new C3914s(0L, 150L);
    }

    /* JADX INFO: renamed from: r */
    private void m15160r(@lvui View view, boolean z2, boolean z3, @lvui List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        C3914s c3914s = z2 ? this.f25431g : this.f67977f7l8;
        if (z2) {
            if (!z3) {
                view.setAlpha(0.0f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 1.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, 0.0f);
        }
        c3914s.m13985k(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    public boolean a9(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, @lvui MotionEvent motionEvent) {
        return super.a9(coordinatorLayout, view, motionEvent);
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    /* JADX INFO: renamed from: g */
    public boolean mo1751g(CoordinatorLayout coordinatorLayout, View view, View view2) {
        return view2 instanceof FloatingActionButton;
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @lvui
    protected AnimatorSet lvui(@lvui View view, @lvui View view2, boolean z2, boolean z3) {
        ArrayList arrayList = new ArrayList();
        m15160r(view2, z2, z3, arrayList, new ArrayList());
        AnimatorSet animatorSet = new AnimatorSet();
        toq.m13989k(animatorSet, arrayList);
        animatorSet.addListener(new C4188k(z2, view2));
        return animatorSet;
    }

    public FabTransformationScrimBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25431g = new C3914s(75L, 150L);
        this.f67977f7l8 = new C3914s(0L, 150L);
    }
}
