package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.toq;
import com.google.android.material.color.kja0;
import java.util.Arrays;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
final class x2 extends AbstractC4086s<ObjectAnimator> {

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private static final int f67768ld6 = 333;

    /* JADX INFO: renamed from: p */
    private static final int f24850p = 667;

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final Property<x2, Float> f67769x2 = new toq(Float.class, "animationFraction");

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private int f67770f7l8;

    /* JADX INFO: renamed from: g */
    private final com.google.android.material.progressindicator.toq f24851g;

    /* JADX INFO: renamed from: n */
    private androidx.interpolator.view.animation.toq f24852n;

    /* JADX INFO: renamed from: q */
    private ObjectAnimator f24853q;

    /* JADX INFO: renamed from: s */
    private float f24854s;

    /* JADX INFO: renamed from: y */
    private boolean f24855y;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.x2$k */
    /* JADX INFO: compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    class C4087k extends AnimatorListenerAdapter {
        C4087k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            x2 x2Var = x2.this;
            x2Var.f67770f7l8 = (x2Var.f67770f7l8 + 1) % x2.this.f24851g.f67767zy.length;
            x2.this.f24855y = true;
        }
    }

    /* JADX INFO: compiled from: LinearIndeterminateContiguousAnimatorDelegate.java */
    class toq extends Property<x2, Float> {
        toq(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float get(x2 x2Var) {
            return Float.valueOf(x2Var.n7h());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(x2 x2Var, Float f2) {
            x2Var.ki(f2.floatValue());
        }
    }

    public x2(@lvui n7h n7hVar) {
        super(3);
        this.f67770f7l8 = 1;
        this.f24851g = n7hVar;
        this.f24852n = new androidx.interpolator.view.animation.toq();
    }

    /* JADX INFO: renamed from: h */
    private void m14727h() {
        if (!this.f24855y || this.f67764toq[3] >= 1.0f) {
            return;
        }
        int[] iArr = this.f67765zy;
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = kja0.m14282k(this.f24851g.f67767zy[this.f67770f7l8], this.f24845k.getAlpha());
        this.f24855y = false;
    }

    private void kja0() {
        if (this.f24853q == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f67769x2, 0.0f, 1.0f);
            this.f24853q = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(333L);
            this.f24853q.setInterpolator(null);
            this.f24853q.setRepeatCount(-1);
            this.f24853q.addListener(new C4087k());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n7h() {
        return this.f24854s;
    }

    private void t8r(int i2) {
        this.f67764toq[0] = 0.0f;
        float qVar = toq(i2, 0, f24850p);
        float[] fArr = this.f67764toq;
        float interpolation = this.f24852n.getInterpolation(qVar);
        fArr[2] = interpolation;
        fArr[1] = interpolation;
        float[] fArr2 = this.f67764toq;
        float interpolation2 = this.f24852n.getInterpolation(qVar + 0.49925038f);
        fArr2[4] = interpolation2;
        fArr2[3] = interpolation2;
        this.f67764toq[5] = 1.0f;
    }

    @yz
    void cdj() {
        this.f24855y = true;
        this.f67770f7l8 = 1;
        Arrays.fill(this.f67765zy, kja0.m14282k(this.f24851g.f67767zy[0], this.f24845k.getAlpha()));
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    public void f7l8() {
        kja0();
        cdj();
        this.f24853q.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    /* JADX INFO: renamed from: g */
    public void mo14713g() {
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    /* JADX INFO: renamed from: k */
    public void mo14715k() {
        ObjectAnimator objectAnimator = this.f24853q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @yz
    void ki(float f2) {
        this.f24854s = f2;
        t8r((int) (f2 * 333.0f));
        m14727h();
        this.f24845k.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    /* JADX INFO: renamed from: q */
    public void mo14716q(@dd toq.AbstractC1258k abstractC1258k) {
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    /* JADX INFO: renamed from: y */
    public void mo14717y() {
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    public void zy() {
        cdj();
    }
}
