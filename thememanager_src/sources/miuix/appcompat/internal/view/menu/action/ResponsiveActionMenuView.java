package miuix.appcompat.internal.view.menu.action;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import gb.toq;
import java.util.Collection;
import miuix.animation.Folme;
import miuix.animation.base.AnimConfig;
import miuix.animation.listener.TransitionListener;
import miuix.animation.listener.UpdateInfo;
import miuix.appcompat.internal.view.OutDropShadowView;
import miuix.appcompat.internal.view.menu.action.ActionMenuView;
import miuix.core.util.C7084p;
import miuix.core.util.C7093s;
import miuix.core.util.ld6;
import miuix.internal.util.C7164n;
import miuix.internal.util.n7h;
import miuix.smooth.C7334n;
import miuix.view.x2;
import wwp.C7745k;
import zy.dd;
import zy.lvui;

/* JADX INFO: loaded from: classes3.dex */
public class ResponsiveActionMenuView extends ActionMenuView {
    private static final int ac = 196;
    private static final int ad = 8;
    private static final int am = 5;
    private static final int ax = 11;
    private static final int ay = 2;
    private static final String be = "target";
    private static final int bq = 16;

    /* JADX INFO: renamed from: a */
    private int f39458a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private View.OnLayoutChangeListener f86988ab;
    private int an;
    private boolean as;
    private ViewOutlineProvider az;

    /* JADX INFO: renamed from: b */
    private int f39459b;
    private AnimConfig ba;
    private int bb;
    private boolean bg;
    private boolean[] bl;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    @dd
    private Drawable f86989bo;
    private AttributeSet bp;
    private View bv;

    /* JADX INFO: renamed from: c */
    private float f39460c;

    /* JADX INFO: renamed from: d */
    private final x2 f39461d;

    /* JADX INFO: renamed from: e */
    private float f39462e;

    /* JADX INFO: renamed from: f */
    @zy.x2
    private int f39463f;

    /* JADX INFO: renamed from: h */
    private boolean f39464h;

    /* JADX INFO: renamed from: i */
    private boolean f39465i;
    private Rect id;
    private boolean in;

    /* JADX INFO: renamed from: j */
    private float f39466j;

    /* JADX INFO: renamed from: l */
    private int f39467l;

    /* JADX INFO: renamed from: m */
    private int f39468m;

    /* JADX INFO: renamed from: o */
    private int f39469o;

    /* JADX INFO: renamed from: p */
    private boolean f39470p;

    /* JADX INFO: renamed from: r */
    private int f39471r;

    /* JADX INFO: renamed from: s */
    private final Context f39472s;

    /* JADX INFO: renamed from: t */
    private int f39473t;

    /* JADX INFO: renamed from: u */
    private Drawable f39474u;

    /* JADX INFO: renamed from: v */
    private Drawable f39475v;

    /* JADX INFO: renamed from: w */
    private OutDropShadowView f39476w;

    /* JADX INFO: renamed from: x */
    private int f39477x;

    /* JADX INFO: renamed from: z */
    private int f39478z;

    /* JADX INFO: renamed from: miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView$k */
    class C7018k extends ViewOutlineProvider {
        C7018k() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), ResponsiveActionMenuView.this.f39467l);
        }
    }

    class toq extends TransitionListener {
        toq() {
        }

        @Override // miuix.animation.listener.TransitionListener
        public void onUpdate(Object obj, Collection<UpdateInfo> collection) {
            ResponsiveActionMenuView.this.an = UpdateInfo.findByName(collection, "target").getIntValue();
            ResponsiveActionMenuView.this.requestLayout();
        }
    }

    class zy implements x2.InterfaceC7388k {
        zy() {
        }

        @Override // miuix.view.x2.InterfaceC7388k
        /* JADX INFO: renamed from: k */
        public void mo25107k(x2 x2Var) {
            boolean zM25951q = C7164n.m25951q(ResponsiveActionMenuView.this.getContext(), toq.C6055q.fl, true);
            x2Var.x2(x2.f7l8(ResponsiveActionMenuView.this.getContext(), ResponsiveActionMenuView.this.f39470p ? ResponsiveActionMenuView.this.f39475v : ResponsiveActionMenuView.this.f39474u, zM25951q ? C7745k.k.toq.f98862toq : C7745k.k.C8141k.f98860toq), zM25951q ? C7745k.toq.C8142toq.f45385k : C7745k.toq.k.f45384k, 66);
        }

        @Override // miuix.view.x2.InterfaceC7388k
        public void toq(boolean z2) {
        }

        @Override // miuix.view.x2.InterfaceC7388k
        public void zy(boolean z2) {
            ResponsiveActionMenuView.this.bg = z2;
            ResponsiveActionMenuView.this.m25304f();
        }
    }

    public ResponsiveActionMenuView(Context context) {
        this(context, null);
    }

    private int d3(LinearLayout linearLayout) {
        int childCount = linearLayout.getChildCount();
        int measuredHeight = 0;
        for (int i2 = 0; i2 < childCount; i2++) {
            measuredHeight += linearLayout.getChildAt(i2).getMeasuredHeight();
        }
        return measuredHeight;
    }

    private void dd(int i2, int i3, boolean z2) {
        int childCount = getChildCount();
        for (int i4 = 0; i4 < childCount; i4++) {
            View childAt = getChildAt(i4);
            if (!eqxt(childAt)) {
                if (childAt instanceof LinearLayout) {
                    ((LinearLayout) childAt).setGravity(1);
                }
                if (z2) {
                    childAt.setPadding(0, 0, 0, 0);
                } else {
                    childAt.setPadding(0, (!ld6.m25576h(this) || (ld6.n7h(this.f39472s) && !ld6.ki(this.f39472s))) ? this.f39458a : this.f39459b, 0, 0);
                }
                childAt.measure(i2, i3);
            }
        }
    }

    private boolean eqxt(View view) {
        return view == this.bv;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public void m25304f() {
        if (this.f39470p) {
            setOutlineProvider(this.az);
            setBackground(this.bg ? this.f86989bo : this.f39475v);
            return;
        }
        setOutlineProvider(null);
        if (this.f39411y) {
            setBackground(null);
        } else {
            setBackground(this.bg ? this.f86989bo : this.f39474u);
        }
    }

    private int getActionMenuItemCount() {
        int childCount = getChildCount();
        return indexOfChild(this.bv) != -1 ? childCount - 1 : childCount;
    }

    private Rect getCustomViewClipBounds() {
        if (this.id == null) {
            this.id = new Rect();
        }
        this.id.set(0, 0, this.bv.getMeasuredWidth(), this.bv.getMeasuredHeight() - this.an);
        return this.id;
    }

    private int getMaxChildrenTotalHeight() {
        int iD3;
        int childCount = getChildCount();
        int i2 = 0;
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!eqxt(childAt) && (childAt instanceof LinearLayout) && i2 < (iD3 = d3((LinearLayout) childAt))) {
                i2 = iD3;
            }
        }
        return i2;
    }

    /* JADX INFO: renamed from: l */
    private void m25305l(int i2) {
        int childCount = getChildCount();
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt = getChildAt(i3);
            if (!eqxt(childAt) && (childAt instanceof LinearLayout)) {
                ((LinearLayout) childAt).setPadding(0, i2, 0, 0);
            }
        }
    }

    private void lvui() {
        if (this.in) {
            setTranslationY(n7h.m25958p(this));
        }
    }

    private void n5r1(View view) {
        boolean[] zArr;
        if (!C7093s.f87373toq || (zArr = this.bl) == null) {
            return;
        }
        int length = zArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            Object parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                break;
            }
            ((ViewGroup) parent).setClipChildren(this.bl[i2]);
            view = (View) parent;
        }
        this.bl = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public /* synthetic */ void m25306r(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        OutDropShadowView outDropShadowView = this.f39476w;
        if (outDropShadowView != null) {
            outDropShadowView.layout(getLeft(), getTop(), getRight(), getBottom());
        }
    }

    private void x9kr(AttributeSet attributeSet) {
        Context context = this.f39472s;
        if (context == null) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, toq.ki.q9e, toq.C6055q.yx, 0);
            this.f39474u = typedArrayObtainStyledAttributes.getDrawable(toq.ki.tm);
            this.f39475v = typedArrayObtainStyledAttributes.getDrawable(toq.ki.sxq);
            typedArrayObtainStyledAttributes.recycle();
            if (C7084p.m25593g()) {
                this.f86989bo = new ColorDrawable(0);
            }
        } catch (Throwable th) {
            if (typedArrayObtainStyledAttributes != null) {
                typedArrayObtainStyledAttributes.recycle();
            }
            throw th;
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public boolean cdj() {
        return this.f39464h;
    }

    public boolean d2ok() {
        return this.f39470p;
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: g */
    public void mo25100g(boolean z2) {
        this.f39461d.mo25100g(z2);
    }

    public int getBottomMenuCustomViewOffset() {
        return this.an;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public int getCollapsedHeight() {
        if (this.f39465i) {
            return 0;
        }
        int iM25958p = n7h.m25958p(this);
        View view = (View) getParent();
        int measuredHeight = view != null ? view.getMeasuredHeight() : 0;
        if (measuredHeight <= 0) {
            return 0;
        }
        return Math.max(measuredHeight, iM25958p);
    }

    public void gvn7(View view) {
        if (C7093s.f87373toq && this.bl == null) {
            this.bl = new boolean[2];
            for (int i2 = 0; i2 < 2; i2++) {
                Object parent = view.getParent();
                if (!(parent instanceof ViewGroup)) {
                    return;
                }
                ViewGroup viewGroup = (ViewGroup) parent;
                this.bl[i2] = viewGroup.getClipChildren();
                viewGroup.setClipChildren(false);
                view = (View) parent;
            }
        }
    }

    public void hyr() {
        if (this.bv == null || !this.as) {
            return;
        }
        Folme.useValue(new Object[0]).setTo("target", Float.valueOf(this.bv.getMeasuredHeight())).to("target", Float.valueOf(0.0f), this.ba);
        this.as = false;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    /* JADX INFO: renamed from: i */
    public void mo25290i() {
        super.mo25290i();
        mo25100g(false);
        n5r1(this);
        OutDropShadowView outDropShadowView = this.f39476w;
        if (outDropShadowView != null) {
            outDropShadowView.toq();
            ViewGroup viewGroup = (ViewGroup) getParent();
            viewGroup.removeView(this.f39476w);
            viewGroup.removeOnLayoutChangeListener(this.f86988ab);
            this.f39476w = null;
        }
    }

    public void jp0y(@lvui View view) {
        if (view == null) {
            return;
        }
        this.bv = view;
        addView(view);
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, miuix.appcompat.internal.view.menu.x2
    /* JADX INFO: renamed from: k */
    public boolean mo25264k(int i2) {
        View childAt = getChildAt(i2);
        if (eqxt(childAt)) {
            return false;
        }
        ActionMenuView.toq toqVar = (ActionMenuView.toq) childAt.getLayoutParams();
        return (toqVar == null || !toqVar.f39413k) && super.mo25264k(i2);
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: n */
    public boolean mo25102n() {
        return this.f39461d.mo25102n();
    }

    public void ncyb() {
        View view = this.bv;
        if (view == null || view.getParent() == null) {
            return;
        }
        removeView(this.bv);
        this.an = 0;
        this.bv = null;
        this.as = false;
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    protected void ni7() {
        m25304f();
    }

    public void oc() {
        if (this.bv == null || this.as) {
            return;
        }
        Folme.useValue(new Object[0]).setTo("target", Float.valueOf(0.0f)).to("target", Float.valueOf(this.bv.getMeasuredHeight()), this.ba);
        this.as = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (C7093s.f87373toq) {
            if (d2ok()) {
                gvn7(this);
                C7093s.zy(this, this.f39463f, this.f39462e, this.f39466j, this.f39467l);
                return;
            } else {
                n5r1(this);
                C7093s.m25624k(this);
                return;
            }
        }
        if (!d2ok()) {
            OutDropShadowView outDropShadowView = this.f39476w;
            if (outDropShadowView != null) {
                outDropShadowView.toq();
                ViewGroup viewGroup = (ViewGroup) getParent();
                viewGroup.removeOnLayoutChangeListener(this.f86988ab);
                viewGroup.removeView(this.f39476w);
                this.f39476w = null;
                return;
            }
            return;
        }
        if (this.f39476w == null) {
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
            OutDropShadowView outDropShadowView2 = new OutDropShadowView(getContext());
            this.f39476w = outDropShadowView2;
            outDropShadowView2.setShadowHostViewRadius(this.f39467l);
            ViewGroup viewGroup2 = (ViewGroup) getParent();
            viewGroup2.addView(this.f39476w, layoutParams);
            View.OnLayoutChangeListener onLayoutChangeListener = new View.OnLayoutChangeListener() { // from class: miuix.appcompat.internal.view.menu.action.y
                @Override // android.view.View.OnLayoutChangeListener
                public final void onLayoutChange(View view, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
                    this.f39492k.m25306r(view, i2, i3, i4, i5, i6, i7, i8, i9);
                }
            };
            this.f86988ab = onLayoutChangeListener;
            viewGroup2.addOnLayoutChangeListener(onLayoutChangeListener);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        x2 x2Var = this.f39461d;
        if (x2Var != null) {
            x2Var.m26788s();
        }
        int i2 = configuration.densityDpi;
        if (i2 != this.bb) {
            this.bb = i2;
            this.f39478z = ld6.m25581q(this.f39472s, 11.0f);
            this.f39473t = ld6.m25581q(this.f39472s, 16.0f);
            this.f39471r = ld6.m25581q(this.f39472s, 196.0f);
            this.f39459b = ld6.m25581q(this.f39472s, 8.0f);
            this.f39458a = ld6.m25581q(this.f39472s, 5.0f);
            this.f39477x = ld6.m25581q(this.f39472s, 2.0f);
            this.f39467l = getContext().getResources().getDimensionPixelSize(toq.f7l8.c08);
            this.f39460c = r4.getResources().getDimensionPixelSize(toq.f7l8.bz4g);
            this.f39462e = r4.getResources().getDimensionPixelSize(toq.f7l8.ryij);
            this.f39466j = r4.getResources().getDimensionPixelSize(toq.f7l8.hk2l);
            if (C7093s.f87373toq) {
                if (d2ok()) {
                    C7093s.zy(this, this.f39463f, this.f39462e, this.f39466j, this.f39460c);
                } else {
                    C7093s.m25624k(this);
                }
            }
            x9kr(this.bp);
            m25304f();
            OutDropShadowView outDropShadowView = this.f39476w;
            if (outDropShadowView != null) {
                outDropShadowView.setShadowHostViewRadius(this.f39467l);
            }
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        mo25100g(false);
        super.onDetachedFromWindow();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void onLayout(boolean r8, int r9, int r10, int r11, int r12) {
        /*
            r7 = this;
            int r8 = r7.getMeasuredWidth()
            int r9 = r7.getMeasuredHeight()
            boolean r10 = r7.f39464h
            r11 = 8
            r12 = 0
            if (r10 == 0) goto L30
            android.view.View r8 = r7.bv
            if (r8 == 0) goto L2f
            int r8 = r8.getVisibility()
            if (r8 == r11) goto L2f
            android.view.View r1 = r7.bv
            int r8 = r1.getMeasuredWidth()
            int r4 = r8 + 0
            android.view.View r8 = r7.bv
            int r8 = r8.getMeasuredHeight()
            int r5 = r8 + 0
            r2 = 0
            r3 = 0
            r0 = r7
            miuix.internal.util.n7h.kja0(r0, r1, r2, r3, r4, r5)
        L2f:
            return
        L30:
            android.view.View r10 = r7.bv
            if (r10 == 0) goto L5c
            int r10 = r10.getVisibility()
            if (r10 == r11) goto L5c
            android.view.View r1 = r7.bv
            int r10 = r1.getMeasuredWidth()
            int r4 = r10 + 0
            android.view.View r10 = r7.bv
            int r10 = r10.getMeasuredHeight()
            int r5 = r10 + 0
            r2 = 0
            r3 = 0
            r0 = r7
            miuix.internal.util.n7h.kja0(r0, r1, r2, r3, r4, r5)
            android.view.View r10 = r7.bv
            int r10 = r10.getMeasuredHeight()
            int r10 = r10 + r12
            int r11 = r7.an
            int r10 = r10 - r11
            if (r10 >= 0) goto L5d
        L5c:
            r10 = r12
        L5d:
            int r11 = r7.getChildCount()
            int r0 = r7.getActionMenuItemCount()
            int r1 = r7.getPaddingStart()
            int r8 = r8 - r1
            int r1 = r7.getPaddingEnd()
            int r8 = r8 - r1
            int r1 = r7.f39469o
            int r1 = r1 * r0
            int r0 = r0 + (-1)
            int r2 = r7.f39478z
            int r0 = r0 * r2
            int r1 = r1 + r0
            int r0 = r7.getPaddingStart()
            int r8 = r8 - r1
            int r8 = r8 / 2
            int r0 = r0 + r8
            r8 = r0
        L81:
            if (r12 >= r11) goto La7
            android.view.View r6 = r7.getChildAt(r12)
            boolean r0 = r7.eqxt(r6)
            if (r0 == 0) goto L8e
            goto La4
        L8e:
            int r0 = r6.getMeasuredWidth()
            int r4 = r8 + r0
            r0 = r7
            r1 = r6
            r2 = r8
            r3 = r10
            r5 = r9
            miuix.internal.util.n7h.kja0(r0, r1, r2, r3, r4, r5)
            int r0 = r6.getMeasuredWidth()
            int r1 = r7.f39478z
            int r0 = r0 + r1
            int r8 = r8 + r0
        La4:
            int r12 = r12 + 1
            goto L81
        La7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.appcompat.internal.view.menu.action.ResponsiveActionMenuView.onLayout(boolean, int, int, int, int):void");
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView, android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        this.f39464h = false;
        this.f39465i = false;
        int paddingBottom = getPaddingBottom();
        int paddingTop = getPaddingTop() + paddingBottom;
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int childCount = getChildCount();
        int actionMenuItemCount = getActionMenuItemCount();
        int size = View.MeasureSpec.getSize(i2);
        if (childCount == 0 || actionMenuItemCount == 0) {
            this.f39468m = 0;
            View view = this.bv;
            if (view == null || view.getVisibility() == 8) {
                this.f39465i = true;
                setMeasuredDimension(0, 0);
            } else {
                this.f39464h = true;
                ActionMenuView.toq toqVar = (ActionMenuView.toq) this.bv.getLayoutParams();
                if (this.f39470p) {
                    this.bv.measure(View.MeasureSpec.makeMeasureSpec(size - (this.f39473t * 2), 1073741824), ViewGroup.getChildMeasureSpec(i3, paddingTop, ((LinearLayout.LayoutParams) toqVar).height));
                } else {
                    this.bv.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), ViewGroup.getChildMeasureSpec(i3, paddingTop, ((LinearLayout.LayoutParams) toqVar).height));
                }
                this.bv.setClipBounds(getCustomViewClipBounds());
                int measuredWidth = this.bv.getMeasuredWidth();
                int measuredHeight = ((this.bv.getMeasuredHeight() + 0) + paddingTop) - this.an;
                setMeasuredDimension(measuredWidth, measuredHeight >= 0 ? measuredHeight : 0);
            }
            lvui();
            return;
        }
        if (this.f39470p) {
            this.f39469o = ld6.m25581q(this.f39472s, 115.0f);
            int iM25581q = ld6.m25581q(this.f39472s, 80.0f);
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iM25581q, Integer.MIN_VALUE);
            int i4 = (actionMenuItemCount - 1) * this.f39478z;
            int i5 = (this.f39469o * actionMenuItemCount) + i4;
            int i6 = this.f39473t;
            if (i5 >= size - (i6 * 2)) {
                this.f39469o = (((size - paddingLeft) - (i6 * 2)) - i4) / actionMenuItemCount;
            }
            dd(View.MeasureSpec.makeMeasureSpec(this.f39469o, 1073741824), iMakeMeasureSpec, true);
            m25305l((iM25581q - (getMaxChildrenTotalHeight() + (this.f39477x * 2))) / 2);
            this.f39468m = iM25581q;
            size = Math.max((this.f39469o * actionMenuItemCount) + paddingLeft + i4, this.f39471r);
        } else {
            this.f39469o = ((size - paddingLeft) - ((actionMenuItemCount - 1) * this.f39478z)) / actionMenuItemCount;
            int iM25581q2 = ld6.m25581q(getContext(), 64.0f) + paddingBottom;
            dd(View.MeasureSpec.makeMeasureSpec(this.f39469o, 1073741824), View.MeasureSpec.makeMeasureSpec(iM25581q2, 1073741824), this.f39470p);
            this.f39468m = iM25581q2;
        }
        int measuredHeight2 = 0 + this.f39468m + paddingTop;
        if (!this.f39470p) {
            measuredHeight2 -= paddingBottom;
        }
        View view2 = this.bv;
        if (view2 != null && view2.getVisibility() != 8) {
            this.bv.measure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), ViewGroup.getChildMeasureSpec(i3, paddingTop, ((LinearLayout.LayoutParams) ((ActionMenuView.toq) this.bv.getLayoutParams())).height));
            this.bv.setClipBounds(getCustomViewClipBounds());
            measuredHeight2 = (measuredHeight2 + this.bv.getMeasuredHeight()) - this.an;
        }
        setMeasuredDimension(size, measuredHeight2);
        lvui();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(parcelable);
        mo25100g(false);
    }

    @Override // miuix.view.toq
    /* JADX INFO: renamed from: q */
    public boolean mo25103q() {
        return this.f39461d.mo25103q();
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    /* JADX INFO: renamed from: s */
    protected void mo25292s() {
        setBackground(null);
    }

    public void setBottomMenuCustomViewTranslationYWithPx(int i2) {
        if (this.bv == null || i2 < 0) {
            return;
        }
        this.an = i2;
        requestLayout();
    }

    @Override // miuix.view.toq
    public void setEnableBlur(boolean z2) {
        this.f39461d.setEnableBlur(z2);
        if (z2) {
            mo25100g(true);
        }
    }

    public void setHidden(boolean z2) {
        this.in = z2;
    }

    @Override // miuix.view.toq
    public void setSupportBlur(boolean z2) {
        this.f39461d.setSupportBlur(z2);
    }

    public void setSuspendEnabled(boolean z2) {
        if (this.f39470p != z2) {
            this.f39470p = z2;
            this.f39461d.ld6();
            this.f39461d.m26787p();
        }
        m25304f();
    }

    @Override // android.view.View
    public void setTranslationY(float f2) {
        super.setTranslationY(f2);
        OutDropShadowView outDropShadowView = this.f39476w;
        if (outDropShadowView != null) {
            outDropShadowView.setTranslationY(f2);
        }
    }

    @Override // miuix.appcompat.internal.view.menu.action.ActionMenuView
    public void t8r(int i2, float f2, boolean z2, boolean z3) {
    }

    @Override // miuix.view.toq
    public boolean zy() {
        return this.f39461d.zy();
    }

    public ResponsiveActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f39470p = false;
        this.f39464h = false;
        this.f39465i = false;
        this.f39476w = null;
        this.f86988ab = null;
        this.an = 0;
        this.in = false;
        this.as = false;
        this.bg = false;
        this.az = new C7018k();
        this.ba = new AnimConfig().setEase(-2, 0.9f, 0.25f).addListeners(new toq());
        this.f39478z = ld6.m25581q(context, 11.0f);
        this.f39473t = ld6.m25581q(context, 16.0f);
        this.f39471r = ld6.m25581q(context, 196.0f);
        this.f39459b = ld6.m25581q(context, 8.0f);
        this.f39458a = ld6.m25581q(context, 5.0f);
        this.f39477x = ld6.m25581q(context, 2.0f);
        this.f39467l = context.getResources().getDimensionPixelSize(toq.f7l8.c08);
        this.f39463f = context.getResources().getColor(toq.C6050g.kn7);
        this.f39460c = context.getResources().getDimensionPixelSize(toq.f7l8.bz4g);
        this.f39462e = context.getResources().getDimensionPixelSize(toq.f7l8.ryij);
        this.f39466j = context.getResources().getDimensionPixelSize(toq.f7l8.hk2l);
        this.bb = context.getResources().getDisplayMetrics().densityDpi;
        this.f39472s = context;
        this.bp = attributeSet;
        x9kr(attributeSet);
        setClipToPadding(false);
        setWillNotDraw(false);
        C7334n.m26604g(this, true);
        this.f39461d = new x2(context, this, false, new zy());
    }
}
