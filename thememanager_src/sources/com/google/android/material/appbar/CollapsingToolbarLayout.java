package com.google.android.material.appbar;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.content.C0498q;
import androidx.core.util.C0642s;
import androidx.core.view.C0683f;
import androidx.core.view.eqxt;
import androidx.core.view.tfm;
import com.google.android.material.animation.C3910k;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.C4052q;
import com.google.android.material.internal.cdj;
import h4b.C6070k;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import ki.C6116k;
import p030n.C7397k;
import pjz9.C7607k;
import zy.a9;
import zy.dd;
import zy.fn3e;
import zy.hb;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.x2;
import zy.zurt;

/* JADX INFO: loaded from: classes2.dex */
public class CollapsingToolbarLayout extends FrameLayout {
    public static final int an = 0;
    private static final int bp = C6095k.n7h.s5;
    private static final int bv = 600;
    public static final int id = 1;

    /* JADX INFO: renamed from: a */
    private int f23832a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private int f67343ab;

    /* JADX INFO: renamed from: b */
    private long f23833b;
    private boolean bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f67344bo;

    /* JADX INFO: renamed from: c */
    @dd
    private Drawable f23834c;

    /* JADX INFO: renamed from: d */
    private int f23835d;

    /* JADX INFO: renamed from: e */
    @dd
    Drawable f23836e;

    /* JADX INFO: renamed from: f */
    private boolean f23837f;

    /* JADX INFO: renamed from: g */
    @dd
    private View f23838g;

    /* JADX INFO: renamed from: h */
    private int f23839h;

    /* JADX INFO: renamed from: i */
    private int f23840i;

    /* JADX INFO: renamed from: j */
    private int f23841j;

    /* JADX INFO: renamed from: k */
    private boolean f23842k;

    /* JADX INFO: renamed from: l */
    private boolean f23843l;

    /* JADX INFO: renamed from: m */
    private ValueAnimator f23844m;

    /* JADX INFO: renamed from: n */
    @dd
    private ViewGroup f23845n;

    /* JADX INFO: renamed from: o */
    private boolean f23846o;

    /* JADX INFO: renamed from: p */
    private int f23847p;

    /* JADX INFO: renamed from: q */
    private int f23848q;

    /* JADX INFO: renamed from: r */
    @lvui
    final C7607k f23849r;

    /* JADX INFO: renamed from: s */
    private int f23850s;

    /* JADX INFO: renamed from: t */
    @lvui
    final com.google.android.material.internal.toq f23851t;

    /* JADX INFO: renamed from: u */
    int f23852u;

    /* JADX INFO: renamed from: v */
    @dd
    tfm f23853v;

    /* JADX INFO: renamed from: w */
    private boolean f23854w;

    /* JADX INFO: renamed from: x */
    private AppBarLayout.InterfaceC3925y f23855x;

    /* JADX INFO: renamed from: y */
    private View f23856y;

    /* JADX INFO: renamed from: z */
    private final Rect f23857z;

    /* JADX INFO: renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$k */
    class C3926k implements eqxt {
        C3926k() {
        }

        @Override // androidx.core.view.eqxt
        /* JADX INFO: renamed from: k */
        public tfm mo151k(View view, @lvui tfm tfmVar) {
            return CollapsingToolbarLayout.this.ki(tfmVar);
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$n */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC3927n {
    }

    /* JADX INFO: renamed from: com.google.android.material.appbar.CollapsingToolbarLayout$q */
    private class C3928q implements AppBarLayout.InterfaceC3925y {
        C3928q() {
        }

        @Override // com.google.android.material.appbar.AppBarLayout.InterfaceC3925y, com.google.android.material.appbar.AppBarLayout.zy
        /* JADX INFO: renamed from: k */
        public void mo10215k(AppBarLayout appBarLayout, int i2) {
            CollapsingToolbarLayout collapsingToolbarLayout = CollapsingToolbarLayout.this;
            collapsingToolbarLayout.f23852u = i2;
            tfm tfmVar = collapsingToolbarLayout.f23853v;
            int iKi = tfmVar != null ? tfmVar.ki() : 0;
            int childCount = CollapsingToolbarLayout.this.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = CollapsingToolbarLayout.this.getChildAt(i3);
                zy zyVar = (zy) childAt.getLayoutParams();
                C3931q c3931qM14036p = CollapsingToolbarLayout.m14036p(childAt);
                int i4 = zyVar.f23864k;
                if (i4 == 1) {
                    c3931qM14036p.ld6(C6116k.m22394n(-i2, 0, CollapsingToolbarLayout.this.m14042y(childAt)));
                } else if (i4 == 2) {
                    c3931qM14036p.ld6(Math.round((-i2) * zyVar.f67346toq));
                }
            }
            CollapsingToolbarLayout.this.fu4();
            CollapsingToolbarLayout collapsingToolbarLayout2 = CollapsingToolbarLayout.this;
            if (collapsingToolbarLayout2.f23836e != null && iKi > 0) {
                C0683f.h7am(collapsingToolbarLayout2);
            }
            int height = (CollapsingToolbarLayout.this.getHeight() - C0683f.m3167m(CollapsingToolbarLayout.this)) - iKi;
            float f2 = height;
            CollapsingToolbarLayout.this.f23851t.ikck(Math.min(1.0f, (r0 - CollapsingToolbarLayout.this.getScrimVisibleHeightTrigger()) / f2));
            CollapsingToolbarLayout collapsingToolbarLayout3 = CollapsingToolbarLayout.this;
            collapsingToolbarLayout3.f23851t.m14616x(collapsingToolbarLayout3.f23852u + height);
            CollapsingToolbarLayout.this.f23851t.xwq3(Math.abs(i2) / f2);
        }
    }

    class toq implements ValueAnimator.AnimatorUpdateListener {
        toq() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            CollapsingToolbarLayout.this.setScrimAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public CollapsingToolbarLayout(@lvui Context context) {
        this(context, null);
    }

    private boolean cdj(View view) {
        View view2 = this.f23838g;
        if (view2 == null || view2 == this) {
            if (view == this.f23845n) {
                return true;
            }
        } else if (view == view2) {
            return true;
        }
        return false;
    }

    private static int f7l8(@lvui View view) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return view.getMeasuredHeight();
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        return view.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    private void fn3e(@lvui Drawable drawable, int i2, int i3) {
        zurt(drawable, this.f23845n, i2, i3);
    }

    /* JADX INFO: renamed from: h */
    private static boolean m14033h(View view) {
        return (view instanceof Toolbar) || (view instanceof android.widget.Toolbar);
    }

    /* JADX INFO: renamed from: i */
    private void m14034i() {
        setContentDescription(getTitle());
    }

    /* JADX INFO: renamed from: k */
    private void m14035k(int i2) {
        zy();
        ValueAnimator valueAnimator = this.f23844m;
        if (valueAnimator == null) {
            ValueAnimator valueAnimator2 = new ValueAnimator();
            this.f23844m = valueAnimator2;
            valueAnimator2.setInterpolator(i2 > this.f23841j ? C3910k.f67313zy : C3910k.f23773q);
            this.f23844m.addUpdateListener(new toq());
        } else if (valueAnimator.isRunning()) {
            this.f23844m.cancel();
        }
        this.f23844m.setDuration(this.f23833b);
        this.f23844m.setIntValues(this.f23841j, i2);
        this.f23844m.start();
    }

    private boolean n7h() {
        return this.f67344bo == 1;
    }

    private void ni7() {
        View view;
        if (!this.f23843l && (view = this.f23856y) != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f23856y);
            }
        }
        if (!this.f23843l || this.f23845n == null) {
            return;
        }
        if (this.f23856y == null) {
            this.f23856y = new View(getContext());
        }
        if (this.f23856y.getParent() == null) {
            this.f23845n.addView(this.f23856y, -1, -1);
        }
    }

    private void o1t() {
        if (this.f23845n != null && this.f23843l && TextUtils.isEmpty(this.f23851t.x9kr())) {
            setTitle(m14038s(this.f23845n));
        }
    }

    @lvui
    /* JADX INFO: renamed from: p */
    static C3931q m14036p(@lvui View view) {
        int i2 = C6095k.y.bp;
        C3931q c3931q = (C3931q) view.getTag(i2);
        if (c3931q != null) {
            return c3931q;
        }
        C3931q c3931q2 = new C3931q(view);
        view.setTag(i2, c3931q2);
        return c3931q2;
    }

    @lvui
    /* JADX INFO: renamed from: q */
    private View m14037q(@lvui View view) {
        for (ViewParent parent = view.getParent(); parent != this && parent != null; parent = parent.getParent()) {
            if (parent instanceof View) {
                view = parent;
            }
        }
        return view;
    }

    /* JADX INFO: renamed from: s */
    private static CharSequence m14038s(View view) {
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getTitle();
        }
        if (view instanceof android.widget.Toolbar) {
            return ((android.widget.Toolbar) view).getTitle();
        }
        return null;
    }

    private void t8r(boolean z2) {
        int titleMarginBottom;
        int titleMarginEnd;
        int titleMarginTop;
        View view = this.f23838g;
        if (view == null) {
            view = this.f23845n;
        }
        int iM14042y = m14042y(view);
        C4052q.m14583k(this, this.f23856y, this.f23857z);
        ViewGroup viewGroup = this.f23845n;
        int titleMarginStart = 0;
        if (viewGroup instanceof Toolbar) {
            Toolbar toolbar = (Toolbar) viewGroup;
            titleMarginStart = toolbar.getTitleMarginStart();
            titleMarginEnd = toolbar.getTitleMarginEnd();
            titleMarginTop = toolbar.getTitleMarginTop();
            titleMarginBottom = toolbar.getTitleMarginBottom();
        } else if (viewGroup instanceof android.widget.Toolbar) {
            android.widget.Toolbar toolbar2 = (android.widget.Toolbar) viewGroup;
            titleMarginStart = toolbar2.getTitleMarginStart();
            titleMarginEnd = toolbar2.getTitleMarginEnd();
            titleMarginTop = toolbar2.getTitleMarginTop();
            titleMarginBottom = toolbar2.getTitleMarginBottom();
        } else {
            titleMarginBottom = 0;
            titleMarginEnd = 0;
            titleMarginTop = 0;
        }
        com.google.android.material.internal.toq toqVar = this.f23851t;
        Rect rect = this.f23857z;
        int i2 = rect.left + (z2 ? titleMarginEnd : titleMarginStart);
        int i3 = rect.top + iM14042y + titleMarginTop;
        int i4 = rect.right;
        if (!z2) {
            titleMarginStart = titleMarginEnd;
        }
        toqVar.ek5k(i2, i3, i4 - titleMarginStart, (rect.bottom + iM14042y) - titleMarginBottom);
    }

    private void toq(AppBarLayout appBarLayout) {
        if (n7h()) {
            appBarLayout.setLiftOnScroll(false);
        }
    }

    /* JADX INFO: renamed from: z */
    private void m14039z(int i2, int i3, int i4, int i5, boolean z2) {
        View view;
        if (!this.f23843l || (view = this.f23856y) == null) {
            return;
        }
        boolean z3 = C0683f.zsr0(view) && this.f23856y.getVisibility() == 0;
        this.f23837f = z3;
        if (z3 || z2) {
            boolean z5 = C0683f.m3159e(this) == 1;
            t8r(z5);
            this.f23851t.ch(z5 ? this.f23839h : this.f23850s, this.f23857z.top + this.f23847p, (i4 - i2) - (z5 ? this.f23850s : this.f23839h), (i5 - i3) - this.f23840i);
            this.f23851t.m14613o(z2);
        }
    }

    private void zurt(@lvui Drawable drawable, @dd View view, int i2, int i3) {
        if (n7h() && view != null && this.f23843l) {
            i3 = view.getBottom();
        }
        drawable.setBounds(0, 0, i2, i3);
    }

    private void zy() {
        if (this.f23842k) {
            ViewGroup viewGroup = null;
            this.f23845n = null;
            this.f23838g = null;
            int i2 = this.f23848q;
            if (i2 != -1) {
                ViewGroup viewGroup2 = (ViewGroup) findViewById(i2);
                this.f23845n = viewGroup2;
                if (viewGroup2 != null) {
                    this.f23838g = m14037q(viewGroup2);
                }
            }
            if (this.f23845n == null) {
                int childCount = getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = getChildAt(i3);
                    if (m14033h(childAt)) {
                        viewGroup = (ViewGroup) childAt;
                        break;
                    }
                    i3++;
                }
                this.f23845n = viewGroup;
            }
            ni7();
            this.f23842k = false;
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof zy;
    }

    @Override // android.view.View
    public void draw(@lvui Canvas canvas) {
        Drawable drawable;
        super.draw(canvas);
        zy();
        if (this.f23845n == null && (drawable = this.f23834c) != null && this.f23841j > 0) {
            drawable.mutate().setAlpha(this.f23841j);
            this.f23834c.draw(canvas);
        }
        if (this.f23843l && this.f23837f) {
            if (this.f23845n == null || this.f23834c == null || this.f23841j <= 0 || !n7h() || this.f23851t.jp0y() >= this.f23851t.gvn7()) {
                this.f23851t.x2(canvas);
            } else {
                int iSave = canvas.save();
                canvas.clipRect(this.f23834c.getBounds(), Region.Op.DIFFERENCE);
                this.f23851t.x2(canvas);
                canvas.restoreToCount(iSave);
            }
        }
        if (this.f23836e == null || this.f23841j <= 0) {
            return;
        }
        tfm tfmVar = this.f23853v;
        int iKi = tfmVar != null ? tfmVar.ki() : 0;
        if (iKi > 0) {
            this.f23836e.setBounds(0, -this.f23852u, getWidth(), iKi - this.f23852u);
            this.f23836e.mutate().setAlpha(this.f23841j);
            this.f23836e.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j2) {
        boolean z2;
        if (this.f23834c == null || this.f23841j <= 0 || !cdj(view)) {
            z2 = false;
        } else {
            zurt(this.f23834c, view, getWidth(), getHeight());
            this.f23834c.mutate().setAlpha(this.f23841j);
            this.f23834c.draw(canvas);
            z2 = true;
        }
        return super.drawChild(canvas, view, j2) || z2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f23836e;
        boolean zWo = false;
        if (drawable != null && drawable.isStateful()) {
            zWo = false | drawable.setState(drawableState);
        }
        Drawable drawable2 = this.f23834c;
        if (drawable2 != null && drawable2.isStateful()) {
            zWo |= drawable2.setState(drawableState);
        }
        com.google.android.material.internal.toq toqVar = this.f23851t;
        if (toqVar != null) {
            zWo |= toqVar.wo(drawableState);
        }
        if (zWo) {
            invalidate();
        }
    }

    final void fu4() {
        if (this.f23834c == null && this.f23836e == null) {
            return;
        }
        setScrimsShown(getHeight() + this.f23852u < getScrimVisibleHeightTrigger());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public FrameLayout.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new zy(layoutParams);
    }

    public int getCollapsedTitleGravity() {
        return this.f23851t.cdj();
    }

    @lvui
    public Typeface getCollapsedTitleTypeface() {
        return this.f23851t.zurt();
    }

    @dd
    public Drawable getContentScrim() {
        return this.f23834c;
    }

    public int getExpandedTitleGravity() {
        return this.f23851t.mcp();
    }

    public int getExpandedTitleMarginBottom() {
        return this.f23840i;
    }

    public int getExpandedTitleMarginEnd() {
        return this.f23839h;
    }

    public int getExpandedTitleMarginStart() {
        return this.f23850s;
    }

    public int getExpandedTitleMarginTop() {
        return this.f23847p;
    }

    @lvui
    public Typeface getExpandedTitleTypeface() {
        return this.f23851t.fti();
    }

    @hyr(23)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public int getHyphenationFrequency() {
        return this.f23851t.d3();
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public int getLineCount() {
        return this.f23851t.oc();
    }

    @hyr(23)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public float getLineSpacingAdd() {
        return this.f23851t.eqxt();
    }

    @hyr(23)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public float getLineSpacingMultiplier() {
        return this.f23851t.d2ok();
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public int getMaxLines() {
        return this.f23851t.lvui();
    }

    int getScrimAlpha() {
        return this.f23841j;
    }

    public long getScrimAnimationDuration() {
        return this.f23833b;
    }

    public int getScrimVisibleHeightTrigger() {
        int i2 = this.f23832a;
        if (i2 >= 0) {
            return i2 + this.f23835d + this.f67343ab;
        }
        tfm tfmVar = this.f23853v;
        int iKi = tfmVar != null ? tfmVar.ki() : 0;
        int iM3167m = C0683f.m3167m(this);
        return iM3167m > 0 ? Math.min((iM3167m * 2) + iKi, getHeight()) : getHeight() / 3;
    }

    @dd
    public Drawable getStatusBarScrim() {
        return this.f23836e;
    }

    @dd
    public CharSequence getTitle() {
        if (this.f23843l) {
            return this.f23851t.x9kr();
        }
        return null;
    }

    public int getTitleCollapseMode() {
        return this.f67344bo;
    }

    @dd
    public TimeInterpolator getTitlePositionInterpolator() {
        return this.f23851t.dd();
    }

    tfm ki(@lvui tfm tfmVar) {
        tfm tfmVar2 = C0683f.m3160f(this) ? tfmVar : null;
        if (!C0642s.m2985k(this.f23853v, tfmVar2)) {
            this.f23853v = tfmVar2;
            requestLayout();
        }
        return tfmVar.zy();
    }

    public boolean kja0() {
        return this.f23843l;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public boolean ld6() {
        return this.bb;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public zy generateDefaultLayoutParams() {
        return new zy(-1, -1);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            AppBarLayout appBarLayout = (AppBarLayout) parent;
            toq(appBarLayout);
            C0683f.lw(this, C0683f.m3160f(appBarLayout));
            if (this.f23855x == null) {
                this.f23855x = new C3928q();
            }
            appBarLayout.m14003n(this.f23855x);
            C0683f.m28243do(this);
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(@lvui Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f23851t.m14610e(configuration);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        ViewParent parent = getParent();
        AppBarLayout.InterfaceC3925y interfaceC3925y = this.f23855x;
        if (interfaceC3925y != null && (parent instanceof AppBarLayout)) {
            ((AppBarLayout) parent).zurt(interfaceC3925y);
        }
        super.onDetachedFromWindow();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        tfm tfmVar = this.f23853v;
        if (tfmVar != null) {
            int iKi = tfmVar.ki();
            int childCount = getChildCount();
            for (int i6 = 0; i6 < childCount; i6++) {
                View childAt = getChildAt(i6);
                if (!C0683f.m3160f(childAt) && childAt.getTop() < iKi) {
                    C0683f.zkd(childAt, iKi);
                }
            }
        }
        int childCount2 = getChildCount();
        for (int i7 = 0; i7 < childCount2; i7++) {
            m14036p(getChildAt(i7)).m14057y();
        }
        m14039z(i2, i3, i4, i5, false);
        o1t();
        fu4();
        int childCount3 = getChildCount();
        for (int i8 = 0; i8 < childCount3; i8++) {
            m14036p(getChildAt(i8)).m14052k();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        zy();
        super.onMeasure(i2, i3);
        int mode = View.MeasureSpec.getMode(i3);
        tfm tfmVar = this.f23853v;
        int iKi = tfmVar != null ? tfmVar.ki() : 0;
        if ((mode == 0 || this.f23854w) && iKi > 0) {
            this.f23835d = iKi;
            super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + iKi, 1073741824));
        }
        if (this.bb && this.f23851t.lvui() > 1) {
            o1t();
            m14039z(0, 0, getMeasuredWidth(), getMeasuredHeight(), true);
            int iO1t = this.f23851t.o1t();
            if (iO1t > 1) {
                this.f67343ab = Math.round(this.f23851t.m14614t()) * (iO1t - 1);
                super.onMeasure(i2, View.MeasureSpec.makeMeasureSpec(getMeasuredHeight() + this.f67343ab, 1073741824));
            }
        }
        ViewGroup viewGroup = this.f23845n;
        if (viewGroup != null) {
            View view = this.f23838g;
            if (view == null || view == this) {
                setMinimumHeight(f7l8(viewGroup));
            } else {
                setMinimumHeight(f7l8(view));
            }
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        Drawable drawable = this.f23834c;
        if (drawable != null) {
            fn3e(drawable, i2, i3);
        }
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public boolean qrj() {
        return this.f23851t.m14608c();
    }

    public void setCollapsedTitleGravity(int i2) {
        this.f23851t.i1(i2);
    }

    public void setCollapsedTitleTextAppearance(@hb int i2) {
        this.f23851t.y9n(i2);
    }

    public void setCollapsedTitleTextColor(@x2 int i2) {
        setCollapsedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setCollapsedTitleTypeface(@dd Typeface typeface) {
        this.f23851t.m14607a(typeface);
    }

    public void setContentScrim(@dd Drawable drawable) {
        Drawable drawable2 = this.f23834c;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f23834c = drawableMutate;
            if (drawableMutate != null) {
                fn3e(drawableMutate, getWidth(), getHeight());
                this.f23834c.setCallback(this);
                this.f23834c.setAlpha(this.f23841j);
            }
            C0683f.h7am(this);
        }
    }

    public void setContentScrimColor(@x2 int i2) {
        setContentScrim(new ColorDrawable(i2));
    }

    public void setContentScrimResource(@fn3e int i2) {
        setContentScrim(C0498q.m2259s(getContext(), i2));
    }

    public void setExpandedTitleColor(@x2 int i2) {
        setExpandedTitleTextColor(ColorStateList.valueOf(i2));
    }

    public void setExpandedTitleGravity(int i2) {
        this.f23851t.y2(i2);
    }

    public void setExpandedTitleMargin(int i2, int i3, int i4, int i5) {
        this.f23850s = i2;
        this.f23847p = i3;
        this.f23839h = i4;
        this.f23840i = i5;
        requestLayout();
    }

    public void setExpandedTitleMarginBottom(int i2) {
        this.f23840i = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginEnd(int i2) {
        this.f23839h = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginStart(int i2) {
        this.f23850s = i2;
        requestLayout();
    }

    public void setExpandedTitleMarginTop(int i2) {
        this.f23847p = i2;
        requestLayout();
    }

    public void setExpandedTitleTextAppearance(@hb int i2) {
        this.f23851t.t8iq(i2);
    }

    public void setExpandedTitleTextColor(@lvui ColorStateList colorStateList) {
        this.f23851t.bo(colorStateList);
    }

    public void setExpandedTitleTypeface(@dd Typeface typeface) {
        this.f23851t.gyi(typeface);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void setExtraMultilineHeightEnabled(boolean z2) {
        this.bb = z2;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void setForceApplySystemWindowInsetTop(boolean z2) {
        this.f23854w = z2;
    }

    @hyr(23)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void setHyphenationFrequency(int i2) {
        this.f23851t.m14609d(i2);
    }

    @hyr(23)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void setLineSpacingAdd(float f2) {
        this.f23851t.vq(f2);
    }

    @hyr(23)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void setLineSpacingMultiplier(@zurt(from = 0.0d) float f2) {
        this.f23851t.qkj8(f2);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void setMaxLines(int i2) {
        this.f23851t.fnq8(i2);
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public void setRtlTextDirectionHeuristicsEnabled(boolean z2) {
        this.f23851t.tfm(z2);
    }

    void setScrimAlpha(int i2) {
        ViewGroup viewGroup;
        if (i2 != this.f23841j) {
            if (this.f23834c != null && (viewGroup = this.f23845n) != null) {
                C0683f.h7am(viewGroup);
            }
            this.f23841j = i2;
            C0683f.h7am(this);
        }
    }

    public void setScrimAnimationDuration(@a9(from = 0) long j2) {
        this.f23833b = j2;
    }

    public void setScrimVisibleHeightTrigger(@a9(from = 0) int i2) {
        if (this.f23832a != i2) {
            this.f23832a = i2;
            fu4();
        }
    }

    public void setScrimsShown(boolean z2) {
        setScrimsShown(z2, C0683f.v0af(this) && !isInEditMode());
    }

    public void setStatusBarScrim(@dd Drawable drawable) {
        Drawable drawable2 = this.f23836e;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f23836e = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f23836e.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.zy.qrj(this.f23836e, C0683f.m3159e(this));
                this.f23836e.setVisible(getVisibility() == 0, false);
                this.f23836e.setCallback(this);
                this.f23836e.setAlpha(this.f23841j);
            }
            C0683f.h7am(this);
        }
    }

    public void setStatusBarScrimColor(@x2 int i2) {
        setStatusBarScrim(new ColorDrawable(i2));
    }

    public void setStatusBarScrimResource(@fn3e int i2) {
        setStatusBarScrim(C0498q.m2259s(getContext(), i2));
    }

    public void setTitle(@dd CharSequence charSequence) {
        this.f23851t.d8wk(charSequence);
        m14034i();
    }

    public void setTitleCollapseMode(int i2) {
        this.f67344bo = i2;
        boolean zN7h = n7h();
        this.f23851t.m14615v(zN7h);
        ViewParent parent = getParent();
        if (parent instanceof AppBarLayout) {
            toq((AppBarLayout) parent);
        }
        if (zN7h && this.f23834c == null) {
            setContentScrimColor(this.f23849r.f7l8(getResources().getDimension(C6095k.g.f78978py)));
        }
    }

    public void setTitleEnabled(boolean z2) {
        if (z2 != this.f23843l) {
            this.f23843l = z2;
            m14034i();
            ni7();
            requestLayout();
        }
    }

    public void setTitlePositionInterpolator(@dd TimeInterpolator timeInterpolator) {
        this.f23851t.qo(timeInterpolator);
    }

    @Override // android.view.View
    public void setVisibility(int i2) {
        super.setVisibility(i2);
        boolean z2 = i2 == 0;
        Drawable drawable = this.f23836e;
        if (drawable != null && drawable.isVisible() != z2) {
            this.f23836e.setVisible(z2, false);
        }
        Drawable drawable2 = this.f23834c;
        if (drawable2 == null || drawable2.isVisible() == z2) {
            return;
        }
        this.f23834c.setVisible(z2, false);
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@lvui Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f23834c || drawable == this.f23836e;
    }

    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public boolean x2() {
        return this.f23854w;
    }

    /* JADX INFO: renamed from: y */
    final int m14042y(@lvui View view) {
        return ((getHeight() - m14036p(view).zy()) - view.getHeight()) - ((FrameLayout.LayoutParams) ((zy) view.getLayoutParams())).bottomMargin;
    }

    public CollapsingToolbarLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.f80145btvn);
    }

    public void setCollapsedTitleTextColor(@lvui ColorStateList colorStateList) {
        this.f23851t.bf2(colorStateList);
    }

    public void setScrimsShown(boolean z2, boolean z3) {
        if (this.f23846o != z2) {
            if (z3) {
                m14035k(z2 ? 255 : 0);
            } else {
                setScrimAlpha(z2 ? 255 : 0);
            }
            this.f23846o = z2;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public CollapsingToolbarLayout(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = bp;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        this.f23842k = true;
        this.f23857z = new Rect();
        this.f23832a = -1;
        this.f23835d = 0;
        this.f67343ab = 0;
        Context context2 = getContext();
        com.google.android.material.internal.toq toqVar = new com.google.android.material.internal.toq(this);
        this.f23851t = toqVar;
        toqVar.g1(C3910k.f23772n);
        toqVar.tfm(false);
        this.f23849r = new C7607k(context2);
        TypedArray typedArrayM14534p = cdj.m14534p(context2, attributeSet, C6095k.kja0.irh, i2, i3, new int[0]);
        toqVar.y2(typedArrayM14534p.getInt(C6095k.kja0.mru, 8388691));
        toqVar.i1(typedArrayM14534p.getInt(C6095k.kja0.vd, 8388627));
        int dimensionPixelSize = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.g6i, 0);
        this.f23840i = dimensionPixelSize;
        this.f23839h = dimensionPixelSize;
        this.f23847p = dimensionPixelSize;
        this.f23850s = dimensionPixelSize;
        int i4 = C6095k.kja0.dwra;
        if (typedArrayM14534p.hasValue(i4)) {
            this.f23850s = typedArrayM14534p.getDimensionPixelSize(i4, 0);
        }
        int i5 = C6095k.kja0.hfwa;
        if (typedArrayM14534p.hasValue(i5)) {
            this.f23839h = typedArrayM14534p.getDimensionPixelSize(i5, 0);
        }
        int i6 = C6095k.kja0.mv;
        if (typedArrayM14534p.hasValue(i6)) {
            this.f23847p = typedArrayM14534p.getDimensionPixelSize(i6, 0);
        }
        int i7 = C6095k.kja0.u4;
        if (typedArrayM14534p.hasValue(i7)) {
            this.f23840i = typedArrayM14534p.getDimensionPixelSize(i7, 0);
        }
        this.f23843l = typedArrayM14534p.getBoolean(C6095k.kja0.nrcs, true);
        setTitle(typedArrayM14534p.getText(C6095k.kja0.qspg));
        toqVar.t8iq(C6095k.n7h.wutb);
        toqVar.y9n(C7397k.x2.f93189wwp);
        int i8 = C6095k.kja0.zc;
        if (typedArrayM14534p.hasValue(i8)) {
            toqVar.t8iq(typedArrayM14534p.getResourceId(i8, 0));
        }
        int i9 = C6095k.kja0.thtw;
        if (typedArrayM14534p.hasValue(i9)) {
            toqVar.y9n(typedArrayM14534p.getResourceId(i9, 0));
        }
        int i10 = C6095k.kja0.e9;
        if (typedArrayM14534p.hasValue(i10)) {
            toqVar.bo(com.google.android.material.resources.zy.m14753k(context2, typedArrayM14534p, i10));
        }
        int i11 = C6095k.kja0.nm;
        if (typedArrayM14534p.hasValue(i11)) {
            toqVar.bf2(com.google.android.material.resources.zy.m14753k(context2, typedArrayM14534p, i11));
        }
        this.f23832a = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.eh, -1);
        int i12 = C6095k.kja0.ek;
        if (typedArrayM14534p.hasValue(i12)) {
            toqVar.fnq8(typedArrayM14534p.getInt(i12, 1));
        }
        int i13 = C6095k.kja0.an;
        if (typedArrayM14534p.hasValue(i13)) {
            toqVar.qo(AnimationUtils.loadInterpolator(context2, typedArrayM14534p.getResourceId(i13, 0)));
        }
        this.f23833b = typedArrayM14534p.getInt(C6095k.kja0.ivs, 600);
        setContentScrim(typedArrayM14534p.getDrawable(C6095k.kja0.hzl));
        setStatusBarScrim(typedArrayM14534p.getDrawable(C6095k.kja0.u3gu));
        setTitleCollapseMode(typedArrayM14534p.getInt(C6095k.kja0.fn9, 0));
        this.f23848q = typedArrayM14534p.getResourceId(C6095k.kja0.fvqg, -1);
        this.f23854w = typedArrayM14534p.getBoolean(C6095k.kja0.ngvg, false);
        this.bb = typedArrayM14534p.getBoolean(C6095k.kja0.h4g, false);
        typedArrayM14534p.recycle();
        setWillNotDraw(false);
        C0683f.kx3(this, new C3926k());
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new zy(getContext(), attributeSet);
    }

    public static class zy extends FrameLayout.LayoutParams {

        /* JADX INFO: renamed from: g */
        public static final int f23861g = 2;

        /* JADX INFO: renamed from: n */
        public static final int f23862n = 1;

        /* JADX INFO: renamed from: q */
        public static final int f23863q = 0;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final float f67345zy = 0.5f;

        /* JADX INFO: renamed from: k */
        int f23864k;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        float f67346toq;

        public zy(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f23864k = 0;
            this.f67346toq = 0.5f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6095k.kja0.h8k);
            this.f23864k = typedArrayObtainStyledAttributes.getInt(C6095k.kja0.jerf, 0);
            m14044q(typedArrayObtainStyledAttributes.getFloat(C6095k.kja0.r8k, 0.5f));
            typedArrayObtainStyledAttributes.recycle();
        }

        /* JADX INFO: renamed from: k */
        public int m14043k() {
            return this.f23864k;
        }

        /* JADX INFO: renamed from: q */
        public void m14044q(float f2) {
            this.f67346toq = f2;
        }

        public float toq() {
            return this.f67346toq;
        }

        public void zy(int i2) {
            this.f23864k = i2;
        }

        public zy(int i2, int i3) {
            super(i2, i3);
            this.f23864k = 0;
            this.f67346toq = 0.5f;
        }

        public zy(int i2, int i3, int i4) {
            super(i2, i3, i4);
            this.f23864k = 0;
            this.f67346toq = 0.5f;
        }

        public zy(@lvui ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f23864k = 0;
            this.f67346toq = 0.5f;
        }

        public zy(@lvui ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f23864k = 0;
            this.f67346toq = 0.5f;
        }

        @hyr(19)
        public zy(@lvui FrameLayout.LayoutParams layoutParams) {
            super(layoutParams);
            this.f23864k = 0;
            this.f67346toq = 0.5f;
        }
    }
}
