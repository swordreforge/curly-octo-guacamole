package com.google.android.material.tabs;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.RippleDrawable;
import android.text.Layout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.C0182a;
import androidx.core.util.qrj;
import androidx.core.view.C0683f;
import androidx.core.view.accessibility.ki;
import androidx.core.view.ki;
import androidx.core.widget.t8r;
import androidx.viewpager.widget.AbstractC1288k;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.animation.C3910k;
import com.google.android.material.badge.C3933k;
import com.google.android.material.internal.C4058z;
import com.google.android.material.shape.C4108p;
import h4b.C6070k;
import ij.C6095k;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import p023g.C6045k;
import p030n.C7397k;
import zy.InterfaceC7845y;
import zy.cdj;
import zy.dd;
import zy.fn3e;
import zy.gvn7;
import zy.hyr;
import zy.lvui;
import zy.nn86;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
@ViewPager.InterfaceC1283n
public class TabLayout extends HorizontalScrollView {

    @cdj(unit = 0)
    private static final int aj = 48;
    private static final int ar = -1;

    @cdj(unit = 0)
    private static final int ay = 72;
    private static final int bc = 300;
    private static final String bd = "TabLayout";

    @cdj(unit = 0)
    static final int be = 8;

    @cdj(unit = 0)
    private static final int bs = 56;
    public static final int cw14 = 1;
    public static final int dy = 1;
    public static final int hp = 0;

    @cdj(unit = 0)
    static final int k0 = 16;
    public static final int k6e = 0;
    public static final int mjvl = 3;
    public static final int s8y = 2;
    public static final int sk1t = 0;
    public static final int tgs = 2;
    public static final int tlhn = 0;
    public static final int vb6 = 2;
    public static final int w97r = 1;
    public static final int xk5 = 1;
    public static final int xy8 = 2;
    public static final int yl25 = 0;
    public static final int zmmu = 1;

    /* JADX INFO: renamed from: a */
    private final int f25129a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    boolean f67907ab;
    private boolean ac;
    private final qrj.InterfaceC0641k<TabView> ad;
    private com.google.android.material.tabs.zy an;
    private ValueAnimator as;
    private qrj ax;

    @dd
    private AbstractC1288k az;

    /* JADX INFO: renamed from: b */
    private final int f25130b;
    private DataSetObserver ba;
    int bb;

    @dd
    ViewPager bg;

    @dd
    private zy bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    int f67908bo;
    int bp;
    private toq bq;
    boolean bv;

    /* JADX INFO: renamed from: c */
    float f25131c;

    /* JADX INFO: renamed from: d */
    int f25132d;

    /* JADX INFO: renamed from: e */
    float f25133e;

    /* JADX INFO: renamed from: f */
    PorterDuff.Mode f25134f;

    /* JADX INFO: renamed from: g */
    int f25135g;

    /* JADX INFO: renamed from: h */
    int f25136h;

    /* JADX INFO: renamed from: i */
    ColorStateList f25137i;

    @dd
    private zy id;
    private final ArrayList<zy> in;

    /* JADX INFO: renamed from: j */
    final int f25138j;

    /* JADX INFO: renamed from: k */
    private final ArrayList<C4143s> f25139k;

    /* JADX INFO: renamed from: l */
    private int f25140l;

    /* JADX INFO: renamed from: m */
    private final int f25141m;

    /* JADX INFO: renamed from: n */
    @lvui
    final C4144y f25142n;

    /* JADX INFO: renamed from: o */
    int f25143o;

    /* JADX INFO: renamed from: p */
    int f25144p;

    /* JADX INFO: renamed from: q */
    @dd
    private C4143s f25145q;

    /* JADX INFO: renamed from: r */
    @lvui
    Drawable f25146r;

    /* JADX INFO: renamed from: s */
    int f25147s;

    /* JADX INFO: renamed from: t */
    ColorStateList f25148t;

    /* JADX INFO: renamed from: u */
    int f25149u;

    /* JADX INFO: renamed from: v */
    int f25150v;

    /* JADX INFO: renamed from: w */
    boolean f25151w;

    /* JADX INFO: renamed from: x */
    private int f25152x;

    /* JADX INFO: renamed from: y */
    int f25153y;

    /* JADX INFO: renamed from: z */
    ColorStateList f25154z;
    private static final int am = C6095k.n7h.dkp2;
    private static final qrj.InterfaceC0641k<C4143s> bu = new qrj.zy(16);

    public final class TabView extends LinearLayout {

        /* JADX INFO: renamed from: g */
        @dd
        private View f25155g;

        /* JADX INFO: renamed from: h */
        @dd
        private ImageView f25156h;

        /* JADX INFO: renamed from: i */
        @dd
        private Drawable f25157i;

        /* JADX INFO: renamed from: k */
        private C4143s f25158k;

        /* JADX INFO: renamed from: n */
        private ImageView f25159n;

        /* JADX INFO: renamed from: p */
        @dd
        private TextView f25160p;

        /* JADX INFO: renamed from: q */
        private TextView f25161q;

        /* JADX INFO: renamed from: s */
        @dd
        private View f25162s;

        /* JADX INFO: renamed from: y */
        @dd
        private C3933k f25164y;

        /* JADX INFO: renamed from: z */
        private int f25165z;

        /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$TabView$k */
        class ViewOnLayoutChangeListenerC4137k implements View.OnLayoutChangeListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ View f25166k;

            ViewOnLayoutChangeListenerC4137k(View view) {
                this.f25166k = view;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                if (this.f25166k.getVisibility() == 0) {
                    TabView.this.ni7(this.f25166k);
                }
            }
        }

        public TabView(@lvui Context context) {
            super(context);
            this.f25165z = 2;
            m14982z(context);
            C0683f.u38j(this, TabLayout.this.f25135g, TabLayout.this.f25153y, TabLayout.this.f25147s, TabLayout.this.f25144p);
            setGravity(17);
            setOrientation(!TabLayout.this.f25151w ? 1 : 0);
            setClickable(true);
            C0683f.ra(this, androidx.core.view.dd.zy(getContext(), 1002));
        }

        private void cdj() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.toq.f23919k) {
                FrameLayout frameLayoutX2 = x2();
                addView(frameLayoutX2);
                viewGroup = frameLayoutX2;
            } else {
                viewGroup = this;
            }
            TextView textView = (TextView) LayoutInflater.from(getContext()).inflate(C6095k.ld6.f79288d3, viewGroup, false);
            this.f25161q = textView;
            viewGroup.addView(textView);
        }

        private void fn3e() {
            if (kja0()) {
                ld6(true);
                View view = this.f25155g;
                if (view != null) {
                    com.google.android.material.badge.toq.m14104p(this.f25164y, view);
                    this.f25155g = null;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @dd
        public C3933k getBadge() {
            return this.f25164y;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @lvui
        public C3933k getOrCreateBadge() {
            if (this.f25164y == null) {
                this.f25164y = C3933k.m14085q(getContext());
            }
            zurt();
            C3933k c3933k = this.f25164y;
            if (c3933k != null) {
                return c3933k;
            }
            throw new IllegalStateException("Unable to create badge");
        }

        /* JADX INFO: renamed from: h */
        private void m14974h() {
            ViewGroup viewGroup;
            if (com.google.android.material.badge.toq.f23919k) {
                FrameLayout frameLayoutX2 = x2();
                addView(frameLayoutX2, 0);
                viewGroup = frameLayoutX2;
            } else {
                viewGroup = this;
            }
            ImageView imageView = (ImageView) LayoutInflater.from(getContext()).inflate(C6095k.ld6.f79303gvn7, viewGroup, false);
            this.f25159n = imageView;
            viewGroup.addView(imageView, 0);
        }

        /* JADX INFO: renamed from: i */
        private void m14975i(@dd View view) {
            if (kja0() && view != null) {
                ld6(false);
                com.google.android.material.badge.toq.m14105q(this.f25164y, view, n7h(view));
                this.f25155g = view;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ki() {
            if (this.f25155g != null) {
                fn3e();
            }
            this.f25164y = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean kja0() {
            return this.f25164y != null;
        }

        private void ld6(boolean z2) {
            setClipChildren(z2);
            setClipToPadding(z2);
            ViewGroup viewGroup = (ViewGroup) getParent();
            if (viewGroup != null) {
                viewGroup.setClipChildren(z2);
                viewGroup.setClipToPadding(z2);
            }
        }

        @dd
        private FrameLayout n7h(@lvui View view) {
            if ((view == this.f25159n || view == this.f25161q) && com.google.android.material.badge.toq.f23919k) {
                return (FrameLayout) view.getParent();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void ni7(@lvui View view) {
            if (kja0() && view == this.f25155g) {
                com.google.android.material.badge.toq.qrj(this.f25164y, view, n7h(view));
            }
        }

        /* JADX INFO: renamed from: p */
        private float m14978p(@lvui Layout layout, int i2, float f2) {
            return layout.getLineWidth(i2) * (f2 / layout.getPaint().getTextSize());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void qrj(@lvui Canvas canvas) {
            Drawable drawable = this.f25157i;
            if (drawable != null) {
                drawable.setBounds(getLeft(), getTop(), getRight(), getBottom());
                this.f25157i.draw(canvas);
            }
        }

        /* JADX INFO: renamed from: s */
        private void m14980s(@dd View view) {
            if (view == null) {
                return;
            }
            view.addOnLayoutChangeListener(new ViewOnLayoutChangeListenerC4137k(view));
        }

        private void wvg(@dd TextView textView, @dd ImageView imageView) {
            C4143s c4143s = this.f25158k;
            Drawable drawableMutate = (c4143s == null || c4143s.m14994y() == null) ? null : androidx.core.graphics.drawable.zy.ki(this.f25158k.m14994y()).mutate();
            if (drawableMutate != null) {
                androidx.core.graphics.drawable.zy.kja0(drawableMutate, TabLayout.this.f25154z);
                PorterDuff.Mode mode = TabLayout.this.f25134f;
                if (mode != null) {
                    androidx.core.graphics.drawable.zy.m2442h(drawableMutate, mode);
                }
            }
            C4143s c4143s2 = this.f25158k;
            CharSequence charSequenceN7h = c4143s2 != null ? c4143s2.n7h() : null;
            if (imageView != null) {
                if (drawableMutate != null) {
                    imageView.setImageDrawable(drawableMutate);
                    imageView.setVisibility(0);
                    setVisibility(0);
                } else {
                    imageView.setVisibility(8);
                    imageView.setImageDrawable(null);
                }
            }
            boolean z2 = !TextUtils.isEmpty(charSequenceN7h);
            if (textView != null) {
                if (z2) {
                    textView.setText(charSequenceN7h);
                    if (this.f25158k.f67910f7l8 == 1) {
                        textView.setVisibility(0);
                    } else {
                        textView.setVisibility(8);
                    }
                    setVisibility(0);
                } else {
                    textView.setVisibility(8);
                    textView.setText((CharSequence) null);
                }
            }
            if (imageView != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                int iM14624n = (z2 && imageView.getVisibility() == 0) ? (int) C4058z.m14624n(getContext(), 8) : 0;
                if (TabLayout.this.f25151w) {
                    if (iM14624n != ki.toq(marginLayoutParams)) {
                        ki.f7l8(marginLayoutParams, iM14624n);
                        marginLayoutParams.bottomMargin = 0;
                        imageView.setLayoutParams(marginLayoutParams);
                        imageView.requestLayout();
                    }
                } else if (iM14624n != marginLayoutParams.bottomMargin) {
                    marginLayoutParams.bottomMargin = iM14624n;
                    ki.f7l8(marginLayoutParams, 0);
                    imageView.setLayoutParams(marginLayoutParams);
                    imageView.requestLayout();
                }
            }
            C4143s c4143s3 = this.f25158k;
            CharSequence charSequence = c4143s3 != null ? c4143s3.f25178q : null;
            if (!z2) {
                charSequenceN7h = charSequence;
            }
            C0182a.m528k(this, charSequenceN7h);
        }

        @lvui
        private FrameLayout x2() {
            FrameLayout frameLayout = new FrameLayout(getContext());
            frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            return frameLayout;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: z */
        public void m14982z(Context context) {
            int i2 = TabLayout.this.f25138j;
            if (i2 != 0) {
                Drawable qVar = C6045k.toq(context, i2);
                this.f25157i = qVar;
                if (qVar != null && qVar.isStateful()) {
                    this.f25157i.setState(getDrawableState());
                }
            } else {
                this.f25157i = null;
            }
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setColor(0);
            Drawable rippleDrawable = gradientDrawable;
            if (TabLayout.this.f25148t != null) {
                GradientDrawable gradientDrawable2 = new GradientDrawable();
                gradientDrawable2.setCornerRadius(1.0E-5f);
                gradientDrawable2.setColor(-1);
                ColorStateList colorStateListM14761k = com.google.android.material.ripple.toq.m14761k(TabLayout.this.f25148t);
                boolean z2 = TabLayout.this.bv;
                GradientDrawable gradientDrawable3 = gradientDrawable;
                if (z2) {
                    gradientDrawable3 = null;
                }
                rippleDrawable = new RippleDrawable(colorStateListM14761k, gradientDrawable3, z2 ? null : gradientDrawable2);
            }
            C0683f.wlev(this, rippleDrawable);
            TabLayout.this.invalidate();
        }

        private void zurt() {
            C4143s c4143s;
            C4143s c4143s2;
            if (kja0()) {
                if (this.f25162s != null) {
                    fn3e();
                    return;
                }
                if (this.f25159n != null && (c4143s2 = this.f25158k) != null && c4143s2.m14994y() != null) {
                    View view = this.f25155g;
                    ImageView imageView = this.f25159n;
                    if (view == imageView) {
                        ni7(imageView);
                        return;
                    } else {
                        fn3e();
                        m14975i(this.f25159n);
                        return;
                    }
                }
                if (this.f25161q == null || (c4143s = this.f25158k) == null || c4143s.x2() != 1) {
                    fn3e();
                    return;
                }
                View view2 = this.f25155g;
                TextView textView = this.f25161q;
                if (view2 == textView) {
                    ni7(textView);
                } else {
                    fn3e();
                    m14975i(this.f25161q);
                }
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        protected void drawableStateChanged() {
            super.drawableStateChanged();
            int[] drawableState = getDrawableState();
            Drawable drawable = this.f25157i;
            boolean state = false;
            if (drawable != null && drawable.isStateful()) {
                state = false | this.f25157i.setState(drawableState);
            }
            if (state) {
                invalidate();
                TabLayout.this.invalidate();
            }
        }

        final void fu4() {
            C4143s c4143s = this.f25158k;
            View viewF7l8 = c4143s != null ? c4143s.f7l8() : null;
            if (viewF7l8 != null) {
                ViewParent parent = viewF7l8.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewF7l8);
                    }
                    addView(viewF7l8);
                }
                this.f25162s = viewF7l8;
                TextView textView = this.f25161q;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f25159n;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f25159n.setImageDrawable(null);
                }
                TextView textView2 = (TextView) viewF7l8.findViewById(R.id.text1);
                this.f25160p = textView2;
                if (textView2 != null) {
                    this.f25165z = t8r.ld6(textView2);
                }
                this.f25156h = (ImageView) viewF7l8.findViewById(R.id.icon);
            } else {
                View view = this.f25162s;
                if (view != null) {
                    removeView(view);
                    this.f25162s = null;
                }
                this.f25160p = null;
                this.f25156h = null;
            }
            if (this.f25162s == null) {
                if (this.f25159n == null) {
                    m14974h();
                }
                if (this.f25161q == null) {
                    cdj();
                    this.f25165z = t8r.ld6(this.f25161q);
                }
                t8r.a9(this.f25161q, TabLayout.this.f25136h);
                ColorStateList colorStateList = TabLayout.this.f25137i;
                if (colorStateList != null) {
                    this.f25161q.setTextColor(colorStateList);
                }
                wvg(this.f25161q, this.f25159n);
                zurt();
                m14980s(this.f25159n);
                m14980s(this.f25161q);
            } else {
                TextView textView3 = this.f25160p;
                if (textView3 != null || this.f25156h != null) {
                    wvg(textView3, this.f25156h);
                }
            }
            if (c4143s != null && !TextUtils.isEmpty(c4143s.f25178q)) {
                setContentDescription(c4143s.f25178q);
            }
            setSelected(c4143s != null && c4143s.kja0());
        }

        int getContentHeight() {
            View[] viewArr = {this.f25161q, this.f25159n, this.f25162s};
            int iMax = 0;
            int iMin = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < 3; i2++) {
                View view = viewArr[i2];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z2 ? Math.min(iMin, view.getTop()) : view.getTop();
                    iMax = z2 ? Math.max(iMax, view.getBottom()) : view.getBottom();
                    z2 = true;
                }
            }
            return iMax - iMin;
        }

        int getContentWidth() {
            View[] viewArr = {this.f25161q, this.f25159n, this.f25162s};
            int iMax = 0;
            int iMin = 0;
            boolean z2 = false;
            for (int i2 = 0; i2 < 3; i2++) {
                View view = viewArr[i2];
                if (view != null && view.getVisibility() == 0) {
                    iMin = z2 ? Math.min(iMin, view.getLeft()) : view.getLeft();
                    iMax = z2 ? Math.max(iMax, view.getRight()) : view.getRight();
                    z2 = true;
                }
            }
            return iMax - iMin;
        }

        @dd
        public C4143s getTab() {
            return this.f25158k;
        }

        final void o1t() {
            setOrientation(!TabLayout.this.f25151w ? 1 : 0);
            TextView textView = this.f25160p;
            if (textView == null && this.f25156h == null) {
                wvg(this.f25161q, this.f25159n);
            } else {
                wvg(textView, this.f25156h);
            }
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(@lvui AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            C3933k c3933k = this.f25164y;
            if (c3933k != null && c3933k.isVisible()) {
                accessibilityNodeInfo.setContentDescription(((Object) getContentDescription()) + ", " + ((Object) this.f25164y.kja0()));
            }
            androidx.core.view.accessibility.ki kiVarR25n = androidx.core.view.accessibility.ki.r25n(accessibilityNodeInfo);
            kiVarR25n.z4(ki.zy.m3073y(0, 1, this.f25158k.ld6(), 1, false, isSelected()));
            if (isSelected()) {
                kiVarR25n.cfr(false);
                kiVarR25n.d8wk(ki.C0656k.f3942p);
            }
            kiVarR25n.pjz9(getResources().getString(C6095k.qrj.f79863x9kr));
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i2, int i3) {
            Layout layout;
            int size = View.MeasureSpec.getSize(i2);
            int mode = View.MeasureSpec.getMode(i2);
            int tabMaxWidth = TabLayout.this.getTabMaxWidth();
            if (tabMaxWidth > 0 && (mode == 0 || size > tabMaxWidth)) {
                i2 = View.MeasureSpec.makeMeasureSpec(TabLayout.this.f25143o, Integer.MIN_VALUE);
            }
            super.onMeasure(i2, i3);
            if (this.f25161q != null) {
                float f2 = TabLayout.this.f25131c;
                int i4 = this.f25165z;
                ImageView imageView = this.f25159n;
                boolean z2 = true;
                if (imageView == null || imageView.getVisibility() != 0) {
                    TextView textView = this.f25161q;
                    if (textView != null && textView.getLineCount() > 1) {
                        f2 = TabLayout.this.f25133e;
                    }
                } else {
                    i4 = 1;
                }
                float textSize = this.f25161q.getTextSize();
                int lineCount = this.f25161q.getLineCount();
                int iLd6 = t8r.ld6(this.f25161q);
                if (f2 != textSize || (iLd6 >= 0 && i4 != iLd6)) {
                    if (TabLayout.this.f25132d == 1 && f2 > textSize && lineCount == 1 && ((layout = this.f25161q.getLayout()) == null || m14978p(layout, 0, f2) > (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight())) {
                        z2 = false;
                    }
                    if (z2) {
                        this.f25161q.setTextSize(0, f2);
                        this.f25161q.setMaxLines(i4);
                        super.onMeasure(i2, i3);
                    }
                }
            }
        }

        @Override // android.view.View
        public boolean performClick() {
            boolean zPerformClick = super.performClick();
            if (this.f25158k == null) {
                return zPerformClick;
            }
            if (!zPerformClick) {
                playSoundEffect(0);
            }
            this.f25158k.ki();
            return true;
        }

        @Override // android.view.View
        public void setSelected(boolean z2) {
            if (isSelected() != z2) {
            }
            super.setSelected(z2);
            TextView textView = this.f25161q;
            if (textView != null) {
                textView.setSelected(z2);
            }
            ImageView imageView = this.f25159n;
            if (imageView != null) {
                imageView.setSelected(z2);
            }
            View view = this.f25162s;
            if (view != null) {
                view.setSelected(z2);
            }
        }

        void setTab(@dd C4143s c4143s) {
            if (c4143s != this.f25158k) {
                this.f25158k = c4143s;
                fu4();
            }
        }

        void t8r() {
            setTab(null);
            setSelected(false);
        }
    }

    private class f7l8 extends DataSetObserver {
        f7l8() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            TabLayout.this.fti();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            TabLayout.this.fti();
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$g */
    public interface InterfaceC4138g extends zy<C4143s> {
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$k */
    class C4139k implements ValueAnimator.AnimatorUpdateListener {
        C4139k() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
            TabLayout.this.scrollTo(((Integer) valueAnimator.getAnimatedValue()).intValue(), 0);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface ld6 {
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$n */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC4140n {
    }

    public static class n7h implements InterfaceC4138g {

        /* JADX INFO: renamed from: k */
        private final ViewPager f25170k;

        public n7h(ViewPager viewPager) {
            this.f25170k = viewPager;
        }

        @Override // com.google.android.material.tabs.TabLayout.zy
        /* JADX INFO: renamed from: k */
        public void mo14983k(@lvui C4143s c4143s) {
            this.f25170k.setCurrentItem(c4143s.ld6());
        }

        @Override // com.google.android.material.tabs.TabLayout.zy
        public void toq(C4143s c4143s) {
        }

        @Override // com.google.android.material.tabs.TabLayout.zy
        public void zy(C4143s c4143s) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$p */
    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface InterfaceC4141p {
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$q */
    public @interface InterfaceC4142q {
    }

    public static class qrj implements ViewPager.InterfaceC1284p {

        /* JADX INFO: renamed from: k */
        @lvui
        private final WeakReference<TabLayout> f25171k;

        /* JADX INFO: renamed from: n */
        private int f25172n;

        /* JADX INFO: renamed from: q */
        private int f25173q;

        public qrj(TabLayout tabLayout) {
            this.f25171k = new WeakReference<>(tabLayout);
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        /* JADX INFO: renamed from: k */
        public void mo5550k(int i2) {
            this.f25173q = this.f25172n;
            this.f25172n = i2;
        }

        /* JADX INFO: renamed from: q */
        void m14984q() {
            this.f25172n = 0;
            this.f25173q = 0;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void toq(int i2) {
            TabLayout tabLayout = this.f25171k.get();
            if (tabLayout == null || tabLayout.getSelectedTabPosition() == i2 || i2 >= tabLayout.getTabCount()) {
                return;
            }
            int i3 = this.f25172n;
            tabLayout.dd(tabLayout.o1t(i2), i3 == 0 || (i3 == 2 && this.f25173q == 0));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1284p
        public void zy(int i2, float f2, int i3) {
            TabLayout tabLayout = this.f25171k.get();
            if (tabLayout != null) {
                int i4 = this.f25172n;
                tabLayout.setScrollPosition(i2, f2, i4 != 2 || this.f25173q == 1, (i4 == 2 && this.f25173q == 0) ? false : true);
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$s */
    public static class C4143s {

        /* JADX INFO: renamed from: ld6, reason: collision with root package name */
        public static final int f67909ld6 = -1;

        /* JADX INFO: renamed from: g */
        @dd
        private View f25174g;

        /* JADX INFO: renamed from: k */
        @dd
        private Object f25175k;

        /* JADX INFO: renamed from: q */
        @dd
        private CharSequence f25178q;

        /* JADX INFO: renamed from: s */
        @lvui
        public TabView f25179s;

        /* JADX INFO: renamed from: toq, reason: collision with root package name */
        @dd
        private Drawable f67911toq;

        /* JADX INFO: renamed from: y */
        @dd
        public TabLayout f25180y;

        /* JADX INFO: renamed from: zy, reason: collision with root package name */
        @dd
        private CharSequence f67912zy;

        /* JADX INFO: renamed from: n */
        private int f25176n = -1;

        /* JADX INFO: renamed from: f7l8, reason: collision with root package name */
        @InterfaceC4142q
        private int f67910f7l8 = 1;

        /* JADX INFO: renamed from: p */
        private int f25177p = -1;

        void a9() {
            TabView tabView = this.f25179s;
            if (tabView != null) {
                tabView.fu4();
            }
        }

        void cdj() {
            this.f25180y = null;
            this.f25179s = null;
            this.f25175k = null;
            this.f67911toq = null;
            this.f25177p = -1;
            this.f67912zy = null;
            this.f25178q = null;
            this.f25176n = -1;
            this.f25174g = null;
        }

        @dd
        public View f7l8() {
            return this.f25174g;
        }

        @lvui
        public C4143s fn3e(@gvn7 int i2) {
            return zurt(LayoutInflater.from(this.f25179s.getContext()).inflate(i2, (ViewGroup) this.f25179s, false));
        }

        @lvui
        public C4143s fu4(@dd Drawable drawable) {
            this.f67911toq = drawable;
            TabLayout tabLayout = this.f25180y;
            if (tabLayout.f25149u == 1 || tabLayout.f25132d == 2) {
                tabLayout.hyr(true);
            }
            a9();
            if (com.google.android.material.badge.toq.f23919k && this.f25179s.kja0() && this.f25179s.f25164y.isVisible()) {
                this.f25179s.invalidate();
            }
            return this;
        }

        @dd
        /* JADX INFO: renamed from: g */
        public CharSequence m14987g() {
            TabView tabView = this.f25179s;
            if (tabView == null) {
                return null;
            }
            return tabView.getContentDescription();
        }

        /* JADX INFO: renamed from: h */
        public void m14988h() {
            this.f25179s.ki();
        }

        @lvui
        /* JADX INFO: renamed from: i */
        public C4143s m14989i(@dd CharSequence charSequence) {
            this.f25178q = charSequence;
            a9();
            return this;
        }

        @lvui
        public C4143s jk(@dd CharSequence charSequence) {
            if (TextUtils.isEmpty(this.f25178q) && !TextUtils.isEmpty(charSequence)) {
                this.f25179s.setContentDescription(charSequence);
            }
            this.f67912zy = charSequence;
            a9();
            return this;
        }

        public void ki() {
            TabLayout tabLayout = this.f25180y;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            tabLayout.m14970r(this);
        }

        public boolean kja0() {
            TabLayout tabLayout = this.f25180y;
            if (tabLayout == null) {
                throw new IllegalArgumentException("Tab not attached to a TabLayout");
            }
            int selectedTabPosition = tabLayout.getSelectedTabPosition();
            return selectedTabPosition != -1 && selectedTabPosition == this.f25176n;
        }

        public int ld6() {
            return this.f25176n;
        }

        @lvui
        public C4143s mcp(@nn86 int i2) {
            TabLayout tabLayout = this.f25180y;
            if (tabLayout != null) {
                return jk(tabLayout.getResources().getText(i2));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @dd
        /* JADX INFO: renamed from: n */
        public C3933k m14990n() {
            return this.f25179s.getBadge();
        }

        @dd
        public CharSequence n7h() {
            return this.f67912zy;
        }

        @lvui
        public C4143s ni7(@fn3e int i2) {
            TabLayout tabLayout = this.f25180y;
            if (tabLayout != null) {
                return fu4(C6045k.toq(tabLayout.getContext(), i2));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        void o1t(int i2) {
            this.f25176n = i2;
        }

        @lvui
        /* JADX INFO: renamed from: p */
        public C3933k m14991p() {
            return this.f25179s.getOrCreateBadge();
        }

        @dd
        public Object qrj() {
            return this.f25175k;
        }

        /* JADX INFO: renamed from: s */
        public int m14992s() {
            return this.f25177p;
        }

        @lvui
        /* JADX INFO: renamed from: t */
        public C4143s m14993t(@dd Object obj) {
            this.f25175k = obj;
            return this;
        }

        @lvui
        public C4143s t8r(@nn86 int i2) {
            TabLayout tabLayout = this.f25180y;
            if (tabLayout != null) {
                return m14989i(tabLayout.getResources().getText(i2));
            }
            throw new IllegalArgumentException("Tab not attached to a TabLayout");
        }

        @lvui
        public C4143s wvg(@InterfaceC4142q int i2) {
            this.f67910f7l8 = i2;
            TabLayout tabLayout = this.f25180y;
            if (tabLayout.f25149u == 1 || tabLayout.f25132d == 2) {
                tabLayout.hyr(true);
            }
            a9();
            if (com.google.android.material.badge.toq.f23919k && this.f25179s.kja0() && this.f25179s.f25164y.isVisible()) {
                this.f25179s.invalidate();
            }
            return this;
        }

        @InterfaceC4142q
        public int x2() {
            return this.f67910f7l8;
        }

        @dd
        /* JADX INFO: renamed from: y */
        public Drawable m14994y() {
            return this.f67911toq;
        }

        @lvui
        /* JADX INFO: renamed from: z */
        public C4143s m14995z(int i2) {
            this.f25177p = i2;
            TabView tabView = this.f25179s;
            if (tabView != null) {
                tabView.setId(i2);
            }
            return this;
        }

        @lvui
        public C4143s zurt(@dd View view) {
            this.f25174g = view;
            a9();
            return this;
        }
    }

    private class toq implements ViewPager.InterfaceC1286s {

        /* JADX INFO: renamed from: k */
        private boolean f25181k;

        toq() {
        }

        /* JADX INFO: renamed from: k */
        void m14996k(boolean z2) {
            this.f25181k = z2;
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC1286s
        /* JADX INFO: renamed from: q */
        public void mo5551q(@lvui ViewPager viewPager, @dd AbstractC1288k abstractC1288k, @dd AbstractC1288k abstractC1288k2) {
            TabLayout tabLayout = TabLayout.this;
            if (tabLayout.bg == viewPager) {
                tabLayout.x9kr(abstractC1288k2, this.f25181k);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP})
    public @interface x2 {
    }

    /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$y */
    class C4144y extends LinearLayout {

        /* JADX INFO: renamed from: g */
        private int f25183g;

        /* JADX INFO: renamed from: k */
        ValueAnimator f25184k;

        /* JADX INFO: renamed from: n */
        float f25185n;

        /* JADX INFO: renamed from: q */
        int f25186q;

        /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$y$k */
        class k implements ValueAnimator.AnimatorUpdateListener {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ View f25188k;

            /* JADX INFO: renamed from: q */
            final /* synthetic */ View f25190q;

            k(View view, View view2) {
                this.f25188k = view;
                this.f25190q = view2;
            }

            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public void onAnimationUpdate(@lvui ValueAnimator valueAnimator) {
                C4144y.this.m15000s(this.f25188k, this.f25190q, valueAnimator.getAnimatedFraction());
            }
        }

        /* JADX INFO: renamed from: com.google.android.material.tabs.TabLayout$y$toq */
        class toq extends AnimatorListenerAdapter {

            /* JADX INFO: renamed from: k */
            final /* synthetic */ int f25191k;

            toq(int i2) {
                this.f25191k = i2;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                C4144y.this.f25186q = this.f25191k;
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                C4144y.this.f25186q = this.f25191k;
            }
        }

        C4144y(Context context) {
            super(context);
            this.f25186q = -1;
            this.f25183g = -1;
            setWillNotDraw(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: g */
        public void m14997g() {
            View childAt = getChildAt(this.f25186q);
            com.google.android.material.tabs.zy zyVar = TabLayout.this.an;
            TabLayout tabLayout = TabLayout.this;
            zyVar.zy(tabLayout, childAt, tabLayout.f25146r);
        }

        /* JADX INFO: renamed from: p */
        private void m14999p(boolean z2, int i2, int i3) {
            View childAt = getChildAt(this.f25186q);
            View childAt2 = getChildAt(i2);
            if (childAt2 == null) {
                m14997g();
                return;
            }
            k kVar = new k(childAt, childAt2);
            if (!z2) {
                this.f25184k.removeAllUpdateListeners();
                this.f25184k.addUpdateListener(kVar);
                return;
            }
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f25184k = valueAnimator;
            valueAnimator.setInterpolator(C3910k.f67312toq);
            valueAnimator.setDuration(i3);
            valueAnimator.setFloatValues(0.0f, 1.0f);
            valueAnimator.addUpdateListener(kVar);
            valueAnimator.addListener(new toq(i2));
            valueAnimator.start();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: s */
        public void m15000s(View view, View view2, float f2) {
            if (view != null && view.getWidth() > 0) {
                com.google.android.material.tabs.zy zyVar = TabLayout.this.an;
                TabLayout tabLayout = TabLayout.this;
                zyVar.mo15006q(tabLayout, view, view2, f2, tabLayout.f25146r);
            } else {
                Drawable drawable = TabLayout.this.f25146r;
                drawable.setBounds(-1, drawable.getBounds().top, -1, TabLayout.this.f25146r.getBounds().bottom);
            }
            C0683f.h7am(this);
        }

        @Override // android.view.View
        public void draw(@lvui Canvas canvas) {
            int iHeight = TabLayout.this.f25146r.getBounds().height();
            if (iHeight < 0) {
                iHeight = TabLayout.this.f25146r.getIntrinsicHeight();
            }
            int i2 = TabLayout.this.f25150v;
            int height = 0;
            if (i2 == 0) {
                height = getHeight() - iHeight;
                iHeight = getHeight();
            } else if (i2 == 1) {
                height = (getHeight() - iHeight) / 2;
                iHeight = (getHeight() + iHeight) / 2;
            } else if (i2 != 2) {
                iHeight = i2 != 3 ? 0 : getHeight();
            }
            if (TabLayout.this.f25146r.getBounds().width() > 0) {
                Rect bounds = TabLayout.this.f25146r.getBounds();
                TabLayout.this.f25146r.setBounds(bounds.left, height, bounds.right, iHeight);
                TabLayout tabLayout = TabLayout.this;
                Drawable drawableKi = tabLayout.f25146r;
                if (tabLayout.f25140l != 0) {
                    drawableKi = androidx.core.graphics.drawable.zy.ki(drawableKi);
                    androidx.core.graphics.drawable.zy.n7h(drawableKi, TabLayout.this.f25140l);
                } else {
                    androidx.core.graphics.drawable.zy.kja0(drawableKi, null);
                }
                drawableKi.draw(canvas);
            }
            super.draw(canvas);
        }

        void f7l8(int i2, float f2) {
            ValueAnimator valueAnimator = this.f25184k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f25184k.cancel();
            }
            this.f25186q = i2;
            this.f25185n = f2;
            m15000s(getChildAt(i2), getChildAt(this.f25186q + 1), this.f25185n);
        }

        /* JADX INFO: renamed from: n */
        float m15001n() {
            return this.f25186q + this.f25185n;
        }

        @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
        protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
            super.onLayout(z2, i2, i3, i4, i5);
            ValueAnimator valueAnimator = this.f25184k;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                m14997g();
            } else {
                m14999p(false, this.f25186q, -1);
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        protected void onMeasure(int i2, int i3) {
            super.onMeasure(i2, i3);
            if (View.MeasureSpec.getMode(i2) != 1073741824) {
                return;
            }
            TabLayout tabLayout = TabLayout.this;
            boolean z2 = true;
            if (tabLayout.f25149u == 1 || tabLayout.f25132d == 2) {
                int childCount = getChildCount();
                int iMax = 0;
                for (int i4 = 0; i4 < childCount; i4++) {
                    View childAt = getChildAt(i4);
                    if (childAt.getVisibility() == 0) {
                        iMax = Math.max(iMax, childAt.getMeasuredWidth());
                    }
                }
                if (iMax <= 0) {
                    return;
                }
                if (iMax * childCount <= getMeasuredWidth() - (((int) C4058z.m14624n(getContext(), 16)) * 2)) {
                    boolean z3 = false;
                    for (int i5 = 0; i5 < childCount; i5++) {
                        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getChildAt(i5).getLayoutParams();
                        if (layoutParams.width != iMax || layoutParams.weight != 0.0f) {
                            layoutParams.width = iMax;
                            layoutParams.weight = 0.0f;
                            z3 = true;
                        }
                    }
                    z2 = z3;
                } else {
                    TabLayout tabLayout2 = TabLayout.this;
                    tabLayout2.f25149u = 0;
                    tabLayout2.hyr(false);
                }
                if (z2) {
                    super.onMeasure(i2, i3);
                }
            }
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onRtlPropertiesChanged(int i2) {
            super.onRtlPropertiesChanged(i2);
        }

        /* JADX INFO: renamed from: q */
        boolean m15002q() {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                if (getChildAt(i2).getWidth() <= 0) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: renamed from: y */
        void m15003y(int i2) {
            Rect bounds = TabLayout.this.f25146r.getBounds();
            TabLayout.this.f25146r.setBounds(bounds.left, 0, bounds.right, i2);
            requestLayout();
        }

        void zy(int i2, int i3) {
            ValueAnimator valueAnimator = this.f25184k;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f25184k.cancel();
            }
            m14999p(true, i2, i3);
        }
    }

    @Deprecated
    public interface zy<T extends C4143s> {
        /* JADX INFO: renamed from: k */
        void mo14983k(T t2);

        void toq(T t2);

        void zy(T t2);
    }

    public TabLayout(@lvui Context context) {
        this(context, null);
    }

    private void cdj(@lvui C4143s c4143s, int i2) {
        c4143s.o1t(i2);
        this.f25139k.add(i2, c4143s);
        int size = this.f25139k.size();
        while (true) {
            i2++;
            if (i2 >= size) {
                return;
            } else {
                this.f25139k.get(i2).o1t(i2);
            }
        }
    }

    @lvui
    private TabView fn3e(@lvui C4143s c4143s) {
        qrj.InterfaceC0641k<TabView> interfaceC0641k = this.ad;
        TabView tabViewMo2983k = interfaceC0641k != null ? interfaceC0641k.mo2983k() : null;
        if (tabViewMo2983k == null) {
            tabViewMo2983k = new TabView(getContext());
        }
        tabViewMo2983k.setTab(c4143s);
        tabViewMo2983k.setFocusable(true);
        tabViewMo2983k.setMinimumWidth(getTabMinWidth());
        if (TextUtils.isEmpty(c4143s.f25178q)) {
            tabViewMo2983k.setContentDescription(c4143s.f67912zy);
        } else {
            tabViewMo2983k.setContentDescription(c4143s.f25178q);
        }
        return tabViewMo2983k;
    }

    private void fu4(@lvui C4143s c4143s) {
        for (int size = this.in.size() - 1; size >= 0; size--) {
            this.in.get(size).toq(c4143s);
        }
    }

    @cdj(unit = 0)
    private int getDefaultHeight() {
        int size = this.f25139k.size();
        boolean z2 = false;
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                C4143s c4143s = this.f25139k.get(i2);
                if (c4143s != null && c4143s.m14994y() != null && !TextUtils.isEmpty(c4143s.n7h())) {
                    z2 = true;
                    break;
                }
                i2++;
            } else {
                break;
            }
        }
        return (!z2 || this.f25151w) ? 48 : 72;
    }

    private int getTabMinWidth() {
        int i2 = this.f25141m;
        if (i2 != -1) {
            return i2;
        }
        int i3 = this.f25132d;
        if (i3 == 0 || i3 == 2) {
            return this.f25129a;
        }
        return 0;
    }

    private int getTabScrollRange() {
        return Math.max(0, ((this.f25142n.getWidth() - getWidth()) - getPaddingLeft()) - getPaddingRight());
    }

    @lvui
    private static ColorStateList ki(int i2, int i3) {
        return new ColorStateList(new int[][]{HorizontalScrollView.SELECTED_STATE_SET, HorizontalScrollView.EMPTY_STATE_SET}, new int[]{i3, i2});
    }

    private int kja0(int i2, float f2) {
        View childAt;
        int i3 = this.f25132d;
        if ((i3 != 0 && i3 != 2) || (childAt = this.f25142n.getChildAt(i2)) == null) {
            return 0;
        }
        int i4 = i2 + 1;
        View childAt2 = i4 < this.f25142n.getChildCount() ? this.f25142n.getChildAt(i4) : null;
        int width = childAt.getWidth();
        int width2 = childAt2 != null ? childAt2.getWidth() : 0;
        int left = (childAt.getLeft() + (width / 2)) - (getWidth() / 2);
        int i5 = (int) ((width + width2) * 0.5f * f2);
        return C0683f.m3159e(this) == 0 ? left + i5 : left - i5;
    }

    /* JADX INFO: renamed from: l */
    private void m14961l() {
        int size = this.f25139k.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.f25139k.get(i2).a9();
        }
    }

    private void ld6(View view) {
        if (!(view instanceof TabItem)) {
            throw new IllegalArgumentException("Only TabItem instances can be added to TabLayout");
        }
        m14963s((TabItem) view);
    }

    private void lvui(int i2) {
        TabView tabView = (TabView) this.f25142n.getChildAt(i2);
        this.f25142n.removeViewAt(i2);
        if (tabView != null) {
            tabView.t8r();
            this.ad.toq(tabView);
        }
        requestLayout();
    }

    private boolean mcp() {
        return getTabMode() == 0 || getTabMode() == 2;
    }

    private void n5r1(@lvui LinearLayout.LayoutParams layoutParams) {
        if (this.f25132d == 1 && this.f25149u == 0) {
            layoutParams.width = 0;
            layoutParams.weight = 1.0f;
        } else {
            layoutParams.width = -2;
            layoutParams.weight = 0.0f;
        }
    }

    private void n7h() {
        int i2 = this.f25132d;
        C0683f.u38j(this.f25142n, (i2 == 0 || i2 == 2) ? Math.max(0, this.f25152x - this.f25135g) : 0, 0, 0, 0);
        int i3 = this.f25132d;
        if (i3 == 0) {
            qrj(this.f25149u);
        } else if (i3 == 1 || i3 == 2) {
            if (this.f25149u == 2) {
                Log.w(bd, "GRAVITY_START is not supported with the current tab mode, GRAVITY_CENTER will be used instead");
            }
            this.f25142n.setGravity(1);
        }
        hyr(true);
    }

    private void ncyb(@dd ViewPager viewPager, boolean z2, boolean z3) {
        ViewPager viewPager2 = this.bg;
        if (viewPager2 != null) {
            qrj qrjVar = this.ax;
            if (qrjVar != null) {
                viewPager2.dd(qrjVar);
            }
            toq toqVar = this.bq;
            if (toqVar != null) {
                this.bg.m5563r(toqVar);
            }
        }
        zy zyVar = this.bl;
        if (zyVar != null) {
            d3(zyVar);
            this.bl = null;
        }
        if (viewPager != null) {
            this.bg = viewPager;
            if (this.ax == null) {
                this.ax = new qrj(this);
            }
            this.ax.m14984q();
            viewPager.zy(this.ax);
            n7h n7hVar = new n7h(viewPager);
            this.bl = n7hVar;
            zy(n7hVar);
            AbstractC1288k adapter = viewPager.getAdapter();
            if (adapter != null) {
                x9kr(adapter, z2);
            }
            if (this.bq == null) {
                this.bq = new toq();
            }
            this.bq.m14996k(z2);
            viewPager.toq(this.bq);
            setScrollPosition(viewPager.getCurrentItem(), 0.0f, true);
        } else {
            this.bg = null;
            x9kr(null, false);
        }
        this.ac = z3;
    }

    private void ni7(@lvui C4143s c4143s) {
        for (int size = this.in.size() - 1; size >= 0; size--) {
            this.in.get(size).mo14983k(c4143s);
        }
    }

    /* JADX INFO: renamed from: p */
    private void m14962p(@lvui C4143s c4143s) {
        TabView tabView = c4143s.f25179s;
        tabView.setSelected(false);
        tabView.setActivated(false);
        this.f25142n.addView(tabView, c4143s.ld6(), t8r());
    }

    private void qrj(int i2) {
        if (i2 == 0) {
            Log.w(bd, "MODE_SCROLLABLE + GRAVITY_FILL is not supported, GRAVITY_START will be used instead");
        } else if (i2 == 1) {
            this.f25142n.setGravity(1);
            return;
        } else if (i2 != 2) {
            return;
        }
        this.f25142n.setGravity(androidx.core.view.qrj.f50865toq);
    }

    /* JADX INFO: renamed from: s */
    private void m14963s(@lvui TabItem tabItem) {
        C4143s c4143sA9 = a9();
        CharSequence charSequence = tabItem.f25126k;
        if (charSequence != null) {
            c4143sA9.jk(charSequence);
        }
        Drawable drawable = tabItem.f25128q;
        if (drawable != null) {
            c4143sA9.fu4(drawable);
        }
        int i2 = tabItem.f25127n;
        if (i2 != 0) {
            c4143sA9.fn3e(i2);
        }
        if (!TextUtils.isEmpty(tabItem.getContentDescription())) {
            c4143sA9.m14989i(tabItem.getContentDescription());
        }
        m14968n(c4143sA9);
    }

    private void setSelectedTabView(int i2) {
        int childCount = this.f25142n.getChildCount();
        if (i2 < childCount) {
            int i3 = 0;
            while (i3 < childCount) {
                View childAt = this.f25142n.getChildAt(i3);
                boolean z2 = true;
                childAt.setSelected(i3 == i2);
                if (i3 != i2) {
                    z2 = false;
                }
                childAt.setActivated(z2);
                i3++;
            }
        }
    }

    @lvui
    private LinearLayout.LayoutParams t8r() {
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -1);
        n5r1(layoutParams);
        return layoutParams;
    }

    private void x2(int i2) {
        if (i2 == -1) {
            return;
        }
        if (getWindowToken() == null || !C0683f.v0af(this) || this.f25142n.m15002q()) {
            setScrollPosition(i2, 0.0f, true);
            return;
        }
        int scrollX = getScrollX();
        int iKja0 = kja0(i2, 0.0f);
        if (scrollX != iKja0) {
            m14964z();
            this.as.setIntValues(scrollX, iKja0);
            this.as.start();
        }
        this.f25142n.zy(i2, this.f67908bo);
    }

    /* JADX INFO: renamed from: z */
    private void m14964z() {
        if (this.as == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.as = valueAnimator;
            valueAnimator.setInterpolator(C3910k.f67312toq);
            this.as.setDuration(this.f67908bo);
            this.as.addUpdateListener(new C4139k());
        }
    }

    private void zurt(@lvui C4143s c4143s) {
        for (int size = this.in.size() - 1; size >= 0; size--) {
            this.in.get(size).zy(c4143s);
        }
    }

    @lvui
    public C4143s a9() {
        C4143s c4143sM14967i = m14967i();
        c4143sM14967i.f25180y = this;
        c4143sM14967i.f25179s = fn3e(c4143sM14967i);
        if (c4143sM14967i.f25177p != -1) {
            c4143sM14967i.f25179s.setId(c4143sM14967i.f25177p);
        }
        return c4143sM14967i;
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view) {
        ld6(view);
    }

    public void d2ok(int i2) {
        C4143s c4143s = this.f25145q;
        int iLd6 = c4143s != null ? c4143s.ld6() : 0;
        lvui(i2);
        C4143s c4143sRemove = this.f25139k.remove(i2);
        if (c4143sRemove != null) {
            c4143sRemove.cdj();
            jp0y(c4143sRemove);
        }
        int size = this.f25139k.size();
        for (int i3 = i2; i3 < size; i3++) {
            this.f25139k.get(i3).o1t(i3);
        }
        if (iLd6 == i2) {
            m14970r(this.f25139k.isEmpty() ? null : this.f25139k.get(Math.max(0, i2 - 1)));
        }
    }

    @Deprecated
    public void d3(@dd zy zyVar) {
        this.in.remove(zyVar);
    }

    public void dd(@dd C4143s c4143s, boolean z2) {
        C4143s c4143s2 = this.f25145q;
        if (c4143s2 == c4143s) {
            if (c4143s2 != null) {
                zurt(c4143s);
                x2(c4143s.ld6());
                return;
            }
            return;
        }
        int iLd6 = c4143s != null ? c4143s.ld6() : -1;
        if (z2) {
            if ((c4143s2 == null || c4143s2.ld6() == -1) && iLd6 != -1) {
                setScrollPosition(iLd6, 0.0f, true);
            } else {
                x2(iLd6);
            }
            if (iLd6 != -1) {
                setSelectedTabView(iLd6);
            }
        }
        this.f25145q = c4143s;
        if (c4143s2 != null) {
            fu4(c4143s2);
        }
        if (c4143s != null) {
            ni7(c4143s);
        }
    }

    public void eqxt(@lvui C4143s c4143s) {
        if (c4143s.f25180y != this) {
            throw new IllegalArgumentException("Tab does not belong to this TabLayout.");
        }
        d2ok(c4143s.ld6());
    }

    public void f7l8(@lvui C4143s c4143s, int i2, boolean z2) {
        if (c4143s.f25180y != this) {
            throw new IllegalArgumentException("Tab belongs to a different TabLayout.");
        }
        cdj(c4143s, i2);
        m14962p(c4143s);
        if (z2) {
            c4143s.ki();
        }
    }

    void fti() {
        int currentItem;
        gvn7();
        AbstractC1288k abstractC1288k = this.az;
        if (abstractC1288k != null) {
            int iMo5575n = abstractC1288k.mo5575n();
            for (int i2 = 0; i2 < iMo5575n; i2++) {
                m14972y(a9().jk(this.az.f7l8(i2)), false);
            }
            ViewPager viewPager = this.bg;
            if (viewPager == null || iMo5575n <= 0 || (currentItem = viewPager.getCurrentItem()) == getSelectedTabPosition() || currentItem >= getTabCount()) {
                return;
            }
            m14970r(o1t(currentItem));
        }
    }

    /* JADX INFO: renamed from: g */
    public void m14965g(@lvui C4143s c4143s, int i2) {
        f7l8(c4143s, i2, this.f25139k.isEmpty());
    }

    public int getSelectedTabPosition() {
        C4143s c4143s = this.f25145q;
        if (c4143s != null) {
            return c4143s.ld6();
        }
        return -1;
    }

    public int getTabCount() {
        return this.f25139k.size();
    }

    public int getTabGravity() {
        return this.f25149u;
    }

    @dd
    public ColorStateList getTabIconTint() {
        return this.f25154z;
    }

    public int getTabIndicatorAnimationMode() {
        return this.bp;
    }

    public int getTabIndicatorGravity() {
        return this.f25150v;
    }

    int getTabMaxWidth() {
        return this.f25143o;
    }

    public int getTabMode() {
        return this.f25132d;
    }

    @dd
    public ColorStateList getTabRippleColor() {
        return this.f25148t;
    }

    @lvui
    public Drawable getTabSelectedIndicator() {
        return this.f25146r;
    }

    @dd
    public ColorStateList getTabTextColors() {
        return this.f25137i;
    }

    public void gvn7() {
        for (int childCount = this.f25142n.getChildCount() - 1; childCount >= 0; childCount--) {
            lvui(childCount);
        }
        Iterator<C4143s> it = this.f25139k.iterator();
        while (it.hasNext()) {
            C4143s next = it.next();
            it.remove();
            next.cdj();
            jp0y(next);
        }
        this.f25145q = null;
    }

    /* JADX INFO: renamed from: h */
    public void m14966h() {
        this.in.clear();
    }

    void hyr(boolean z2) {
        for (int i2 = 0; i2 < this.f25142n.getChildCount(); i2++) {
            View childAt = this.f25142n.getChildAt(i2);
            childAt.setMinimumWidth(getTabMinWidth());
            n5r1((LinearLayout.LayoutParams) childAt.getLayoutParams());
            if (z2) {
                childAt.requestLayout();
            }
        }
    }

    /* JADX INFO: renamed from: i */
    protected C4143s m14967i() {
        C4143s c4143sMo2983k = bu.mo2983k();
        return c4143sMo2983k == null ? new C4143s() : c4143sMo2983k;
    }

    public boolean jk() {
        return this.f67907ab;
    }

    protected boolean jp0y(C4143s c4143s) {
        return bu.toq(c4143s);
    }

    /* JADX INFO: renamed from: n */
    public void m14968n(@lvui C4143s c4143s) {
        m14972y(c4143s, this.f25139k.isEmpty());
    }

    @dd
    public C4143s o1t(int i2) {
        if (i2 < 0 || i2 >= getTabCount()) {
            return null;
        }
        return this.f25139k.get(i2);
    }

    public void oc(@lvui InterfaceC4138g interfaceC4138g) {
        d3(interfaceC4138g);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.ld6.m14843n(this);
        if (this.bg == null) {
            ViewParent parent = getParent();
            if (parent instanceof ViewPager) {
                ncyb((ViewPager) parent, true, true);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.ac) {
            setupWithViewPager(null);
            this.ac = false;
        }
    }

    @Override // android.view.View
    protected void onDraw(@lvui Canvas canvas) {
        for (int i2 = 0; i2 < this.f25142n.getChildCount(); i2++) {
            View childAt = this.f25142n.getChildAt(i2);
            if (childAt instanceof TabView) {
                ((TabView) childAt).qrj(canvas);
            }
        }
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(@lvui AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        androidx.core.view.accessibility.ki.r25n(accessibilityNodeInfo).w831(ki.toq.m3069g(1, getTabCount(), false, 1));
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return mcp() && super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0082  */
    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onMeasure(int r7, int r8) {
        /*
            r6 = this;
            android.content.Context r0 = r6.getContext()
            int r1 = r6.getDefaultHeight()
            float r0 = com.google.android.material.internal.C4058z.m14624n(r0, r1)
            int r0 = java.lang.Math.round(r0)
            int r1 = android.view.View.MeasureSpec.getMode(r8)
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = 1073741824(0x40000000, float:2.0)
            r4 = 0
            r5 = 1
            if (r1 == r2) goto L2e
            if (r1 == 0) goto L1f
            goto L41
        L1f:
            int r8 = r6.getPaddingTop()
            int r0 = r0 + r8
            int r8 = r6.getPaddingBottom()
            int r0 = r0 + r8
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            goto L41
        L2e:
            int r1 = r6.getChildCount()
            if (r1 != r5) goto L41
            int r1 = android.view.View.MeasureSpec.getSize(r8)
            if (r1 < r0) goto L41
            android.view.View r1 = r6.getChildAt(r4)
            r1.setMinimumHeight(r0)
        L41:
            int r0 = android.view.View.MeasureSpec.getSize(r7)
            int r1 = android.view.View.MeasureSpec.getMode(r7)
            if (r1 == 0) goto L5f
            int r1 = r6.f25130b
            if (r1 <= 0) goto L50
            goto L5d
        L50:
            float r0 = (float) r0
            android.content.Context r1 = r6.getContext()
            r2 = 56
            float r1 = com.google.android.material.internal.C4058z.m14624n(r1, r2)
            float r0 = r0 - r1
            int r1 = (int) r0
        L5d:
            r6.f25143o = r1
        L5f:
            super.onMeasure(r7, r8)
            int r7 = r6.getChildCount()
            if (r7 != r5) goto Lad
            android.view.View r7 = r6.getChildAt(r4)
            int r0 = r6.f25132d
            if (r0 == 0) goto L82
            if (r0 == r5) goto L76
            r1 = 2
            if (r0 == r1) goto L82
            goto L8d
        L76:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 == r1) goto L8d
        L80:
            r4 = r5
            goto L8d
        L82:
            int r0 = r7.getMeasuredWidth()
            int r1 = r6.getMeasuredWidth()
            if (r0 >= r1) goto L8d
            goto L80
        L8d:
            if (r4 == 0) goto Lad
            int r0 = r6.getPaddingTop()
            int r1 = r6.getPaddingBottom()
            int r0 = r0 + r1
            android.view.ViewGroup$LayoutParams r1 = r7.getLayoutParams()
            int r1 = r1.height
            int r8 = android.view.ViewGroup.getChildMeasureSpec(r8, r0, r1)
            int r0 = r6.getMeasuredWidth()
            int r0 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r3)
            r7.measure(r0, r8)
        Lad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.tabs.TabLayout.onMeasure(int, int):void");
    }

    @Override // android.widget.HorizontalScrollView, android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8 || mcp()) {
            return super.onTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public void m14969q(@lvui InterfaceC4138g interfaceC4138g) {
        zy(interfaceC4138g);
    }

    /* JADX INFO: renamed from: r */
    public void m14970r(@dd C4143s c4143s) {
        dd(c4143s, true);
    }

    @Override // android.view.View
    @hyr(21)
    public void setElevation(float f2) {
        super.setElevation(f2);
        com.google.android.material.shape.ld6.m14844q(this, f2);
    }

    public void setInlineLabel(boolean z2) {
        if (this.f25151w != z2) {
            this.f25151w = z2;
            for (int i2 = 0; i2 < this.f25142n.getChildCount(); i2++) {
                View childAt = this.f25142n.getChildAt(i2);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).o1t();
                }
            }
            n7h();
        }
    }

    public void setInlineLabelResource(@InterfaceC7845y int i2) {
        setInlineLabel(getResources().getBoolean(i2));
    }

    @Deprecated
    public void setOnTabSelectedListener(@dd InterfaceC4138g interfaceC4138g) {
        setOnTabSelectedListener((zy) interfaceC4138g);
    }

    void setScrollAnimatorListener(Animator.AnimatorListener animatorListener) {
        m14964z();
        this.as.addListener(animatorListener);
    }

    public void setScrollPosition(int i2, float f2, boolean z2) {
        setScrollPosition(i2, f2, z2, true);
    }

    public void setSelectedTabIndicator(@dd Drawable drawable) {
        if (this.f25146r != drawable) {
            if (drawable == null) {
                drawable = new GradientDrawable();
            }
            this.f25146r = drawable;
            int intrinsicHeight = this.bb;
            if (intrinsicHeight == -1) {
                intrinsicHeight = drawable.getIntrinsicHeight();
            }
            this.f25142n.m15003y(intrinsicHeight);
        }
    }

    public void setSelectedTabIndicatorColor(@zy.x2 int i2) {
        this.f25140l = i2;
        hyr(false);
    }

    public void setSelectedTabIndicatorGravity(int i2) {
        if (this.f25150v != i2) {
            this.f25150v = i2;
            C0683f.h7am(this.f25142n);
        }
    }

    @Deprecated
    public void setSelectedTabIndicatorHeight(int i2) {
        this.bb = i2;
        this.f25142n.m15003y(i2);
    }

    public void setTabGravity(int i2) {
        if (this.f25149u != i2) {
            this.f25149u = i2;
            n7h();
        }
    }

    public void setTabIconTint(@dd ColorStateList colorStateList) {
        if (this.f25154z != colorStateList) {
            this.f25154z = colorStateList;
            m14961l();
        }
    }

    public void setTabIconTintResource(@zy.n7h int i2) {
        setTabIconTint(C6045k.m22274k(getContext(), i2));
    }

    public void setTabIndicatorAnimationMode(int i2) {
        this.bp = i2;
        if (i2 == 0) {
            this.an = new com.google.android.material.tabs.zy();
            return;
        }
        if (i2 == 1) {
            this.an = new C4145k();
        } else {
            if (i2 == 2) {
                this.an = new com.google.android.material.tabs.toq();
                return;
            }
            throw new IllegalArgumentException(i2 + " is not a valid TabIndicatorAnimationMode");
        }
    }

    public void setTabIndicatorFullWidth(boolean z2) {
        this.f67907ab = z2;
        this.f25142n.m14997g();
        C0683f.h7am(this.f25142n);
    }

    public void setTabMode(int i2) {
        if (i2 != this.f25132d) {
            this.f25132d = i2;
            n7h();
        }
    }

    public void setTabRippleColor(@dd ColorStateList colorStateList) {
        if (this.f25148t != colorStateList) {
            this.f25148t = colorStateList;
            for (int i2 = 0; i2 < this.f25142n.getChildCount(); i2++) {
                View childAt = this.f25142n.getChildAt(i2);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m14982z(getContext());
                }
            }
        }
    }

    public void setTabRippleColorResource(@zy.n7h int i2) {
        setTabRippleColor(C6045k.m22274k(getContext(), i2));
    }

    public void setTabTextColors(@dd ColorStateList colorStateList) {
        if (this.f25137i != colorStateList) {
            this.f25137i = colorStateList;
            m14961l();
        }
    }

    @Deprecated
    public void setTabsFromPagerAdapter(@dd AbstractC1288k abstractC1288k) {
        x9kr(abstractC1288k, false);
    }

    public void setUnboundedRipple(boolean z2) {
        if (this.bv != z2) {
            this.bv = z2;
            for (int i2 = 0; i2 < this.f25142n.getChildCount(); i2++) {
                View childAt = this.f25142n.getChildAt(i2);
                if (childAt instanceof TabView) {
                    ((TabView) childAt).m14982z(getContext());
                }
            }
        }
    }

    public void setUnboundedRippleResource(@InterfaceC7845y int i2) {
        setUnboundedRipple(getResources().getBoolean(i2));
    }

    public void setupWithViewPager(@dd ViewPager viewPager) {
        setupWithViewPager(viewPager, true);
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return getTabScrollRange() > 0;
    }

    /* JADX INFO: renamed from: t */
    public boolean m14971t() {
        return this.f25151w;
    }

    public boolean wvg() {
        return this.bv;
    }

    void x9kr(@dd AbstractC1288k abstractC1288k, boolean z2) {
        DataSetObserver dataSetObserver;
        AbstractC1288k abstractC1288k2 = this.az;
        if (abstractC1288k2 != null && (dataSetObserver = this.ba) != null) {
            abstractC1288k2.fn3e(dataSetObserver);
        }
        this.az = abstractC1288k;
        if (z2 && abstractC1288k != null) {
            if (this.ba == null) {
                this.ba = new f7l8();
            }
            abstractC1288k.qrj(this.ba);
        }
        fti();
    }

    /* JADX INFO: renamed from: y */
    public void m14972y(@lvui C4143s c4143s, boolean z2) {
        f7l8(c4143s, this.f25139k.size(), z2);
    }

    @Deprecated
    public void zy(@dd zy zyVar) {
        if (this.in.contains(zyVar)) {
            return;
        }
        this.in.add(zyVar);
    }

    public TabLayout(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C6095k.zy.ihy);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2) {
        ld6(view);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return generateDefaultLayoutParams();
    }

    @Deprecated
    public void setOnTabSelectedListener(@dd zy zyVar) {
        zy zyVar2 = this.id;
        if (zyVar2 != null) {
            d3(zyVar2);
        }
        this.id = zyVar;
        if (zyVar != null) {
            zy(zyVar);
        }
    }

    public void setScrollPosition(int i2, float f2, boolean z2, boolean z3) {
        int iRound = Math.round(i2 + f2);
        if (iRound < 0 || iRound >= this.f25142n.getChildCount()) {
            return;
        }
        if (z3) {
            this.f25142n.f7l8(i2, f2);
        }
        ValueAnimator valueAnimator = this.as;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.as.cancel();
        }
        scrollTo(i2 < 0 ? 0 : kja0(i2, f2), 0);
        if (z2) {
            setSelectedTabView(iRound);
        }
    }

    public void setupWithViewPager(@dd ViewPager viewPager, boolean z2) {
        ncyb(viewPager, z2, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public TabLayout(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        int i3 = am;
        super(C6070k.zy(context, attributeSet, i2, i3), attributeSet, i2);
        this.f25139k = new ArrayList<>();
        this.f25146r = new GradientDrawable();
        this.f25140l = 0;
        this.f25143o = Integer.MAX_VALUE;
        this.bb = -1;
        this.in = new ArrayList<>();
        this.ad = new qrj.toq(12);
        Context context2 = getContext();
        setHorizontalScrollBarEnabled(false);
        C4144y c4144y = new C4144y(context2);
        this.f25142n = c4144y;
        super.addView(c4144y, 0, new FrameLayout.LayoutParams(-2, -1));
        int[] iArr = C6095k.kja0.ifu;
        int i4 = C6095k.kja0.a7;
        TypedArray typedArrayM14534p = com.google.android.material.internal.cdj.m14534p(context2, attributeSet, iArr, i2, i3, i4);
        if (getBackground() instanceof ColorDrawable) {
            ColorDrawable colorDrawable = (ColorDrawable) getBackground();
            C4108p c4108p = new C4108p();
            c4108p.m14867x(ColorStateList.valueOf(colorDrawable.getColor()));
            c4108p.m14856e(context2);
            c4108p.zp(C0683f.m3166l(this));
            C0683f.wlev(this, c4108p);
        }
        setSelectedTabIndicator(com.google.android.material.resources.zy.m14754n(context2, typedArrayM14534p, C6095k.kja0.i5c));
        setSelectedTabIndicatorColor(typedArrayM14534p.getColor(C6095k.kja0.wj, 0));
        c4144y.m15003y(typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.gle, -1));
        setSelectedTabIndicatorGravity(typedArrayM14534p.getInt(C6095k.kja0.b03g, 0));
        setTabIndicatorAnimationMode(typedArrayM14534p.getInt(C6095k.kja0.n2wl, 0));
        setTabIndicatorFullWidth(typedArrayM14534p.getBoolean(C6095k.kja0.ha, true));
        int dimensionPixelSize = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.io, 0);
        this.f25144p = dimensionPixelSize;
        this.f25147s = dimensionPixelSize;
        this.f25153y = dimensionPixelSize;
        this.f25135g = dimensionPixelSize;
        this.f25135g = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.gym, dimensionPixelSize);
        this.f25153y = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.m0, this.f25153y);
        this.f25147s = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.mtwi, this.f25147s);
        this.f25144p = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.tzg, this.f25144p);
        int resourceId = typedArrayM14534p.getResourceId(i4, C6095k.n7h.u4);
        this.f25136h = resourceId;
        TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId, C7397k.qrj.yh8z);
        try {
            this.f25131c = typedArrayObtainStyledAttributes.getDimensionPixelSize(C7397k.qrj.lm5, 0);
            this.f25137i = com.google.android.material.resources.zy.m14753k(context2, typedArrayObtainStyledAttributes, C7397k.qrj.bv);
            typedArrayObtainStyledAttributes.recycle();
            int i5 = C6095k.kja0.hkfy;
            if (typedArrayM14534p.hasValue(i5)) {
                this.f25137i = com.google.android.material.resources.zy.m14753k(context2, typedArrayM14534p, i5);
            }
            int i6 = C6095k.kja0.n0wh;
            if (typedArrayM14534p.hasValue(i6)) {
                this.f25137i = ki(this.f25137i.getDefaultColor(), typedArrayM14534p.getColor(i6, 0));
            }
            this.f25154z = com.google.android.material.resources.zy.m14753k(context2, typedArrayM14534p, C6095k.kja0.vaso);
            this.f25134f = C4058z.x2(typedArrayM14534p.getInt(C6095k.kja0.v2, -1), null);
            this.f25148t = com.google.android.material.resources.zy.m14753k(context2, typedArrayM14534p, C6095k.kja0.u1j);
            this.f67908bo = typedArrayM14534p.getInt(C6095k.kja0.rst, 300);
            this.f25141m = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.rr, -1);
            this.f25130b = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.v1uh, -1);
            this.f25138j = typedArrayM14534p.getResourceId(C6095k.kja0.r61, 0);
            this.f25152x = typedArrayM14534p.getDimensionPixelSize(C6095k.kja0.mddg, 0);
            this.f25132d = typedArrayM14534p.getInt(C6095k.kja0.v2k, 1);
            this.f25149u = typedArrayM14534p.getInt(C6095k.kja0.aix, 0);
            this.f25151w = typedArrayM14534p.getBoolean(C6095k.kja0.oml3, false);
            this.bv = typedArrayM14534p.getBoolean(C6095k.kja0.aw19, false);
            typedArrayM14534p.recycle();
            Resources resources = getResources();
            this.f25133e = resources.getDimensionPixelSize(C6095k.g.f78898ga);
            this.f25129a = resources.getDimensionPixelSize(C6095k.g.f78905h4b);
            n7h();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        ld6(view);
    }

    @Override // android.widget.HorizontalScrollView, android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        ld6(view);
    }

    public void setTabTextColors(int i2, int i3) {
        setTabTextColors(ki(i2, i3));
    }

    public void setSelectedTabIndicator(@fn3e int i2) {
        if (i2 != 0) {
            setSelectedTabIndicator(C6045k.toq(getContext(), i2));
        } else {
            setSelectedTabIndicator((Drawable) null);
        }
    }
}
