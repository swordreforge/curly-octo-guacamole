package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.core.view.C0683f;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import p030n.C7397k;
import zy.InterfaceC7846z;
import zy.uv6;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {

    /* JADX INFO: renamed from: a */
    public static final int f805a = 4;

    /* JADX INFO: renamed from: b */
    public static final int f806b = 2;

    /* JADX INFO: renamed from: bo, reason: collision with root package name */
    private static final int f46819bo = 1;

    /* JADX INFO: renamed from: d */
    private static final int f807d = 3;

    /* JADX INFO: renamed from: e */
    public static final int f808e = 0;

    /* JADX INFO: renamed from: j */
    public static final int f809j = 1;

    /* JADX INFO: renamed from: m */
    public static final int f810m = 1;

    /* JADX INFO: renamed from: o */
    public static final int f811o = 0;

    /* JADX INFO: renamed from: u */
    private static final int f812u = 0;

    /* JADX INFO: renamed from: v */
    private static final int f813v = 2;

    /* JADX INFO: renamed from: w */
    private static final String f814w = "androidx.appcompat.widget.LinearLayoutCompat";

    /* JADX INFO: renamed from: x */
    private static final int f815x = 4;

    /* JADX INFO: renamed from: c */
    private int f816c;

    /* JADX INFO: renamed from: f */
    private int f817f;

    /* JADX INFO: renamed from: g */
    private int f818g;

    /* JADX INFO: renamed from: h */
    private boolean f819h;

    /* JADX INFO: renamed from: i */
    private int[] f820i;

    /* JADX INFO: renamed from: k */
    private boolean f821k;

    /* JADX INFO: renamed from: l */
    private int f822l;

    /* JADX INFO: renamed from: n */
    private int f823n;

    /* JADX INFO: renamed from: p */
    private float f824p;

    /* JADX INFO: renamed from: q */
    private int f825q;

    /* JADX INFO: renamed from: r */
    private int f826r;

    /* JADX INFO: renamed from: s */
    private int f827s;

    /* JADX INFO: renamed from: t */
    private Drawable f828t;

    /* JADX INFO: renamed from: y */
    private int f829y;

    /* JADX INFO: renamed from: z */
    private int[] f830z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.LinearLayoutCompat$k */
    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface InterfaceC0162k {
    }

    public static class toq extends LinearLayout.LayoutParams {
        public toq(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public toq(int i2, int i3) {
            super(i2, i3);
        }

        public toq(int i2, int i3, float f2) {
            super(i2, i3, f2);
        }

        public toq(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public toq(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public @interface zy {
    }

    public LinearLayoutCompat(@zy.lvui Context context) {
        this(context, null);
    }

    private void ld6(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View viewKi = ki(i4);
            if (viewKi.getVisibility() != 8) {
                toq toqVar = (toq) viewKi.getLayoutParams();
                if (((LinearLayout.LayoutParams) toqVar).width == -1) {
                    int i5 = ((LinearLayout.LayoutParams) toqVar).height;
                    ((LinearLayout.LayoutParams) toqVar).height = viewKi.getMeasuredHeight();
                    measureChildWithMargins(viewKi, iMakeMeasureSpec, 0, i3, 0);
                    ((LinearLayout.LayoutParams) toqVar).height = i5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: p */
    private void m462p(int i2, int i3) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        for (int i4 = 0; i4 < i2; i4++) {
            View viewKi = ki(i4);
            if (viewKi.getVisibility() != 8) {
                toq toqVar = (toq) viewKi.getLayoutParams();
                if (((LinearLayout.LayoutParams) toqVar).height == -1) {
                    int i5 = ((LinearLayout.LayoutParams) toqVar).width;
                    ((LinearLayout.LayoutParams) toqVar).width = viewKi.getMeasuredWidth();
                    measureChildWithMargins(viewKi, i3, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) toqVar).width = i5;
                }
            }
        }
    }

    /* JADX INFO: renamed from: t */
    private void m463t(View view, int i2, int i3, int i4, int i5) {
        view.layout(i2, i3, i4 + i2, i5 + i3);
    }

    int cdj(View view) {
        return 0;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof toq;
    }

    void f7l8(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i2 = 0; i2 < virtualChildCount; i2++) {
            View viewKi = ki(i2);
            if (viewKi != null && viewKi.getVisibility() != 8 && t8r(i2)) {
                m468y(canvas, (viewKi.getTop() - ((LinearLayout.LayoutParams) ((toq) viewKi.getLayoutParams())).topMargin) - this.f822l);
            }
        }
        if (t8r(virtualChildCount)) {
            View viewKi2 = ki(virtualChildCount - 1);
            m468y(canvas, viewKi2 == null ? (getHeight() - getPaddingBottom()) - this.f822l : viewKi2.getBottom() + ((LinearLayout.LayoutParams) ((toq) viewKi2.getLayoutParams())).bottomMargin);
        }
    }

    public boolean fn3e() {
        return this.f819h;
    }

    void fu4(View view, int i2, int i3, int i4, int i5, int i6) {
        measureChildWithMargins(view, i3, i4, i5, i6);
    }

    @Override // android.view.View
    public int getBaseline() {
        int i2;
        if (this.f825q < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i3 = this.f825q;
        if (childCount <= i3) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i3);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f825q == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f823n;
        if (this.f818g == 1 && (i2 = this.f829y & 112) != 48) {
            if (i2 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f827s) / 2;
            } else if (i2 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f827s;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((toq) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f825q;
    }

    public Drawable getDividerDrawable() {
        return this.f828t;
    }

    public int getDividerPadding() {
        return this.f816c;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.f826r;
    }

    @InterfaceC7846z
    public int getGravity() {
        return this.f829y;
    }

    public int getOrientation() {
        return this.f818g;
    }

    public int getShowDividers() {
        return this.f817f;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f824p;
    }

    /* JADX INFO: renamed from: h */
    int m464h(View view) {
        return 0;
    }

    /* JADX INFO: renamed from: i */
    public boolean m465i() {
        return this.f821k;
    }

    View ki(int i2) {
        return getChildAt(i2);
    }

    int kja0(View view, int i2) {
        return 0;
    }

    /* JADX INFO: renamed from: n */
    void m466n(Canvas canvas) {
        int right;
        int left;
        int i2;
        int virtualChildCount = getVirtualChildCount();
        boolean qVar = nmn5.toq(this);
        for (int i3 = 0; i3 < virtualChildCount; i3++) {
            View viewKi = ki(i3);
            if (viewKi != null && viewKi.getVisibility() != 8 && t8r(i3)) {
                toq toqVar = (toq) viewKi.getLayoutParams();
                m467s(canvas, qVar ? viewKi.getRight() + ((LinearLayout.LayoutParams) toqVar).rightMargin : (viewKi.getLeft() - ((LinearLayout.LayoutParams) toqVar).leftMargin) - this.f826r);
            }
        }
        if (t8r(virtualChildCount)) {
            View viewKi2 = ki(virtualChildCount - 1);
            if (viewKi2 != null) {
                toq toqVar2 = (toq) viewKi2.getLayoutParams();
                if (qVar) {
                    left = viewKi2.getLeft() - ((LinearLayout.LayoutParams) toqVar2).leftMargin;
                    i2 = this.f826r;
                    right = left - i2;
                } else {
                    right = viewKi2.getRight() + ((LinearLayout.LayoutParams) toqVar2).rightMargin;
                }
            } else if (qVar) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i2 = this.f826r;
                right = left - i2;
            }
            m467s(canvas, right);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n7h, reason: merged with bridge method [inline-methods] */
    public toq generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new toq(layoutParams);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void ni7(int r18, int r19, int r20, int r21) {
        /*
            Method dump skipped, instruction units count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.ni7(int, int, int, int):void");
    }

    int o1t(int i2) {
        return 0;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f828t == null) {
            return;
        }
        if (this.f818g == 1) {
            f7l8(canvas);
        } else {
            m466n(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f814w);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f814w);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        if (this.f818g == 1) {
            ni7(i2, i3, i4, i5);
        } else {
            zurt(i2, i3, i4, i5);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i2, int i3) {
        if (this.f818g == 1) {
            wvg(i2, i3);
        } else {
            m469z(i2, i3);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: qrj, reason: merged with bridge method [inline-methods] */
    public toq generateLayoutParams(AttributeSet attributeSet) {
        return new toq(getContext(), attributeSet);
    }

    /* JADX INFO: renamed from: s */
    void m467s(Canvas canvas, int i2) {
        this.f828t.setBounds(i2, getPaddingTop() + this.f816c, this.f826r + i2, (getHeight() - getPaddingBottom()) - this.f816c);
        this.f828t.draw(canvas);
    }

    public void setBaselineAligned(boolean z2) {
        this.f821k = z2;
    }

    public void setBaselineAlignedChildIndex(int i2) {
        if (i2 >= 0 && i2 < getChildCount()) {
            this.f825q = i2;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f828t) {
            return;
        }
        this.f828t = drawable;
        if (drawable != null) {
            this.f826r = drawable.getIntrinsicWidth();
            this.f822l = drawable.getIntrinsicHeight();
        } else {
            this.f826r = 0;
            this.f822l = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i2) {
        this.f816c = i2;
    }

    public void setGravity(@InterfaceC7846z int i2) {
        if (this.f829y != i2) {
            if ((8388615 & i2) == 0) {
                i2 |= androidx.core.view.qrj.f50865toq;
            }
            if ((i2 & 112) == 0) {
                i2 |= 48;
            }
            this.f829y = i2;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i2) {
        int i3 = i2 & androidx.core.view.qrj.f4101q;
        int i4 = this.f829y;
        if ((8388615 & i4) != i3) {
            this.f829y = i3 | ((-8388616) & i4);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z2) {
        this.f819h = z2;
    }

    public void setOrientation(int i2) {
        if (this.f818g != i2) {
            this.f818g = i2;
            requestLayout();
        }
    }

    public void setShowDividers(int i2) {
        if (i2 != this.f817f) {
            requestLayout();
        }
        this.f817f = i2;
    }

    public void setVerticalGravity(int i2) {
        int i3 = i2 & 112;
        int i4 = this.f829y;
        if ((i4 & 112) != i3) {
            this.f829y = i3 | (i4 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f2) {
        this.f824p = Math.max(0.0f, f2);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @zy.uv6({uv6.EnumC7844k.LIBRARY})
    protected boolean t8r(int i2) {
        if (i2 == 0) {
            return (this.f817f & 1) != 0;
        }
        if (i2 == getChildCount()) {
            return (this.f817f & 4) != 0;
        }
        if ((this.f817f & 2) == 0) {
            return false;
        }
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            if (getChildAt(i3).getVisibility() != 8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:150:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0333  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void wvg(int r34, int r35) {
        /*
            Method dump skipped, instruction units count: 914
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.wvg(int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: x2, reason: merged with bridge method [inline-methods] */
    public toq generateDefaultLayoutParams() {
        int i2 = this.f818g;
        if (i2 == 0) {
            return new toq(-2, -2);
        }
        if (i2 == 1) {
            return new toq(-1, -2);
        }
        return null;
    }

    /* JADX INFO: renamed from: y */
    void m468y(Canvas canvas, int i2) {
        this.f828t.setBounds(getPaddingLeft() + this.f816c, i2, (getWidth() - getPaddingRight()) - this.f816c, this.f822l + i2);
        this.f828t.draw(canvas);
    }

    /* JADX WARN: Removed duplicated region for block: B:197:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01d8  */
    /* JADX INFO: renamed from: z */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void m469z(int r39, int r40) {
        /*
            Method dump skipped, instruction units count: 1291
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.m469z(int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void zurt(int r25, int r26, int r27, int r28) {
        /*
            Method dump skipped, instruction units count: 330
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.LinearLayoutCompat.zurt(int, int, int, int):void");
    }

    public LinearLayoutCompat(@zy.lvui Context context, @zy.dd AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(@zy.lvui Context context, @zy.dd AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        this.f821k = true;
        this.f825q = -1;
        this.f823n = 0;
        this.f829y = 8388659;
        int[] iArr = C7397k.qrj.y3;
        C0184b c0184bJp0y = C0184b.jp0y(context, attributeSet, iArr, i2, 0);
        C0683f.ij(this, context, iArr, attributeSet, c0184bJp0y.m552t(), i2, 0);
        int iKja0 = c0184bJp0y.kja0(C7397k.qrj.lg4k, -1);
        if (iKja0 >= 0) {
            setOrientation(iKja0);
        }
        int iKja02 = c0184bJp0y.kja0(C7397k.qrj.d6od, -1);
        if (iKja02 >= 0) {
            setGravity(iKja02);
        }
        boolean zM547k = c0184bJp0y.m547k(C7397k.qrj.a3dw, true);
        if (!zM547k) {
            setBaselineAligned(zM547k);
        }
        this.f824p = c0184bJp0y.m549p(C7397k.qrj.f26p, -1.0f);
        this.f825q = c0184bJp0y.kja0(C7397k.qrj.ydj3, -1);
        this.f819h = c0184bJp0y.m547k(C7397k.qrj.jb9, false);
        setDividerDrawable(c0184bJp0y.m553y(C7397k.qrj.qppo));
        this.f817f = c0184bJp0y.kja0(C7397k.qrj.x3b, 0);
        this.f816c = c0184bJp0y.f7l8(C7397k.qrj.xouc, 0);
        c0184bJp0y.d3();
    }
}
