package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.Property;
import android.view.View;
import androidx.core.util.n7h;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.android.material.animation.C3910k;
import com.google.android.material.animation.C3915y;
import java.util.ArrayList;
import java.util.List;
import zy.InterfaceC7842s;
import zy.dd;
import zy.lvui;

/* JADX INFO: compiled from: BaseMotionStrategy.java */
/* JADX INFO: loaded from: classes2.dex */
abstract class toq implements InterfaceC4029g {

    /* JADX INFO: renamed from: g */
    @dd
    private C3915y f24488g;

    /* JADX INFO: renamed from: k */
    private final Context f24489k;

    /* JADX INFO: renamed from: n */
    @dd
    private C3915y f24490n;

    /* JADX INFO: renamed from: q */
    private final C4030k f24491q;

    /* JADX INFO: renamed from: toq, reason: collision with root package name */
    @lvui
    private final ExtendedFloatingActionButton f67627toq;

    /* JADX INFO: renamed from: zy, reason: collision with root package name */
    private final ArrayList<Animator.AnimatorListener> f67628zy = new ArrayList<>();

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.toq$k */
    /* JADX INFO: compiled from: BaseMotionStrategy.java */
    class C4033k extends Property<ExtendedFloatingActionButton, Float> {
        C4033k(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float get(ExtendedFloatingActionButton extendedFloatingActionButton) {
            return Float.valueOf(C3910k.m13980k(0.0f, 1.0f, (Color.alpha(extendedFloatingActionButton.getCurrentTextColor()) / 255.0f) / Color.alpha(extendedFloatingActionButton.ax.getColorForState(extendedFloatingActionButton.getDrawableState(), toq.this.f67627toq.ax.getDefaultColor()))));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(ExtendedFloatingActionButton extendedFloatingActionButton, Float f2) {
            int colorForState = extendedFloatingActionButton.ax.getColorForState(extendedFloatingActionButton.getDrawableState(), toq.this.f67627toq.ax.getDefaultColor());
            ColorStateList colorStateListValueOf = ColorStateList.valueOf(Color.argb((int) (C3910k.m13980k(0.0f, Color.alpha(colorForState) / 255.0f, f2.floatValue()) * 255.0f), Color.red(colorForState), Color.green(colorForState), Color.blue(colorForState)));
            if (f2.floatValue() == 1.0f) {
                extendedFloatingActionButton.lrht(extendedFloatingActionButton.ax);
            } else {
                extendedFloatingActionButton.lrht(colorStateListValueOf);
            }
        }
    }

    toq(@lvui ExtendedFloatingActionButton extendedFloatingActionButton, C4030k c4030k) {
        this.f67627toq = extendedFloatingActionButton;
        this.f24489k = extendedFloatingActionButton.getContext();
        this.f24491q = c4030k;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
    @InterfaceC7842s
    /* JADX INFO: renamed from: g */
    public void mo14472g() {
        this.f24491q.toq();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
    /* JADX INFO: renamed from: k */
    public final C3915y mo14488k() {
        C3915y c3915y = this.f24488g;
        if (c3915y != null) {
            return c3915y;
        }
        if (this.f24490n == null) {
            this.f24490n = C3915y.m13992q(this.f24489k, f7l8());
        }
        return (C3915y) n7h.x2(this.f24490n);
    }

    @lvui
    AnimatorSet kja0(@lvui C3915y c3915y) {
        ArrayList arrayList = new ArrayList();
        if (c3915y.m13994p("opacity")) {
            arrayList.add(c3915y.m13993g("opacity", this.f67627toq, View.ALPHA));
        }
        if (c3915y.m13994p("scale")) {
            arrayList.add(c3915y.m13993g("scale", this.f67627toq, View.SCALE_Y));
            arrayList.add(c3915y.m13993g("scale", this.f67627toq, View.SCALE_X));
        }
        if (c3915y.m13994p("width")) {
            arrayList.add(c3915y.m13993g("width", this.f67627toq, ExtendedFloatingActionButton.ay));
        }
        if (c3915y.m13994p(InterfaceC1925p.byf)) {
            arrayList.add(c3915y.m13993g(InterfaceC1925p.byf, this.f67627toq, ExtendedFloatingActionButton.be));
        }
        if (c3915y.m13994p("paddingStart")) {
            arrayList.add(c3915y.m13993g("paddingStart", this.f67627toq, ExtendedFloatingActionButton.aj));
        }
        if (c3915y.m13994p("paddingEnd")) {
            arrayList.add(c3915y.m13993g("paddingEnd", this.f67627toq, ExtendedFloatingActionButton.bs));
        }
        if (c3915y.m13994p("labelOpacity")) {
            arrayList.add(c3915y.m13993g("labelOpacity", this.f67627toq, new C4033k(Float.class, "LABEL_OPACITY_PROPERTY")));
        }
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.toq.m13989k(animatorSet, arrayList);
        return animatorSet;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
    public AnimatorSet ld6() {
        return kja0(mo14488k());
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
    /* JADX INFO: renamed from: n */
    public final void mo14489n(@lvui Animator.AnimatorListener animatorListener) {
        this.f67628zy.remove(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
    @InterfaceC7842s
    public void onAnimationStart(Animator animator) {
        this.f24491q.zy(animator);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
    /* JADX INFO: renamed from: p */
    public final void mo14490p(@dd C3915y c3915y) {
        this.f24488g = c3915y;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
    @InterfaceC7842s
    /* JADX INFO: renamed from: s */
    public void mo14467s() {
        this.f24491q.toq();
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
    @lvui
    public final List<Animator.AnimatorListener> x2() {
        return this.f67628zy;
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
    /* JADX INFO: renamed from: y */
    public final void mo14491y(@lvui Animator.AnimatorListener animatorListener) {
        this.f67628zy.add(animatorListener);
    }

    @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
    @dd
    public C3915y zy() {
        return this.f24488g;
    }
}
