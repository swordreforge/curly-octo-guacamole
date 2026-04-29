package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.C0720t;
import androidx.core.view.accessibility.C0654i;
import androidx.core.view.accessibility.ki;
import androidx.core.view.fti;
import androidx.core.view.gvn7;
import androidx.core.view.jk;
import androidx.core.view.ncyb;
import androidx.core.view.oc;
import n7h.C7400k;
import zy.InterfaceC7830i;
import zy.dd;
import zy.hyr;
import zy.lvui;
import zy.uv6;
import zy.yz;

/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements gvn7, jk, ncyb {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    static final float f50968ab = 0.5f;
    private static final String bb = "NestedScrollView";
    private static final int bp = 250;
    private static final int bv = -1;

    /* JADX INFO: renamed from: w */
    static final int f4216w = 250;

    /* JADX INFO: renamed from: a */
    private int f4217a;

    /* JADX INFO: renamed from: b */
    private int f4218b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final fti f50969bo;

    /* JADX INFO: renamed from: c */
    private int f4219c;

    /* JADX INFO: renamed from: d */
    private zy f4220d;

    /* JADX INFO: renamed from: e */
    private int f4221e;

    /* JADX INFO: renamed from: f */
    private int f4222f;

    /* JADX INFO: renamed from: g */
    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY})
    @yz
    public EdgeEffect f4223g;

    /* JADX INFO: renamed from: h */
    private boolean f4224h;

    /* JADX INFO: renamed from: i */
    private View f4225i;

    /* JADX INFO: renamed from: j */
    private int f4226j;

    /* JADX INFO: renamed from: k */
    private long f4227k;

    /* JADX INFO: renamed from: l */
    private boolean f4228l;

    /* JADX INFO: renamed from: m */
    private final int[] f4229m;

    /* JADX INFO: renamed from: n */
    private OverScroller f4230n;

    /* JADX INFO: renamed from: o */
    private final int[] f4231o;

    /* JADX INFO: renamed from: p */
    private boolean f4232p;

    /* JADX INFO: renamed from: q */
    private final Rect f4233q;

    /* JADX INFO: renamed from: r */
    private boolean f4234r;

    /* JADX INFO: renamed from: s */
    private int f4235s;

    /* JADX INFO: renamed from: t */
    private VelocityTracker f4236t;

    /* JADX INFO: renamed from: u */
    private final oc f4237u;

    /* JADX INFO: renamed from: v */
    private float f4238v;

    /* JADX INFO: renamed from: x */
    private SavedState f4239x;

    /* JADX INFO: renamed from: y */
    @lvui
    @uv6({uv6.EnumC7844k.LIBRARY})
    @yz
    public EdgeEffect f4240y;

    /* JADX INFO: renamed from: z */
    private boolean f4241z;
    private static final C0746k an = new C0746k();
    private static final int[] id = {R.attr.fillViewport};

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: androidx.core.widget.NestedScrollView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i2) {
                return new SavedState[i2];
            }
        };

        /* JADX INFO: renamed from: k */
        public int f4242k;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @lvui
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f4242k + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f4242k);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f4242k = parcel.readInt();
        }
    }

    /* JADX INFO: renamed from: androidx.core.widget.NestedScrollView$k */
    static class C0746k extends C0701k {
        C0746k() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            C0654i.m3020r(accessibilityEvent, nestedScrollView.getScrollX());
            C0654i.x9kr(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.ki kiVar) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, kiVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            kiVar.sok(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            kiVar.lh(true);
            if (nestedScrollView.getScrollY() > 0) {
                kiVar.toq(ki.C0656k.f50720t8r);
                kiVar.toq(ki.C0656k.f50707jk);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                kiVar.toq(ki.C0656k.f50709ki);
                kiVar.toq(ki.C0656k.f50704fti);
            }
        }

        @Override // androidx.core.view.C0701k
        public boolean performAccessibilityAction(View view, int i2, Bundle bundle) {
            if (super.performAccessibilityAction(view, i2, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.n5r1(0, iMax, true);
                    return true;
                }
                if (i2 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.n5r1(0, iMin, true);
            return true;
        }
    }

    @hyr(21)
    static class toq {
        private toq() {
        }

        @InterfaceC7830i
        /* JADX INFO: renamed from: k */
        static boolean m3618k(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    public interface zy {
        /* JADX INFO: renamed from: k */
        void mo103k(@lvui NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    public NestedScrollView(@lvui Context context) {
        this(context, null);
    }

    private boolean cdj(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i3 >= childAt.getTop() - scrollY && i3 < childAt.getBottom() - scrollY && i2 >= childAt.getLeft() && i2 < childAt.getRight();
    }

    private boolean d2ok(Rect rect, boolean z2) {
        int iM3613g = m3613g(rect);
        boolean z3 = iM3613g != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iM3613g);
            } else {
                lvui(0, iM3613g);
            }
        }
        return z3;
    }

    private void d3(boolean z2) {
        if (z2) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f4217a = getScrollY();
        C0683f.h7am(this);
    }

    private void dd(int i2, int i3, int i4, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f4227k > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f4230n.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY, i4);
            d3(z2);
        } else {
            if (!this.f4230n.isFinished()) {
                m3607k();
            }
            scrollBy(i2, i3);
        }
        this.f4227k = AnimationUtils.currentAnimationTimeMillis();
    }

    private void eqxt(View view) {
        view.getDrawingRect(this.f4233q);
        offsetDescendantRectToMyCoords(view, this.f4233q);
        int iM3613g = m3613g(this.f4233q);
        if (iM3613g != 0) {
            scrollBy(0, iM3613g);
        }
    }

    private void f7l8(int i2) {
        if (i2 != 0) {
            if (this.f4228l) {
                lvui(0, i2);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f4238v == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f4238v = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f4238v;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private int gvn7(int r4, float r5) {
        /*
            r3 = this;
            int r0 = r3.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r4 = (float) r4
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r4 = r4 / r0
            android.widget.EdgeEffect r0 = r3.f4223g
            float r0 = androidx.core.widget.C0762s.m3673q(r0)
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L31
            android.widget.EdgeEffect r0 = r3.f4223g
            float r4 = -r4
            float r4 = androidx.core.widget.C0762s.m3672p(r0, r4, r5)
            float r4 = -r4
            android.widget.EdgeEffect r5 = r3.f4223g
            float r5 = androidx.core.widget.C0762s.m3673q(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f4223g
            r5.onRelease()
        L2f:
            r1 = r4
            goto L54
        L31:
            android.widget.EdgeEffect r0 = r3.f4240y
            float r0 = androidx.core.widget.C0762s.m3673q(r0)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 == 0) goto L54
            android.widget.EdgeEffect r0 = r3.f4240y
            r2 = 1065353216(0x3f800000, float:1.0)
            float r2 = r2 - r5
            float r4 = androidx.core.widget.C0762s.m3672p(r0, r4, r2)
            android.widget.EdgeEffect r5 = r3.f4240y
            float r5 = androidx.core.widget.C0762s.m3673q(r5)
            int r5 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r5 != 0) goto L2f
            android.widget.EdgeEffect r5 = r3.f4240y
            r5.onRelease()
            goto L2f
        L54:
            int r4 = r3.getHeight()
            float r4 = (float) r4
            float r1 = r1 * r4
            int r4 = java.lang.Math.round(r1)
            if (r4 == 0) goto L63
            r3.invalidate()
        L63:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.gvn7(int, float):int");
    }

    private boolean hyr(MotionEvent motionEvent) {
        boolean z2;
        if (C0762s.m3673q(this.f4223g) != 0.0f) {
            C0762s.m3672p(this.f4223g, 0.0f, motionEvent.getX() / getWidth());
            z2 = true;
        } else {
            z2 = false;
        }
        if (C0762s.m3673q(this.f4240y) == 0.0f) {
            return z2;
        }
        C0762s.m3672p(this.f4240y, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    /* JADX INFO: renamed from: i */
    private void m3606i() {
        if (this.f4236t == null) {
            this.f4236t = VelocityTracker.obtain();
        }
    }

    private void jk(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f4226j) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f4235s = (int) motionEvent.getY(i2);
            this.f4226j = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f4236t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void jp0y() {
        VelocityTracker velocityTracker = this.f4236t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f4236t = null;
        }
    }

    /* JADX INFO: renamed from: k */
    private void m3607k() {
        this.f4230n.abortAnimation();
        stopNestedScroll(1);
    }

    private void ki() {
        VelocityTracker velocityTracker = this.f4236t;
        if (velocityTracker == null) {
            this.f4236t = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void mcp(int i2, int i3, @dd int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f50969bo.mo3267n(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    /* JADX INFO: renamed from: n */
    private static int m3608n(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    private boolean oc(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        boolean z3 = i2 == 33;
        View viewX2 = x2(z3, i3, i4);
        if (viewX2 == null) {
            viewX2 = this;
        }
        if (i3 < scrollY || i4 > i5) {
            f7l8(z3 ? i3 - scrollY : i4 - i5);
            z2 = true;
        }
        if (viewX2 != findFocus()) {
            viewX2.requestFocus(i2);
        }
        return z2;
    }

    /* JADX INFO: renamed from: q */
    private boolean m3609q() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    /* JADX INFO: renamed from: s */
    private void m3610s() {
        this.f4241z = false;
        jp0y();
        stopNestedScroll(0);
        this.f4223g.onRelease();
        this.f4240y.onRelease();
    }

    /* JADX INFO: renamed from: t */
    private boolean m3611t(View view, int i2, int i3) {
        view.getDrawingRect(this.f4233q);
        offsetDescendantRectToMyCoords(view, this.f4233q);
        return this.f4233q.bottom + i2 >= getScrollY() && this.f4233q.top - i2 <= getScrollY() + i3;
    }

    private void t8r() {
        this.f4230n = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f4222f = viewConfiguration.getScaledTouchSlop();
        this.f4219c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f4221e = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private static boolean wvg(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && wvg((View) parent, view2);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View x2(boolean r13, int r14, int r15) {
        /*
            r12 = this;
            r0 = 2
            java.util.ArrayList r0 = r12.getFocusables(r0)
            int r1 = r0.size()
            r2 = 0
            r3 = 0
            r4 = r2
            r5 = r4
        Ld:
            if (r4 >= r1) goto L53
            java.lang.Object r6 = r0.get(r4)
            android.view.View r6 = (android.view.View) r6
            int r7 = r6.getTop()
            int r8 = r6.getBottom()
            r9 = 1
            if (r14 >= r8) goto L50
            if (r7 >= r15) goto L50
            if (r14 >= r7) goto L28
            if (r8 >= r15) goto L28
            r10 = r9
            goto L29
        L28:
            r10 = r2
        L29:
            if (r3 != 0) goto L2e
            r3 = r6
            r5 = r10
            goto L50
        L2e:
            if (r13 == 0) goto L36
            int r11 = r3.getTop()
            if (r7 < r11) goto L3e
        L36:
            if (r13 != 0) goto L40
            int r7 = r3.getBottom()
            if (r8 <= r7) goto L40
        L3e:
            r7 = r9
            goto L41
        L40:
            r7 = r2
        L41:
            if (r5 == 0) goto L48
            if (r10 == 0) goto L50
            if (r7 == 0) goto L50
            goto L4f
        L48:
            if (r10 == 0) goto L4d
            r3 = r6
            r5 = r9
            goto L50
        L4d:
            if (r7 == 0) goto L50
        L4f:
            r3 = r6
        L50:
            int r4 = r4 + 1
            goto Ld
        L53:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.x2(boolean, int, int):android.view.View");
    }

    /* JADX INFO: renamed from: y */
    private boolean m3612y(int i2) {
        if (C0762s.m3673q(this.f4223g) != 0.0f) {
            this.f4223g.onAbsorb(i2);
        } else {
            if (C0762s.m3673q(this.f4240y) == 0.0f) {
                return false;
            }
            this.f4240y.onAbsorb(-i2);
        }
        return true;
    }

    private boolean zurt(View view) {
        return !m3611t(view, 0, getHeight());
    }

    private boolean zy() {
        int overScrollMode = getOverScrollMode();
        if (overScrollMode != 0) {
            return overScrollMode == 1 && getScrollRange() > 0;
        }
        return true;
    }

    boolean a9(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
        boolean z3;
        boolean z5;
        int overScrollMode = getOverScrollMode();
        boolean z6 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z7 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z8 = overScrollMode == 0 || (overScrollMode == 1 && z6);
        boolean z9 = overScrollMode == 0 || (overScrollMode == 1 && z7);
        int i10 = i4 + i2;
        int i11 = !z8 ? 0 : i8;
        int i12 = i5 + i3;
        int i13 = !z9 ? 0 : i9;
        int i14 = -i11;
        int i15 = i11 + i6;
        int i16 = -i13;
        int i17 = i13 + i7;
        if (i10 > i15) {
            i10 = i15;
            z3 = true;
        } else if (i10 < i14) {
            z3 = true;
            i10 = i14;
        } else {
            z3 = false;
        }
        if (i12 > i17) {
            i12 = i17;
            z5 = true;
        } else if (i12 < i16) {
            z5 = true;
            i12 = i16;
        } else {
            z5 = false;
        }
        if (z5 && !hasNestedScrollingParent(1)) {
            this.f4230n.springBack(i10, i12, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i10, i12, z3, z5);
        return z3 || z5;
    }

    @Override // android.view.ViewGroup
    public void addView(@lvui View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // android.view.View, androidx.core.view.ncyb
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ncyb
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ncyb
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f4230n.isFinished()) {
            return;
        }
        this.f4230n.computeScrollOffset();
        int currY = this.f4230n.getCurrY();
        int i2 = currY - this.f4217a;
        this.f4217a = currY;
        int[] iArr = this.f4229m;
        boolean z2 = false;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, i2, iArr, null, 1);
        int i3 = i2 - this.f4229m[1];
        int scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY = getScrollY();
            a9(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i4 = i3 - scrollY2;
            int[] iArr2 = this.f4229m;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i4, this.f4231o, 1, iArr2);
            i3 = i4 - this.f4229m[1];
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z2 = true;
            }
            if (z2) {
                if (i3 < 0) {
                    if (this.f4223g.isFinished()) {
                        this.f4223g.onAbsorb((int) this.f4230n.getCurrVelocity());
                    }
                } else if (this.f4240y.isFinished()) {
                    this.f4240y.onAbsorb((int) this.f4230n.getCurrVelocity());
                }
            }
            m3607k();
        }
        if (this.f4230n.isFinished()) {
            stopNestedScroll(1);
        } else {
            C0683f.h7am(this);
        }
    }

    @Override // android.view.View, androidx.core.view.ncyb
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ncyb
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ncyb
    @uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        return scrollY < 0 ? bottom - scrollY : scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || m3615p(keyEvent);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f50969bo.mo3266k(f2, f3, z2);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f50969bo.toq(f2, f3);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedPreScroll(int i2, int i3, @dd int[] iArr, @dd int[] iArr2, int i4) {
        return this.f50969bo.mo3268q(i2, i3, iArr, iArr2, i4);
    }

    @Override // androidx.core.view.jk
    public void dispatchNestedScroll(int i2, int i3, int i4, int i5, @dd int[] iArr, int i6, @lvui int[] iArr2) {
        this.f50969bo.mo3267n(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    @Override // android.view.View
    public void draw(@lvui Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f4223g.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (toq.m3618k(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft() + 0;
            } else {
                paddingLeft = 0;
            }
            if (toq.m3618k(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f4223g.setSize(width, height);
            if (this.f4223g.draw(canvas)) {
                C0683f.h7am(this);
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f4240y.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (toq.m3618k(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = 0 + getPaddingLeft();
        }
        if (toq.m3618k(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f4240y.setSize(width2, height2);
        if (this.f4240y.draw(canvas)) {
            C0683f.h7am(this);
        }
        canvas.restoreToCount(iSave2);
    }

    public boolean fn3e() {
        return this.f4234r;
    }

    public boolean fti(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        if (z2) {
            this.f4233q.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f4233q;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f4233q.top = getScrollY() - height;
            Rect rect2 = this.f4233q;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f4233q;
        int i3 = rect3.top;
        int i4 = height + i3;
        rect3.bottom = i4;
        return oc(i2, i3, i4);
    }

    @Override // androidx.core.view.jp0y
    public void fu4(@lvui View view, int i2, int i3, int i4, int i5, int i6) {
        mcp(i5, i6, null);
    }

    /* JADX INFO: renamed from: g */
    protected int m3613g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i3 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i2 - verticalFadingEdgeLength : i2;
        int i4 = rect.bottom;
        if (i4 > i3 && rect.top > scrollY) {
            return Math.min((rect.height() > height ? rect.top - scrollY : rect.bottom - i3) + 0, (childAt.getBottom() + layoutParams.bottomMargin) - i2);
        }
        if (rect.top >= scrollY || i4 >= i3) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i3 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, androidx.core.view.d3
    public int getNestedScrollAxes() {
        return this.f4237u.m3397k();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: h */
    public void mo419h(@lvui View view, int i2, int i3, @lvui int[] iArr, int i4) {
        dispatchNestedPreScroll(i2, i3, iArr, null, i4);
    }

    @Override // androidx.core.view.mcp
    public boolean hasNestedScrollingParent(int i2) {
        return this.f50969bo.x2(i2);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean isNestedScrollingEnabled() {
        return this.f50969bo.qrj();
    }

    @Override // androidx.core.view.jp0y
    public void kja0(@lvui View view, int i2) {
        this.f4237u.m3398n(view, i2);
        stopNestedScroll(i2);
    }

    /* JADX INFO: renamed from: l */
    void m3614l(int i2, int i3, int i4, boolean z2) {
        dd(i2 - getScrollX(), i3 - getScrollY(), i4, z2);
    }

    @Override // androidx.core.view.jp0y
    public void ld6(@lvui View view, @lvui View view2, int i2, int i3) {
        this.f4237u.zy(view, view2, i2, i3);
        startNestedScroll(2, i3);
    }

    public final void lvui(int i2, int i3) {
        dd(i2, i3, 250, false);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(@lvui View view, int i2, int i3) {
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    void n5r1(int i2, int i3, boolean z2) {
        m3614l(i2, i3, 250, z2);
    }

    public boolean n7h(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f4233q;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f4233q.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f4233q;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f4233q;
        return oc(i2, rect3.top, rect3.bottom);
    }

    public final void ncyb(int i2, int i3, int i4) {
        m3614l(i2, i3, i4, false);
    }

    @Override // androidx.core.view.gvn7
    public void ni7(@lvui View view, int i2, int i3, int i4, int i5, int i6, @lvui int[] iArr) {
        mcp(i5, i6, iArr);
    }

    public boolean o1t() {
        return this.f4228l;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f4224h = false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.view.View
    public boolean onGenericMotionEvent(@lvui MotionEvent motionEvent) {
        boolean z2;
        int i2 = 0;
        if (motionEvent.getAction() == 8 && !this.f4241z) {
            float axisValue = C0720t.x2(motionEvent, 2) ? motionEvent.getAxisValue(9) : C0720t.x2(motionEvent, 4194304) ? motionEvent.getAxisValue(26) : 0.0f;
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i3 = scrollY - verticalScrollFactorCompat;
                if (i3 < 0) {
                    if (zy() && !C0720t.x2(motionEvent, 8194)) {
                        C0762s.m3672p(this.f4223g, (-i3) / getHeight(), 0.5f);
                        this.f4223g.onRelease();
                        invalidate();
                        z2 = 1;
                    } else {
                        z2 = 0;
                    }
                } else if (i3 > scrollRange) {
                    if (zy() && !C0720t.x2(motionEvent, 8194)) {
                        C0762s.m3672p(this.f4240y, (i3 - scrollRange) / getHeight(), 0.5f);
                        this.f4240y.onRelease();
                        invalidate();
                        i2 = 1;
                    }
                    z2 = i2;
                    i2 = scrollRange;
                } else {
                    z2 = 0;
                    i2 = i3;
                }
                if (i2 == scrollY) {
                    return z2;
                }
                super.scrollTo(getScrollX(), i2);
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(@zy.lvui android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int measuredHeight = 0;
        this.f4232p = false;
        View view = this.f4225i;
        if (view != null && wvg(view, this)) {
            eqxt(this.f4225i);
        }
        this.f4225i = null;
        if (!this.f4224h) {
            if (this.f4239x != null) {
                scrollTo(getScrollX(), this.f4239x.f4242k);
                this.f4239x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM3608n = m3608n(scrollY, paddingTop, measuredHeight);
            if (iM3608n != scrollY) {
                scrollTo(getScrollX(), iM3608n);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f4224h = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f4234r && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedFling(@lvui View view, float f2, float f3, boolean z2) {
        if (z2) {
            return false;
        }
        dispatchNestedFling(0.0f, f3, true);
        qrj((int) f3);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedPreFling(@lvui View view, float f2, float f3) {
        return dispatchNestedPreFling(f2, f3);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedPreScroll(@lvui View view, int i2, int i3, @lvui int[] iArr) {
        mo419h(view, i2, i3, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedScroll(@lvui View view, int i2, int i3, int i4, int i5) {
        mcp(i5, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedScrollAccepted(@lvui View view, @lvui View view2, int i2) {
        ld6(view, view2, i2, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i2, int i3, boolean z2, boolean z3) {
        super.scrollTo(i2, i3);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (i2 == 2) {
            i2 = 130;
        } else if (i2 == 1) {
            i2 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i2) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i2);
        if (viewFindNextFocus == null || zurt(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i2, rect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f4239x = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @lvui
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f4242k = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        zy zyVar = this.f4220d;
        if (zyVar != null) {
            zyVar.mo103k(this, i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !m3611t(viewFindFocus, 0, i5)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f4233q);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f4233q);
        f7l8(m3613g(this.f4233q));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onStartNestedScroll(@lvui View view, @lvui View view2, int i2) {
        return mo426z(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onStopNestedScroll(@lvui View view) {
        kja0(view, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:76:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01d6  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(@zy.lvui android.view.MotionEvent r24) {
        /*
            Method dump skipped, instruction units count: 616
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.widget.NestedScrollView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX INFO: renamed from: p */
    public boolean m3615p(@lvui KeyEvent keyEvent) {
        this.f4233q.setEmpty();
        if (!m3609q()) {
            if (!isFocused() || keyEvent.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (keyEvent.getAction() != 0) {
            return false;
        }
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 19) {
            return !keyEvent.isAltPressed() ? toq(33) : n7h(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? toq(130) : n7h(130);
        }
        if (keyCode != 62) {
            return false;
        }
        fti(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
    }

    public void qrj(int i2) {
        if (getChildCount() > 0) {
            this.f4230n.fling(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            d3(true);
        }
    }

    /* JADX INFO: renamed from: r */
    public final void m3616r(int i2, int i3, int i4) {
        dd(i2, i3, i4, false);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f4232p) {
            this.f4225i = view2;
        } else {
            eqxt(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@lvui View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return d2ok(rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            jp0y();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f4232p = true;
        super.requestLayout();
    }

    @Override // android.view.View
    public void scrollTo(int i2, int i3) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iM3608n = m3608n(i2, width, width2);
            int iM3608n2 = m3608n(i3, height, height2);
            if (iM3608n == getScrollX() && iM3608n2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM3608n, iM3608n2);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f4234r) {
            this.f4234r = z2;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.a9
    public void setNestedScrollingEnabled(boolean z2) {
        this.f50969bo.mo3264h(z2);
    }

    public void setOnScrollChangeListener(@dd zy zyVar) {
        this.f4220d = zyVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f4228l = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.mcp
    public boolean startNestedScroll(int i2, int i3) {
        return this.f50969bo.t8r(i2, i3);
    }

    @Override // androidx.core.view.mcp
    public void stopNestedScroll(int i2) {
        this.f50969bo.fn3e(i2);
    }

    public boolean toq(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !m3611t(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i2 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i2 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i2 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            f7l8(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f4233q);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f4233q);
            f7l8(m3613g(this.f4233q));
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !zurt(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public final void x9kr(int i2, int i3) {
        m3614l(i2, i3, 250, false);
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: z */
    public boolean mo426z(@lvui View view, @lvui View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public NestedScrollView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, C7400k.k.f93228n7h);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedPreScroll(int i2, int i3, @dd int[] iArr, @dd int[] iArr2) {
        return dispatchNestedPreScroll(i2, i3, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, @dd int[] iArr, int i6) {
        return this.f50969bo.f7l8(i2, i3, i4, i5, iArr, i6);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean startNestedScroll(int i2) {
        return startNestedScroll(i2, 0);
    }

    @Override // android.view.View, androidx.core.view.a9
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public NestedScrollView(@lvui Context context, @dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f4233q = new Rect();
        this.f4232p = true;
        this.f4224h = false;
        this.f4225i = null;
        this.f4241z = false;
        this.f4228l = true;
        this.f4226j = -1;
        this.f4231o = new int[2];
        this.f4229m = new int[2];
        this.f4223g = C0762s.m3671k(context, attributeSet);
        this.f4240y = C0762s.m3671k(context, attributeSet);
        t8r();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, id, i2, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f4237u = new oc(this);
        this.f50969bo = new fti(this);
        setNestedScrollingEnabled(true);
        C0683f.zwy(this, an);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, @dd int[] iArr) {
        return this.f50969bo.mo3263g(i2, i3, i4, i5, iArr);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2) {
        if (getChildCount() <= 0) {
            super.addView(view, i2);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i2, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i2, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
