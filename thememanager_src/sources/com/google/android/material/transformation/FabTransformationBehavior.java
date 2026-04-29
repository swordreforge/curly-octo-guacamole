package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.Property;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.C0683f;
import com.google.android.material.animation.C3910k;
import com.google.android.material.animation.C3911n;
import com.google.android.material.animation.C3912p;
import com.google.android.material.animation.C3913q;
import com.google.android.material.animation.C3914s;
import com.google.android.material.animation.C3915y;
import com.google.android.material.circularreveal.C3976k;
import com.google.android.material.circularreveal.zy;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import ij.C6095k;
import java.util.ArrayList;
import java.util.List;
import lh.C6775k;
import zy.InterfaceC7842s;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {

    /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
    private final RectF f67973f7l8;

    /* JADX INFO: renamed from: g */
    private final Rect f25412g;

    /* JADX INFO: renamed from: ld6, reason: collision with root package name */
    private float f67974ld6;

    /* JADX INFO: renamed from: p */
    private float f25413p;

    /* JADX INFO: renamed from: s */
    private final int[] f25414s;

    /* JADX INFO: renamed from: y */
    private final RectF f25415y;

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$k */
    class C4185k extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ boolean f25417k;

        /* JADX INFO: renamed from: n */
        final /* synthetic */ View f25418n;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ View f25419q;

        C4185k(boolean z2, View view, View view2) {
            this.f25417k = z2;
            this.f25419q = view;
            this.f25418n = view2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f25417k) {
                return;
            }
            this.f25419q.setVisibility(4);
            this.f25418n.setAlpha(1.0f);
            this.f25418n.setVisibility(0);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            if (this.f25417k) {
                this.f25419q.setVisibility(0);
                this.f25418n.setAlpha(0.0f);
                this.f25418n.setVisibility(4);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$n */
    protected static class C4186n {

        /* JADX INFO: renamed from: k */
        @dd
        public C3915y f25420k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        public C3912p f67975toq;

        protected C4186n() {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.transformation.FabTransformationBehavior$q */
    class C4187q extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.google.android.material.circularreveal.zy f25421k;

        C4187q(com.google.android.material.circularreveal.zy zyVar) {
            this.f25421k = zyVar;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            zy.C3979n revealInfo = this.f25421k.getRevealInfo();
            revealInfo.f67484zy = Float.MAX_VALUE;
            this.f25421k.setRevealInfo(revealInfo);
        }
    }

    class toq implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ View f25423k;

        toq(View view) {
            this.f25423k = view;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f25423k.invalidate();
        }
    }

    class zy extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ com.google.android.material.circularreveal.zy f25425k;

        /* JADX INFO: renamed from: q */
        final /* synthetic */ Drawable f25427q;

        zy(com.google.android.material.circularreveal.zy zyVar, Drawable drawable) {
            this.f25425k = zyVar;
            this.f25427q = drawable;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f25425k.setCircularRevealOverlayDrawable(null);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f25425k.setCircularRevealOverlayDrawable(this.f25427q);
        }
    }

    public FabTransformationBehavior() {
        this.f25412g = new Rect();
        this.f67973f7l8 = new RectF();
        this.f25415y = new RectF();
        this.f25414s = new int[2];
    }

    @dd
    /* JADX INFO: renamed from: b */
    private ViewGroup m15151b(View view) {
        if (view instanceof ViewGroup) {
            return (ViewGroup) view;
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    private float m15152c(@lvui C4186n c4186n, @lvui C3914s c3914s, float f2, float f3) {
        long jZy = c3914s.zy();
        long jM13987q = c3914s.m13987q();
        C3914s c3914sM13996y = c4186n.f25420k.m13996y("expansion");
        return C3910k.m13980k(f2, f3, c3914s.m13986n().getInterpolation((((c3914sM13996y.zy() + c3914sM13996y.m13987q()) + 17) - jZy) / jM13987q));
    }

    private void dd(@lvui View view, @lvui C4186n c4186n, @lvui C3914s c3914s, @lvui C3914s c3914s2, float f2, float f3, float f4, float f5, @lvui RectF rectF) {
        float fM15152c = m15152c(c4186n, c3914s, f2, f4);
        float fM15152c2 = m15152c(c4186n, c3914s2, f3, f5);
        Rect rect = this.f25412g;
        view.getWindowVisibleDisplayFrame(rect);
        RectF rectF2 = this.f67973f7l8;
        rectF2.set(rect);
        RectF rectF3 = this.f25415y;
        lrht(view, rectF3);
        rectF3.offset(fM15152c, fM15152c2);
        rectF3.intersect(rectF2);
        rectF.set(rectF3);
    }

    /* JADX INFO: renamed from: e */
    private void m15153e(@lvui View view, @lvui View view2, boolean z2, @lvui C4186n c4186n, @lvui List<Animator> list) {
        float fHyr = hyr(view, view2, c4186n.f67975toq);
        float fM15154f = m15154f(view, view2, c4186n.f67975toq);
        Pair<C3914s, C3914s> pairNcyb = ncyb(fHyr, fM15154f, z2, c4186n);
        C3914s c3914s = (C3914s) pairNcyb.first;
        C3914s c3914s2 = (C3914s) pairNcyb.second;
        Property property = View.TRANSLATION_X;
        float[] fArr = new float[1];
        if (!z2) {
            fHyr = this.f25413p;
        }
        fArr[0] = fHyr;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(view, (Property<View, Float>) property, fArr);
        Property property2 = View.TRANSLATION_Y;
        float[] fArr2 = new float[1];
        if (!z2) {
            fM15154f = this.f67974ld6;
        }
        fArr2[0] = fM15154f;
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) property2, fArr2);
        c3914s.m13985k(objectAnimatorOfFloat);
        c3914s2.m13985k(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    private void ek5k(@lvui View view, @lvui View view2, boolean z2, boolean z3, @lvui C4186n c4186n, @lvui List<Animator> list, List<Animator.AnimatorListener> list2, @lvui RectF rectF) {
        ObjectAnimator objectAnimatorOfFloat;
        ObjectAnimator objectAnimatorOfFloat2;
        float fHyr = hyr(view, view2, c4186n.f67975toq);
        float fM15154f = m15154f(view, view2, c4186n.f67975toq);
        Pair<C3914s, C3914s> pairNcyb = ncyb(fHyr, fM15154f, z2, c4186n);
        C3914s c3914s = (C3914s) pairNcyb.first;
        C3914s c3914s2 = (C3914s) pairNcyb.second;
        if (z2) {
            if (!z3) {
                view2.setTranslationX(-fHyr);
                view2.setTranslationY(-fM15154f);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, 0.0f);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, 0.0f);
            dd(view2, c4186n, c3914s, c3914s2, -fHyr, -fM15154f, 0.0f, 0.0f, rectF);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_X, -fHyr);
            objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Y, -fM15154f);
        }
        c3914s.m13985k(objectAnimatorOfFloat);
        c3914s2.m13985k(objectAnimatorOfFloat2);
        list.add(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat2);
    }

    /* JADX INFO: renamed from: f */
    private float m15154f(@lvui View view, @lvui View view2, @lvui C3912p c3912p) {
        float fCenterY;
        float fCenterY2;
        float f2;
        RectF rectF = this.f67973f7l8;
        RectF rectF2 = this.f25415y;
        x9kr(view, rectF);
        lrht(view2, rectF2);
        int i2 = c3912p.f23775k & 112;
        if (i2 == 16) {
            fCenterY = rectF2.centerY();
            fCenterY2 = rectF.centerY();
        } else if (i2 == 48) {
            fCenterY = rectF2.top;
            fCenterY2 = rectF.top;
        } else {
            if (i2 != 80) {
                f2 = 0.0f;
                return f2 + c3912p.f67316zy;
            }
            fCenterY = rectF2.bottom;
            fCenterY2 = rectF.bottom;
        }
        f2 = fCenterY - fCenterY2;
        return f2 + c3912p.f67316zy;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void hb(@lvui View view, View view2, boolean z2, boolean z3, @lvui C4186n c4186n, float f2, float f3, @lvui List<Animator> list, @lvui List<Animator.AnimatorListener> list2) {
        Animator animatorM14244k;
        if (view2 instanceof com.google.android.material.circularreveal.zy) {
            com.google.android.material.circularreveal.zy zyVar = (com.google.android.material.circularreveal.zy) view2;
            float fM15156l = m15156l(view, view2, c4186n.f67975toq);
            float fN5r1 = n5r1(view, view2, c4186n.f67975toq);
            ((FloatingActionButton) view).ld6(this.f25412g);
            float fWidth = this.f25412g.width() / 2.0f;
            C3914s c3914sM13996y = c4186n.f25420k.m13996y("expansion");
            if (z2) {
                if (!z3) {
                    zyVar.setRevealInfo(new zy.C3979n(fM15156l, fN5r1, fWidth));
                }
                if (z3) {
                    fWidth = zyVar.getRevealInfo().f67484zy;
                }
                animatorM14244k = C3976k.m14244k(zyVar, fM15156l, fN5r1, C6775k.toq(fM15156l, fN5r1, 0.0f, 0.0f, f2, f3));
                animatorM14244k.addListener(new C4187q(zyVar));
                m15157m(view2, c3914sM13996y.zy(), (int) fM15156l, (int) fN5r1, fWidth, list);
            } else {
                float f4 = zyVar.getRevealInfo().f67484zy;
                Animator animatorM14244k2 = C3976k.m14244k(zyVar, fM15156l, fN5r1, fWidth);
                int i2 = (int) fM15156l;
                int i3 = (int) fN5r1;
                m15157m(view2, c3914sM13996y.zy(), i2, i3, f4, list);
                m15158o(view2, c3914sM13996y.zy(), c3914sM13996y.m13987q(), c4186n.f25420k.m13995s(), i2, i3, fWidth, list);
                animatorM14244k = animatorM14244k2;
            }
            c3914sM13996y.m13985k(animatorM14244k);
            list.add(animatorM14244k);
            list2.add(C3976k.zy(zyVar));
        }
    }

    private float hyr(@lvui View view, @lvui View view2, @lvui C3912p c3912p) {
        float fCenterX;
        float fCenterX2;
        float f2;
        RectF rectF = this.f67973f7l8;
        RectF rectF2 = this.f25415y;
        x9kr(view, rectF);
        lrht(view2, rectF2);
        int i2 = c3912p.f23775k & 7;
        if (i2 == 1) {
            fCenterX = rectF2.centerX();
            fCenterX2 = rectF.centerX();
        } else if (i2 == 3) {
            fCenterX = rectF2.left;
            fCenterX2 = rectF.left;
        } else {
            if (i2 != 5) {
                f2 = 0.0f;
                return f2 + c3912p.f67315toq;
            }
            fCenterX = rectF2.right;
            fCenterX2 = rectF.right;
        }
        f2 = fCenterX - fCenterX2;
        return f2 + c3912p.f67315toq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    private void m15155j(View view, View view2, boolean z2, boolean z3, @lvui C4186n c4186n, @lvui List<Animator> list, @lvui List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if ((view2 instanceof com.google.android.material.circularreveal.zy) && (view instanceof ImageView)) {
            com.google.android.material.circularreveal.zy zyVar = (com.google.android.material.circularreveal.zy) view2;
            Drawable drawable = ((ImageView) view).getDrawable();
            if (drawable == null) {
                return;
            }
            drawable.mutate();
            if (z2) {
                if (!z3) {
                    drawable.setAlpha(255);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C3911n.f67314toq, 0);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(drawable, C3911n.f67314toq, 255);
            }
            objectAnimatorOfInt.addUpdateListener(new toq(view2));
            c4186n.f25420k.m13996y("iconFade").m13985k(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
            list2.add(new zy(zyVar, drawable));
        }
    }

    /* JADX INFO: renamed from: l */
    private float m15156l(@lvui View view, @lvui View view2, @lvui C3912p c3912p) {
        RectF rectF = this.f67973f7l8;
        RectF rectF2 = this.f25415y;
        x9kr(view, rectF);
        lrht(view2, rectF2);
        rectF2.offset(-hyr(view, view2, c3912p), 0.0f);
        return rectF.centerX() - rectF2.left;
    }

    private void lrht(@lvui View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f25414s);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    /* JADX INFO: renamed from: m */
    private void m15157m(View view, long j2, int i2, int i3, float f2, @lvui List<Animator> list) {
        if (j2 > 0) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
            animatorCreateCircularReveal.setStartDelay(0L);
            animatorCreateCircularReveal.setDuration(j2);
            list.add(animatorCreateCircularReveal);
        }
    }

    private float n5r1(@lvui View view, @lvui View view2, @lvui C3912p c3912p) {
        RectF rectF = this.f67973f7l8;
        RectF rectF2 = this.f25415y;
        x9kr(view, rectF);
        lrht(view2, rectF2);
        rectF2.offset(0.0f, -m15154f(view, view2, c3912p));
        return rectF.centerY() - rectF2.top;
    }

    @lvui
    private Pair<C3914s, C3914s> ncyb(float f2, float f3, boolean z2, @lvui C4186n c4186n) {
        C3914s c3914sM13996y;
        C3914s c3914sM13996y2;
        if (f2 == 0.0f || f3 == 0.0f) {
            c3914sM13996y = c4186n.f25420k.m13996y("translationXLinear");
            c3914sM13996y2 = c4186n.f25420k.m13996y("translationYLinear");
        } else if ((!z2 || f3 >= 0.0f) && (z2 || f3 <= 0.0f)) {
            c3914sM13996y = c4186n.f25420k.m13996y("translationXCurveDownwards");
            c3914sM13996y2 = c4186n.f25420k.m13996y("translationYCurveDownwards");
        } else {
            c3914sM13996y = c4186n.f25420k.m13996y("translationXCurveUpwards");
            c3914sM13996y2 = c4186n.f25420k.m13996y("translationYCurveUpwards");
        }
        return new Pair<>(c3914sM13996y, c3914sM13996y2);
    }

    @TargetApi(21)
    private void nn86(View view, @lvui View view2, boolean z2, boolean z3, @lvui C4186n c4186n, @lvui List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfFloat;
        float fM3166l = C0683f.m3166l(view2) - C0683f.m3166l(view);
        if (z2) {
            if (!z3) {
                view2.setTranslationZ(-fM3166l);
            }
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, 0.0f);
        } else {
            objectAnimatorOfFloat = ObjectAnimator.ofFloat(view2, (Property<View, Float>) View.TRANSLATION_Z, -fM3166l);
        }
        c4186n.f25420k.m13996y("elevation").m13985k(objectAnimatorOfFloat);
        list.add(objectAnimatorOfFloat);
    }

    /* JADX INFO: renamed from: o */
    private void m15158o(View view, long j2, long j3, long j4, int i2, int i3, float f2, @lvui List<Animator> list) {
        long j5 = j2 + j3;
        if (j5 < j4) {
            Animator animatorCreateCircularReveal = ViewAnimationUtils.createCircularReveal(view, i2, i3, f2, f2);
            animatorCreateCircularReveal.setStartDelay(j5);
            animatorCreateCircularReveal.setDuration(j4 - j5);
            list.add(animatorCreateCircularReveal);
        }
    }

    @dd
    /* JADX INFO: renamed from: r */
    private ViewGroup m15159r(@lvui View view) {
        View viewFindViewById = view.findViewById(C6095k.y.f79933b7);
        return viewFindViewById != null ? m15151b(viewFindViewById) : ((view instanceof TransformationChildLayout) || (view instanceof TransformationChildCard)) ? m15151b(((ViewGroup) view).getChildAt(0)) : m15151b(view);
    }

    private void uv6(View view, View view2, boolean z2, boolean z3, @lvui C4186n c4186n, @lvui List<Animator> list, List<Animator.AnimatorListener> list2) {
        ViewGroup viewGroupM15159r;
        ObjectAnimator objectAnimatorOfFloat;
        if (view2 instanceof ViewGroup) {
            if (((view2 instanceof com.google.android.material.circularreveal.zy) && com.google.android.material.circularreveal.toq.f67475kja0 == 0) || (viewGroupM15159r = m15159r(view2)) == null) {
                return;
            }
            if (z2) {
                if (!z3) {
                    C3913q.f23776k.set(viewGroupM15159r, Float.valueOf(0.0f));
                }
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM15159r, C3913q.f23776k, 1.0f);
            } else {
                objectAnimatorOfFloat = ObjectAnimator.ofFloat(viewGroupM15159r, C3913q.f23776k, 0.0f);
            }
            c4186n.f25420k.m13996y("contentFade").m13985k(objectAnimatorOfFloat);
            list.add(objectAnimatorOfFloat);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void vyq(@lvui View view, View view2, boolean z2, boolean z3, @lvui C4186n c4186n, @lvui List<Animator> list, List<Animator.AnimatorListener> list2) {
        ObjectAnimator objectAnimatorOfInt;
        if (view2 instanceof com.google.android.material.circularreveal.zy) {
            com.google.android.material.circularreveal.zy zyVar = (com.google.android.material.circularreveal.zy) view2;
            int iYz = yz(view);
            int i2 = 16777215 & iYz;
            if (z2) {
                if (!z3) {
                    zyVar.setCircularRevealScrimColor(iYz);
                }
                objectAnimatorOfInt = ObjectAnimator.ofInt(zyVar, zy.C3980q.f24170k, i2);
            } else {
                objectAnimatorOfInt = ObjectAnimator.ofInt(zyVar, zy.C3980q.f24170k, iYz);
            }
            objectAnimatorOfInt.setEvaluator(com.google.android.material.animation.zy.toq());
            c4186n.f25420k.m13996y("color").m13985k(objectAnimatorOfInt);
            list.add(objectAnimatorOfInt);
        }
    }

    private void x9kr(@lvui View view, @lvui RectF rectF) {
        lrht(view, rectF);
        rectF.offset(this.f25413p, this.f67974ld6);
    }

    private int yz(@lvui View view) {
        ColorStateList colorStateListM3172r = C0683f.m3172r(view);
        if (colorStateListM3172r != null) {
            return colorStateListM3172r.getColorForState(view.getDrawableState(), colorStateListM3172r.getDefaultColor());
        }
        return 0;
    }

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    @InterfaceC7842s
    /* JADX INFO: renamed from: g */
    public boolean mo1751g(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, @lvui View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    @lvui
    protected AnimatorSet lvui(@lvui View view, @lvui View view2, boolean z2, boolean z3) {
        C4186n c4186nY9n = y9n(view2.getContext(), z2);
        if (z2) {
            this.f25413p = view.getTranslationX();
            this.f67974ld6 = view.getTranslationY();
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        nn86(view, view2, z2, z3, c4186nY9n, arrayList, arrayList2);
        RectF rectF = this.f67973f7l8;
        ek5k(view, view2, z2, z3, c4186nY9n, arrayList, arrayList2, rectF);
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        m15153e(view, view2, z2, c4186nY9n, arrayList);
        m15155j(view, view2, z2, z3, c4186nY9n, arrayList, arrayList2);
        hb(view, view2, z2, z3, c4186nY9n, fWidth, fHeight, arrayList, arrayList2);
        vyq(view, view2, z2, z3, c4186nY9n, arrayList, arrayList2);
        uv6(view, view2, z2, z3, c4186nY9n, arrayList, arrayList2);
        AnimatorSet animatorSet = new AnimatorSet();
        com.google.android.material.animation.toq.m13989k(animatorSet, arrayList);
        animatorSet.addListener(new C4185k(z2, view2, view));
        int size = arrayList2.size();
        for (int i2 = 0; i2 < size; i2++) {
            animatorSet.addListener(arrayList2.get(i2));
        }
        return animatorSet;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
    @InterfaceC7842s
    /* JADX INFO: renamed from: y */
    public void mo1759y(@lvui CoordinatorLayout.f7l8 f7l8Var) {
        if (f7l8Var.f3089y == 0) {
            f7l8Var.f3089y = 80;
        }
    }

    protected abstract C4186n y9n(Context context, boolean z2);

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25412g = new Rect();
        this.f67973f7l8 = new RectF();
        this.f25415y = new RectF();
        this.f25414s = new int[2];
    }
}
