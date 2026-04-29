package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.n7h;
import androidx.core.view.C0683f;
import androidx.core.view.tfm;
import p030n.C7397k;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"UnknownNullness"})
@zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout extends ViewGroup implements gvn7, androidx.core.view.d3, androidx.core.view.jp0y, androidx.core.view.gvn7 {
    private static final String an = "ActionBarOverlayLayout";
    private static final int id = 600;
    static final int[] in = {C7397k.toq.f42493q, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: a */
    @zy.lvui
    private tfm f623a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    final AnimatorListenerAdapter f46810ab;

    /* JADX INFO: renamed from: b */
    private final Rect f624b;
    private final Runnable bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @zy.lvui
    private tfm f46811bo;
    private final Runnable bp;
    private final androidx.core.view.oc bv;

    /* JADX INFO: renamed from: c */
    private final Rect f625c;

    /* JADX INFO: renamed from: d */
    private OverScroller f626d;

    /* JADX INFO: renamed from: e */
    private final Rect f627e;

    /* JADX INFO: renamed from: f */
    private final Rect f628f;

    /* JADX INFO: renamed from: g */
    ActionBarContainer f629g;

    /* JADX INFO: renamed from: h */
    private boolean f630h;

    /* JADX INFO: renamed from: i */
    private boolean f631i;

    /* JADX INFO: renamed from: j */
    private final Rect f632j;

    /* JADX INFO: renamed from: k */
    private int f633k;

    /* JADX INFO: renamed from: l */
    private int f634l;

    /* JADX INFO: renamed from: m */
    private final Rect f635m;

    /* JADX INFO: renamed from: n */
    private ContentFrameLayout f636n;

    /* JADX INFO: renamed from: o */
    private final Rect f637o;

    /* JADX INFO: renamed from: p */
    private boolean f638p;

    /* JADX INFO: renamed from: q */
    private int f639q;

    /* JADX INFO: renamed from: r */
    private int f640r;

    /* JADX INFO: renamed from: s */
    private Drawable f641s;

    /* JADX INFO: renamed from: t */
    boolean f642t;

    /* JADX INFO: renamed from: u */
    @zy.lvui
    private tfm f643u;

    /* JADX INFO: renamed from: v */
    private InterfaceC0143q f644v;

    /* JADX INFO: renamed from: w */
    ViewPropertyAnimator f645w;

    /* JADX INFO: renamed from: x */
    @zy.lvui
    private tfm f646x;

    /* JADX INFO: renamed from: y */
    private d3 f647y;

    /* JADX INFO: renamed from: z */
    private boolean f648z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$k */
    class C0141k extends AnimatorListenerAdapter {
        C0141k() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f645w = null;
            actionBarOverlayLayout.f642t = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f645w = null;
            actionBarOverlayLayout.f642t = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$n */
    public static class C0142n extends ViewGroup.MarginLayoutParams {
        public C0142n(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public C0142n(int i2, int i3) {
            super(i2, i3);
        }

        public C0142n(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public C0142n(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.ActionBarOverlayLayout$q */
    public interface InterfaceC0143q {
        /* JADX INFO: renamed from: g */
        void mo158g();

        /* JADX INFO: renamed from: k */
        void mo162k();

        /* JADX INFO: renamed from: n */
        void mo165n();

        /* JADX INFO: renamed from: q */
        void mo168q(boolean z2);

        void toq(int i2);

        void zy();
    }

    class toq implements Runnable {
        toq() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.ki();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f645w = actionBarOverlayLayout.f629g.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f46810ab);
        }
    }

    class zy implements Runnable {
        zy() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.ki();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f645w = actionBarOverlayLayout.f629g.animate().translationY(-ActionBarOverlayLayout.this.f629g.getHeight()).setListener(ActionBarOverlayLayout.this.f46810ab);
        }
    }

    public ActionBarOverlayLayout(@zy.lvui Context context) {
        this(context, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private d3 cdj(View view) {
        if (view instanceof d3) {
            return (d3) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    /* JADX INFO: renamed from: k */
    private void m416k() {
        ki();
        this.bp.run();
    }

    private boolean mcp(float f2) {
        this.f626d.fling(0, 0, 0, (int) f2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f626d.getFinalY() > this.f629g.getHeight();
    }

    private void o1t() {
        ki();
        postDelayed(this.bb, 600L);
    }

    /* JADX INFO: renamed from: t */
    private void m417t() {
        ki();
        this.bb.run();
    }

    private void t8r(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(in);
        this.f633k = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f641s = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f638p = context.getApplicationInfo().targetSdkVersion < 19;
        this.f626d = new OverScroller(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean x2(@zy.lvui android.view.View r3, @zy.lvui android.graphics.Rect r4, boolean r5, boolean r6, boolean r7, boolean r8) {
        /*
            r2 = this;
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            androidx.appcompat.widget.ActionBarOverlayLayout$n r3 = (androidx.appcompat.widget.ActionBarOverlayLayout.C0142n) r3
            r0 = 1
            if (r5 == 0) goto L13
            int r5 = r3.leftMargin
            int r1 = r4.left
            if (r5 == r1) goto L13
            r3.leftMargin = r1
            r5 = r0
            goto L14
        L13:
            r5 = 0
        L14:
            if (r6 == 0) goto L1f
            int r6 = r3.topMargin
            int r1 = r4.top
            if (r6 == r1) goto L1f
            r3.topMargin = r1
            r5 = r0
        L1f:
            if (r8 == 0) goto L2a
            int r6 = r3.rightMargin
            int r8 = r4.right
            if (r6 == r8) goto L2a
            r3.rightMargin = r8
            r5 = r0
        L2a:
            if (r7 == 0) goto L35
            int r6 = r3.bottomMargin
            int r4 = r4.bottom
            if (r6 == r4) goto L35
            r3.bottomMargin = r4
            goto L36
        L35:
            r0 = r5
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ActionBarOverlayLayout.x2(android.view.View, android.graphics.Rect, boolean, boolean, boolean, boolean):boolean");
    }

    private void zurt() {
        ki();
        postDelayed(this.bp, 600L);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0142n;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f641s == null || this.f638p) {
            return;
        }
        int bottom = this.f629g.getVisibility() == 0 ? (int) (this.f629g.getBottom() + this.f629g.getTranslationY() + 0.5f) : 0;
        this.f641s.setBounds(0, bottom, getWidth(), this.f641s.getIntrinsicHeight() + bottom);
        this.f641s.draw(canvas);
    }

    @Override // androidx.appcompat.widget.gvn7
    public void f7l8(SparseArray<Parcelable> sparseArray) {
        wvg();
        this.f647y.mcp(sparseArray);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    public boolean fn3e() {
        return this.f630h;
    }

    @Override // androidx.core.view.jp0y
    public void fu4(View view, int i2, int i3, int i4, int i5, int i6) {
        if (i6 == 0) {
            onNestedScroll(view, i2, i3, i4, i5);
        }
    }

    @Override // androidx.appcompat.widget.gvn7
    /* JADX INFO: renamed from: g */
    public boolean mo418g() {
        wvg();
        return this.f647y.mo532g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f629g;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.d3
    public int getNestedScrollAxes() {
        return this.bv.m3397k();
    }

    @Override // androidx.appcompat.widget.gvn7
    public CharSequence getTitle() {
        wvg();
        return this.f647y.getTitle();
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: h */
    public void mo419h(View view, int i2, int i3, int[] iArr, int i4) {
        if (i4 == 0) {
            onNestedPreScroll(view, i2, i3, iArr);
        }
    }

    @Override // androidx.appcompat.widget.gvn7
    public boolean hideOverflowMenu() {
        wvg();
        return this.f647y.hideOverflowMenu();
    }

    /* JADX INFO: renamed from: i */
    public boolean m420i() {
        return this.f648z;
    }

    void ki() {
        removeCallbacks(this.bb);
        removeCallbacks(this.bp);
        ViewPropertyAnimator viewPropertyAnimator = this.f645w;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // androidx.core.view.jp0y
    public void kja0(View view, int i2) {
        if (i2 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.core.view.jp0y
    public void ld6(View view, View view2, int i2, int i3) {
        if (i3 == 0) {
            onNestedScrollAccepted(view, view2, i2);
        }
    }

    @Override // androidx.appcompat.widget.gvn7
    /* JADX INFO: renamed from: n */
    public boolean mo421n() {
        wvg();
        return this.f647y.mo536n();
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
    public C0142n generateLayoutParams(AttributeSet attributeSet) {
        return new C0142n(getContext(), attributeSet);
    }

    @Override // androidx.core.view.gvn7
    public void ni7(View view, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        fu4(view, i2, i3, i4, i5, i6);
    }

    @Override // android.view.View
    @zy.hyr(21)
    public WindowInsets onApplyWindowInsets(@zy.lvui WindowInsets windowInsets) {
        wvg();
        tfm tfmVarD2ok = tfm.d2ok(windowInsets, this);
        boolean zX2 = x2(this.f629g, new Rect(tfmVarD2ok.m3467h(), tfmVarD2ok.ki(), tfmVarD2ok.cdj(), tfmVarD2ok.kja0()), true, true, false, true);
        C0683f.kja0(this, tfmVarD2ok, this.f628f);
        Rect rect = this.f628f;
        tfm tfmVarFu4 = tfmVarD2ok.fu4(rect.left, rect.top, rect.right, rect.bottom);
        this.f623a = tfmVarFu4;
        boolean z2 = true;
        if (!this.f646x.equals(tfmVarFu4)) {
            this.f646x = this.f623a;
            zX2 = true;
        }
        if (this.f625c.equals(this.f628f)) {
            z2 = zX2;
        } else {
            this.f625c.set(this.f628f);
        }
        if (z2) {
            requestLayout();
        }
        return tfmVarD2ok.m3469k().zy().toq().oc();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        t8r(getContext());
        C0683f.m28243do(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ki();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i6 = 0; i6 < childCount; i6++) {
            View childAt = getChildAt(i6);
            if (childAt.getVisibility() != 8) {
                C0142n c0142n = (C0142n) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i7 = ((ViewGroup.MarginLayoutParams) c0142n).leftMargin + paddingLeft;
                int i8 = ((ViewGroup.MarginLayoutParams) c0142n).topMargin + paddingTop;
                childAt.layout(i7, i8, measuredWidth + i7, measuredHeight + i8);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        int measuredHeight;
        wvg();
        measureChildWithMargins(this.f629g, i2, 0, i3, 0);
        C0142n c0142n = (C0142n) this.f629g.getLayoutParams();
        int iMax = Math.max(0, this.f629g.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0142n).leftMargin + ((ViewGroup.MarginLayoutParams) c0142n).rightMargin);
        int iMax2 = Math.max(0, this.f629g.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0142n).topMargin + ((ViewGroup.MarginLayoutParams) c0142n).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f629g.getMeasuredState());
        boolean z2 = (C0683f.m3158d(this) & 256) != 0;
        if (z2) {
            measuredHeight = this.f633k;
            if (this.f631i && this.f629g.getTabContainer() != null) {
                measuredHeight += this.f633k;
            }
        } else {
            measuredHeight = this.f629g.getVisibility() != 8 ? this.f629g.getMeasuredHeight() : 0;
        }
        this.f627e.set(this.f628f);
        tfm tfmVar = this.f623a;
        this.f643u = tfmVar;
        if (this.f630h || z2) {
            this.f643u = new tfm.toq(this.f643u).m3508y(androidx.core.graphics.x2.m2575q(tfmVar.m3467h(), this.f643u.ki() + measuredHeight, this.f643u.cdj(), this.f643u.kja0() + 0)).m3503k();
        } else {
            Rect rect = this.f627e;
            rect.top += measuredHeight;
            rect.bottom += 0;
            this.f643u = tfmVar.fu4(0, measuredHeight, 0, 0);
        }
        x2(this.f636n, this.f627e, true, true, true, true);
        if (!this.f46811bo.equals(this.f643u)) {
            tfm tfmVar2 = this.f643u;
            this.f46811bo = tfmVar2;
            C0683f.m3162h(this.f636n, tfmVar2);
        }
        measureChildWithMargins(this.f636n, i2, 0, i3, 0);
        C0142n c0142n2 = (C0142n) this.f636n.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f636n.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) c0142n2).leftMargin + ((ViewGroup.MarginLayoutParams) c0142n2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f636n.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) c0142n2).topMargin + ((ViewGroup.MarginLayoutParams) c0142n2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f636n.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i2, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i3, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedFling(View view, float f2, float f3, boolean z2) {
        if (!this.f648z || !z2) {
            return false;
        }
        if (mcp(f3)) {
            m416k();
        } else {
            m417t();
        }
        this.f642t = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedPreFling(View view, float f2, float f3) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedPreScroll(View view, int i2, int i3, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedScroll(View view, int i2, int i3, int i4, int i5) {
        int i6 = this.f640r + i3;
        this.f640r = i6;
        setActionBarHideOffset(i6);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedScrollAccepted(View view, View view2, int i2) {
        this.bv.toq(view, view2, i2);
        this.f640r = getActionBarHideOffset();
        ki();
        InterfaceC0143q interfaceC0143q = this.f644v;
        if (interfaceC0143q != null) {
            interfaceC0143q.mo158g();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onStartNestedScroll(View view, View view2, int i2) {
        if ((i2 & 2) == 0 || this.f629g.getVisibility() != 0) {
            return false;
        }
        return this.f648z;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onStopNestedScroll(View view) {
        if (this.f648z && !this.f642t) {
            if (this.f640r <= this.f629g.getHeight()) {
                o1t();
            } else {
                zurt();
            }
        }
        InterfaceC0143q interfaceC0143q = this.f644v;
        if (interfaceC0143q != null) {
            interfaceC0143q.zy();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i2) {
        super.onWindowSystemUiVisibilityChanged(i2);
        wvg();
        int i3 = this.f634l ^ i2;
        this.f634l = i2;
        boolean z2 = (i2 & 4) == 0;
        boolean z3 = (i2 & 256) != 0;
        InterfaceC0143q interfaceC0143q = this.f644v;
        if (interfaceC0143q != null) {
            interfaceC0143q.mo168q(!z3);
            if (z2 || !z3) {
                this.f644v.mo162k();
            } else {
                this.f644v.mo165n();
            }
        }
        if ((i3 & 256) == 0 || this.f644v == null) {
            return;
        }
        C0683f.m28243do(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i2) {
        super.onWindowVisibilityChanged(i2);
        this.f639q = i2;
        InterfaceC0143q interfaceC0143q = this.f644v;
        if (interfaceC0143q != null) {
            interfaceC0143q.toq(i2);
        }
    }

    @Override // androidx.appcompat.widget.gvn7
    /* JADX INFO: renamed from: p */
    public void mo422p(SparseArray<Parcelable> sparseArray) {
        wvg();
        this.f647y.d3(sparseArray);
    }

    @Override // androidx.appcompat.widget.gvn7
    /* JADX INFO: renamed from: q */
    public boolean mo423q() {
        wvg();
        return this.f647y.mo538q();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public C0142n generateDefaultLayoutParams() {
        return new C0142n(-1, -1);
    }

    @Override // androidx.appcompat.widget.gvn7
    /* JADX INFO: renamed from: s */
    public void mo424s() {
        wvg();
        this.f647y.mo542z();
    }

    public void setActionBarHideOffset(int i2) {
        ki();
        this.f629g.setTranslationY(-Math.max(0, Math.min(i2, this.f629g.getHeight())));
    }

    public void setActionBarVisibilityCallback(InterfaceC0143q interfaceC0143q) {
        this.f644v = interfaceC0143q;
        if (getWindowToken() != null) {
            this.f644v.toq(this.f639q);
            int i2 = this.f634l;
            if (i2 != 0) {
                onWindowSystemUiVisibilityChanged(i2);
                C0683f.m28243do(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z2) {
        this.f631i = z2;
    }

    public void setHideOnContentScrollEnabled(boolean z2) {
        if (z2 != this.f648z) {
            this.f648z = z2;
            if (z2) {
                return;
            }
            ki();
            setActionBarHideOffset(0);
        }
    }

    @Override // androidx.appcompat.widget.gvn7
    public void setIcon(int i2) {
        wvg();
        this.f647y.setIcon(i2);
    }

    @Override // androidx.appcompat.widget.gvn7
    public void setLogo(int i2) {
        wvg();
        this.f647y.setLogo(i2);
    }

    @Override // androidx.appcompat.widget.gvn7
    public void setMenu(Menu menu, n7h.InterfaceC0129k interfaceC0129k) {
        wvg();
        this.f647y.setMenu(menu, interfaceC0129k);
    }

    @Override // androidx.appcompat.widget.gvn7
    public void setMenuPrepared() {
        wvg();
        this.f647y.setMenuPrepared();
    }

    public void setOverlayMode(boolean z2) {
        this.f630h = z2;
        this.f638p = z2 && getContext().getApplicationInfo().targetSdkVersion < 19;
    }

    public void setShowingForActionMode(boolean z2) {
    }

    @Override // androidx.appcompat.widget.gvn7
    public void setUiOptions(int i2) {
    }

    @Override // androidx.appcompat.widget.gvn7
    public void setWindowCallback(Window.Callback callback) {
        wvg();
        this.f647y.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.gvn7
    public void setWindowTitle(CharSequence charSequence) {
        wvg();
        this.f647y.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.appcompat.widget.gvn7
    public boolean showOverflowMenu() {
        wvg();
        return this.f647y.showOverflowMenu();
    }

    @Override // androidx.appcompat.widget.gvn7
    public boolean toq() {
        wvg();
        return this.f647y.toq();
    }

    void wvg() {
        if (this.f636n == null) {
            this.f636n = (ContentFrameLayout) findViewById(C7397k.f7l8.f92344toq);
            this.f629g = (ActionBarContainer) findViewById(C7397k.f7l8.f92356zy);
            this.f647y = cdj(findViewById(C7397k.f7l8.f42327k));
        }
    }

    @Override // androidx.appcompat.widget.gvn7
    /* JADX INFO: renamed from: y */
    public void mo425y(int i2) {
        wvg();
        if (i2 == 2) {
            this.f647y.fn3e();
        } else if (i2 == 5) {
            this.f647y.d2ok();
        } else {
            if (i2 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: z */
    public boolean mo426z(View view, View view2, int i2, int i3) {
        return i3 == 0 && onStartNestedScroll(view, view2, i2);
    }

    @Override // androidx.appcompat.widget.gvn7
    public boolean zy() {
        wvg();
        return this.f647y.zy();
    }

    public ActionBarOverlayLayout(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f639q = 0;
        this.f628f = new Rect();
        this.f625c = new Rect();
        this.f627e = new Rect();
        this.f632j = new Rect();
        this.f637o = new Rect();
        this.f635m = new Rect();
        this.f624b = new Rect();
        tfm tfmVar = tfm.f50914zy;
        this.f623a = tfmVar;
        this.f646x = tfmVar;
        this.f643u = tfmVar;
        this.f46811bo = tfmVar;
        this.f46810ab = new C0141k();
        this.bb = new toq();
        this.bp = new zy();
        t8r(context);
        this.bv = new androidx.core.view.oc(this);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new C0142n(layoutParams);
    }

    @Override // androidx.appcompat.widget.gvn7
    public void setIcon(Drawable drawable) {
        wvg();
        this.f647y.setIcon(drawable);
    }
}
