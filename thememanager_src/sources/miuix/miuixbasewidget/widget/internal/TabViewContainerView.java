package miuix.miuixbasewidget.widget.internal;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.List;
import miuix.core.util.ld6;
import miuix.internal.util.n7h;
import vwb.toq;

/* JADX INFO: loaded from: classes3.dex */
public class TabViewContainerView extends FrameLayout {

    /* JADX INFO: renamed from: c */
    private static final int f40620c = 180;

    /* JADX INFO: renamed from: e */
    private static final int f40621e = 150;

    /* JADX INFO: renamed from: f */
    private static final int f40622f = 220;

    /* JADX INFO: renamed from: l */
    private static final int f40623l = 1;

    /* JADX INFO: renamed from: r */
    private static final int f40624r = 0;

    /* JADX INFO: renamed from: g */
    private int f40625g;

    /* JADX INFO: renamed from: h */
    private int f40626h;

    /* JADX INFO: renamed from: i */
    private int f40627i;

    /* JADX INFO: renamed from: k */
    private int f40628k;

    /* JADX INFO: renamed from: n */
    private int f40629n;

    /* JADX INFO: renamed from: p */
    private boolean f40630p;

    /* JADX INFO: renamed from: q */
    private int f40631q;

    /* JADX INFO: renamed from: s */
    private int f40632s;

    /* JADX INFO: renamed from: t */
    private final List<View> f40633t;

    /* JADX INFO: renamed from: y */
    private int f40634y;

    /* JADX INFO: renamed from: z */
    private final List<View> f40635z;

    public TabViewContainerView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: k */
    private boolean m26102k(View view) {
        return view.getVisibility() == 8;
    }

    /* JADX INFO: renamed from: n */
    private void m26103n() {
        Context context = getContext();
        Resources resources = getResources();
        this.f40628k = resources.getDimensionPixelSize(toq.f7l8.f95655ixz);
        this.f40631q = resources.getDimensionPixelSize(toq.f7l8.f46316do);
        this.f40625g = ld6.m25581q(context, 220.0f);
        this.f40634y = ld6.m25581q(context, 180.0f);
        this.f40632s = ld6.m25581q(context, 150.0f);
    }

    /* JADX INFO: renamed from: q */
    private void m26104q(int i2, int i3, int i4) {
        int i5 = i4 > 1 ? (i4 - 1) * this.f40628k : 0;
        super.onMeasure(i2, i3);
        int childCount = getChildCount();
        int i6 = 0;
        for (int i7 = 0; i7 < childCount; i7++) {
            View childAt = getChildAt(i7);
            if (!m26102k(childAt)) {
                int measuredWidth = childAt.getMeasuredWidth();
                i6 += measuredWidth;
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        }
        setMeasuredDimension(getPaddingStart() + getPaddingEnd() + i6 + i5, getMeasuredHeight() + (this.f40631q * 2));
    }

    private void toq(int i2, int i3, int i4) {
        this.f40635z.clear();
        this.f40633t.clear();
        int childCount = getChildCount();
        int i5 = 0;
        for (int i6 = 0; i6 < childCount; i6++) {
            getChildAt(i6).setMinimumWidth(0);
        }
        super.onMeasure(i2, i3);
        int paddingStart = getPaddingStart() + getPaddingEnd();
        int i7 = i4 > 1 ? (i4 - 1) * this.f40628k : 0;
        int size = View.MeasureSpec.getSize(i2);
        int i8 = (size - paddingStart) - i7;
        int i9 = i8 / i4;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            childAt.setMinimumWidth(0);
            if (!m26102k(childAt)) {
                int measuredWidth = childAt.getMeasuredWidth();
                i10 += measuredWidth;
                if (measuredWidth > i9) {
                    this.f40635z.add(childAt);
                    i12 += measuredWidth;
                } else {
                    this.f40633t.add(childAt);
                    i11 += measuredWidth;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        }
        int measuredHeight = getMeasuredHeight() + (this.f40631q * 2);
        if (i10 > i8) {
            setMeasuredDimension(i10 + i7 + paddingStart, measuredHeight);
            return;
        }
        if (this.f40635z.isEmpty()) {
            while (i5 < childCount) {
                View childAt2 = getChildAt(i5);
                if (!m26102k(childAt2)) {
                    childAt2.measure(View.MeasureSpec.makeMeasureSpec(i9, 1073741824), View.MeasureSpec.makeMeasureSpec(childAt2.getMeasuredHeight(), 1073741824));
                }
                i5++;
            }
        } else if (i11 > 0) {
            int size2 = this.f40633t.size();
            int i14 = i8 - i12;
            while (i5 < size2) {
                View view = this.f40633t.get(i5);
                int measuredWidth2 = (int) (((view.getMeasuredWidth() * 1.0f) / i11) * i14);
                if (!m26102k(view)) {
                    view.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824), View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824));
                }
                i5++;
            }
        }
        setMeasuredDimension(size, measuredHeight);
    }

    private boolean zy(int i2, int i3, int i4) {
        int paddingStart = getPaddingStart() + getPaddingEnd();
        int i5 = i4 > 1 ? (i4 - 1) * this.f40628k : 0;
        int size = View.MeasureSpec.getSize(i2);
        int i6 = (size - paddingStart) - i5;
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (i4 <= 2) {
                childAt.setMinimumWidth(this.f40625g);
                i7 = this.f40625g;
            } else if (i4 == 3) {
                childAt.setMinimumWidth(this.f40634y);
                i7 = this.f40634y;
            } else {
                childAt.setMinimumWidth(this.f40632s);
                i7 = this.f40632s;
            }
        }
        super.onMeasure(i2, i3);
        int i9 = 0;
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt2 = getChildAt(i10);
            if (!m26102k(childAt2)) {
                int measuredWidth = childAt2.getMeasuredWidth();
                i9 += measuredWidth;
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
            }
        }
        this.f40626h = i5 + i9;
        setMeasuredDimension(size, getMeasuredHeight() + (this.f40631q * 2));
        return i9 >= i6 - i7;
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i2 = configuration.densityDpi;
        if (i2 != this.f40629n) {
            this.f40629n = i2;
            m26103n();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = i4 - i2;
        int childCount = getChildCount();
        int i7 = this.f40631q;
        int paddingStart = this.f40630p ? getPaddingStart() + ((i6 - this.f40626h) / 2) : getPaddingStart();
        int i8 = paddingStart;
        for (int i9 = 0; i9 < childCount; i9++) {
            View childAt = getChildAt(i9);
            if (!m26102k(childAt)) {
                int measuredWidth = childAt.getMeasuredWidth() + i8;
                n7h.kja0(this, childAt, i8, i7, measuredWidth, i7 + childAt.getMeasuredHeight());
                i8 = measuredWidth + this.f40628k;
            }
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i2, int i3) {
        boolean z2 = false;
        this.f40630p = false;
        this.f40626h = 0;
        int childCount = getChildCount();
        int i4 = 0;
        for (int i5 = 0; i5 < childCount; i5++) {
            if (!m26102k(getChildAt(i5))) {
                i4++;
            }
        }
        if (i4 <= 0) {
            super.onMeasure(i2, i3);
            return;
        }
        int i6 = this.f40627i;
        if (i6 == 2) {
            m26104q(i2, i3, i4);
            return;
        }
        if (i6 != 0) {
            if (i6 != 1) {
                throw new IllegalStateException("Unexpected layout mode: " + this.f40627i);
            }
            if (!zy(i2, i3, i4)) {
                z2 = true;
            }
        }
        if (z2) {
            this.f40630p = true;
        } else {
            toq(i2, i3, i4);
        }
    }

    public void setTabViewLayoutMode(int i2) {
        if (this.f40627i != i2) {
            this.f40627i = i2;
            requestLayout();
        }
    }

    public TabViewContainerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TabViewContainerView(Context context, AttributeSet attributeSet, int i2) {
        this(context, attributeSet, i2, 0);
    }

    public TabViewContainerView(Context context, AttributeSet attributeSet, int i2, int i3) {
        super(context, attributeSet, i2, i3);
        this.f40630p = false;
        this.f40627i = 0;
        this.f40635z = new ArrayList();
        this.f40633t = new ArrayList();
        m26103n();
    }
}
