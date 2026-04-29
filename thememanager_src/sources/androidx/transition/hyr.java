package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.animation.TimeInterpolator;
import android.util.Property;
import android.view.View;
import androidx.transition.jk;
import androidx.transition.oc;

/* JADX INFO: compiled from: TranslationAnimationCreator.java */
/* JADX INFO: loaded from: classes.dex */
class hyr {

    /* JADX INFO: renamed from: androidx.transition.hyr$k */
    /* JADX INFO: compiled from: TranslationAnimationCreator.java */
    private static class C1214k extends AnimatorListenerAdapter implements oc.InterfaceC1241y {

        /* JADX INFO: renamed from: g */
        private final int f6453g;

        /* JADX INFO: renamed from: h */
        private final float f6454h;

        /* JADX INFO: renamed from: i */
        private final float f6455i;

        /* JADX INFO: renamed from: k */
        private final View f6456k;

        /* JADX INFO: renamed from: n */
        private final int f6457n;

        /* JADX INFO: renamed from: p */
        private float f6458p;

        /* JADX INFO: renamed from: q */
        private final View f6459q;

        /* JADX INFO: renamed from: s */
        private float f6460s;

        /* JADX INFO: renamed from: y */
        private int[] f6461y;

        C1214k(View view, View view2, int i2, int i3, float f2, float f3) {
            this.f6459q = view;
            this.f6456k = view2;
            this.f6457n = i2 - Math.round(view.getTranslationX());
            this.f6453g = i3 - Math.round(view.getTranslationY());
            this.f6454h = f2;
            this.f6455i = f3;
            int i4 = jk.f7l8.f52516cnbm;
            int[] iArr = (int[]) view2.getTag(i4);
            this.f6461y = iArr;
            if (iArr != null) {
                view2.setTag(i4, null);
            }
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: k */
        public void mo5309k(@zy.lvui oc ocVar) {
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: n */
        public void mo5310n(@zy.lvui oc ocVar) {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f6461y == null) {
                this.f6461y = new int[2];
            }
            this.f6461y[0] = Math.round(this.f6457n + this.f6459q.getTranslationX());
            this.f6461y[1] = Math.round(this.f6453g + this.f6459q.getTranslationY());
            this.f6456k.setTag(jk.f7l8.f52516cnbm, this.f6461y);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationPause(Animator animator) {
            this.f6460s = this.f6459q.getTranslationX();
            this.f6458p = this.f6459q.getTranslationY();
            this.f6459q.setTranslationX(this.f6454h);
            this.f6459q.setTranslationY(this.f6455i);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorPauseListener
        public void onAnimationResume(Animator animator) {
            this.f6459q.setTranslationX(this.f6460s);
            this.f6459q.setTranslationY(this.f6458p);
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        /* JADX INFO: renamed from: q */
        public void mo5311q(@zy.lvui oc ocVar) {
            this.f6459q.setTranslationX(this.f6454h);
            this.f6459q.setTranslationY(this.f6455i);
            ocVar.mo5320x(this);
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        public void toq(@zy.lvui oc ocVar) {
        }

        @Override // androidx.transition.oc.InterfaceC1241y
        public void zy(@zy.lvui oc ocVar) {
        }
    }

    private hyr() {
    }

    @zy.dd
    /* JADX INFO: renamed from: k */
    static Animator m5356k(@zy.lvui View view, @zy.lvui C1225l c1225l, int i2, int i3, float f2, float f3, float f4, float f5, @zy.dd TimeInterpolator timeInterpolator, @zy.lvui oc ocVar) {
        float f6;
        float f7;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        if (((int[]) c1225l.f53502toq.getTag(jk.f7l8.f52516cnbm)) != null) {
            f6 = (r4[0] - i2) + translationX;
            f7 = (r4[1] - i3) + translationY;
        } else {
            f6 = f2;
            f7 = f3;
        }
        int iRound = i2 + Math.round(f6 - translationX);
        int iRound2 = i3 + Math.round(f7 - translationY);
        view.setTranslationX(f6);
        view.setTranslationY(f7);
        if (f6 == f4 && f7 == f5) {
            return null;
        }
        ObjectAnimator objectAnimatorOfPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_X, f6, f4), PropertyValuesHolder.ofFloat((Property<?, Float>) View.TRANSLATION_Y, f7, f5));
        C1214k c1214k = new C1214k(view, c1225l.f53502toq, iRound, iRound2, translationX, translationY);
        ocVar.mo5316k(c1214k);
        objectAnimatorOfPropertyValuesHolder.addListener(c1214k);
        C1224k.m5365k(objectAnimatorOfPropertyValuesHolder, c1214k);
        objectAnimatorOfPropertyValuesHolder.setInterpolator(timeInterpolator);
        return objectAnimatorOfPropertyValuesHolder;
    }
}
