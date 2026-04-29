package com.google.android.material.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.view.C0683f;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import zy.InterfaceC7833l;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: compiled from: SlideDistanceProvider.java */
/* JADX INFO: loaded from: classes2.dex */
public final class t8r implements zurt {

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private static final int f68049zy = -1;

    /* JADX INFO: renamed from: k */
    private int f25590k;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @InterfaceC7833l
    private int f68050toq = -1;

    /* JADX INFO: renamed from: com.google.android.material.transition.t8r$k */
    /* JADX INFO: compiled from: SlideDistanceProvider.java */
    class C4225k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25591k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25592q;

        C4225k(View view, float f2) {
            this.f25591k = view;
            this.f25592q = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25591k.setTranslationX(this.f25592q);
        }
    }

    /* JADX INFO: compiled from: SlideDistanceProvider.java */
    class toq extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25593k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ float f25594q;

        toq(View view, float f2) {
            this.f25593k = view;
            this.f25594q = f2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25593k.setTranslationY(this.f25594q);
        }
    }

    /* JADX INFO: compiled from: SlideDistanceProvider.java */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface zy {
    }

    public t8r(int i2) {
        this.f25590k = i2;
    }

    /* JADX INFO: renamed from: g */
    private static Animator m15274g(View view, float f2, float f3, float f4) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f2, f3));
        objectAnimatorOfPropertyValuesHolder.addListener(new toq(view, f4));
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: n */
    private static Animator m15275n(View view, float f2, float f3, float f4) {
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f2, f3));
        objectAnimatorOfPropertyValuesHolder.addListener(new C4225k(view, f4));
        return objectAnimatorOfPropertyValuesHolder;
    }

    /* JADX INFO: renamed from: p */
    private static boolean m15276p(View view) {
        return C0683f.m3159e(view) == 1;
    }

    /* JADX INFO: renamed from: q */
    private static Animator m15277q(View view, View view2, int i2, @InterfaceC7833l int i3) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i2 == 3) {
            return m15275n(view2, translationX, translationX - i3, translationX);
        }
        if (i2 == 5) {
            return m15275n(view2, translationX, i3 + translationX, translationX);
        }
        if (i2 == 48) {
            return m15274g(view2, translationY, i3 + translationY, translationY);
        }
        if (i2 == 80) {
            return m15274g(view2, translationY, translationY - i3, translationY);
        }
        if (i2 == 8388611) {
            return m15275n(view2, translationX, m15276p(view) ? translationX - i3 : i3 + translationX, translationX);
        }
        if (i2 == 8388613) {
            return m15275n(view2, translationX, m15276p(view) ? i3 + translationX : translationX - i3, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i2);
    }

    /* JADX INFO: renamed from: y */
    private int m15278y(Context context) {
        int i2 = this.f68050toq;
        return i2 != -1 ? i2 : context.getResources().getDimensionPixelSize(C6095k.g.qg);
    }

    private static Animator zy(View view, View view2, int i2, @InterfaceC7833l int i3) {
        float translationX = view2.getTranslationX();
        float translationY = view2.getTranslationY();
        if (i2 == 3) {
            return m15275n(view2, i3 + translationX, translationX, translationX);
        }
        if (i2 == 5) {
            return m15275n(view2, translationX - i3, translationX, translationX);
        }
        if (i2 == 48) {
            return m15274g(view2, translationY - i3, translationY, translationY);
        }
        if (i2 == 80) {
            return m15274g(view2, i3 + translationY, translationY, translationY);
        }
        if (i2 == 8388611) {
            return m15275n(view2, m15276p(view) ? i3 + translationX : translationX - i3, translationX, translationX);
        }
        if (i2 == 8388613) {
            return m15275n(view2, m15276p(view) ? translationX - i3 : i3 + translationX, translationX, translationX);
        }
        throw new IllegalArgumentException("Invalid slide direction: " + i2);
    }

    @InterfaceC7833l
    public int f7l8() {
        return this.f68050toq;
    }

    @Override // com.google.android.material.transition.zurt
    @dd
    /* JADX INFO: renamed from: k */
    public Animator mo15176k(@lvui ViewGroup viewGroup, @lvui View view) {
        return m15277q(viewGroup, view, this.f25590k, m15278y(view.getContext()));
    }

    public void ld6(@InterfaceC7833l int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("Slide distance must be positive. If attempting to reverse the direction of the slide, use setSlideEdge(int) instead.");
        }
        this.f68050toq = i2;
    }

    /* JADX INFO: renamed from: s */
    public int m15279s() {
        return this.f25590k;
    }

    @Override // com.google.android.material.transition.zurt
    @dd
    public Animator toq(@lvui ViewGroup viewGroup, @lvui View view) {
        return zy(viewGroup, view, this.f25590k, m15278y(view.getContext()));
    }

    public void x2(int i2) {
        this.f25590k = i2;
    }
}
