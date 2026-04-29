package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.view.animation.Interpolator;
import androidx.vectordrawable.graphics.drawable.C1256q;
import androidx.vectordrawable.graphics.drawable.toq;
import com.google.android.material.color.kja0;
import ij.C6095k;
import java.util.Arrays;
import zy.lvui;
import zy.yz;

/* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
/* JADX INFO: loaded from: classes2.dex */
final class qrj extends AbstractC4086s<ObjectAnimator> {

    /* JADX INFO: renamed from: x2, reason: collision with root package name */
    private static final int f67761x2 = 1800;

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final com.google.android.material.progressindicator.toq f67762f7l8;

    /* JADX INFO: renamed from: g */
    private final Interpolator[] f24837g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    toq.AbstractC1258k f67763ld6;

    /* JADX INFO: renamed from: n */
    private ObjectAnimator f24838n;

    /* JADX INFO: renamed from: p */
    private float f24839p;

    /* JADX INFO: renamed from: q */
    private ObjectAnimator f24840q;

    /* JADX INFO: renamed from: s */
    private boolean f24841s;

    /* JADX INFO: renamed from: y */
    private int f24842y;

    /* JADX INFO: renamed from: qrj, reason: collision with root package name */
    private static final int[] f67760qrj = {533, 567, 850, 750};

    /* JADX INFO: renamed from: n7h, reason: collision with root package name */
    private static final int[] f67759n7h = {1267, 1000, 333, 0};

    /* JADX INFO: renamed from: kja0, reason: collision with root package name */
    private static final Property<qrj, Float> f67758kja0 = new zy(Float.class, "animationFraction");

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.qrj$k */
    /* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    class C4085k extends AnimatorListenerAdapter {
        C4085k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            qrj qrjVar = qrj.this;
            qrjVar.f24842y = (qrjVar.f24842y + 1) % qrj.this.f67762f7l8.f67767zy.length;
            qrj.this.f24841s = true;
        }
    }

    /* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    class toq extends AnimatorListenerAdapter {
        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            qrj.this.mo14715k();
            qrj qrjVar = qrj.this;
            toq.AbstractC1258k abstractC1258k = qrjVar.f67763ld6;
            if (abstractC1258k != null) {
                abstractC1258k.toq(qrjVar.f24845k);
            }
        }
    }

    /* JADX INFO: compiled from: LinearIndeterminateDisjointAnimatorDelegate.java */
    class zy extends Property<qrj, Float> {
        zy(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float get(qrj qrjVar) {
            return Float.valueOf(qrjVar.n7h());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(qrj qrjVar, Float f2) {
            qrjVar.ki(f2.floatValue());
        }
    }

    public qrj(@lvui Context context, @lvui n7h n7hVar) {
        super(2);
        this.f24842y = 0;
        this.f67763ld6 = null;
        this.f67762f7l8 = n7hVar;
        this.f24837g = new Interpolator[]{C1256q.toq(context, C6095k.toq.f35727q), C1256q.toq(context, C6095k.toq.f35725n), C1256q.toq(context, C6095k.toq.f35721g), C1256q.toq(context, C6095k.toq.f79913f7l8)};
    }

    /* JADX INFO: renamed from: h */
    private void m14720h() {
        if (this.f24841s) {
            Arrays.fill(this.f67765zy, kja0.m14282k(this.f67762f7l8.f67767zy[this.f24842y], this.f24845k.getAlpha()));
            this.f24841s = false;
        }
    }

    private void kja0() {
        if (this.f24840q == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f67758kja0, 0.0f, 1.0f);
            this.f24840q = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(1800L);
            this.f24840q.setInterpolator(null);
            this.f24840q.setRepeatCount(-1);
            this.f24840q.addListener(new C4085k());
        }
        if (this.f24838n == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f67758kja0, 1.0f);
            this.f24838n = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(1800L);
            this.f24838n.setInterpolator(null);
            this.f24838n.addListener(new toq());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float n7h() {
        return this.f24839p;
    }

    private void t8r(int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            this.f67764toq[i3] = Math.max(0.0f, Math.min(1.0f, this.f24837g[i3].getInterpolation(toq(i2, f67759n7h[i3], f67760qrj[i3]))));
        }
    }

    @yz
    void cdj() {
        this.f24842y = 0;
        int iM14282k = kja0.m14282k(this.f67762f7l8.f67767zy[0], this.f24845k.getAlpha());
        int[] iArr = this.f67765zy;
        iArr[0] = iM14282k;
        iArr[1] = iM14282k;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    public void f7l8() {
        kja0();
        cdj();
        this.f24840q.start();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    /* JADX INFO: renamed from: g */
    public void mo14713g() {
        ObjectAnimator objectAnimator = this.f24838n;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        mo14715k();
        if (this.f24845k.isVisible()) {
            this.f24838n.setFloatValues(this.f24839p, 1.0f);
            this.f24838n.setDuration((long) ((1.0f - this.f24839p) * 1800.0f));
            this.f24838n.start();
        }
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    /* JADX INFO: renamed from: k */
    public void mo14715k() {
        ObjectAnimator objectAnimator = this.f24840q;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @yz
    void ki(float f2) {
        this.f24839p = f2;
        t8r((int) (f2 * 1800.0f));
        m14720h();
        this.f24845k.invalidateSelf();
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    /* JADX INFO: renamed from: q */
    public void mo14716q(@lvui toq.AbstractC1258k abstractC1258k) {
        this.f67763ld6 = abstractC1258k;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    /* JADX INFO: renamed from: y */
    public void mo14717y() {
        this.f67763ld6 = null;
    }

    @Override // com.google.android.material.progressindicator.AbstractC4086s
    public void zy() {
        cdj();
    }
}
