package com.google.android.material.bottomappbar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0683f;
import androidx.core.view.qrj;
import androidx.core.view.tfm;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.behavior.HideBottomViewOnScrollBehavior;
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.internal.C4058z;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.kja0;
import h4b.C6070k;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import zy.InterfaceC7833l;
import zy.cdj;
import zy.dd;
import zy.eqxt;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
public class BottomAppBar extends Toolbar implements CoordinatorLayout.toq {
    private static final int cw14 = C6095k.n7h.tl;
    public static final int d1cy = 1;
    public static final int ndjo = 0;
    public static final int q7k9 = 1;
    public static final int th6 = 0;
    private static final int xqx = 0;
    private static final long xy8 = 300;
    private final C4108p aj;
    private int ar;

    @dd
    private Integer ay;
    private int bc;
    private final boolean bd;
    private final int be;

    @dd
    private Animator bs;
    private boolean bu;
    private boolean dy;

    @lvui
    com.google.android.material.animation.ld6<FloatingActionButton> hp;

    @dd
    private Animator k0;
    private int k6e;

    @lvui
    AnimatorListenerAdapter mjvl;
    private int s8y;
    private boolean sk1t;
    private int tgs;
    private final boolean tlhn;
    private Behavior vb6;
    private final boolean w97r;
    private int xk5;
    private ArrayList<InterfaceC3944p> yl25;

    @eqxt
    private int zmmu;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.bottomappbar.BottomAppBar.SavedState.1
            @Override // android.os.Parcelable.Creator
            @dd
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @lvui
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@lvui Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @lvui
            /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: n */
        boolean f23949n;

        /* JADX INFO: renamed from: q */
        int f23950q;

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@lvui Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f23950q);
            parcel.writeInt(this.f23949n ? 1 : 0);
        }

        public SavedState(@lvui Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f23950q = parcel.readInt();
            this.f23949n = parcel.readInt() != 0;
        }
    }

    class f7l8 extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: g */
        final /* synthetic */ boolean f23951g;

        /* JADX INFO: renamed from: k */
        public boolean f23952k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ int f23953n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ ActionMenuView f23954q;

        f7l8(ActionMenuView actionMenuView, int i2, boolean z2) {
            this.f23954q = actionMenuView;
            this.f23953n = i2;
            this.f23951g = z2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f23952k = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f23952k) {
                return;
            }
            boolean z2 = BottomAppBar.this.zmmu != 0;
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.etdu(bottomAppBar.zmmu);
            BottomAppBar.this.yqrt(this.f23954q, this.f23953n, this.f23951g, z2);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$g */
    class C3941g extends AnimatorListenerAdapter {
        C3941g() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.vq();
            BottomAppBar.this.sk1t = false;
            BottomAppBar.this.k0 = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.qkj8();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$k */
    class C3942k extends AnimatorListenerAdapter {
        C3942k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (BottomAppBar.this.sk1t) {
                return;
            }
            BottomAppBar bottomAppBar = BottomAppBar.this;
            bottomAppBar.gbni(bottomAppBar.ar, BottomAppBar.this.dy);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface ld6 {
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$n */
    class C3943n extends FloatingActionButton.toq {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f23958k;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$n$k */
        class k extends FloatingActionButton.toq {
            k() {
            }

            @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.toq
            public void toq(FloatingActionButton floatingActionButton) {
                BottomAppBar.this.vq();
            }
        }

        C3943n(int i2) {
            this.f23958k = i2;
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.toq
        /* JADX INFO: renamed from: k */
        public void mo14127k(@lvui FloatingActionButton floatingActionButton) {
            floatingActionButton.setTranslationX(BottomAppBar.this.wo(this.f23958k));
            floatingActionButton.wvg(new k());
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$p */
    interface InterfaceC3944p {
        /* JADX INFO: renamed from: k */
        void m14128k(BottomAppBar bottomAppBar);

        void toq(BottomAppBar bottomAppBar);
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$q */
    class C3945q extends AnimatorListenerAdapter {
        C3945q() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomAppBar.this.vq();
            BottomAppBar.this.bs = null;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.qkj8();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$s */
    class C3946s extends AnimatorListenerAdapter {
        C3946s() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            BottomAppBar.this.mjvl.onAnimationStart(animator);
            FloatingActionButton floatingActionButtonFnq8 = BottomAppBar.this.fnq8();
            if (floatingActionButtonFnq8 != null) {
                floatingActionButtonFnq8.setTranslationX(BottomAppBar.this.getFabTranslationX());
            }
        }
    }

    class toq implements com.google.android.material.animation.ld6<FloatingActionButton> {
        toq() {
        }

        @Override // com.google.android.material.animation.ld6
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public void toq(@lvui FloatingActionButton floatingActionButton) {
            float translationX = floatingActionButton.getTranslationX();
            if (BottomAppBar.this.getTopEdgeTreatment().kja0() != translationX) {
                BottomAppBar.this.getTopEdgeTreatment().zurt(translationX);
                BottomAppBar.this.aj.invalidateSelf();
            }
            float fMax = Math.max(0.0f, -floatingActionButton.getTranslationY());
            if (BottomAppBar.this.getTopEdgeTreatment().m14131g() != fMax) {
                BottomAppBar.this.getTopEdgeTreatment().cdj(fMax);
                BottomAppBar.this.aj.invalidateSelf();
            }
            BottomAppBar.this.aj.ch(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }

        @Override // com.google.android.material.animation.ld6
        /* JADX INFO: renamed from: zy, reason: merged with bridge method [inline-methods] */
        public void mo13981k(@lvui FloatingActionButton floatingActionButton) {
            BottomAppBar.this.aj.ch(floatingActionButton.getVisibility() == 0 ? floatingActionButton.getScaleY() : 0.0f);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface x2 {
    }

    /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$y */
    class RunnableC3947y implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ ActionMenuView f23964k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ boolean f23965n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ int f23966q;

        RunnableC3947y(ActionMenuView actionMenuView, int i2, boolean z2) {
            this.f23964k = actionMenuView;
            this.f23966q = i2;
            this.f23965n = z2;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f23964k.setTranslationX(BottomAppBar.this.tfm(r0, this.f23966q, this.f23965n));
        }
    }

    class zy implements C4058z.n {
        zy() {
        }

        @Override // com.google.android.material.internal.C4058z.n
        @lvui
        /* JADX INFO: renamed from: k */
        public tfm mo14130k(View view, @lvui tfm tfmVar, @lvui C4058z.g gVar) {
            boolean z2;
            if (BottomAppBar.this.bd) {
                BottomAppBar.this.k6e = tfmVar.kja0();
            }
            boolean z3 = false;
            if (BottomAppBar.this.tlhn) {
                z2 = BottomAppBar.this.s8y != tfmVar.m3467h();
                BottomAppBar.this.s8y = tfmVar.m3467h();
            } else {
                z2 = false;
            }
            if (BottomAppBar.this.w97r) {
                boolean z5 = BottomAppBar.this.xk5 != tfmVar.cdj();
                BottomAppBar.this.xk5 = tfmVar.cdj();
                z3 = z5;
            }
            if (z2 || z3) {
                BottomAppBar.this.m14123v();
                BottomAppBar.this.cfr();
                BottomAppBar.this.sok();
            }
            return tfmVar;
        }
    }

    public BottomAppBar(@lvui Context context) {
        this(context, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cfr() {
        getTopEdgeTreatment().zurt(getFabTranslationX());
        View viewQo = qo();
        this.aj.ch((this.dy && d8wk()) ? 1.0f : 0.0f);
        if (viewQo != null) {
            viewQo.setTranslationY(getFabTranslationY());
            viewQo.setTranslationX(getFabTranslationX());
        }
    }

    /* JADX INFO: renamed from: d */
    private void m14115d(int i2, @lvui List<Animator> list) {
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(fnq8(), "translationX", wo(i2));
        objectAnimatorOfFloat.setDuration(300L);
        list.add(objectAnimatorOfFloat);
    }

    private boolean d8wk() {
        FloatingActionButton floatingActionButtonFnq8 = fnq8();
        return floatingActionButtonFnq8 != null && floatingActionButtonFnq8.ki();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @dd
    public FloatingActionButton fnq8() {
        View viewQo = qo();
        if (viewQo instanceof FloatingActionButton) {
            return (FloatingActionButton) viewQo;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void gbni(int i2, boolean z2) {
        if (!C0683f.v0af(this)) {
            this.sk1t = false;
            etdu(this.zmmu);
            return;
        }
        Animator animator = this.k0;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (!d8wk()) {
            i2 = 0;
            z2 = false;
        }
        mu(i2, z2, arrayList);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.k0 = animatorSet;
        animatorSet.addListener(new C3941g());
        this.k0.start();
    }

    @dd
    private ActionMenuView getActionMenuView() {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            View childAt = getChildAt(i2);
            if (childAt instanceof ActionMenuView) {
                return (ActionMenuView) childAt;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getBottomInset() {
        return this.k6e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getFabTranslationX() {
        return wo(this.ar);
    }

    private float getFabTranslationY() {
        return -getTopEdgeTreatment().m14131g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getLeftInset() {
        return this.s8y;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getRightInset() {
        return this.xk5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @lvui
    public C3948k getTopEdgeTreatment() {
        return (C3948k) this.aj.getShapeAppearanceModel().m14822h();
    }

    private void mu(int i2, boolean z2, @lvui List<Animator> list) {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null) {
            return;
        }
        Animator animatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 1.0f);
        if (Math.abs(actionMenuView.getTranslationX() - tfm(actionMenuView, i2, z2)) <= 1.0f) {
            if (actionMenuView.getAlpha() < 1.0f) {
                list.add(animatorOfFloat);
            }
        } else {
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(actionMenuView, "alpha", 0.0f);
            objectAnimatorOfFloat.addListener(new f7l8(actionMenuView, i2, z2));
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.setDuration(150L);
            animatorSet.playSequentially(objectAnimatorOfFloat, animatorOfFloat);
            list.add(animatorSet);
        }
    }

    @dd
    private Drawable py(@dd Drawable drawable) {
        if (drawable == null || this.ay == null) {
            return drawable;
        }
        Drawable drawableKi = androidx.core.graphics.drawable.zy.ki(drawable.mutate());
        androidx.core.graphics.drawable.zy.n7h(drawableKi, this.ay.intValue());
        return drawableKi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void qkj8() {
        ArrayList<InterfaceC3944p> arrayList;
        int i2 = this.tgs;
        this.tgs = i2 + 1;
        if (i2 != 0 || (arrayList = this.yl25) == null) {
            return;
        }
        Iterator<InterfaceC3944p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().toq(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @dd
    public View qo() {
        if (!(getParent() instanceof CoordinatorLayout)) {
            return null;
        }
        for (View view : ((CoordinatorLayout) getParent()).fn3e(this)) {
            if ((view instanceof FloatingActionButton) || (view instanceof ExtendedFloatingActionButton)) {
                return view;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void sok() {
        ActionMenuView actionMenuView = getActionMenuView();
        if (actionMenuView == null || this.k0 != null) {
            return;
        }
        actionMenuView.setAlpha(1.0f);
        if (d8wk()) {
            z4(actionMenuView, this.ar, this.dy);
        } else {
            z4(actionMenuView, 0, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: v */
    public void m14123v() {
        Animator animator = this.k0;
        if (animator != null) {
            animator.cancel();
        }
        Animator animator2 = this.bs;
        if (animator2 != null) {
            animator2.cancel();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void vq() {
        ArrayList<InterfaceC3944p> arrayList;
        int i2 = this.tgs - 1;
        this.tgs = i2;
        if (i2 != 0 || (arrayList = this.yl25) == null) {
            return;
        }
        Iterator<InterfaceC3944p> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().m14128k(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float wo(int i2) {
        boolean zLd6 = C4058z.ld6(this);
        if (i2 == 1) {
            return ((getMeasuredWidth() / 2) - (this.be + (zLd6 ? this.s8y : this.xk5))) * (zLd6 ? -1 : 1);
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void xwq3(@lvui FloatingActionButton floatingActionButton) {
        floatingActionButton.m14477g(this.mjvl);
        floatingActionButton.f7l8(new C3946s());
        floatingActionButton.m14482y(this.hp);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void yqrt(@lvui ActionMenuView actionMenuView, int i2, boolean z2, boolean z3) {
        RunnableC3947y runnableC3947y = new RunnableC3947y(actionMenuView, i2, z2);
        if (z3) {
            actionMenuView.post(runnableC3947y);
        } else {
            runnableC3947y.run();
        }
    }

    private void z4(@lvui ActionMenuView actionMenuView, int i2, boolean z2) {
        yqrt(actionMenuView, i2, z2, false);
    }

    private void zsr0(int i2) {
        if (this.ar == i2 || !C0683f.v0af(this)) {
            return;
        }
        Animator animator = this.bs;
        if (animator != null) {
            animator.cancel();
        }
        ArrayList arrayList = new ArrayList();
        if (this.bc == 1) {
            m14115d(i2, arrayList);
        } else {
            ikck(i2, arrayList);
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(arrayList);
        this.bs = animatorSet;
        animatorSet.addListener(new C3945q());
        this.bs.start();
    }

    void dr(@lvui InterfaceC3944p interfaceC3944p) {
        if (this.yl25 == null) {
            this.yl25 = new ArrayList<>();
        }
        this.yl25.add(interfaceC3944p);
    }

    public void etdu(@eqxt int i2) {
        if (i2 != 0) {
            this.zmmu = 0;
            getMenu().clear();
            mcp(i2);
        }
    }

    public boolean g1() {
        return getBehavior().d3();
    }

    @dd
    public ColorStateList getBackgroundTint() {
        return this.aj.m14860l();
    }

    @cdj
    public float getCradleVerticalOffset() {
        return getTopEdgeTreatment().m14131g();
    }

    public int getFabAlignmentMode() {
        return this.ar;
    }

    public int getFabAnimationMode() {
        return this.bc;
    }

    public float getFabCradleMargin() {
        return getTopEdgeTreatment().m14134s();
    }

    @cdj
    public float getFabCradleRoundedCornerRadius() {
        return getTopEdgeTreatment().qrj();
    }

    public boolean getHideOnScroll() {
        return this.bu;
    }

    public void i9jn() {
        ltg8(true);
    }

    protected void ikck(int i2, List<Animator> list) {
        FloatingActionButton floatingActionButtonFnq8 = fnq8();
        if (floatingActionButtonFnq8 == null || floatingActionButtonFnq8.cdj()) {
            return;
        }
        qkj8();
        floatingActionButtonFnq8.kja0(new C3943n(i2));
    }

    public void ltg8(boolean z2) {
        getBehavior().lvui(this, z2);
    }

    public void m4(boolean z2) {
        getBehavior().dd(this, z2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.ld6.m14841g(this, this.aj);
        if (getParent() instanceof ViewGroup) {
            ((ViewGroup) getParent()).setClipChildren(false);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        if (z2) {
            m14123v();
            cfr();
        }
        sok();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.ar = savedState.f23950q;
        this.dy = savedState.f23949n;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @lvui
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f23950q = this.ar;
        savedState.f23949n = this.dy;
        return savedState;
    }

    public void r8s8() {
        m4(true);
    }

    public void setBackgroundTint(@dd ColorStateList colorStateList) {
        androidx.core.graphics.drawable.zy.kja0(this.aj, colorStateList);
    }

    public void setCradleVerticalOffset(@cdj float f2) {
        if (f2 != getCradleVerticalOffset()) {
            getTopEdgeTreatment().cdj(f2);
            this.aj.invalidateSelf();
            cfr();
        }
    }

    @Override // android.view.View
    public void setElevation(float f2) {
        this.aj.zp(f2);
        getBehavior().eqxt(this, this.aj.eqxt() - this.aj.oc());
    }

    public void setFabAlignmentMode(int i2) {
        setFabAlignmentModeAndReplaceMenu(i2, 0);
    }

    public void setFabAlignmentModeAndReplaceMenu(int i2, @eqxt int i3) {
        this.zmmu = i3;
        this.sk1t = true;
        gbni(i2, this.dy);
        zsr0(i2);
        this.ar = i2;
    }

    public void setFabAnimationMode(int i2) {
        this.bc = i2;
    }

    void setFabCornerSize(@cdj float f2) {
        if (f2 != getTopEdgeTreatment().m14135y()) {
            getTopEdgeTreatment().ki(f2);
            this.aj.invalidateSelf();
        }
    }

    public void setFabCradleMargin(@cdj float f2) {
        if (f2 != getFabCradleMargin()) {
            getTopEdgeTreatment().t8r(f2);
            this.aj.invalidateSelf();
        }
    }

    public void setFabCradleRoundedCornerRadius(@cdj float f2) {
        if (f2 != getFabCradleRoundedCornerRadius()) {
            getTopEdgeTreatment().m14132i(f2);
            this.aj.invalidateSelf();
        }
    }

    public void setHideOnScroll(boolean z2) {
        this.bu = z2;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@dd Drawable drawable) {
        super.setNavigationIcon(py(drawable));
    }

    public void setNavigationIconTint(@zy.x2 int i2) {
        this.ay = Integer.valueOf(i2);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    protected int tfm(@lvui ActionMenuView actionMenuView, int i2, boolean z2) {
        if (i2 != 1 || !z2) {
            return 0;
        }
        boolean zLd6 = C4058z.ld6(this);
        int measuredWidth = zLd6 ? getMeasuredWidth() : 0;
        for (int i3 = 0; i3 < getChildCount(); i3++) {
            View childAt = getChildAt(i3);
            if ((childAt.getLayoutParams() instanceof Toolbar.C0179n) && (((Toolbar.C0179n) childAt.getLayoutParams()).f281k & qrj.f4101q) == 8388611) {
                measuredWidth = zLd6 ? Math.min(measuredWidth, childAt.getLeft()) : Math.max(measuredWidth, childAt.getRight());
            }
        }
        return measuredWidth - ((zLd6 ? actionMenuView.getRight() : actionMenuView.getLeft()) + (zLd6 ? this.xk5 : -this.s8y));
    }

    void v0af(@lvui InterfaceC3944p interfaceC3944p) {
        ArrayList<InterfaceC3944p> arrayList = this.yl25;
        if (arrayList == null) {
            return;
        }
        arrayList.remove(interfaceC3944p);
    }

    boolean w831(@InterfaceC7833l int i2) {
        float f2 = i2;
        if (f2 == getTopEdgeTreatment().n7h()) {
            return false;
        }
        getTopEdgeTreatment().fn3e(f2);
        this.aj.invalidateSelf();
        return true;
    }

    public boolean was() {
        return getBehavior().oc();
    }

    public BottomAppBar(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.f80186gbni);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.toq
    @lvui
    public Behavior getBehavior() {
        if (this.vb6 == null) {
            this.vb6 = new Behavior();
        }
        return this.vb6;
    }

    public static class Behavior extends HideBottomViewOnScrollBehavior<BottomAppBar> {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        private int f67375ld6;

        /* JADX INFO: renamed from: p */
        private WeakReference<BottomAppBar> f23946p;

        /* JADX INFO: renamed from: s */
        @lvui
        private final Rect f23947s;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private final View.OnLayoutChangeListener f67376x2;

        /* JADX INFO: renamed from: com.google.android.material.bottomappbar.BottomAppBar$Behavior$k */
        class ViewOnLayoutChangeListenerC3939k implements View.OnLayoutChangeListener {
            ViewOnLayoutChangeListenerC3939k() {
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                BottomAppBar bottomAppBar = (BottomAppBar) Behavior.this.f23946p.get();
                if (bottomAppBar == null || !(view instanceof FloatingActionButton)) {
                    view.removeOnLayoutChangeListener(this);
                    return;
                }
                FloatingActionButton floatingActionButton = (FloatingActionButton) view;
                floatingActionButton.x2(Behavior.this.f23947s);
                int iHeight = Behavior.this.f23947s.height();
                bottomAppBar.w831(iHeight);
                bottomAppBar.setFabCornerSize(floatingActionButton.getShapeAppearanceModel().ki().mo14816k(new RectF(Behavior.this.f23947s)));
                CoordinatorLayout.f7l8 f7l8Var = (CoordinatorLayout.f7l8) view.getLayoutParams();
                if (Behavior.this.f67375ld6 == 0) {
                    ((ViewGroup.MarginLayoutParams) f7l8Var).bottomMargin = bottomAppBar.getBottomInset() + (bottomAppBar.getResources().getDimensionPixelOffset(C6095k.g.a4ph) - ((floatingActionButton.getMeasuredHeight() - iHeight) / 2));
                    ((ViewGroup.MarginLayoutParams) f7l8Var).leftMargin = bottomAppBar.getLeftInset();
                    ((ViewGroup.MarginLayoutParams) f7l8Var).rightMargin = bottomAppBar.getRightInset();
                    if (C4058z.ld6(floatingActionButton)) {
                        ((ViewGroup.MarginLayoutParams) f7l8Var).leftMargin += bottomAppBar.be;
                    } else {
                        ((ViewGroup.MarginLayoutParams) f7l8Var).rightMargin += bottomAppBar.be;
                    }
                }
            }
        }

        public Behavior() {
            this.f67376x2 = new ViewOnLayoutChangeListenerC3939k();
            this.f23947s = new Rect();
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: hyr, reason: merged with bridge method [inline-methods] */
        public boolean mo1758t(@lvui CoordinatorLayout coordinatorLayout, @lvui BottomAppBar bottomAppBar, @lvui View view, @lvui View view2, int i2, int i3) {
            return bottomAppBar.getHideOnScroll() && super.mo1758t(coordinatorLayout, bottomAppBar, view, view2, i2, i3);
        }

        @Override // com.google.android.material.behavior.HideBottomViewOnScrollBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: n5r1, reason: merged with bridge method [inline-methods] */
        public boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui BottomAppBar bottomAppBar, int i2) {
            this.f23946p = new WeakReference<>(bottomAppBar);
            View viewQo = bottomAppBar.qo();
            if (viewQo != null && !C0683f.v0af(viewQo)) {
                CoordinatorLayout.f7l8 f7l8Var = (CoordinatorLayout.f7l8) viewQo.getLayoutParams();
                f7l8Var.f3087q = 49;
                this.f67375ld6 = ((ViewGroup.MarginLayoutParams) f7l8Var).bottomMargin;
                if (viewQo instanceof FloatingActionButton) {
                    FloatingActionButton floatingActionButton = (FloatingActionButton) viewQo;
                    if (floatingActionButton.getShowMotionSpec() == null) {
                        floatingActionButton.setShowMotionSpecResource(C6095k.toq.f79915fu4);
                    }
                    if (floatingActionButton.getHideMotionSpec() == null) {
                        floatingActionButton.setHideMotionSpecResource(C6095k.toq.f79920ni7);
                    }
                    floatingActionButton.addOnLayoutChangeListener(this.f67376x2);
                    bottomAppBar.xwq3(floatingActionButton);
                }
                bottomAppBar.cfr();
            }
            coordinatorLayout.m1738r(bottomAppBar, i2);
            return super.qrj(coordinatorLayout, bottomAppBar, i2);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f67376x2 = new ViewOnLayoutChangeListenerC3939k();
            this.f23947s = new Rect();
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomAppBar(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = cw14;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        C4108p c4108p = new C4108p();
        this.aj = c4108p;
        this.tgs = 0;
        this.zmmu = 0;
        this.sk1t = false;
        this.dy = true;
        this.mjvl = new C3942k();
        this.hp = new toq();
        Context context2 = getContext();
        TypedArray typedArrayM14534p = com.google.android.material.internal.cdj.m14534p(context2, attributeSet, C6095k.kja0.wh, i2, i3, new int[0]);
        ColorStateList colorStateListM14753k = com.google.android.material.resources.zy.m14753k(context2, typedArrayM14534p, C6095k.kja0.vymi);
        int i4 = C6095k.kja0.a7zh;
        if (typedArrayM14534p.hasValue(i4)) {
            setNavigationIconTint(typedArrayM14534p.getColor(i4, -1));
        }
        int dimensionPixelSize = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.jre, 0);
        float dimensionPixelOffset = typedArrayM14534p.getDimensionPixelOffset(C6095k.kja0.je1q, 0);
        float dimensionPixelOffset2 = typedArrayM14534p.getDimensionPixelOffset(C6095k.kja0.zxa9, 0);
        float dimensionPixelOffset3 = typedArrayM14534p.getDimensionPixelOffset(C6095k.kja0.p6, 0);
        this.ar = typedArrayM14534p.getInt(C6095k.kja0.py7, 0);
        this.bc = typedArrayM14534p.getInt(C6095k.kja0.drpy, 0);
        this.bu = typedArrayM14534p.getBoolean(C6095k.kja0.b3fl, false);
        this.bd = typedArrayM14534p.getBoolean(C6095k.kja0.ma8k, false);
        this.tlhn = typedArrayM14534p.getBoolean(C6095k.kja0.iw, false);
        this.w97r = typedArrayM14534p.getBoolean(C6095k.kja0.wkrb, false);
        typedArrayM14534p.recycle();
        this.be = getResources().getDimensionPixelOffset(C6095k.g.li5y);
        c4108p.setShapeAppearanceModel(kja0.m14819k().jp0y(new C3948k(dimensionPixelOffset, dimensionPixelOffset2, dimensionPixelOffset3)).qrj());
        c4108p.gyi(2);
        c4108p.lv5(Paint.Style.FILL);
        c4108p.m14856e(context2);
        setElevation(dimensionPixelSize);
        androidx.core.graphics.drawable.zy.kja0(c4108p, colorStateListM14753k);
        C0683f.wlev(this, c4108p);
        C4058z.zy(this, attributeSet, i2, i3, new zy());
    }
}
