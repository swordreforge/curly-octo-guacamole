package com.google.android.material.navigation;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.C0130p;
import androidx.appcompat.view.menu.kja0;
import androidx.appcompat.widget.C0182a;
import androidx.core.content.C0498q;
import androidx.core.view.C0683f;
import androidx.core.view.accessibility.ki;
import androidx.core.widget.t8r;
import bap7.C1366k;
import com.google.android.material.animation.C3910k;
import com.google.android.material.badge.C3933k;
import ij.C6095k;
import zy.InterfaceC7829h;
import zy.InterfaceC7833l;
import zy.dd;
import zy.fn3e;
import zy.gvn7;
import zy.hb;
import zy.lvui;
import zy.uv6;
import zy.zurt;

/* JADX INFO: loaded from: classes2.dex */
@uv6({uv6.EnumC7844k.LIBRARY_GROUP})
public abstract class NavigationBarItemView extends FrameLayout implements kja0.InterfaceC0124k {
    private static final C4062q an;
    private static final int bb = -1;
    private static final int[] bp = {R.attr.state_checked};
    private static final C4062q bv;

    /* JADX INFO: renamed from: a */
    private C4062q f24651a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    @dd
    private C3933k f67730ab;

    /* JADX INFO: renamed from: b */
    private ValueAnimator f24652b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private int f67731bo;

    /* JADX INFO: renamed from: c */
    private int f24653c;

    /* JADX INFO: renamed from: d */
    private boolean f24654d;

    /* JADX INFO: renamed from: e */
    @dd
    private C0130p f24655e;

    /* JADX INFO: renamed from: f */
    private final TextView f24656f;

    /* JADX INFO: renamed from: g */
    private float f24657g;

    /* JADX INFO: renamed from: h */
    private boolean f24658h;

    /* JADX INFO: renamed from: i */
    @dd
    private final FrameLayout f24659i;

    /* JADX INFO: renamed from: j */
    @dd
    private ColorStateList f24660j;

    /* JADX INFO: renamed from: k */
    private boolean f24661k;

    /* JADX INFO: renamed from: l */
    private final TextView f24662l;

    /* JADX INFO: renamed from: m */
    @dd
    private Drawable f24663m;

    /* JADX INFO: renamed from: n */
    private int f24664n;

    /* JADX INFO: renamed from: o */
    @dd
    private Drawable f24665o;

    /* JADX INFO: renamed from: p */
    private int f24666p;

    /* JADX INFO: renamed from: q */
    private int f24667q;

    /* JADX INFO: renamed from: r */
    private final ViewGroup f24668r;

    /* JADX INFO: renamed from: s */
    private float f24669s;

    /* JADX INFO: renamed from: t */
    private final ImageView f24670t;

    /* JADX INFO: renamed from: u */
    private boolean f24671u;

    /* JADX INFO: renamed from: v */
    private int f24672v;

    /* JADX INFO: renamed from: w */
    private int f24673w;

    /* JADX INFO: renamed from: x */
    private float f24674x;

    /* JADX INFO: renamed from: y */
    private float f24675y;

    /* JADX INFO: renamed from: z */
    @dd
    private final View f24676z;

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarItemView$k */
    class ViewOnLayoutChangeListenerC4060k implements View.OnLayoutChangeListener {
        ViewOnLayoutChangeListenerC4060k() {
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            if (NavigationBarItemView.this.f24670t.getVisibility() == 0) {
                NavigationBarItemView navigationBarItemView = NavigationBarItemView.this;
                navigationBarItemView.zurt(navigationBarItemView.f24670t);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarItemView$n */
    private static class C4061n extends C4062q {
        private C4061n() {
            super(null);
        }

        @Override // com.google.android.material.navigation.NavigationBarItemView.C4062q
        protected float zy(float f2, float f3) {
            return toq(f2, f3);
        }

        /* synthetic */ C4061n(ViewOnLayoutChangeListenerC4060k viewOnLayoutChangeListenerC4060k) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.navigation.NavigationBarItemView$q */
    private static class C4062q {

        /* JADX INFO: renamed from: k */
        private static final float f24678k = 0.4f;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        private static final float f67732toq = 1.0f;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        private static final float f67733zy = 0.2f;

        private C4062q() {
        }

        /* JADX INFO: renamed from: k */
        protected float m14645k(@zurt(from = 0.0d, to = 1.0d) float f2, @zurt(from = 0.0d, to = 1.0d) float f3) {
            return C3910k.toq(0.0f, 1.0f, f3 == 0.0f ? 0.8f : 0.0f, f3 == 0.0f ? 1.0f : 0.2f, f2);
        }

        /* JADX INFO: renamed from: q */
        public void m14646q(@zurt(from = 0.0d, to = 1.0d) float f2, @zurt(from = 0.0d, to = 1.0d) float f3, @lvui View view) {
            view.setScaleX(toq(f2, f3));
            view.setScaleY(zy(f2, f3));
            view.setAlpha(m14645k(f2, f3));
        }

        protected float toq(@zurt(from = 0.0d, to = 1.0d) float f2, @zurt(from = 0.0d, to = 1.0d) float f3) {
            return C3910k.m13980k(f24678k, 1.0f, f2);
        }

        protected float zy(@zurt(from = 0.0d, to = 1.0d) float f2, @zurt(from = 0.0d, to = 1.0d) float f3) {
            return 1.0f;
        }

        /* synthetic */ C4062q(ViewOnLayoutChangeListenerC4060k viewOnLayoutChangeListenerC4060k) {
            this();
        }
    }

    class toq implements Runnable {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ int f24679k;

        toq(int i2) {
            this.f24679k = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            NavigationBarItemView.this.ni7(this.f24679k);
        }
    }

    class zy implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: k */
        final /* synthetic */ float f24681k;

        zy(float f2) {
            this.f24681k = f2;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            NavigationBarItemView.this.m14637h(((Float) valueAnimator.getAnimatedValue()).floatValue(), this.f24681k);
        }
    }

    static {
        ViewOnLayoutChangeListenerC4060k viewOnLayoutChangeListenerC4060k = null;
        bv = new C4062q(viewOnLayoutChangeListenerC4060k);
        an = new C4061n(viewOnLayoutChangeListenerC4060k);
    }

    public NavigationBarItemView(@lvui Context context) {
        super(context);
        this.f24661k = false;
        this.f24653c = -1;
        this.f24651a = bv;
        this.f24674x = 0.0f;
        this.f24671u = false;
        this.f67731bo = 0;
        this.f24672v = 0;
        this.f24654d = false;
        this.f24673w = 0;
        LayoutInflater.from(context).inflate(getItemLayoutResId(), (ViewGroup) this, true);
        this.f24659i = (FrameLayout) findViewById(C6095k.y.sb1e);
        this.f24676z = findViewById(C6095k.y.z8);
        ImageView imageView = (ImageView) findViewById(C6095k.y.mete);
        this.f24670t = imageView;
        ViewGroup viewGroup = (ViewGroup) findViewById(C6095k.y.zma);
        this.f24668r = viewGroup;
        TextView textView = (TextView) findViewById(C6095k.y.m28);
        this.f24662l = textView;
        TextView textView2 = (TextView) findViewById(C6095k.y.kjd);
        this.f24656f = textView2;
        setBackgroundResource(getItemBackgroundResId());
        this.f24667q = getResources().getDimensionPixelSize(getItemDefaultMarginResId());
        this.f24664n = viewGroup.getPaddingBottom();
        C0683f.o05(textView, 2);
        C0683f.o05(textView2, 2);
        setFocusable(true);
        m14642y(textView.getTextSize(), textView2.getTextSize());
        if (imageView != null) {
            imageView.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC4060k());
        }
    }

    private static void cdj(TextView textView, @hb int i2) {
        t8r.a9(textView, i2);
        int iM14758y = com.google.android.material.resources.zy.m14758y(textView.getContext(), i2, 0);
        if (iM14758y != 0) {
            textView.setTextSize(0, iM14758y);
        }
    }

    private void fn3e(@dd View view) {
        if (ld6()) {
            if (view != null) {
                setClipChildren(true);
                setClipToPadding(true);
                com.google.android.material.badge.toq.m14104p(this.f67730ab, view);
            }
            this.f67730ab = null;
        }
    }

    private void fu4() {
        if (x2()) {
            this.f24651a = an;
        } else {
            this.f24651a = bv;
        }
    }

    private View getIconOrContainer() {
        FrameLayout frameLayout = this.f24659i;
        return frameLayout != null ? frameLayout : this.f24670t;
    }

    private int getItemVisiblePosition() {
        ViewGroup viewGroup = (ViewGroup) getParent();
        int iIndexOfChild = viewGroup.indexOfChild(this);
        int i2 = 0;
        for (int i3 = 0; i3 < iIndexOfChild; i3++) {
            View childAt = viewGroup.getChildAt(i3);
            if ((childAt instanceof NavigationBarItemView) && childAt.getVisibility() == 0) {
                i2++;
            }
        }
        return i2;
    }

    private int getSuggestedIconHeight() {
        C3933k c3933k = this.f67730ab;
        int minimumHeight = c3933k != null ? c3933k.getMinimumHeight() / 2 : 0;
        return Math.max(minimumHeight, ((FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams()).topMargin) + this.f24670t.getMeasuredWidth() + minimumHeight;
    }

    private int getSuggestedIconWidth() {
        C3933k c3933k = this.f67730ab;
        int minimumWidth = c3933k == null ? 0 : c3933k.getMinimumWidth() - this.f67730ab.cdj();
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) getIconOrContainer().getLayoutParams();
        return Math.max(minimumWidth, layoutParams.leftMargin) + this.f24670t.getMeasuredWidth() + Math.max(minimumWidth, layoutParams.rightMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h */
    public void m14637h(@zurt(from = 0.0d, to = 1.0d) float f2, float f3) {
        View view = this.f24676z;
        if (view != null) {
            this.f24651a.m14646q(f2, f3, view);
        }
        this.f24674x = f2;
    }

    /* JADX INFO: renamed from: i */
    private void m14638i(@dd View view) {
        if (ld6() && view != null) {
            setClipChildren(false);
            setClipToPadding(false);
            com.google.android.material.badge.toq.m14105q(this.f67730ab, view, m14640p(view));
        }
    }

    private static void ki(@lvui View view, float f2, float f3, int i2) {
        view.setScaleX(f2);
        view.setScaleY(f3);
        view.setVisibility(i2);
    }

    private boolean ld6() {
        return this.f67730ab != null;
    }

    private void n7h() {
        C0130p c0130p = this.f24655e;
        if (c0130p != null) {
            setChecked(c0130p.isChecked());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void ni7(int i2) {
        if (this.f24676z == null) {
            return;
        }
        int iMin = Math.min(this.f67731bo, i2 - (this.f24673w * 2));
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24676z.getLayoutParams();
        layoutParams.height = x2() ? iMin : this.f24672v;
        layoutParams.width = iMin;
        this.f24676z.setLayoutParams(layoutParams);
    }

    @dd
    /* JADX INFO: renamed from: p */
    private FrameLayout m14640p(View view) {
        ImageView imageView = this.f24670t;
        if (view == imageView && com.google.android.material.badge.toq.f23919k) {
            return (FrameLayout) imageView.getParent();
        }
        return null;
    }

    private void qrj(@zurt(from = 0.0d, to = 1.0d) float f2) {
        if (!this.f24671u || !this.f24661k || !C0683f.zsr0(this)) {
            m14637h(f2, f2);
            return;
        }
        ValueAnimator valueAnimator = this.f24652b;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f24652b = null;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.f24674x, f2);
        this.f24652b = valueAnimatorOfFloat;
        valueAnimatorOfFloat.addUpdateListener(new zy(f2));
        this.f24652b.setInterpolator(C1366k.m5799n(getContext(), C6095k.zy.ia, C3910k.f67312toq));
        this.f24652b.setDuration(C1366k.m5800q(getContext(), C6095k.zy.e10, getResources().getInteger(C6095k.s.f79883fti)));
        this.f24652b.start();
    }

    private static void t8r(@lvui View view, int i2, int i3) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = i2;
        layoutParams.bottomMargin = i2;
        layoutParams.gravity = i3;
        view.setLayoutParams(layoutParams);
    }

    private boolean x2() {
        return this.f24654d && this.f24666p == 2;
    }

    /* JADX INFO: renamed from: y */
    private void m14642y(float f2, float f3) {
        this.f24657g = f2 - f3;
        this.f24675y = (f3 * 1.0f) / f2;
        this.f24669s = (f2 * 1.0f) / f3;
    }

    /* JADX INFO: renamed from: z */
    private static void m14643z(@lvui View view, int i2) {
        view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), view.getPaddingRight(), i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void zurt(View view) {
        if (ld6()) {
            com.google.android.material.badge.toq.qrj(this.f67730ab, view, m14640p(view));
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    /* JADX INFO: renamed from: g */
    public void mo309g(@lvui C0130p c0130p, int i2) {
        this.f24655e = c0130p;
        setCheckable(c0130p.isCheckable());
        setChecked(c0130p.isChecked());
        setEnabled(c0130p.isEnabled());
        setIcon(c0130p.getIcon());
        setTitle(c0130p.getTitle());
        setId(c0130p.getItemId());
        if (!TextUtils.isEmpty(c0130p.getContentDescription())) {
            setContentDescription(c0130p.getContentDescription());
        }
        C0182a.m528k(this, !TextUtils.isEmpty(c0130p.getTooltipText()) ? c0130p.getTooltipText() : c0130p.getTitle());
        setVisibility(c0130p.isVisible() ? 0 : 8);
        this.f24661k = true;
    }

    @dd
    public Drawable getActiveIndicatorDrawable() {
        View view = this.f24676z;
        if (view == null) {
            return null;
        }
        return view.getBackground();
    }

    @dd
    public C3933k getBadge() {
        return this.f67730ab;
    }

    @fn3e
    protected int getItemBackgroundResId() {
        return C6095k.f7l8.f78816uc;
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    @dd
    public C0130p getItemData() {
        return this.f24655e;
    }

    @InterfaceC7829h
    protected int getItemDefaultMarginResId() {
        return C6095k.g.pgi;
    }

    @gvn7
    protected abstract int getItemLayoutResId();

    public int getItemPosition() {
        return this.f24653c;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24668r.getLayoutParams();
        return getSuggestedIconHeight() + layoutParams.topMargin + this.f24668r.getMeasuredHeight() + layoutParams.bottomMargin;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24668r.getLayoutParams();
        return Math.max(getSuggestedIconWidth(), layoutParams.leftMargin + this.f24668r.getMeasuredWidth() + layoutParams.rightMargin);
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    /* JADX INFO: renamed from: k */
    public boolean mo310k() {
        return false;
    }

    void kja0() {
        fn3e(this.f24670t);
    }

    @Override // android.view.ViewGroup, android.view.View
    @lvui
    public int[] onCreateDrawableState(int i2) {
        int[] iArrOnCreateDrawableState = super.onCreateDrawableState(i2 + 1);
        C0130p c0130p = this.f24655e;
        if (c0130p != null && c0130p.isCheckable() && this.f24655e.isChecked()) {
            View.mergeDrawableStates(iArrOnCreateDrawableState, bp);
        }
        return iArrOnCreateDrawableState;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@lvui AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        C3933k c3933k = this.f67730ab;
        if (c3933k != null && c3933k.isVisible()) {
            CharSequence title = this.f24655e.getTitle();
            if (!TextUtils.isEmpty(this.f24655e.getContentDescription())) {
                title = this.f24655e.getContentDescription();
            }
            accessibilityNodeInfo.setContentDescription(((Object) title) + ", " + ((Object) this.f67730ab.kja0()));
        }
        ki kiVarR25n = ki.r25n(accessibilityNodeInfo);
        kiVarR25n.z4(ki.zy.m3073y(0, 1, getItemVisiblePosition(), 1, false, isSelected()));
        if (isSelected()) {
            kiVarR25n.cfr(false);
            kiVarR25n.d8wk(ki.C0656k.f3942p);
        }
        kiVarR25n.pjz9(getResources().getString(C6095k.qrj.f79863x9kr));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        post(new toq(i2));
    }

    /* JADX INFO: renamed from: s */
    void m14644s() {
        kja0();
        this.f24655e = null;
        this.f24674x = 0.0f;
        this.f24661k = false;
    }

    public void setActiveIndicatorDrawable(@dd Drawable drawable) {
        View view = this.f24676z;
        if (view == null) {
            return;
        }
        view.setBackgroundDrawable(drawable);
    }

    public void setActiveIndicatorEnabled(boolean z2) {
        this.f24671u = z2;
        View view = this.f24676z;
        if (view != null) {
            view.setVisibility(z2 ? 0 : 8);
            requestLayout();
        }
    }

    public void setActiveIndicatorHeight(int i2) {
        this.f24672v = i2;
        ni7(getWidth());
    }

    public void setActiveIndicatorMarginHorizontal(@InterfaceC7833l int i2) {
        this.f24673w = i2;
        ni7(getWidth());
    }

    public void setActiveIndicatorResizeable(boolean z2) {
        this.f24654d = z2;
    }

    public void setActiveIndicatorWidth(int i2) {
        this.f67731bo = i2;
        ni7(getWidth());
    }

    void setBadge(@lvui C3933k c3933k) {
        if (this.f67730ab == c3933k) {
            return;
        }
        if (ld6() && this.f24670t != null) {
            Log.w("NavigationBar", "Multiple badges shouldn't be attached to one item.");
            fn3e(this.f24670t);
        }
        this.f67730ab = c3933k;
        ImageView imageView = this.f24670t;
        if (imageView != null) {
            m14638i(imageView);
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setCheckable(boolean z2) {
        refreshDrawableState();
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setChecked(boolean z2) {
        this.f24656f.setPivotX(r0.getWidth() / 2);
        this.f24656f.setPivotY(r0.getBaseline());
        this.f24662l.setPivotX(r0.getWidth() / 2);
        this.f24662l.setPivotY(r0.getBaseline());
        qrj(z2 ? 1.0f : 0.0f);
        int i2 = this.f24666p;
        if (i2 != -1) {
            if (i2 == 0) {
                if (z2) {
                    t8r(getIconOrContainer(), this.f24667q, 49);
                    m14643z(this.f24668r, this.f24664n);
                    this.f24656f.setVisibility(0);
                } else {
                    t8r(getIconOrContainer(), this.f24667q, 17);
                    m14643z(this.f24668r, 0);
                    this.f24656f.setVisibility(4);
                }
                this.f24662l.setVisibility(4);
            } else if (i2 == 1) {
                m14643z(this.f24668r, this.f24664n);
                if (z2) {
                    t8r(getIconOrContainer(), (int) (this.f24667q + this.f24657g), 49);
                    ki(this.f24656f, 1.0f, 1.0f, 0);
                    TextView textView = this.f24662l;
                    float f2 = this.f24675y;
                    ki(textView, f2, f2, 4);
                } else {
                    t8r(getIconOrContainer(), this.f24667q, 49);
                    TextView textView2 = this.f24656f;
                    float f3 = this.f24669s;
                    ki(textView2, f3, f3, 4);
                    ki(this.f24662l, 1.0f, 1.0f, 0);
                }
            } else if (i2 == 2) {
                t8r(getIconOrContainer(), this.f24667q, 17);
                this.f24656f.setVisibility(8);
                this.f24662l.setVisibility(8);
            }
        } else if (this.f24658h) {
            if (z2) {
                t8r(getIconOrContainer(), this.f24667q, 49);
                m14643z(this.f24668r, this.f24664n);
                this.f24656f.setVisibility(0);
            } else {
                t8r(getIconOrContainer(), this.f24667q, 17);
                m14643z(this.f24668r, 0);
                this.f24656f.setVisibility(4);
            }
            this.f24662l.setVisibility(4);
        } else {
            m14643z(this.f24668r, this.f24664n);
            if (z2) {
                t8r(getIconOrContainer(), (int) (this.f24667q + this.f24657g), 49);
                ki(this.f24656f, 1.0f, 1.0f, 0);
                TextView textView3 = this.f24662l;
                float f4 = this.f24675y;
                ki(textView3, f4, f4, 4);
            } else {
                t8r(getIconOrContainer(), this.f24667q, 49);
                TextView textView4 = this.f24656f;
                float f5 = this.f24669s;
                ki(textView4, f5, f5, 4);
                ki(this.f24662l, 1.0f, 1.0f, 0);
            }
        }
        refreshDrawableState();
        setSelected(z2);
    }

    @Override // android.view.View, androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setEnabled(boolean z2) {
        super.setEnabled(z2);
        this.f24662l.setEnabled(z2);
        this.f24656f.setEnabled(z2);
        this.f24670t.setEnabled(z2);
        if (z2) {
            C0683f.ra(this, androidx.core.view.dd.zy(getContext(), 1002));
        } else {
            C0683f.ra(this, null);
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setIcon(@dd Drawable drawable) {
        if (drawable == this.f24665o) {
            return;
        }
        this.f24665o = drawable;
        if (drawable != null) {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                drawable = constantState.newDrawable();
            }
            drawable = androidx.core.graphics.drawable.zy.ki(drawable).mutate();
            this.f24663m = drawable;
            ColorStateList colorStateList = this.f24660j;
            if (colorStateList != null) {
                androidx.core.graphics.drawable.zy.kja0(drawable, colorStateList);
            }
        }
        this.f24670t.setImageDrawable(drawable);
    }

    public void setIconSize(int i2) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24670t.getLayoutParams();
        layoutParams.width = i2;
        layoutParams.height = i2;
        this.f24670t.setLayoutParams(layoutParams);
    }

    public void setIconTintList(@dd ColorStateList colorStateList) {
        Drawable drawable;
        this.f24660j = colorStateList;
        if (this.f24655e == null || (drawable = this.f24663m) == null) {
            return;
        }
        androidx.core.graphics.drawable.zy.kja0(drawable, colorStateList);
        this.f24663m.invalidateSelf();
    }

    public void setItemBackground(int i2) {
        setItemBackground(i2 == 0 ? null : C0498q.m2259s(getContext(), i2));
    }

    public void setItemPaddingBottom(int i2) {
        if (this.f24664n != i2) {
            this.f24664n = i2;
            n7h();
        }
    }

    public void setItemPaddingTop(int i2) {
        if (this.f24667q != i2) {
            this.f24667q = i2;
            n7h();
        }
    }

    public void setItemPosition(int i2) {
        this.f24653c = i2;
    }

    public void setLabelVisibilityMode(int i2) {
        if (this.f24666p != i2) {
            this.f24666p = i2;
            fu4();
            ni7(getWidth());
            n7h();
        }
    }

    public void setShifting(boolean z2) {
        if (this.f24658h != z2) {
            this.f24658h = z2;
            n7h();
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setShortcut(boolean z2, char c2) {
    }

    public void setTextAppearanceActive(@hb int i2) {
        cdj(this.f24656f, i2);
        m14642y(this.f24662l.getTextSize(), this.f24656f.getTextSize());
    }

    public void setTextAppearanceInactive(@hb int i2) {
        cdj(this.f24662l, i2);
        m14642y(this.f24662l.getTextSize(), this.f24656f.getTextSize());
    }

    public void setTextColor(@dd ColorStateList colorStateList) {
        if (colorStateList != null) {
            this.f24662l.setTextColor(colorStateList);
            this.f24656f.setTextColor(colorStateList);
        }
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public void setTitle(@dd CharSequence charSequence) {
        this.f24662l.setText(charSequence);
        this.f24656f.setText(charSequence);
        C0130p c0130p = this.f24655e;
        if (c0130p == null || TextUtils.isEmpty(c0130p.getContentDescription())) {
            setContentDescription(charSequence);
        }
        C0130p c0130p2 = this.f24655e;
        if (c0130p2 != null && !TextUtils.isEmpty(c0130p2.getTooltipText())) {
            charSequence = this.f24655e.getTooltipText();
        }
        C0182a.m528k(this, charSequence);
    }

    @Override // androidx.appcompat.view.menu.kja0.InterfaceC0124k
    public boolean toq() {
        return true;
    }

    public void setItemBackground(@dd Drawable drawable) {
        if (drawable != null && drawable.getConstantState() != null) {
            drawable = drawable.getConstantState().newDrawable().mutate();
        }
        C0683f.wlev(this, drawable);
    }
}
