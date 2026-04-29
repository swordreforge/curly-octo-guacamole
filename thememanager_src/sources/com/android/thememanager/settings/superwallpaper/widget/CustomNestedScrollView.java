package com.android.thememanager.settings.superwallpaper.widget;

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
import android.widget.OverScroller;
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
import zy.dd;
import zy.lvui;
import zy.uv6;

/* JADX INFO: loaded from: classes2.dex */
public class CustomNestedScrollView extends FrameLayout implements gvn7, jk, ncyb {

    /* JADX INFO: renamed from: ab, reason: collision with root package name */
    static final float f61012ab = 0.5f;
    private static final String bb = "NestedScrollView";
    private static final int bp = -1;

    /* JADX INFO: renamed from: w */
    static final int f15864w = 250;

    /* JADX INFO: renamed from: a */
    private int f15865a;

    /* JADX INFO: renamed from: b */
    private int f15866b;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private final fti f61013bo;

    /* JADX INFO: renamed from: c */
    private int f15867c;

    /* JADX INFO: renamed from: d */
    private toq f15868d;

    /* JADX INFO: renamed from: e */
    private int f15869e;

    /* JADX INFO: renamed from: f */
    private int f15870f;

    /* JADX INFO: renamed from: g */
    private EdgeEffect f15871g;

    /* JADX INFO: renamed from: h */
    private boolean f15872h;

    /* JADX INFO: renamed from: i */
    private View f15873i;

    /* JADX INFO: renamed from: j */
    private int f15874j;

    /* JADX INFO: renamed from: k */
    private long f15875k;

    /* JADX INFO: renamed from: l */
    private boolean f15876l;

    /* JADX INFO: renamed from: m */
    private final int[] f15877m;

    /* JADX INFO: renamed from: n */
    private OverScroller f15878n;

    /* JADX INFO: renamed from: o */
    private final int[] f15879o;

    /* JADX INFO: renamed from: p */
    private boolean f15880p;

    /* JADX INFO: renamed from: q */
    private final Rect f15881q;

    /* JADX INFO: renamed from: r */
    private boolean f15882r;

    /* JADX INFO: renamed from: s */
    private int f15883s;

    /* JADX INFO: renamed from: t */
    private VelocityTracker f15884t;

    /* JADX INFO: renamed from: u */
    private final oc f15885u;

    /* JADX INFO: renamed from: v */
    private float f15886v;

    /* JADX INFO: renamed from: x */
    private SavedState f15887x;

    /* JADX INFO: renamed from: y */
    private EdgeEffect f15888y;

    /* JADX INFO: renamed from: z */
    private boolean f15889z;
    private static final C2680k bv = new C2680k();
    private static final int[] an = {R.attr.fillViewport};

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.Creator<SavedState>() { // from class: com.android.thememanager.settings.superwallpaper.widget.CustomNestedScrollView.SavedState.1
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: toq, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };

        /* JADX INFO: renamed from: k */
        public int f15890k;

        SavedState(Parcelable superState) {
            super(superState);
        }

        @lvui
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f15890k + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel dest, int flags) {
            super.writeToParcel(dest, flags);
            dest.writeInt(this.f15890k);
        }

        SavedState(Parcel source) {
            super(source);
            this.f15890k = source.readInt();
        }
    }

    /* JADX INFO: renamed from: com.android.thememanager.settings.superwallpaper.widget.CustomNestedScrollView$k */
    static class C2680k extends C0701k {
        C2680k() {
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityEvent(View host, AccessibilityEvent event) {
            super.onInitializeAccessibilityEvent(host, event);
            CustomNestedScrollView customNestedScrollView = (CustomNestedScrollView) host;
            event.setClassName(ScrollView.class.getName());
            event.setScrollable(customNestedScrollView.getScrollRange() > 0);
            event.setScrollX(customNestedScrollView.getScrollX());
            event.setScrollY(customNestedScrollView.getScrollY());
            C0654i.m3020r(event, customNestedScrollView.getScrollX());
            C0654i.x9kr(event, customNestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.C0701k
        public void onInitializeAccessibilityNodeInfo(View host, ki info) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(host, info);
            CustomNestedScrollView customNestedScrollView = (CustomNestedScrollView) host;
            info.sok(ScrollView.class.getName());
            if (!customNestedScrollView.isEnabled() || (scrollRange = customNestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            info.lh(true);
            if (customNestedScrollView.getScrollY() > 0) {
                info.toq(ki.C0656k.f50720t8r);
                info.toq(ki.C0656k.f50707jk);
            }
            if (customNestedScrollView.getScrollY() < scrollRange) {
                info.toq(ki.C0656k.f50709ki);
                info.toq(ki.C0656k.f50704fti);
            }
        }

        @Override // androidx.core.view.C0701k
        public boolean performAccessibilityAction(View host, int action, Bundle arguments) {
            if (super.performAccessibilityAction(host, action, arguments)) {
                return true;
            }
            CustomNestedScrollView customNestedScrollView = (CustomNestedScrollView) host;
            if (!customNestedScrollView.isEnabled()) {
                return false;
            }
            if (action != 4096) {
                if (action == 8192 || action == 16908344) {
                    int iMax = Math.max(customNestedScrollView.getScrollY() - ((customNestedScrollView.getHeight() - customNestedScrollView.getPaddingBottom()) - customNestedScrollView.getPaddingTop()), 0);
                    if (iMax == customNestedScrollView.getScrollY()) {
                        return false;
                    }
                    customNestedScrollView.m9354r(0, iMax, true);
                    return true;
                }
                if (action != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(customNestedScrollView.getScrollY() + ((customNestedScrollView.getHeight() - customNestedScrollView.getPaddingBottom()) - customNestedScrollView.getPaddingTop()), customNestedScrollView.getScrollRange());
            if (iMin == customNestedScrollView.getScrollY()) {
                return false;
            }
            customNestedScrollView.m9354r(0, iMin, true);
            return true;
        }
    }

    public interface toq {
        /* JADX INFO: renamed from: k */
        void m9357k(CustomNestedScrollView v2, int scrollX, int scrollY, int oldScrollX, int oldScrollY);
    }

    public CustomNestedScrollView(@lvui Context context) {
        this(context, null);
    }

    private void cdj() {
        VelocityTracker velocityTracker = this.f15884t;
        if (velocityTracker == null) {
            this.f15884t = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void d2ok(int dx, int dy, boolean withNestedScrolling) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f15875k > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f15878n.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(dy + scrollY, Math.max(0, height - height2))) - scrollY);
            jp0y(withNestedScrolling);
        } else {
            if (!this.f15878n.isFinished()) {
                m9347k();
            }
            scrollBy(dx, dy);
        }
        this.f15875k = AnimationUtils.currentAnimationTimeMillis();
    }

    private void d3(View child) {
        child.getDrawingRect(this.f15881q);
        offsetDescendantRectToMyCoords(child, this.f15881q);
        int iM9353n = m9353n(this.f15881q);
        if (iM9353n != 0) {
            scrollBy(0, iM9353n);
        }
    }

    private void f7l8() {
        this.f15889z = false;
        fti();
        stopNestedScroll(0);
        EdgeEffect edgeEffect = this.f15871g;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            this.f15888y.onRelease();
        }
    }

    private boolean fn3e(View descendant) {
        return !wvg(descendant, 0, getHeight());
    }

    private void fti() {
        VelocityTracker velocityTracker = this.f15884t;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f15884t = null;
        }
    }

    /* JADX INFO: renamed from: g */
    private void m9346g(int delta) {
        if (delta != 0) {
            if (this.f15876l) {
                eqxt(0, delta);
            } else {
                scrollBy(0, delta);
            }
        }
    }

    private float getVerticalScrollFactorCompat() {
        if (this.f15886v == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f15886v = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f15886v;
    }

    private boolean gvn7(int direction, int top, int bottom) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i2 = height + scrollY;
        boolean z2 = false;
        boolean z3 = direction == 33;
        View viewM9348p = m9348p(z3, top, bottom);
        if (viewM9348p == null) {
            viewM9348p = this;
        }
        if (top < scrollY || bottom > i2) {
            m9346g(z3 ? top - scrollY : bottom - i2);
            z2 = true;
        }
        if (viewM9348p != findFocus()) {
            viewM9348p.requestFocus(direction);
        }
        return z2;
    }

    private void jp0y(boolean participateInNestedScrolling) {
        if (participateInNestedScrolling) {
            startNestedScroll(2, 1);
        } else {
            stopNestedScroll(1);
        }
        this.f15865a = getScrollY();
        C0683f.h7am(this);
    }

    /* JADX INFO: renamed from: k */
    private void m9347k() {
        this.f15878n.abortAnimation();
        stopNestedScroll(1);
    }

    private void ki() {
        this.f15878n = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f15870f = viewConfiguration.getScaledTouchSlop();
        this.f15867c = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f15869e = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void mcp(MotionEvent ev) {
        int actionIndex = ev.getActionIndex();
        if (ev.getPointerId(actionIndex) == this.f15874j) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.f15883s = (int) ev.getY(i2);
            this.f15874j = ev.getPointerId(i2);
            VelocityTracker velocityTracker = this.f15884t;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean n7h(int x3, int y3) {
        if (getChildCount() <= 0) {
            return false;
        }
        int scrollY = getScrollY();
        View childAt = getChildAt(0);
        return y3 >= childAt.getTop() - scrollY && y3 < childAt.getBottom() - scrollY && x3 >= childAt.getLeft() && x3 < childAt.getRight();
    }

    private static boolean o1t(View child, View parent) {
        if (child == parent) {
            return true;
        }
        Object parent2 = child.getParent();
        return (parent2 instanceof ViewGroup) && o1t((View) parent2, parent);
    }

    private boolean oc(Rect rect, boolean immediate) {
        int iM9353n = m9353n(rect);
        boolean z2 = iM9353n != 0;
        if (z2) {
            if (immediate) {
                scrollBy(0, iM9353n);
            } else {
                eqxt(0, iM9353n);
            }
        }
        return z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x004f  */
    /* JADX INFO: renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private android.view.View m9348p(boolean r13, int r14, int r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.superwallpaper.widget.CustomNestedScrollView.m9348p(boolean, int, int):android.view.View");
    }

    /* JADX INFO: renamed from: q */
    private static int m9349q(int n2, int my, int child) {
        if (my >= child || n2 < 0) {
            return 0;
        }
        return my + n2 > child ? child - my : n2;
    }

    /* JADX INFO: renamed from: t */
    private void m9350t(int dyUnconsumed, int type, @dd int[] consumed) {
        int scrollY = getScrollY();
        scrollBy(0, dyUnconsumed);
        int scrollY2 = getScrollY() - scrollY;
        if (consumed != null) {
            consumed[1] = consumed[1] + scrollY2;
        }
        this.f61013bo.mo3267n(0, scrollY2, 0, dyUnconsumed - scrollY2, null, type, consumed);
    }

    private void t8r() {
        if (this.f15884t == null) {
            this.f15884t = VelocityTracker.obtain();
        }
    }

    private boolean wvg(View descendant, int delta, int height) {
        descendant.getDrawingRect(this.f15881q);
        offsetDescendantRectToMyCoords(descendant, this.f15881q);
        return this.f15881q.bottom + delta >= getScrollY() && this.f15881q.top - delta <= getScrollY() + height;
    }

    /* JADX INFO: renamed from: y */
    private void m9351y() {
        if (getOverScrollMode() == 2) {
            this.f15871g = null;
            this.f15888y = null;
        } else if (this.f15871g == null) {
            Context context = getContext();
            this.f15871g = new EdgeEffect(context);
            this.f15888y = new EdgeEffect(context);
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

    public boolean a9(int direction) {
        boolean z2 = direction == 130;
        int height = getHeight();
        if (z2) {
            this.f15881q.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f15881q;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f15881q.top = getScrollY() - height;
            Rect rect2 = this.f15881q;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f15881q;
        int i2 = rect3.top;
        int i3 = height + i2;
        rect3.bottom = i3;
        return gvn7(direction, i2, i3);
    }

    @Override // android.view.ViewGroup
    public void addView(View child) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(child);
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
        if (this.f15878n.isFinished()) {
            return;
        }
        this.f15878n.computeScrollOffset();
        int currY = this.f15878n.getCurrY();
        int i2 = currY - this.f15865a;
        this.f15865a = currY;
        int[] iArr = this.f15877m;
        boolean z2 = false;
        iArr[1] = 0;
        dispatchNestedPreScroll(0, i2, iArr, null, 1);
        int i3 = i2 - this.f15877m[1];
        int scrollRange = getScrollRange();
        if (i3 != 0) {
            int scrollY = getScrollY();
            jk(0, i3, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i4 = i3 - scrollY2;
            int[] iArr2 = this.f15877m;
            iArr2[1] = 0;
            dispatchNestedScroll(0, scrollY2, 0, i4, this.f15879o, 1, iArr2);
            i3 = i4 - this.f15877m[1];
        }
        if (i3 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                z2 = true;
            }
            if (z2) {
                m9351y();
                if (i3 < 0) {
                    if (this.f15871g.isFinished()) {
                        this.f15871g.onAbsorb((int) this.f15878n.getCurrVelocity());
                    }
                } else if (this.f15888y.isFinished()) {
                    this.f15888y.onAbsorb((int) this.f15878n.getCurrVelocity());
                }
            }
            m9347k();
        }
        if (this.f15878n.isFinished()) {
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
    public boolean dispatchKeyEvent(KeyEvent event) {
        return super.dispatchKeyEvent(event) || m9355s(event);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedFling(float velocityX, float velocityY, boolean consumed) {
        return this.f61013bo.mo3266k(velocityX, velocityY, consumed);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedPreFling(float velocityX, float velocityY) {
        return this.f61013bo.toq(velocityX, velocityY);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow, int type) {
        return this.f61013bo.mo3268q(dx, dy, consumed, offsetInWindow, type);
    }

    @Override // androidx.core.view.jk
    public void dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, @dd int[] offsetInWindow, int type, @lvui int[] consumed) {
        this.f61013bo.mo3267n(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type, consumed);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        if (this.f15871g != null) {
            int scrollY = getScrollY();
            int paddingLeft2 = 0;
            if (!this.f15871g.isFinished()) {
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
                this.f15871g.setSize(width, height);
                if (this.f15871g.draw(canvas)) {
                    C0683f.h7am(this);
                }
                canvas.restoreToCount(iSave);
            }
            if (this.f15888y.isFinished()) {
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
            this.f15888y.setSize(width2, height2);
            if (this.f15888y.draw(canvas)) {
                C0683f.h7am(this);
            }
            canvas.restoreToCount(iSave2);
        }
    }

    public final void eqxt(int dx, int dy) {
        d2ok(dx, dy, false);
    }

    @Override // androidx.core.view.jp0y
    public void fu4(@lvui View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        m9350t(dyUnconsumed, type, null);
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
        return this.f15885u.m3397k();
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
    public void mo419h(@lvui View target, int dx, int dy, @lvui int[] consumed, int type) {
        dispatchNestedPreScroll(dx, dy, consumed, null, type);
    }

    @Override // androidx.core.view.mcp
    public boolean hasNestedScrollingParent(int type) {
        return this.f61013bo.x2(type);
    }

    /* JADX INFO: renamed from: i */
    public boolean m9352i() {
        return this.f15882r;
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean isNestedScrollingEnabled() {
        return this.f61013bo.qrj();
    }

    boolean jk(int deltaX, int deltaY, int scrollX, int scrollY, int scrollRangeX, int scrollRangeY, int maxOverScrollX, int maxOverScrollY, boolean isTouchEvent) {
        boolean z2;
        boolean z3;
        int overScrollMode = getOverScrollMode();
        boolean z5 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z6 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z7 = overScrollMode == 0 || (overScrollMode == 1 && z5);
        boolean z8 = overScrollMode == 0 || (overScrollMode == 1 && z6);
        int i2 = scrollX + deltaX;
        int i3 = !z7 ? 0 : maxOverScrollX;
        int i4 = scrollY + deltaY;
        int i5 = !z8 ? 0 : maxOverScrollY;
        int i6 = -i3;
        int i7 = i3 + scrollRangeX;
        int i8 = -i5;
        int i9 = i5 + scrollRangeY;
        if (i2 > i7) {
            i2 = i7;
            z2 = true;
        } else if (i2 < i6) {
            z2 = true;
            i2 = i6;
        } else {
            z2 = false;
        }
        if (i4 > i9) {
            i4 = i9;
            z3 = true;
        } else if (i4 < i8) {
            z3 = true;
            i4 = i8;
        } else {
            z3 = false;
        }
        if (z3 && !hasNestedScrollingParent(1)) {
            this.f15878n.springBack(i2, i4, 0, 0, 0, getScrollRange());
        }
        onOverScrolled(i2, i4, z2, z3);
        return z2 || z3;
    }

    @Override // androidx.core.view.jp0y
    public void kja0(@lvui View target, int type) {
        this.f15885u.m3398n(target, type);
        stopNestedScroll(type);
    }

    @Override // androidx.core.view.jp0y
    public void ld6(@lvui View child, @lvui View target, int axes, int type) {
        this.f15885u.zy(child, target, axes, type);
        startNestedScroll(2, type);
    }

    public final void lvui(int x3, int y3) {
        m9354r(x3, y3, false);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(View child, int parentWidthMeasureSpec, int parentHeightMeasureSpec) {
        child.measure(ViewGroup.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight(), child.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View child, int parentWidthMeasureSpec, int widthUsed, int parentHeightMeasureSpec, int heightUsed) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) child.getLayoutParams();
        child.measure(ViewGroup.getChildMeasureSpec(parentWidthMeasureSpec, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + widthUsed, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    /* JADX INFO: renamed from: n */
    protected int m9353n(Rect rect) {
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
    public void ni7(@lvui View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, @lvui int[] consumed) {
        m9350t(dyUnconsumed, type, consumed);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15872h = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent event) {
        if ((event.getSource() & 2) != 0 && event.getAction() == 8 && !this.f15889z) {
            float axisValue = event.getAxisValue(9);
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
        throw new UnsupportedOperationException("Method not decompiled: com.android.thememanager.settings.superwallpaper.widget.CustomNestedScrollView.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l2, int t2, int r2, int b2) {
        super.onLayout(changed, l2, t2, r2, b2);
        int measuredHeight = 0;
        this.f15880p = false;
        View view = this.f15873i;
        if (view != null && o1t(view, this)) {
            d3(this.f15873i);
        }
        this.f15873i = null;
        if (!this.f15872h) {
            if (this.f15887x != null) {
                scrollTo(getScrollX(), this.f15887x.f15890k);
                this.f15887x = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((b2 - t2) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iM9349q = m9349q(scrollY, paddingTop, measuredHeight);
            if (iM9349q != scrollY) {
                scrollTo(getScrollX(), iM9349q);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f15872h = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        if (this.f15882r && View.MeasureSpec.getMode(heightMeasureSpec) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(widthMeasureSpec, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedFling(@lvui View target, float velocityX, float velocityY, boolean consumed) {
        if (consumed) {
            return false;
        }
        dispatchNestedFling(0.0f, velocityY, true);
        x2((int) velocityY);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onNestedPreFling(@lvui View target, float velocityX, float velocityY) {
        return dispatchNestedPreFling(velocityX, velocityY);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedPreScroll(@lvui View target, int dx, int dy, @lvui int[] consumed) {
        mo419h(target, dx, dy, consumed, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedScroll(@lvui View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed) {
        m9350t(dyUnconsumed, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onNestedScrollAccepted(@lvui View child, @lvui View target, int nestedScrollAxes) {
        ld6(child, target, nestedScrollAxes, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int scrollX, int scrollY, boolean clampedX, boolean clampedY) {
        super.scrollTo(scrollX, scrollY);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int direction, Rect previouslyFocusedRect) {
        if (direction == 2) {
            direction = 130;
        } else if (direction == 1) {
            direction = 33;
        }
        View viewFindNextFocus = previouslyFocusedRect == null ? FocusFinder.getInstance().findNextFocus(this, null, direction) : FocusFinder.getInstance().findNextFocusFromRect(this, previouslyFocusedRect, direction);
        if (viewFindNextFocus == null || fn3e(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(direction, previouslyFocusedRect);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable state) {
        if (!(state instanceof SavedState)) {
            super.onRestoreInstanceState(state);
            return;
        }
        SavedState savedState = (SavedState) state;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f15887x = savedState;
        requestLayout();
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f15890k = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int l2, int t2, int oldl, int oldt) {
        super.onScrollChanged(l2, t2, oldl, oldt);
        toq toqVar = this.f15868d;
        if (toqVar != null) {
            toqVar.m9357k(this, l2, t2, oldl, oldt);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int w2, int h2, int oldw, int oldh) {
        super.onSizeChanged(w2, h2, oldw, oldh);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !wvg(viewFindFocus, 0, oldh)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f15881q);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f15881q);
        m9346g(m9353n(this.f15881q));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public boolean onStartNestedScroll(@lvui View child, @lvui View target, int nestedScrollAxes) {
        return mo426z(child, target, nestedScrollAxes, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.d3
    public void onStopNestedScroll(@lvui View target) {
        kja0(target, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent ev) {
        ViewParent parent;
        t8r();
        int actionMasked = ev.getActionMasked();
        if (actionMasked == 0) {
            this.f15866b = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(ev);
        motionEventObtain.offsetLocation(0.0f, this.f15866b);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f15884t;
                velocityTracker.computeCurrentVelocity(1000, this.f15869e);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f15874j);
                if (Math.abs(yVelocity) >= this.f15867c) {
                    int i2 = -yVelocity;
                    float f2 = i2;
                    if (!dispatchNestedPreFling(0.0f, f2)) {
                        dispatchNestedFling(0.0f, f2, true);
                        x2(i2);
                    }
                } else if (this.f15878n.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0683f.h7am(this);
                }
                this.f15874j = -1;
                f7l8();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = ev.findPointerIndex(this.f15874j);
                if (iFindPointerIndex == -1) {
                    Log.e(bb, "Invalid pointerId=" + this.f15874j + " in onTouchEvent");
                } else {
                    int y3 = (int) ev.getY(iFindPointerIndex);
                    int i3 = this.f15883s - y3;
                    if (!this.f15889z && Math.abs(i3) > this.f15870f) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f15889z = true;
                        i3 = i3 > 0 ? i3 - this.f15870f : i3 + this.f15870f;
                    }
                    int i4 = i3;
                    if (this.f15889z) {
                        if (dispatchNestedPreScroll(0, i4, this.f15877m, this.f15879o, 0)) {
                            i4 -= this.f15877m[1];
                            this.f15866b += this.f15879o[1];
                        }
                        int i5 = i4;
                        this.f15883s = y3 - this.f15879o[1];
                        int scrollY = getScrollY();
                        int scrollRange = getScrollRange();
                        int overScrollMode = getOverScrollMode();
                        boolean z2 = overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0);
                        if (jk(0, i5, 0, getScrollY(), 0, scrollRange, 0, 0, true) && !hasNestedScrollingParent(0)) {
                            this.f15884t.clear();
                        }
                        int scrollY2 = getScrollY() - scrollY;
                        int[] iArr = this.f15877m;
                        iArr[1] = 0;
                        dispatchNestedScroll(0, scrollY2, 0, i5 - scrollY2, this.f15879o, 0, iArr);
                        int i6 = this.f15883s;
                        int i7 = this.f15879o[1];
                        this.f15883s = i6 - i7;
                        this.f15866b += i7;
                        if (z2) {
                            int i8 = i5 - this.f15877m[1];
                            m9351y();
                            int i9 = scrollY + i8;
                            if (i9 < 0) {
                                C0762s.f7l8(this.f15871g, i8 / getHeight(), ev.getX(iFindPointerIndex) / getWidth());
                                if (!this.f15888y.isFinished()) {
                                    this.f15888y.onRelease();
                                }
                            } else if (i9 > scrollRange) {
                                C0762s.f7l8(this.f15888y, i8 / getHeight(), 1.0f - (ev.getX(iFindPointerIndex) / getWidth()));
                                if (!this.f15871g.isFinished()) {
                                    this.f15871g.onRelease();
                                }
                            }
                            EdgeEffect edgeEffect = this.f15871g;
                            if (edgeEffect != null && (!edgeEffect.isFinished() || !this.f15888y.isFinished())) {
                                C0683f.h7am(this);
                            }
                        }
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f15889z && getChildCount() > 0 && this.f15878n.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    C0683f.h7am(this);
                }
                this.f15874j = -1;
                f7l8();
            } else if (actionMasked == 5) {
                int actionIndex = ev.getActionIndex();
                this.f15883s = (int) ev.getY(actionIndex);
                this.f15874j = ev.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                mcp(ev);
                this.f15883s = (int) ev.getY(ev.findPointerIndex(this.f15874j));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            boolean z3 = !this.f15878n.isFinished();
            this.f15889z = z3;
            if (z3 && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f15878n.isFinished()) {
                m9347k();
            }
            this.f15883s = (int) ev.getY();
            this.f15874j = ev.getPointerId(0);
            startNestedScroll(2, 0);
        }
        VelocityTracker velocityTracker2 = this.f15884t;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public boolean qrj(int direction) {
        int childCount;
        boolean z2 = direction == 130;
        int height = getHeight();
        Rect rect = this.f15881q;
        rect.top = 0;
        rect.bottom = height;
        if (z2 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f15881q.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f15881q;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f15881q;
        return gvn7(direction, rect3.top, rect3.bottom);
    }

    /* JADX INFO: renamed from: r */
    void m9354r(int x3, int y3, boolean withNestedScrolling) {
        d2ok(x3 - getScrollX(), y3 - getScrollY(), withNestedScrolling);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View child, View focused) {
        if (this.f15880p) {
            this.f15873i = focused;
        } else {
            d3(focused);
        }
        super.requestChildFocus(child, focused);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        rectangle.offset(child.getLeft() - child.getScrollX(), child.getTop() - child.getScrollY());
        return oc(rectangle, immediate);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        if (disallowIntercept) {
            fti();
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f15880p = true;
        super.requestLayout();
    }

    /* JADX INFO: renamed from: s */
    public boolean m9355s(@lvui KeyEvent event) {
        this.f15881q.setEmpty();
        if (!zy()) {
            if (!isFocused() || event.getKeyCode() == 4) {
                return false;
            }
            View viewFindFocus = findFocus();
            if (viewFindFocus == this) {
                viewFindFocus = null;
            }
            View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
            return (viewFindNextFocus == null || viewFindNextFocus == this || !viewFindNextFocus.requestFocus(130)) ? false : true;
        }
        if (event.getAction() != 0) {
            return false;
        }
        int keyCode = event.getKeyCode();
        if (keyCode == 19) {
            return !event.isAltPressed() ? toq(33) : qrj(33);
        }
        if (keyCode == 20) {
            return !event.isAltPressed() ? toq(130) : qrj(130);
        }
        if (keyCode != 62) {
            return false;
        }
        a9(event.isShiftPressed() ? 33 : 130);
        return false;
    }

    @Override // android.view.View
    public void scrollTo(int x3, int y3) {
        if (getChildCount() > 0) {
            if (x3 == getScrollX() && y3 == getScrollY()) {
                return;
            }
            super.scrollTo(x3, y3);
        }
    }

    public void setFillViewport(boolean fillViewport) {
        if (fillViewport != this.f15882r) {
            this.f15882r = fillViewport;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.a9
    public void setNestedScrollingEnabled(boolean enabled) {
        this.f61013bo.mo3264h(enabled);
    }

    public void setOnScrollChangeListener(@dd toq l2) {
        this.f15868d = l2;
    }

    public void setSmoothScrollingEnabled(boolean smoothScrollingEnabled) {
        this.f15876l = smoothScrollingEnabled;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // androidx.core.view.mcp
    public boolean startNestedScroll(int axes, int type) {
        return this.f61013bo.t8r(axes, type);
    }

    @Override // androidx.core.view.mcp
    public void stopNestedScroll(int type) {
        this.f61013bo.fn3e(type);
    }

    public boolean toq(int direction) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, direction);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !wvg(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (direction == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (direction == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (direction != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            m9346g(maxScrollAmount);
        } else {
            viewFindNextFocus.getDrawingRect(this.f15881q);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f15881q);
            m9346g(m9353n(this.f15881q));
            viewFindNextFocus.requestFocus(direction);
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

    public void x2(int velocityY) {
        if (getChildCount() > 0) {
            this.f15878n.fling(getScrollX(), getScrollY(), 0, velocityY, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            jp0y(true);
        }
    }

    @Override // androidx.core.view.jp0y
    /* JADX INFO: renamed from: z */
    public boolean mo426z(@lvui View child, @lvui View target, int axes, int type) {
        return (axes & 2) != 0;
    }

    public boolean zurt() {
        return this.f15876l;
    }

    public CustomNestedScrollView(@lvui Context context, @dd AttributeSet attrs) {
        this(context, attrs, 0);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedPreScroll(int dx, int dy, int[] consumed, int[] offsetInWindow) {
        return dispatchNestedPreScroll(dx, dy, consumed, offsetInWindow, 0);
    }

    @Override // androidx.core.view.mcp
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow, int type) {
        return this.f61013bo.f7l8(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow, type);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean hasNestedScrollingParent() {
        return hasNestedScrollingParent(0);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean startNestedScroll(int axes) {
        return startNestedScroll(axes, 0);
    }

    @Override // android.view.View, androidx.core.view.a9
    public void stopNestedScroll() {
        stopNestedScroll(0);
    }

    public CustomNestedScrollView(@lvui Context context, @dd AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.f15881q = new Rect();
        this.f15880p = true;
        this.f15872h = false;
        this.f15873i = null;
        this.f15889z = false;
        this.f15876l = true;
        this.f15874j = -1;
        this.f15879o = new int[2];
        this.f15877m = new int[2];
        ki();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, an, defStyleAttr, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f15885u = new oc(this);
        this.f61013bo = new fti(this);
        setNestedScrollingEnabled(true);
        C0683f.zwy(this, bv);
    }

    @Override // android.view.View, androidx.core.view.a9
    public boolean dispatchNestedScroll(int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int[] offsetInWindow) {
        return this.f61013bo.mo3263g(dxConsumed, dyConsumed, dxUnconsumed, dyUnconsumed, offsetInWindow);
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index) {
        if (getChildCount() <= 0) {
            super.addView(child, index);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View child, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, params);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View child, int index, ViewGroup.LayoutParams params) {
        if (getChildCount() <= 0) {
            super.addView(child, index, params);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
