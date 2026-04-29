package com.google.android.material.appbar;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ScrollView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.util.C0642s;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.a9;
import androidx.core.view.accessibility.fn3e;
import androidx.core.view.accessibility.ki;
import androidx.core.view.eqxt;
import androidx.core.view.tfm;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.animation.C3910k;
import com.google.android.material.shape.C4108p;
import com.google.android.material.shape.ld6;
import h4b.C6070k;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import ki.C6116k;
import p023g.C6045k;
import zy.InterfaceC7843t;
import zy.cdj;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.x2;
import zy.yz;

/* JADX INFO: loaded from: classes2.dex */
public class AppBarLayout extends LinearLayout implements CoordinatorLayout.toq {

    /* JADX INFO: renamed from: a */
    static final int f23782a = 1;

    /* JADX INFO: renamed from: b */
    static final int f23783b = 0;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    static final int f67321bo = 8;

    /* JADX INFO: renamed from: d */
    private static final int f23784d = -1;

    /* JADX INFO: renamed from: u */
    static final int f23785u = 4;

    /* JADX INFO: renamed from: v */
    private static final int f23786v = C6095k.n7h.ht;

    /* JADX INFO: renamed from: x */
    static final int f23787x = 2;

    /* JADX INFO: renamed from: c */
    @dd
    private ValueAnimator f23788c;

    /* JADX INFO: renamed from: e */
    private final List<f7l8> f23789e;

    /* JADX INFO: renamed from: f */
    @dd
    private WeakReference<View> f23790f;

    /* JADX INFO: renamed from: g */
    private int f23791g;

    /* JADX INFO: renamed from: h */
    private List<zy> f23792h;

    /* JADX INFO: renamed from: i */
    private boolean f23793i;

    /* JADX INFO: renamed from: j */
    private int[] f23794j;

    /* JADX INFO: renamed from: k */
    private int f23795k;

    /* JADX INFO: renamed from: l */
    @InterfaceC7843t
    private int f23796l;

    /* JADX INFO: renamed from: m */
    private Behavior f23797m;

    /* JADX INFO: renamed from: n */
    private int f23798n;

    /* JADX INFO: renamed from: o */
    @dd
    private Drawable f23799o;

    /* JADX INFO: renamed from: p */
    @dd
    private tfm f23800p;

    /* JADX INFO: renamed from: q */
    private int f23801q;

    /* JADX INFO: renamed from: r */
    private boolean f23802r;

    /* JADX INFO: renamed from: s */
    private int f23803s;

    /* JADX INFO: renamed from: t */
    private boolean f23804t;

    /* JADX INFO: renamed from: y */
    private boolean f23805y;

    /* JADX INFO: renamed from: z */
    private boolean f23806z;

    protected static class BaseBehavior<T extends AppBarLayout> extends AbstractC3929k<T> {

        /* JADX INFO: renamed from: t8r, reason: collision with root package name */
        private static final int f67322t8r = 600;

        /* JADX INFO: renamed from: cdj, reason: collision with root package name */
        private AbstractC3918n f67323cdj;

        /* JADX INFO: renamed from: h */
        @dd
        private WeakReference<View> f23807h;

        /* JADX INFO: renamed from: ki, reason: collision with root package name */
        private boolean f67324ki;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private SavedState f67325kja0;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private ValueAnimator f67326n7h;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        private int f67327qrj;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        private int f67328x2;

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$k */
        class C3917k implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ CoordinatorLayout f23813k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ AppBarLayout f23815q;

            C3917k(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout) {
                this.f23813k = coordinatorLayout;
                this.f23815q = appBarLayout;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
                BaseBehavior.this.uv6(this.f23813k, this.f23815q, ((Integer) valueAnimator.getAnimatedValue()).intValue());
            }
        }

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$n */
        public static abstract class AbstractC3918n<T extends AppBarLayout> {
            /* JADX INFO: renamed from: k */
            public abstract boolean m14022k(@lvui T t2);
        }

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$BaseBehavior$q */
        class C3919q implements fn3e {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ AppBarLayout f23816k;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ boolean f67329toq;

            C3919q(AppBarLayout appBarLayout, boolean z2) {
                this.f23816k = appBarLayout;
                this.f67329toq = z2;
            }

            @Override // androidx.core.view.accessibility.fn3e
            public boolean perform(@lvui View view, @dd fn3e.AbstractC0648k abstractC0648k) {
                this.f23816k.setExpanded(this.f67329toq);
                return true;
            }
        }

        class toq extends C0701k {
            toq() {
            }

            @Override // androidx.core.view.C0701k
            public void onInitializeAccessibilityNodeInfo(View view, @lvui ki kiVar) {
                super.onInitializeAccessibilityNodeInfo(view, kiVar);
                kiVar.lh(BaseBehavior.this.f67324ki);
                kiVar.sok(ScrollView.class.getName());
            }
        }

        class zy implements fn3e {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ CoordinatorLayout f23818k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ int f23820q;

            /* JADX INFO: renamed from: toq, reason: collision with root package name */
            final /* synthetic */ AppBarLayout f67331toq;

            /* JADX INFO: renamed from: zy, reason: collision with root package name */
            final /* synthetic */ View f67332zy;

            zy(CoordinatorLayout coordinatorLayout, AppBarLayout appBarLayout, View view, int i2) {
                this.f23818k = coordinatorLayout;
                this.f67331toq = appBarLayout;
                this.f67332zy = view;
                this.f23820q = i2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference fix 'apply assigned field type' failed
            java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
            	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
            	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
            	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
            	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
             */
            @Override // androidx.core.view.accessibility.fn3e
            public boolean perform(@lvui View view, @dd fn3e.AbstractC0648k abstractC0648k) {
                BaseBehavior.this.ki(this.f23818k, this.f67331toq, this.f67332zy, 0, this.f23820q, new int[]{0, 0}, 1);
                return true;
            }
        }

        public BaseBehavior() {
        }

        /* JADX INFO: renamed from: a */
        private int m14009a(@lvui T t2, int i2) {
            int childCount = t2.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = t2.getChildAt(i3);
                int top = childAt.getTop();
                int bottom = childAt.getBottom();
                C3921g c3921g = (C3921g) childAt.getLayoutParams();
                if (m14010b(c3921g.zy(), 32)) {
                    top -= ((LinearLayout.LayoutParams) c3921g).topMargin;
                    bottom += ((LinearLayout.LayoutParams) c3921g).bottomMargin;
                }
                int i4 = -i2;
                if (top <= i4 && bottom >= i4) {
                    return i3;
                }
            }
            return -1;
        }

        @dd
        private static View a98o(@lvui AppBarLayout appBarLayout, int i2) {
            int iAbs = Math.abs(i2);
            int childCount = appBarLayout.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = appBarLayout.getChildAt(i3);
                if (iAbs >= childAt.getTop() && iAbs <= childAt.getBottom()) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: b */
        private static boolean m14010b(int i2, int i3) {
            return (i2 & i3) == i3;
        }

        private boolean bf2(AppBarLayout appBarLayout) {
            int childCount = appBarLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (((C3921g) appBarLayout.getChildAt(i2).getLayoutParams()).f23827k != 0) {
                    return true;
                }
            }
            return false;
        }

        private int ek5k(int i2, int i3, int i4) {
            return i2 < (i3 + i4) / 2 ? i3 : i4;
        }

        private void fnq8(CoordinatorLayout coordinatorLayout, @lvui T t2) {
            int topInset = t2.getTopInset() + t2.getPaddingTop();
            int iMo14017f = mo14017f() - topInset;
            int iM14009a = m14009a(t2, iMo14017f);
            if (iM14009a >= 0) {
                View childAt = t2.getChildAt(iM14009a);
                C3921g c3921g = (C3921g) childAt.getLayoutParams();
                int iZy = c3921g.zy();
                if ((iZy & 17) == 17) {
                    int topInset2 = -childAt.getTop();
                    int iM3167m = -childAt.getBottom();
                    if (iM14009a == 0 && C0683f.m3160f(t2) && C0683f.m3160f(childAt)) {
                        topInset2 -= t2.getTopInset();
                    }
                    if (m14010b(iZy, 2)) {
                        iM3167m += C0683f.m3167m(childAt);
                    } else if (m14010b(iZy, 5)) {
                        int iM3167m2 = C0683f.m3167m(childAt) + iM3167m;
                        if (iMo14017f < iM3167m2) {
                            topInset2 = iM3167m2;
                        } else {
                            iM3167m = iM3167m2;
                        }
                    }
                    if (m14010b(iZy, 32)) {
                        topInset2 += ((LinearLayout.LayoutParams) c3921g).topMargin;
                        iM3167m -= ((LinearLayout.LayoutParams) c3921g).bottomMargin;
                    }
                    m14014o(coordinatorLayout, t2, C6116k.m22394n(ek5k(iMo14017f, iM3167m, topInset2) + topInset, -t2.getTotalScrollRange(), 0), 0.0f);
                }
            }
        }

        private boolean hb(CoordinatorLayout coordinatorLayout, @lvui T t2, @lvui View view) {
            boolean z2 = false;
            if (mo14017f() != (-t2.getTotalScrollRange())) {
                m14012j(coordinatorLayout, t2, ki.C0656k.f50709ki, false);
                z2 = true;
            }
            if (mo14017f() != 0) {
                if (!view.canScrollVertically(-1)) {
                    m14012j(coordinatorLayout, t2, ki.C0656k.f50720t8r, true);
                    return true;
                }
                int i2 = -t2.getDownNestedPreScrollRange();
                if (i2 != 0) {
                    C0683f.ixz(coordinatorLayout, ki.C0656k.f50720t8r, null, new zy(coordinatorLayout, t2, view, i2));
                    return true;
                }
            }
            return z2;
        }

        @dd
        private View i1(@lvui CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if ((childAt instanceof a9) || (childAt instanceof ListView) || (childAt instanceof ScrollView)) {
                    return childAt;
                }
            }
            return null;
        }

        /* JADX INFO: renamed from: j */
        private void m14012j(CoordinatorLayout coordinatorLayout, @lvui T t2, @lvui ki.C0656k c0656k, boolean z2) {
            C0683f.ixz(coordinatorLayout, c0656k, null, new C3919q(t2, z2));
        }

        /* JADX INFO: renamed from: m */
        private void m14013m(CoordinatorLayout coordinatorLayout, T t2, int i2, int i3) {
            int iMo14017f = mo14017f();
            if (iMo14017f == i2) {
                ValueAnimator valueAnimator = this.f67326n7h;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    return;
                }
                this.f67326n7h.cancel();
                return;
            }
            ValueAnimator valueAnimator2 = this.f67326n7h;
            if (valueAnimator2 == null) {
                ValueAnimator valueAnimator3 = new ValueAnimator();
                this.f67326n7h = valueAnimator3;
                valueAnimator3.setInterpolator(C3910k.f23772n);
                this.f67326n7h.addUpdateListener(new C3917k(coordinatorLayout, t2));
            } else {
                valueAnimator2.cancel();
            }
            this.f67326n7h.setDuration(Math.min(i3, 600));
            this.f67326n7h.setIntValues(iMo14017f, i2);
            this.f67326n7h.start();
        }

        private int nmn5(@lvui T t2, int i2) {
            int iAbs = Math.abs(i2);
            int childCount = t2.getChildCount();
            int topInset = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= childCount) {
                    break;
                }
                View childAt = t2.getChildAt(i3);
                C3921g c3921g = (C3921g) childAt.getLayoutParams();
                Interpolator interpolatorM14030q = c3921g.m14030q();
                if (iAbs < childAt.getTop() || iAbs > childAt.getBottom()) {
                    i3++;
                } else if (interpolatorM14030q != null) {
                    int iZy = c3921g.zy();
                    if ((iZy & 1) != 0) {
                        topInset = 0 + childAt.getHeight() + ((LinearLayout.LayoutParams) c3921g).topMargin + ((LinearLayout.LayoutParams) c3921g).bottomMargin;
                        if ((iZy & 2) != 0) {
                            topInset -= C0683f.m3167m(childAt);
                        }
                    }
                    if (C0683f.m3160f(childAt)) {
                        topInset -= t2.getTopInset();
                    }
                    if (topInset > 0) {
                        float f2 = topInset;
                        return Integer.signum(i2) * (childAt.getTop() + Math.round(f2 * interpolatorM14030q.getInterpolation((iAbs - childAt.getTop()) / f2)));
                    }
                }
            }
            return i2;
        }

        /* JADX INFO: renamed from: o */
        private void m14014o(CoordinatorLayout coordinatorLayout, @lvui T t2, int i2, float f2) {
            int iAbs = Math.abs(mo14017f() - i2);
            float fAbs = Math.abs(f2);
            m14013m(coordinatorLayout, t2, i2, fAbs > 0.0f ? Math.round((iAbs / fAbs) * 1000.0f) * 3 : (int) (((iAbs / t2.getHeight()) + 1.0f) * 150.0f));
        }

        private boolean qkj8(@lvui CoordinatorLayout coordinatorLayout, @lvui T t2) {
            List<View> listFn3e = coordinatorLayout.fn3e(t2);
            int size = listFn3e.size();
            for (int i2 = 0; i2 < size; i2++) {
                CoordinatorLayout.zy zyVarM1740g = ((CoordinatorLayout.f7l8) listFn3e.get(i2).getLayoutParams()).m1740g();
                if (zyVarM1740g instanceof ScrollingViewBehavior) {
                    return ((ScrollingViewBehavior) zyVarM1740g).n5r1() != 0;
                }
            }
            return false;
        }

        private void qo(CoordinatorLayout coordinatorLayout, @lvui T t2) {
            View viewZp;
            C0683f.yl(coordinatorLayout, ki.C0656k.f50709ki.toq());
            C0683f.yl(coordinatorLayout, ki.C0656k.f50720t8r.toq());
            if (t2.getTotalScrollRange() == 0 || (viewZp = zp(coordinatorLayout)) == null || !bf2(t2)) {
                return;
            }
            if (!C0683f.fnq8(coordinatorLayout)) {
                C0683f.zwy(coordinatorLayout, new toq());
            }
            this.f67324ki = hb(coordinatorLayout, t2, viewZp);
        }

        private void tfm(@lvui CoordinatorLayout coordinatorLayout, @lvui T t2, int i2, int i3, boolean z2) {
            View viewA98o = a98o(t2, i2);
            boolean zA9 = false;
            if (viewA98o != null) {
                int iZy = ((C3921g) viewA98o.getLayoutParams()).zy();
                if ((iZy & 1) != 0) {
                    int iM3167m = C0683f.m3167m(viewA98o);
                    if (i3 <= 0 || (iZy & 12) == 0 ? !((iZy & 2) == 0 || (-i2) < (viewA98o.getBottom() - iM3167m) - t2.getTopInset()) : (-i2) >= (viewA98o.getBottom() - iM3167m) - t2.getTopInset()) {
                        zA9 = true;
                    }
                }
            }
            if (t2.m14001h()) {
                zA9 = t2.a9(i1(coordinatorLayout));
            }
            boolean zM14007t = t2.m14007t(zA9);
            if (z2 || (zM14007t && qkj8(coordinatorLayout, t2))) {
                t2.jumpDrawablesToCurrentState();
            }
        }

        private boolean y9n(@lvui CoordinatorLayout coordinatorLayout, @lvui T t2, @lvui View view) {
            return t2.n7h() && coordinatorLayout.getHeight() - view.getHeight() <= t2.getHeight();
        }

        @dd
        private View zp(CoordinatorLayout coordinatorLayout) {
            int childCount = coordinatorLayout.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = coordinatorLayout.getChildAt(i2);
                if (((CoordinatorLayout.f7l8) childAt.getLayoutParams()).m1740g() instanceof ScrollingViewBehavior) {
                    return childAt;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: bo, reason: merged with bridge method [inline-methods] */
        public boolean n7h(@lvui CoordinatorLayout coordinatorLayout, @lvui T t2, int i2, int i3, int i4, int i5) {
            if (((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.f7l8) t2.getLayoutParams())).height != -2) {
                return super.n7h(coordinatorLayout, t2, i2, i3, i4, i5);
            }
            coordinatorLayout.dd(t2, i2, i3, View.MeasureSpec.makeMeasureSpec(0, 0), i5);
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: c8jq, reason: merged with bridge method [inline-methods] */
        public void fn3e(CoordinatorLayout coordinatorLayout, @lvui T t2, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            if (i5 < 0) {
                iArr[1] = lrht(coordinatorLayout, t2, i5, -t2.getDownNestedScrollRange(), 0);
            }
            if (i5 == 0) {
                qo(coordinatorLayout, t2);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3929k
        /* JADX INFO: renamed from: ch, reason: merged with bridge method [inline-methods] */
        public int hyr(@lvui T t2) {
            return t2.getTotalScrollRange();
        }

        @dd
        /* JADX INFO: renamed from: d */
        SavedState m14016d(@dd Parcelable parcelable, @lvui T t2) {
            int iGvn7 = gvn7();
            int childCount = t2.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = t2.getChildAt(i2);
                int bottom = childAt.getBottom() + iGvn7;
                if (childAt.getTop() + iGvn7 <= 0 && bottom >= 0) {
                    if (parcelable == null) {
                        parcelable = AbsSavedState.f4331k;
                    }
                    SavedState savedState = new SavedState(parcelable);
                    boolean z2 = iGvn7 == 0;
                    savedState.f23809n = z2;
                    savedState.f23810q = !z2 && (-iGvn7) >= t2.getTotalScrollRange();
                    savedState.f23808g = i2;
                    savedState.f23811s = bottom == C0683f.m3167m(childAt) + t2.getTopInset();
                    savedState.f23812y = bottom / childAt.getHeight();
                    return savedState;
                }
            }
            return null;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: dr, reason: merged with bridge method [inline-methods] */
        public Parcelable o1t(@lvui CoordinatorLayout coordinatorLayout, @lvui T t2) {
            Parcelable parcelableO1t = super.o1t(coordinatorLayout, t2);
            SavedState savedStateM14016d = m14016d(parcelableO1t, t2);
            return savedStateM14016d == null ? parcelableO1t : savedStateM14016d;
        }

        @Override // com.google.android.material.appbar.AbstractC3929k
        /* JADX INFO: renamed from: f */
        int mo14017f() {
            return gvn7() + this.f67328x2;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: gyi, reason: merged with bridge method [inline-methods] */
        public void mo1760z(@lvui CoordinatorLayout coordinatorLayout, @lvui T t2, Parcelable parcelable) {
            if (parcelable instanceof SavedState) {
                ikck((SavedState) parcelable, true);
                super.mo1760z(coordinatorLayout, t2, this.f67325kja0.getSuperState());
            } else {
                super.mo1760z(coordinatorLayout, t2, parcelable);
                this.f67325kja0 = null;
            }
        }

        void ikck(@dd SavedState savedState, boolean z2) {
            if (this.f67325kja0 == null || z2) {
                this.f67325kja0 = savedState;
            }
        }

        @yz
        boolean lv5() {
            ValueAnimator valueAnimator = this.f67326n7h;
            return valueAnimator != null && valueAnimator.isRunning();
        }

        public void mu(@dd AbstractC3918n abstractC3918n) {
            this.f67323cdj = abstractC3918n;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3929k
        /* JADX INFO: renamed from: t8iq, reason: merged with bridge method [inline-methods] */
        public void mo14015c(@lvui CoordinatorLayout coordinatorLayout, @lvui T t2) {
            fnq8(coordinatorLayout, t2);
            if (t2.m14001h()) {
                t2.m14007t(t2.a9(i1(coordinatorLayout)));
            }
        }

        @Override // com.google.android.material.appbar.zy, androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui T t2, int i2) {
            boolean zQrj = super.qrj(coordinatorLayout, t2, i2);
            int pendingAction = t2.getPendingAction();
            SavedState savedState = this.f67325kja0;
            if (savedState == null || (pendingAction & 8) != 0) {
                if (pendingAction != 0) {
                    boolean z2 = (pendingAction & 4) != 0;
                    if ((pendingAction & 2) != 0) {
                        int i3 = -t2.getUpNestedPreScrollRange();
                        if (z2) {
                            m14014o(coordinatorLayout, t2, i3, 0.0f);
                        } else {
                            uv6(coordinatorLayout, t2, i3);
                        }
                    } else if ((pendingAction & 1) != 0) {
                        if (z2) {
                            m14014o(coordinatorLayout, t2, 0, 0.0f);
                        } else {
                            uv6(coordinatorLayout, t2, 0);
                        }
                    }
                }
            } else if (savedState.f23810q) {
                uv6(coordinatorLayout, t2, -t2.getTotalScrollRange());
            } else if (savedState.f23809n) {
                uv6(coordinatorLayout, t2, 0);
            } else {
                View childAt = t2.getChildAt(savedState.f23808g);
                uv6(coordinatorLayout, t2, (-childAt.getBottom()) + (this.f67325kja0.f23811s ? C0683f.m3167m(childAt) + t2.getTopInset() : Math.round(childAt.getHeight() * this.f67325kja0.f23812y)));
            }
            t2.ni7();
            this.f67325kja0 = null;
            mo14023r(C6116k.m22394n(gvn7(), -t2.getTotalScrollRange(), 0));
            tfm(coordinatorLayout, t2, gvn7(), 0, true);
            t2.ki(gvn7());
            qo(coordinatorLayout, t2);
            return zQrj;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: v, reason: merged with bridge method [inline-methods] */
        public void jk(CoordinatorLayout coordinatorLayout, @lvui T t2, View view, int i2) {
            if (this.f67327qrj == 0 || i2 == 1) {
                fnq8(coordinatorLayout, t2);
                if (t2.m14001h()) {
                    t2.m14007t(t2.a9(view));
                }
            }
            this.f23807h = new WeakReference<>(view);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3929k
        /* JADX INFO: renamed from: vq, reason: merged with bridge method [inline-methods] */
        public int vyq(@lvui CoordinatorLayout coordinatorLayout, @lvui T t2, int i2, int i3, int i4) {
            int iMo14017f = mo14017f();
            int i5 = 0;
            if (i3 == 0 || iMo14017f < i3 || iMo14017f > i4) {
                this.f67328x2 = 0;
            } else {
                int iM22394n = C6116k.m22394n(i2, i3, i4);
                if (iMo14017f != iM22394n) {
                    int iNmn5 = t2.x2() ? nmn5(t2, iM22394n) : iM22394n;
                    boolean zMo14023r = mo14023r(iNmn5);
                    int i6 = iMo14017f - iM22394n;
                    this.f67328x2 = iM22394n - iNmn5;
                    if (zMo14023r) {
                        while (i5 < t2.getChildCount()) {
                            C3921g c3921g = (C3921g) t2.getChildAt(i5).getLayoutParams();
                            AbstractC3924q qVar = c3921g.toq();
                            if (qVar != null && (c3921g.zy() & 1) != 0) {
                                qVar.mo14032k(t2, t2.getChildAt(i5), gvn7());
                            }
                            i5++;
                        }
                    }
                    if (!zMo14023r && t2.x2()) {
                        coordinatorLayout.m1737p(t2);
                    }
                    t2.ki(gvn7());
                    tfm(coordinatorLayout, t2, iM22394n, iM22394n < iMo14017f ? -1 : 1, false);
                    i5 = i6;
                }
            }
            qo(coordinatorLayout, t2);
            return i5;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3929k
        /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
        public int n5r1(@lvui T t2) {
            return -t2.getDownNestedScrollRange();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: xwq3, reason: merged with bridge method [inline-methods] */
        public boolean mo1758t(@lvui CoordinatorLayout coordinatorLayout, @lvui T t2, @lvui View view, View view2, int i2, int i3) {
            ValueAnimator valueAnimator;
            boolean z2 = (i2 & 2) != 0 && (t2.m14001h() || y9n(coordinatorLayout, t2, view));
            if (z2 && (valueAnimator = this.f67326n7h) != null) {
                valueAnimator.cancel();
            }
            this.f23807h = null;
            this.f67327qrj = i3;
            return z2;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: y2, reason: merged with bridge method [inline-methods] */
        public void ki(CoordinatorLayout coordinatorLayout, @lvui T t2, View view, int i2, int i3, int[] iArr, int i4) {
            int i5;
            int downNestedPreScrollRange;
            if (i3 != 0) {
                if (i3 < 0) {
                    i5 = -t2.getTotalScrollRange();
                    downNestedPreScrollRange = t2.getDownNestedPreScrollRange() + i5;
                } else {
                    i5 = -t2.getUpNestedPreScrollRange();
                    downNestedPreScrollRange = 0;
                }
                int i6 = i5;
                int i7 = downNestedPreScrollRange;
                if (i6 != i7) {
                    iArr[1] = lrht(coordinatorLayout, t2, i3, i6, i7);
                }
            }
            if (t2.m14001h()) {
                t2.m14007t(t2.a9(view));
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.AbstractC3929k
        /* JADX INFO: renamed from: yz, reason: merged with bridge method [inline-methods] */
        public boolean x9kr(T t2) {
            AbstractC3918n abstractC3918n = this.f67323cdj;
            if (abstractC3918n != null) {
                return abstractC3918n.m14022k(t2);
            }
            WeakReference<View> weakReference = this.f23807h;
            if (weakReference == null) {
                return true;
            }
            View view = weakReference.get();
            return (view == null || !view.isShown() || view.canScrollVertically(-1)) ? false : true;
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        protected static class SavedState extends AbsSavedState {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.appbar.AppBarLayout.BaseBehavior.SavedState.1
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

            /* JADX INFO: renamed from: g */
            int f23808g;

            /* JADX INFO: renamed from: n */
            boolean f23809n;

            /* JADX INFO: renamed from: q */
            boolean f23810q;

            /* JADX INFO: renamed from: s */
            boolean f23811s;

            /* JADX INFO: renamed from: y */
            float f23812y;

            public SavedState(@lvui Parcel parcel, ClassLoader classLoader) {
                super(parcel, classLoader);
                this.f23810q = parcel.readByte() != 0;
                this.f23809n = parcel.readByte() != 0;
                this.f23808g = parcel.readInt();
                this.f23812y = parcel.readFloat();
                this.f23811s = parcel.readByte() != 0;
            }

            @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
            public void writeToParcel(@lvui Parcel parcel, int i2) {
                super.writeToParcel(parcel, i2);
                parcel.writeByte(this.f23810q ? (byte) 1 : (byte) 0);
                parcel.writeByte(this.f23809n ? (byte) 1 : (byte) 0);
                parcel.writeInt(this.f23808g);
                parcel.writeFloat(this.f23812y);
                parcel.writeByte(this.f23811s ? (byte) 1 : (byte) 0);
            }

            public SavedState(Parcelable parcelable) {
                super(parcelable);
            }
        }
    }

    public static class Behavior extends BaseBehavior<AppBarLayout> {

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$Behavior$k */
        public static abstract class AbstractC3920k extends BaseBehavior.AbstractC3918n<AppBarLayout> {
        }

        public Behavior() {
        }

        @Override // com.google.android.material.appbar.AbstractC3929k, androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        public /* bridge */ /* synthetic */ boolean a9(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, @lvui MotionEvent motionEvent) {
            return super.a9(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: bo */
        public /* bridge */ /* synthetic */ boolean n7h(@lvui CoordinatorLayout coordinatorLayout, @lvui AppBarLayout appBarLayout, int i2, int i3, int i4, int i5) {
            return super.n7h(coordinatorLayout, appBarLayout, i2, i3, i4, i5);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: c8jq */
        public /* bridge */ /* synthetic */ void fn3e(CoordinatorLayout coordinatorLayout, @lvui AppBarLayout appBarLayout, View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
            super.fn3e(coordinatorLayout, appBarLayout, view, i2, i3, i4, i5, i6, iArr);
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ void d2ok(boolean z2) {
            super.d2ok(z2);
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ boolean d3() {
            return super.d3();
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ void dd(boolean z2) {
            super.dd(z2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: dr */
        public /* bridge */ /* synthetic */ Parcelable o1t(@lvui CoordinatorLayout coordinatorLayout, @lvui AppBarLayout appBarLayout) {
            return super.o1t(coordinatorLayout, appBarLayout);
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ int gvn7() {
            return super.gvn7();
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: gyi */
        public /* bridge */ /* synthetic */ void mo1760z(@lvui CoordinatorLayout coordinatorLayout, @lvui AppBarLayout appBarLayout, Parcelable parcelable) {
            super.mo1760z(coordinatorLayout, appBarLayout, parcelable);
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ int jp0y() {
            return super.jp0y();
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ boolean lvui(int i2) {
            return super.lvui(i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        public /* bridge */ /* synthetic */ void mu(@dd BaseBehavior.AbstractC3918n abstractC3918n) {
            super.mu(abstractC3918n);
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ boolean oc() {
            return super.oc();
        }

        @Override // com.google.android.material.appbar.zy
        /* JADX INFO: renamed from: r */
        public /* bridge */ /* synthetic */ boolean mo14023r(int i2) {
            return super.mo14023r(i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: u */
        public /* bridge */ /* synthetic */ boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui AppBarLayout appBarLayout, int i2) {
            return super.qrj(coordinatorLayout, appBarLayout, i2);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: v */
        public /* bridge */ /* synthetic */ void jk(CoordinatorLayout coordinatorLayout, @lvui AppBarLayout appBarLayout, View view, int i2) {
            super.jk(coordinatorLayout, appBarLayout, view, i2);
        }

        @Override // com.google.android.material.appbar.AbstractC3929k, androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        public /* bridge */ /* synthetic */ boolean x2(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, @lvui MotionEvent motionEvent) {
            return super.x2(coordinatorLayout, view, motionEvent);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: xwq3 */
        public /* bridge */ /* synthetic */ boolean mo1758t(@lvui CoordinatorLayout coordinatorLayout, @lvui AppBarLayout appBarLayout, @lvui View view, View view2, int i2, int i3) {
            return super.mo1758t(coordinatorLayout, appBarLayout, view, view2, i2, i3);
        }

        @Override // com.google.android.material.appbar.AppBarLayout.BaseBehavior
        /* JADX INFO: renamed from: y2 */
        public /* bridge */ /* synthetic */ void ki(CoordinatorLayout coordinatorLayout, @lvui AppBarLayout appBarLayout, View view, int i2, int i3, int[] iArr, int i4) {
            super.ki(coordinatorLayout, appBarLayout, view, i2, i3, iArr, i4);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    public static class ScrollingViewBehavior extends com.google.android.material.appbar.toq {
        public ScrollingViewBehavior() {
        }

        /* JADX INFO: renamed from: e */
        private static int m14024e(@lvui AppBarLayout appBarLayout) {
            CoordinatorLayout.zy zyVarM1740g = ((CoordinatorLayout.f7l8) appBarLayout.getLayoutParams()).m1740g();
            if (zyVarM1740g instanceof BaseBehavior) {
                return ((BaseBehavior) zyVarM1740g).mo14017f();
            }
            return 0;
        }

        private void hb(View view, View view2) {
            if (view2 instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                if (appBarLayout.m14001h()) {
                    appBarLayout.m14007t(appBarLayout.a9(view));
                }
            }
        }

        private void nn86(@lvui View view, @lvui View view2) {
            CoordinatorLayout.zy zyVarM1740g = ((CoordinatorLayout.f7l8) view2.getLayoutParams()).m1740g();
            if (zyVarM1740g instanceof BaseBehavior) {
                C0683f.zkd(view, (((view2.getBottom() - view.getTop()) + ((BaseBehavior) zyVarM1740g).f67328x2) + m14059f()) - ncyb(view2));
            }
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ void d2ok(boolean z2) {
            super.d2ok(z2);
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ boolean d3() {
            return super.d3();
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ void dd(boolean z2) {
            super.dd(z2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        public boolean fu4(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, @lvui Rect rect, boolean z2) {
            AppBarLayout appBarLayoutX9kr = x9kr(coordinatorLayout.m1736i(view));
            if (appBarLayoutX9kr != null) {
                rect.offset(view.getLeft(), view.getTop());
                Rect rect2 = this.f23881q;
                rect2.set(0, 0, coordinatorLayout.getWidth(), coordinatorLayout.getHeight());
                if (!rect2.contains(rect)) {
                    appBarLayoutX9kr.setExpanded(false, !z2);
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: g */
        public boolean mo1751g(CoordinatorLayout coordinatorLayout, View view, View view2) {
            return view2 instanceof AppBarLayout;
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ int gvn7() {
            return super.gvn7();
        }

        @Override // com.google.android.material.appbar.toq
        int hyr(View view) {
            return view instanceof AppBarLayout ? ((AppBarLayout) view).getTotalScrollRange() : super.hyr(view);
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ int jp0y() {
            return super.jp0y();
        }

        @Override // com.google.android.material.appbar.toq
        /* JADX INFO: renamed from: l */
        float mo14025l(View view) {
            int i2;
            if (view instanceof AppBarLayout) {
                AppBarLayout appBarLayout = (AppBarLayout) view;
                int totalScrollRange = appBarLayout.getTotalScrollRange();
                int downNestedPreScrollRange = appBarLayout.getDownNestedPreScrollRange();
                int iM14024e = m14024e(appBarLayout);
                if ((downNestedPreScrollRange == 0 || totalScrollRange + iM14024e > downNestedPreScrollRange) && (i2 = totalScrollRange - downNestedPreScrollRange) != 0) {
                    return (iM14024e / i2) + 1.0f;
                }
            }
            return 0.0f;
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ boolean lvui(int i2) {
            return super.lvui(i2);
        }

        @Override // com.google.android.material.appbar.toq, androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        public /* bridge */ /* synthetic */ boolean n7h(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, int i2, int i3, int i4, int i5) {
            return super.n7h(coordinatorLayout, view, i2, i3, i4, i5);
        }

        @Override // com.google.android.material.appbar.zy
        public /* bridge */ /* synthetic */ boolean oc() {
            return super.oc();
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: p */
        public void mo1755p(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, @lvui View view2) {
            if (view2 instanceof AppBarLayout) {
                C0683f.yl(coordinatorLayout, ki.C0656k.f50709ki.toq());
                C0683f.yl(coordinatorLayout, ki.C0656k.f50720t8r.toq());
                C0683f.zwy(coordinatorLayout, null);
            }
        }

        @Override // com.google.android.material.appbar.zy, androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        public /* bridge */ /* synthetic */ boolean qrj(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, int i2) {
            return super.qrj(coordinatorLayout, view, i2);
        }

        @Override // com.google.android.material.appbar.zy
        /* JADX INFO: renamed from: r */
        public /* bridge */ /* synthetic */ boolean mo14023r(int i2) {
            return super.mo14023r(i2);
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.zy
        /* JADX INFO: renamed from: s */
        public boolean mo1757s(@lvui CoordinatorLayout coordinatorLayout, @lvui View view, @lvui View view2) {
            nn86(view, view2);
            hb(view, view2);
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.material.appbar.toq
        @dd
        /* JADX INFO: renamed from: vyq, reason: merged with bridge method [inline-methods] */
        public AppBarLayout x9kr(@lvui List<View> list) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                View view = list.get(i2);
                if (view instanceof AppBarLayout) {
                    return (AppBarLayout) view;
                }
            }
            return null;
        }

        public ScrollingViewBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6095k.kja0.pt6);
            lrht(typedArrayObtainStyledAttributes.getDimensionPixelSize(C6095k.kja0.s0z1, 0));
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public interface f7l8 {
        /* JADX INFO: renamed from: k */
        void m14026k(@cdj float f2, @x2 int i2);
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$k */
    class C3922k implements eqxt {
        C3922k() {
        }

        @Override // androidx.core.view.eqxt
        /* JADX INFO: renamed from: k */
        public tfm mo151k(View view, tfm tfmVar) {
            return AppBarLayout.this.t8r(tfmVar);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$n */
    public static class C3923n extends AbstractC3924q {

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final float f67341zy = 0.3f;

        /* JADX INFO: renamed from: k */
        private final Rect f23829k = new Rect();

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private final Rect f67342toq = new Rect();

        private static void toq(Rect rect, AppBarLayout appBarLayout, View view) {
            view.getDrawingRect(rect);
            appBarLayout.offsetDescendantRectToMyCoords(view, rect);
            rect.offset(0, -appBarLayout.getTopInset());
        }

        @Override // com.google.android.material.appbar.AppBarLayout.AbstractC3924q
        /* JADX INFO: renamed from: k */
        public void mo14032k(@lvui AppBarLayout appBarLayout, @lvui View view, float f2) {
            toq(this.f23829k, appBarLayout, view);
            float fAbs = this.f23829k.top - Math.abs(f2);
            if (fAbs > 0.0f) {
                C0683f.vy(view, null);
                view.setTranslationY(0.0f);
                return;
            }
            float fM22396q = 1.0f - C6116k.m22396q(Math.abs(fAbs / this.f23829k.height()), 0.0f, 1.0f);
            float fHeight = (-fAbs) - ((this.f23829k.height() * f67341zy) * (1.0f - (fM22396q * fM22396q)));
            view.setTranslationY(fHeight);
            view.getDrawingRect(this.f67342toq);
            this.f67342toq.offset(0, (int) (-fHeight));
            C0683f.vy(view, this.f67342toq);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$q */
    public static abstract class AbstractC3924q {
        /* JADX INFO: renamed from: k */
        public abstract void mo14032k(@lvui AppBarLayout appBarLayout, @lvui View view, float f2);
    }

    class toq implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ C4108p f23830k;

        toq(C4108p c4108p) {
            this.f23830k = c4108p;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            this.f23830k.zp(fFloatValue);
            if (AppBarLayout.this.f23799o instanceof C4108p) {
                ((C4108p) AppBarLayout.this.f23799o).zp(fFloatValue);
            }
            Iterator it = AppBarLayout.this.f23789e.iterator();
            while (it.hasNext()) {
                ((f7l8) it.next()).m14026k(fFloatValue, this.f23830k.jk());
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$y */
    public interface InterfaceC3925y extends zy<AppBarLayout> {
        @Override // com.google.android.material.appbar.AppBarLayout.zy
        /* JADX INFO: renamed from: k */
        void mo10215k(AppBarLayout appBarLayout, int i2);
    }

    public interface zy<T extends AppBarLayout> {
        /* JADX INFO: renamed from: k */
        void mo10215k(T t2, int i2);
    }

    public AppBarLayout(@lvui Context context) {
        this(context, null);
    }

    private void f7l8() {
        WeakReference<View> weakReference = this.f23790f;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f23790f = null;
    }

    private boolean fti() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        return (childAt.getVisibility() == 8 || C0683f.m3160f(childAt)) ? false : true;
    }

    private void fu4(boolean z2, boolean z3, boolean z5) {
        this.f23803s = (z2 ? 1 : 2) | (z3 ? 4 : 0) | (z5 ? 8 : 0);
        requestLayout();
    }

    private void gvn7() {
        setWillNotDraw(!jk());
    }

    private boolean jk() {
        return this.f23799o != null && getTopInset() > 0;
    }

    private void jp0y(@lvui C4108p c4108p, boolean z2) {
        float dimension = getResources().getDimension(C6095k.g.f78978py);
        float f2 = z2 ? 0.0f : dimension;
        if (!z2) {
            dimension = 0.0f;
        }
        ValueAnimator valueAnimator = this.f23788c;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, dimension);
        this.f23788c = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(getResources().getInteger(C6095k.s.f79911zy));
        this.f23788c.setInterpolator(C3910k.f23771k);
        this.f23788c.addUpdateListener(new toq(c4108p));
        this.f23788c.start();
    }

    private void kja0() {
        Behavior behavior = this.f23797m;
        BaseBehavior.SavedState savedStateM14016d = (behavior == null || this.f23801q == -1 || this.f23803s != 0) ? null : behavior.m14016d(AbsSavedState.f4331k, this);
        this.f23801q = -1;
        this.f23798n = -1;
        this.f23791g = -1;
        if (savedStateM14016d != null) {
            this.f23797m.ikck(savedStateM14016d, false);
        }
    }

    private boolean o1t(boolean z2) {
        if (this.f23806z == z2) {
            return false;
        }
        this.f23806z = z2;
        refreshDrawableState();
        return true;
    }

    private boolean qrj() {
        int childCount = getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            if (((C3921g) getChildAt(i2).getLayoutParams()).m14029n()) {
                return true;
            }
        }
        return false;
    }

    @dd
    /* JADX INFO: renamed from: y */
    private View m13999y(@dd View view) {
        int i2;
        if (this.f23790f == null && (i2 = this.f23796l) != -1) {
            View viewFindViewById = view != null ? view.findViewById(i2) : null;
            if (viewFindViewById == null && (getParent() instanceof ViewGroup)) {
                viewFindViewById = ((ViewGroup) getParent()).findViewById(this.f23796l);
            }
            if (viewFindViewById != null) {
                this.f23790f = new WeakReference<>(viewFindViewById);
            }
        }
        WeakReference<View> weakReference = this.f23790f;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    boolean a9(@dd View view) {
        View viewM13999y = m13999y(view);
        if (viewM13999y != null) {
            view = viewM13999y;
        }
        return view != null && (view.canScrollVertically(-1) || view.getScrollY() > 0);
    }

    public boolean cdj() {
        return this.f23804t;
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C3921g;
    }

    @Override // android.view.View
    public void draw(@lvui Canvas canvas) {
        super.draw(canvas);
        if (jk()) {
            int iSave = canvas.save();
            canvas.translate(0.0f, -this.f23795k);
            this.f23799o.draw(canvas);
            canvas.restoreToCount(iSave);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f23799o;
        if (drawable != null && drawable.isStateful() && drawable.setState(drawableState)) {
            invalidateDrawable(drawable);
        }
    }

    public void fn3e(@dd zy zyVar) {
        List<zy> list = this.f23792h;
        if (list == null || zyVar == null) {
            return;
        }
        list.remove(zyVar);
    }

    /* JADX INFO: renamed from: g */
    public void m14000g() {
        this.f23789e.clear();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.toq
    @lvui
    public CoordinatorLayout.zy<AppBarLayout> getBehavior() {
        Behavior behavior = new Behavior();
        this.f23797m = behavior;
        return behavior;
    }

    int getDownNestedPreScrollRange() {
        int iMin;
        int iM3167m;
        int i2 = this.f23798n;
        if (i2 != -1) {
            return i2;
        }
        int i3 = 0;
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            C3921g c3921g = (C3921g) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c3921g.f23827k;
            if ((i4 & 5) != 5) {
                if (i3 > 0) {
                    break;
                }
            } else {
                int i5 = ((LinearLayout.LayoutParams) c3921g).topMargin + ((LinearLayout.LayoutParams) c3921g).bottomMargin;
                if ((i4 & 8) != 0) {
                    iM3167m = C0683f.m3167m(childAt);
                } else if ((i4 & 2) != 0) {
                    iM3167m = measuredHeight - C0683f.m3167m(childAt);
                } else {
                    iMin = i5 + measuredHeight;
                    if (childCount == 0 && C0683f.m3160f(childAt)) {
                        iMin = Math.min(iMin, measuredHeight - getTopInset());
                    }
                    i3 += iMin;
                }
                iMin = i5 + iM3167m;
                if (childCount == 0) {
                    iMin = Math.min(iMin, measuredHeight - getTopInset());
                }
                i3 += iMin;
            }
        }
        int iMax = Math.max(0, i3);
        this.f23798n = iMax;
        return iMax;
    }

    int getDownNestedScrollRange() {
        int i2 = this.f23791g;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int iM3167m = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            C3921g c3921g = (C3921g) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight() + ((LinearLayout.LayoutParams) c3921g).topMargin + ((LinearLayout.LayoutParams) c3921g).bottomMargin;
            int i4 = c3921g.f23827k;
            if ((i4 & 1) == 0) {
                break;
            }
            iM3167m += measuredHeight;
            if ((i4 & 2) != 0) {
                iM3167m -= C0683f.m3167m(childAt);
                break;
            }
            i3++;
        }
        int iMax = Math.max(0, iM3167m);
        this.f23791g = iMax;
        return iMax;
    }

    @InterfaceC7843t
    public int getLiftOnScrollTargetViewId() {
        return this.f23796l;
    }

    public final int getMinimumHeightForVisibleOverlappingContent() {
        int topInset = getTopInset();
        int iM3167m = C0683f.m3167m(this);
        if (iM3167m == 0) {
            int childCount = getChildCount();
            iM3167m = childCount >= 1 ? C0683f.m3167m(getChildAt(childCount - 1)) : 0;
            if (iM3167m == 0) {
                return getHeight() / 3;
            }
        }
        return (iM3167m * 2) + topInset;
    }

    int getPendingAction() {
        return this.f23803s;
    }

    @dd
    public Drawable getStatusBarForeground() {
        return this.f23799o;
    }

    @Deprecated
    public float getTargetElevation() {
        return 0.0f;
    }

    @yz
    final int getTopInset() {
        tfm tfmVar = this.f23800p;
        if (tfmVar != null) {
            return tfmVar.ki();
        }
        return 0;
    }

    public final int getTotalScrollRange() {
        int i2 = this.f23801q;
        if (i2 != -1) {
            return i2;
        }
        int childCount = getChildCount();
        int i3 = 0;
        int iM3167m = 0;
        while (true) {
            if (i3 >= childCount) {
                break;
            }
            View childAt = getChildAt(i3);
            C3921g c3921g = (C3921g) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int i4 = c3921g.f23827k;
            if ((i4 & 1) == 0) {
                break;
            }
            iM3167m += measuredHeight + ((LinearLayout.LayoutParams) c3921g).topMargin + ((LinearLayout.LayoutParams) c3921g).bottomMargin;
            if (i3 == 0 && C0683f.m3160f(childAt)) {
                iM3167m -= getTopInset();
            }
            if ((i4 & 2) != 0) {
                iM3167m -= C0683f.m3167m(childAt);
                break;
            }
            i3++;
        }
        int iMax = Math.max(0, iM3167m);
        this.f23801q = iMax;
        return iMax;
    }

    int getUpNestedPreScrollRange() {
        return getTotalScrollRange();
    }

    /* JADX INFO: renamed from: h */
    public boolean m14001h() {
        return this.f23802r;
    }

    /* JADX INFO: renamed from: i */
    public boolean m14002i(@lvui f7l8 f7l8Var) {
        return this.f23789e.remove(f7l8Var);
    }

    void ki(int i2) {
        this.f23795k = i2;
        if (!willNotDraw()) {
            C0683f.h7am(this);
        }
        List<zy> list = this.f23792h;
        if (list != null) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                zy zyVar = this.f23792h.get(i3);
                if (zyVar != null) {
                    zyVar.mo10215k(this, i2);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: ld6, reason: merged with bridge method [inline-methods] */
    public C3921g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LinearLayout.LayoutParams ? new C3921g((LinearLayout.LayoutParams) layoutParams) : layoutParams instanceof ViewGroup.MarginLayoutParams ? new C3921g((ViewGroup.MarginLayoutParams) layoutParams) : new C3921g(layoutParams);
    }

    boolean mcp(boolean z2, boolean z3) {
        if (!z3 || this.f23804t == z2) {
            return false;
        }
        this.f23804t = z2;
        refreshDrawableState();
        if (!this.f23802r || !(getBackground() instanceof C4108p)) {
            return true;
        }
        jp0y((C4108p) getBackground(), z2);
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m14003n(InterfaceC3925y interfaceC3925y) {
        m14005q(interfaceC3925y);
    }

    boolean n7h() {
        return getTotalScrollRange() != 0;
    }

    void ni7() {
        this.f23803s = 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ld6.m14843n(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected int[] onCreateDrawableState(int i2) {
        if (this.f23794j == null) {
            this.f23794j = new int[4];
        }
        int[] iArr = this.f23794j;
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + iArr.length);
        boolean z2 = this.f23806z;
        int i3 = C6095k.zy.c7;
        if (!z2) {
            i3 = -i3;
        }
        iArr[0] = i3;
        iArr[1] = (z2 && this.f23804t) ? C6095k.zy.qvyi : -C6095k.zy.qvyi;
        int i4 = C6095k.zy.ufxg;
        if (!z2) {
            i4 = -i4;
        }
        iArr[2] = i4;
        iArr[3] = (z2 && this.f23804t) ? C6095k.zy.dr1 : -C6095k.zy.dr1;
        return View.mergeDrawableStates(iArrOnCreateDrawableState, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f7l8();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        boolean z3 = true;
        if (C0683f.m3160f(this) && fti()) {
            int topInset = getTopInset();
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                C0683f.zkd(getChildAt(childCount), topInset);
            }
        }
        kja0();
        this.f23805y = false;
        int childCount2 = getChildCount();
        int i6 = 0;
        while (true) {
            if (i6 >= childCount2) {
                break;
            }
            if (((C3921g) getChildAt(i6).getLayoutParams()).m14030q() != null) {
                this.f23805y = true;
                break;
            }
            i6++;
        }
        Drawable drawable = this.f23799o;
        if (drawable != null) {
            drawable.setBounds(0, 0, getWidth(), getTopInset());
        }
        if (this.f23793i) {
            return;
        }
        if (!this.f23802r && !qrj()) {
            z3 = false;
        }
        o1t(z3);
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        if (mode != 1073741824 && C0683f.m3160f(this) && fti()) {
            int measuredHeight = getMeasuredHeight();
            if (mode == Integer.MIN_VALUE) {
                measuredHeight = C6116k.m22394n(getMeasuredHeight() + getTopInset(), 0, View.MeasureSpec.getSize(i3));
            } else if (mode == 0) {
                measuredHeight += getTopInset();
            }
            setMeasuredDimension(getMeasuredWidth(), measuredHeight);
        }
        kja0();
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public C3921g generateLayoutParams(AttributeSet attributeSet) {
        return new C3921g(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: q */
    public void m14005q(@dd zy zyVar) {
        if (this.f23792h == null) {
            this.f23792h = new ArrayList();
        }
        if (zyVar == null || this.f23792h.contains(zyVar)) {
            return;
        }
        this.f23792h.add(zyVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.LinearLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public C3921g generateDefaultLayoutParams() {
        return new C3921g(-1, -2);
    }

    @Override // android.view.View
    @hyr(21)
    public void setElevation(float f2) {
        super.setElevation(f2);
        ld6.m14844q(this, f2);
    }

    public void setExpanded(boolean z2) {
        setExpanded(z2, C0683f.v0af(this));
    }

    public void setLiftOnScroll(boolean z2) {
        this.f23802r = z2;
    }

    public void setLiftOnScrollTargetViewId(@InterfaceC7843t int i2) {
        this.f23796l = i2;
        f7l8();
    }

    public void setLiftableOverrideEnabled(boolean z2) {
        this.f23793i = z2;
    }

    @Override // android.widget.LinearLayout
    public void setOrientation(int i2) {
        if (i2 != 1) {
            throw new IllegalArgumentException("AppBarLayout is always vertical and does not support horizontal orientation");
        }
        super.setOrientation(i2);
    }

    public void setStatusBarForeground(@dd Drawable drawable) {
        Drawable drawable2 = this.f23799o;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f23799o = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f23799o.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.zy.qrj(this.f23799o, C0683f.m3159e(this));
                this.f23799o.setVisible(getVisibility() == 0, false);
                this.f23799o.setCallback(this);
            }
            gvn7();
            C0683f.h7am(this);
        }
    }

    public void setStatusBarForegroundColor(@x2 int i2) {
        setStatusBarForeground(new ColorDrawable(i2));
    }

    public void setStatusBarForegroundResource(@zy.fn3e int i2) {
        setStatusBarForeground(C6045k.toq(getContext(), i2));
    }

    @Deprecated
    public void setTargetElevation(float f2) {
        C3930n.toq(this, f2);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f23799o;
        if (drawable != null) {
            drawable.setVisible(z2, false);
        }
    }

    /* JADX INFO: renamed from: t */
    boolean m14007t(boolean z2) {
        return mcp(z2, !this.f23793i);
    }

    tfm t8r(tfm tfmVar) {
        tfm tfmVar2 = C0683f.m3160f(this) ? tfmVar : null;
        if (!C0642s.m2985k(this.f23800p, tfmVar2)) {
            this.f23800p = tfmVar2;
            gvn7();
            requestLayout();
        }
        return tfmVar;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@lvui Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f23799o;
    }

    public boolean wvg(boolean z2) {
        return mcp(z2, true);
    }

    boolean x2() {
        return this.f23805y;
    }

    /* JADX INFO: renamed from: z */
    public boolean m14008z(boolean z2) {
        this.f23793i = true;
        return o1t(z2);
    }

    public void zurt(InterfaceC3925y interfaceC3925y) {
        fn3e(interfaceC3925y);
    }

    public void zy(@lvui f7l8 f7l8Var) {
        this.f23789e.add(f7l8Var);
    }

    public AppBarLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.f80241n5r1);
    }

    public void setExpanded(boolean z2, boolean z3) {
        fu4(z2, z3, true);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AppBarLayout(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = f23786v;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        this.f23801q = -1;
        this.f23798n = -1;
        this.f23791g = -1;
        this.f23803s = 0;
        this.f23789e = new ArrayList();
        Context context2 = getContext();
        setOrientation(1);
        if (getOutlineProvider() == ViewOutlineProvider.BACKGROUND) {
            C3930n.m14050k(this);
        }
        C3930n.zy(this, attributeSet, i2, i3);
        TypedArray typedArrayM14534p = com.google.android.material.internal.cdj.m14534p(context2, attributeSet, C6095k.kja0.f79157ktq, i2, i3, new int[0]);
        C0683f.wlev(this, typedArrayM14534p.getDrawable(C6095k.kja0.f79075b3e));
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C4108p c4108p = new C4108p();
            c4108p.m14867x(ColorStateList.valueOf(colorDrawable.getColor()));
            c4108p.m14856e(context2);
            C0683f.wlev(this, c4108p);
        }
        int i4 = C6095k.kja0.f79233vep5;
        if (typedArrayM14534p.hasValue(i4)) {
            fu4(typedArrayM14534p.getBoolean(i4, false), false, false);
        }
        if (typedArrayM14534p.hasValue(C6095k.kja0.f79132h7am)) {
            C3930n.toq(this, typedArrayM14534p.getDimensionPixelSize(r11, 0));
        }
        int i5 = C6095k.kja0.f79095cv06;
        if (typedArrayM14534p.hasValue(i5)) {
            setKeyboardNavigationCluster(typedArrayM14534p.getBoolean(i5, false));
        }
        int i6 = C6095k.kja0.f79080bek6;
        if (typedArrayM14534p.hasValue(i6)) {
            setTouchscreenBlocksFocus(typedArrayM14534p.getBoolean(i6, false));
        }
        this.f23802r = typedArrayM14534p.getBoolean(C6095k.kja0.f79174mbx, false);
        this.f23796l = typedArrayM14534p.getResourceId(C6095k.kja0.f79145jbh, -1);
        setStatusBarForeground(typedArrayM14534p.getDrawable(C6095k.kja0.f79257yl));
        typedArrayM14534p.recycle();
        C0683f.kx3(this, new C3922k());
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$g */
    public static class C3921g extends LinearLayout.LayoutParams {

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        public static final int f67333f7l8 = 4;

        /* JADX INFO: renamed from: g */
        public static final int f23821g = 2;

        /* JADX INFO: renamed from: kja0, reason: collision with root package name */
        private static final int f67334kja0 = 1;

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        static final int f67335ld6 = 5;

        /* JADX INFO: renamed from: n */
        public static final int f23822n = 1;

        /* JADX INFO: renamed from: n7h, reason: collision with root package name */
        private static final int f67336n7h = 0;

        /* JADX INFO: renamed from: p */
        public static final int f23823p = 32;

        /* JADX INFO: renamed from: q */
        public static final int f23824q = 0;

        /* JADX INFO: renamed from: qrj, reason: collision with root package name */
        static final int f67337qrj = 10;

        /* JADX INFO: renamed from: s */
        public static final int f23825s = 16;

        /* JADX INFO: renamed from: x2, reason: collision with root package name */
        static final int f67338x2 = 17;

        /* JADX INFO: renamed from: y */
        public static final int f23826y = 8;

        /* JADX INFO: renamed from: k */
        int f23827k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private AbstractC3924q f67339toq;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        Interpolator f67340zy;

        /* JADX INFO: renamed from: com.google.android.material.appbar.AppBarLayout$g$k */
        @Retention(RetentionPolicy.SOURCE)
        @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
        public @interface k {
        }

        public C3921g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f23827k = 1;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6095k.kja0.f79105ebn);
            this.f23827k = typedArrayObtainStyledAttributes.getInt(C6095k.kja0.f79140ij, 0);
            m14028g(m14027k(typedArrayObtainStyledAttributes.getInt(C6095k.kja0.f79200pc, 0)));
            int i2 = C6095k.kja0.f79190nsb;
            if (typedArrayObtainStyledAttributes.hasValue(i2)) {
                this.f67340zy = AnimationUtils.loadInterpolator(context, typedArrayObtainStyledAttributes.getResourceId(i2, 0));
            }
            typedArrayObtainStyledAttributes.recycle();
        }

        @dd
        /* JADX INFO: renamed from: k */
        private AbstractC3924q m14027k(int i2) {
            if (i2 != 1) {
                return null;
            }
            return new C3923n();
        }

        public void f7l8(int i2) {
            this.f23827k = i2;
        }

        /* JADX INFO: renamed from: g */
        public void m14028g(@dd AbstractC3924q abstractC3924q) {
            this.f67339toq = abstractC3924q;
        }

        /* JADX INFO: renamed from: n */
        boolean m14029n() {
            int i2 = this.f23827k;
            return (i2 & 1) == 1 && (i2 & 10) != 0;
        }

        /* JADX INFO: renamed from: q */
        public Interpolator m14030q() {
            return this.f67340zy;
        }

        @dd
        public AbstractC3924q toq() {
            return this.f67339toq;
        }

        /* JADX INFO: renamed from: y */
        public void m14031y(Interpolator interpolator) {
            this.f67340zy = interpolator;
        }

        public int zy() {
            return this.f23827k;
        }

        public C3921g(int i2, int i3) {
            super(i2, i3);
            this.f23827k = 1;
        }

        public C3921g(int i2, int i3, float f2) {
            super(i2, i3, f2);
            this.f23827k = 1;
        }

        public C3921g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f23827k = 1;
        }

        public C3921g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f23827k = 1;
        }

        @hyr(19)
        public C3921g(LinearLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f23827k = 1;
        }

        @hyr(19)
        public C3921g(@lvui C3921g c3921g) {
            super((LinearLayout.LayoutParams) c3921g);
            this.f23827k = 1;
            this.f23827k = c3921g.f23827k;
            this.f67340zy = c3921g.f67340zy;
        }
    }
}
