package miuix.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import androidx.core.view.C0683f;
import androidx.core.view.C0701k;
import androidx.core.view.accessibility.C0654i;
import androidx.core.view.accessibility.ki;
import androidx.core.view.fti;
import androidx.core.view.gvn7;
import androidx.core.view.jk;
import androidx.core.view.ncyb;
import androidx.core.view.oc;
import androidx.core.widget.C0762s;
import miuix.overscroller.widget.zy;
import miuix.view.C7385p;
import miuix.view.HapticCompat;
import qh4d.InterfaceC7614k;
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes3.dex */
public class NestedScrollView extends FrameLayout implements gvn7, jk, ncyb, InterfaceC7614k {
    private static final String an = "NestedScrollView";
    static final int bp = 250;
    static final float bv = 0.5f;
    private static final int id = -1;

    /* JADX INFO: renamed from: a */
    private int f39943a;

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    private boolean f87407ab;

    /* JADX INFO: renamed from: b */
    private final int[] f39944b;
    private miuix.util.toq bb;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final oc f87408bo;

    /* JADX INFO: renamed from: c */
    private int f39945c;

    /* JADX INFO: renamed from: d */
    private float f39946d;

    /* JADX INFO: renamed from: e */
    private int f39947e;

    /* JADX INFO: renamed from: f */
    private boolean f39948f;

    /* JADX INFO: renamed from: g */
    private zy f39949g;

    /* JADX INFO: renamed from: h */
    private boolean f39950h;

    /* JADX INFO: renamed from: i */
    private boolean f39951i;

    /* JADX INFO: renamed from: j */
    private int f39952j;

    /* JADX INFO: renamed from: k */
    private int f39953k;

    /* JADX INFO: renamed from: l */
    private boolean f39954l;

    /* JADX INFO: renamed from: m */
    private final int[] f39955m;

    /* JADX INFO: renamed from: n */
    private final Rect f39956n;

    /* JADX INFO: renamed from: o */
    private int f39957o;

    /* JADX INFO: renamed from: p */
    private int f39958p;

    /* JADX INFO: renamed from: q */
    private long f39959q;

    /* JADX INFO: renamed from: r */
    private VelocityTracker f39960r;

    /* JADX INFO: renamed from: s */
    private EdgeEffect f39961s;

    /* JADX INFO: renamed from: t */
    private boolean f39962t;

    /* JADX INFO: renamed from: u */
    private SavedState f39963u;

    /* JADX INFO: renamed from: v */
    private final fti f39964v;

    /* JADX INFO: renamed from: w */
    private toq f39965w;

    /* JADX INFO: renamed from: x */
    private int f39966x;

    /* JADX INFO: renamed from: y */
    private EdgeEffect f39967y;

    /* JADX INFO: renamed from: z */
    private View f39968z;
    private static final C7105k in = new C7105k();
    private static final int[] bl = {R.attr.fillViewport};

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: miuix.core.widget.NestedScrollView.SavedState.1
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
        public int f39969k;

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @lvui
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f39969k + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i2) {
            super.writeToParcel(parcel, i2);
            parcel.writeInt(this.f39969k);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f39969k = parcel.readInt();
        }
    }

    /* JADX INFO: renamed from: miuix.core.widget.NestedScrollView$k */
    static class C7105k extends C0701k {
        C7105k() {
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
        public void onInitializeAccessibilityNodeInfo(View view, ki kiVar) {
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
            if (i2 != 4096) {
                if (i2 == 8192 || i2 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.m25694r(0, iMax, true);
                    return true;
                }
                if (i2 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((nestedScrollView.getHeight() - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.m25694r(0, iMin, true);
            return true;
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void m25697k(NestedScrollView nestedScrollView, int i2, int i3, int i4, int i5);
    }

    public NestedScrollView(@lvui Context context) {
        this(context, null);
    }

    private void cdj() {
        VelocityTracker velocityTracker = this.f39960r;
        if (velocityTracker == null) {
            this.f39960r = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void d2ok(int i2, int i3, boolean z2) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f39959q > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f39949g.jk(getScrollX(), scrollY, 0, Math.max(0, Math.min(i3 + scrollY, Math.max(0, height - height2))) - scrollY);
            jp0y(z2);
        } else {
            if (!this.f39949g.ki()) {
                m25687k();
            }
            scrollBy(i2, i3);
        }
        this.f39959q = AnimationUtils.currentAnimationTimeMillis();
    }

    private void d3(View view) {
        view.getDrawingRect(this.f39956n);
        offsetDescendantRectToMyCoords(view, this.f39956n);
        int iM25693n = m25693n(this.f39956n);
        if (iM25693n != 0) {
            scrollBy(0, iM25693n);
        }
    }

    private void f7l8() {
        this.f39962t = false;
        fti();
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.f39967y;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f39961s.onRelease();
        }
    }

    private boolean fn3e(View view) {
        return !wvg(view, 0, getHeight());
    }

    private void fti() {
        VelocityTracker velocityTracker = this.f39960r;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f39960r = null;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m25686g(int i2) {
        if (i2 != 0) {
            if (this.f39948f) {
                eqxt(0, i2);
            } else {
                scrollBy(0, i2);
            }
        }
    }

    private miuix.util.toq getHapticFeedbackCompat() {
        if (this.bb == null) {
            this.bb = new miuix.util.toq(getContext());
        }
        return this.bb;
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f39946d == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f39946d = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f39946d;
    }

    private boolean gvn7(int i2, int i3, int i4) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i5 = height + scrollY;
        boolean z2 = false;
        boolean z3 = i2 == 33;
        View viewM25688p = m25688p(z3, i3, i4);
        if (viewM25688p == null) {
            viewM25688p = this;
        }
        if (i3 < scrollY || i4 > i5) {
            m25686g(z3 ? i3 - scrollY : i4 - i5);
            z2 = true;
        }
        if (viewM25688p != findFocus()) {
            viewM25688p.requestFocus(i2);
        }
        return z2;
    }

    private void jp0y(boolean z2) {
        if (z2) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f39966x = getScrollY();
        C0683f.h7am(this);
    }

    /* JADX INFO: renamed from: k */
    private void m25687k() {
        this.f39949g.m26263k();
        stopNestedScroll(1);
    }

    private void ki() {
        this.f39949g = new zy(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f39945c = viewConfiguration.getScaledTouchSlop();
        this.f39947e = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f39952j = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void mcp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f39957o) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f39958p = (int) motionEvent.getY(i2);
            this.f39957o = motionEvent.getPointerId(i2);
            VelocityTracker velocityTracker = this.f39960r;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean n7h(int i2, int i3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return i3 >= childAt.getTop() - scrollY && i3 < childAt.getBottom() - scrollY && i2 >= childAt.getLeft() && i2 < childAt.getRight();
    }

    private static boolean o1t(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && o1t((View) parent, view2);
    }

    private boolean oc(Rect rect, boolean z2) {
        int iM25693n = m25693n(rect);
        boolean z3 = iM25693n != 0;
        if (z3) {
            if (z2) {
                scrollBy(0, iM25693n);
            } else {
                eqxt(0, iM25693n);
            }
        }
        return z3;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View m25688p(boolean r13, int r14, int r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: miuix.core.widget.NestedScrollView.m25688p(boolean, int, int):android.view.View");
    }

    /* JADX INFO: renamed from: q */
    private static int m25689q(int i2, int i3, int i4) {
        if (i3 >= i4 || i2 < 0) {
            return 0;
        }
        return i3 + i2 > i4 ? i4 - i3 : i2;
    }

    /* JADX INFO: renamed from: t */
    private void m25690t(int i2, int i3, @dd int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i2);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f39964v.mo3267n(0, scrollY2, 0, i2 - scrollY2, null, i3, iArr);
    }

    private void t8r() {
        if (this.f39960r == null) {
            this.f39960r = VelocityTracker.obtain();
        }
    }

    private boolean wvg(View view, int i2, int i3) {
        view.getDrawingRect(this.f39956n);
        offsetDescendantRectToMyCoords(view, this.f39956n);
        return this.f39956n.bottom + i2 >= getScrollY() && this.f39956n.top - i2 <= getScrollY() + i3;
    }

    /* JADX INFO: renamed from: y */
    private void m25691y() {
        if (getOverScrollMode() == 2) {
            this.f39967y = null;
            this.f39961s = null;
        } else if (this.f39967y == null) {
            Context context = getContext();
            this.f39967y = new EdgeEffect(context);
            this.f39961s = new EdgeEffect(context);
        }
    }

    private boolean zy() {
        if (getChildCount() <= 0) {
            return false;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom();
    }

    public boolean a9(int i2) {
        boolean z2 = i2 == 130;
        int height = getHeight();
        if (z2) {
            this.f39956n.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f39956n;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f39956n.top = getScrollY() - height;
            Rect rect2 = this.f39956n;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f39956n;
        int i3 = rect3.top;
        int i4 = height + i3;
        rect3.bottom = i4;
        return gvn7(i2, i3, i4);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
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
        if (this.f39949g.ki()) {
            return;
        }
        this.f39949g.toq();
        int iLd6 = this.f39949g.ld6();
        int i2 = iLd6 - this.f39966x;
        this.f39966x = iLd6;
        boolean z2 = false;
        this.f39944b[1] = 0;
        View viewFindViewById = getRootView().findViewById(R.id.content);
        for (ViewParent parent = getParent(); parent != null && ((!(parent instanceof qh4d.zy) || !((qh4d.zy) parent).zy(this.f39949g.m26269y(), this.f39949g.m26267s())) && (!(parent instanceof ViewGroup) || parent != viewFindViewById)); parent = parent.getParent()) {
        }
        dispatchNestedPreScroll(0, i2, this.f39944b, null, 1);
        int i3 = i2 - this.f39944b[1];
        int scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY = getScrollY();
            jk(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i4 = i3 - scrollY2;
            int[] iArr = this.f39944b;
            iArr[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i4, this.f39955m, 1, iArr);
            i3 = i4 - this.f39944b[1];
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z2 = true;
            }
            if (z2) {
                m25691y();
                if (i3 < 0) {
                    if (this.f39967y.isFinished()) {
                        this.f39967y.onAbsorb((int) this.f39949g.f7l8());
                    }
                } else if (this.f39961s.isFinished()) {
                    this.f39961s.onAbsorb((int) this.f39949g.f7l8());
                }
            }
            m25687k();
        }
        if (!this.f39949g.ki()) {
            C0683f.h7am(this);
            return;
        }
        stopNestedScroll(1);
        if (this.f87407ab) {
            return;
        }
        if (HapticCompat.zy(HapticCompat.InterfaceC7379k.f42262b)) {
            getHapticFeedbackCompat().zy(201);
        } else {
            HapticCompat.performHapticFeedback(this, C7385p.f92252t8r);
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
        return super.dispatchKeyEvent(keyEvent) || m25695s(keyEvent);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return this.f39964v.mo3266k(f2, f3, z2);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedPreFling(float f2, float f3) {
        return this.f39964v.toq(f2, f3);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return this.f39964v.mo3268q(i2, i3, iArr, iArr2, i4);
    }

    @Override // androidx.core.view.jk
    public void dispatchNestedScroll(int i2, int i3, int i4, int i5, @dd int[] iArr, int i6, @lvui int[] iArr2) {
        this.f39964v.mo3267n(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f39967y != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.f39967y.isFinished()) {
                int iSave = canvas.save();
                int width = getWidth();
                int height = getHeight();
                int iMin = Math.min(0, scrollY);
                if (getClipToPadding()) {
                    width -= getPaddingLeft() + getPaddingRight();
                    paddingLeft = getPaddingLeft() + 0;
                } else {
                    paddingLeft = 0;
                }
                if (getClipToPadding()) {
                    height -= getPaddingTop() + getPaddingBottom();
                    iMin += getPaddingTop();
                }
                canvas.translate(paddingLeft, iMin);
                this.f39967y.setSize(width, height);
                if (this.f39967y.draw(canvas)) {
                    C0683f.h7am(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f39961s.isFinished()) {
                return;
            }
            int iSave2 = canvas.save();
            int width2 = getWidth();
            int height2 = getHeight();
            int iMax = Math.max(getScrollRange(), scrollY) + height2;
            if (getClipToPadding()) {
                width2 -= getPaddingLeft() + getPaddingRight();
                paddingLeft2 = 0 + getPaddingLeft();
            }
            if (getClipToPadding()) {
                height2 -= getPaddingTop() + getPaddingBottom();
                iMax -= getPaddingBottom();
            }
            canvas.translate(paddingLeft2 - width2, iMax);
            canvas.rotate(180.0f, width2, 0.0f);
            this.f39961s.setSize(width2, height2);
            if (this.f39961s.draw(canvas)) {
                C0683f.h7am(this);
            }
            canvas.restoreToCount(iSave2);
        }
    }

    public final void eqxt(int i2, int i3) {
        d2ok(i2, i3, false);
    }

    @Override // androidx.core.view.jp0y
    public void fu4(@lvui View view, int i2, int i3, int i4, int i5, int i6) {
        m25690t(i5, i6, null);
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
        return this.f87408bo.m3397k();
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
        return this.f39964v.x2(i2);
    }

    /* JADX INFO: renamed from: i */
    public boolean m25692i() {
        return this.f39954l;
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean isNestedScrollingEnabled() {
        return this.f39964v.qrj();
    }

    boolean jk(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, boolean z2) {
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
            this.f39949g.mcp(i10, i12, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i10, i12, z3, z5);
        return z3 || z5;
    }

    @Override // androidx.core.view.jp0y
    public void kja0(@lvui View view, int i2) {
        this.f87408bo.m3398n(view, i2);
        stopNestedScroll(i2);
    }

    @Override // androidx.core.view.jp0y
    public void ld6(@lvui View view, @lvui View view2, int i2, int i3) {
        this.f87408bo.zy(view, view2, i2, i3);
        startNestedScroll(2, i3);
    }

    public final void lvui(int i2, int i3) {
        m25694r(i2, i3, false);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View view, int i2, int i3) {
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i2, int i3, int i4, int i5) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i2, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i3, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    protected int m25693n(Rect rect) {
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

    @Override // androidx.core.view.gvn7
    public void ni7(@lvui View view, int i2, int i3, int i4, int i5, int i6, @lvui int[] iArr) {
        m25690t(i5, i6, iArr);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f39951i = false;
    }

    @Override // qh4d.InterfaceC7614k
    public void onContentInsetChanged(Rect rect) {
        setClipToPadding(false);
        setPadding(getPaddingLeft(), Math.max(rect.top, this.f39953k), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f39953k = getPaddingTop();
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        if ((motionEvent.getSource() & 2) != 0 && motionEvent.getAction() == 8 && !this.f39962t) {
            float axisValue = motionEvent.getAxisValue(9);
            if (axisValue != 0.0f) {
                int verticalScrollFactorCompat = (int) (axisValue * getVerticalScrollFactorCompat());
                int scrollRange = getScrollRange();
                int scrollY = getScrollY();
                int i2 = scrollY - verticalScrollFactorCompat;
                if (i2 < 0) {
                    scrollRange = 0;
                } else if (i2 <= scrollRange) {
                    scrollRange = i2;
                }
                if (scrollRange != scrollY) {
                    super.scrollTo(getScrollX(), scrollRange);
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007d  */
    @Override // android.view.ViewGroup
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onInterceptTouchEvent(android.view.MotionEvent r12) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: miuix.core.widget.NestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        super.onLayout(z2, i2, i3, i4, i5);
        int measuredHeight = 0;
        this.f39950h = false;
        View view = this.f39968z;
        if (view != null && o1t(view, this)) {
            d3(this.f39968z);
        }
        this.f39968z = null;
        if (!this.f39951i) {
            if (this.f39963u != null) {
                scrollTo(getScrollX(), this.f39963u.f39969k);
                this.f39963u = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i5 - i3) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM25689q = m25689q(scrollY, paddingTop, measuredHeight);
            if (iM25689q != scrollY) {
                scrollTo(getScrollX(), iM25689q);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f39951i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.f39954l && View.MeasureSpec.getMode(i3) != 0 && getChildCount() > 0) {
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
        x2((int) f3);
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
        m25690t(i5, 0, null);
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
        if (viewFindNextFocus == null || fn3e(viewFindNextFocus)) {
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
        this.f39963u = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f39969k = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i2, int i3, int i4, int i5) {
        super.onScrollChanged(i2, i3, i4, i5);
        toq toqVar = this.f39965w;
        if (toqVar != null) {
            toqVar.m25697k(this, i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !o1t(viewFindFocus, this) || !wvg(viewFindFocus, 0, i5)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f39956n);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f39956n);
        m25686g(m25693n(this.f39956n));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onStartNestedScroll(@lvui View view, @lvui View view2, int i2) {
        return mo426z(view, view2, i2, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onStopNestedScroll(@lvui View view) {
        kja0(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        t8r();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f39943a = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f39943a);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f39960r;
                velocityTracker.computeCurrentVelocity(1000, this.f39952j);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f39957o);
                if (Math.abs(yVelocity) >= this.f39947e) {
                    int i2 = -yVelocity;
                    float f2 = i2;
                    if (!dispatchNestedPreFling(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        x2(i2);
                    }
                } else if (this.f39949g.mcp(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0683f.h7am(this);
                }
                this.f39957o = -1;
                f7l8();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f39957o);
                if (iFindPointerIndex == -1) {
                    Log.e(an, "Invalid pointerId=" + this.f39957o + " in onTouchEvent");
                } else {
                    int y3 = (int) motionEvent.getY(iFindPointerIndex);
                    int i3 = this.f39958p - y3;
                    if (!this.f39962t && Math.abs(i3) > this.f39945c) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f39962t = true;
                        i3 = i3 > 0 ? i3 - this.f39945c : i3 + this.f39945c;
                    }
                    int i4 = i3;
                    if (this.f39962t) {
                        if (dispatchNestedPreScroll(0, i4, this.f39944b, this.f39955m, 0)) {
                            i4 -= this.f39944b[1];
                            this.f39943a += this.f39955m[1];
                        }
                        int i5 = i4;
                        this.f39958p = y3 - this.f39955m[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (jk(0, i5, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(0)) {
                            this.f39960r.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f39944b;
                        iArr[1] = 0;
                        dispatchNestedScroll(0, scrollY2, 0, i5 - scrollY2, this.f39955m, 0, iArr);
                        int i6 = this.f39958p;
                        int i7 = this.f39955m[1];
                        this.f39958p = i6 - i7;
                        this.f39943a += i7;
                        if (z2) {
                            int i8 = i5 - this.f39944b[1];
                            m25691y();
                            int i9 = scrollY + i8;
                            if (i9 < 0) {
                                C0762s.f7l8(this.f39967y, i8 / getHeight(), motionEvent.getX(iFindPointerIndex) / getWidth());
                                if (!this.f39961s.isFinished()) {
                                    this.f39961s.onRelease();
                                }
                            } else if (i9 > scrollRange) {
                                C0762s.f7l8(this.f39961s, i8 / getHeight(), 1.0f - (motionEvent.getX(iFindPointerIndex) / getWidth()));
                                if (!this.f39967y.isFinished()) {
                                    this.f39967y.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f39967y;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f39961s.isFinished())) {
                                C0683f.h7am(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f39962t && getChildCount() > 0 && this.f39949g.mcp(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0683f.h7am(this);
                }
                this.f39957o = -1;
                f7l8();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f39958p = (int) motionEvent.getY(actionIndex);
                this.f39957o = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                mcp(motionEvent);
                this.f39958p = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f39957o));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            boolean z3 = !this.f39949g.ki();
            this.f39962t = z3;
            if (z3 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f39949g.ki()) {
                m25687k();
            }
            this.f39958p = (int) motionEvent.getY();
            this.f39957o = motionEvent.getPointerId(0);
            startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f39960r;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public boolean qrj(int i2) {
        int childCount;
        boolean z2 = i2 == 130;
        int height = getHeight();
        Rect rect = this.f39956n;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f39956n.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f39956n;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f39956n;
        return gvn7(i2, rect3.top, rect3.bottom);
    }

    /* JADX INFO: renamed from: r */
    void m25694r(int i2, int i3, boolean z2) {
        d2ok(i2 - getScrollX(), i3 - getScrollY(), z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f39950h) {
            this.f39968z = view2;
        } else {
            d3(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return oc(rect, z2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z2) {
        if (z2) {
            fti();
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f39950h = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public boolean m25695s(@lvui KeyEvent keyEvent) {
        this.f39956n.setEmpty();
        if (!zy()) {
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
            return !keyEvent.isAltPressed() ? toq(33) : qrj(33);
        }
        if (keyCode == 20) {
            return !keyEvent.isAltPressed() ? toq(130) : qrj(130);
        }
        if (keyCode != 62) {
            return false;
        }
        a9(keyEvent.isShiftPressed() ? 33 : 130);
        return false;
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
            int iM25689q = m25689q(i2, width, width2);
            int iM25689q2 = m25689q(i3, height, height2);
            if (iM25689q == getScrollX() && iM25689q2 == getScrollY()) {
                return;
            }
            super.scrollTo(iM25689q, iM25689q2);
        }
    }

    public void setFillViewport(boolean z2) {
        if (z2 != this.f39954l) {
            this.f39954l = z2;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.a9
    public void setNestedScrollingEnabled(boolean z2) {
        this.f39964v.mo3264h(z2);
    }

    public void setOnScrollChangeListener(@dd toq toqVar) {
        this.f39965w = toqVar;
    }

    public void setSmoothScrollingEnabled(boolean z2) {
        this.f39948f = z2;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.mcp
    public boolean startNestedScroll(int i2, int i3) {
        return this.f39964v.t8r(i2, i3);
    }

    @Override // androidx.core.view.mcp
    public void stopNestedScroll(int i2) {
        this.f39964v.fn3e(i2);
    }

    public boolean toq(int i2) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i2);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !wvg(viewFindNextFocus, maxScrollAmount, getHeight())) {
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
            m25686g(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f39956n);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f39956n);
            m25686g(m25693n(this.f39956n));
            viewFindNextFocus.requestFocus(i2);
        }
        if (viewFindFocus == null || !viewFindFocus.isFocused() || !fn3e(viewFindFocus)) {
            return true;
        }
        int descendantFocusability = getDescendantFocusability();
        setDescendantFocusability(131072);
        requestFocus();
        setDescendantFocusability(descendantFocusability);
        return true;
    }

    public void x2(int i2) {
        if (getChildCount() > 0) {
            this.f87407ab = !canScrollVertically(i2 > 0 ? 1 : -1);
            this.f39949g.m26264n(getScrollX(), getScrollY(), 0, i2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            jp0y(true);
        }
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: z */
    public boolean mo426z(@lvui View view, @lvui View view2, int i2, int i3) {
        return (i2 & 2) != 0;
    }

    public boolean zurt() {
        return this.f39948f;
    }

    public NestedScrollView(@lvui Context context, @dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return dispatchNestedPreScroll(i2, i3, iArr, iArr2, 0);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return this.f39964v.f7l8(i2, i3, i4, i5, iArr, i6);
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
        this.f39956n = new Rect();
        this.f39950h = true;
        this.f39951i = false;
        this.f39968z = null;
        this.f39962t = false;
        this.f39948f = true;
        this.f39957o = -1;
        this.f39955m = new int[2];
        this.f39944b = new int[2];
        ki();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bl, i2, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f87408bo = new oc(this);
        this.f39964v = new fti(this);
        setNestedScrollingEnabled(true);
        C0683f.zwy(this, in);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return this.f39964v.mo3263g(i2, i3, i4, i5, iArr);
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
