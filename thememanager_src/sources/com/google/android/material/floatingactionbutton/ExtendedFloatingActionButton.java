package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0683f;
import com.android.thememanager.controller.online.InterfaceC1925p;
import com.google.android.material.animation.C3915y;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.internal.C4052q;
import com.google.android.material.internal.cdj;
import com.google.android.material.shape.kja0;
import h4b.C6070k;
import ij.C6095k;
import java.util.Iterator;
import java.util.List;
import zy.dd;
import zy.lvui;
import zy.yz;

/* JADX INFO: loaded from: classes2.dex */
public class ExtendedFloatingActionButton extends MaterialButton implements CoordinatorLayout.toq {
    private static final int ac = 0;
    private static final int ad = 1;
    private static final int am = 2;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private final C4030k f67579ab;
    private final InterfaceC4029g an;

    @lvui
    private final CoordinatorLayout.zy<ExtendedFloatingActionButton> as;

    @lvui
    protected ColorStateList ax;
    private boolean az;
    private boolean ba;

    @lvui
    private final InterfaceC4029g bb;
    private boolean bg;
    private int bl;

    @lvui
    private final InterfaceC4029g bp;
    private final InterfaceC4029g bv;
    private final int id;
    private int in;

    /* JADX INFO: renamed from: w */
    private int f24403w;
    private static final int bq = C6095k.n7h.zq;
    static final Property<View, Float> ay = new C4023q(Float.class, "width");
    static final Property<View, Float> be = new C4021n(Float.class, InterfaceC1925p.byf);
    static final Property<View, Float> aj = new C4019g(Float.class, "paddingStart");
    static final Property<View, Float> bs = new f7l8(Float.class, "paddingEnd");

    class f7l8 extends Property<View, Float> {
        f7l8(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float get(@lvui View view) {
            return Float.valueOf(C0683f.bf2(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(@lvui View view, @lvui Float f2) {
            C0683f.u38j(view, C0683f.i1(view), view.getPaddingTop(), f2.intValue(), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$g */
    class C4019g extends Property<View, Float> {
        C4019g(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float get(@lvui View view) {
            return Float.valueOf(C0683f.i1(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(@lvui View view, @lvui Float f2) {
            C0683f.u38j(view, f2.intValue(), view.getPaddingTop(), C0683f.bf2(view), view.getPaddingBottom());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$k */
    class C4020k implements x2 {
        C4020k() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.x2
        /* JADX INFO: renamed from: k */
        public int mo14463k() {
            return ExtendedFloatingActionButton.this.getMeasuredHeight();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.x2
        /* JADX INFO: renamed from: n */
        public int mo14464n() {
            return ExtendedFloatingActionButton.this.in;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.x2
        /* JADX INFO: renamed from: q */
        public ViewGroup.LayoutParams mo14465q() {
            return new ViewGroup.LayoutParams(-2, -2);
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.x2
        public int toq() {
            return (ExtendedFloatingActionButton.this.getMeasuredWidth() - (ExtendedFloatingActionButton.this.getCollapsedPadding() * 2)) + ExtendedFloatingActionButton.this.in + ExtendedFloatingActionButton.this.bl;
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.x2
        public int zy() {
            return ExtendedFloatingActionButton.this.bl;
        }
    }

    class ld6 extends com.google.android.material.floatingactionbutton.toq {
        public ld6(C4030k c4030k) {
            super(ExtendedFloatingActionButton.this, c4030k);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
        public int f7l8() {
            return C6095k.toq.f79914fn3e;
        }

        @Override // com.google.android.material.floatingactionbutton.toq, com.google.android.material.floatingactionbutton.InterfaceC4029g
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f24403w = 2;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
        /* JADX INFO: renamed from: q */
        public boolean mo14466q() {
            return ExtendedFloatingActionButton.this.eqxt();
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
        public void qrj(@dd AbstractC4022p abstractC4022p) {
            if (abstractC4022p != null) {
                abstractC4022p.zy(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.toq, com.google.android.material.floatingactionbutton.InterfaceC4029g
        /* JADX INFO: renamed from: s */
        public void mo14467s() {
            super.mo14467s();
            ExtendedFloatingActionButton.this.f24403w = 0;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
        public void toq() {
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.setAlpha(1.0f);
            ExtendedFloatingActionButton.this.setScaleY(1.0f);
            ExtendedFloatingActionButton.this.setScaleX(1.0f);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$n */
    class C4021n extends Property<View, Float> {
        C4021n(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float get(@lvui View view) {
            return Float.valueOf(view.getLayoutParams().height);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(@lvui View view, @lvui Float f2) {
            view.getLayoutParams().height = f2.intValue();
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$p */
    public static abstract class AbstractC4022p {
        /* JADX INFO: renamed from: k */
        public void m14469k(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        /* JADX INFO: renamed from: q */
        public void m14470q(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void toq(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }

        public void zy(ExtendedFloatingActionButton extendedFloatingActionButton) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$q */
    class C4023q extends Property<View, Float> {
        C4023q(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        @lvui
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public Float get(@lvui View view) {
            return Float.valueOf(view.getLayoutParams().width);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
        public void set(@lvui View view, @lvui Float f2) {
            view.getLayoutParams().width = f2.intValue();
            view.requestLayout();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$s */
    class C4024s extends com.google.android.material.floatingactionbutton.toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private boolean f67584f7l8;

        public C4024s(C4030k c4030k) {
            super(ExtendedFloatingActionButton.this, c4030k);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
        public int f7l8() {
            return C6095k.toq.f35723i;
        }

        @Override // com.google.android.material.floatingactionbutton.toq, com.google.android.material.floatingactionbutton.InterfaceC4029g
        /* JADX INFO: renamed from: g */
        public void mo14472g() {
            super.mo14472g();
            this.f67584f7l8 = true;
        }

        @Override // com.google.android.material.floatingactionbutton.toq, com.google.android.material.floatingactionbutton.InterfaceC4029g
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f67584f7l8 = false;
            ExtendedFloatingActionButton.this.setVisibility(0);
            ExtendedFloatingActionButton.this.f24403w = 1;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
        /* JADX INFO: renamed from: q */
        public boolean mo14466q() {
            return ExtendedFloatingActionButton.this.oc();
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
        public void qrj(@dd AbstractC4022p abstractC4022p) {
            if (abstractC4022p != null) {
                abstractC4022p.toq(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.toq, com.google.android.material.floatingactionbutton.InterfaceC4029g
        /* JADX INFO: renamed from: s */
        public void mo14467s() {
            super.mo14467s();
            ExtendedFloatingActionButton.this.f24403w = 0;
            if (this.f67584f7l8) {
                return;
            }
            ExtendedFloatingActionButton.this.setVisibility(8);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
        public void toq() {
            ExtendedFloatingActionButton.this.setVisibility(8);
        }
    }

    class toq implements x2 {
        toq() {
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.x2
        /* JADX INFO: renamed from: k */
        public int mo14463k() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.x2
        /* JADX INFO: renamed from: n */
        public int mo14464n() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.x2
        /* JADX INFO: renamed from: q */
        public ViewGroup.LayoutParams mo14465q() {
            return new ViewGroup.LayoutParams(toq(), mo14463k());
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.x2
        public int toq() {
            return ExtendedFloatingActionButton.this.getCollapsedSize();
        }

        @Override // com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton.x2
        public int zy() {
            return ExtendedFloatingActionButton.this.getCollapsedPadding();
        }
    }

    interface x2 {
        /* JADX INFO: renamed from: k */
        int mo14463k();

        /* JADX INFO: renamed from: n */
        int mo14464n();

        /* JADX INFO: renamed from: q */
        ViewGroup.LayoutParams mo14465q();

        int toq();

        int zy();
    }

    /* JADX INFO: renamed from: com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton$y */
    class C4025y extends com.google.android.material.floatingactionbutton.toq {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private final x2 f67585f7l8;

        /* JADX INFO: renamed from: y */
        private final boolean f24412y;

        C4025y(C4030k c4030k, x2 x2Var, boolean z2) {
            super(ExtendedFloatingActionButton.this, c4030k);
            this.f67585f7l8 = x2Var;
            this.f24412y = z2;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
        public int f7l8() {
            return this.f24412y ? C6095k.toq.f79923t8r : C6095k.toq.f79916ki;
        }

        @Override // com.google.android.material.floatingactionbutton.toq, com.google.android.material.floatingactionbutton.InterfaceC4029g
        @lvui
        public AnimatorSet ld6() {
            C3915y c3915yMo14488k = mo14488k();
            if (c3915yMo14488k.m13994p("width")) {
                PropertyValuesHolder[] propertyValuesHolderArrF7l8 = c3915yMo14488k.f7l8("width");
                propertyValuesHolderArrF7l8[0].setFloatValues(ExtendedFloatingActionButton.this.getWidth(), this.f67585f7l8.toq());
                c3915yMo14488k.x2("width", propertyValuesHolderArrF7l8);
            }
            if (c3915yMo14488k.m13994p(InterfaceC1925p.byf)) {
                PropertyValuesHolder[] propertyValuesHolderArrF7l82 = c3915yMo14488k.f7l8(InterfaceC1925p.byf);
                propertyValuesHolderArrF7l82[0].setFloatValues(ExtendedFloatingActionButton.this.getHeight(), this.f67585f7l8.mo14463k());
                c3915yMo14488k.x2(InterfaceC1925p.byf, propertyValuesHolderArrF7l82);
            }
            if (c3915yMo14488k.m13994p("paddingStart")) {
                PropertyValuesHolder[] propertyValuesHolderArrF7l83 = c3915yMo14488k.f7l8("paddingStart");
                propertyValuesHolderArrF7l83[0].setFloatValues(C0683f.i1(ExtendedFloatingActionButton.this), this.f67585f7l8.mo14464n());
                c3915yMo14488k.x2("paddingStart", propertyValuesHolderArrF7l83);
            }
            if (c3915yMo14488k.m13994p("paddingEnd")) {
                PropertyValuesHolder[] propertyValuesHolderArrF7l84 = c3915yMo14488k.f7l8("paddingEnd");
                propertyValuesHolderArrF7l84[0].setFloatValues(C0683f.bf2(ExtendedFloatingActionButton.this), this.f67585f7l8.zy());
                c3915yMo14488k.x2("paddingEnd", propertyValuesHolderArrF7l84);
            }
            if (c3915yMo14488k.m13994p("labelOpacity")) {
                PropertyValuesHolder[] propertyValuesHolderArrF7l85 = c3915yMo14488k.f7l8("labelOpacity");
                boolean z2 = this.f24412y;
                propertyValuesHolderArrF7l85[0].setFloatValues(z2 ? 0.0f : 1.0f, z2 ? 1.0f : 0.0f);
                c3915yMo14488k.x2("labelOpacity", propertyValuesHolderArrF7l85);
            }
            return super.kja0(c3915yMo14488k);
        }

        @Override // com.google.android.material.floatingactionbutton.toq, com.google.android.material.floatingactionbutton.InterfaceC4029g
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            ExtendedFloatingActionButton.this.bg = this.f24412y;
            ExtendedFloatingActionButton.this.az = true;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(true);
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
        /* JADX INFO: renamed from: q */
        public boolean mo14466q() {
            return this.f24412y == ExtendedFloatingActionButton.this.bg || ExtendedFloatingActionButton.this.getIcon() == null || TextUtils.isEmpty(ExtendedFloatingActionButton.this.getText());
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
        public void qrj(@dd AbstractC4022p abstractC4022p) {
            if (abstractC4022p == null) {
                return;
            }
            if (this.f24412y) {
                abstractC4022p.m14469k(ExtendedFloatingActionButton.this);
            } else {
                abstractC4022p.m14470q(ExtendedFloatingActionButton.this);
            }
        }

        @Override // com.google.android.material.floatingactionbutton.toq, com.google.android.material.floatingactionbutton.InterfaceC4029g
        /* JADX INFO: renamed from: s */
        public void mo14467s() {
            super.mo14467s();
            ExtendedFloatingActionButton.this.az = false;
            ExtendedFloatingActionButton.this.setHorizontallyScrolling(false);
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f67585f7l8.mo14465q().width;
            layoutParams.height = this.f67585f7l8.mo14465q().height;
        }

        @Override // com.google.android.material.floatingactionbutton.InterfaceC4029g
        public void toq() {
            ExtendedFloatingActionButton.this.bg = this.f24412y;
            ViewGroup.LayoutParams layoutParams = ExtendedFloatingActionButton.this.getLayoutParams();
            if (layoutParams == null) {
                return;
            }
            layoutParams.width = this.f67585f7l8.mo14465q().width;
            layoutParams.height = this.f67585f7l8.mo14465q().height;
            C0683f.u38j(ExtendedFloatingActionButton.this, this.f67585f7l8.mo14464n(), ExtendedFloatingActionButton.this.getPaddingTop(), this.f67585f7l8.zy(), ExtendedFloatingActionButton.this.getPaddingBottom());
            ExtendedFloatingActionButton.this.requestLayout();
        }
    }

    class zy extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        private boolean f24414k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ AbstractC4022p f24415n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ InterfaceC4029g f24416q;

        zy(InterfaceC4029g interfaceC4029g, AbstractC4022p abstractC4022p) {
            this.f24416q = interfaceC4029g;
            this.f24415n = abstractC4022p;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f24414k = true;
            this.f24416q.mo14472g();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f24416q.mo14467s();
            if (this.f24414k) {
                return;
            }
            this.f24416q.qrj(this.f24415n);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f24416q.onAnimationStart(animator);
            this.f24414k = false;
        }
    }

    public ExtendedFloatingActionButton(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d2ok(@lvui InterfaceC4029g interfaceC4029g, @dd AbstractC4022p abstractC4022p) {
        if (interfaceC4029g.mo14466q()) {
            return;
        }
        if (!m14452l()) {
            interfaceC4029g.toq();
            interfaceC4029g.qrj(abstractC4022p);
            return;
        }
        measure(0, 0);
        AnimatorSet animatorSetLd6 = interfaceC4029g.ld6();
        animatorSetLd6.addListener(new zy(interfaceC4029g, abstractC4022p));
        Iterator<Animator.AnimatorListener> it = interfaceC4029g.x2().iterator();
        while (it.hasNext()) {
            animatorSetLd6.addListener(it.next());
        }
        animatorSetLd6.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean eqxt() {
        return getVisibility() != 0 ? this.f24403w == 2 : this.f24403w != 1;
    }

    /* JADX INFO: renamed from: l */
    private boolean m14452l() {
        return (C0683f.v0af(this) || (!eqxt() && this.ba)) && !isInEditMode();
    }

    private void ncyb() {
        this.ax = getTextColors();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean oc() {
        return getVisibility() == 0 ? this.f24403w == 1 : this.f24403w != 2;
    }

    public void a9() {
        d2ok(this.bp, null);
    }

    /* JADX INFO: renamed from: c */
    public void m14454c(@lvui AbstractC4022p abstractC4022p) {
        d2ok(this.bb, abstractC4022p);
    }

    public final boolean d3() {
        return this.bg;
    }

    public void dd(@lvui Animator.AnimatorListener animatorListener) {
        this.bv.mo14489n(animatorListener);
    }

    /* JADX INFO: renamed from: f */
    public void m14455f() {
        d2ok(this.bb, null);
    }

    public void fti(@lvui AbstractC4022p abstractC4022p) {
        d2ok(this.bp, abstractC4022p);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.toq
    @lvui
    public CoordinatorLayout.zy<ExtendedFloatingActionButton> getBehavior() {
        return this.as;
    }

    int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    @yz
    int getCollapsedSize() {
        int i2 = this.id;
        return i2 < 0 ? (Math.min(C0683f.i1(this), C0683f.bf2(this)) * 2) + getIconSize() : i2;
    }

    @dd
    public C3915y getExtendMotionSpec() {
        return this.bp.zy();
    }

    @dd
    public C3915y getHideMotionSpec() {
        return this.an.zy();
    }

    @dd
    public C3915y getShowMotionSpec() {
        return this.bv.zy();
    }

    @dd
    public C3915y getShrinkMotionSpec() {
        return this.bb.zy();
    }

    public void gvn7(@lvui AbstractC4022p abstractC4022p) {
        d2ok(this.an, abstractC4022p);
    }

    public void hyr(@lvui AbstractC4022p abstractC4022p) {
        d2ok(this.bv, abstractC4022p);
    }

    public void jk(@lvui Animator.AnimatorListener animatorListener) {
        this.bb.mo14491y(animatorListener);
    }

    public void jp0y() {
        d2ok(this.an, null);
    }

    protected void lrht(@lvui ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
    }

    public void lvui(@lvui Animator.AnimatorListener animatorListener) {
        this.bp.mo14489n(animatorListener);
    }

    public void mcp(@lvui Animator.AnimatorListener animatorListener) {
        this.bv.mo14491y(animatorListener);
    }

    public void n5r1() {
        d2ok(this.bv, null);
    }

    @Override // com.google.android.material.button.MaterialButton, android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.bg && TextUtils.isEmpty(getText()) && getIcon() != null) {
            this.bg = false;
            this.bb.toq();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m14456r(@lvui Animator.AnimatorListener animatorListener) {
        this.an.mo14489n(animatorListener);
    }

    public void setAnimateShowBeforeLayout(boolean z2) {
        this.ba = z2;
    }

    public void setExtendMotionSpec(@dd C3915y c3915y) {
        this.bp.mo14490p(c3915y);
    }

    public void setExtendMotionSpecResource(@zy.toq int i2) {
        setExtendMotionSpec(C3915y.m13992q(getContext(), i2));
    }

    public void setExtended(boolean z2) {
        if (this.bg == z2) {
            return;
        }
        InterfaceC4029g interfaceC4029g = z2 ? this.bp : this.bb;
        if (interfaceC4029g.mo14466q()) {
            return;
        }
        interfaceC4029g.toq();
    }

    public void setHideMotionSpec(@dd C3915y c3915y) {
        this.an.mo14490p(c3915y);
    }

    public void setHideMotionSpecResource(@zy.toq int i2) {
        setHideMotionSpec(C3915y.m13992q(getContext(), i2));
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i2, int i3, int i4, int i5) {
        super.setPadding(i2, i3, i4, i5);
        if (!this.bg || this.az) {
            return;
        }
        this.in = C0683f.i1(this);
        this.bl = C0683f.bf2(this);
    }

    @Override // android.widget.TextView, android.view.View
    public void setPaddingRelative(int i2, int i3, int i4, int i5) {
        super.setPaddingRelative(i2, i3, i4, i5);
        if (!this.bg || this.az) {
            return;
        }
        this.in = i2;
        this.bl = i4;
    }

    public void setShowMotionSpec(@dd C3915y c3915y) {
        this.bv.mo14490p(c3915y);
    }

    public void setShowMotionSpecResource(@zy.toq int i2) {
        setShowMotionSpec(C3915y.m13992q(getContext(), i2));
    }

    public void setShrinkMotionSpec(@dd C3915y c3915y) {
        this.bb.mo14490p(c3915y);
    }

    public void setShrinkMotionSpecResource(@zy.toq int i2) {
        setShrinkMotionSpec(C3915y.m13992q(getContext(), i2));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i2) {
        super.setTextColor(i2);
        ncyb();
    }

    /* JADX INFO: renamed from: t */
    public void m14457t(@lvui Animator.AnimatorListener animatorListener) {
        this.an.mo14491y(animatorListener);
    }

    public void wvg(@lvui Animator.AnimatorListener animatorListener) {
        this.bp.mo14491y(animatorListener);
    }

    public void x9kr(@lvui Animator.AnimatorListener animatorListener) {
        this.bb.mo14489n(animatorListener);
    }

    public ExtendedFloatingActionButton(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.t8fp);
    }

    protected static class ExtendedFloatingActionButtonBehavior<T extends ExtendedFloatingActionButton> extends CoordinatorLayout.zy<T> {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        private static final boolean f67580f7l8 = true;

        /* JADX INFO: renamed from: g */
        private static final boolean f24404g = false;

        /* JADX INFO: renamed from: k */
        private Rect f24405k;

        /* JADX INFO: renamed from: n */
        private boolean f24406n;

        /* JADX INFO: renamed from: q */
        private boolean f24407q;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        private AbstractC4022p f67581toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        private AbstractC4022p f67582zy;

        public ExtendedFloatingActionButtonBehavior() {
            this.f24407q = false;
            this.f24406n = true;
        }

        private static boolean eqxt(@lvui View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.f7l8) {
                return ((CoordinatorLayout.f7l8) layoutParams).m1740g() instanceof BottomSheetBehavior;
            }
            return false;
        }

        /* JADX INFO: renamed from: f */
        private boolean m14458f(@lvui View view, @lvui ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m14459l(view, extendedFloatingActionButton)) {
                return false;
            }
            if (view.getTop() < (extendedFloatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f7l8) extendedFloatingActionButton.getLayoutParams())).topMargin) {
                n5r1(extendedFloatingActionButton);
                return true;
            }
            jp0y(extendedFloatingActionButton);
            return true;
        }

        private boolean hyr(CoordinatorLayout coordinatorLayout, @lvui AppBarLayout appBarLayout, @lvui ExtendedFloatingActionButton extendedFloatingActionButton) {
            if (!m14459l(appBarLayout, extendedFloatingActionButton)) {
                return false;
            }
            if (this.f24405k == null) {
                this.f24405k = new Rect();
            }
            Rect rect = this.f24405k;
            C4052q.m14583k(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                n5r1(extendedFloatingActionButton);
                return true;
            }
            jp0y(extendedFloatingActionButton);
            return true;
        }

        /* JADX INFO: renamed from: l */
        private boolean m14459l(@lvui View view, @lvui ExtendedFloatingActionButton extendedFloatingActionButton) {
            return (this.f24407q || this.f24406n) && ((CoordinatorLayout.f7l8) extendedFloatingActionButton.getLayoutParams()).m1744n() == view.getId();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: d2ok, reason: merged with bridge method [inline-methods] */
        public boolean mo1757s(CoordinatorLayout coordinatorLayout, @lvui ExtendedFloatingActionButton extendedFloatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                hyr(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton);
                return false;
            }
            if (!eqxt(view)) {
                return false;
            }
            m14458f(view, extendedFloatingActionButton);
            return false;
        }

        public boolean d3() {
            return this.f24407q;
        }

        public void dd(boolean z2) {
            this.f24406n = z2;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: gvn7, reason: merged with bridge method [inline-methods] */
        public boolean toq(@lvui CoordinatorLayout coordinatorLayout, @lvui ExtendedFloatingActionButton extendedFloatingActionButton, @lvui Rect rect) {
            return super.toq(coordinatorLayout, extendedFloatingActionButton, rect);
        }

        protected void jp0y(@lvui ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z2 = this.f24406n;
            extendedFloatingActionButton.d2ok(z2 ? extendedFloatingActionButton.bp : extendedFloatingActionButton.bv, z2 ? this.f67582zy : this.f67581toq);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: lvui, reason: merged with bridge method [inline-methods] */
        public boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui ExtendedFloatingActionButton extendedFloatingActionButton, int i2) {
            List<View> listM1736i = coordinatorLayout.m1736i(extendedFloatingActionButton);
            int size = listM1736i.size();
            for (int i3 = 0; i3 < size; i3++) {
                View view = listM1736i.get(i3);
                if (!(view instanceof AppBarLayout)) {
                    if (eqxt(view) && m14458f(view, extendedFloatingActionButton)) {
                        break;
                    }
                } else {
                    if (hyr(coordinatorLayout, (AppBarLayout) view, extendedFloatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.m1738r(extendedFloatingActionButton, i2);
            return true;
        }

        protected void n5r1(@lvui ExtendedFloatingActionButton extendedFloatingActionButton) {
            boolean z2 = this.f24406n;
            extendedFloatingActionButton.d2ok(z2 ? extendedFloatingActionButton.bb : extendedFloatingActionButton.an, z2 ? this.f67582zy : this.f67581toq);
        }

        @yz
        void ncyb(@dd AbstractC4022p abstractC4022p) {
            this.f67582zy = abstractC4022p;
        }

        public boolean oc() {
            return this.f24406n;
        }

        /* JADX INFO: renamed from: r */
        public void m14460r(boolean z2) {
            this.f24407q = z2;
        }

        @yz
        void x9kr(@dd AbstractC4022p abstractC4022p) {
            this.f67581toq = abstractC4022p;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: y */
        public void mo1759y(@lvui CoordinatorLayout.f7l8 f7l8Var) {
            if (f7l8Var.f3089y == 0) {
                f7l8Var.f3089y = 80;
            }
        }

        public ExtendedFloatingActionButtonBehavior(@lvui Context context, @dd AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6095k.kja0.zrx);
            this.f24407q = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.g9o6, false);
            this.f24406n = typedArrayObtainStyledAttributes.getBoolean(C6095k.kja0.iy, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ExtendedFloatingActionButton(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = bq;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        this.f24403w = 0;
        C4030k c4030k = new C4030k();
        this.f67579ab = c4030k;
        ld6 ld6Var = new ld6(c4030k);
        this.bv = ld6Var;
        C4024s c4024s = new C4024s(c4030k);
        this.an = c4024s;
        this.bg = true;
        this.az = false;
        this.ba = false;
        Context context2 = getContext();
        this.as = new ExtendedFloatingActionButtonBehavior(context2, attributeSet);
        TypedArray typedArrayM14534p = cdj.m14534p(context2, attributeSet, C6095k.kja0.sval, i2, i3, new int[0]);
        C3915y c3915yZy = C3915y.zy(context2, typedArrayM14534p, C6095k.kja0.d0q9);
        C3915y c3915yZy2 = C3915y.zy(context2, typedArrayM14534p, C6095k.kja0.luud);
        C3915y c3915yZy3 = C3915y.zy(context2, typedArrayM14534p, C6095k.kja0.hli);
        C3915y c3915yZy4 = C3915y.zy(context2, typedArrayM14534p, C6095k.kja0.cub);
        this.id = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.zio, -1);
        this.in = C0683f.i1(this);
        this.bl = C0683f.bf2(this);
        C4030k c4030k2 = new C4030k();
        C4025y c4025y = new C4025y(c4030k2, new C4020k(), true);
        this.bp = c4025y;
        C4025y c4025y2 = new C4025y(c4030k2, new toq(), false);
        this.bb = c4025y2;
        ld6Var.mo14490p(c3915yZy);
        c4024s.mo14490p(c3915yZy2);
        c4025y.mo14490p(c3915yZy3);
        c4025y2.mo14490p(c3915yZy4);
        typedArrayM14534p.recycle();
        setShapeAppearanceModel(kja0.f7l8(context2, attributeSet, i2, i3, kja0.f67832qrj).qrj());
        ncyb();
    }

    @Override // android.widget.TextView
    public void setTextColor(@lvui ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        ncyb();
    }
}
