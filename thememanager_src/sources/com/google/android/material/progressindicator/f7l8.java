package com.google.android.material.progressindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.vectordrawable.graphics.drawable.toq;
import com.google.android.material.animation.C3910k;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.lvui;
import zy.yz;
import zy.zurt;

/* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class f7l8 extends Drawable implements androidx.vectordrawable.graphics.drawable.toq {

    /* JADX INFO: renamed from: c */
    private static final boolean f24791c = false;

    /* JADX INFO: renamed from: e */
    private static final int f24792e = 500;

    /* JADX INFO: renamed from: j */
    private static final Property<f7l8, Float> f24793j = new zy(Float.class, "growFraction");

    /* JADX INFO: renamed from: f */
    private int f24794f;

    /* JADX INFO: renamed from: g */
    private ValueAnimator f24795g;

    /* JADX INFO: renamed from: h */
    private float f24796h;

    /* JADX INFO: renamed from: i */
    private List<toq.AbstractC1258k> f24797i;

    /* JADX INFO: renamed from: k */
    final Context f24798k;

    /* JADX INFO: renamed from: l */
    final Paint f24799l = new Paint();

    /* JADX INFO: renamed from: n */
    C4081k f24800n = new C4081k();

    /* JADX INFO: renamed from: p */
    private boolean f24801p;

    /* JADX INFO: renamed from: q */
    final com.google.android.material.progressindicator.toq f24802q;

    /* JADX INFO: renamed from: r */
    private float f24803r;

    /* JADX INFO: renamed from: s */
    private boolean f24804s;

    /* JADX INFO: renamed from: t */
    private boolean f24805t;

    /* JADX INFO: renamed from: y */
    private ValueAnimator f24806y;

    /* JADX INFO: renamed from: z */
    private toq.AbstractC1258k f24807z;

    /* JADX INFO: renamed from: com.google.android.material.progressindicator.f7l8$k */
    /* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
    class C4079k extends AnimatorListenerAdapter {
        C4079k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            f7l8.this.f7l8();
        }
    }

    /* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
    class toq extends AnimatorListenerAdapter {
        toq() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            f7l8.super.setVisible(false, false);
            f7l8.this.m14689g();
        }
    }

    /* JADX INFO: compiled from: DrawableWithAnimatedVisibilityChange.java */
    class zy extends Property<f7l8, Float> {
        zy(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float get(f7l8 f7l8Var) {
            return Float.valueOf(f7l8Var.m14697s());
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(f7l8 f7l8Var, Float f2) {
            f7l8Var.kja0(f2.floatValue());
        }
    }

    f7l8(@lvui Context context, @lvui com.google.android.material.progressindicator.toq toqVar) {
        this.f24798k = context;
        this.f24802q = toqVar;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f7l8() {
        toq.AbstractC1258k abstractC1258k = this.f24807z;
        if (abstractC1258k != null) {
            abstractC1258k.zy(this);
        }
        List<toq.AbstractC1258k> list = this.f24797i;
        if (list == null || this.f24805t) {
            return;
        }
        Iterator<toq.AbstractC1258k> it = list.iterator();
        while (it.hasNext()) {
            it.next().zy(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public void m14689g() {
        toq.AbstractC1258k abstractC1258k = this.f24807z;
        if (abstractC1258k != null) {
            abstractC1258k.toq(this);
        }
        List<toq.AbstractC1258k> list = this.f24797i;
        if (list == null || this.f24805t) {
            return;
        }
        Iterator<toq.AbstractC1258k> it = list.iterator();
        while (it.hasNext()) {
            it.next().toq(this);
        }
    }

    /* JADX INFO: renamed from: h */
    private void m14690h(@lvui ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f24806y;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f24806y = valueAnimator;
        valueAnimator.addListener(new toq());
    }

    /* JADX INFO: renamed from: i */
    private void m14691i(@lvui ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f24795g;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f24795g = valueAnimator;
        valueAnimator.addListener(new C4079k());
    }

    private void n7h() {
        if (this.f24795g == null) {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, f24793j, 0.0f, 1.0f);
            this.f24795g = objectAnimatorOfFloat;
            objectAnimatorOfFloat.setDuration(500L);
            this.f24795g.setInterpolator(C3910k.f67312toq);
            m14691i(this.f24795g);
        }
        if (this.f24806y == null) {
            ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this, f24793j, 1.0f, 0.0f);
            this.f24806y = objectAnimatorOfFloat2;
            objectAnimatorOfFloat2.setDuration(500L);
            this.f24806y.setInterpolator(C3910k.f67312toq);
            m14690h(this.f24806y);
        }
    }

    /* JADX INFO: renamed from: y */
    private void m14695y(@lvui ValueAnimator... valueAnimatorArr) {
        boolean z2 = this.f24805t;
        this.f24805t = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f24805t = z2;
    }

    void cdj(@lvui toq.AbstractC1258k abstractC1258k) {
        this.f24807z = abstractC1258k;
    }

    @Override // androidx.vectordrawable.graphics.drawable.toq
    public void clearAnimationCallbacks() {
        this.f24797i.clear();
        this.f24797i = null;
    }

    public boolean fn3e(boolean z2, boolean z3, boolean z5) {
        return zurt(z2, z3, z5 && this.f24800n.m14703k(this.f24798k.getContentResolver()) > 0.0f);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f24794f;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return qrj() || x2();
    }

    @yz
    void ki(boolean z2, @zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f24801p = z2;
        this.f24796h = f2;
    }

    void kja0(@zurt(from = 0.0d, to = 1.0d) float f2) {
        if (this.f24803r != f2) {
            this.f24803r = f2;
            invalidateSelf();
        }
    }

    public boolean ld6() {
        return fn3e(false, false, false);
    }

    @lvui
    /* JADX INFO: renamed from: p */
    ValueAnimator m14696p() {
        return this.f24806y;
    }

    public boolean qrj() {
        ValueAnimator valueAnimator = this.f24795g;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f24804s;
    }

    /* JADX INFO: renamed from: s */
    float m14697s() {
        if (this.f24802q.toq() || this.f24802q.m14726k()) {
            return (this.f24801p || this.f24804s) ? this.f24796h : this.f24803r;
        }
        return 1.0f;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i2) {
        this.f24794f = i2;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@dd ColorFilter colorFilter) {
        this.f24799l.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z2, boolean z3) {
        return fn3e(z2, z3, true);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        zurt(true, true, false);
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        zurt(false, true, false);
    }

    @yz
    void t8r(boolean z2, @zurt(from = 0.0d, to = 1.0d) float f2) {
        this.f24804s = z2;
        this.f24796h = f2;
    }

    @Override // androidx.vectordrawable.graphics.drawable.toq
    public void toq(@lvui toq.AbstractC1258k abstractC1258k) {
        if (this.f24797i == null) {
            this.f24797i = new ArrayList();
        }
        if (this.f24797i.contains(abstractC1258k)) {
            return;
        }
        this.f24797i.add(abstractC1258k);
    }

    public boolean x2() {
        ValueAnimator valueAnimator = this.f24806y;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f24801p;
    }

    boolean zurt(boolean z2, boolean z3, boolean z5) {
        n7h();
        if (!isVisible() && !z2) {
            return false;
        }
        ValueAnimator valueAnimator = z2 ? this.f24795g : this.f24806y;
        if (!z5) {
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                m14695y(valueAnimator);
            }
            return super.setVisible(z2, false);
        }
        if (z5 && valueAnimator.isRunning()) {
            return false;
        }
        boolean z6 = !z2 || super.setVisible(z2, false);
        if (!(z2 ? this.f24802q.toq() : this.f24802q.m14726k())) {
            m14695y(valueAnimator);
            return z6;
        }
        if (z3 || !valueAnimator.isPaused()) {
            valueAnimator.start();
        } else {
            valueAnimator.resume();
        }
        return z6;
    }

    @Override // androidx.vectordrawable.graphics.drawable.toq
    public boolean zy(@lvui toq.AbstractC1258k abstractC1258k) {
        List<toq.AbstractC1258k> list = this.f24797i;
        if (list == null || !list.contains(abstractC1258k)) {
            return false;
        }
        this.f24797i.remove(abstractC1258k);
        if (!this.f24797i.isEmpty()) {
            return true;
        }
        this.f24797i = null;
        return true;
    }
}
