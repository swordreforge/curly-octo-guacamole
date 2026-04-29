package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.toq;
import com.google.android.material.color.kja0;
import zy.lvui;
import zy.yz;

/* JADX INFO: renamed from: com.google.android.material.progressindicator.q */
/* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
final class C4084q extends AbstractC4086s<ObjectAnimator> {

    /* JADX INFO: renamed from: cdj, reason: collision with root package name */
    private static final int f67745cdj = 333;

    /* JADX INFO: renamed from: fn3e, reason: collision with root package name */
    private static final int f67746fn3e = -20;

    /* JADX INFO: renamed from: h */
    private static final int f24826h = 333;

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final int f67749kja0 = 667;

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int f67750n7h = 667;

    /* JADX INFO: renamed from: ni7, reason: collision with root package name */
    private static final int f67751ni7 = 1520;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int f67752qrj = 5400;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f67754x2 = 4;

    /* JADX INFO: renamed from: zurt, reason: collision with root package name */
    private static final int f67755zurt = 250;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final com.google.android.material.progressindicator.toq f67756f7l8;

    /* JADX INFO: renamed from: g */
    private final androidx.interpolator.view.animation.toq f24829g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    toq.AbstractC1258k f67757ld6;

    /* JADX INFO: renamed from: n */
    private ObjectAnimator f24830n;

    /* JADX INFO: renamed from: p */
    private float f24831p;

    /* JADX INFO: renamed from: q */
    private ObjectAnimator f24832q;

    /* JADX INFO: renamed from: s */
    private float f24833s;

    /* JADX INFO: renamed from: y */
    private int f24834y;

    /* JADX INFO: renamed from: ki, reason: collision with root package name */
    private static final int[] f67748ki = {0, 1350, 2700, 4050};

    /* JADX INFO: renamed from: t8r, reason: collision with root package name */
    private static final int[] f67753t8r = {667, 2017, 3367, 4717};

    /* JADX INFO: renamed from: i */
    private static final int[] f24827i = {1000, 2350, 3700, 5050};

    /* JADX INFO: renamed from: fu4, reason: collision with root package name */
    private static final Property<C4084q, Float> f67747fu4 = new zy(Float.class, "animationFraction");

    /* JADX INFO: renamed from: z */
    private static final Property<C4084q, Float> f24828z = new q(Float.class, "completeEndFraction");

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.q$k */
    /* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
    class k extends AnimatorListenerAdapter {
        k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            C4084q c4084q = C4084q.this;
            c4084q.f24834y = (c4084q.f24834y + 4) % C4084q.this.f67756f7l8.f67767zy.length;
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.q$q */
    /* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
    class q extends Property<C4084q, Float> {
        q(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float get(C4084q c4084q) {
            return Float.valueOf(c4084q.m14710h());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(C4084q c4084q, Float f2) {
            c4084q.fn3e(f2.floatValue());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.q$toq */
    /* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
    class toq extends AnimatorListenerAdapter {
        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            C4084q.this.mo14715k();
            C4084q c4084q = C4084q.this;
            toq.AbstractC1258k abstractC1258k = c4084q.f67757ld6;
            if (abstractC1258k != null) {
                abstractC1258k.toq(c4084q.f24845k);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.q$zy */
    /* JADX INFO: compiled from: CircularIndeterminateAnimatorDelegate.java */
    class zy extends Property<C4084q, Float> {
        zy(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float get(C4084q c4084q) {
            return Float.valueOf(c4084q.kja0());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(C4084q c4084q, Float f2) {
            c4084q.m14714i(f2.floatValue());
        }
    }

    public C4084q(@lvui C4082n c4082n) {
        super(1);
        this.f24834y = 0;
        this.f67757ld6 = null;
        this.f67756f7l8 = c4082n;
        this.f24829g = new androidx.interpolator.view.animation.toq();
    }

    private void cdj() {
        if (this.f24832q == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f67747fu4, 0.0f, 1.0f);
            this.f24832q = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(5400L);
            this.f24832q.setInterpolator(null);
            this.f24832q.setRepeatCount(-1);
            this.f24832q.addListener(new k());
        }
        if (this.f24830n == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f24828z, 0.0f, 1.0f);
            this.f24830n = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(333L);
            this.f24830n.setInterpolator(this.f24829g);
            this.f24830n.addListener(new toq());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fn3e(float f2) {
        this.f24831p = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public float m14710h() {
        return this.f24831p;
    }

    private void ki(int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            float qVar = toq(i2, f24827i[i3], 333);
            if (qVar >= 0.0f && qVar <= 1.0f) {
                int i4 = i3 + this.f24834y;
                int[] iArr = this.f67756f7l8.f67767zy;
                int length = i4 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                this.f67765zy[0] = com.google.android.material.animation.zy.toq().evaluate(this.f24829g.getInterpolation(qVar), Integer.valueOf(kja0.m14282k(iArr[length], this.f24845k.getAlpha())), Integer.valueOf(kja0.m14282k(this.f67756f7l8.f67767zy[length2], this.f24845k.getAlpha()))).intValue();
                return;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float kja0() {
        return this.f24833s;
    }

    private void zurt(int i2) {
        float[] fArr = this.f67764toq;
        float f2 = this.f24833s;
        fArr[0] = (f2 * 1520.0f) - 20.0f;
        fArr[1] = f2 * 1520.0f;
        for (int i3 = 0; i3 < 4; i3++) {
            float qVar = toq(i2, f67748ki[i3], 667);
            float[] fArr2 = this.f67764toq;
            fArr2[1] = fArr2[1] + (this.f24829g.getInterpolation(qVar) * 250.0f);
            float qVar2 = toq(i2, f67753t8r[i3], 667);
            float[] fArr3 = this.f67764toq;
            fArr3[0] = fArr3[0] + (this.f24829g.getInterpolation(qVar2) * 250.0f);
        }
        float[] fArr4 = this.f67764toq;
        float f3 = fArr4[0];
        float f4 = fArr4[1];
        float f5 = f3 + ((f4 - f3) * this.f24831p);
        fArr4[0] = f5;
        fArr4[0] = f5 / 360.0f;
        fArr4[1] = f4 / 360.0f;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    void f7l8() {
        cdj();
        t8r();
        this.f24832q.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    /* JADX INFO: renamed from: g */
    void mo14713g() {
        ObjectAnimator objectAnimator = this.f24830n;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f24845k.isVisible()) {
            this.f24830n.start();
        } else {
            mo14715k();
        }
    }

    @yz
    /* JADX INFO: renamed from: i */
    void m14714i(float f2) {
        this.f24833s = f2;
        int i2 = (int) (f2 * 5400.0f);
        zurt(i2);
        ki(i2);
        this.f24845k.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    /* JADX INFO: renamed from: k */
    void mo14715k() {
        ObjectAnimator objectAnimator = this.f24832q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    /* JADX INFO: renamed from: q */
    public void mo14716q(@lvui toq.AbstractC1258k abstractC1258k) {
        this.f67757ld6 = abstractC1258k;
    }

    @yz
    void t8r() {
        this.f24834y = 0;
        this.f67765zy[0] = kja0.m14282k(this.f67756f7l8.f67767zy[0], this.f24845k.getAlpha());
        this.f24831p = 0.0f;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    /* JADX INFO: renamed from: y */
    public void mo14717y() {
        this.f67757ld6 = null;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    public void zy() {
        t8r();
    }
}
