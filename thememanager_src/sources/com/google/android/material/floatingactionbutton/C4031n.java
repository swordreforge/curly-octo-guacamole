package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.StateListAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.util.Property;
import android.view.View;
import androidx.core.content.C0498q;
import androidx.core.util.n7h;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import ij.C6095k;
import java.util.ArrayList;
import zy.dd;
import zy.hyr;
import zy.lvui;

/* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.n */
/* JADX INFO: compiled from: FloatingActionButtonImplLollipop.java */
/* JADX INFO: loaded from: classes2.dex */
@hyr(21)
class C4031n extends C4032q {

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.n$k */
    /* JADX INFO: compiled from: FloatingActionButtonImplLollipop.java */
    static class k extends C4108p {
        k(kja0 kja0Var) {
            super(kja0Var);
        }

        @Override // com.google.android.material.shape.C4108p, android.graphics.drawable.Drawable
        public boolean isStateful() {
            return true;
        }
    }

    C4031n(FloatingActionButton floatingActionButton, com.google.android.material.shadow.zy zyVar) {
        super(floatingActionButton, zyVar);
    }

    @lvui
    /* JADX INFO: renamed from: a */
    private Animator m14493a(float f2, float f3) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ObjectAnimator.ofFloat(this.f67617ni7, "elevation", f2).setDuration(0L)).with(ObjectAnimator.ofFloat(this.f67617ni7, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, f3).setDuration(100L));
        animatorSet.setInterpolator(C4032q.f67599jk);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.C4032q
    void a9(int[] iArr) {
    }

    @lvui
    zy a98o(int i2, ColorStateList colorStateList) {
        Context context = this.f67617ni7.getContext();
        zy zyVar = new zy((kja0) n7h.x2(this.f24453k));
        zyVar.m14518g(C0498q.m2252g(context, C6095k.n.f79474mu), C0498q.m2252g(context, C6095k.n.f35623d), C0498q.m2252g(context, C6095k.n.f35641v), C0498q.m2252g(context, C6095k.n.f79437ikck));
        zyVar.m14519n(i2);
        zyVar.m14520q(colorStateList);
        return zyVar;
    }

    @Override // com.google.android.material.floatingactionbutton.C4032q
    void fti(float f2, float f3, float f4) {
        StateListAnimator stateListAnimator = new StateListAnimator();
        stateListAnimator.addState(C4032q.f67603n5r1, m14493a(f2, f4));
        stateListAnimator.addState(C4032q.f67598hyr, m14493a(f2, f3));
        stateListAnimator.addState(C4032q.f24447f, m14493a(f2, f3));
        stateListAnimator.addState(C4032q.f24446c, m14493a(f2, f3));
        AnimatorSet animatorSet = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(ObjectAnimator.ofFloat(this.f67617ni7, "elevation", f2).setDuration(0L));
        arrayList.add(ObjectAnimator.ofFloat(this.f67617ni7, (Property<FloatingActionButton, Float>) View.TRANSLATION_Z, 0.0f).setDuration(100L));
        animatorSet.playSequentially((Animator[]) arrayList.toArray(new Animator[0]));
        animatorSet.setInterpolator(C4032q.f67599jk);
        stateListAnimator.addState(C4032q.f67601lrht, animatorSet);
        stateListAnimator.addState(C4032q.f67606uv6, m14493a(0.0f, 0.0f));
        this.f67617ni7.setStateListAnimator(stateListAnimator);
        if (mo14494j()) {
            m14502b();
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C4032q
    void fu4(ColorStateList colorStateList, @dd PorterDuff.Mode mode, ColorStateList colorStateList2, int i2) {
        Drawable layerDrawable;
        C4108p c4108pX2 = x2();
        this.f67621toq = c4108pX2;
        c4108pX2.setTintList(colorStateList);
        if (mode != null) {
            this.f67621toq.setTintMode(mode);
        }
        this.f67621toq.m14856e(this.f67617ni7.getContext());
        if (i2 > 0) {
            this.f24456q = a98o(i2, colorStateList);
            layerDrawable = new LayerDrawable(new Drawable[]{(Drawable) n7h.x2(this.f24456q), (Drawable) n7h.x2(this.f67621toq)});
        } else {
            this.f24456q = null;
            layerDrawable = this.f67621toq;
        }
        RippleDrawable rippleDrawable = new RippleDrawable(com.google.android.material.ripple.toq.m14763q(colorStateList2), layerDrawable, null);
        this.f67625zy = rippleDrawable;
        this.f24454n = rippleDrawable;
    }

    @Override // com.google.android.material.floatingactionbutton.C4032q
    /* JADX INFO: renamed from: j */
    boolean mo14494j() {
        return this.f67611fu4.toq() || !m14510m();
    }

    @Override // com.google.android.material.floatingactionbutton.C4032q
    void mcp() {
        m14502b();
    }

    @Override // com.google.android.material.floatingactionbutton.C4032q
    public float n7h() {
        return this.f67617ni7.getElevation();
    }

    @Override // com.google.android.material.floatingactionbutton.C4032q
    /* JADX INFO: renamed from: r */
    boolean mo14495r() {
        return false;
    }

    @Override // com.google.android.material.floatingactionbutton.C4032q
    void t8r(@lvui Rect rect) {
        if (this.f67611fu4.toq()) {
            super.t8r(rect);
        } else if (m14510m()) {
            rect.set(0, 0, 0, 0);
        } else {
            int sizeDimension = (this.f67614ld6 - this.f67617ni7.getSizeDimension()) / 2;
            rect.set(sizeDimension, sizeDimension, sizeDimension, sizeDimension);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C4032q
    void vyq(@dd ColorStateList colorStateList) {
        Drawable drawable = this.f67625zy;
        if (drawable instanceof RippleDrawable) {
            ((RippleDrawable) drawable).setColor(com.google.android.material.ripple.toq.m14763q(colorStateList));
        } else {
            super.vyq(colorStateList);
        }
    }

    @Override // com.google.android.material.floatingactionbutton.C4032q
    void wvg() {
    }

    @Override // com.google.android.material.floatingactionbutton.C4032q
    @lvui
    C4108p x2() {
        return new k((kja0) n7h.x2(this.f24453k));
    }

    @Override // com.google.android.material.floatingactionbutton.C4032q
    void yz() {
    }
}
